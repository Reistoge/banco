package cl.ucn.bean;

public class Comercio {

	
	int id;
	String nombre;
	int valorTotalCompra;
	CuentaAhorro cuentaAhorro;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValorTotalCompra() {
		return valorTotalCompra;
	}
	public void setValorTotalCompra(int valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}
	public void pagar() {
		this.cuentaAhorro.retirar(valorTotalCompra);
	}
	
}
