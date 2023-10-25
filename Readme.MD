## Data Classes en Kotlin

En Kotlin, llamamos **Data Class** a un tipo de clase diseñada específicamente para almacenar datos de manera **concisa y eficiente**. Estas clases se utilizan comúnmente para representar objetos **simples** que contienen principalmente datos y no tienen lógica de negocio compleja. Las Data Classes son una característica distintiva de Kotlin y proporcionan varias funcionalidades incorporadas que simplifican la creación y el uso de clases de datos. Vienen marcadas con la palabra clave **'data'**.

### Ejemplo de una Data Class en Kotlin:

```kotlin
data class User(val name: String, val age: Int)
```

### Características principales de las Data Classes:

- **Métodos predefinidos**: Kotlin genera automáticamente varios métodos predefinidos en una Data Class, como `toString()`, `equals()`, `hashCode()`, y `copy()`. Estos métodos permiten una fácil representación en cadena, comparación y clonación de objetos de la clase.

- **Reducción de boilerplate**: El _boilerplate_ es un párrafo o sección de texto (en nuestro caso código) que se utiliza de forma recurrente en diferentes notas  significativa de código redundante **en comparación con Java**. Esto se debe a que Kotlin proporciona una sintaxis más concisa y genera automáticamente una serie de funciones comunes. Esta reducción del código redundante hace que el código sea más limpio y eficiente en comparación con la necesidad de escribir manualmente estas funciones en Java.

- **Desestructuración**: Las Data Classes permiten la desestructuración de objetos, lo que significa que puedes asignar fácilmente los valores de las propiedades de un objeto a variables individuales en una sola línea de código.

- **Igualdad estructural**: Las Data Classes comparan objetos por igualdad estructural en lugar de referencias de memoria. Dos objetos de Data Class con los mismos valores en sus propiedades se consideran iguales, incluso si no son la misma instancia.

## Ejemplo de dataclass:

```kotlin
fun main(args: Array<String>) {
    // Declaramos una data class
    data class Hombre(val nombre: String, val edad: Int) {
        // Propiedad declarada en el cuerpo de la clase
        var altura: Int = 0
    }

    val hombre1 = Hombre("Manuel", 18)

    // Copianmos los detalles de hombre1 con un cambio en el nombre
    val hombre2 = hombre1.copy(nombre = "Rafael")

    // Copianmos todos los detalles de hombre1 a hombre3
    val hombre3 = hombre1.copy()

    // Declaranmos las alturas de los hombres individuales
    hombre1.altura = 175
    hombre2.altura = 190
    hombre3.altura = 210

    // hombre1 y hombre3 tienen diferentes valores en el cuerpo de la clase,
    // pero los mismos valores en los parámetros

    // Imprimimos la información de los 3 hombres
    println("${hombre1} mide ${hombre1.altura} cm de altura")
    println("${hombre2} mide ${hombre2.altura} cm de altura")
    println("${hombre3} mide ${hombre3.altura} cm de altura")
}
```
OUTPUT:
```
    hombre(nombre=samuel, edad=22) mide 175 cm de altura.
    hombre(nombre=damian, edad=20) mide 190 cm de altura.
    hombre(nombre=paco, edad=18) mide 210 cm de altura.
```

### Fuentes de información

- [Kotlinlang] (https://kotlinlang.org/docs/data-classes.html)


- [DevExpert] (https://devexpert.io/data-classes-kotlin/)

- [Baeldung] (https://www.baeldung.com/kotlin/data-classes)

- [Geeksforgeeks] (https://www.geeksforgeeks.org/kotlin-data-classes/)