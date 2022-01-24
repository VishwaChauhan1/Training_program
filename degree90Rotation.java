import java.util.*;
public class degree90Rotation {
	public static void main(String[] args) {
    	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    	int length=matrix.length;
    	System.out.println("Original Matrix");
    	for(int i=0;i<length;i++){
    	    for(int j=0;j<length;j++){
    	        System.out.print(matrix[i][j]+" ");
    	    }
    	    System.out.println();
    	}
    	System.out.println("Matrix after 90deg rotation:");
    	for(int j=0;j<length;j++){
    	    for(int i=length-1;i>=0;i--){
    	        System.out.print(matrix[i][j]+" ");
    	    }
    	    System.out.println();
    	}
	}
}
