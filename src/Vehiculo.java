public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String matricula;
    private int anyo;
    private static int totalVehiculos = 0;

    // Constructor
    public Vehiculo(String matricula, int anyo) {
        this.matricula = matricula;
        this.anyo = anyo;
        totalVehiculos++;
    }

    // Getter y Setter para matricula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter y Setter para anyo
    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    // Getter para totalVehiculos
    public static int getTotalVehiculos() {
        return totalVehiculos;
    }

    // Método abstracto para pasar la revisión
    public abstract boolean pasaRevision();

    // Método compareTo para ordenar por anyo
    @Override
    public int compareTo(Vehiculo otroVehiculo) {
        return Integer.compare(this.anyo, otroVehiculo.anyo);
    }


    // Método equals para comparar por matricula
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) obj;
        return matricula.equals(vehiculo.matricula);
    }

}
