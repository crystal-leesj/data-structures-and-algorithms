package code401challenges.hashtable;

// RESOURCE:: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/

public class Hashtable<K, V> {

    private HashNode<K, V>[] buckets;

    private static final int INITIAL_CAPACITY = 1 << 4; // 16, Left shift operator (<<) –

    private int size = 0;

    public int size() { return size; }
    public boolean isEmpty() { return size() == 0; }

    public Hashtable() {
        this(INITIAL_CAPACITY);
    }
    public Hashtable(int capacity) {
        this.buckets = new HashNode[capacity];
    }

    int numBuckets = INITIAL_CAPACITY;

    public int getHash(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return index;
    }

    public void add(K key, V value) {
        // create the key value pair
        HashNode<K, V> entry = new HashNode<>(key, value, null);
        int bucket = getHash(key);

        // checking the existing key in the table
        HashNode<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = entry;
            size++;
        } else {
//            System.out.println("when existing!!");
            // compare the keys see if key already exists
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }
            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = entry;
                size++;
            }
        }
    }

    public V get(K key) {
        HashNode<K, V> bucket = buckets[getHash(key)];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        // if no key is found
        return null;
    }

    public boolean contain(K key) {
        HashNode<K, V> bucket = buckets[getHash(key)];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
