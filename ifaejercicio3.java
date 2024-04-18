import java.util.Scanner;
public class ifaejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1, num2;
        System.out.println("Ingrese un número entre 1 y 10:");
        num1 = sc.nextByte();
        System.out.println("Ingrese otro número entre 11 y 20:");
        num2 = sc.nextByte();

        if(num1 >= 1 && num1 <=10){
            byte multiplicacion;
            multiplicacion = (byte)(num1 *2);
            if(num2 >=11 && num2 <=20){
                byte resta;
                resta = (byte)(multiplicacion - num2);
                System.out.println("El resultado es: " + resta);
            }            

        }
        
    }
    
}
