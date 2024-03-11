public class Barco extends Vehiculo {
    private boolean casco;
    private boolean velas;

    // Constructor
    public Barco(String matricula, int anyo) {
        super(matricula, anyo);
        this.casco = true;  // Inicialmente en buen estado
        this.velas = true;  // Inicialmente en buen estado
    }

    // Getter y Setter para casco
    public boolean getCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    // Getter y Setter para velas
    public boolean getVelas() {
        return velas;
    }

    public void setVelas(boolean velas) {
        this.velas = velas;
    }

    // Método para pasar la revisión de un barco
    @Override
    public boolean pasaRevision() {
        return casco && velas;
    }
    @Override
    public String toString() {
        return "Barco [Matrícula: " + getMatricula() + ", Año: " + getAnyo() +
                ", Casco: " +  ((casco)? "bien":"mal") +
                ", Velas: " + ((velas)? "bien":"mal") + "]";
    }
}