
# Weather API - Spring Boot Project

## Descripción

Este proyecto es una API REST desarrollada con Spring Boot que consulta datos meteorológicos de la API de [OpenWeatherMap](https://openweathermap.org/). La API acepta coordenadas (latitud y longitud) y devuelve información sobre la temperatura y la humedad.

## Prerrequisitos

Debes tener las siguientes herramientas instaladas y configuradas en tu sistema:

1. **Java 17**
   ```bash
   java -version
   ```
   La salida debería ser algo similar a:
   ```bash
   java version "17.0.1"
   Java(TM) SE Runtime Environment (build 17.0.1+12-LTS-39)
   Java HotSpot(TM) 64-Bit Server VM (build 17.0.1+12-LTS-39, mixed mode, sharing)
   ```

2. **Gradle 8.x**
    - Verifica que Gradle esté instalado ejecutando:
   ```bash
   gradle -v
   ```

   La salida debería ser algo como:
   ```bash
   Gradle 8.10.2
   ```

3. **Git**
    - Instala Git y verifica la instalación:
   ```bash
   git --version
   ```

   La salida debería ser algo como:
   ```bash
   git version 2.34.1
   ```

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/alexandrac1420/weather-api-springboot.git
   cd weather-api-springboot
   ```

2. Si no tienes el **Gradle Wrapper** configurado, generarlo:
   ```bash
   gradle wrapper
   ```

3. Para construir y ejecutar la aplicación:
   ```bash
   ./gradlew bootRun
   ```

   Si estás en Windows:
   ```bash
   gradle bootRun
   ```


## Ejecución de pruebas

El proyecto incluye pruebas unitarias para validar el correcto funcionamiento del servicio. Las pruebas utilizan **JUnit 5** y **Mockito** para simular respuestas de la API.

Para ejecutar las pruebas, usa el siguiente comando:

### En Windows:
```bash
gradle test
```

### En Linux/Mac:
```bash
./gradlew test
```

Al finalizar, se generará un reporte con los resultados en `build/reports/tests/test/index.html`.

## Componentes principales:

1. **Controlador (WeatherReportController)**: Maneja las solicitudes HTTP `GET` y delega la lógica de negocio al servicio.
2. **Servicio (WeatherReportService)**: Se encarga de hacer las solicitudes a la API de OpenWeatherMap y procesar las respuestas.
3. **Cliente HTTP (RestTemplate)**: Utilizado por el servicio para hacer las solicitudes a la API externa.

## Reporte de Pruebas

Se realizaron las siguientes pruebas para verificar el correcto funcionamiento de la aplicación:

1. **Prueba de `getWeatherReport` en el servicio**:
    - **Descripción**: Verifica que el servicio procesa correctamente las coordenadas y devuelve los datos del clima.
    - **Resultado esperado**: El valor de la temperatura y humedad devueltos por el servicio debe ser acorde a los valores simulados por Mockito.

2. **Prueba del controlador `WeatherReportController`**:
    - **Descripción**: Verifica que el controlador llama correctamente al servicio cuando recibe una solicitud con latitud y longitud.
    - **Resultado esperado**: El controlador debe retornar una respuesta JSON con los valores de temperatura y humedad.

![image](https://github.com/user-attachments/assets/7588c3c5-5f4f-42e3-9425-13f281a40d27)

## Autores

* **Alexandra Cortes Tovar** - [GitHub](https://github.com/alexandrac1420)

