package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void stringInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }
    @Test
    public void partOfStringInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void balancedBracketsAfterStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void oneBracketBeforeStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void backwardsBracketInStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void backwardsBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}
