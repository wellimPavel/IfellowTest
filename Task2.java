import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String str = "Hello";
        char[] array = str.toCharArray();
        System.out.println("Строка: " + str);
        System.out.print("Повторяющиеся символы в строке: ");
        for(int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
}


