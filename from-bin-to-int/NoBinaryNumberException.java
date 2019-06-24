import java.util.*;

public class NoBinaryNumberException extends Exception {

  public NoBinaryNumberException() {
    super();
  }
  
  public NoBinaryNumberException(String binzahl) {
    super(binzahl + " ist kein gültiger Wert! Bitte eine Binärzahl eingeben!");
  }

}
