package java_fundamentals.java_basics.generics_9;

public class GenericList<T> implements Iterable{
  private T[] items = (T[]) new Object[10];
  private int count;

  public void add(T item) {
    items[count++] = item;
  }

  public T get(int index) {
    return items[index];
  }
}

  