/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.portillo.dao;

import java.util.List;
import py.edu.facitec.portillo.model.Cliente;

/**
 *
 * @author Cristina
 */
public interface ClienteDao {
    void guardar(Cliente cliente);
    boolean modificar(Cliente cliente);
    Cliente buscarClientePorCodigo(int codigo);
    List<Cliente>buscarClientePorParametros(String filtro);
    
}
