package xd0;

import ce0.C21087a;
import com.vungle.warren.C23094b;
import od0.C24566m;
import yd0.C25287b;

/* renamed from: xd0.e */
public final class C25247e implements C21087a.C21092e {

    /* renamed from: a */
    public final C25287b.C25288a f63520a;

    /* renamed from: b */
    public final C24566m f63521b;

    public C25247e(C25287b.C25288a aVar, C24566m mVar) {
        this.f63520a = aVar;
        this.f63521b = mVar;
    }

    /* renamed from: a */
    public final void mo53290a() {
        String str;
        C25287b.C25288a aVar = this.f63520a;
        if (aVar != null) {
            C24566m mVar = this.f63521b;
            if (mVar == null) {
                str = null;
            } else {
                str = mVar.f62257a;
            }
            ((C23094b) aVar).mo58095d("open", "adLeftApplication", str);
        }
    }
}
