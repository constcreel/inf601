public class Student {
	String name;
	int age;
	int height;
	Student(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = age;
	}
	@Override
	public String toString() {
		return name + ", " + age + ", " + height;
	}
}