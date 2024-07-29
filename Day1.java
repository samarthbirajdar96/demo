package samarth_project;

import java.util.Scanner;

//even



public class Day1 {
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in); 
		int x=sc.nextInt();
		for(int i=1;i<x;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}


//odd


/*public class Day1 {
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in); 
	int x=sc.nextInt();
	for(int i=1;i<x;i++) {
		if(i%2==1) {
			System.out.println(i);
		}
	}
}

}*/





//prime

/*public class Day1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		//System.out.println("enter no");
			int x=sc.nextInt();
			int count=0;
			for(int i=1;i<=x;i++) {
				if(x%i==0) {
					count++;
				}
			}
			if(count>2) {
				System.out.println("not prime");
			}else {
				System.out.println("prime");
			} 
				sc.close();
			}
		
	}
	
*/




