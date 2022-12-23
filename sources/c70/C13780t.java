package c70;

import c70.C13746a;
import c70.C13747b;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.metroentities.MetroEntityType;
import g30.C4776h;
import i30.C5265a;
import i30.C5267c;
import i30.C5268d;
import i30.C5269e;
import i30.C5276j;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Collections;
import k40.C5479c;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import p824tp.C19728f;
import p906wz.C20431c;
import vi0.C25121g;

/* renamed from: c70.t */
public abstract class C13780t<RQ extends C13746a<RQ, RS>, RS extends C13780t<RQ, RS, RO>, RO extends TBase<?, ?>> extends C13747b<RQ, RS> {

    /* renamed from: i */
    public final Class<RO> f33925i;

    /* renamed from: j */
    public Collection<? extends C13753f<?>> f33926j = Collections.emptySet();

    /* renamed from: k */
    public RO f33927k = null;

    /* renamed from: l */
    public String f33928l = null;

    public C13780t(Class<RO> cls) {
        this.f33925i = cls;
    }

    /* renamed from: b */
    public final void mo5817b(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        try {
            mo40710k((C13746a) cVar, httpURLConnection, C5479c.m13664a(httpURLConnection, bufferedInputStream));
        } catch (TTransportException e) {
            throw new IOException(e);
        } catch (TException e2) {
            throw new BadResponseException((Exception) e2);
        }
    }

    /* renamed from: d */
    public final void mo40670d(C13747b.C13748a aVar) throws IOException, BadResponseException, ServerException {
        mo40711n((C13746a) this.f51773b, this.f33927k, aVar);
    }

    /* renamed from: e */
    public final Collection<? extends C13753f<?>> mo40671e() {
        return this.f33926j;
    }

    /* renamed from: g */
    public C5265a<?, ?> mo40706g(RQ rq, HttpURLConnection httpURLConnection, C5269e eVar) {
        String path = httpURLConnection.getURL().getPath();
        C13752e eVar2 = rq.f33829q;
        C4776h hVar = C19728f.m47195a(eVar2.f33852a).f50165a;
        C21100e.m49373x(path, "source");
        C21100e.m49373x(hVar, "metroInfo");
        return new C5267c(eVar2, path, hVar, eVar);
    }

    /* renamed from: h */
    public C5276j mo40707h(RQ rq, RO ro) {
        return null;
    }

    /* renamed from: i */
    public C5269e mo40708i(C13746a aVar, TBase tBase) {
        return null;
    }

    /* renamed from: j */
    public C5269e mo40709j(C13746a aVar, TBase tBase) {
        return null;
    }

