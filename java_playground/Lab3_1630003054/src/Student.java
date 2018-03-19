public class Student {
    private int ID;

    public Student(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public static void TestStudent(){
        Student student1 = new Student(1234567890);
        System.out.println(student1.getID());
    }
}
