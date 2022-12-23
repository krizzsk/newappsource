package p176n0;

import android.content.Intent;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.C0658c;
import androidx.camera.view.C0660d;
import androidx.fragment.app.FragmentActivity;
import p054d0.C4289j0;
import p229r1.C6231a;

/* renamed from: n0.l */
public final /* synthetic */ class C5793l implements C6231a {

    /* renamed from: a */
    public final /* synthetic */ int f18740a;

    /* renamed from: b */
    public final /* synthetic */ Object f18741b;

    public /* synthetic */ C5793l(Object obj, int i) {
        this.f18740a = i;
        this.f18741b = obj;
    }

    public final void accept(Object obj) {
        switch (this.f18740a) {
            case 0:
                C0660d.C0662b bVar = (C0660d.C0662b) this.f18741b;
                SurfaceRequest.C0535e eVar = (SurfaceRequest.C0535e) obj;
                bVar.getClass();
                C4289j0.m11435b("SurfaceViewImpl");
                C0660d dVar = C0660d.this;
                C0658c.C0659a aVar = dVar.f2271g;
                if (aVar != null) {
                    ((C5789h) aVar).mo21664a();
                    dVar.f2271g = null;
                    return;
                }
                return;
            default:
                ((FragmentActivity) this.f18741b).lambda$init$2((Intent) obj);
                return;
        }
    }
}
