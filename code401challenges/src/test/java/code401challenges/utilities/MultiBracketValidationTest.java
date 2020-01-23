package code401challenges.utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void testMultiBracketValidation_trueCaseShort() {

        boolean actual = MultiBracketValidation.multiBracketValidation("{}");
        assertTrue(actual);
    }

    @Test
    public void testMultiBracketValidation_trueCaseLong() {

        boolean actual = MultiBracketValidation.multiBracketValidation("{}(){}");
        assertTrue(actual);
    }

    @Test
    public void testMultiBracketValidation_trueCaseWithWords() {

        boolean actual = MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]");
        assertTrue(actual);
    }

    @Test
    public void testMultiBracketValidation_trueCaseMixed() {

        boolean actual = MultiBracketValidation.multiBracketValidation("(){}[[]]");
        assertTrue(actual);
    }

    @Test
    public void testMultiBracketValidation_trueCaseMixedWithWords() {

        boolean actual = MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())");
        assertTrue(actual);
    }

    @Test
    public void testMultiBracketValidation_falseCaseLong() {

        boolean actual = MultiBracketValidation.multiBracketValidation("[({}]");
        assertFalse(actual);
    }

    @Test
    public void testMultiBracketValidation_falseCaseShort() {

        boolean actual = MultiBracketValidation.multiBracketValidation("(](");
        assertFalse(actual);
    }

    @Test
    public void testMultiBracketValidation_falseCaseMixed() {

        boolean actual = MultiBracketValidation.multiBracketValidation("{(})");
        assertFalse(actual);
    }
}
