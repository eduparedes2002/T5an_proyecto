package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_productos")
public class Producto {

	@Id
	@Column(name ="id_prod")
	private String idproducto;
	
	@Column(name ="des_prod")
	private String descripcion;
	
	@Column(name ="stk_prod")
	private int stock;
	
	
	@Column(name ="pre_prod")
	private double precio;
	
	@ManyToOne
	@JoinColumn(name="idcategoria",insertable=false,updatable=false)
	Categoria categorias;
	private int idcategoria;
	
	@Column(name ="est_prod")
	private int estado;
	
	@Column(name ="idprovedor")
	private int idproveedor;
	@ManyToOne
	@JoinColumn(name = "idprovedor", insertable = false, updatable = false)

	Proveedor proveedores;
	
	public Producto() {
		super();
	}

	public Producto(String idproducto, String descripcion, int stock, double precio, Categoria categorias,
			int idcategoria, int estado, int idproveedor, Proveedor proveedores) {
		super();
		this.idproducto = idproducto;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
		this.categorias = categorias;
		this.idcategoria = idcategoria;
		this.estado = estado;
		this.idproveedor = idproveedor;
		this.proveedores = proveedores;
	}

	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", descripcion=" + descripcion + ", stock=" + stock + ", precio="
				+ precio + ", categorias=" + categorias + ", idcategoria=" + idcategoria + ", estado=" + estado
				+ ", idproveedor=" + idproveedor + ", proveedores=" + proveedores + "]";
	}

	public String getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Categoria getCategorias() {
		return categorias;
	}

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public Proveedor getProveedores() {
		return proveedores;
	}

	public void setProveedores(Proveedor proveedores) {
		this.proveedores = proveedores;
	}

	
	
	
	
}
