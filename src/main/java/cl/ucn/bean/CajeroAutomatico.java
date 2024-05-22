package cl.ucn.bean;

public class CajeroAutomatico {

	int id;
	String localidad;
	CuentaAhorro cuentaAhorro;
	int saldo;
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public CuentaAhorro getCuentaAhorro() {
		return cuentaAhorro;
	}
	public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
		this.cuentaAhorro = cuentaAhorro;
	}
	public void retirar(int valor) {
		
		this.cuentaAhorro.retirar(valor);
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
}
