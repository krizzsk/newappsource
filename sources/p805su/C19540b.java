package p805su;

import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import com.moovit.app.mot.purchase.model.MotQrCodeStationFare;
import com.moovit.map.MapFragment;
import p589jq.C17916h;
import p805su.C19544f;

/* renamed from: su.b */
public final /* synthetic */ class C19540b implements MapFragment.C16238s {

    /* renamed from: b */
    public final /* synthetic */ C19544f f49649b;

    public /* synthetic */ C19540b(C19544f fVar) {
        this.f49649b = fVar;
    }

    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        C19544f fVar = this.f49649b;
        int i = C19544f.f49659s;
        fVar.getClass();
        if (obj instanceof MotQrCodeStationFare) {
            MotQrCodeStationFare motQrCodeStationFare = (MotQrCodeStationFare) obj;
            fVar.mo51903s2("mot_dest_stop_map_clicked", motQrCodeStationFare);
            RecyclerView.Adapter adapter = fVar.f49662p.getAdapter();
            if (adapter instanceof C19544f.C19545a) {
                C19544f.C19545a aVar = (C19544f.C19545a) adapter;
                int d = C13717b.m34257d(aVar.f49667i, new C17916h(motQrCodeStationFare.f39069c, 1));
                if (d != -1) {
                    aVar.mo51904j(d, false);
                }
            }
            fVar.mo51901q2(motQrCodeStationFare);
        }
    }
}
