package cl.ucn.controller;

import cl.ucn.bean.Cliente;
import cl.ucn.service.ClienteService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

import java.io.Serial;
import java.io.Serializable;

@RequestScoped
@Named
public class ClienteController implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Inject
    private ClienteService clienteService;
    private Cliente cliente = new Cliente();

    // Getters and Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Method to handle form submission for adding a new client
    public String agregarCliente() {
        clienteService.agregarCliente(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente agregado exitosamente."));
        return "agregarCliente?faces-redirect=true"; // Redirect to a list view after saving
    }

}