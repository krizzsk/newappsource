package ud0;

import android.os.Bundle;
import com.vungle.warren.AdRequest;
import com.vungle.warren.C23097c;
import com.vungle.warren.C23252x1;
import java.util.Collection;

/* renamed from: ud0.d */
public final class C25020d implements C25021e {

    /* renamed from: c */
    public static final /* synthetic */ int f63194c = 0;

    /* renamed from: a */
    public final C23097c f63195a;

    /* renamed from: b */
    public final C23252x1 f63196b;

    public C25020d(C23097c cVar, C23252x1 x1Var) {
        this.f63195a = cVar;
        this.f63196b = x1Var;
    }

    /* renamed from: a */
    public final int mo61555a(Bundle bundle, C25024h hVar) {
        AdRequest adRequest = (AdRequest) bundle.getSerializable("request");
        Collection<String> a = this.f63196b.mo58353a();
        if (adRequest == null || !a.contains(adRequest.mo58041f())) {
            return 1;
        }
        C23097c cVar = this.f63195a;
        C23097c.C23105g gVar = (C23097c.C23105g) cVar.f58616b.remove(adRequest);
        if (gVar == null) {
            return 0;
        }
        cVar.mo58105l(gVar.mo58124a(0));
        return 0;
    }
}
