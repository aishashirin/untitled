package Homework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class MentorTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of your array: ");
        int n = scanner.nextInt();
        System.out.println("Enter elements of your array: ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println(countMoves(numbers));
    }

    public static long countMoves(List<Integer> numbers) {
        long count = 0;
        int max = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            for (int j = 0; j < numbers.size(); j++) {
                numbers.set(j, numbers.get(j) + 1);
                if (numbers.get(j) == max) {
                    numbers.set(j, numbers.get(j) - 1);
                }
            }
            count++;
        }
        return count;
    }
}

