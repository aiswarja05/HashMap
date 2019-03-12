package maping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	Student s1=new Student("Joye","2","CSE","abc");
	Student s2=new Student("Aiswarja","3","ECE","emn");
	Student s3=new Student("Rimi","2","ECO","lkj");
	
	System.out.println(s1.toString());
	
	ArrayList List=new ArrayList();
	List.add(s1);
	List.add(s2);
	List.add(s3);
	
	HashMap<String,ArrayList<Student>> store=new HashMap<String, ArrayList<Student>>();    
	store.put("Student", List);
	
	System.out.println(List);
	
	
	
	}
	
	}

