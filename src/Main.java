import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("Enter a size: ");
        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a mark for student " +(i + 1) + ": ");
            array[i] = input.nextInt();
        }
        int count = 0;
        System.out.println("List of mark: ");
        for (int j : array) {
            System.out.print(j + "\t");
            if (j >= 5 && j <= 10) {
                count++;
            }
        }
        System.out.println("\n The number of students passed the exam is: " + count);
    }
}