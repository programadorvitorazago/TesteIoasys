/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.testeioasys.repositorio;

import javax.persistence.EntityManager;
import local.testeioasys.repositorio.entidade.Filme;
import local.testeioasys.repositorio.entidade.Usuario;

/**
 *
 * @author Vitor
 */
public class RepositorioUsuario extends RepositorioBase<Usuario>{
    
    public RepositorioUsuario()
    {
        super(Usuario.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return ControladorAcesso.getGlobalEntityManager();
    }
}
