package domain;

import java.util.LinkedHashMap;
import java.util.Map;

public interface Observer {
    void update(LinkedHashMap<String, Rekening> rekeningen);
}
