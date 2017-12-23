package datos_academicos;
/**
 *
 * @author abrandarizdominguez
 */
public class BoletinNotas {
    
    // Método 'mostrarNotas':
    public void mostrarNotas(){
        NotasAlumno notas1 = new NotasAlumno();
        System.out.println("Nombre: "+notas1.getNombre());
        System.out.println("Notas: "+notas1.getNota());
    }
}
