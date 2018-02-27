package java.DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int testCases = Integer.parseInt(in.nextLine());

	List<Student> studentList = new ArrayList<Student>();
	while (testCases > 0) {
	    int id = in.nextInt();
	    String fname = in.next();
	    double cgpa = in.nextDouble();

	    studentList.add(new Student(id, fname, cgpa));

	    testCases--;
	}
	Collections.sort(studentList, new StudentChecker());
	for (Student st : studentList) {
	    System.out.println(st.getFname());
	}
    }
}

class StudentChecker implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {

	double cgpa1 = student1.getCgpa();
	double cgpa2 = student2.getCgpa();
	String st1 = student1.getFname();
	String st2 = student2.getFname();
	int id1 = student1.getId();
	int id2 = student2.getId();
	if (cgpa1 != cgpa2) {
	    if (cgpa1 > cgpa2)
		return -1;
	    else if (cgpa1 < cgpa2)
		return 1;
	    else
		return 0;
	} else if (!st1.equals(st2))
	    return st1.compareTo(st2);
	else if (id1 != id2) {
	    if (id1 > id2)
		return -1;
	    else if (id1 < id2)
		return 1;
	    else
		return 0;
	}
	return 0;
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
	super();
	this.id = id;
	this.fname = fname;
	this.cgpa = cgpa;
    }

    public int getId() {
	return id;
    }

    public String getFname() {
	return fname;
    }

    public double getCgpa() {
	return cgpa;
    }
}