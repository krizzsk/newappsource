package p451du;

import com.moovit.app.linedetail.p416ui.LineDetailMapFragment;
import com.moovit.commons.geo.BoxE6;
import com.moovit.map.MapFragment;
import p950yw.C20779f;

/* renamed from: du.m */
public final /* synthetic */ class C16716m implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ int f43527a;

    /* renamed from: b */
    public final /* synthetic */ Object f43528b;

    /* renamed from: c */
    public final /* synthetic */ Object f43529c;

    public /* synthetic */ C16716m(int i, Object obj, Object obj2) {
        this.f43527a = i;
        this.f43528b = obj;
        this.f43529c = obj2;
    }

    /* renamed from: a */
    public final void mo21406a() {
        switch (this.f43527a) {
            case 0:
                int i = LineDetailMapFragment.f38746Y0;
                ((LineDetailMapFragment) this.f43528b).mo45431w3((BoxE6) this.f43529c);
                return;
            default:
                ((C20779f) this.f43528b).mo52908a((Runnable) this.f43529c);
                return;
        }
    }
}
