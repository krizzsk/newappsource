package p011aa;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p028ba.C1519m;
import p041ca.C1815d;
import p063da.C4407a;
import p176n0.C5794m;
import p237r9.C6274g;
import p275u9.C6735h;
import p275u9.C6738j;
import p275u9.C6756w;
import p288v9.C6877d;

/* renamed from: aa.b */
public final class C0138b implements C0140d {

    /* renamed from: f */
    public static final Logger f397f = Logger.getLogger(C6756w.class.getName());

    /* renamed from: a */
    public final C1519m f398a;

    /* renamed from: b */
    public final Executor f399b;

    /* renamed from: c */
    public final C6877d f400c;

    /* renamed from: d */
    public final C1815d f401d;

    /* renamed from: e */
    public final C4407a f402e;

    public C0138b(Executor executor, C6877d dVar, C1519m mVar, C1815d dVar2, C4407a aVar) {
        this.f399b = executor;
        this.f400c = dVar;
        this.f398a = mVar;
        this.f401d = dVar2;
        this.f402e = aVar;
    }

    /* renamed from: a */
    public final void mo311a(C6274g gVar, C6735h hVar, C6738j jVar) {
        this.f399b.execute(new C5794m(this, jVar, gVar, hVar, 2));
    }
}
