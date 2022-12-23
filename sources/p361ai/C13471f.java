package p361ai;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p361ai.C13466b;
import p406cg.C13815e;
import p626lf.C18201b;
import p936yh.C20728a;
import p936yh.C20729b;

/* renamed from: ai.f */
public final class C13471f implements C20728a, C13466b.C13467a {

    /* renamed from: f */
    public static C13471f f33343f;

    /* renamed from: a */
    public float f33344a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b */
    public final C13815e f33345b;

    /* renamed from: c */
    public final C18201b f33346c;

    /* renamed from: d */
    public C20729b f33347d;

    /* renamed from: e */
    public C13465a f33348e;

    public C13471f(C13815e eVar, C18201b bVar) {
        this.f33345b = eVar;
        this.f33346c = bVar;
    }

    /* renamed from: a */
    public static C13471f m33792a() {
        if (f33343f == null) {
            f33343f = new C13471f(new C13815e(), new C18201b());
        }
        return f33343f;
    }
}
