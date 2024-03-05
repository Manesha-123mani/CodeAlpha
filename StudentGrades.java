import java.util.ArrayList;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        // Input grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            int grade = scanner.nextInt();
            grades.add(grade);
        }
        // Calculate average
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;
        // Find highest and lowest grades
        int highest = grades.get(0);
        int lowest = grades.get(0);
        for (int i = 1; i < grades.size(); i++) {
            int currentGrade = grades.get(i);
            if (currentGrade > highest) {
                highest = currentGrade;
            }
            if (currentGrade < lowest) {
                lowest = currentGrade;
            }
        }
        // Display results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        scanner.close();
    }
}
