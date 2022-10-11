/**
 * This program calculate the total price including taxes
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio6 {
    public static void main(String args[]) {
        float base_imponible = 100.5f;
        int iva = 21;
        System.out.println("Total = " + (base_imponible + (base_imponible * iva / 100)));
    }
}
