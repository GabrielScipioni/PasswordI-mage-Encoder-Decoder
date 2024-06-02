package Gabri.Dev.com.Codificador;

import java.util.List;

/**
 * El constructor de ImagenCombinadaBuilder construye y retorna una instancia de ImagenCombinada
 * utilizando la información proporcionada por un objeto ContraseñaImagen.
 */
public class ImagenCombinadaConstructor {

    /**
     * Construye y retorna una instancia de ImagenCombinada utilizando la información de ContraseñaImagen.
     * @param contraseñaImagen El objeto ContraseñaImagen que contiene la lista de imágenes y el nombre del archivo.
     * @return Una instancia de ImagenCombinada construida a partir de la información de ContraseñaImagen.
     */
    public ImagenCombinada build(ContraseñaImagen contraseñaImagen) {
        List<ImagenCaracter> listaImagenes = contraseñaImagen.getListaImagenes();
        String nombreArchivo = contraseñaImagen.getNombreArchivo();

        return new ImagenCombinada(listaImagenes, nombreArchivo);
    }
}
