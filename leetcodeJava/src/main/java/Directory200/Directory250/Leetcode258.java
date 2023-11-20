package Directory200.Directory250;

public class Leetcode258 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        while (String.valueOf(num).length() > 1) {
            int temp = 0;
            for (int i = 0; i < String.valueOf(num).length(); i++) {
                temp += Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)));
            }
            num = temp;
        }
        return num;
    }

    public int addDigits2(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
