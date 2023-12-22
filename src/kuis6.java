import java.util.Scanner;

public class kuis6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        int decimal = sc.nextInt();

        String roman = convertToRoman(decimal);

        System.out.println("Padanan Romawi: " + roman);

        sc.close();
    }

    public static String convertToRoman(int decimal) {
        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < decimalValues.length; i++) {
            while (decimal >= decimalValues[i]) {
                roman.append(romanSymbols[i]);
                decimal -= decimalValues[i];
            }
        }

        return roman.toString();
    }
}
