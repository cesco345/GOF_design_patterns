package java_fundamentals.java_basics.generics_9;

public class List {
  private Object[] items = new Object[10];
  private int count;

  public void add(Object item) {
    items[count++] = item;
  }

  public Object get(int index) {
    return items[index];
  }
}
