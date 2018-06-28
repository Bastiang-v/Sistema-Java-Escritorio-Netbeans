
package BGBLL;

/**
 *
 * @author Bastian
 */
public class BGUsuario {
    int id_usuario;
    String nombre;
    String apellido;
    int edad;
    String run;
    String dv;
    int estado;

    public BGUsuario() {
    }

    public BGUsuario(int id_usuario, String nombre, String apellido, int edad, String run, String dv, int estado) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.run = run;
        this.dv = dv;
        this.estado = estado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "BGUsuario{" + "id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", run=" + run + ", dv=" + dv + ", estado=" + estado + '}';
    }
    
    
        
}
