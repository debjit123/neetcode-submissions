class MyHashSet {
    // A custom Node structure for separate chaining
    private class Node {
        int key;
        Node next;
        
        Node(int key) {
            this.key = key;
        }
    }

    private static final int BASE = 769; // A prime number to reduce collisions
    private Node[] buckets;

    public MyHashSet() {
        buckets = new Node[BASE];
    }
    
    public void add(int key) {
        int index = hash(key);
        Node current = buckets[index];
        
        // If the bucket is empty, create the first node
        if (current == null) {
            buckets[index] = new Node(key);
            return;
        }
        
        // Traverse to check if the key already exists
        while (current != null) {
            if (current.key == key) {
                return; // Key already exists, don't add duplicate
            }
            if (current.next == null) {
                break; // Stop at the last node to append
            }
            current = current.next;
        }
        
        // Append new node to the end of the chain
        current.next = new Node(key);
    }
    
    public void remove(int key) {
        int index = hash(key);
        Node current = buckets[index];
        Node prev = null;
        
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    // Node to remove is the head of the bucket
                    buckets[index] = current.next;
                } else {
                    // Node to remove is in the middle or end
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        Node current = buckets[index];
        
        while (current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private int hash(int key) {
        return key % BASE;
    }
}