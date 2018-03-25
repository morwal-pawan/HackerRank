package java.DataStructure;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa) {
	this.id = id;
	this.name = name;
	this.cgpa = cgpa;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student that) {
	if	(getCgpa() < that.getCgpa()) return +1;
	else if (getCgpa() > that.getCgpa()) return  -1;
	else if(getCgpa() == that.getCgpa()) return getName().compareTo(that.getName());
	else if(getId() < that.getId())      return -1;
	else if (getId() > that.getId())     return +1;
	else                                 return 0;
    }
    @Override
    public String toString() {
	return name +" "+ cgpa + " " +id;
    }
}



class Priorities{

    PriorityQueue<Student> pq = new PriorityQueue<>();
    List<Student> result = new ArrayList<Student>();
    public List<Student> getStudents(List<String> events){
		for(String event : events)
		{
		    Scanner in = new Scanner(event);
		    String op = in.next();
		    if("ENTER".equals(op)) {
			String name = in.next();
			double cgpa = Double.parseDouble(in.next());
			int id  = Integer.parseInt(in.next());
			pq.offer(new Student(id, name, cgpa));
			System.out.println("Added in pq :" +pq.toString());
		    }
		    else if("SERVED".equals(op))
		    {	
		        Student s = pq.poll();
		    	System.out.println(s	);
			System.out.println("left in pq :" +pq.toString());
		    }
		}
	while(!pq.isEmpty())
	{
	    result.add(pq.poll());
	    System.out.println(pq.toString());
	}
	    
	return  result;
    }
}


 
public class JavaPriorityQueue {
    
    
    private  static Priorities priorities = new Priorities();
    
    public static void main(String[] args) throws IOException {
    
	Scanner scan = new Scanner(new FileReader("src/files/JavaPriorityQueue.txt"));
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            events.add(scan.nextLine());
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}