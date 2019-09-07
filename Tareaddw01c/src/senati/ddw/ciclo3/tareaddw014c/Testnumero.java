package senati.ddw.ciclo3.tareaddw014c;
import java.util.Scanner;
public class Testnumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Numero Onum = new Numero();
			Scanner Leer = new Scanner(System.in);
			System.out.print("\n Ingrese el número : ");
			double n = Leer.nextDouble();
			Onum.Num = n;
			System.out.println(" " + Onum.Primo());
			System.out.println(" " + Onum.Perfecto());
			System.out.println(" Factorial " + Onum.Factorial());
			}catch (Exception ex) {
			}

	}

}
