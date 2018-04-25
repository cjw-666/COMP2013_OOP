public class Student {
    private int ID;
    private String name;

    public Student(int ID, String name){ // Constructor, pass a ID, and a name
        if (ID < 0){ // ID must greater than 0
            this.ID = 0;
        }else{
            this.ID = ID;
        }
        this.name = name;
    }

    public int getID(){ // return the object's ID
        return ID;
    }

    public String getName(){ // return the object's name
        return name;
    }

    public void setName(String name){ // change the object name
        this.name = name;
    }

    public static void TestStudent(){
        String nameInput = "Alex";
        Student student1 = new Student(1234567890, "Jack"); // first set the name to Jack
        System.out.println("Student's ID: " + student1.getID());
        System.out.println("Name will gonna be changed to " + nameInput);
        student1.setName(nameInput); // Change the name to Alex
        if (student1.getName().equals(nameInput)){ // find out the name is changed or not
            System.out.println("Name is changed!");
        }else{
            System.out.println("Something wrong when changing the name...");
        }
    }
}
