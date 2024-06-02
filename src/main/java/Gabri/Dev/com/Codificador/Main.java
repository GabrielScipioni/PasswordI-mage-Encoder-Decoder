package Gabri.Dev.com.Codificador;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese una contraseña
        System.out.println("Por favor ingrese una contraseña:");
        String contraseñaOriginal = scanner.nextLine();

        // Convierte la contraseña en una imagen combinada
        Contraseña contraseña = new Contraseña(contraseñaOriginal);
        ContraseñaImagenConstructor builder = new ContraseñaImagenConstructor();
        ContraseñaImagen contraseñaImagen = builder.build(contraseña);

        ImagenCombinadaConstructor imagenCombinadaBuilder = new ImagenCombinadaConstructor();
        ImagenCombinada imagenCombinada = imagenCombinadaBuilder.build(contraseñaImagen);
        imagenCombinada.crearImagenCombinada();

        // Abre la imagen combinada utilizando el programa predeterminado del sistema
        abrirImagen(contraseñaOriginal);

        // Imprime un mensaje indicando que la imagen combinada ha sido creada exitosamente
        System.out.println("Imagen combinada creada con el nombre: " + contraseñaOriginal + ".png en la carpeta PasswordIMG");

    }
    /**
     * Abre la imagen combinada con el nombre especificado utilizando el programa predeterminado del sistema.
     * @param nombreArchivo El nombre del archivo de la imagen combinada.
     */
    public static void abrirImagen(String nombreArchivo) {
        try {
            File archivoImagen = new File("PasswordIMG/" + nombreArchivo + ".png");
            Desktop.getDesktop().open(archivoImagen);
        } catch (IOException e) {
            System.out.println("No se pudo abrir la imagen: " + e.getMessage());
        }
    }
}
