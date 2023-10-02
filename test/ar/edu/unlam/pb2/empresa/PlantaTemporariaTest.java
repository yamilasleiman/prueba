package ar.edu.unlam.pb2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaTemporariaTest {

	/*
	 * 
	 * Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa y sin
	 * hijos. (161.000)
	 */
	@Test
	public void queSePuedaCrearUnEmpleadoDePlantaPermanente() {
		// preparacion
		Integer horasTrabajadas = 80;
		Integer cantidadHijos = 0;
		Boolean estaCasado = true;

		Double esperado = 161_000.0;
		PlantaTemporaria natan = new PlantaTemporaria(horasTrabajadas, cantidadHijos, estaCasado);
		// Ejecucion
		Double obtenido = natan.getSueldo();
		// contrastacion
		assertEquals(esperado, obtenido);
	}

}
