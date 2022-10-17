
package herencia;

/**
 *
 * @author dilan
 */
public class Persona {
    
      int id;
      String cedula;
      String nombre;
      String Apellido;
      String telefono;
      String domicilio;



    public Persona(){
    
    }
     public Persona(int id, String cedula, String nombre, String Apellido, String telefono, String domicilio) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
   
    
    

}
