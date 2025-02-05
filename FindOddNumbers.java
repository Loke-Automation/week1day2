package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<=10;i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		int a=6;
		int b=3;
		System.out.println(a+b);
		
		System.out.println(a-b);
		
		System.out.println(a*b);
		
		System.out.println(a/b);
		
		System.out.println(a%b);
		
		System.out.println(b-a);
		
		System.out.println("---------------");
		
		int c=3;
		int d=5;
		
		System.out.println(a==b);
		
		System.out.println(a!=b);
		
		System.out.println(c==d);
		
		System.out.println(c!=d);
		
		System.out.println(c<d);
		
		System.out.println(c>d);
		
		System.out.println(c<=d);
		
		System.out.println(c>=d);
		
		System.out.println("-----------------");
		
		int s=4;
		int v=5;
		//And operator
		System.out.println(s<v&&s<=v);
		
		//OR operator
		System.out.println(s<v||s>v);
		
		System.out.println("-----------");
		
		//postIncrement
		int r=7;
		System.out.println(r++);
		
		System.out.println(r);
		
	//preIncrement -Increases the no by 1 i=1 ++ 
		System.out.println(++r);
		
		
	//postDecrement - Decrease the number by 1 --i
		System.out.println(--r);
		
		System.out.println(r);
		}
		
	
	}

}