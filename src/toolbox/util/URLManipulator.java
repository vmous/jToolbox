package toolbox.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import net.htmlparser.jericho.Source;

public class URLManipulator {
    public static final String DISALLOW = "Disallow:";

    /**
     * Opens a buffered stream on the URL and copies contents to a writer.
     *
     * @param url
     *     The URL to download.
     * @param writer
     *     The writer where the URL content will be copied to.
     *
     * @throws
     *     An {@code java.io.IOException} if an input or output exception
     *     occurred.
     */
    public static void downloadURL(URL url, Writer writer)
            throws IOException {
        BufferedInputStream bis = new BufferedInputStream(url.openStream());

        int c;
        while((c = bis.read()) != -1) {
            writer.write(c);
        }

        bis.close();
    }

    /**
     * Opens an input stream on the URL, reads it through a custom buffer and
     * writes into an output stream.
     *
     * @param url
     *     The URL to download.
     * @param  os
     *     The output stream where the URL content will be written to.
     *
     * @throws
     *     An {@code java.io.IOException} if an input or output exception
     *     occurred.
     */
    public static void downloadURL(URL url, OutputStream os)
            throws IOException {
        InputStream is = url.openStream();
        byte[] buf = new byte[1048576];

        int c;
        while((c = is.read(buf)) != -1) {
            os.write(buf, 0, c);
        }

        is.close();
    }

    /**
     * Opens a buffered input stream on the URL and copies contents to an
     * output stream.
     *
     * @param httpUrlConn
     *     An established HTTP URL connection from where to download the
     *     content.
     * @param  os
     *     The output stream where the URL content will be copied to.
     *
     * @throws
     *     An {@code java.io.IOException} if an input or output exception
     *     occurred.
     */
    public static void downloadURL(HttpURLConnection httpUrlConn, OutputStream os)
            throws IOException {
        BufferedInputStream bis =
                new BufferedInputStream( httpUrlConn.getInputStream() );

        int c;
        while( (c = bis.read() )!= -1 ){
            os.write(c);
        }

        bis.close();
    }

    /**
     * Writes the contents of a URL to a string and returns it.
     *
     * @param  url
     *     The URL whose content will be downloaded.
     *
     * @return
     *     A {@code java.lang.String} object containing the URL content.
     *
     * @throws
     *     An {@code java.io.IOException} if an input or output exception
     *     occurred.
     */
    public static String streamURLToString(URL url)
            throws IOException {
        StringWriter sw = new StringWriter();
        // uses a StringWriter as argument
        downloadURL(url, sw);
        return sw.toString();
    }

