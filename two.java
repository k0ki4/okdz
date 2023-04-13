import java.util.Random;

public class two {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            Random randomnum = new Random();
            int nums = randomnum.nextInt(100) + 1;
            if (nums % 2 == 0) {
                System.out.println(nums);
            }
        }
    }
}
