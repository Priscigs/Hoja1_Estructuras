/**
 * 
 * @author Priscilla González
 *
 */
import java.util.Scanner;

public class MainRadio {

	public static void main(String[] args) {
		Scanner scanInt = new Scanner (System.in);
		Scanner scan = new Scanner (System.in);

		int opc = 0;
		int opc1 = 0;
		int opc2 = 0;
		int btn = 0;
		String [] emisora = {"Emisora1", "Emisora2", "Emisora3", "Emisora4", "Emisora5", "Emisora6", "Emisora7"};
		
		Radio radio = new Radio();
		
		System.out.println("\n***RADIO***" + 
				"\n1. Encendido/Apagado" + 
				"\n2. Salir"); 
		opc = scanInt.nextInt();
		
		if(opc == 1) {
			if(radio.encenderApagar()) {
				System.out.println("\n***Seleciona una opción***" + 
						"\n1. AM/FM" + 
						"\n2. Avanzar" +
						"\n3. Guardar emisora" +
						"\n4. Seleccionar emisora"); 
				opc1 = scanInt.nextInt();
				

				switch(opc1){
					case 1:
						System.out.print(radio.amFm());
					case 2:
						System.out.print(radio.avanzar());
					case 3:
						System.out.print("Emisoras: ");
						System.out.print("\n1." + emisora[0]);
						System.out.print("\n2." + emisora[1]);
						System.out.print("\n3." + emisora[2]);
						System.out.print("\n4." + emisora[3]);
						System.out.print("\n5." + emisora[4]);
						System.out.print("\n6." + emisora[5]);
						System.out.print("\n7." + emisora[6]);
						System.out.print("\nElegir emisora a guardar: "); opc2 = scanInt.nextInt();
						if(opc2 >= 1 && opc2 <= 7) {
							System.out.print(radio.emisora());
							System.out.print("\nIngrese un boton del 1-12: "); btn = scanInt.nextInt();
							if(btn >= 1 && btn <= 12) {
								System.out.print(radio.guardar(btn));	
							}	
						}
					case 4:
						System.out.print("\nSeleccione un boton del 1-12: "); btn = scanInt.nextInt();
						if(btn >= 1 && btn <= 12) {
							System.out.print(radio.seleccionar(btn));
						}	
				}
			}	
		}
		else {
			System.exit(0);
		}
	}

}
