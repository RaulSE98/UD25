package app.service;

import java.util.List;

/**
 * @author Raul
 *
 */
import app.dto.Fabricante;

public interface IFabricanteService {
	
		//Metodos del CRUD
		public List<Fabricante> listarFabricantes(); //Listar All 
		
		public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
		
		public Fabricante fabricanteXID(Long id); //Leer datos de un fabricante READ
		
		public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
		
		public void eliminarFabricante(Long id);// Elimina el fabricante DELETE

}
