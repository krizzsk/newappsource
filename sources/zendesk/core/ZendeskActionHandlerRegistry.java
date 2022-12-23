package zendesk.core;

import ge0.C23410c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p359ag.C13450g;

class ZendeskActionHandlerRegistry implements ActionHandlerRegistry {
    private static final Comparator<ActionHandler> PRIORITY_ACTION_HANDLER_COMPARATOR = new Comparator<ActionHandler>() {
        public int compare(ActionHandler actionHandler, ActionHandler actionHandler2) {
            return actionHandler2.getPriority() - actionHandler.getPriority();
        }
    };
    private List<ActionHandler> registry = new ArrayList();

    public ActionHandler handlerByAction(String str) {
        if (C23410c.m57534b(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.registry);
        Collections.sort(arrayList, PRIORITY_ACTION_HANDLER_COMPARATOR);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActionHandler actionHandler = (ActionHandler) it.next();
            if (actionHandler.canHandle(str)) {
                return actionHandler;
            }
        }
        return null;
    }

    public void updateSettings(Map<String, C13450g> map) {
        for (ActionHandler next : this.registry) {
            if (next != null) {
                next.updateSettings(map);
            }
        }
    }
}
