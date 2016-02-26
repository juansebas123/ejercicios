package arrobj;
 
import java.math.BigInteger;
 
public class userBanc {
    private int cod; 
    private BigInteger telefono;
    private String nombre, apellido;
    private Double saldo;
 
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }
 
    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }
 
    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }
 
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
 
    /**
     * @return the telefono
     */
    public BigInteger getTelefono() {
        return telefono;
    }
 
    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }
 
}