package na0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import ma0.C12895a;
import ma0.C12902c;
import va0.C13189b;
import xa0.C13244b;
import ya0.C13288j;

/* renamed from: na0.j */
public final class C12932j {

    /* renamed from: a */
    public volatile boolean f32034a;

    /* renamed from: b */
    public volatile float f32035b;

    /* renamed from: c */
    public volatile C12924c f32036c = new C12924c(-1);

    /* renamed from: d */
    public volatile float f32037d = 8.0f;

    /* renamed from: e */
    public volatile boolean f32038e;

    /* renamed from: f */
    public volatile boolean f32039f;

    /* renamed from: g */
    public volatile boolean f32040g;

    /* renamed from: h */
    public volatile boolean f32041h;

    /* renamed from: i */
    public volatile boolean f32042i = true;

    /* renamed from: j */
    public volatile boolean f32043j = true;

    /* renamed from: k */
    public volatile int f32044k = 256;

    /* renamed from: l */
    public volatile float f32045l = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: m */
    public volatile boolean f32046m;

    /* renamed from: n */
    public volatile boolean f32047n;

    /* renamed from: o */
    public volatile int f32048o = 0;

    /* renamed from: p */
    public volatile boolean f32049p = true;

    /* renamed from: q */
    public volatile boolean f32050q = true;

    /* renamed from: r */
    public float f32051r;

    /* renamed from: s */
    public volatile boolean f32052s = true;

    /* renamed from: t */
    public volatile boolean f32053t = false;

    /* renamed from: u */
    public final C12925d f32054u;

    /* renamed from: v */
    public C13244b f32055v;

    /* renamed from: na0.j$a */
    public static class C12933a implements C13189b.C13191b {

        /* renamed from: a */
        public WeakReference<C13244b> f32056a;

        public C12933a(C13244b bVar) {
            this.f32056a = new WeakReference<>(bVar);
        }
    }

    public C12932j(C12925d dVar) {
        new C12924c(-5066062);
        this.f32054u = dVar;
        this.f32035b = (float) Math.tan((double) ((C13288j.m33427b(130.0f, 120.0f, 160.0f) * 0.017453292f) / 2.0f));
        C12902c cVar = dVar.f32004b;
        synchronized (cVar) {
            cVar.f31924a = 15728640;
            cVar.f31927d.mo40147e();
        }
        C12895a aVar = dVar.f32005c;
        synchronized (aVar) {
            aVar.f31909a = 5242880;
            aVar.f31911c.mo40147e();
        }
    }
}
