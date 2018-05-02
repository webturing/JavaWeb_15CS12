import java.util.Arrays;


public class Person implements java.io.Serializable{
	String name;
	int age;
	String gender;
	String[] hobbies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Person person=new Person();
		person.setName("ZHANG SAN");
		person.setAge(18);
		person.setGender("Male");
		person.setHobbies(new String[]{"eat","drink","play","happy"});
		System.out.println(person.getAge());
		System.out.println(Arrays.asList(person.getHobbies()).indexOf("play")>=0);
	}
	
}
