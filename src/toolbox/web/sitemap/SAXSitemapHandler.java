package toolbox.web.sitemap;

import static toolbox.web.sitemap.AbstractSitemapParser.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The handler for the SAX parser.
 *
 * As with any SAX implementation, most of the details are in the SAX handler.
 * The handler receives events from the SAX parser as it rips through the XML
 * document.
 *
 * @author billy
 */
public class SAXSitemapHandler extends DefaultHandler {

    private List<WebPage> webPages;

    private WebPage currentWebPage;

    private String characters;


    /**
     * Gets the parsed sitemap Web-pages
     *
     * @return
     *     The list of Web-pages in the sitemap.
     */
    public List<WebPage> getWebPages() {
        return webPages;
    }


    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
     */
    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        super.characters(ch, start, length);
        this.characters = new String(ch, start, length);
    }


    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#startDocument()
     */
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();

        webPages = new ArrayList<WebPage>();
    }


    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    @Override
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        if (qName.equalsIgnoreCase(URL)) {
            this.currentWebPage = new WebPage();
        }
    }


    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
     */
    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        super.endElement(uri, localName, qName);
        if (this.currentWebPage != null) {
            if (qName.equalsIgnoreCase(LOC)) {
                try {
                    currentWebPage.setLocation(new URL(characters));
                }
                catch (MalformedURLException murle) {
                    murle.printStackTrace();
                }
            }
            else if (qName.equalsIgnoreCase(LASTMOD)) {
                // The bellow formatter corresponds to "yyyy-MM-dd'T'HH:mm:ssZZ"
                DateTimeFormatter dtf = ISODateTimeFormat.dateTimeNoMillis();
                DateTime dt = dtf.parseDateTime(characters);
                currentWebPage.setLastModified(dt.toDate());
            }
            else if (qName.equalsIgnoreCase(CHANGEFREQ)) {
                currentWebPage.setChangeFrequency(characters);
            }
            else if (qName.equalsIgnoreCase(PRIORITY)) {
                currentWebPage.setChangeFrequency(characters);
            }
            else if (qName.equalsIgnoreCase(URL)) {
                webPages.add(currentWebPage);
            }
        }
    }

}
