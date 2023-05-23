package repasoM03.ejemploPackage.tema3.act1;

public class Funciones {

	public static String buscarLadron(String[] habitantes, String sospechoso1, String sospechoso2) {
		
		for(String hab : habitantes) {
			// Compruebo si el sospechoso numero 1 esta ignorando mayusculas y minusculas
			if (hab.equalsIgnoreCase(sospechoso1)) {
				System.out.println("El ladrón ha sido " + sospechoso1);
				return sospechoso1;
			// Compruebo si el sospechoso numero 1 esta ignorando mayusculas y minusculas
			} else if (hab.equalsIgnoreCase(sospechoso2)){
				System.out.println("El ladrón ha sido " + sospechoso2);
				return sospechoso2;
			}
			
		}

		return "El ladrón no está aquí.";
		
	}
	
}
