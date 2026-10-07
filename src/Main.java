//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    CentralMonitoreo central = new CentralMonitoreo();

    SensorPerimetral sensorNorte = new SensorPerimetral("Zona Norte", "Barrera Infrarroja", central);
    SensorPerimetral sensorSur = new SensorPerimetral("Zona Sur", "Cámara de Movimiento", central);

    sensorNorte.detectarMovimiento();
    sensorSur.detectarMovimiento();
    sensorNorte.detectarMovimiento(); // segunda activación en la misma zona

    central.mostrarReporte();

}
