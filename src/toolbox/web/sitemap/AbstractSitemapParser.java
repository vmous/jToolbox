package toolbox.web.sitemap;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

/**
 * An abstract implementation of the {@link SitemapParser}.
 *
 * @author billy
 */
public abstract class AbstractSitemapParser implements SitemapParser {

    // Sitemap XML tags.
    public static final String URL_SET = "urlset";
    public static final String URL = "url";
    public static final String LOC = "loc";
    public static final String LASTMOD =  "lastmod";
    public static final String CHANGEFREQ = "changefreq";
    public static final String PRIORITY = "priority";


    protected final URL urlSitemap;


    /**
     * Constructor.
     *
     * @param urlSitemap
     *     The URL of the sitemap.
     */
    protected AbstractSitemapParser(URL urlSitemap) {
        this.urlSitemap = urlSitemap;
    }


    /**
     * Gets the input stream from a connection opened on the sitemap URL.
     *
     * It also auto-detects the type of the connection content using the
     * Content-Encoding HTTP header. If the sitemap is GZipped then it wraps
     * the stream into a {@code GZIPInputStream} before it returns it.
     *
     * @return
     *     The input stream from the sitemap URL.
     *
     * @throws IOException
     */
    protected InputStream getInputStream() throws IOException {
        URLConnection conn = urlSitemap.openConnection();
        InputStream is = conn.getInputStream();

        if ("application/x-gzip".equals(conn.getContentType()))
            is = new GZIPInputStream(is);

        return is;
    }

}
