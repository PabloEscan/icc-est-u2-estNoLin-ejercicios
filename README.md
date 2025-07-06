# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```

3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---

## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`  
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.

**Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`  
**Output esperado:**

```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`  
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

**Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`  
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

**Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`  
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

---

## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.  
* Cada carpeta debe contener:  
  * Código fuente Java.  
  * Casos de prueba.  
  * Comentarios claros.  
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```  
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.  
* No se incluye este README explicativo.  
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |

---

## 🧠 Análisis del Código Desarrollado

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Se desarrolló la clase `InsertBST` con el método `insert(Node root, int value)` para insertar elementos en un Árbol Binario de Búsqueda (BST).  
El algoritmo utiliza recursión para recorrer el árbol:

- Si el nodo actual es `null`, se crea un nuevo nodo con el valor.
- Si el valor es menor que el nodo actual, se inserta en el subárbol izquierdo.
- Si es mayor, se inserta en el subárbol derecho.

Este proceso asegura que el árbol mantenga la propiedad de BST, donde todos los valores a la izquierda de un nodo son menores, y a la derecha son mayores. No se permite insertar valores duplicados.

---

### Ejercicio 02: Invertir un Árbol Binario

Se implementó la clase `InvertBinaryTree` con el método `invertTree(Node root)` para invertir un árbol binario, también conocido como reflejo o espejo del árbol original.  
El algoritmo recorre el árbol de manera recursiva e intercambia los nodos izquierdo y derecho en cada nivel.

Pasos clave:  
1. Si el nodo actual es `null`, se retorna `null` (caso base).  
2. Se intercambian los nodos izquierdo y derecho usando una variable temporal.  
3. Se repite el proceso de inversión recursivamente en ambos subárboles.

Este enfoque garantiza que todo el árbol se invierta desde la raíz hasta las hojas, manteniendo la estructura pero reflejada horizontalmente.

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

En este ejercicio se desarrolló la clase `ListLevels` con el método `listLevels(Node root)`, que recorre un árbol binario por niveles (BFS) y devuelve una lista de listas enlazadas, donde cada sublista representa los nodos presentes en un nivel del árbol.

Pasos clave del algoritmo:  
1. Se utiliza una **cola (`Queue`)** para realizar el recorrido por niveles.  
2. En cada iteración del bucle, se procesa un nivel completo midiendo el tamaño actual de la cola.  
3. Se guarda una lista con los nodos del nivel actual.  
4. Al final, se agregan las listas de cada nivel al resultado.

Este método permite representar visualmente el árbol por niveles y se puede usar para mostrarlo así:
```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Se desarrolló la clase `Depth` con el método `maxDepth(Node root)` para calcular la **profundidad máxima** de un árbol binario.  
El objetivo es determinar la longitud del camino más largo desde la raíz hasta una hoja.

Funcionamiento del algoritmo:  
1. Si el nodo es `null`, se retorna `0` como caso base.  
2. Se llama recursivamente al subárbol izquierdo y al derecho.  
3. Se calcula cuál de los dos tiene mayor profundidad.  
4. Se suma `1` por el nodo actual.

Este método garantiza encontrar la profundidad más larga, es decir, el número máximo de niveles en el árbol.

---

## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

---

## Autores

- [PABLO TORRES] - Desarrollo inicial
- [PABLO ESCANDON] - Estudiante 