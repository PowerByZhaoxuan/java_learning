package every_day_topic;

public class topic_2544 {
    public static int alternateDigitSum(int n) {

        int result = 0;

        int sign = 1;
        while (n > 0) {
            int temp = n % 10;
            result += sign * temp;
            sign *= -1;
            n = n / 10;
        }

        return sign == -1 ? result : -1 * result;

    }

    public static void main(String[] args) {
        System.out.println(alternateDigitSum(123));
    }
}
