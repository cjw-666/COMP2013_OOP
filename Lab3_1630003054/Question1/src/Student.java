public class Student {
    private int ID;

    public Student(int ID){ // Constructor, pass a ID, and set to the object
        this.ID = ID;
    }

    public int getID(){
        return ID;
    } // public function that return the object's ID

    public static void TestStudent(){
        Student student1 = new Student(1234567890); // new an o
        System.out.println("Student's ID: " + student1.getID());
    }
}
