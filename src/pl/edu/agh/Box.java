package pl.edu.agh;

/**
 * Created by student17 on 2014-10-16.
 */
/*public class Box {
    private Object object;

    public void add(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}*/

public class Box<T> {

    private T t;
    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}