import java.util.Scanner;
        public class Main {

            public static void main(String[] args) {

                Scanner console = new Scanner(System.in);
                System.out.print("Enter size: ");
                int size = console.nextInt();

                int[] myArray = new int[size];
                int a;
                for (a = 0; a < myArray.length; a++) {
                    System.out.println("Enter value: ");
                    myArray[a] = console.nextInt();
                }

                int resultArraySize = 0;
                int resultArrayIndex = 0;

                for (int i = 0; i < myArray.length; i++) {
                    if (myArray[i] > 0) {
                        resultArraySize++;
                        System.out.println(myArray[i]);
                    }
                }
                int[] resultArray = new int[resultArraySize];

                for (int i = 0; i < myArray.length; i++) {
                    if (myArray[i] > 0) {
                        resultArray[resultArrayIndex] = myArray[i];
                        resultArrayIndex++;
                    }
                }
            }
        }








