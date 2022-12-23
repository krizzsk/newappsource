package p071e5;

import com.airbnb.lottie.model.layer.C1894a;
import p332z4.C7456a;

/* renamed from: e5.a */
public final /* synthetic */ class C4554a implements C7456a.C7457a {

    /* renamed from: a */
    public final /* synthetic */ C1894a f15694a;

    public /* synthetic */ C4554a(C1894a aVar) {
        this.f15694a = aVar;
    }

    /* renamed from: a */
    public final void mo6803a() {
        boolean z;
        C1894a aVar = this.f15694a;
        if (aVar.f6624p.mo23733l() == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z != aVar.f6630v) {
            aVar.f6630v = z;
            aVar.f6621m.invalidateSelf();
        }
    }
}
