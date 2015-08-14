import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void removeVowels_returnsWordWithOutVowels_cat(){
    String result = "c-t";
    assertEquals(result, App.removeVowels("cat"));
  }

  @Test
  public void removeVowels_transformsSentences_thisIsASentence(){
    String result = "Th-s -s - s-nt-nc-.";
    assertEquals(result, App.removeVowels("This is a sentence."));
  }

  @Test
  public void removeVowels_worksWithCapitals_IlikeIsoptopeComics(){
    String result = "- l-k- -s-t-p- C-m-cs.";
    assertEquals(result, App.removeVowels("I like Isotope Comics."));
  }
}
