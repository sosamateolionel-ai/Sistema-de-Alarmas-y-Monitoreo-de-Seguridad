import java.util.ArrayList;
import java.util.List;

public class CentralMonitoreo {

    private List<Alerta> incidentesActivos;

    public CentralMonitoreo() {
        this.incidentesActivos = new ArrayList<>();
    }

    public void procesarAlerta(Alerta alerta) {
        incidentesActivos.add(alerta);
        System.out.println("Central: alerta registrada -> " + alerta);
    }

    public void mostrarReporte() {

        System.out.println("\n=== Reporte de incidentes activos ===");

        if (incidentesActivos.isEmpty()) {
            System.out.println("No hay incidentes registrados.");
            return;
        }

        for (Alerta a : incidentesActivos) {
            System.out.println(a);
        }

        System.out.println("=== Fin del reporte (" + incidentesActivos.size() + " incidentes) ===\n");
    }
}