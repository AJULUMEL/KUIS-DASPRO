import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka desimal: ");
        int decimal = sc.nextInt();

        String roman = "";

        while (decimal > 0) {
            if (decimal >= 1000) {
                roman += "M";
                decimal -= 1000;
            } else if (decimal >= 900) {
                roman += "CM";
                decimal -= 900;
            } else if (decimal >= 500) {
                roman += "D";
                decimal -= 500;
            } else if (decimal >= 400) {
                roman += "CD";
                decimal -= 400;
            } else if (decimal >= 100) {
                roman += "C";
                decimal -= 100;
            } else if (decimal >= 90) {
                roman += "XC";
                decimal -= 90;
            } else if (decimal >= 50) {
                roman += "L";
                decimal -= 50;
            } else if (decimal >= 40) {
                roman += "XL";
                decimal -= 40;
            } else if (decimal >= 10) {
                roman += "X";
                decimal -= 10;
            } else if (decimal >= 9) {
                roman += "IX";
                decimal -= 9;
            } else if (decimal >= 5) {
                roman += "V";
                decimal -= 5;
            } else if (decimal >= 4) {
                roman += "IV";
                decimal -= 4;
            } else {
                roman += "I";
                decimal -= 1;
            }
        }

        System.out.println("Roman numeral: " + roman);
    }
}
