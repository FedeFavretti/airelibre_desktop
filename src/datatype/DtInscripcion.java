package datatype;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.ClaseDeportiva;
import modelo.Deportista;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtInscripcion {

	private int id;
	private LocalDate fechaInscripcion;
	private int cantidadDesportistas;
	private int costo;
	private Deportista deportista;
	private ClaseDeportiva claseDeportiva;
	
}
