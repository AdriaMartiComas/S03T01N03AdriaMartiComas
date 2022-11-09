package nivell3;

import java.util.Scanner;

public class Parking {
	
	public static Vehicle triarVehicle() {
		Scanner sc = new Scanner(System.in);
		Vehicle vehicle;

		int opcio = 0;
		System.out.println("Quin vehicle vols usar?");
		System.out.println("1. Avio");
		System.out.println("2. Vaixell");
		System.out.println("3. Cotxe");
		System.out.println("4. Bicicleta");
		
		opcio = sc.nextInt();
		switch (opcio) {
		case 1:
			vehicle = new Avio();
			break;
		case 2:
			vehicle = new Vaixell();
			break;
		case 3:
			vehicle = new Cotxe();
			break;
		case 4:
			vehicle = new Bicicleta();
			break;
		default:
			vehicle = null;
			break;
		}
		sc.close();
		return vehicle;
	}

}
