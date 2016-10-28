/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.portillo.controller;

import java.util.List;
import py.edu.facitec.portillo.model.Cliente;

/**
 *
 * @author Cristina
 */
public interface ClienteController {
    
    void registrarCliente(Cliente cliente);
    boolean modificarCliente(Cliente cliente);
    Cliente buscarClientePorCodigo(int codigo);
    List<Cliente>busquedaPorParametros(String filtro);
    
}
