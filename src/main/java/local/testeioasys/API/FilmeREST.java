/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.testeioasys.API;

import com.google.gson.Gson;
import java.util.Date;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import local.testeioasys.Auxiliar.StringHelper;
import local.testeioasys.Auxiliar.VotoFilme;
import local.testeioasys.repositorio.*;
import local.testeioasys.repositorio.entidade.Filme;
import local.testeioasys.repositorio.entidade.Ranking;
import local.testeioasys.repositorio.entidade.Usuario;

/**
 *
 * @author Vitor
 */
@Stateless
@Path("/filme")
public class FilmeREST extends APIBase {
    
    // Repositorio
    private RepositorioFilme repFilme = new RepositorioFilme();
    private RepositorioUsuario repUsuario = new RepositorioUsuario();
    private RepositorioRanking repRanking = new RepositorioRanking();
    
    // CADASTRO
    @POST
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response insert(String entidadeJson) {
        try
        {
            if(!StringHelper.isNullOrEmpty(entidadeJson))
            {
                
                Filme entidade = repFilme.fromJson(entidadeJson);

                this.repFilme.INSERT(entidade);

                return super.CreateOK();
            }
            else
            {
                throw new Exception("String vazia");
            }
        }
        catch(Exception ex)
        {
            return super.ServerError(ex);
        }
    }
    
    // GET
    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public Response getById(@PathParam("id") Integer id) {
        try
        {
            Filme entidade = repFilme.GET(id);

            return super.CreateOK(entidade);
        }
        catch(Exception ex)
        {
            return super.ServerError(ex);
        }
    }
    
    // VOTO
    @POST
    @Path("/voto")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    public Response voto(String entidadeJson) {
        try
        {
            Gson parser = new Gson();
            VotoFilme voto = parser.fromJson(entidadeJson, VotoFilme.class);
            
            Filme filme = this.repFilme.GET(voto.getID_Filme());
            Usuario usuario = this.repUsuario.GET(voto.getID_Usuario());
            
            if(!usuario.isUsuario())
            {
                throw new Exception("Votação não permitido para administradores");
            }
            
            if(voto.getNota() < 0 || voto.getNota() > 4)
            {
                throw new Exception("A nota deve estar entre 0 e 4");
            }
            
            Ranking ranking = new Ranking();
            ranking.setIdFilme(filme.getId());
            ranking.setIdUsuario(usuario.getId());
            ranking.setNota(voto.getNota());
            ranking.setDatahora(new Date());
            
            this.repRanking.INSERT(ranking);
            
            return ResponseOK();
        }
        catch(Exception ex)
        {
            return super.ServerError(ex);
        }
    }
}
