
package herencia;

/**
 *
 * @author dilan
 */
public class Consultor extends Persona {
    
    String nombre_consultora;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(String nombre_consultora, int num_consultor, int id, String cedula, String nombre, String Apellido, String telefono, String domicilio) {
        super(id, cedula, nombre, Apellido, telefono, domicilio);
        this.nombre_consultora = nombre_consultora;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    
}
