# Sistema de Monitoreo Perimetral

## Descripción

Este proyecto simula un sistema de monitoreo perimetral en el que diferentes sensores detectan movimientos y envían alertas a una central de monitoreo.

Cada alerta registra la zona donde ocurrió el movimiento, el tipo de sensor que lo detectó y la fecha y hora exacta del incidente.

## Funcionamiento

El sistema cuenta con una `CentralMonitoreo` y diferentes sensores perimetrales.

En el ejemplo se crean dos sensores:

* **Zona Norte** → Barrera Infrarroja.
* **Zona Sur** → Cámara de Movimiento.

Cuando un sensor detecta movimiento:

1. Muestra el evento en consola.
2. Crea un objeto `Alerta`.
3. La alerta registra la zona, el tipo de sensor y la fecha y hora.
4. El sensor envía la alerta a la `CentralMonitoreo`.
5. La central almacena la alerta en una lista de incidentes activos.

En el ejemplo, el sensor de la Zona Norte se activa dos veces, por lo que la central registra **tres incidentes en total**.

## Clase `SensorPerimetral`

Representa un sensor encargado de detectar movimientos en una determinada zona.

### Atributos

* `idZona`: identifica la zona donde se encuentra el sensor.
* `tipoSensor`: indica el tipo de sensor.
* `central`: referencia a la central de monitoreo.

La referencia a `CentralMonitoreo` permite que el sensor envíe las alertas directamente a la central.

### Constructor

```java id="h7kz4r"
public SensorPerimetral(String idZona, String tipoSensor, CentralMonitoreo central)
```

Recibe la zona, el tipo de sensor y la central de monitoreo asociada.

### `detectarMovimiento()`

Este método simula la detección de un movimiento.

Crea una nueva alerta:

```java id="6u9rqp"
Alerta alerta = new Alerta(idZona, tipoSensor);
```

Luego la envía a la central:

```java id="0x9v4a"
central.procesarAlerta(alerta);
```

## Clase `Alerta`

Representa un incidente detectado por un sensor.

### Atributos

* `idZona`: zona donde se produjo el movimiento.
* `tipoSensor`: sensor que detectó el movimiento.
* `marcaTemporal`: fecha y hora en la que se creó la alerta.

La marca temporal se obtiene utilizando:

```java id="x5n6ke"
LocalDateTime.now()
```

### `toString()`

Sobrescribe el método `toString()` para mostrar la información de la alerta de una manera clara:

```text id="a8g0x1"
[fecha y hora] Zona: Zona Norte - Sensor: Barrera Infrarroja
```

## Clase `CentralMonitoreo`

Representa la central encargada de recibir y almacenar las alertas.

### Atributo

```java id="o7q2zs"
private List<Alerta> incidentesActivos;
```

Utiliza una lista para almacenar todos los incidentes registrados.

### `procesarAlerta(Alerta alerta)`

Recibe una alerta enviada por un sensor y la agrega a la lista de incidentes activos.

### `mostrarReporte()`

Genera un reporte con todas las alertas almacenadas.

Si no existen incidentes, muestra:

```text id="kq2j7v"
No hay incidentes registrados.
```

En caso contrario, recorre la lista y muestra cada alerta.

## Ejemplo de funcionamiento

El programa realiza las siguientes detecciones:

```text id="2c7q8h"
Zona Norte → Barrera Infrarroja
Zona Sur → Cámara de Movimiento
Zona Norte → Barrera Infrarroja
```

La central registra las tres alertas y finalmente muestra un reporte:

```text id="0c7p4m"
=== Reporte de incidentes activos ===
[fecha y hora] Zona: Zona Norte - Sensor: Barrera Infrarroja
[fecha y hora] Zona: Zona Sur - Sensor: Cámara de Movimiento
[fecha y hora] Zona: Zona Norte - Sensor: Barrera Infrarroja
=== Fin del reporte (3 incidentes) ===
```

La fecha y hora exactas varían en cada ejecución.

## Relación entre las clases

La relación principal del sistema es:

```text id="3q2j8x"
SensorPerimetral
       │
       │ crea
       ▼
    Alerta
       │
       │ envía a
       ▼
CentralMonitoreo
       │
       │ almacena
       ▼
Lista de incidentes
```

`SensorPerimetral` mantiene una referencia a `CentralMonitoreo`, lo que representa una **asociación entre clases**.

## Conceptos utilizados

* Programación Orientada a Objetos.
* Clases y objetos.
* Constructores.
* Encapsulamiento.
* Atributos privados.
* Asociación entre clases.
* Referencias a objetos.
* `ArrayList`.
* Interfaz `List`.
* Bucle `for`.
* Condicionales `if`.
* `LocalDateTime`.
* Fecha y hora del sistema.
* Creación y almacenamiento de objetos.
* Sobrescritura de `toString()`.
* Comunicación entre objetos.

## Ejecución

<img width="1107" height="340" alt="image" src="https://github.com/user-attachments/assets/bb333fb6-b21b-4fc3-859e-6ab7ec4d168d" />
