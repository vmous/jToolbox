package toolbox.util;

/**
 * An implementation of a pair construct which models a container for two
 * objects wherein the object order is important for equality and hashing. Even
 * though it does not convey any semantic information about the relationship
 * between the two values, it may prove useful in a handful of cases. Instances
 * of this class is made immutable. Beware though that the consistency of
 * equality checks and hash codes is only as strong as that of the value types.
 * 
 * @author billy
 * @version 1.0
 * @see UnorderedPair
 * 
 */
public class Pair<L, R> {

    /** The <em>left</em> value, of type <code>L</code>. */
    private final L left;

    /** The <em>right</em> value, of type <code>R</code>. */
    private final R right;

    /**
     * Constructs a new <code>Pair&lt;L, R&gt;</code> object with the provided
     * values.
     * 
     * @param left
     *            the <em>left</em> value.
     * @param right
     *            the <em>right</em> value.
     */
    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Get the <em>left</em> value.
     * 
     * @return the <em>left</em> value.
     */
    public L getLeft() {
        return left;
    }

    /**
     * Get the <em>right</em> value.
     * 
     * @return the <em>right</em> value.
     */
    public R getRight() {
        return right;
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
        else
            equal = left.equals(((Pair<?, ?>) obj).getLeft())
                    && right.equals(((Pair<?, ?>) obj).getRight());

        return equal;
    }

    /**
     * Returns a hash code for this pair. Assuming that the two value types
     * already have good (randomly distributed) hash code functions, we treat
     * the two hash codes as <em>randomly distributed integers</em> and
     * <code>XOR</code> them.
     * 
     * @return a hash code for this pair.
     */
    @Override
    public int hashCode() {
        int hashLeft = left != null ? left.hashCode() : 0;
        int hashRight = right != null ? right.hashCode() : 0;
        return hashLeft ^ hashRight;
    }

    /**
     * Returns the values of this pair. This method can be overridden when a
     * more "programmer-friendly" string form exists.
     * 
     * @return the values of this pair.
     */
    @Override
    public String toString() {
        return "(" + left + ", " + right + ")";
    }
}
