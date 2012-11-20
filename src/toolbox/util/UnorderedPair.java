package toolbox.util;

/**
 * An implementation of a pair construct which models a container for two
 * objects wherein the object order is of no consequence for equality and
 * hashing. Even though it does not convey any semantic information about the
 * relationship between the two values, it may prove useful in a handful of
 * cases. Instances of this class is made immutable. Beware though that the
 * consistency of equality checks and hash codes is only as strong as that of
 * the value types.
 *
 * @author billy
 * @version 1.0
 * @see Pair
 *
 */
public class UnorderedPair<X, Y> {

    /** One of the two values, of type <code>X</code>. */
    private final X x;

    /** One of the two values, of type <code>Y</code>. */
    private final Y y;

    /**
     * Constructs a new <code>UnorderedPair&lt;X, Y&gt;</code> object with the
     * provided values.
     *
     * @param x
     *            one of the values.
     * @param y
     *            one of the values.
     */
    public UnorderedPair(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get the value provided as the first argument in the constructor.
     *
     * @return a value of this <code>UnorderedPair</code>.
     */
    public X getX() {
        return x;
    }

    /**
     * Get the value provided as the second argument in the constructor.
     *
     * @return a value of this <code>UnorderedPair</code>.
     */
    public Y getY() {
        return y;
    }

    /**
     * Returns <code>true</code> if the specified object is equal to this pair
     * of values.
     *
     * @param obj
     *            the object to be compared for equality with this object.
     *
     * @return <code>true</code> if the specified object is equal to this pair
     *         of values, <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        boolean equal;

        if (obj == null)
            equal = false;
        else if (this == obj)
            equal = true;
        else if (!(obj instanceof Pair<?, ?>))
            equal = false;
        else {
            UnorderedPair<?, ?> other = (UnorderedPair<?, ?>) obj;
            // if both parts of this are null
            if ((x == null) && (y == null))
                equal = ((other.getX() == null) && (other.getY() == null));
            // if both parts of other are null
            else if ((other.getX() == null) && (other.getY() == null))
                equal = false;
            // if x of this is null
            else if (x == null)
                // if this and other both have a non-null y part
                if (other.getX() == null)
                    equal = y.equals(other.getY());
                // if this has a non-null y part, while other has a non-null x
                // part
                else
                    equal = y.equals(other.getX());
            // if y of this is null
            else if (y == null) {
                // if this and other both have a non-null x part
                if (other.getY() == null)
                    equal = x.equals(other.getX());
                // if this has a non-null x part, while other has a non-null y
                // part
                else
                    equal = x.equals(other.getY());
            } else if (x.equals(other.getX()))
                equal = y.equals(other.getY());
            else if (x.equals(other.getY()))
                equal = y.equals(other.getX());
            else
                equal = false;
        }

        return equal;
    }

    /**
     * Returns a hash code for this unordered pair. Assuming that the two value
     * types already have good (randomly distributed) hash code functions, we
     * treat the two hash codes as <em>randomly distributed
     * integers</em> and <code>XOR</code> them.
     *
     * @return a hash code for this unordered pair.
     */
    @Override
    public int hashCode() {
        int hashX = x != null ? x.hashCode() : 0;
        int hashY = y != null ? y.hashCode() : 0;
        return hashX ^ hashY;
    }

    /**
     * Returns the values of this unordered pair. This method can be overridden
     * when a more "programmer-friendly" string form exists.
     *
     * @return the values of this pair.
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
