
# Final Programación Avanzada (USAL) Universidad del Salvador Nuestra Señora de Pilar
#### 06/12/2023
#### Valentin Villa 

## IMPORTANTE - Aclaración del Examen
El final tendrá una duración de 2 horas.

### Practica
Diseñe una API Rest que permita administrar el alquiler de vehículos básicos y camionetas 4 x 4 para 
turistas. Concéntrese en la disponibilidad de los productos para alquilar y no en la facturación. Es decir, la
API debe exponer la acción de alquilar los vehículos (Manejando el stock disponible en cada punto de
retiro) y conocer el estado de estos (Si están disponibles o alquilados).

Un turista puede alquilar un vehículo básico o camioneta 4 x 4 por vez en diferentes puntos de alquileres
teniendo en cuenta: Fecha de alquiler, fecha estimada de devolución y fecha de devolución, punto de
alquiler origen, punto alquiler destino. Puede agregar más atributos si 10 cree necesario. Todos los
vehículos poseen patente y km recorridos, los vehículos básicos poseen categorías (Hatchback, Sedan,
SUV) y las 4 x 4 poseen kg de torque.

Estos datos se encontrarán en un backend, el cual deberá de estar codificado con base de datos a
elección.
La API Rest, no consumirá directamente el backend, tendrá que hacerlo mediante un cliente SOAP.

### Utilizar todo 10 que considere necesario de 10 visto en la cursada y aplicar los patrones de diseños correspondientes. Los reportes que su modelo deberá satisfacer son los siguientes (utilizando HQL):
1. Retornar las devoluciones esperadas del día X en un determinado punto de alquiler. Patente e vehículo, Punto de devolución (Por ejemplo, aeropuerto, o ciudad X), DNI del turista, Fecha]Hora. (25)
2. Retomar los últimos 10 alquileres realizados por un DNI: Nombre del turista, patente, estado, fecha de alquiler, fecha estimada de devolución, fecha de devolución, tipo de vehículo. (25)
3. Retornar los vehículos disponibles para alquilar de un determinado punto de alquiler. Punto de alquiler, Tipo de vehículo, Patente, km recorridos. (20)
4. Retomar la cantidad de vehículos que se encuentran alquilados en el momento actual para el punto de alquiler X, retomando: Cantidad de vehículos básicos alquilados, cantidad de 4x4 alquilados.
5. Retornar un informe que se puede filtrar por tipo de vehículo y rango de fechas: Patente del vehículo, Tipo de Vehículo, Punto de alquiler, Fecha de alquiler, Punto de devolución, Fecha de devolución, DNI del turista. (10)
