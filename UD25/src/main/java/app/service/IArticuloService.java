package app.service;

import java.util.List;

import app.dto.Articulo;

public interface IArticuloService {
	
			//Metodos del CRUD
			public List<Articulo> listarArticulos(); //Listar All 
			
			public Articulo guardarVideo(Articulo articulo);	//Guarda un articulo CREATE
			
			public Articulo articuloXID(Long id); //Leer datos de un articulo READ
			
			public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del articulo UPDATE
			
			public void eliminarArticulo(Long id);// Elimina el articulo DELETE

}
