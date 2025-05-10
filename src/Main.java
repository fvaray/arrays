import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arrayInt = new int[3];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        float[] arrayFloat = {1.57f, 7.654f, 9.986f};
        char[] arrayChar = {'A', 'B', 65, 66, '#'};

        System.out.println("Задача 2");
        System.out.printf("%d, %d, %d \n", arrayInt[0], arrayInt[1], arrayInt[2]);
        System.out.printf("%.2f, %.3f, %.3f \n", arrayFloat[0], arrayFloat[1], arrayFloat[2]);
        int i = 0;
        for (; i < arrayChar.length - 1; i++) {
            System.out.printf(arrayChar[i] + ", ");
        }
        System.out.println(arrayChar[i]);

        System.out.println("Задача 3");
        System.out.printf("%d, %d, %d \n", arrayInt[2], arrayInt[1], arrayInt[0]);
        System.out.printf("%.3f, %.3f, %.2f \n", arrayFloat[2], arrayFloat[1], arrayFloat[0]);
        i = arrayChar.length - 1;
        for (; i > 0; i--) {
            System.out.printf(arrayChar[i] + ", ");
        }
        System.out.println(arrayChar[i]);

        System.out.println("Задача 4");
        for (i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0)
                arrayInt[i] += 1;
        }
        System.out.println(Arrays.toString(arrayInt));
    }

}