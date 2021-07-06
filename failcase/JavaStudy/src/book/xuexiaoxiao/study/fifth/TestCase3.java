package book.xuexiaoxiao.study.fifth;

// 创建对象和对象实例化
public class TestCase3 {
	String name;
	int age;
	private String schoolString; // 变量私有化
	
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
//		TestCase3.student("张三",2); // 错误写法，需要先创建实例对象
		TestCase3 stu = new TestCase3();
		stu.student("张三",20);
		stu.setSchoolString("Wahaha School");
		System.out.println(stu.getSchoolString());
	}
}


