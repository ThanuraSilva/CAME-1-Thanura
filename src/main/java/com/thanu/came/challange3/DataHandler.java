package com.thanu.came.challange3;

import com.thanu.came.challange3.dto.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataHandler {

    public void dataAdding(){
        var scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String studentId = "";
        String studentName = "";

        System.out.println("---Student Registration System---");
        System.out.println("Enter the required data.If you need to exit, please type `exit` or `quit` ");

        while(true){
            //Student ID
            while (true) {
                System.out.print("Enter Student ID: ");
                studentId = scanner.nextLine().trim();

                //validation
                if (studentId.equalsIgnoreCase("exit") || studentId.equalsIgnoreCase("quit")) {
                    System.out.println("Thank you for using this program. Good Bye.....");
                    printData(studentList);
                    scanner.close();
                    return;
                }
                if (studentId.isEmpty()) {
                    System.out.println("Student Id cannot be empty");
                    continue;
                }
                break;
            }

                while(true){
                    System.out.print("Enter Student Name: ");
                    studentName = scanner.nextLine().trim();

                    //validation
                    if(studentName.equalsIgnoreCase("exit") || studentName.equalsIgnoreCase("quit")){
                        System.out.println("Thank you and have a nice day. Good Bye.....");
                        printData(studentList);
                        scanner.close();
                        return;
                    }
                    if(studentName.isEmpty()){
                        System.out.println("Student Name cannot be empty");
                        continue;
                    }
                    break;
                }

            var student = new Student(studentId, studentName);
            studentList.add(student);
            System.out.printf("Added Student ID: %s\n and Student Name: %s\n", studentId, studentName);

        }
    }

    private void printData(List<Student> studentList){
        System.out.println("---------Student Details ---------------");
        if(studentList.isEmpty()){
            System.out.println("Nothing to print");
        }else {
            studentList.forEach(System.out::println);
        }
    }

}
