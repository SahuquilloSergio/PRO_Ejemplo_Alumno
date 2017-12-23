package datos_academicos;
/**
 *
 * @author abrandarizdominguez
 */
public class NotasAlumno {
    
    private String nombre;
    private float nota;
    // Constructor por defecto:
    public NotasAlumno(){
        
    }
    // Constructor por parámetros:
    public NotasAlumno(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    // SETTERS Y GETTERS:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }
    // Método 'toString':
    @Override
    public String toString() {
        return "NotasAlumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
