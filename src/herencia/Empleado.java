/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author dilan
 */
public class Empleado  extends Persona{
    
    int num_legado;
    String Cargo;
    double sueldo;

    public Empleado() {
    }

    public Empleado(int num_legado, String Cargo, double sueldo, int id, String cedula, String nombre, String Apellido, String telefono, String domicilio) {
        super(id, cedula, nombre, Apellido, telefono, domicilio);
        this.num_legado = num_legado;
        this.Cargo = Cargo;
        this.sueldo = sueldo;
    }

    public int getNum_legado() {
        return num_legado;
    }

    public void setNum_legado(int num_legado) {
        this.num_legado = num_legado;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
