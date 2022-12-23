package zd0;

import ce0.C21096d;
import com.braze.support.WebContentUtils;
import com.vungle.warren.error.VungleException;
import java.io.File;
import od0.C24545c;
import od0.C24568o;
import yd0.C25291e;

/* renamed from: zd0.f */
public final class C25344f implements C21096d.C21098b {

    /* renamed from: a */
    public final /* synthetic */ File f63704a;

    /* renamed from: b */
    public final /* synthetic */ C25337d f63705b;

    public C25344f(C25337d dVar, File file) {
        this.f63705b = dVar;
        this.f63704a = file;
    }

    /* renamed from: a */
    public final void mo53291a(boolean z) {
        C24568o oVar;
        if (!z) {
            this.f63705b.mo61925p(new VungleException(27));
            this.f63705b.mo61925p(new VungleException(10));
            this.f63705b.f63687n.close();
            return;
        }
        C25291e eVar = this.f63705b.f63687n;
        StringBuilder k = C13555b.m33972k(WebContentUtils.FILE_URI_SCHEME_PREFIX);
        k.append(this.f63704a.getPath());
        eVar.mo53134j(k.toString());
        C25337d dVar = this.f63705b;
        C24545c cVar = (C24545c) dVar.f63685l.mo58281p(C24545c.class, dVar.f63681h.getId()).get();
        if (cVar != null && (oVar = dVar.f63682i) != null) {
            oVar.f62275g = !cVar.f62201Y;
            dVar.f63685l.mo58289x(oVar, dVar.f63693t, true);
        }
    }
}
