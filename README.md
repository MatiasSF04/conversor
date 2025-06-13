# Conversor de Monedas en Java

Este proyecto es una aplicación de consola escrita en Java que permite convertir entre distintas monedas utilizando la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## Funcionalidades

- Selección de pares de monedas desde un menú interactivo
- Ingreso del monto a convertir
- Consulta del valor actualizado usando una API externa
- Visualización clara del resultado

---

## Tecnologías

- Java 17+
- HTTP Client (Java nativo)
- GSON (para parsear JSON)
- API de ExchangeRate

---

## Estructura del proyecto

conversor/
├── src/
│ ├── Main.java
│ ├── Seleccion.java
│ ├── Consultas.java
│ └── Intercambios.java
├── conversor.iml
└── README.md


---

## Ejemplo de uso

```bash
******************************************
  Bienvenid@ a Nuestro Conversor de Monedas:
  
  1) Dólar Americano => Peso Argentino
  2) Peso Argentino => Dólar Americano
  3) Dólar Americano => Real Brasileño
  4) Real Brasileño => Dólar Americano
  5) Dólar Americano => Peso Chileno
  6) Peso Chileno => Dólar Americano
  7) Salir
  
  Elija una opción válida:
******************************************
4
Por favor ingresa el valor que deseas convertir:
450
El valor 450.00 [BRL] corresponde al valor final de =>>> 0.00 [USD]



Requisitos

Java 17 o superior
Clave API gratuita de ExchangeRate-API
Configuración

Clona el repositorio:
git clone https://github.com/tu-usuario/conversor.git
Agrega tu clave API en el archivo Consultas.java:
URI direccion = URI.create("https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/" + codigoBase + "/" + codigoDestino + "/" + monto);
Compila y ejecuta el programa:
javac *.java
java Main

---
