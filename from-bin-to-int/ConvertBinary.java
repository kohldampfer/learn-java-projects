import java.util.*;

public class ConvertBinary {
  
  public static int convert(String binzahl) throws NoBinaryNumberException {
  
    // In dieser Variablen steht das Resultat, dass dann
    // zurück gegeben wird
    int result = 0;
  
    // prüfe auf richtige Vorbedingungen
    for (int i = 0; i < binzahl.length(); i++) {
      if (binzahl.charAt(i) != '1' && binzahl.charAt(i) != '0') {
        throw new NoBinaryNumberException(binzahl);
      }
    }
    
    // berechne Resultat
    for (int j = 0; j < binzahl.length(); j++) {
      if (binzahl.charAt(j) == '1') {
        result = result + (int)(Math.pow(2, binzahl.length() - j - 1));
      }
    }
    
    return result;
  }

}