    /* renamed from: k */
    public final void mo40710k(RQ rq, HttpURLConnection httpURLConnection, C25121g gVar) throws IOException, TException, BadResponseException, ServerException {
        try {
            TBase tBase = (TBase) this.f33925i.newInstance();
            tBase.mo25201C1(gVar);
            mo22675l(rq, httpURLConnection, tBase);
        } catch (InstantiationException e) {
            StringBuilder k = C13555b.m33972k("Unable to instantiate ");
            k.append(this.f33925i);
            throw new ApplicationBugException(k.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder k2 = C13555b.m33972k("Unable to access");
            k2.append(this.f33925i);
            throw new ApplicationBugException(k2.toString(), e2);
        }
    }

    /* renamed from: l */
    public void mo22675l(RQ rq, HttpURLConnection httpURLConnection, RO ro) throws IOException, BadResponseException, ServerException {
        Collection<? extends C13753f<?>> collection;
        C5269e i = mo40708i(rq, ro);
        if (i == null) {
            collection = Collections.emptyList();
        } else {
            C5269e j = mo40709j(rq, ro);
            if (j != null) {
                for (MetroEntityType next : j.mo21069e()) {
                    i.mo21070i(next, j.mo21068d(next));
                }
            }
            if (i.isEmpty()) {
                collection = Collections.emptyList();
            } else {
                C5265a<?, ?> g = mo40706g(rq, httpURLConnection, i);
                String O = g.mo21061O();
                this.f33928l = O;
                collection = Collections.singleton(new C13753f(O, g));
            }
        }
        this.f33926j = collection;
        if (collection.isEmpty()) {
            mo40711n(rq, ro, C13747b.C13748a.f33836b);
        } else {
            this.f33927k = ro;
        }
    }

    /* renamed from: m */
    public void mo5816m(RQ rq, RO ro) throws IOException, BadResponseException, ServerException {
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40711n(RQ r7, RO r8, c70.C13747b.C13748a r9) throws java.io.IOException, com.moovit.commons.request.BadResponseException, com.moovit.commons.request.ServerException {
        /*
            r6 = this;
            java.lang.String r0 = r6.f33928l
            r1 = 1
            if (r0 == 0) goto L_0x003b
            java.util.Map<java.lang.String, zz.i0<wz.c<?, ?>, java.util.List<wz.g<?, ?>>>> r2 = r9.f33837a
            java.lang.Object r0 = r2.get(r0)
            zz.i0 r0 = (p977zz.C20944i0) r0
            F r0 = r0.f52692a
            wz.c r0 = (p906wz.C20431c) r0
            i30.a r0 = (i30.C5265a) r0
            r0.getClass()
            boolean r2 = r0 instanceof i30.C5274h
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x003b
            i30.e r2 = r0.f17398x
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0024
            goto L_0x003b
        L_0x0024:
            com.moovit.commons.request.BadResponseException r7 = new com.moovit.commons.request.BadResponseException
            java.lang.String r8 = "Can not supply missing sync items: "
            java.lang.StringBuilder r8 = p379.C13555b.m33972k(r8)
            java.lang.String r9 = r0.mo21061O()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x003b:
            i30.j r0 = r6.mo40707h(r7, r8)
            java.lang.String r2 = r6.f33928l
            if (r2 == 0) goto L_0x004e
            java.util.Map<java.lang.String, zz.i0<wz.c<?, ?>, java.util.List<wz.g<?, ?>>>> r2 = r9.f33837a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = 0
            goto L_0x004f
        L_0x004e:
            r2 = 1
        L_0x004f:
            if (r0 == 0) goto L_0x0071
            java.util.Set<com.moovit.transit.TransitStop> r3 = r0.f17424a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.util.Set<com.moovit.transit.TransitLineGroup> r3 = r0.f17425b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            java.util.Set<com.moovit.transit.Shape> r3 = r0.f17426c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x006b
            r3 = 1
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            if (r3 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r3 = 0
            goto L_0x0072
        L_0x0071:
            r3 = 1
        L_0x0072:
            if (r2 == 0) goto L_0x007a
            if (r3 == 0) goto L_0x007a
            i30.d r9 = i30.C5268d.f17403i
            goto L_0x0112
        L_0x007a:
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap r4 = new com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap
            r4.<init>()
            if (r2 != 0) goto L_0x00b0
            java.lang.String r2 = r6.f33928l
            java.util.Map<java.lang.String, zz.i0<wz.c<?, ?>, java.util.List<wz.g<?, ?>>>> r9 = r9.f33837a
            java.lang.Object r9 = r9.get(r2)
            zz.i0 r9 = (p977zz.C20944i0) r9
            S r9 = r9.f52693b
            java.util.List r9 = (java.util.List) r9
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x0097:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00b0
            java.lang.Object r2 = r9.next()
            wz.g r2 = (p906wz.C20436g) r2
            i30.b r2 = (i30.C5266b) r2
            com.moovit.metroentities.MetroEntityType r5 = r2.f17401m
            j40.a r2 = r2.f17402n
            r4.mo47007p(r5, r2)
            r4.mo47001a(r5, r2)
            goto L_0x0097
        L_0x00b0:
            if (r3 != 0) goto L_0x010d
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap r9 = new com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap
            r9.<init>()
            java.util.Set<com.moovit.transit.TransitStop> r2 = r0.f17424a
            com.moovit.metroentities.MetroEntityType r3 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP
            r4.mo47002b(r3, r2)
            r9.mo47002b(r3, r2)
            java.util.Set<com.moovit.transit.TransitLineGroup> r2 = r0.f17425b
            com.moovit.metroentities.MetroEntityType r3 = com.moovit.metroentities.MetroEntityType.TRANSIT_LINE_GROUP
            r4.mo47002b(r3, r2)
            r9.mo47002b(r3, r2)
            java.util.Set<com.moovit.transit.Shape> r0 = r0.f17426c
            com.moovit.metroentities.MetroEntityType r2 = com.moovit.metroentities.MetroEntityType.SHAPE
            r4.mo47002b(r2, r0)
            r9.mo47002b(r2, r0)
            com.moovit.MoovitApplication<?, ?, ?> r0 = com.moovit.MoovitApplication.f37317k
            tp.i r0 = r0.mo44558j()
            RQ r2 = r6.f51773b
            android.content.Context r2 = r2.f51759b
            tp.f r2 = p824tp.C19728f.m47195a(r2)
            s00.d r0 = r0.mo52086d(r2)
            java.lang.String r2 = r6.f33835h
            if (r2 == 0) goto L_0x00fa
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r3 = "cache"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r1 = 0
        L_0x00fb:
            if (r1 != 0) goto L_0x010d
            com.moovit.database.DatabaseJobQueue r1 = com.moovit.database.DatabaseJobQueue.get()
            j30.i r2 = new j30.i
            RQ r3 = r6.f51773b
            android.content.Context r3 = r3.f51759b
            r2.<init>(r3, r0, r9)
            r1.postJob(r2)
        L_0x010d:
            i30.d r9 = new i30.d
            r9.<init>(r4)
        L_0x0112:
            r6.mo40712p(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c70.C13780t.mo40711n(c70.a, org.apache.thrift.TBase, c70.b$a):void");
    }

    /* renamed from: p */
    public void mo40712p(RQ rq, RO ro, C5268d dVar) throws IOException, BadResponseException, ServerException {
        mo5816m(rq, ro);
    }

    public String toString() {
        RO ro = this.f33927k;
        if (ro != null) {
            return ro.toString();
        }
        return "";
    }
}
