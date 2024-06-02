package Gabri.Dev.com.Codificador;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * La clase ImagenCaracter representa una imagen asociada a un carácter.
 */
public class ImagenCaracter {
    private final int ANCHO = 6;
    private final int ALTO = 3;
    private Image imagen;
    private Character caracter;

    public ImagenCaracter(Character caracter) {
        this.caracter = caracter;
        cargarImagen();
    }

    /**
     * Carga la imagen asociada al carácter desde un archivo.
     */
    private void cargarImagen() {
        String nombreArchivo = obtenerNombre();
        try {
            File archivo = new File("IMG/" + nombreArchivo);
            this.imagen = ImageIO.read(archivo);
        } catch (IOException e) {
            System.out.println("No se pudo cargar la imagen: " + nombreArchivo);
        }
    }

    /**
     * Obtiene el nombre del archivo de imagen asociado al carácter.
     * <br>
     * En este caso las imagenes estan en binarios con 18 caracteres por lo que rellena con ceros
     * a su izquiera para que coincida el nombre
     * @return  El nombre del archivo de imagen.
     */
    public String obtenerNombre() {
        int valorAscii = (int) this.caracter;
        String binario = String.format("%018d", Integer.parseInt(Integer.toBinaryString(valorAscii)));
        return "img_" + binario + ".png";
    }
    /**
     * Obtiene la imagen asociada al carácter.
     * @return La imagen asociada al carácter.
     */
    public Image getImagen() {
        return imagen;
    }
}
