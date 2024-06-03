package Codificador;

import Gabri.Dev.com.Codificador.ImagenCaracter;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ImagenCaracterTest {
    @Test
    public void obtenerNombre(){
        ImagenCaracter imagenCaracter= new ImagenCaracter('a');
        String caracter = imagenCaracter.obtenerNombre();
        assertEquals(caracter,"img_000000000001100001.png","El nombre deberia ser: img_000000000001100001.png");
    }
}