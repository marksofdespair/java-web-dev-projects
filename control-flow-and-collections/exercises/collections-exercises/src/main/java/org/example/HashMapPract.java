package org.example;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, String> classRoster = new HashMap<Integer, String>();

        String newStudent;

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.isEmpty()) {
                System.out.print("ID: ");
                int newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine(); // Consume the newline character left by nextInt()
            }
        } while (!newStudent.isEmpty());

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
