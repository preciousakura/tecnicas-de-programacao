import java.util.*;

public class TesteNovo{

    public TesteNovo(Collection<String> lista, String vet[]){
;
    }

    public static void verificar(){ // questao e

        List<String> elementos  = new ArrayList<String>();

        elementos.add("one");
        elementos.add("second");
        elementos.add("third");
        elementos.add("second");
        elementos.add("one");

        Collections.sort(elementos);

        System.out.println("Lista: ");
        System.out.println(elementos);

    }

    public static void main(String args[]){ // questao f, após testar HashSet, TreeSet, LinkedHashSet e ArrayList nota-se que condiz com o resultado

        TesteNovo.verificar();
    }

}
