package LCR;

public class LCR128 {
    public static void main(String[] args) {

    }

    public int stockManagement(int[] stock) {
        int left = 0;
        int right = stock.length-1;

        while (left<right){
            int mid = (left+right) /2;
            if(stock[mid]>stock[right]){
                left = mid+1;
            }else if(stock[mid]<stock[right]) {
                right = mid;
            } else{
                right--;
            }
        }
        return stock[left];
    }
}
