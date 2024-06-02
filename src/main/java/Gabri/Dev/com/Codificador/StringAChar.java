package Gabri.Dev.com.Codificador;

import java.util.ArrayList;
import java.util.List;

/**
 * Se encarga de convertir un String a una lista de caracteres
 */
public class StringAChar {
    private String contraseña;

    public StringAChar(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * metodo encargado de transformar un String a una Lista de caracteres
     * @return ArrayList de caracteres
     */
    public List<Character> obtenerListaContraseña() {
        List<Character> listaCaracteres = new ArrayList<>();
        for (char c : contraseña.toCharArray()) {
            listaCaracteres.add(c);
        }
        return listaCaracteres;
    }
}
