// question 1 Write down a method boolean isNameValid(String  name).
// A name is valid if following conditions are satisfied:
// • It does not contain any vowel more than once.
// • If the name contains two ‘S’, then there is not any ‘T’ in between them (both in capital cases).


import java.util.*;
class Program1{
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int firstPosition=-1;
		int secondPosition=-1;
		int a=0,e=0,I=0,o=0,u=0;
		boolean inValid=false;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='a'){
		        a++;
		    }
		    if(s.charAt(i)=='e'){
		        e++;
		    }
		    if(s.charAt(i)=='i'){
		        I++;
		    }
		    if(s.charAt(i)=='o'){
		        o++;
		    }
		    if(s.charAt(i)=='u'){
		        u++;
		    }
		    if(s.charAt(i)=='S'){
		        if(firstPosition==-1){
		            firstPosition=i;
		        }else{
		            secondPosition=i;
		        }
		    }
		    if(a>1 || e>1 || I>1 || o>1 || u>1){
		        System.out.println("String is invalid");
		        inValid=true;
		        break;
		    }
		}
		
		
		if(firstPosition!=-1 && secondPosition!=-1 && !inValid){
	       for(int j=firstPosition+1;j<secondPosition;j++){
	           if(s.charAt(j)=='T'){
	               System.out.println("String is invalid");
	               break;
	           }else{
	               System.out.println("String is valid");
	               break;
	           }
	       }
		}
	}
}