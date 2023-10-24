package Hashing;
import java.util.Arrays;

// Linear probing is a collision handling technique in hashing.
// Linear probing says that whenever a collision occurs,
// search for the immediate next position.
//
// Given an array of integers and a hash table size.
// Fill the array elements into a hash table using
// Linear Probing to handle collisions.

// Duplicate elements must be mapped to the same position in the hash table
// while colliding elements must be mapped to the [(value+1)%hashSize] position.

public class LinearProbing {
    static int[] linearProbing(int hash_size, int[] arr, int sizeOfArray){
        int[] hash = new int[hash_size];
        Arrays.fill(hash, -1);

        for(int i=0; i<sizeOfArray; i++){
            int key = arr[i];
            int index = key % hash_size;
            int j = index;

            while(hash[index] != -1 && hash[index] != key){
                index = (index + 1) % hash_size;
                if(j == index){
                    break;
                }
            }
            if(hash[index] == -1){
                hash[index] = key;
            }
        }
        return hash;
    }

    public static void main(String[] args) {
        int[] arr = {4,14,24,44};
        int n = arr.length;
        int hash_size = 10;

        System.out.println(Arrays.toString(linearProbing(hash_size, arr, n)));
    }
}
