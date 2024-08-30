
package votrungtai;
import java.util.Arrays;
import java.util.Scanner;
public class VoTrungTai {
     public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap phan tu thu: " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
}

public static void printData(float[] arrays) {
        System.out.print("Cac phan tu trong mang: ");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;
        
        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }

        return max2;
    }

public static float[] deleteOddNumber(float[] arrays) {
        int chan = 0;
        for (float num : arrays) {
            if ((int) num % 2 == 0) {
                chan++;
            }
        }

        float[] newArray = new float[chan];
        int sochan = 0;
        for (float num : arrays) {
            if ((int) num % 2 == 0) {
                newArray[sochan++] = num;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang : ");
        int n = scanner.nextInt();
        
        float[] arrays = new float[n];
        arrays = importData(arrays);
        printData(arrays);
        float max2 = findMax2(arrays);
        System.out.println("Max 2: " + max2);
        float[] evenArray = deleteOddNumber(arrays);
        System.out.print("Sau khi xoa cac phan tu le: ");
        printData(evenArray);
    }
}