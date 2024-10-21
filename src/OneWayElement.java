public class OneWayElement<T> {
    protected T data;
    protected OneWayElement<T> next;

    public OneWayElement(T data, OneWayElement<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public OneWayElement<T> getNext() {
        return next;
    }

    public void setNext(OneWayElement<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}

