import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by aque0 on 7/13/17.
 */
public class FoxTest {
    @Test(expected = IllegalArgumentException.class )
    public void slowFoxesThrowsExceptionWhenGivenNull(){
        Fox.slowFoxes(null);
    }

    @Test
    public void slowFoxesReturnsEmptyListWhenGivenEmptyList() {
        List<String> actual = Fox.slowFoxes(Collections.emptyList());
        //assert
        assertTrue(actual.isEmpty());

    }

    @Test
    public void slowFoxesReturnsEmptyListWhenGivenOneSwiftFox() {
        List<String> foxTypes = Arrays.asList("Swift Fox");
        List<String> actual = Collections.emptyList();

        List<String> expected = Fox.slowFoxes(foxTypes);

        assertEquals(expected, actual);
    }

    @Test
    public void slowFoxesReturnsListWithOneFoxThatIsNotSwift() {
        List<String> foxTypes = Arrays.asList("Fennec Fox");
        List<String> actual = Arrays.asList("Fennec Fox");

        List<String> expected = Fox.slowFoxes(foxTypes);

        assertEquals(expected, actual);
    }

    @Test
    public void slowFoxesReturnsListOfFoxesThatAreNotSwift() {
        List<String> foxTypes = Arrays.asList("Red Fox", "Arctic Fox", "Fennec Fox", "Kit Fox", "Swift Fox");
        List<String> actual = Arrays.asList("Red Fox", "Arctic Fox", "Fennec Fox", "Kit Fox");

        List<String> expected = Fox.slowFoxes(foxTypes);

        assertEquals(expected, actual);
    }
}