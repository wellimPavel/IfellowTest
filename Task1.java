import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        double[] array = new double[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));

        double min = array[0];
        double max = array[0];
        double averageValue = 0;

        for (double element : array) {
            if (element < min)
                min = element;

            if (element > max)
                max = element;
        }
        for (int i = 0; i < array.length; i++) {
            averageValue += array[i];
        }
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Среднее значение массива: " + averageValue / array.length);
    }
}





