import java.util.Scanner;
class SumOfArray{

        static int [] sumOfArray(int [] arrayA, int [] arrayB){

	int [] tem = new int [arrayA.length];
            for(int i = 0; i < arrayB.length; i++){
                    //if(arrayA[i] == arrayB[i]){
                        tem[i] = arrayA[i] + arrayB[i];

               //     }//if
                }//for2

            return tem;
        }//METHOD
        public static void main(String[] args){
            Scanner in =  new Scanner(System.in);
            System.out.print("Please enter the size of Array 01 : ");
            int size1 = in.nextInt();
            while(size1 <= 0){
                System.out.println("Error!");
                System.out.println("Please enter the size greater than ZERO: ");
            }//while
            int [] arrayA = new int[size1];
            for(int i = 0; i < size1; i++){
                System.out.print("Please enter the elements on ewach index of the Array :    "+i+"  ");
                arrayA[i] = in.nextInt();
            }//for
            //input welidation for array 02:

            System.out.print("Please enter the size of Array 02 : ");
            int size2 = in.nextInt();
            while(size2 <= 0){
                System.out.println("Error!");
                System.out.println("Please enter the size greater than ZERO: ");
            }//while
            int [] arrayB = new int[size2];
            for(int i = 0; i < size2; i++){
                System.out.print("Please enter the elements on ewach index of the Array :    "+i+"  ");
                arrayB[i] = in.nextInt();
            }//for
            int [] finalArray = sumOfArray(arrayA, arrayB);
            for(int i = 0; i < finalArray.length; i++){
                System.out.println("Array Index at:  "+i+"  Value is  "+finalArray[i]);
            }//final
        }//main
}//class