package p608kl;

import com.google.android.play.core.assetpacks.C14291m0;
import p364al.C13487h;
import p610kn.C18107a;
import p703ol.C18783c;
import p725pj.C18926a;
import p727pl.C18932b;
import w10.C20268a;

/* renamed from: kl.b */
public final class C18092b {

    /* renamed from: a */
    public final C18783c f46249a;

    /* renamed from: b */
    public final C18932b f46250b;

    /* renamed from: c */
    public final C20268a f46251c;

    /* renamed from: d */
    public final C14291m0 f46252d;

    /* renamed from: e */
    public final Object f46253e = new Object();

    /* renamed from: f */
    public C18107a f46254f;

    public C18092b(C18783c cVar, C18932b bVar, C20268a aVar, C14291m0 m0Var) {
        this.f46249a = cVar;
        this.f46250b = bVar;
        this.f46251c = aVar;
        this.f46252d = m0Var;
    }

    /* renamed from: a */
    public final C13487h<C18107a> mo50540a() {
        synchronized (this.f46253e) {
            if (this.f46254f == null) {
                C13487h<C18107a> a = this.f46249a.mo51265a();
                if (a.mo40399a()) {
                    return a;
                }
                this.f46254f = (C18107a) a.f33365a;
            }
            C13487h<C18107a> hVar = new C13487h<>(this.f46254f, (C18926a) null);
            return hVar;
        }
    }
}
