package p878vv;

import com.moovit.app.search.locations.C15284a;
import com.moovit.home.lines.search.C16007c;
import com.moovit.network.model.ServerId;
import p669mz.C18487d;

/* renamed from: vv.a */
public final /* synthetic */ class C20234a implements C18487d.C18488a {

    /* renamed from: a */
    public final /* synthetic */ int f51337a;

    /* renamed from: b */
    public final /* synthetic */ Object f51338b;

    public /* synthetic */ C20234a(Object obj, int i) {
        this.f51337a = i;
        this.f51338b = obj;
    }

    /* renamed from: a */
    public final void mo23774a(C18487d dVar) {
        switch (this.f51337a) {
            case 0:
                ServerId serverId = C15284a.f39471U;
                ((C15284a) this.f51338b).mo45830x2();
                return;
            default:
                ((C16007c) this.f51338b).onContentChanged();
                return;
        }
    }
}
