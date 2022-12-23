package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

final class Jsr305Settings$description$2 extends Lambda implements C24225a<String[]> {
    public final /* synthetic */ C23925c this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Jsr305Settings$description$2(C23925c cVar) {
        super(0);
        this.this$0 = cVar;
    }

    public final Object invoke() {
        C23925c cVar = this.this$0;
        ListBuilder listBuilder = new ListBuilder();
        listBuilder.add(cVar.f60580a.getDescription());
        ReportLevel reportLevel = cVar.f60581b;
        if (reportLevel != null) {
            listBuilder.add(C24362h.m61216k(reportLevel.getDescription(), "under-migration:"));
        }
        for (Map.Entry next : cVar.f60582c.entrySet()) {
            StringBuilder q = C25541a.m63886q('@');
            q.append(next.getKey());
            q.append(':');
            q.append(((ReportLevel) next.getValue()).getDescription());
            listBuilder.add(q.toString());
        }
        listBuilder.mo59192z();
        return (String[]) listBuilder.toArray(new String[0]);
    }
}
