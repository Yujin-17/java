package class_quiz01;

public class StudentTest {

	public static void main(String[] args) {
		//나의 의식 흐름
		StudentData stu1 = new StudentData();

		stu1.age = 21;
		stu1.className = "java";
		stu1.name = "유재석";
		stu1.phoneNumber = "01023453223";
		
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.className);
		System.out.println(stu1.phoneNumber);
		stu1.isAdult();

		System.out.println();

		StudentData stu2 = new StudentData();

		stu2.age = 17;
		stu2.className = "java";
		stu2.name = "이효리";
		stu2.phoneNumber = "01096482734";
		
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.className);
		System.out.println(stu2.phoneNumber);
		stu2.isAdult();
		
		System.out.println();
		
		
		
		StudentData[] students = new StudentData[2];
		students[0] = stu1;
		students[1] = stu2;
		
		for(int i = 0; i < students.length; i++) {
			// students[i].printInfo();
			students[i].isAdult();
		}
		

	}

}
