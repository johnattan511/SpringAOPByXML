package beans;

import java.sql.SQLException;

public class ClasePrueba {

	public String metodo1() {
		System.out.println("metodo1");
		return "Embajador";
	}

	public String metodo2() throws Exception {
		System.out.println("metodo2");
		throw new Exception("Error marica");
	}

	public void metodo3() {
		System.out.println("metodo3");
	}
}
