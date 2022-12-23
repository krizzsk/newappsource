package p028ba;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.C3865a;
import h60.C17327j1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import p032c0.C1754d;
import p041ca.C1813c;
import p041ca.C1815d;
import p041ca.C1824j;
import p054d0.C4294m;
import p063da.C4407a;
import p075ea.C4614a;
import p237r9.C6269b;
import p275u9.C6735h;
import p275u9.C6742m;
import p275u9.C6747p;
import p275u9.C6751s;
import p288v9.C6874a;
import p288v9.C6877d;
import p288v9.C6885k;
import p325y9.C7348a;
import p337z9.C7506a;
import p861ve.C20114e;

/* renamed from: ba.i */
public final class C1515i {

    /* renamed from: a */
    public final Context f5442a;

    /* renamed from: b */
    public final C6877d f5443b;

    /* renamed from: c */
    public final C1815d f5444c;

    /* renamed from: d */
    public final C1519m f5445d;

    /* renamed from: e */
    public final Executor f5446e;

    /* renamed from: f */
    public final C4407a f5447f;

    /* renamed from: g */
    public final C4614a f5448g;

    /* renamed from: h */
    public final C4614a f5449h;

    /* renamed from: i */
    public final C1813c f5450i;

    public C1515i(Context context, C6877d dVar, C1815d dVar2, C1519m mVar, Executor executor, C4407a aVar, C4614a aVar2, C4614a aVar3, C1813c cVar) {
        this.f5442a = context;
        this.f5443b = dVar;
        this.f5444c = dVar2;
        this.f5445d = mVar;
        this.f5446e = executor;
        this.f5447f = aVar;
        this.f5448g = aVar2;
        this.f5449h = aVar3;
        this.f5450i = cVar;
    }

    /* renamed from: a */
    public final void mo5860a(C6751s sVar, int i) {
        C3865a aVar;
        boolean z;
        C6885k kVar = this.f5443b.get(sVar.mo22910b());
        new C3865a(BackendResponse.Status.OK, 0);
        long j = 0;
        while (((Boolean) this.f5447f.mo6658a(new C4294m(2, this, sVar))).booleanValue()) {
            Iterable<C1824j> iterable = (Iterable) this.f5447f.mo6658a(new C1510d(0, this, sVar));
            if (iterable.iterator().hasNext()) {
                boolean z2 = true;
                if (kVar == null) {
                    C7506a.m17226a("Uploader", "Unknown backend for %s, deleting event batch for it...", sVar);
                    aVar = new C3865a(BackendResponse.Status.FATAL_ERROR, -1);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C1824j a : iterable) {
                        arrayList.add(a.mo6631a());
                    }
                    if (sVar.mo22911c() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C4407a aVar2 = this.f5447f;
                        C1813c cVar = this.f5450i;
                        Objects.requireNonNull(cVar);
                        C7348a aVar3 = (C7348a) aVar2.mo6658a(new C17327j1(cVar, 2));
                        C6735h.C6736a aVar4 = new C6735h.C6736a();
                        aVar4.f20857f = new HashMap();
                        aVar4.f20855d = Long.valueOf(this.f5448g.mo20139V());
                        aVar4.f20856e = Long.valueOf(this.f5449h.mo20139V());
                        aVar4.mo22901d("GDT_CLIENT_METRICS");
                        C6269b bVar = new C6269b("proto");
                        aVar3.getClass();
                        C20114e eVar = C6747p.f20877a;
                        eVar.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            eVar.mo52353a(aVar3, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        aVar4.mo22900c(new C6742m(bVar, byteArrayOutputStream.toByteArray()));
                        arrayList.add(kVar.mo22594a(aVar4.mo22899b()));
                    }
                    aVar = kVar.mo22595b(new C6874a(arrayList, sVar.mo22911c()));
                }
                if (aVar.f13386a == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f5447f.mo6658a(new C1511e(this, iterable, sVar, j));
                    this.f5445d.mo5854b(sVar, i + 1, true);
                    return;
                }
                this.f5447f.mo6658a(new C1512f(0, this, iterable));
                BackendResponse.Status status = aVar.f13386a;
                if (status == BackendResponse.Status.OK) {
                    j = Math.max(j, aVar.f13387b);
                    if (sVar.mo22911c() == null) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f5447f.mo6658a(new C1513g(this, 0));
                    }
                } else if (status == BackendResponse.Status.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C1824j a2 : iterable) {
                        String g = a2.mo6631a().mo22895g();
                        if (!hashMap.containsKey(g)) {
                            hashMap.put(g, 1);
                        } else {
                            hashMap.put(g, Integer.valueOf(((Integer) hashMap.get(g)).intValue() + 1));
                        }
                    }
                    this.f5447f.mo6658a(new C1754d(1, this, hashMap));
                }
            } else {
                return;
            }
        }
        this.f5447f.mo6658a(new C1514h(this, sVar, j));
    }
}
