package pg0;

import bf0.C21050d;
import cf0.C21136j;
import cf0.C21144r;
import cf0.C21145s;
import cf0.C21146t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C23816b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C23979b;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import lf0.C24236l;
import mf0.C24362h;
import p389bl.C13637c;

/* renamed from: pg0.h */
public final class C24702h {

    /* renamed from: a */
    public final LinkedHashMap f62541a = new LinkedHashMap();

    /* renamed from: pg0.h$a */
    public final class C24703a {

        /* renamed from: a */
        public final String f62542a;

        /* renamed from: b */
        public final /* synthetic */ C24702h f62543b;

        /* renamed from: pg0.h$a$a */
        public final class C24704a {

            /* renamed from: a */
            public final String f62544a;

            /* renamed from: b */
            public final ArrayList f62545b = new ArrayList();

            /* renamed from: c */
            public Pair<String, C24706j> f62546c = new Pair<>("V", null);

            /* renamed from: d */
            public final /* synthetic */ C24703a f62547d;

            public C24704a(C24703a aVar, String str) {
                C24362h.m61211f(aVar, "this$0");
                this.f62547d = aVar;
                this.f62544a = str;
            }

            /* renamed from: a */
            public final void mo61185a(String str, C24698d... dVarArr) {
                boolean z;
                C24706j jVar;
                C24362h.m61211f(str, "type");
                ArrayList arrayList = this.f62545b;
                if (dVarArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    jVar = null;
                } else {
                    C21145s j1 = C23816b.m58454j1(dVarArr);
                    int z2 = C13637c.m34083z(C21136j.m49436X(j1, 10));
                    if (z2 < 16) {
                        z2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(z2);
                    Iterator it = j1.iterator();
                    while (true) {
                        C21146t tVar = (C21146t) it;
                        if (!tVar.hasNext()) {
                            break;
                        }
                        C21144r rVar = (C21144r) tVar.next();
                        linkedHashMap.put(Integer.valueOf(rVar.f53001a), (C24698d) rVar.f53002b);
                    }
                    jVar = new C24706j(linkedHashMap);
                }
                arrayList.add(new Pair(str, jVar));
            }

            /* renamed from: b */
            public final void mo61186b(String str, C24698d... dVarArr) {
                C24362h.m61211f(str, "type");
                C21145s j1 = C23816b.m58454j1(dVarArr);
                int z = C13637c.m34083z(C21136j.m49436X(j1, 10));
                if (z < 16) {
                    z = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(z);
                Iterator it = j1.iterator();
                while (true) {
                    C21146t tVar = (C21146t) it;
                    if (tVar.hasNext()) {
                        C21144r rVar = (C21144r) tVar.next();
                        linkedHashMap.put(Integer.valueOf(rVar.f53001a), (C24698d) rVar.f53002b);
                    } else {
                        this.f62546c = new Pair<>(str, new C24706j(linkedHashMap));
                        return;
                    }
                }
            }

            /* renamed from: c */
            public final void mo61187c(JvmPrimitiveType jvmPrimitiveType) {
                C24362h.m61211f(jvmPrimitiveType, "type");
                String desc = jvmPrimitiveType.getDesc();
                C24362h.m61210e(desc, "type.desc");
                this.f62546c = new Pair<>(desc, null);
            }
        }

        public C24703a(C24702h hVar, String str) {
            C24362h.m61211f(str, "className");
            this.f62543b = hVar;
            this.f62542a = str;
        }

        /* renamed from: a */
        public final void mo61184a(String str, C24236l<? super C24704a, C21050d> lVar) {
            LinkedHashMap linkedHashMap = this.f62543b.f62541a;
            C24704a aVar = new C24704a(this, str);
            lVar.invoke(aVar);
            String str2 = aVar.f62547d.f62542a;
            String str3 = aVar.f62544a;
            ArrayList arrayList = aVar.f62545b;
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) it.next()).mo59068c());
            }
            String f = C23979b.m59205f(str2, C23979b.m59204e(str3, aVar.f62546c.mo59068c(), arrayList2));
            C24706j d = aVar.f62546c.mo59069d();
            ArrayList arrayList3 = aVar.f62545b;
            ArrayList arrayList4 = new ArrayList(C21136j.m49436X(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add((C24706j) ((Pair) it2.next()).mo59069d());
            }
            Pair pair = new Pair(f, new C24701g(d, arrayList4));
            linkedHashMap.put(pair.mo59068c(), pair.mo59069d());
        }
    }
}
