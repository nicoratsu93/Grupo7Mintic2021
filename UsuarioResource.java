/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restful.resource;

import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import restful.model.UsuarioModel;

/**
 *
 * @author SENA
 */
@Path("usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {

    UsuarioService servicio = new UsuarioService();

    @GET
    public ArrayList<UsuarioModel> getUsuario() {

        return servicio.getUsuario();
    }

    @Path("/{numero_ident}")
    @GET
    public UsuarioModel getCliente(@PathParam("numero_ident") int id) {

        return servicio.getUsuario(id);
    }

    @POST
    public UsuarioModel addUsuario(String JSON) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        UsuarioModel usuario = gson.fromJson(JSON, UsuarioModel.class);
        return servicio.addUsuario(usuario);
    }

    @DELETE
    @Path("/{numero_ident}")
    public String delUsuario(@PathParam("numero_ident") int id) {

        return servicio.delUsuario(id);

    }

    @PUT
    public UsuarioModel updateUsuario(String JSON) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        UsuarioModel usuario = gson.fromJson(JSON, UsuarioModel.class);
        return servicio.updateUsuario(usuario);
    }

}
