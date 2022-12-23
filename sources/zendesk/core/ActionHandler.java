package zendesk.core;

import android.content.Context;
import java.util.Map;
import p359ag.C13450g;

public interface ActionHandler {
    boolean canHandle(String str);

    int getPriority();

    void handle(Map<String, Object> map, Context context);

    void updateSettings(Map<String, C13450g> map);
}
