import java.util.HashMap;
import java.util.Map;

public class Brasil {

    public static void main(String args[]){ // questao g

        Map<String, String> estados = new HashMap<String, String>();

        estados.put("CE", "CE -> Ceará");
        estados.put("PE", "PE -> Pernambuco");
        estados.put("AC", "AC -> Acre");
        estados.put("AL", "AL -> Alagoas");
        estados.put("AP", "AP -> Amapá");
        estados.put("AM", "AM ->Amazonas");
        estados.put("BA", "BA -> Bahia");
        estados.put("DF", "DF -> Distrito Federal");
        estados.put("ES", "ES -> Espírito Santo");
        estados.put("MA", "MA -> Maranhão");
        estados.put("GO", "GO -> Goiás");
        estados.put("MT", "MT -> Mato Grosso");
        estados.put("MS", "MS -> Mato Grosso do Sul");
        estados.put("MG", "MG -> Minas Gerais");
        estados.put("PA", "PA -> Pará ");
        estados.put("RN", "RN -> Rio Grande do Norte");
        estados.put("PB", "PB -> Paraíba");
        estados.put("PR", "PR -> Paraná");
        estados.put("RJ", "RJ -> Rio de Janeiro");
        estados.put("PI", "PI -> Piauí");
        estados.put("RR", "RR -> Roraima");
        estados.put("RO", "RO -> Rondônia");
        estados.put("SP", "SP -> São Paulo");
        estados.put("TO", "TO -> Tocantins");
        estados.put("RS", "RS -> Rio Grande do Sul ");
        estados.put("SC", "SC -> Santa Catarina");
        estados.put("SE", "SE -> Sergipe"); 

        System.out.println(estados.get("RS"));
        System.out.println(estados.get("CE"));
        System.out.println(estados.get("SP"));

    }
    
}

