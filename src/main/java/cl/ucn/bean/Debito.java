package cl.ucn.bean;

public class Debito extends Tarjeta {

	
	CajeroAutomatico cajeroAutomatico;
	Comercio comercio;
	
	public void usoCajero(int valor) {
		cajeroAutomatico.retirar(valor);
	}
	
	public void usoComercio(int valor) {
		
		comercio.pagar();
	}
	
}
