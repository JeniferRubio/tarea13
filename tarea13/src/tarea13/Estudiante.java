package tarea13;

public class Estudiante extends Persona 
{
    private int codigoAlumno;
    private String carrera;
    private String universidad;

    Estudiante(String nombres,String apellidos,int dni, int edad, int codigoAlumno,String carrera,String universidad)
    {
        super(nombres, apellidos, dni, edad);

        this.codigoAlumno=codigoAlumno;
        this.carrera=carrera;
        this.universidad=universidad;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Nombres: "+getNombres()+ 
                            "\nApellido: "+getApellidos()+ 
                            "\nDni: "+getDni()+ 
                            "\nEdad: "+getEdad()+
                            "\nCodigo de Alumno: " +codigoAlumno+
                            "\nCarrera: "+carrera+
                            "\nUniversidad: "+universidad);
    }
}
