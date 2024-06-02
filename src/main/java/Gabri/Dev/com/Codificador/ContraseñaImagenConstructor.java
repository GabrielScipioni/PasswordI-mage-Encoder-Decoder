package Gabri.Dev.com.Codificador;

import java.util.List;

/**
 * El constructor de ContraseñaImagenBuilder construye y retorna una instancia de ContraseñaImagen
 * utilizando la información proporcionada por un objeto Contraseña.
 */
public class ContraseñaImagenConstructor{
    public ContraseñaImagen build(Contraseña contraseña) {
        StringAChar stringAChar = new StringAChar(contraseña.getContraseña());
        List<Character> contraseñaLst = stringAChar.obtenerListaContraseña();

        Codificador codificador = new Codificador(contraseñaLst);
        List<ImagenCaracter> listaImagenes = codificador.toImagen();
        String nombreArchivo = contraseña.getContraseña();

        return new ContraseñaImagen(listaImagenes, nombreArchivo);
    }
}
