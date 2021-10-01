
package restful.model;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioModel {
    private String numero_ident;
    private String tipo_ident;
    private String primer_nomb;
    private String segundo_nomb;
    private String primer_ape;
    private String segundo_ape;
    private String ciudad_res;
    private String pais_res;
    private String direccion;
    private String pais_naci;
    private String fecha_naci;
    private String edad;
    private String sexo;
    private String tel;
    private String cel;
    private String correo_ele;
    
    

    public UsuarioModel(String numero_ident, String tipo_ident, String primer_nomb, String segundo_nomb, String primer_ape, String segundo_ape, String ciudad_res, String pais_res, String direccion, String pais_naci, String fecha_naci, String edad, String sexo, String tel, String cel, String correo_ele) {
        this.numero_ident = numero_ident;
        this.tipo_ident = tipo_ident;
        this.primer_nomb = primer_nomb;
        this.segundo_nomb = segundo_nomb;
        this.primer_ape = primer_ape;
        this.segundo_ape = segundo_ape;
        this.ciudad_res = ciudad_res;
        this.pais_res = pais_res;
        this.direccion = direccion;
        this.pais_naci = pais_naci;
        this.fecha_naci = fecha_naci;
        this.edad = edad;
        this.sexo = sexo;
        this.tel = tel;
        this.cel = cel;
        this.correo_ele = correo_ele;
    }

    public String getNumero_ident() {
        return numero_ident;
    }

    public void setNumero_ident(String numero_ident) {
        this.numero_ident = numero_ident;
    }

    public String getTipo_ident() {
        return tipo_ident;
    }

    public void setTipo_ident(String tipo_ident) {
        this.tipo_ident = tipo_ident;
    }

    public String getPrimer_nomb() {
        return primer_nomb;
    }

    public void setPrimer_nomb(String primer_nomb) {
        this.primer_nomb = primer_nomb;
    }

    public String getSegundo_nomb() {
        return segundo_nomb;
    }

    public void setSegundo_nomb(String segundo_nomb) {
        this.segundo_nomb = segundo_nomb;
    }

    public String getPrimer_ape() {
        return primer_ape;
    }

    public void setPrimer_ape(String primer_ape) {
        this.primer_ape = primer_ape;
    }

    public String getSegundo_ape() {
        return segundo_ape;
    }

    public void setSegundo_ape(String segundo_ape) {
        this.segundo_ape = segundo_ape;
    }

    public String getCiudad_res() {
        return ciudad_res;
    }

    public void setCiudad_res(String ciudad_res) {
        this.ciudad_res = ciudad_res;
    }

    public String getPais_res() {
        return pais_res;
    }

    public void setPais_res(String pais_res) {
        this.pais_res = pais_res;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais_naci() {
        return pais_naci;
    }

    public void setPais_naci(String pais_naci) {
        this.pais_naci = pais_naci;
    }

    public String getFecha_naci() {
        return fecha_naci;
    }

    public void setFecha_naci(String fecha_naci) {
        this.fecha_naci = fecha_naci;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCorreo_ele() {
        return correo_ele;
    }

    public void setCorreo_ele(String correo_ele) {
        this.correo_ele = correo_ele;
    }
    
}
   