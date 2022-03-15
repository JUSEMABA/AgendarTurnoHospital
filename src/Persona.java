
public class Persona {
    private String documento;
    private String nombre;
    private String hora;
    private int tur;
    private Persona siguiente;

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the tur
     */
    public int getTur() {
        return tur;
    }

    /**
     * @param tur the tur to set
     */
    public void setTur(int tur) {
        this.tur = tur;
    }

    /**
     * @return the siguiente
     */
    public Persona getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
    }
    
}
    
    

