public class Library {

    public static void main(String[] args){
        Student student1 = new Student("GandiLu", 1630003054);
        for (int i = 0; i < 3; i++){
            student1.borrowBook();
        }
        student1.returnBook();
        System.out.println(student1.returnStudentName() + " borrowed " + student1.ownedBook() + " Book(s)!");
    }

}
