package Hashing;
import java.util.ArrayList;

// Separate chaining technique in hashing allows to us to use a linked list
// at each hash slot to handle the problem of collisions.
// That is, every slot of the hash table is a linked list,
// so whenever a collision occurs, the element can be appended
// as a node to the linked list at the slot.
//
// In this question, we'll learn how to fill up the hash table using Separate chaining technique.
// Given an array (consisting of distinct integers)  and a hashtable size,
// you have to fill the array elements into a hash table of given size.

public class SeparateChaining {
    static ArrayList<ArrayList<Integer>> separateChaining(int[] arr, int n, int hashSize){
        ArrayList<ArrayList<Integer>> list;
        list = new ArrayList<>(hashSize);
        for(int i=0; i<hashSize; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<n; i++){
            list.get(arr[i] % hashSize).add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {92,4,14,24,44,91};
        int n = arr.length;
        int hashSize = 10;

        ArrayList<ArrayList<Integer>> res = separateChaining(arr, n, hashSize);

        for(int i=0; i<res.size(); i++){
            if(res.get(i).size() > 0){
                System.out.print(i + "->");
                for(int j=0; j<res.get(i).size()-1; j++){
                    System.out.print(res.get(i).get(j) + "->");
                }
                System.out.print(res.get(i).get(res.get(i).size() - 1));
                System.out.println();
            }
        }
    }
}
