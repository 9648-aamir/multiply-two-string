import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> sourceCities = new HashSet<>();
        for (List<String> path : paths) {
            sourceCities.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!sourceCities.contains(path.get(1))) {
                return path.get(1);
            }
        }
        
        return "";
    }
}
