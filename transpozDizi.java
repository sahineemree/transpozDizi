import java.util.Scanner;

public class transpozDizi {

        static void dongu(int[][] array){
            for (int[] row : array){
                for (int col : row ){
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Dizinin ilk boyutunu giriniz : ");
            int k = input.nextInt();

            System.out.println("Dizinin ikinci boyutunu giriniz : ");
            int y = input.nextInt();


            int[][] array = new int[k][y];

            for (k = 0 ; k< array.length ; k++){
                for (y = 0 ; y<array[k].length ; y++){
                    System.out.print((y+1) + ". elemanı giriniz : ");

                    int sayi = input.nextInt();
                    array[k][y] = sayi;

                }
            }

            int[][] tempArray = new int[array[0].length][array.length];

            for (int i =  0; i<array.length;i++){
                for (int j = 0 ; j<array[i].length;j++){
                    tempArray[j][i] = array[i][j];
                }
            }

            System.out.println("dizi : ");
            dongu(tempArray);
            System.out.println("transpoze dizi : ");
            dongu(array);
        }
    }