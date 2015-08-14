import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void removeVowels_returnsWordWithOutVowels_cat(){
    String result = "c-t";
    assertEquals(result, App.removeVowels("cat"));
  }
}
