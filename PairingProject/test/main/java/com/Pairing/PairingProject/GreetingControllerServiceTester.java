package main.java.com.Pairing.PairingProject;

import com.Pairing.PairingProject.NameCountService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class GreetingControllerServiceTester {

    private NameCountService nameCount = new NameCountService();



    @Test
  public  void ShouldBeRightLanguage_RightCount(){
        assertEquals( "Times called for Maria: 1.",nameCount.countNames("Maria", "en"));
        assertEquals( "Times called for Maria: 2.",nameCount.countNames("Maria", "en"));
    }
}
