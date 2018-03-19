public class Student {
    private String name;
    private int studentID;
    private String studentEmail;
    private int numberOfBook = 0;

    public Student(){
        this.name = "John Doe";
        this.studentID = 1234567890;
        this.studentEmail = this.studentID + "@mail.uic.edu.hk";
    }
    public Student(String name){
        this.name = name;
        this.studentID = 1234567890;
        this.studentEmail = this.studentID + "@mail.uic.edu.hk";
    }
    public Student(String name, int studentID){
        this.name = name;
        this.studentID = studentID;
        this.studentEmail = this.studentID + "@mail.uic.edu.hk";
    }

    public void borrowBook(){
        numberOfBook += 1;
    }

    public void returnBook(){
        if (numberOfBook > 0){
            numberOfBook -= 1;
        }
    }

    public int ownedBook(){
        return numberOfBook;
    }

    public String returnStudentName(){
        return name;
    }
}
