import java.util.Arrays;
import java.util.Objects;

/**
 * Lightweight standalone Test Runner and Assertion Utility for DSA Problem Solving.
 * Allows running automated tests with execution timing and formatted pass/fail reporting
 * without requiring JUnit or third-party libraries.
 */
public class TestRunner {
    private static int totalTests = 0;
    private static int passedTests = 0;
    private static int failedTests = 0;

    public static void startSuite(String suiteName) {
        System.out.println("\n=======================================================");
        System.out.println(" 🚀 STARTING TEST SUITE: " + suiteName);
        System.out.println("=======================================================");
        totalTests = 0;
        passedTests = 0;
        failedTests = 0;
    }

    public static void endSuite() {
        System.out.println("-------------------------------------------------------");
        System.out.println(" 📊 SUITE RESULTS: " + passedTests + " / " + totalTests + " PASSED");
        if (failedTests > 0) {
            System.out.println(" ❌ FAILED: " + failedTests + " test(s)");
        } else {
            System.out.println(" ✅ ALL TESTS PASSED PERFECTLY!");
        }
        System.out.println("=======================================================\n");
    }

    public static void assertEquals(String testName, Object expected, Object actual) {
        totalTests++;
        long startTime = System.nanoTime();
        boolean passed = Objects.equals(expected, actual);
        long durationMs = (System.nanoTime() - startTime) / 1_000_000;

        printResult(testName, passed, String.valueOf(expected), String.valueOf(actual), durationMs);
    }

    public static void assertArrayEquals(String testName, int[] expected, int[] actual) {
        totalTests++;
        long startTime = System.nanoTime();
        boolean passed = Arrays.equals(expected, actual);
        long durationMs = (System.nanoTime() - startTime) / 1_000_000;

        printResult(testName, passed, Arrays.toString(expected), Arrays.toString(actual), durationMs);
    }

    public static void assertTrue(String testName, boolean condition) {
        assertEquals(testName, true, condition);
    }

    public static void assertFalse(String testName, boolean condition) {
        assertEquals(testName, false, condition);
    }

    private static void printResult(String testName, boolean passed, String expectedStr, String actualStr, long durationMs) {
        if (passed) {
            passedTests++;
            System.out.printf(" [✅ PASS] %-35s (%d ms)%n", testName, durationMs);
        } else {
            failedTests++;
            System.out.printf(" [❌ FAIL] %-35s (%d ms)%n", testName, durationMs);
            System.out.println("     -> Expected: " + expectedStr);
            System.out.println("     -> Actual  : " + actualStr);
        }
    }

    // Demo main method showing how to use TestRunner
    public static void main(String[] args) {
        startSuite("Demo TestRunner Verification");
        assertEquals("Addition Test", 5, 2 + 3);
        assertArrayEquals("Array Reverse Test", new int[]{3, 2, 1}, new int[]{3, 2, 1});
        assertTrue("String Contains Test", "Algorithms".contains("Algo"));
        endSuite();
    }
}
