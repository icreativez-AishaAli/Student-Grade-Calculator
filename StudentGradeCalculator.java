import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     STUDENT GRADE CALCULATOR          ");

        System.out.println("========================================");


        System.out.print("\nEnter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = Integer.parseInt(sc.nextLine());

        String[] subjectNames = new String[numSubjects];
        int[] marks = new int[numSubjects];

        System.out.println("\n--- Enter Marks (out of 100) ---");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter name of Subject " + (i + 1) + ": ");
            subjectNames[i] = sc.nextLine();


            while (true) {
                System.out.print("Enter marks for " + subjectNames[i] + " (0-100): ");
                int mark = Integer.parseInt(sc.nextLine());

                if (mark < 0 || mark > 100) {
                    System.out.println("  !! Invalid input. Marks must be between 0 and 100. Please re-enter.");
                } else {
                    marks[i] = mark;
                    break;
                }
            }
        }

        // --- PROCESS PHASE  ---

        // Gear 1: Accumulator Loop
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalMarks += marks[i];
        }

        // Gear 2: Type Casting to avoid integer truncation trap
        // (double) ensures decimal precision e.g. 85.5% not 85.0%
        double average = (double) totalMarks / numSubjects;

        // Gear 3: Logic Ladder (grade assignment) - strictest condition checked first
        String grade;
        String status;

        if (average >= 90) {
            grade = "A+";
            status = "PASS";
        } else if (average >= 80) {
            grade = "A";
            status = "PASS";
        } else if (average >= 70) {
            grade = "B";
            status = "PASS";
        } else if (average >= 60) {
            grade = "C";
            status = "PASS";
        } else if (average >= 50) {
            grade = "D";
            status = "PASS";
        } else {
            grade = "F";
            status = "FAIL";
        }

        // --- OUTPUT PHASE (The Presentation Layer) ---
        System.out.println("\n========================================");
        System.out.println("           RESULT REPORT               ");
        System.out.println("========================================");
        System.out.println("Student Name   : " + studentName);
        System.out.println("Total Subjects : " + numSubjects);
        System.out.println("\n--- Subject-wise Marks ---");

        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("  %-20s : %d / 100%n", subjectNames[i], marks[i]);
        }

        System.out.println("\n--- Summary ---");
        System.out.printf("  Total Marks  : %d / %d%n", totalMarks, numSubjects * 100);
        System.out.printf("  Average      : %.2f%%%n", average);   // %.2f avoids ugly 85.3333333...
        System.out.printf("  Grade        : %s%n", grade);
        System.out.printf("  Status       : %s%n", status);
        System.out.println("========================================");


    }
}
