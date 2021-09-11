package com.example.lab2;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public Student(int no, String name, int age) {
		setNo(no);
		setName(name);
		setAge(age);
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
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
	
	public String toString() {
		return no + " " + name + " " +age;
	}
	
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

}
