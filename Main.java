package repasoM03.ejemploPackage.tema3.act1;

public class Main {

	public static void main(String[] args) {

		// Creo el array con los habitantes de la ciudad
		String[] habitantes = { "Cam", "Pepe", "Kim", "Phil", "Perry" };
		
		// Posibles sospechosos
		String sospechoso1 = "Maria";
		String sospechoso2 = "Phil";
		
		// Con el metodo compruebo si alguno de los 2 sospechosos se encuentra entre los habitantes
		Funciones.buscarLadron(habitantes, sospechoso1, sospechoso2);
		
	}

}
