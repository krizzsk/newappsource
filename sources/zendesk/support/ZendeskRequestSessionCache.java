package zendesk.support;

import ge0.C23408a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ZendeskRequestSessionCache implements RequestSessionCache {
    private final Map<Long, TicketForm> cachedTicketForms = new HashMap();

    public boolean containsAllTicketForms(List<Long> list) {
        boolean z;
        List<Type> c = C23408a.m57528c(list);
        synchronized (this.cachedTicketForms) {
            Iterator<Type> it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!this.cachedTicketForms.containsKey((Long) it.next())) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    public synchronized List<TicketForm> getTicketFormsById(List<Long> list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<Type> c = C23408a.m57528c(list);
        synchronized (this.cachedTicketForms) {
            for (Type type : c) {
                arrayList.add(this.cachedTicketForms.get(type));
            }
        }
        return arrayList;
    }

    public void updateTicketFormCache(List<TicketForm> list) {
        List<Type> c = C23408a.m57528c(list);
        HashMap hashMap = new HashMap();
        for (Type type : c) {
            hashMap.put(Long.valueOf(type.getId()), type);
        }
        synchronized (this.cachedTicketForms) {
            this.cachedTicketForms.putAll(hashMap);
        }
    }
}
