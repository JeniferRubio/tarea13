package tarea13;

public class Persona
{
    private String nombres;
    private String apellidos;
    private int dni;
    private int edad;

    Persona(String nombres,String apellidos,int dni, int edad)
    {
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;
    }

    public String getNombres()
    {
        return nombres;
    }
    public String getApellidos()
    {
        return apellidos;
    }
    public int getDni()
    {
        return dni;
    }
    public int getEdad()
    {
        return edad;
    }
}