import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchEngine {
    private final static Logger logger = LoggerFactory.getLogger(SearchEngine.class);

    public static boolean searchBinary(int[] array, int elementToSearch, int firstIndex, int lastIndex) {

        int center;

        center = (firstIndex + lastIndex) / 2;
        if (elementToSearch > array[center]) {
            firstIndex = center + 1;
            logger.debug("elementToSearch {} > array[center] {}", elementToSearch, array[center]);
        }
        else {
            logger.debug("elementToSearch {} < array[center] {}", elementToSearch, array[center]);
            lastIndex = center - 1;
        }

        if (array[center] == elementToSearch) {
            logger.debug("elementToSearch {} == array[center] {}", elementToSearch, array[center]);
            return true;
        }
        else {
            if (firstIndex <= lastIndex) {
                logger.debug("firstIndex {} <= lastIndex {}", firstIndex, lastIndex);
                return searchBinary(array, elementToSearch, firstIndex, lastIndex);
            }
            else {
                logger.debug("firstIndex {} > lastIndex {}", firstIndex, lastIndex);
                return false;
            }
        }
    }
}
