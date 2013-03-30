package toolbox.web.sitemap;

import java.util.List;

/**
 * Interface of a generic sitemap parser.
 *
 * @author billy
 */
public interface SitemapParser {

    /**
     * Parses the sitemap and returns a list of Web-pages.
     *
     * @return
     *     A list of Web-pages parsed from the sitemap.
     */
    public abstract List<WebPage> parse();

}
