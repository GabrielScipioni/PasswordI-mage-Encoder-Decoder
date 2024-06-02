package Gabri.Dev.com.Codificador;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;

/**
 * La clase ImagenCombinada se encarga de combinar una lista de imágenes de caracteres en una única imagen.
 */
public class ImagenCombinada {
    private List<ImagenCaracter> listaImagenes; // La lista de imágenes de caracteres que se van a combinar
    private String nombreArchivo; // El nombre del archivo de la imagen combinada

    public ImagenCombinada(List<ImagenCaracter> listaImagenes, String nombreArchivo) {
        this.listaImagenes = listaImagenes;
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * Crea una imagen combinada a partir de la lista de imágenes de caracteres y la guarda en un archivo PNG.
     * Si la lista de imágenes está vacía, muestra un mensaje de advertencia y no realiza ninguna acción.
     * @throws IOException Si ocurre un error al guardar la imagen combinada en el archivo.
     */
    public void crearImagenCombinada() {
        if (listaImagenes.isEmpty()) {
            System.out.println("La lista de imágenes está vacía.");
            return;
        }

        // Obtiene el ancho y el alto de la primera imagen en la lista
        int anchoImagen = listaImagenes.get(0).getImagen().getWidth(null);
        int altoImagen = listaImagenes.get(0).getImagen().getHeight(null);

        // Calcula el ancho total de la imagen combinada multiplicando el ancho de una imagen
        // individual por el número total de imágenes en la lista
        int anchoTotal = anchoImagen * listaImagenes.size();

        // Crea una nueva imagen BufferedImage para la imagen combinada con las dimensiones calculadas
        BufferedImage imagenCombinada = new BufferedImage(anchoTotal, altoImagen, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagenCombinada.createGraphics();

        int x = 0;
        // Itera sobre cada ImagenCaracter en la lista de imágenes
        for (ImagenCaracter imgChar : listaImagenes) {
            // Dibuja la imagen actual en la posición (x, 0) de la imagen combinada
            g2d.drawImage(imgChar.getImagen(), x, 0, null);
            x += anchoImagen; // Incrementa la coordenada x en el ancho de una imagen individual
        }

        g2d.dispose(); // Libera los recursos utilizados por el objeto Graphics2D


        try {
            // Guarda la imagen combinada en un archivo PNG
            File directorio = new File("PasswordIMG");
            if (!directorio.exists()) {
                directorio.mkdir();// Crea el directorio si no existe
            }
            File archivoSalida = new File(directorio, nombreArchivo + ".png");
            ImageIO.write(imagenCombinada, "png", archivoSalida);
        } catch (IOException e) {
            System.out.println("Error al guardar la imagen combinada: " + e.getMessage());
        }
    }
}
