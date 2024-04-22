package java_fundamentals.java_basics.generics_9;

public class KeyValuePair<K, V> {
  private K key;
  private V value;

  public KeyValuePair(K key, V value) {
    this.key = key;
    this.value = value;
  }
}