    /**
     * Writes the contents of the URL to a new file using a file output stream.
     *
     * @param url
     *     The URL whose content will be downloaded.
     * @param filename
     *     The path to the file where the URL content will be be stored in.
     *
     * @throws
     *     An {@code java.io.IOException} if an input or output exception
     *     occurred.
     */
    public static void streamURLtoFile(URL url, String filename)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        // using a file output stream
        downloadURL(url, fos);
        fos.close();
    }

    /**
     * Writes the contents of the URL to a new file using a file output stream.
     *
     * @param httpUrlConn
     *     An established HTTP URL connection from where to download the
     *     content.
     * @param filename
     *     The path to the file where the URL content will be be stored in.
     *
     * @throws
     *     An {@code java.io.IOException} if an input or output exception
     *     occurred.
     */
    public static void streamURLtoFile(HttpURLConnection httpUrlConn,
            String filename)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        // using a file output stream
        downloadURL(httpUrlConn, fos);
        fos.close();
    }

    /**
     * Extracts links directly from a URL.
     *
     * @param url
     *     The URL whose links are to be extracted.
     * @param full
     *     Set it to {@code true} if you want to extract the {@code src}
     *     attributes as well; {@code false} otherwise.
     *
     * @return
     *     A {@code java.util.Set<Sting>} containing the links extracted from
     *     the URL.
     *
     * @throws
     *     An {@code java.io.IOException} if an input or output exception
     *     occurred.
     */
    public static Set<String> extractLinks(URL url, boolean full)
            throws IOException {
        return extractLinks(streamURLToString(url), full);
    }

    /**
     * Extracts links as well as its corresponding text directly from a URL.
     *
     * @param url
     *     The URL whose links and corresponding text are to be extracted.
     *
     * @return
     *     A {@code java.util.Map<String, String>} containing the links and
     *     their corresponding text extracted from the URL.
     *
     * @throws
     *     An {@code java.io.IOException} if an input or output exception
     *     occurred.
     */
    public static Map<String, String> extractLinksWithText(URL url)
            throws IOException {
        return extractLinksWithText(streamURLToString(url));
    }

    /**
     * <p>
     * Extracts links from an HTML page given as a raw and a lower case string.
     * </p>
     *
     * <p>
     * In order to avoid the possible double conversion from mixed to lower
     * case a second method is provided, where the conversion is done
     * externally.
     * </p>
     *
     * @param rawPage
     *     The HTML page content given as a raw string.
     * @param page
     *     The content of the URL given as a raw lower-cased string.
     * @param full
     *     Set it to {@code true} if you want to extract the {@code src}
     *     attributes as well; {@code false} otherwise.
     *
     * @return
     *     A {@code java.util.Set<String>} object containing the links
     *     extracted from the URL.
     *
     * TODO: I have to change the search of the attributes to a pattern
     * matching manner (i.e., href|src) so that we end up with one while loop.
     */
    public static Set<String> extractLinks(String rawPage, String page, boolean full) {
        int index = 0;
        Set<String> links = new LinkedHashSet<String>();
        while ((index = page.indexOf("href", index)) != -1) {
            //if ((index = page.indexOf("href", index)) == -1)
            //break;
            if ((index = page.indexOf("=", index)) == -1)
                break;
            String remaining = rawPage.substring(++index);
            StringTokenizer st = new StringTokenizer(remaining, "\t\n\r\"'>#");
            String strLink = st.nextToken();

            links.add(strLink);
        }

        if(full) {
            index = 0;
            while (((index = page.indexOf("src", index)) != -1)) {
                if ((index = page.indexOf("=", index)) == -1)
                    break;

                String remaining = rawPage.substring(++index);
                StringTokenizer st = new StringTokenizer(remaining, "\t\n\r\"'>#");
                String strLink = st.nextToken();

                links.add(strLink);
            }
        }
        return links;
    }

    /**
     * <p>
     * Extracts links (key) with corresponding link text (value).
     * </p>
     *
     * <p>
     * Note that due to the nature of a {@code java.util.Map<String, String>}
     * only one link text is returned per URL, even if a link occurs multiple
     * times with different texts.
     * </p>
     *
     * @param rawPage
     *     The HTML page content given as a raw string.
     * @param page
     *     The content of the URL given as a raw lower-cased string
     *
     * @return
     *     A {@code java.util.Map<String, String>} containing the links and
     *     their corresponding text extracted from the URL.
     */
    public static Map<String, String> extractLinksWithText(String rawPage, String page) {
        int index = 0;
        Map<String, String> links = new HashMap<String, String>();
        while ((index = page.indexOf("<a ", index)) != -1) {
            int tagEnd = page.indexOf(">", index);
            if ((index = page.indexOf("href", index)) == -1)
                break;
            if ((index = page.indexOf("=", index)) == -1)
                break;
            int endTag = page.indexOf("</a", index);
            String remaining = rawPage.substring(++index);
            StringTokenizer st = new StringTokenizer(remaining, "\t\n\r\"'>#");
            String strLink = st.nextToken();
            String strText = "";
            if (tagEnd != -1 && tagEnd + 1 <= endTag) {
                strText = rawPage.substring(tagEnd + 1, endTag);
            }
            strText = strText.replaceAll("\\s+", " ");
            links.put(strLink, strText);
        }
        return links;
    }

    /**
     * <p>
     * Extracts links from an HTML page.
     * </p>
     *
     * <p>
     * This method does neither check the validity of its results nor does it
     * care about HTML comments, so links that are commented out are also
     * retrieved!
     * </p>
     *
     * @param  rawPage
     *     The HTML page content given as a raw string.
     *
     * @return
     *     A {@code java.util.Set<String>} of with the extracted links.
     */
    public static Set<String> extractLinks(String rawPage, boolean full) {
        return extractLinks(rawPage, rawPage.toLowerCase().replaceAll("\\s", " "), full);
    }

    /**
     * <p>
     * Extracts links from an HTML page.
     * </p>
     *
     * <p>
     * This method does neither check the validity of its results nor does it
     * care about HTML comments, so links that are commented out are also
     * retrieved.
     * </p>
     *
     * @param rawPage
     *     The HTML page content given as a raw string.
     *
     * @return
     *     A {@code java.util.Map<String, String>} containing the links and
     *     their corresponding text extracted from the URL.
     */
    public static Map<String, String> extractLinksWithText(String rawPage) {
        return extractLinksWithText(rawPage, rawPage.toLowerCase().replaceAll("\\s", " "));
    }

    /**
     * <p>
     * Extracts title from an HTML page's {@code <title>} tag.
     * </p>
     *
     * <p>
     * In order to avoid the possible double conversion from mixed to lower
     * case a second method is provided, where the conversion is done
     * externally.
     * </p>
     *
     * @param rawPage
     *     The HTML page content given as a raw string.
     * @param page
     *     The content of the URL given as a raw lower-cased string.
     *
     * @return
     *     The title of the page or the empty string if no {@code <title>} tag
     *     was found.
     */
    public static String extractTitle(String rawPage, String page) {
        int index = 0;
        String title = "";
        if((index = page.indexOf("<title>", index)) != -1) {
            String remaining = rawPage.substring(++index);
            StringTokenizer st = new StringTokenizer(remaining, "</title>");
            title = st.nextToken();
        }
        return title;
    }

    /**
     * <p>
     * Extracts the content delimited by given strings (exclusive) out of an
     * HTML page. The result is stripped off its markup and then returned.
     * </p>
     *
     * <p>
     * TODO: This method needs to be reworked since there are corner cases it
     * doesn't handle correctly. Maybe using jericho.
     * </p>
     *
     * @param htmlText
     *     The HTML page as a string.
     * @param startMark
     *     The string denoting the start of the content to be extracted.
     * @param endMark
     *     The string denoting the end of the content to be extracted.
     *
     * @return
     *     A string of the content that was extracted. If no such content could
     *     be extracted the empty string is returned.
     */
    public static String extractContentStrippingMarkup(String htmlText, String startMark, String endMark) {
        String content = "";

        int startMarkIndex = htmlText.indexOf(startMark);
        int endMarkIndex = htmlText.indexOf(endMark);

        if (startMarkIndex != -1 && endMarkIndex != -1) {
            startMarkIndex += startMark.length();
            content = htmlText.substring(startMarkIndex, endMarkIndex);
            Source src = new Source(content);
            content = src.getTextExtractor().toString();
        }

        return content;
    }

    /**
     * Construct a save path using the given file-system path and URL.
     *
     * @param fsPath
     *     The path in the file-system.
     * @param urlPath
     *     The URL.
     *
     * @return
     *     A concatenation of the file-system path and the URL checked for
     *     system dependent validity.
     */
    public static String constructSavePath(String fsPath, String urlPath) {
        if(!fsPath.endsWith(File.separator))
            fsPath = fsPath.concat(File.separator);

        urlPath.replace("/", File.separator);
        if(urlPath.startsWith(File.separator))
            urlPath = urlPath.substring(1);
        if(!urlPath.endsWith(File.separator))
            urlPath = urlPath.concat(File.separator);

        return (fsPath + urlPath);
    }

    /**
     * Check if the given URL is robot safe.
     *
     * @param url
     *     The URL to check.
     *
     * @return
     *     {@code true} if the URL is robot safe; {@code false} otherwise.
     */
    public static boolean isRobotSafe(URL url) {
        String strHostName = url.getHost();

        // form URL of the robots.txt file
        String strRobotName = "http://" + strHostName + "/robots.txt";
        URL urlRobot;
        try {
            urlRobot = new URL(strRobotName);
        }
        catch (MalformedURLException e) {
            // something weird is happening, so don't trust it
            return false;
        }

        String strCommands;
        try {
            InputStream urlRobotStream = urlRobot.openStream();

            // read in entire file
            byte b[] = new byte[1000];
            int numRead = urlRobotStream.read(b);
            strCommands = new String(b, 0, numRead);
            while (numRead != -1) {
                //if (Thread.currentThread() != searchThread)
                //break;
                numRead = urlRobotStream.read(b);
                if (numRead != -1) {
                    String newCommands = new String(b, 0, numRead);
                    strCommands += newCommands;
                }
            }
            urlRobotStream.close();
        }
        catch (IOException e) {
            // if there is no robots.txt file, it is OK to search
            return true;
        }

        // assume that this robots.txt refers to us and
        // search for "Disallow:" commands.
        String strURL = url.getFile();
        int index = 0;
        while ((index = strCommands.indexOf(DISALLOW, index)) != -1) {
            index += DISALLOW.length();
            String strPath = strCommands.substring(index);
            StringTokenizer st = new StringTokenizer(strPath);

        if (!st.hasMoreTokens())
          break;

        String strBadPath = st.nextToken();

        // if the URL starts with a disallowed path, it is not safe
        if (strURL.indexOf(strBadPath) == 0)
          return false;
      }

      return true;
    }

    /**
     * As a stand-alone program this class is capable of copying a URL to a file.
     *
     * @param args
     *     The command-line arguments.
     */
    public static void main(String[] args) {
        try {
            if(args.length < 2) {
                // Display usage information
                System.err.println("Usage: java URLDowloader -[h|d] <url> [<file>]");
                System.err.println("Saves the URL to a file.");
                System.err.println("If no file is given, extracts hyperlinks on url to console.");
            }
            else {
                String option = args[0];
                if(option.equals("-h")) {
                    URL url = new URL(args[1]);
                    System.out.println("Content-Type: " + url.openConnection().getContentType());
                    //Vector links = extractLinks(url);
                    //for (int n = 0; n < links.size(); n++) {
                    //  System.out.println((String) links.elementAt(n));
                    //}
                    Set<Map.Entry<String, String>> links = extractLinksWithText(url).entrySet();
                    Iterator<Map.Entry<String, String>> it = links.iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, String> en = it.next();
                        String strLink = en.getKey();
                        String strText = en.getValue();
                        System.out.println(strLink + " \"" + strText + "\" ");
                    }
                }
                else if(option.equals("-d")) {
                    URL url = new URL(args[1]);
                    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                    conn.addRequestProperty("Accept", "text/xml, application/xml, application/xhtml+xml, text/html;q=0.9, text/plain;q=0.8, image/png, */*;q=0.5");
                    conn.addRequestProperty("User-Agent", "ResidentEvilCrawler/0.01b /webspider/java1.5/0.01b/518proj2");
                    conn.addRequestProperty("Connection", "Keep-Alive");
                    conn.setUseCaches(false);
                    conn.setConnectTimeout(2000);
                    conn.setReadTimeout(2000);
                    conn.connect();
                    String mimetype = conn.getContentType();

                    String filename = null;
                    if(args.length == 2) {
                        filename = args[1].substring( (args[1].lastIndexOf('/')) + 1 );
                    }
                    else if(args.length == 3) {
                        filename = args[2];
                    }
                    System.out.println("Downloading file " + filename + "...");
                    System.out.println("Content-Type: " + mimetype);
                    streamURLtoFile(conn, filename);
                    System.out.println("Download finished!");
                }
            }
        }
        catch (Exception e) {
            System.err.println("An error occured: ");
            e.printStackTrace();
            //System.err.println(e.toString());
        }
    }

}
