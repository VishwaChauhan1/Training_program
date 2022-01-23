// i) Write a program (without using inbuilt functions and not using Strings or array)
// to swap first and last digits of any number

import java.util.*;
class Program2{
    	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int num=sc.nextInt();       //1234
		int temp=num;
		int last=num%10;  //4
		System.out.println("last " + last);
	    while(num>10){
	        count++;
	        num/=10;
	    }
	    int first=num;      //1
	    System.out.println("first " + first);
	    num=temp;
	    num/=10;
	  //  System.out.println(num);
	   int p= (int)Math.pow(10,count-1);
	   int middle_num=num%p;
	   int exc=first+middle_num*10+last*(int)Math.pow(10,count);
	    System.out.println(exc);
	}
}