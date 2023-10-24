package Sorting;
import java.util.Arrays;

// You are given arrival and departure times of the guests,
// you need to find the minimum time interval to attend
// the party so that there are maximum people at the party.

public class MeetingMaximumGuests {
    static int guests(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 1, j = 0, res = 1, curr = 1;
        int n = arrival.length;

        while(i < n && j < n){
            if(arrival[i] <= departure[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 600, 700};
        int[] departure = {1000, 800, 730};

        System.out.println(guests(arrival, departure));
    }
}
