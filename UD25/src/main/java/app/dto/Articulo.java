package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="articulos")//en caso que la tabla sea diferente

public class Articulo {
	
			//Atributos de entidad cliente
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
			private Long id;
			@Column(name = "nombre")//no hace falta si se llama igual
			private String nombre;
			@Column(name = "precio")//no hace falta si se llama igual
			private int precio;
			
			@ManyToOne
		    @JoinColumn(name="fab_id")
		    private Fabricante fabricante;

			
			//Constructores
			/**
			 * 
			 */
			public Articulo() {
				
			}

		
			/**
			 * @param id
			 * @param nombre
			 * @param precio
			 * @param fabricante
			 */
			public Articulo(Long id, String nombre, int precio, Fabricante fabricante) {
				//super();
				this.id = id;
				this.nombre = nombre;
				this.precio = precio;
				this.fabricante = fabricante;
			}
			
			// getter y setter
			/**
			 * @return the id
			 */
			public Long getId() {
				return id;
			}


			/**
			 * @param id the id to set
			 */
			public void setId(Long id) {
				this.id = id;
			}


			/**
			 * @return the title
			 */
			public String getNombre() {
				return nombre;
			}


			/**
			 * @param title the title to set
			 */
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}


			/**
			 * @return the director
			 */
			public int getPrecio() {
				return precio;
			}


			/**
			 * @param director the director to set
			 */
			public void setPrecio(int precio) {
				this.precio = precio;
			}


			/**
			 * @return the cliente
			 */
			public Fabricante getFabricante() {
				return fabricante;
			}


			/**
			 * @param cliente the cliente to set
			 */
			public void setFabricante(Fabricante fabricante) {
				this.fabricante = fabricante;
			}


			//metodo toString
			@Override
			public String toString() {
				return "Video [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante + "]";
			}

}
