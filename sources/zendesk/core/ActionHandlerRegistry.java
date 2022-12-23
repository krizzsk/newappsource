package zendesk.core;

import java.util.Map;
import p359ag.C13450g;

public interface ActionHandlerRegistry {
    ActionHandler handlerByAction(String str);

    void updateSettings(Map<String, C13450g> map);
}
