public class Coche extends Vehiculo {
    private EstadoGeneral estadoGeneral;

    // Constructor
    public Coche(String matricula, int anyo, EstadoGeneral estadoGeneral) {
        super(matricula, anyo);
        this.estadoGeneral = estadoGeneral;
    }

    // Getter y Setter para estadoGeneral
    public EstadoGeneral getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(EstadoGeneral estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    // Método para pasar la revisión de un coche
    @Override
    public boolean pasaRevision() {
        return estadoGeneral == EstadoGeneral.NUEVO || estadoGeneral == EstadoGeneral.PASABLE;
    }
    @Override
    public String toString() {
        return "Coche [Matrícula: " + getMatricula() + ", Año: " + getAnyo() +
                ", Estado General: " + estadoGeneral + "]";
    }
}

