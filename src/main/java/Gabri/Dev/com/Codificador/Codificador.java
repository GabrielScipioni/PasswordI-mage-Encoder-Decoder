package Gabri.Dev.com.Codificador;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Codificador se encarga de convertir una lista de caracteres en una lista de imágenes de caracteres codificados.
 */
public class Codificador {
    private List<Character> listaContraseña;

    public Codificador(List<Character> listaContraseña) {
        this.listaContraseña = listaContraseña;
    }

    /**
     * Convierte la lista de caracteres en una lista de imágenes de caracteres codificados.
     * @return La lista de imágenes de caracteres codificados.
     */
    public List<ImagenCaracter> toImagen() {
        List<ImagenCaracter> imagenes = new ArrayList<>();
        for (Character caracter : listaContraseña) {
            ImagenCaracter imagenCaracter = new ImagenCaracter(caracter);
            imagenes.add(imagenCaracter);
        }
        return imagenes;
    }
}
