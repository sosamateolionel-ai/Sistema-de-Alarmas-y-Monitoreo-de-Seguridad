public class SensorPerimetral {

    private String idZona;
    private String tipoSensor;
    private CentralMonitoreo central; // asociación: referencia a la central

    public SensorPerimetral(String idZona, String tipoSensor, CentralMonitoreo central) {
        this.idZona = idZona;
        this.tipoSensor = tipoSensor;
        this.central = central;
    }

    public void detectarMovimiento() {

        System.out.println(tipoSensor + " en zona " + idZona + " detectó movimiento.");

        Alerta alerta = new Alerta(idZona, tipoSensor);

        central.procesarAlerta(alerta);
    }
}