package toolbox.web.sitemap;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * A concrete, SAX specific, implementation of the
 * {@link AbstractSitemapParser}.
 *
 * @author billy
 */
public class SAXSitemapParser extends AbstractSitemapParser {

    /**
     * Constructor.
     *
     * @param urlSitemap
     *     The URL of the sitemap.
     */
    protected SAXSitemapParser(URL urlSitemap) {
        super(urlSitemap);
    }


    /* (non-Javadoc)
     * @see toolbox.web.sitemap.SitemapParser#parse()
     */
    @Override
    public List<WebPage> parse() {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXSitemapHandler handler = null;
        try {
            SAXParser parser = factory.newSAXParser();
            handler = new SAXSitemapHandler();
            parser.parse(this.getInputStream(), handler);
        }
        catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
        catch (SAXException saxe) {
            saxe.printStackTrace();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return handler.getWebPages();
    }

}
