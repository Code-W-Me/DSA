import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Spiral_matrixTest {
    
    @Test
    public void testMatrixLoop() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}, 
            {7, 8, 9}
        };

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        for(int i = 2; i >= 1; i--) {
            System.out.print(matrix[2][i] + " ");
        }

        assertEquals("8 7 ", outContent.toString());
        System.setOut(System.out);
    }
}