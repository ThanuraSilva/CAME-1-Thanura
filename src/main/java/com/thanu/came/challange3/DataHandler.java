package com.thanu.came.challange3;

import com.thanu.came.challange3.dto.Student;

import java.util.Scanner;

public class DataHandler {

    public void dataAdding(){
        var scanner = new Scanner(System.in);
        var student = new Student();

        System.out.println("Enter Student ID: ");
        var studentId = scanner.nextLine();
        student.setStudentId(studentId);

        System.out.println("Enter Student Name: ");
        var studentName = scanner.nextLine();
        student.setStudentName(studentName);
    }

}
