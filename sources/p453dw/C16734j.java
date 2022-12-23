package p453dw;

import androidx.appcompat.widget.SearchView;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.app.stopdetail.StopDetailActivity;
import java.util.Iterator;
import p241s0.C6307g;

/* renamed from: dw.j */
public final class C16734j implements SearchView.C0366m {

    /* renamed from: b */
    public final /* synthetic */ StopDetailActivity f43582b;

    public C16734j(StopDetailActivity stopDetailActivity) {
        this.f43582b = stopDetailActivity;
    }

    /* renamed from: A */
    public final void mo1843A(String str) {
        C15340c cVar = this.f43582b.f39662p0;
        if (cVar != null) {
            Iterator it = ((C6307g.C6312e) cVar.f39708m.values()).iterator();
            while (true) {
                C6307g.C6308a aVar = (C6307g.C6308a) it;
                if (aVar.hasNext()) {
                    C15340c.C15349i iVar = (C15340c.C15349i) aVar.next();
                    if (iVar.mo45893f()) {
                        iVar.mo45890b(str);
                    }
                } else {
                    cVar.f39713r = null;
                    cVar.notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    /* renamed from: J */
    public final boolean mo1844J(String str) {
        return false;
    }
}
