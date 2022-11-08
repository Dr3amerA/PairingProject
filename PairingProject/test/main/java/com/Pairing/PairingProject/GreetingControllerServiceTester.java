package main.java.com.Pairing.PairingProject;

import com.Pairing.PairingProject.LangService;
import com.Pairing.PairingProject.NameCountService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GreetingControllerServiceTester {

    private NameCountService nameCount = new NameCountService();
    private LangService lang = new LangService();



    @Test
    public  void ShouldBeEqualsLanguage_RightCount(){
        assertEquals( "Times called for Maria: 1.",nameCount.countNames("Maria", "en"));
        assertEquals( "Το όνομα Maria εμφανίζεται 2 φορές.",nameCount.countNames("Maria", "el"));
        assertEquals( "El nombre Maria se aparece 3 veces.",nameCount.countNames("Maria", "es"));

    }

    @Test
    public  void ShouldBeEqualLanguage(){
        assertEquals( "My name is Maria!",lang.translate("Maria", "en"));
        assertEquals( "Me llamo Maria!",lang.translate("Maria", "es"));
        assertEquals( "Με λένε Maria!",lang.translate("Maria", "el"));
    }

    @Test
    public  void FalseLanguage(){
        assertFalse("My name is Maria!".equals(lang.translate("Maria", "es")));
        assertFalse("Me llamo Maria!".equals(lang.translate("Maria", "el")));
        assertFalse("Με λένε Maria!".equals(lang.translate("Maria", "es")));
    }


}
