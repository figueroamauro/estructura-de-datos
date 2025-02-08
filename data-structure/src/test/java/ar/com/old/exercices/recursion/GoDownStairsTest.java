package ar.com.old.exercices.recursion;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GoDownStairsTest {

    @Test
    void shouldShowInConsoleHowToGoDownTheStairs() {
        GoDownStairs goDownStairs = new GoDownStairs();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));//Set out in a stream

        goDownStairs.goDownStairs(10);

        System.setOut(originalOut); //Restore out


        String expectedOutput = "Going down step 10\n" +
                                        "Going down step 9\n" +
                                        "Going down step 8\n" +
                                        "Going down step 7\n" +
                                        "Going down step 6\n" +
                                        "Going down step 5\n" +
                                        "Going down step 4\n" +
                                        "Going down step 3\n" +
                                        "Going down step 2\n" +
                                        "Going down step 1\n" +
                                        "End\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}