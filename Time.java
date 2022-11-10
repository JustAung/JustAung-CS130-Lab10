package Lab_10;

public class Time {
private int dMonth;
private int dDay;
private int dYear;
public Time(int dMonth, int dDay, int dYear) {
	this.dMonth=11;
	this.dDay=10;
	this.dYear=2022;
}
public final int getDay() {
	return dDay;
}
public final int getMonth() {
	return dMonth;
}
public final int getYear() {
	return dYear;
}
public final void printDate() {
	System.out.println(dDay+"/"+dMonth+"/"+dYear);
}
public final void setDate(int dDay, int dMonth, int dYear) {
	this.dDay=dDay;
	this.dMonth=dMonth;
	this.dYear=dYear;
}

public static void main(String[] args) {
	Time date = new Time(11, 10, 2022);
	date.printDate();
}
}
