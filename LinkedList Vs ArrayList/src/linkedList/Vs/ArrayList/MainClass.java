package linkedList.Vs.ArrayList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
	
	static void getTimeDiff(List<Integer>List) {
		long start = System.currentTimeMillis();  // Get Starting Count Time from start variable
		
		for(int i=0; i<100000 ; i++) {
			List.add(0,i);  // We Add All the value of i=0 to i=100000 in Both ArrayList and LinkedList
			
		}
		long end = System.currentTimeMillis();  // Get End count Time from end variable
		
		System.out.println(List.getClass().getName() + "->" + (end - start));  // .getClass().getName() = It Gives the java.util. Class name 
		
		
	}

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		getTimeDiff(ll);  // Time Difference for LinkedList between start and end
		getTimeDiff(al);  // Time Difference for ArrayList between start and end

	}

}
