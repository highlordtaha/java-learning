import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Student Grade Calculator");

            System.out.println("Enter student name: ");
            String name = input.nextLine();


            System.out.println("Enter midterm grade: ");
            double midterm = input.nextDouble();

            System.out.println("Enter final grade: ");
            double finalGrade = input.nextDouble();
            input.nextLine();

            if (midterm < 0 || midterm > 100 ||
                    finalGrade < 0 || finalGrade > 100) {

                System.out.println("Invalid grade! Grades must be between 0 and 100.");

            } else {

                double average = (midterm * 0.40) + (finalGrade * 0.60);

                System.out.println("\nStudent: " + name);
                System.out.println("Midterm: " + midterm);
                System.out.println("Final: " + finalGrade);
                System.out.println("Average: " + average);

                if (average >= 90) {
                    System.out.println("Letter Grade: AA");
                } else if (average >= 85) {
                    System.out.println("Letter Grade: BA");
                } else if (average >= 80) {
                    System.out.println("Letter Grade: BB");
                } else if (average >= 70) {
                    System.out.println("Letter Grade: CB");
                } else if (average >= 60) {
                    System.out.println("Letter Grade: CC");
                } else {
                    System.out.println("Letter Grade: FF");
                }

                }
            System.out.println("Add another student? (Yes/No)");
            String choice = input.nextLine();

            if(choice.equalsIgnoreCase("No")){
                break;
            }
        }
    }
}