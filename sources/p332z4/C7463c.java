package p332z4;

import android.graphics.Color;
import com.airbnb.lottie.model.layer.C1894a;
import p037c5.C1780a;
import p037c5.C1781b;
import p094g5.C4811j;
import p120i5.C5281b;
import p120i5.C5282c;
import p309x4.C7155a;
import p332z4.C7456a;

/* renamed from: z4.c */
public final class C7463c implements C7456a.C7457a {

    /* renamed from: a */
    public final C7456a.C7457a f22891a;

    /* renamed from: b */
    public final C7462b f22892b;

    /* renamed from: c */
    public final C7465d f22893c;

    /* renamed from: d */
    public final C7465d f22894d;

    /* renamed from: e */
    public final C7465d f22895e;

    /* renamed from: f */
    public final C7465d f22896f;

    /* renamed from: g */
    public boolean f22897g = true;

    /* renamed from: z4.c$a */
    public class C7464a extends C5282c {

        /* renamed from: d */
        public final /* synthetic */ C5282c f22898d;

        public C7464a(C5282c cVar) {
            this.f22898d = cVar;
        }

        /* renamed from: a */
        public final Object mo21084a(C5281b bVar) {
            Float f = (Float) this.f22898d.mo21084a(bVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public C7463c(C7456a.C7457a aVar, C1894a aVar2, C4811j jVar) {
        this.f22891a = aVar;
        C7456a<Integer, Integer> i = ((C1780a) jVar.f16208a).mo6602i();
        this.f22892b = (C7462b) i;
        i.mo23712a(this);
        aVar2.mo6806e(i);
        C7456a<Float, Float> i2 = ((C1781b) jVar.f16209b).mo6602i();
        this.f22893c = (C7465d) i2;
        i2.mo23712a(this);
        aVar2.mo6806e(i2);
        C7456a<Float, Float> i3 = ((C1781b) jVar.f16210c).mo6602i();
        this.f22894d = (C7465d) i3;
        i3.mo23712a(this);
        aVar2.mo6806e(i3);
        C7456a<Float, Float> i4 = ((C1781b) jVar.f16211d).mo6602i();
        this.f22895e = (C7465d) i4;
        i4.mo23712a(this);
        aVar2.mo6806e(i4);
        C7456a<Float, Float> i5 = ((C1781b) jVar.f16212e).mo6602i();
        this.f22896f = (C7465d) i5;
        i5.mo23712a(this);
        aVar2.mo6806e(i5);
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22897g = true;
        this.f22891a.mo6803a();
    }

    /* renamed from: b */
    public final void mo23731b(C7155a aVar) {
        if (this.f22897g) {
            this.f22897g = false;
            double floatValue = ((double) ((Float) this.f22894d.mo23717f()).floatValue()) * 0.017453292519943295d;
            float floatValue2 = ((Float) this.f22895e.mo23717f()).floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = ((Integer) this.f22892b.mo23717f()).intValue();
            aVar.setShadowLayer(((Float) this.f22896f.mo23717f()).floatValue(), sin, cos, Color.argb(Math.round(((Float) this.f22893c.mo23717f()).floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    /* renamed from: c */
    public final void mo23732c(C5282c cVar) {
        if (cVar == null) {
            this.f22893c.mo23722k((C5282c) null);
        } else {
            this.f22893c.mo23722k(new C7464a(cVar));
        }
    }
}
