package book.xuexiaoxiao.study.fifth;

// ��������Ͷ���ʵ����
public class TestCase3 {
	String name;
	int age;
	private String schoolString; // ����˽�л�
	
	public String getSchoolString() {
		return schoolString;
	}

	public void setSchoolString(String schoolString) {
		this.schoolString = schoolString;
	}

	public void student(String name, int age) {
		System.out.println("This is a student.");
		System.out.println("My name is " + name + ", and i am " + age + ".");
	}
	
	public static void main(String[] args) {
//		TestCase3.student("����",2); // ����д������Ҫ�ȴ���ʵ������
		TestCase3 stu = new TestCase3();
		stu.student("����",20);
		stu.setSchoolString("Wahaha School");
		System.out.println(stu.getSchoolString());
	}
}


