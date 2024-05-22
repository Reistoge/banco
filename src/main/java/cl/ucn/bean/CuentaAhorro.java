package cl.ucn.bean;

public class CuentaAhorro {

	int nroCuenta;
	String plazo;
	String descripcion;
	int saldo;
	
	public int getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}
	public String getPlazo() {
		return plazo;
	}
	public void setPlazo(String plazo) {
		this.plazo = plazo;
	}
	public int getSaldo() {
		return saldo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void depositar(int valor) {
		
		this.saldo += valor;
	}
	public int retirar(int valor) {
		
		if (valor >=0)
		{
			this.saldo-=valor;
			return 1;
		}
		else
			return 0;
	}

}
