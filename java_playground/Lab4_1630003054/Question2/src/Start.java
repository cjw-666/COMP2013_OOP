public class Start {
	public static void main(String[] args) {
		Student.testStudent();
		Student stu = new Student(1234567890); // new a student
		System.out.println(check(stu) == "need coffee"); // original status is awake
		stu.fallAsleep(); // let it fall a sleep
		System.out.println(check(stu) == "sweet dreams");
	}
	
	public static String check(Student student) { //  check must be static if you want to call it from a static method.
		// or you have to new a Start Object
		if(student.isSleeping()) { // return string according to sleeping status
			return "sweet dreams";
		}else {
			return "need coffee";
		}
	}
}
