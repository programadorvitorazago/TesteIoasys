/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.testeioasys.repositorio;

import javax.persistence.EntityManager;
import local.testeioasys.repositorio.entidade.Filme;

/**
 *
 * @author Vitor
 */
public class RepositorioFilme extends RepositorioBase<Filme>{
    
    public RepositorioFilme()
    {
        super(Filme.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return ControladorAcesso.getGlobalEntityManager();
    }
}
