public class Numbers {


    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        return max;
    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber < min) {
                min = currentNumber;
            }
        }
        return min;
    }


    /***
     *
     * sum up all numbers
     *
     * @param numbers
     * @return
     */
    public static int sum(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum;
    }

    /***
     * sum up all numbers and divide by the count of elements
     *
     * @param numbers
     * @return
     */
    public static double avg(int[] numbers) {

        return (double) sum(numbers) / numbers.length;
    }

    public static int abs(int i) {
        if (i < 0) {
            i = i * -1;
        }

        return i;
    }

    public static int fak(int n) {


        int ergebnis = 1;

        for (int i = 2; i <= n; i = i + 1) {
            ergebnis = ergebnis * i;
        }


        return ergebnis;
    }

    public static int fak2(int n) {

        if (n == 0) {
            return 1;
        }

        return n * fak2(n - 1);


    }
}


class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
    }



}
