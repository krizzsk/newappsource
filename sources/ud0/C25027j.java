package ud0;

import android.os.Bundle;
import java.io.File;
import java.util.Arrays;
import nd0.C24483b;
import nd0.C24486e;
import nd0.C24491g;

/* renamed from: ud0.j */
public final class C25027j implements C25021e {

    /* renamed from: b */
    public static final /* synthetic */ int f63208b = 0;

    /* renamed from: a */
    public C24486e f63209a;

    public C25027j(C24486e eVar) {
        this.f63209a = eVar;
    }

    /* renamed from: a */
    public final int mo61555a(Bundle bundle, C25024h hVar) {
        File[] c;
        File[] fileArr;
        C24486e eVar = this.f63209a;
        if (eVar.f61980g.get()) {
            C24491g gVar = eVar.f61974a;
            int i = eVar.f61982i.get();
            File[] c2 = gVar.mo60729c("_crash");
            if (c2 == null || c2.length == 0) {
                fileArr = null;
            } else {
                Arrays.sort(c2, new C24483b());
                fileArr = (File[]) Arrays.copyOfRange(c2, 0, Math.min(c2.length, i));
            }
            if (!(fileArr == null || fileArr.length == 0)) {
                eVar.f61975b.mo60744a(fileArr);
            }
        }
        if (!(!eVar.f61979f.get() || (c = eVar.f61974a.mo60729c("_pending")) == null || c.length == 0)) {
            eVar.f61975b.mo60744a(c);
        }
        return 0;
    }
}
