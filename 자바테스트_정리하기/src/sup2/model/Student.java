package sup2.model;

public class Student {
	private String name;
	private int grade;
	private int classroom;
	private int number;
	private char gender;
	private double result;
	
	public Student(String name, int grade, int classroom,int number, char gender, double result) {
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.gender = gender;
		this.result = result;
	}
	
	public void 정보() {
		String 성별확인 = (gender == 'm' || gender == 'M') ? "남학생" : "여학생";
		System.out.println(grade+"학년 "+classroom+"반 "+number+"번 " +name+성별확인+"의 성적은 "+result+"입니다.");
	}
}
