package org.example.util;

import junit.framework.TestCase;
import org.example.models.Player;

import static org.example.util.CheckResult.checkResult;

public class CheckResultTest extends TestCase {

    public void testCheckResult() {
        Player pl = new Player("Vadym");
        assertEquals("Computer Win", checkResult(2,pl));
    }
}