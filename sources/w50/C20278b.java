package w50;

import androidx.lifecycle.C1044w;
import java.util.List;

/* renamed from: w50.b */
public final /* synthetic */ class C20278b implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f51417a;

    /* renamed from: b */
    public final /* synthetic */ C20283g f51418b;

    public /* synthetic */ C20278b(C20283g gVar, int i) {
        this.f51417a = i;
        this.f51418b = gVar;
    }

    public final void onChanged(Object obj) {
        boolean z;
        switch (this.f51417a) {
            case 0:
                C20283g gVar = this.f51418b;
                Boolean value = gVar.f51432f.getValue();
                Boolean bool = Boolean.TRUE;
                if (bool.equals((Boolean) obj) || !bool.equals(value)) {
                    z = false;
                } else {
                    z = true;
                }
                gVar.f51433g.postValue(Boolean.valueOf(z));
                return;
            default:
                C20283g gVar2 = this.f51418b;
                gVar2.mo52459k((List) obj, gVar2.f51440n.getValue());
                return;
        }
    }
}
