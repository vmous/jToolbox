package toolbox.web.sitemap;

import static toolbox.web.sitemap.AbstractSitemapParser.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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

    private StringBuilder builder;


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
        builder.append(ch, start, length);
    }


    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#startDocument()
     */
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();

        webPages = new ArrayList<WebPage>();
        builder = new StringBuilder();
    }


    /* (non-Javadoc)
     * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
     */
    @Override
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        if (localName.equalsIgnoreCase(URL)) {
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
            if (localName.equalsIgnoreCase(LOC)) {
                try {
                    currentWebPage.setLocation(new URL(builder.toString()));
                }
                catch (MalformedURLException murle) {
                    murle.printStackTrace();
                }
            }
            else if (localName.equalsIgnoreCase(LASTMOD)) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

                try {
                    currentWebPage.setLastModified(sdf.parse(builder.toString()));
                }
                catch (ParseException pe) {
                    pe.printStackTrace();
                }
            }
            else if (localName.equalsIgnoreCase(CHANGEFREQ)) {
                currentWebPage.setChangeFrequency(builder.toString());
            }
            else if (localName.equalsIgnoreCase(PRIORITY)) {
                currentWebPage.setChangeFrequency(builder.toString());
            }
            else if (localName.equalsIgnoreCase(URL)) {
                webPages.add(currentWebPage);
            }

            builder.setLength(0);
        }
    }

}
