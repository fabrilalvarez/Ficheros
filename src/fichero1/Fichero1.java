package fichero1;

/**
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Fichero1 {

    public static void main(String[] args) {
        // TODO code application logic here
       
        LeerFichero obj = new LeerFichero();
        obj.leerLinea("texto.txt");
        
        obj.leerConDelimitador("numeros.txt");

    }

}
