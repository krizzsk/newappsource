package p100gb;

import java.io.IOException;
import p100gb.C4995u;

/* renamed from: gb.r */
public final /* synthetic */ class C4992r implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C4995u.C4996a f16869b;

    /* renamed from: c */
    public final /* synthetic */ C4995u f16870c;

    /* renamed from: d */
    public final /* synthetic */ C4978i f16871d;

    /* renamed from: e */
    public final /* synthetic */ C4983l f16872e;

    /* renamed from: f */
    public final /* synthetic */ IOException f16873f;

    /* renamed from: g */
    public final /* synthetic */ boolean f16874g;

    public /* synthetic */ C4992r(C4995u.C4996a aVar, C4995u uVar, C4978i iVar, C4983l lVar, IOException iOException, boolean z) {
        this.f16869b = aVar;
        this.f16870c = uVar;
        this.f16871d = iVar;
        this.f16872e = lVar;
        this.f16873f = iOException;
        this.f16874g = z;
    }

    public final void run() {
        C4995u.C4996a aVar = this.f16869b;
        this.f16870c.mo20588T(aVar.f16885a, aVar.f16886b, this.f16871d, this.f16872e, this.f16873f, this.f16874g);
    }
}
