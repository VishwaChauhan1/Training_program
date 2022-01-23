// v) Write a program to find the smallest number divisible by all the numbers between 1 to 9

import java.util.*;
class Program5{
    public static void main(String[] args) {
    int i=1;
     while(i%2!=0||i%3!=0||i%4!=0||i%5!=0||i%6!=0||i%7!=0||i%8!=0||i%9!=0){
         i++;
     }
     System.out.println(i);
		
	}
}