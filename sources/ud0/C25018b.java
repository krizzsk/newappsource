package ud0;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.gson.Gson;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdRequest;
import com.vungle.warren.C23097c;
import com.vungle.warren.C23258z;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import od0.C24545c;
import od0.C24557h;
import od0.C24559j;
import od0.C24566m;
import p358af.C13437d;
import p359ag.C13450g;
import p359ag.C13452i;

/* renamed from: ud0.b */
public final class C25018b implements C25021e {

    /* renamed from: d */
    public static final String[] f63186d = new String[0];

    /* renamed from: a */
    public final VungleApiClient f63187a;

    /* renamed from: b */
    public final C23192a f63188b;

    /* renamed from: c */
    public final C23097c f63189c;

    public C25018b(VungleApiClient vungleApiClient, C23192a aVar, C23097c cVar) {
        this.f63187a = vungleApiClient;
        this.f63188b = aVar;
        this.f63189c = cVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:45|46|47|48|49|61|58|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0118 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo61555a(android.os.Bundle r16, ud0.C25024h r17) {
        /*
            r15 = this;
            r7 = r15
            java.lang.String r0 = "cache_bust"
            java.lang.String r1 = "last_cache_bust"
            java.lang.String r2 = "cacheBustSettings"
            java.lang.String r3 = "last_updated"
            com.vungle.warren.VungleApiClient r4 = r7.f63187a
            r5 = 1
            if (r4 == 0) goto L_0x0139
            com.vungle.warren.persistence.a r4 = r7.f63188b
            if (r4 != 0) goto L_0x0014
            goto L_0x0139
        L_0x0014:
            r8 = 2
            java.lang.Class<od0.j> r6 = od0.C24559j.class
            td0.e r4 = r4.mo58281p(r6, r2)     // Catch:{ DBException | IOException -> 0x0138 }
            java.lang.Object r4 = r4.get()     // Catch:{ DBException | IOException -> 0x0138 }
            od0.j r4 = (od0.C24559j) r4     // Catch:{ DBException | IOException -> 0x0138 }
            if (r4 != 0) goto L_0x0028
            od0.j r4 = new od0.j     // Catch:{ DBException | IOException -> 0x0138 }
            r4.<init>(r2)     // Catch:{ DBException | IOException -> 0x0138 }
        L_0x0028:
            r9 = r4
            java.lang.Long r2 = r9.mo60825b(r1)     // Catch:{ DBException | IOException -> 0x0138 }
            long r10 = r2.longValue()     // Catch:{ DBException | IOException -> 0x0138 }
            com.vungle.warren.VungleApiClient r2 = r7.f63187a     // Catch:{ DBException | IOException -> 0x0138 }
            qd0.d r2 = r2.mo58073a(r10)     // Catch:{ DBException | IOException -> 0x0138 }
            qd0.e r2 = r2.mo61216a()     // Catch:{ DBException | IOException -> 0x0138 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ DBException | IOException -> 0x0138 }
            r10.<init>()     // Catch:{ DBException | IOException -> 0x0138 }
            com.vungle.warren.persistence.a r4 = r7.f63188b     // Catch:{ DBException | IOException -> 0x0138 }
            java.util.ArrayList r4 = r4.mo58280o()     // Catch:{ DBException | IOException -> 0x0138 }
            boolean r6 = r4.isEmpty()     // Catch:{ DBException | IOException -> 0x0138 }
            if (r6 != 0) goto L_0x004f
            r10.addAll(r4)     // Catch:{ DBException | IOException -> 0x0138 }
        L_0x004f:
            com.google.gson.Gson r11 = new com.google.gson.Gson     // Catch:{ DBException | IOException -> 0x0138 }
            r11.<init>()     // Catch:{ DBException | IOException -> 0x0138 }
            boolean r4 = r2.mo61217a()     // Catch:{ DBException | IOException -> 0x0138 }
            r12 = 0
            if (r4 == 0) goto L_0x00ad
            T r2 = r2.f62602b     // Catch:{ DBException | IOException -> 0x0138 }
            ag.i r2 = (p359ag.C13452i) r2     // Catch:{ DBException | IOException -> 0x0138 }
            if (r2 == 0) goto L_0x00ac
            boolean r4 = r2.mo40354L(r0)     // Catch:{ DBException | IOException -> 0x0138 }
            if (r4 != 0) goto L_0x0069
            goto L_0x00ac
        L_0x0069:
            ag.i r14 = r2.mo40353K(r0)     // Catch:{ DBException | IOException -> 0x0138 }
            boolean r0 = r14.mo40354L(r3)     // Catch:{ DBException | IOException -> 0x0138 }
            if (r0 == 0) goto L_0x0093
            ag.g r0 = r14.mo40351I(r3)     // Catch:{ DBException | IOException -> 0x0138 }
            long r4 = r0.mo40339z()     // Catch:{ DBException | IOException -> 0x0138 }
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0093
            ag.g r0 = r14.mo40351I(r3)     // Catch:{ DBException | IOException -> 0x0138 }
            long r2 = r0.mo40339z()     // Catch:{ DBException | IOException -> 0x0138 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ DBException | IOException -> 0x0138 }
            r9.mo60827d(r0, r1)     // Catch:{ DBException | IOException -> 0x0138 }
            com.vungle.warren.persistence.a r0 = r7.f63188b     // Catch:{ DBException | IOException -> 0x0138 }
            r0.mo58288w(r9)     // Catch:{ DBException | IOException -> 0x0138 }
        L_0x0093:
            java.lang.String r2 = "campaign_ids"
            r3 = 1
            java.lang.String r4 = "cannot save campaignBust="
            r0 = r15
            r1 = r14
            r5 = r10
            r6 = r11
            r0.mo61556b(r1, r2, r3, r4, r5, r6)     // Catch:{ DBException | IOException -> 0x0138 }
            java.lang.String r2 = "creative_ids"
            r3 = 2
            java.lang.String r4 = "cannot save creativeBust="
            r0 = r15
            r1 = r14
            r5 = r10
            r6 = r11
            r0.mo61556b(r1, r2, r3, r4, r5, r6)     // Catch:{ DBException | IOException -> 0x0138 }
            goto L_0x00ad
        L_0x00ac:
            return r5
        L_0x00ad:
            r15.mo61557c(r10)     // Catch:{ DBException | IOException -> 0x0138 }
            r0 = r16
            r15.mo61558d(r0, r9)     // Catch:{ DBException | IOException -> 0x0138 }
            com.vungle.warren.persistence.a r0 = r7.f63188b
            java.lang.Class<od0.h> r1 = od0.C24557h.class
            td0.e r0 = r0.mo58282q(r1)
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0138
            int r1 = r0.size()
            if (r1 != 0) goto L_0x00cc
            goto L_0x0138
        L_0x00cc:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00eb
            java.lang.Object r2 = r0.next()
            od0.h r2 = (od0.C24557h) r2
            long r3 = r2.f62244e
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x00d5
            r1.add(r2)
            goto L_0x00d5
        L_0x00eb:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00f2
            goto L_0x0138
        L_0x00f2:
            com.vungle.warren.VungleApiClient r0 = r7.f63187a     // Catch:{  }
            qd0.d r0 = r0.mo58084m(r1)     // Catch:{  }
            qd0.e r0 = r0.mo61216a()     // Catch:{  }
            boolean r2 = r0.mo61217a()     // Catch:{  }
            if (r2 == 0) goto L_0x0135
            java.util.Iterator r0 = r1.iterator()     // Catch:{  }
        L_0x0106:
            boolean r1 = r0.hasNext()     // Catch:{  }
            if (r1 == 0) goto L_0x0138
            java.lang.Object r1 = r0.next()     // Catch:{  }
            od0.h r1 = (od0.C24557h) r1     // Catch:{  }
            com.vungle.warren.persistence.a r2 = r7.f63188b     // Catch:{ DBException -> 0x0118 }
            r2.mo58271f(r1)     // Catch:{ DBException -> 0x0118 }
            goto L_0x0106
        L_0x0118:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.Class<com.vungle.warren.r> r2 = com.vungle.warren.C23217r.class
            java.lang.String r2 = r2.getSimpleName()     // Catch:{  }
            r1.append(r2)     // Catch:{  }
            java.lang.String r2 = "#sendAnalytics"
            r1.append(r2)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            java.lang.String r2 = "can't delete bust \" + cacheBust"
            com.vungle.warren.VungleLogger.m57029b(r1, r2)     // Catch:{  }
            goto L_0x0106
        L_0x0135:
            r0.toString()     // Catch:{  }
        L_0x0138:
            return r8
        L_0x0139:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ud0.C25018b.mo61555a(android.os.Bundle, ud0.h):int");
    }

    /* renamed from: b */
    public final void mo61556b(C13452i iVar, String str, int i, String str2, ArrayList arrayList, Gson gson) {
        if (iVar.mo40354L(str)) {
            Iterator<C13450g> it = iVar.mo40352J(str).iterator();
            while (it.hasNext()) {
                C24557h hVar = (C24557h) gson.fromJson(it.next(), C24557h.class);
                hVar.f62241b *= 1000;
                hVar.f62242c = i;
                arrayList.add(hVar);
                try {
                    this.f63188b.mo58288w(hVar);
                } catch (DatabaseHelper.DBException unused) {
                    VungleLogger.m57029b(C13437d.m33705j(C25018b.class, new StringBuilder(), "#onRunJob"), str2 + hVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo61557c(ArrayList arrayList) {
        ArrayList arrayList2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24557h hVar = (C24557h) it.next();
            if (hVar.f62242c == 1) {
                C23192a aVar = this.f63188b;
                String str = hVar.f62240a;
                aVar.getClass();
                HashSet hashSet = new HashSet(Collections.singletonList(str));
                HashSet hashSet2 = new HashSet();
                for (C24545c next : aVar.mo58285t(C24545c.class)) {
                    if (hashSet.contains(next.mo60807f())) {
                        hashSet2.add(next);
                    }
                }
                arrayList2 = new ArrayList(hashSet2);
            } else {
                C23192a aVar2 = this.f63188b;
                String str2 = hVar.f62240a;
                aVar2.getClass();
                HashSet hashSet3 = new HashSet(Collections.singletonList(str2));
                HashSet hashSet4 = new HashSet();
                for (C24545c next2 : aVar2.mo58285t(C24545c.class)) {
                    if (hashSet3.contains(next2.mo60808g())) {
                        hashSet4.add(next2);
                    }
                }
                arrayList2 = new ArrayList(hashSet4);
            }
            LinkedList linkedList = new LinkedList();
            LinkedList<C24545c> linkedList2 = new LinkedList<>();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean z = false;
                if (!it2.hasNext()) {
                    break;
                }
                C24545c cVar = (C24545c) it2.next();
                if (cVar.f62199U < hVar.f62241b) {
                    int i = cVar.f62192N;
                    if (!(i == 2 || i == 3)) {
                        z = true;
                    }
                    if (z) {
                        linkedList.add(cVar.getId());
                        linkedList2.add(cVar);
                    }
                }
            }
            if (linkedList.isEmpty()) {
                hVar.toString();
                try {
                    this.f63188b.mo58271f(hVar);
                } catch (DatabaseHelper.DBException e) {
                    String j = C13437d.m33705j(C25018b.class, new StringBuilder(), "#processBust");
                    VungleLogger.m57029b(j, "Cannot delete obsolete bust " + hVar + " because of " + e);
                }
            } else {
                hVar.f62243d = (String[]) linkedList.toArray(f63186d);
                for (C24545c cVar2 : linkedList2) {
                    try {
                        cVar2.getClass();
                        this.f63189c.mo58099d(cVar2.getId());
                        this.f63188b.mo58272g(cVar2.getId());
                        C23192a aVar3 = this.f63188b;
                        aVar3.getClass();
                        C24566m mVar = (C24566m) aVar3.mo58281p(C24566m.class, cVar2.f62193O).get();
                        if (mVar != null) {
                            new AdConfig().mo58262b(mVar.mo60831a());
                            if (mVar.mo60833c()) {
                                this.f63189c.mo58106m(mVar, mVar.mo60831a(), 0, false);
                            } else if (mVar.mo60832b()) {
                                this.f63189c.mo58105l(new C23097c.C23105g(new AdRequest(mVar.f62257a, (AdMarkup) null, false), mVar.mo60831a(), 0, 2000, 5, 1, 0, false, mVar.f62262f, new C23258z[0]));
                            }
                        }
                        hVar.f62244e = System.currentTimeMillis();
                        this.f63188b.mo58288w(hVar);
                    } catch (DatabaseHelper.DBException unused) {
                        Objects.toString(cVar2);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo61558d(Bundle bundle, C24559j jVar) throws DatabaseHelper.DBException {
        long j = bundle.getLong("cache_bust_interval");
        if (j != 0) {
            jVar.mo60827d(Long.valueOf(SystemClock.elapsedRealtime() + j), "next_cache_bust");
        }
        this.f63188b.mo58288w(jVar);
    }
}
