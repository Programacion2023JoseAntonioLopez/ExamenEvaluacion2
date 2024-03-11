import java.util.Arrays;

public class MainEjemplo {
    public static void main(String[] args) {
        // Crear dos barcos y un coche
        Barco barco1 = new Barco("BAR123", 2020);
        Barco barco2 = new Barco("BAR456", 2018);
        barco2.setVelas(false);
        Coche coche1 = new Coche("COC789", 2019, EstadoGeneral.PASABLE);

        // Guardar los vehículos en un array
        Vehiculo[] vehiculos = {barco1, barco2, coche1};

        // Ordenar el array por año
        Arrays.sort(vehiculos);

        // Recorrer el array y mostrar la información de cada vehículo
        System.out.println("Vehículos ordenados por año:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo +
                    ", Pasa revisión: " +
                    (vehiculo.pasaRevision()?"Si":"No"));
        }

        // Mostrar el total de vehículos creados hasta el momento
        //es un método static
        System.out.println("Total de vehículos creados: " + Vehiculo.getTotalVehiculos());
    }
}
