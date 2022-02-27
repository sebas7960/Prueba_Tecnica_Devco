# Prueba DevCO

### _Contexto entrega_

Prueba tecnica sobre pruebas automatizadas al aplicativo web Booking.com

**Criterios de evaluación:**
- Uso del framework de automatización.
- Uso de Screenplay.
- Legibilidad de los escenarios de pruebas.
- Diseño de casos de pruebas y testing de aplicaciones de negocio.
- Diseño de casos de pruebas automatizados basados en la pirámide de testing.


### _Información del proyecto_

El proyecto fue construido con Java 8, gradle, serenity, cucumber, junit y para el navegador Google Chrome.

**A tener presente:** Dicha aplicacion web, posee sistema de reconocimiento de idioma, para la realizacion del proyecto se utilizo sistema operativo con idioma principal en ingles.

### _Requisitos de ejecución_

Para poder ejecutar el proyecto se requiere:
- tener instalado Java 8.
- tener instalado Gradle (preferencia version 6.8)

### _Modo de ejecución_

La ejecución se puede realizar desde algun IDE (Intellij, Eclipse) o línea de comandos:

- Ejecución total (mauales y automáticos): gradle clean test aggregate
- Ejecución por escenario: gradle test --tests "NombreRunner"


### _Creditos_
> `Autor:` Sebastian Arbelaez