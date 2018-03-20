public class Student {
    private int ID;
    private String name;

    public Student(int ID, String name){
        if (ID < 0){
            this.ID = 0;
        }else{
            this.ID = ID;
        }
        this.name = name;
    }

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void TestStudent(){
        String nameInput = "Alex";
        Student student1 = new Student(1234567890, "Jack");
        System.out.println(student1.getID());
        System.out.println("Name will gonna be changed to " + nameInput);
        student1.setName(nameInput);
        if (student1.getName() == nameInput){
            System.out.println("Name is changed!");
        }else{
            System.out.println("Something wrong when changing the name...");
        }
    }
}
