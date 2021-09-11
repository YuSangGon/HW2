package com.example.lab2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101, "Kim", 23);
		al.add(s1);
		
		Student s2 = new Student(102, "Choi", 25);
		al.add(s2);
		
		al.add(new Student(103, "Park", 25));
		al.add(new Student(104, "Yu", 24));
		al.add(new Student(105, "Kang", 24));
		al.add(new Student(106, "Jeon", 26));
		al.add(new Student(107, "Ryu", 21));
		al.add(new Student(108, "Lim", 20));
		al.add(new Student(109, "Lee", 20));
		al.add(new Student(110, "Jeong", 22));
		
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		

	}

}
