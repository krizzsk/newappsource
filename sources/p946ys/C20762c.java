package p946ys;

import androidx.lifecycle.C1043v;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import java.util.UUID;
import l30.C5585p;
import p693nz.C18659h;
import p946ys.C20764e;

/* renamed from: ys.c */
public final /* synthetic */ class C20762c implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f52387b = 1;

    /* renamed from: c */
    public final /* synthetic */ String f52388c;

    /* renamed from: d */
    public final /* synthetic */ Object f52389d;

    /* renamed from: e */
    public final /* synthetic */ Object f52390e;

    /* renamed from: f */
    public final /* synthetic */ Object f52391f;

    public /* synthetic */ C20762c(C5585p pVar, String str, LatLonE6 latLonE6, LatLonE6 latLonE62) {
        this.f52389d = pVar;
        this.f52388c = str;
        this.f52390e = latLonE6;
        this.f52391f = latLonE62;
    }

    public /* synthetic */ C20762c(C20764e eVar, UUID uuid, String str, C1043v vVar) {
        this.f52389d = eVar;
        this.f52390e = uuid;
        this.f52388c = str;
        this.f52391f = vVar;
    }

    public final void onSuccess(Object obj) {
        switch (this.f52387b) {
            case 0:
                C20764e eVar = (C20764e) this.f52389d;
                UUID uuid = (UUID) this.f52390e;
                String str = this.f52388c;
                C1043v vVar = (C1043v) this.f52391f;
                C20764e.C20765a aVar = (C20764e.C20765a) obj;
                eVar.getClass();
                if (aVar.f52401b != null) {
                    eVar.f52398g.put(str, aVar);
                }
                if (uuid.equals(eVar.f52397f.get())) {
                    vVar.postValue(aVar);
                    return;
                }
                return;
            default:
                C5585p pVar = (C5585p) this.f52389d;
                String str2 = this.f52388c;
                C18659h<String, Polyline> hVar = C5585p.f18297h;
                pVar.getClass();
                C5585p.f18297h.put(str2, (Polyline) obj);
                pVar.mo21411d((LatLonE6) this.f52390e, (LatLonE6) this.f52391f);
                return;
        }
    }
}
