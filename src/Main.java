import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] fractionalNums = {1.5, 21.3, 7.5, 54.31, 6.2, 4.5, -6.3, -5.35, 3.7, 7.5, 6.6, 7.4, 4.6, 5.28,};

        double num = 0;
        int sum = 0;
        boolean check = false;


        //Дз на сообразительность
        while (!check) {
            check = true;
            for (int i = 0; i < fractionalNums.length - 1; i++) {
                if (fractionalNums[i] > fractionalNums[i + 1]) {
                    check = false;

                    num = fractionalNums[i];
                    fractionalNums[i] = fractionalNums[i + 1];
                    fractionalNums[i + 1] = num;

                }
            }
        }

        System.out.println(Arrays.toString(fractionalNums));
        for (double numbers : fractionalNums) {

            //основное дз
            if (numbers < 0) {
                check = true;
            } else if (numbers > 0 && check) {
                num = num + numbers;
                sum++;
            }
        }

        System.out.println(num/sum);

    }
}