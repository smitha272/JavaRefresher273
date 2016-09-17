package collections;

import java.util.*;

public class collectionClass {
	
		ArrayList<Student> arr;
		public collectionClass(){
			 arr = new ArrayList<Student>();
		}
		
		public String addMember(String name,String course,boolean isEnrolled){
			
			arr.add(new Student(name,course,isEnrolled));
			return "";
			
		}
		
		public int enrollment(){
			int count=0;
			for(Student s:arr){
				if(s.SisEnrolled)
				{
					count++;
				}
			}	
			return count;	
		}
}

