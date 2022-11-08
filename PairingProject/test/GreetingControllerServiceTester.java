import com.Pairing.PairingProject.NameCountService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreetingControllerServiceTester {

    private NameCountService nameCount;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getNameCountService(){
        assertThat(nameCount.countInt("Maria"),is("1"));
    }
}
