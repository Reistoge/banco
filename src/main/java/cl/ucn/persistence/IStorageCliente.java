package cl.ucn.persistence;

import cl.ucn.bean.Cliente;

public interface IStorageCliente {

	public Cliente getCliente(int rut);
	public void guardarCliente(Cliente cliente);
	public void eliminarCliente(int rut);
}
