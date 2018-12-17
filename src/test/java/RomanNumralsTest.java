import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumralsTest {
    @Test
    public void whenInputOneSymbolThenReturnResult(){
        assertThat(RomanNumralsConverter.convert("I"),is(1));
    }

    @Test
    public void whenInputSymbolsOnlyAdditionThenReturnResult(){
        assertThat(RomanNumralsConverter.convert("MMVI"),is(2006));
    }

    @Test
    public void whenInputSymbolsAdditionAndSubtractionThenReturnResult(){
        assertThat(RomanNumralsConverter.convert("MCMXLIV"),is(1994));
    }
}
