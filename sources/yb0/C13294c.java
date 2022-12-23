package yb0;

import mc0.C12909a;
import mc0.C12912d;
import mf0.C24362h;

/* renamed from: yb0.c */
public final /* synthetic */ class C13294c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13295d f32980b;

    /* renamed from: c */
    public final /* synthetic */ C12912d f32981c;

    /* renamed from: d */
    public final /* synthetic */ boolean f32982d;

    /* renamed from: e */
    public final /* synthetic */ String f32983e;

    /* renamed from: f */
    public final /* synthetic */ C12909a f32984f;

    public /* synthetic */ C13294c(C13295d dVar, C12912d dVar2, boolean z, String str, C12909a aVar) {
        this.f32980b = dVar;
        this.f32981c = dVar2;
        this.f32982d = z;
        this.f32983e = str;
        this.f32984f = aVar;
    }

    public final void run() {
        C13295d dVar = this.f32980b;
        C12912d dVar2 = this.f32981c;
        boolean z = this.f32982d;
        String str = this.f32983e;
        C12909a aVar = this.f32984f;
        C24362h.m61211f(dVar, "this$0");
        C24362h.m61211f(dVar2, "$bannerInfo");
        C24362h.m61211f(str, "$spotId");
        C24362h.m61211f(aVar, "$adInfo");
        C13295d.m33436Q(dVar2, z);
        dVar.f32988e.mo51268d(str, aVar);
    }
}
