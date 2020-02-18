package code401challenges.hashtable;

public class HashNode<K, V> {

    K key;
    V value;

    HashNode<K, V> next;

    public HashNode(K key, V value, HashNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
