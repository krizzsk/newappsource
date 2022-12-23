package p453dw;

import android.widget.ImageView;
import com.moovit.app.MoovitAppActivity;
import com.moovit.network.model.ServerId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p453dw.C16738n;
import p477ew.C16885a;
import p477ew.C16886b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: dw.m */
public final class C16737m extends C20438i<C16885a, C16886b> {

    /* renamed from: b */
    public final /* synthetic */ ServerId f43586b;

    /* renamed from: c */
    public final /* synthetic */ C16738n f43587c;

    public C16737m(C16738n nVar, ServerId serverId) {
        this.f43587c = nVar;
        this.f43586b = serverId;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        MoovitAppActivity moovitAppActivity;
        C16885a aVar = (C16885a) cVar;
        C16886b bVar = (C16886b) gVar;
        C16738n.C16739a aVar2 = (C16738n.C16739a) this.f43587c.f43590q.getOrDefault(this.f43586b, null);
        if (aVar2 != null && (moovitAppActivity = (MoovitAppActivity) this.f43587c.f40822c) != null && !moovitAppActivity.isDestroyed() && !moovitAppActivity.isFinishing()) {
            C16738n nVar = this.f43587c;
            nVar.getClass();
            aVar2.f43596d = null;
            aVar2.f43594b = bVar.f43909m;
            aVar2.f43595c = bVar.f43910n;
            ArrayList arrayList = aVar2.f43597e;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ImageView imageView = (ImageView) ((WeakReference) it.next()).get();
                    if (imageView != null) {
                        nVar.mo49425z2(aVar2, imageView);
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ boolean mo21415w(C20431c cVar, Exception exc) {
        C16885a aVar = (C16885a) cVar;
        return false;
    }
}
