package xa0;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import na0.C12930h;
import oa0.C12974i;

/* renamed from: xa0.b */
public abstract class C13244b {

    /* renamed from: a */
    public int f32865a = 0;

    /* renamed from: b */
    public final C13245a f32866b = new C13245a(this);

    /* renamed from: xa0.b$a */
    public static class C13245a extends Handler {

        /* renamed from: a */
        public final WeakReference<C13244b> f32867a;

        public C13245a(C13244b bVar) {
            this.f32867a = new WeakReference<>(bVar);
        }

        public final void handleMessage(Message message) {
            boolean z;
            C13244b bVar = this.f32867a.get();
            if (bVar != null) {
                int i = message.what;
                if (i == 0) {
                    bVar.mo40117c(message.arg1);
                } else if (i == 1) {
                    C12930h hVar = (C12930h) message.obj;
                    double d = hVar.f32028a;
                    double d2 = hVar.f32029b;
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.mo40116b(d, d2, z);
                } else if (i == 2) {
                    bVar.mo40121g((C13246b) message.obj);
                } else if (i == 3) {
                    C12974i iVar = (C12974i) message.obj;
                    bVar.mo40115a();
                } else if (i == 6) {
                    bVar.mo40124j((C13246b) message.obj);
                } else if (i == 7) {
                    bVar.mo40125k((C13246b) message.obj);
                } else if (i == 8) {
                    bVar.mo40122h((C13246b) message.obj);
                }
            }
        }
    }

    /* renamed from: xa0.b$b */
    public static class C13246b {

        /* renamed from: a */
        public final List<C12974i> f32868a;

        /* renamed from: b */
        public final double f32869b;

        /* renamed from: c */
        public final double f32870c;

        /* renamed from: d */
        public final boolean f32871d;

        public C13246b() {
            throw null;
        }

        public C13246b(ArrayList arrayList, double d, double d2) {
            this(arrayList, d, d2, false);
        }

        public C13246b(List<C12974i> list, double d, double d2, boolean z) {
            this.f32868a = list;
            this.f32869b = d;
            this.f32870c = d2;
            this.f32871d = z;
        }
    }

    /* renamed from: a */
    public abstract void mo40115a();

    /* renamed from: b */
    public abstract void mo40116b(double d, double d2, boolean z);

    /* renamed from: c */
    public abstract void mo40117c(int i);

    /* renamed from: d */
    public void mo40118d() {
    }

    /* renamed from: e */
    public void mo40119e() {
    }

    /* renamed from: f */
    public void mo40120f() {
    }

    /* renamed from: g */
    public abstract void mo40121g(C13246b bVar);

    /* renamed from: h */
    public abstract void mo40122h(C13246b bVar);

    /* renamed from: i */
    public final void mo40123i(List<C12974i> list) {
        Message message = new Message();
        message.what = 8;
        message.obj = new C13246b(list, -1.0d, -1.0d, false);
        this.f32866b.sendMessage(message);
    }

    /* renamed from: j */
    public abstract void mo40124j(C13246b bVar);

    /* renamed from: k */
    public abstract void mo40125k(C13246b bVar);
}
