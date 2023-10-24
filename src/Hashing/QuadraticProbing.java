package Hashing;
import java.util.Arrays;

// Quadratic probing is a collision handling technique in hashing.
// Quadratic probing says that whenever a collision occurs,
// search for i^2 position.
//
// Given an array of integers and a Hash table.
// Fill the array elements into the hash table
// by using Quadratic Probing in case of collisions.

public class QuadraticProbing {
    static int[] quadraticProbing(int[] hash, int hash_size, int[] arr, int N) {
        Arrays.fill(hash, -1);
        int size = 0;

        for(int i=0; i<N; i++){
            if(size == hash_size){
                break;
            }

            int key = arr[i];
            int index = arr[i] % hash_size;
            int count = 1;

            while(hash[index] != -1 && hash[index] != key){
                index = (key + count * count) % hash_size;
                count++;
            }
            if(hash[index] == -1){
                hash[index] = key;
                size++;
            }
        }
        return hash;
    }

    public static void main(String[] args) {
        int[] arr = {21,10,32,43};
        int n = arr.length;
        int hashSize = 11;
        int[] hash = new int[hashSize];

        System.out.println(Arrays.toString(quadraticProbing(hash, hashSize, arr, n)));
    }
}
