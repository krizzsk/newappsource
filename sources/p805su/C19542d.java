package p805su;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.model.MotQrCodeStationFare;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.commons.geo.Polyline;
import com.moovit.map.MapFragment;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import j90.C12789b;
import ja0.C12798g;
import java.util.ArrayList;
import k90.C12820b;
import m80.C12869e;
import o00.C18681n;
import p001a0.C0017h;
import p543hq.C17474b;
import p664mu.C18435a;
import p664mu.C18437c;
import p781ru.C19329b;
import p781ru.C19331d;
import p805su.C19544f;
import p808sx.C19566b;
import p824tp.C19728f;
import p977zz.C20944i0;

/* renamed from: su.d */
public final /* synthetic */ class C19542d implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f49654b;

    /* renamed from: c */
    public final /* synthetic */ Object f49655c;

    /* renamed from: d */
    public final /* synthetic */ Object f49656d;

    public /* synthetic */ C19542d(int i, Object obj, Object obj2) {
        this.f49654b = i;
        this.f49655c = obj;
        this.f49656d = obj2;
    }

    public final void onSuccess(Object obj) {
        switch (this.f49654b) {
            case 0:
                C19544f fVar = (C19544f) this.f49655c;
                C19728f fVar2 = (C19728f) this.f49656d;
                C20944i0 i0Var = (C20944i0) obj;
                int i = C19544f.f49659s;
                fVar.getClass();
                C19331d dVar = (C19331d) i0Var.f52692a;
                C19329b bVar = (C19329b) i0Var.f52693b;
                if (dVar == null) {
                    fVar.mo51902r2();
                    return;
                }
                MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) fVar.f40822c;
                if (motQrCodeActivationActivity == null || bVar == null) {
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_dest_stop_selection_impression");
                    aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
                    aVar.mo49935c(AnalyticsAttributeKey.COUNT, dVar.f49191d.size());
                    fVar.mo46797j2(aVar.mo49933a());
                    fVar.mo51897o2();
                    RecyclerView recyclerView = fVar.f49662p;
                    Context context = recyclerView.getContext();
                    SparseIntArray sparseIntArray = new SparseIntArray(2);
                    sparseIntArray.put(R.layout.mot_qr_code_activation_destination_title_list_item, R.drawable.divider_horizontal_full);
                    sparseIntArray.put(R.layout.mot_qr_code_activation_destination_line_list_item, R.drawable.divider_horizontal_full);
                    recyclerView.mo4593g(new C18681n(context, sparseIntArray, false), -1);
                    recyclerView.mo4593g(C12798g.m32602e(3, context, dVar.f49188a.mo24369b()), -1);
                    ArrayList arrayList = new ArrayList(dVar.f49191d.size() + 4);
                    arrayList.add(new C19544f.C19546b(R.layout.mot_qr_code_activation_destination_handle_list_item, (TransitStop) null, (MotQrCodeStationFare) null));
                    arrayList.add(new C19544f.C19546b(R.layout.mot_qr_code_activation_destination_title_list_item, (TransitStop) null, (MotQrCodeStationFare) null));
                    C21100e.m49373x(dVar.f49188a, "line");
                    arrayList.add(new C19544f.C19546b(R.layout.mot_qr_code_activation_destination_line_list_item, (TransitStop) null, (MotQrCodeStationFare) null));
                    TransitStop transitStop = dVar.f49189b;
                    C21100e.m49373x(transitStop, "stop");
                    arrayList.add(new C19544f.C19546b(R.layout.mot_qr_code_activation_destination_origin_stop_list_item, transitStop, (MotQrCodeStationFare) null));
                    for (TransitStop next : dVar.f49191d) {
                        MotQrCodeStationFare motQrCodeStationFare = dVar.f49192e.get(next.f23730b);
                        C21100e.m49373x(motQrCodeStationFare, "fare");
                        arrayList.add(new C19544f.C19546b(R.layout.mot_qr_code_activation_destination_stop_list_item, next, motQrCodeStationFare));
                    }
                    recyclerView.setAdapter(new C19544f.C19545a(fVar2, arrayList));
                    fVar.mo51900p2(fVar.mo51899X(), dVar);
                    return;
                }
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.STEP_SKIPPED);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_dest_stop_selection_step");
                fVar.mo46797j2(aVar2.mo49933a());
                C18437c cVar = C18437c.f47002b;
                ServerId serverId = bVar.f49183a.f23687c;
                cVar.getClass();
                Tasks.call(MoovitExecutors.SINGLE, new C18435a(cVar, motQrCodeActivationActivity, serverId, (ServerId) null));
                motQrCodeActivationActivity.mo45584y2(bVar.f49184b, bVar.f49183a.f23687c, (ServerId) null, true);
                return;
            case 1:
                TripPlannerActivity tripPlannerActivity = (TripPlannerActivity) this.f49655c;
                MapFragment mapFragment = (MapFragment) this.f49656d;
                int i2 = TripPlannerActivity.f40505q0;
                tripPlannerActivity.getClass();
                mapFragment.mo48656t2(new C19566b(tripPlannerActivity, mapFragment, (Polyline) obj, 0));
                return;
            default:
                TicketValidationActivity ticketValidationActivity = (TicketValidationActivity) this.f49655c;
                int i3 = TicketValidationActivity.f23570X;
                ticketValidationActivity.mo44506I1();
                ServerId serverId2 = ((C12789b) obj).f31612a;
                int i4 = C12820b.f31687v;
                Bundle bundle = new Bundle();
                bundle.putParcelable("providerId", serverId2);
                C12820b bVar2 = new C12820b();
                bVar2.setArguments(bundle);
                FragmentManager supportFragmentManager = ticketValidationActivity.getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                K.mo4111f(C12869e.ticket_receipt_content, bVar2, (String) null);
                K.mo4040d();
                return;
        }
    }
}
