package lijst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lijst_Test {

	@Test
	void test() {
		int[] jefpenis = {};
		Lijst jefvagina = new Lijst(jefpenis);
		jefvagina.AddLijst(9);
		int lengte = jefvagina.GetLength();
		System.out.print(lengte);
		
		
	}

}
