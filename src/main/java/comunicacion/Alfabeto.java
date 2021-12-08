package comunicacion;

import java.util.*;

public class Alfabeto extends Pictograma{

    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public static String[] getLetras() {
        return letras;
    }

    public static void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }

    public String toString() {
		return Arrays.toString(letras).substring(1,Arrays.toString(letras).length()-1);
	}

    public String interpretacion() {
        return this.interpretacion;
    }

    public static int cantidadLetras() {
        return letras.length;
    }
    
}
