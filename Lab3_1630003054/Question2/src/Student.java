public class Student {
    private int ID;

    public Student(int ID){ // Constructor, pass a ID, and set to the object
        if (ID < 0){ // the input id must greater than 0, or the ID will init to 0
            this.ID = 0;
        }else{
            this.ID = ID;
        }
    }

    public int getID(){
        return ID; // this function will return a int ID number
    }

    public static void TestStudent(){
        int studentID = -123456789;
        Student student1 = new Student(studentID); // new an object
        System.out.println("Student's ID: " + student1.getID()); // print out the student's id
        if (studentID != student1.getID()){ // is this student's id same as the setting
            System.out.println("IDs aren't same as setting, because ID must greater than 0");
        }else{
            System.out.println("IDs are same as setting");
        }
    }
}
