## 🧠 Evaluación – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Joao Aranda
- **Sección:** Desarrollo Orientado a Objetos I
- **Carrera:** Analista Programador
- **Sede:** Online

---

## 📘 Descripción general del sistema
LlanquihueTourApp es una aplicación desarrollada en Java que simula la gestión de servicios turísticos ofrecidos por una agencia de turismo de la comuna de Llanquihue, Región de Los Lagos.

El sistema aplica los principios de la Programación Orientada a Objetos (POO), utilizando herencia para modelar distintos tipos de servicios turísticos que comparten características comunes, como el nombre y la duración, y que además poseen atributos específicos según su categoría.

La aplicación incluye una superclase llamada ServicioTuristico y tres subclases: RutaGastronomica, PaseoLacustre y ExcursionCultural. A través de una clase gestora se crean instancias de cada servicio y, desde la clase principal, se muestran sus datos por consola utilizando el método toString() sobrescrito en cada subclase.

Este proyecto tiene como objetivo demostrar el uso de conceptos fundamentales de Java, como encapsulamiento, herencia, constructores, sobrescritura de métodos, organización por paquetes y reutilización de código mediante una estructura orientada a objetos.

---

## 🧱 Estructura general del proyecto

```plaintext
LlanquihueTourApp
│
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java
````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
https://github.com/joao2730/LlanquihueTourApp.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que los archivos estén correctamente ubicados.

4. Ejecuta el archivo `Main.java` desde el paquete `ui`.

5. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).
