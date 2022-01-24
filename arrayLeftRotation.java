public class arrayLeftRotation {
    public static void main(String[] args) {
        // write your code here
//        Scanner sc=new Scanner(System.in);
//        int m=sc.nextInt();
//        int n=sc.nextInt();
//        int arr[][]=new int[m][n];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int length=arr.length;
        int count=0;

        int minRow=0;
        int minCol=0;
        int maxRow=arr.length-1;
        int maxCol=arr.length-1;
        //System.out.println(maxCol);

        while(count<length){

            //top wall
            for(int i=minRow,j=maxCol;j>=minCol;j--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minRow++;

            //left wall
            for(int i=minRow,j=minCol;i<=maxRow;i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minCol++;

            //bottom wall
            for(int i=maxRow,j=minCol;j<=maxCol;j++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxRow--;

            //right wall
            for(int i=maxRow,j=maxCol;i>=minRow;i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxCol--;



        }
    }
}

