package w50;

import androidx.lifecycle.C1044w;

/* renamed from: w50.d */
public final /* synthetic */ class C20280d implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f51421a;

    /* renamed from: b */
    public final /* synthetic */ C20283g f51422b;

    public /* synthetic */ C20280d(C20283g gVar, int i) {
        this.f51421a = i;
        this.f51422b = gVar;
    }

    public final void onChanged(Object obj) {
        switch (this.f51421a) {
            case 0:
                C20283g gVar = this.f51422b;
                gVar.mo52458j(gVar.f51433g.getValue(), gVar.f51437k.getValue(), (Boolean) obj);
                return;
            default:
                C20283g gVar2 = this.f51422b;
                gVar2.mo52458j((Boolean) obj, gVar2.f51437k.getValue(), gVar2.f51442p.getValue());
                return;
        }
    }
}
