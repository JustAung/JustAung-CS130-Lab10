package Lab_10;

public class Person {
private String name;
private int age;

public Person(String initialName) {
	this.name=initialName;
	this.age=0;	
}
public Person(String initialName, int age) {
	this.name=initialName;
	this.age=age;	
}
//public String getInitialName() {
//	return name;
//}
public int getAge() {
	return age;
}
public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}
public void printPerson() {
	System.out.println(name+",age"+age+"years");
}
public String getName() {
	return this.name;

}
public static void main(String[] args) {
	Person myName = new Person("Aung",18);
	Person classmate1 = new Person("Ethan",18);
	System.out.println(myName.getName() + myName.getAge());
	System.out.println(classmate1.getName()+classmate1.getAge());
}
}
