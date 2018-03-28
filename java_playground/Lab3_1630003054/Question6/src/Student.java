public class Student {
    private int ID;
    private String name;
    private char grade;
    private boolean sleeping = false;

    public Student(int ID, String name){ // First constructor, pass a ID, and a name
        if (ID < 0){
            this.ID = 0;
        }else{
            this.ID = ID;
        }
        this.name = name;
        this.grade = 'A'; // default grade is A
    }

    public Student(int ID, String name, char grade){ // second constructor, pass a ID, a name and a grade
        if (ID < 0){
            this.ID = 0;
        }else{
            this.ID = ID;
        }
        this.name = name;
        this.grade = grade;
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

    public char getGrade(){ // get the object's name
        return grade;
    }

    public void setGrade(char grade){ // change the object's Grade
        this.grade = grade;
    }

    public boolean isSleeping(){ // return the sleeping status
        return sleeping;
    }

    public void goToSleep(){ // set the sleeping status to true and decrease grade
        sleeping = true;
        if (getGrade() != 'F'){ // the min grade is 'F'
            if (getGrade() != 'D'){ // the difference between D and F is two
                setGrade((char)((int)getGrade() + 1)); // set the char by modify the unicode code by 1
            }else{
                setGrade((char)((int)getGrade() + 2)); // set the char by modify the unicode code by 2 (if current char is 'D')
            }
        }
    }

    public void wakeUp(){ // set the sleeping status to false
        sleeping = false;
    }

    public static void TestStudent(){
        String nameInput = "Alex";
        Student student1 = new Student(1234567890, "Jack", 'A'); // first set the name to Jack, grade set to A
        System.out.println("Student " + student1.getName() + "'s ID is: " + student1.getID());
        System.out.println("Name will gonna be changed to " + nameInput);
        student1.setName(nameInput); // Change the name to Alex
        if (student1.getName().equals(nameInput)){
            System.out.println("Name is changed!");
        }else{
            System.out.println("Something wrong when changing the name...");
        }
        System.out.println(student1.getName() + "'s grade is " + student1.getGrade());
        if (student1.isSleeping()){ // find out the student is sleeping or not
            System.out.println(student1.getName() + " is sleeping!, he will get a decrease in grade.");
        }else {
            System.out.println(student1.getName() + " isn't sleeping.");
        }
        student1.goToSleep();
        System.out.println("Sleep detective! Current Grade: " + student1.getGrade()); // find out which grade the object is
        student1.goToSleep();
        System.out.println("Sleep detective! Current Grade: " + student1.getGrade());
        student1.goToSleep();
        System.out.println("Sleep detective! Current Grade: " + student1.getGrade());
        student1.goToSleep();
        System.out.println("Sleep detective! Current Grade: " + student1.getGrade());
        student1.goToSleep();
        System.out.println("Sleep detective! Current Grade: " + student1.getGrade()); // find out is the 'F' is the smallest grade
        if (student1.isSleeping()){
            System.out.println(student1.getName() + " is sleeping!, he will get a decrease in grade.");
        }else {
            System.out.println(student1.getName() + " isn't sleeping.");
        }
        student1.wakeUp();

        System.out.println("Changing grade to 'B'");
        student1.setGrade('B'); // modify student's grade to B
        System.out.println("Now, " + student1.getName() + "'s grade is " + student1.getGrade());
    }
}
