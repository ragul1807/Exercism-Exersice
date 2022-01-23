import java.util.HashMap;
import java.util.Map;

public class RnaTranscription {
    static String transcribe(String dnaStrand) {
        StringBuilder rnaStrand= new StringBuilder();
       
        Map<Character,String> rnaMap = new HashMap<>();
        rnaMap.put('G',"C");
        rnaMap.put('C',"G");
        rnaMap.put('T',"A");
        rnaMap.put('A',"U");
        for (int i=0;i<dnaStrand.length();i++)
        {
            rnaStrand.append(rnaMap.get(dnaStrand.charAt(i)));
        }

        return String.valueOf(rnaStrand);

    }
}
