package Arrays;

// We are given an Array of n integers,
// We are given q queries having indices l and r .
// We have to find out sum between the given range of indices.
public class RangeSumQueries {
    static int rangeSum(int[] arr, int n, int left, int right, int queries){
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i=1; i<n; i++){
            prefix[i] = arr[i] + prefix[i - 1];
        }

        while(queries-- > 0){
            if(left == 0){
                return prefix[right];
            }
            else{
                return prefix[right] - prefix[left - 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,3,2,5};
        int queries = 1;
        int n = arr.length;
        int left = 2;
        int right = 4;

        System.out.println(rangeSum(arr,n,left,right,queries));
    }
}
