package Codificador;

import Gabri.Dev.com.Codificador.ImagenCaracter;
import Gabri.Dev.com.Codificador.Codificador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CodificadorTest {
    @Test
    public void testToImagen() {
        // Crear una lista de caracteres de prueba
        List<Character> listaContraseña = new ArrayList<>();
        listaContraseña.add('a');
        listaContraseña.add('b');
        listaContraseña.add('c');
        listaContraseña.add('d');

        // Crear una instancia de Codificador con la lista de caracteres
        Codificador codificador = new Codificador(listaContraseña);

        // Convertir la lista de caracteres en una lista de imágenes de caracteres codificados
        List<ImagenCaracter> imagenes = codificador.toImagen();

        // Comprobar que la lista de imágenes tiene el tamaño correcto
        assertEquals(4, imagenes.size(), "La lista de imágenes debe contener 4 elementos");

        // Comprobar que cada imagen corresponde al carácter correcto
        assertEquals("img_000000000001100001.png", imagenes.get(0).obtenerNombre(), "La imagen del primer carácter debe ser 'img_000000000001100001.png'");
        assertEquals("img_000000000001100010.png", imagenes.get(1).obtenerNombre(), "La imagen del segundo carácter debe ser 'img_000000000001100010.png'");
        assertEquals("img_000000000001100011.png", imagenes.get(2).obtenerNombre(), "La imagen del tercer carácter debe ser 'img_000000000001100011.png'");
        assertEquals("img_000000000001100100.png", imagenes.get(3).obtenerNombre(), "La imagen del cuarto carácter debe ser 'img_000000000001100100.png'");
    }

}

