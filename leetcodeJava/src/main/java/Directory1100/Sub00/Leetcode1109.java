package Directory1100.Sub00;

public class Leetcode1109 {
    public static void main(String[] args) {

    }

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] counters = new int[n];
        for (int[] book :bookings) {
            for (int i = book[0]; i <=book[1] ; i++) {
                counters[i-1] += book[2];
            }
        }
        return counters;
    }
}
