import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by aque0 on 7/13/17.
 */
final class Fox {

    public static List<String> slowFoxes(List<String> foxList) {
        if (null == foxList) {
            throw new IllegalArgumentException();
        }

        return foxList
                .stream()
                .filter((String theName) -> theName != "Swift Fox")
                .collect(Collectors.toList());
    }
}
