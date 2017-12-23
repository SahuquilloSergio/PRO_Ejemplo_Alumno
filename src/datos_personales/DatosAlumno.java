package datos_personales;
/**
 *
 * @author abrandarizdominguez
 */
public class DatosAlumno {
    
    String nombre;
    public String telefono;
    // Constructor por defecto:
    public DatosAlumno(){
        
    }
    // Constructor por parámetros:
    public DatosAlumno(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    // SETTERS Y GETTERS:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    // Método 'toString':
    @Override
    public String toString() {
        return "DatosAlumno{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
}
