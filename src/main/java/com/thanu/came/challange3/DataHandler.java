package com.thanu.came.challange3;

import java.io.Serializable;

public class DataHandler implements Serializable {
    private String studentId;
    private String studentName;

    public DataHandler() {
    }

    public DataHandler(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
