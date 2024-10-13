package cl.ucn.controller;

import cl.ucn.bean.Cliente;
import cl.ucn.service.ClienteService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

import java.io.Serializable;

@SessionScoped // Asegúrate de que esto sea necesario
@Named
public class ClienteController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ClienteService clienteService;

    private Cliente cliente = new Cliente();
    private int rut;

    // Getters and Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    // Method to handle form submission for adding a new client
    public String agregarCliente() {
        clienteService.agregarCliente(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente agregado exitosamente."));
        return "agregarCliente?faces-redirect=true"; // Redirect to a list view after saving
    }

    // Method to handle finding a client by RUT
    public void buscarCliente() {
        cliente = clienteService.obtenerCliente(rut);
    }

    // Method to handle deleting a client by RUT
    public void eliminarCliente() {
        clienteService.eliminarCliente(rut);
    }
}