package Gabri.Dev.com.Codificador;

import java.util.List;
/**
 * La clase ContraseñaImagen representa una contraseña formada por una lista de imágenes de caracteres.
 */
public class ContraseñaImagen {
    private List<ImagenCaracter> listaImagenes;
    private String nombreArchivo;

    public ContraseñaImagen(List<ImagenCaracter> listaImagenes, String nombreArchivo) {
        this.listaImagenes = listaImagenes;
        this.nombreArchivo = nombreArchivo;
    }

    public List<ImagenCaracter> getListaImagenes() {
        return listaImagenes;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }
}
