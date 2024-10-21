public class OneWayList<T extends Comparable<T>> {
    protected OneWayElement<T> listHead;

    public OneWayList() {
        listHead = new OneWayElement<>(null, null);
    }

    public void addSorted(T data) {
    }

    public OneWayList<T> sortList() {
        return null;
    }

    public void addFirst(T data) {
        OneWayElement<T> newOneWayElement = new OneWayElement<>(data, listHead.getNext());
        listHead.setNext(newOneWayElement);
    }

    public void removeFirst() {
        listHead.setNext(listHead.getNext().getNext());
    }

    public T getFirst() {
        if(listHead.getNext() == null){
            return null;
        }
        return listHead.getNext().getData();
    }

    public OneWayList<T> getTail() {
        OneWayList<T> result = new OneWayList<>();
        if (!this.isEmpty())
            result.listHead = listHead.getNext();
        return (result);
    }

    public int getLength() {
        OneWayElement<T> current = listHead;
        int length = 0;
        while ((current = current.getNext()) != null) {
            length++;
        }
        return length;
    }

    public boolean isEmpty() {
        return listHead.getNext() == null;
    }
}
