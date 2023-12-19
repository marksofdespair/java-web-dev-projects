import org.junit.jupiter.api.Test;

import org.launchcode.BalancedBrackets;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    void testBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc[def]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    void testUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]]]"));
    }

    @Test
    void testNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("no brackets here"));
    }

    @Test
    void testMixBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[test]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[test]]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[test]]]more"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[test]]more"));
    }

    @Test
    void testNullInput() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(null));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}