package sindhu;

	class Student{
		public String name;
		private int age;
		public int rollno;
	public void setName(String name) {
		System.out.println(name);
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println(age);
	}
	public  void setRollno(int rollno) {
		System.out.println(rollno);
	}
	}

	public class Encapsulation {
		public static void main(String args[]) {
		Student s1=new Student();
		s1.setName("sindhu");
		s1.setAge(45);
		s1.setRollno(3409);
		
	}
	}

