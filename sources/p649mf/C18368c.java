package p649mf;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p414v1.C14526h;
import com.google.firebase.perf.p414v1.C14530i;
import com.google.firebase.perf.session.PerfSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: mf.c */
public final class C18368c {

    /* renamed from: a */
    public final Trace f46837a;

    public C18368c(Trace trace) {
        this.f46837a = trace;
    }

    /* renamed from: a */
    public final C14530i mo50840a() {
        List unmodifiableList;
        C14530i.C14532b M = C14530i.m36217M();
        M.mo43581t(this.f46837a.f36641e);
        M.mo43579r(this.f46837a.f36648l.f36654b);
        Trace trace = this.f46837a;
        M.mo43580s(trace.f36648l.mo43520c(trace.f36649m));
        for (Counter counter : this.f46837a.f36642f.values()) {
            String str = counter.f36635b;
            long j = counter.f36636c.get();
            str.getClass();
            M.mo43956p();
            C14530i.m36220u((C14530i) M.f36809c).put(str, Long.valueOf(j));
        }
        ArrayList<Trace> arrayList = this.f46837a.f36645i;
        if (!arrayList.isEmpty()) {
            for (Trace cVar : arrayList) {
                C14530i a = new C18368c(cVar).mo50840a();
                M.mo43956p();
                C14530i.m36221v((C14530i) M.f36809c, a);
            }
        }
        Map<String, String> attributes = this.f46837a.getAttributes();
        M.mo43956p();
        C14530i.m36223x((C14530i) M.f36809c).putAll(attributes);
        Trace trace2 = this.f46837a;
        synchronized (trace2.f36644h) {
            ArrayList arrayList2 = new ArrayList();
            for (PerfSession next : trace2.f36644h) {
                if (next != null) {
                    arrayList2.add(next);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        C14526h[] c = PerfSession.m36080c(unmodifiableList);
        if (c != null) {
            List asList = Arrays.asList(c);
            M.mo43956p();
            C14530i.m36225z((C14530i) M.f36809c, asList);
        }
        return (C14530i) M.mo43954m();
    }
}
