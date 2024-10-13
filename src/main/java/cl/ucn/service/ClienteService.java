package cl.ucn.service;

import cl.ucn.bean.Cliente;
import cl.ucn.persistence.StorageCliente;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.transaction.Transactional;

import java.io.Serializable;

@Named
public class ClienteService implements Serializable {

    @Inject
    private StorageCliente storageCliente;  // Inject your StorageCliente bean

    @Transactional
    public void agregarCliente(Cliente cliente) {
        storageCliente.guardarCliente(cliente);
    }

    @Transactional
    public void eliminarCliente(int rut) {
        storageCliente.eliminarCliente(rut);
    }

    @Transactional
    public Cliente obtenerCliente(int rut) {
        return storageCliente.getCliente(rut);
    }
}

