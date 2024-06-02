<div align="center">


# Codificador de Contraseñas a Imágenes y Decodificador Inverso

Este proyecto ofrece una herramienta para convertir contraseñas en imágenes y viceversa, proporcionando una capa adicional de seguridad a través de la codificación visual. El proceso de codificación garantiza que las contraseñas sean difíciles de interceptar y decodificar, mientras que la decodificación inversa permite a los usuarios recuperar sus contraseñas originales a partir de imágenes previamente generadas.

## Funcionalidades clave:

- **Codificación de Contraseña a Imagen:** Convierte una contraseña ingresada en una serie de imágenes que representan cada caracter de la contraseña.
- **Decodificación de Imagen a Contraseña:** Recupera la contraseña original a partir de una serie de imágenes previamente generadas.
- **Seguridad Adicional:** Añade una capa de seguridad a las contraseñas mediante la codificación visual, dificultando el acceso no autorizado a las mismas.


## Objetivo del Proyecto

La idea es bastante simple: convertir un **String** a caracteres y luego transformarlos en imágenes. Estas imágenes tendrán un alto de `3px` y un ancho de `6px`. Si hacemos un cálculo rápido, obtenemos que el área es:

### 3 x 6 = 18

Para determinar las probabilidades de que cada píxel sea blanco o negro, debemos hacer el cálculo de las posibles combinaciones `2` elevado a la cantidad de píxeles en el área `18`.

### 2^18 = 262,144

Según Unicode, existen **149,186** caracteres posibles.

Esto nos deja con:

### 112,958 posibilidades restantes

Estas posibilidades pueden usarse para actualizaciones de caracteres o para firmas entre cada carácter, manteniendo así una seguridad robusta y fiable en la contraseña, dando la sensación de que cada `imagen` tiene un orden aleatorio o que no tiene sentido. Incluso se podría mejorar más la seguridad con otras lógicas de encriptado, siguiendo la misma lógica aplicada en este proyecto, agregando más colores `(probabilidades)` a cada píxel.

## funcionalidad de la Imagen

La imagen tendrá un comportamiento binario y se verá algo así, donde:

>`1` representa el color blanco

>`0` representa el color negro

<div style="margin: 0 auto; width: fit-content;">

| 1 | 0 | 1 | 0 | 1 | 1 |
|---|---|---|---|---|---|
| 1 | 0 | 0 | 0 | 1 | 1 |
| 0 | 0 | 0 | 1 | 0 | 0 |

</div>

Imaginemos que esta sería la representación del caracter "a".

Por lo tanto, la contraseña no estaría ligada a caracteres, sino a imágenes "codificadas".

---
para ejemplificar de una mejor manera, imaginemos que nuestra contraseña es `AHola123`

### A
<div style="margin: 0 auto; width: fit-content;">

| 0 | 1 | 1 | 0 | 1 | 0 |
|---|---|---|---|---|---|
| 1 | 0 | 1 | 1 | 0 | 0 |
| 1 | 1 | 0 | 0 | 1 | 0 |

</div>

### h
<div style="margin: 0 auto; width: fit-content;">

| 1 | 1 | 0 | 1 | 0 | 0 |
|---|---|---|---|---|---|
| 0 | 0 | 1 | 0 | 1 | 1 |
| 1 | 0 | 0 | 1 | 1 | 0 |

</div>

### o
<div style="margin: 0 auto; width: fit-content;">

| 0 | 1 | 1 | 0 | 0 | 1 |
|---|---|---|---|---|---|
| 1 | 0 | 0 | 1 | 0 | 1 |
| 0 | 0 | 1 | 1 | 1 | 0 |

</div>

### l
<div style="margin: 0 auto; width: fit-content;">

| 1 | 0 | 0 | 1 | 1 | 0 |
|---|---|---|---|---|---|
| 0 | 1 | 0 | 1 | 0 | 1 |
| 1 | 1 | 0 | 0 | 0 | 1 |

</div>

### a
<div style="margin: 0 auto; width: fit-content;">

| 1 | 0 | 1 | 0 | 1 | 1 |
|---|---|---|---|---|---|
| 1 | 0 | 0 | 0 | 1 | 1 |
| 0 | 0 | 0 | 1 | 0 | 0 |

</div>

### 1
<div style="margin: 0 auto; width: fit-content;">

| 0 | 0 | 1 | 1 | 0 | 0 |
|---|---|---|---|---|---|
| 1 | 1 | 0 | 0 | 1 | 0 |
| 0 | 1 | 1 | 0 | 1 | 1 |

</div>

### 2
<div style="margin: 0 auto; width: fit-content;">

| 1 | 1 | 0 | 1 | 0 | 1 |
|---|---|---|---|---|---|
| 0 | 0 | 1 | 1 | 0 | 1 |
| 1 | 0 | 1 | 0 | 1 | 0 |

</div>

### 3
<div style="margin: 0 auto; width: fit-content;">

| 0 | 1 | 0 | 1 | 1 | 0 |
|---|---|---|---|---|---|
| 1 | 0 | 1 | 0 | 1 | 1 |
| 0 | 0 | 1 | 0 | 0 | 1 |

</div>

## Cómo Utilizar:

1. Clona el repositorio a tu máquina local.
2. Ejecuta la aplicación y sigue las instrucciones para codificar tu contraseña a imágenes.
3. Para decodificar una imagen a una contraseña, sigue las instrucciones proporcionadas en la aplicación.

¡Disfruta de una manera innovadora y segura de gestionar tus contraseñas!
---

</div>