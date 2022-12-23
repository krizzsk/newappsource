package p775ro;

import android.graphics.Bitmap;
import com.masabi.justride.sdk.jobs.barcode.C14654a;
import p364al.C13483d;
import p364al.C13487h;
import p434dd.C16545c;
import p465ek.C16836d;
import p725pj.C18926a;
import p750ql.C19139e;
import p752qn.C19144b;

/* renamed from: ro.i */
public final /* synthetic */ class C19304i implements C13483d {

    /* renamed from: a */
    public final /* synthetic */ C19139e f49102a;

    public /* synthetic */ C19304i(C19139e eVar) {
        this.f49102a = eVar;
    }

    /* renamed from: C */
    public final C13487h mo40394C() {
        C19139e eVar = this.f49102a;
        C13487h<C14654a> a = eVar.f48659a.mo51575a(eVar.f48661c);
        if (a.mo40399a()) {
            return new C13487h(null, a.f33366b);
        }
        boolean z = false;
        C16545c c = ((C14654a) a.f33365a).mo44345c(false);
        Object obj = c.f43181b;
        if (((C18926a) obj) != null) {
            z = true;
        }
        if (z) {
            return new C13487h(null, (C18926a) obj);
        }
        C19144b bVar = (C19144b) c.f43180a;
        if (!bVar.f48684g) {
            return new C13487h(null, new C16836d((Integer) 102, "Null payload"));
        }
        C13487h<Bitmap> a2 = eVar.f48660b.mo51574a(bVar.f48678a, eVar.f48662d, eVar.f48663e);
        if (a2.mo40399a()) {
            return new C13487h(null, a2.f33366b);
        }
        return a2;
    }
}
