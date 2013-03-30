package toolbox.web.sitemap;

import java.net.URL;
import java.util.Date;

/**
 * A POJO that represents a Web-page out of a sitemap file.
 *
 * @author billy
 */
public class WebPage implements Comparable<WebPage> {

    private URL location;

    private Date lastModified;

    private String changeFrequency;

    private float priority;


    // -- Getters - Setters


    /**
     * Gets the URL of the Web-page.
     *
     * @return
     *     The Web-page's URL.
     */
    public URL getLocation() {
        return location;
    }


    /**
     * Sets the location URL for the Web-page.
     *
     * @param location
     *     The location URL of the Web-page to set.
     *
     */
    public void setLocation(URL location) {
        this.location = location;
    }


    /**
     * Gets the last modified date of the Web-page.
     *
     * @return
     *     The Web-page's last modified date.
     */
    public Date getLastModified() {
        return lastModified;
    }


    /**
     * Sets the last modified date of the Web-page.
     *
     * @param lastModified
     *     The last modified date of the Web-page to set.
     */
    public void setLastModified(Date lastModified) {

        this.lastModified = lastModified;
    }


    /**
     * Gets the change frequency of the Web-page.
     *
     * @return
     *     The Web-page's change frequency.
     */
    public String getChangeFrequency() {
        return changeFrequency;
    }


    /**
     * Sets the change frequency of the Web-page.
     *
     * @param changeFrequency
     *     The change frequency of the Web-page to set.
     */
    public void setChangeFrequency(String changeFrequency) {
        this.changeFrequency = changeFrequency;
    }


    /**
     * Gets the priority of the Web-page.
     *
     * @return
     *     The Web-page's priority.
     */
    public float getPriority() {
        return priority;
    }


    /**
     * Sets the priority of the Web-page.
     *
     * @param priority
     *     The priority of the Web-page to set.
     */
    public void setPriority(float priority) {
        this.priority = priority;
    }


    // -- Overriding


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((changeFrequency == null) ? 0 : changeFrequency.hashCode());
        result = prime * result
                + ((lastModified == null) ? 0 : lastModified.hashCode());
        result = prime * result
                + ((location == null) ? 0 : location.hashCode());
        result = prime * result + Float.floatToIntBits(priority);
        return result;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WebPage other = (WebPage) obj;
        if (changeFrequency != other.changeFrequency)
            return false;
        if (lastModified == null) {
            if (other.lastModified != null)
                return false;
        } else if (!lastModified.equals(other.lastModified))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (Float.floatToIntBits(priority) != Float
                .floatToIntBits(other.priority))
            return false;
        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(WebPage other) {
        if (other == null) return 1;
        // Sort descending, most recently modified first.
        return other.lastModified.compareTo(lastModified);
    }

}
