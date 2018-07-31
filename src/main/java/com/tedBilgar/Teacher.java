package com.tedBilgar;

public class Teacher {
    private String teacherMessage;

    public void setTeacherMessage(String message) {
        this.teacherMessage = message;
    }
    public String takeTheMessage(){
        Student student = new Student();
        student.setStudentMessage("Student message");
        teacherMessage = "I heard you that "+ student.getStudentMessage();
        return teacherMessage;
    }
}
