import java.time.LocalDateTime;

public class Alerta {

    private String idZona;
    private String tipoSensor;
    private LocalDateTime marcaTemporal;

    public Alerta(String idZona, String tipoSensor) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.marcaTemporal = LocalDateTime.now(); // se registra el momento exacto de la alerta
    }

    public String getIdZona() {
        return idZona;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public LocalDateTime getMarcaTemporal() {
        return marcaTemporal;
    }

    @Override
    public String toString() {
        return "[" + marcaTemporal + "] Zona: " + idZona + " - Sensor: " + tipoSensor;
    }
}