import java.util.Scanner;

public class FindMax2DimensionalArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dim1Size;
        int dim2Size;

        System.out.print("Nhap vao kich thuoc chieu thu 1 : ");
        dim1Size = input.nextInt();

        System.out.print("Nhap vao kich thuoc chieu thu 2 : ");
        dim2Size = input.nextInt();

        int[][] array = new int[dim1Size][dim2Size];
        for (int i = 0; i < dim1Size; i++) {
            for (int j = 0; j < dim2Size; j++) {
                System.out.printf("Nhap vao phan tu vi tri [%d][%d] : ",i,j);
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Mang vua nhap la : ");
        displayArray(array);

        int[] maxPosition = findMax(array);
        int maxRow = maxPosition[0];
        int maxCol = maxPosition[1];

        System.out.printf("Gia tri lon nhat trong mang la %d, tai vi tri array[%d][%d]",array[maxRow][maxCol],maxRow,maxCol);
    }

    public static void displayArray (int[][]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] findMax (int[][]array){
        int[] maxPosition = {0,0};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max<array[i][j]){
                max = array[i][j];
                maxPosition[0] = i;
                maxPosition[1] = j;
                }
            }
        }
        return maxPosition;
    }
}
