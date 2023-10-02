package ar.edu.unlam.pb2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	/*
	 *Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 a�os de antig�edad. (658.000) 
	 */
	@Test
	public void queSePuedaCrearUnGerente() {
		// preparacion
		Integer horasTrabajadas = 160;
		Integer cantidadHijos = 1;
		Boolean estaCasado = true;
		Integer antiguedad = 10;
		Double esperado = 658_000.0;
		Gerente natan = new Gerente(horasTrabajadas, cantidadHijos, estaCasado, antiguedad);
		// Ejecucion
		Double obtenido = natan.getSueldo();
		// contrastacion
		assertEquals(esperado, obtenido);
	}

}
