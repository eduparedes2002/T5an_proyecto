package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;



@Entity
@Table(name = "tb_categorias")
@Data


public class Categoria {

	@Id
	@Column(name ="idcategoria")
	private int idcategoria;
	
	
	@Column(name ="descripcion")
	private String descripcion;


	public Categoria() {
		super();
	}


	public Categoria(int idcategoria, String descripcion) {
		super();
		this.idcategoria = idcategoria;
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Categoria [idcategoria=" + idcategoria + ", descripcion=" + descripcion + "]";
	}


	public int getIdcategoria() {
		return idcategoria;
	}


	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	
}
