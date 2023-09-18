/**
 * An abstract class representing the MultiSet ADT, which supports the
 * add, remove, is_empty, count, and contains operations.
 * This class itself does not handle how the underlying data is stored,
 * so it just inherits Object.__init__.
 */
public abstract class MultiSet {
    public abstract void add();
    public abstract void remove();
    public abstract void contains();
    public abstract void is_empty();
    public abstract void count();
    public abstract void size();
}
