//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// The class created to check simple executions
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //890
        System.out.println("Hello Naveen, Welcome!");

        int[][] arr1 = new int[3][];
        int[][] arr = {
                {1, 2, 3},
                {5, 6},
                {7, 8, 9, 10}
        };

        System.out.println(arr[2][0]);
        System.out.println(arr1[2][2]);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int notoheck = 9;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == notoheck) {
                System.out.println(STR."\{notoheck} found in the index \{i}");
            } else {
                System.out.println("given number not found");
            }
        }
    }
}