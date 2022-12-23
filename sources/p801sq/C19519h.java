package p801sq;

import android.content.Context;
import android.location.Location;
import b00.C13556a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.map.walking.MapWalkingDirectionsActivity;
import com.moovit.micromobility.MicroMobilityRideDetailsActivity;
import com.moovit.request.RequestOptions;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.transit.LocationDescriptor;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import com.tranzmate.R;
import com.usebutton.sdk.internal.util.DiskLruCache;
import h90.C12739a;
import j20.C17707d;
import j90.C12789b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k90.C12820b;
import m80.C12875k;
import mf0.C24362h;
import p304x.C7097r;
import p304x.C7099r1;
import p713ov.C18845j;
import p80.C12991b;
import r90.C13052c;
import s90.C13076d;
import w20.C20275b;

/* renamed from: sq.h */
public final /* synthetic */ class C19519h implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f49607b;

    /* renamed from: c */
    public final /* synthetic */ Object f49608c;

    public /* synthetic */ C19519h(Object obj, int i) {
        this.f49607b = i;
        this.f49608c = obj;
    }

    public final void onComplete(Task task) {
        Runnable runnable;
        C17707d dVar;
        Location location;
        Location location2;
        LocationDescriptor locationDescriptor = null;
        switch (this.f49607b) {
            case 0:
                C19520i iVar = (C19520i) this.f49608c;
                iVar.f49613v.set(false);
                if (iVar.getContext() != null) {
                    if (!task.isSuccessful()) {
                        task.getException();
                        iVar.mo50562x2();
                        return;
                    }
                    C13076d dVar2 = (C13076d) task.getResult();
                    if (dVar2 == null) {
                        iVar.mo50562x2();
                        return;
                    }
                    iVar.f49611t = dVar2;
                    List<Ticket> b = dVar2.mo39944b(Collections.emptySet(), C13076d.f32345h);
                    List<C12739a> list = dVar2.f32349d;
                    List<C12789b> list2 = dVar2.f32348c;
                    iVar.f49612u = b.size();
                    if (!b.isEmpty() || !list.isEmpty()) {
                        ArrayList arrayList = new ArrayList(2);
                        if (list2.isEmpty()) {
                            arrayList.add(new BottomSheetMenuDialogFragment.MenuItem(DiskLruCache.VERSION_1, R.drawable.ic_wallet_24_on_surface_medium, R.string.purchase_ticket_show));
                        } else {
                            arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("2", R.drawable.ic_wallet_24_on_surface_medium, R.string.quick_action_bottom_sheet_my_pass));
                        }
                        int e = C12875k.m32665e((C12991b) iVar.mo46776J1("TICKETING_CONFIGURATION"));
                        if (e == 0) {
                            e = R.string.purchase_ticket_purchase;
                        }
                        arrayList.add(new BottomSheetMenuDialogFragment.MenuItem("3", R.drawable.ic_ticket_full_24_on_surface_emphasis_medium, e));
                        iVar.f49612u = b.size();
                        iVar.mo50560v2(true);
                        runnable = new C7097r(16, iVar, arrayList);
                    } else {
                        iVar.f49612u = 0;
                        iVar.mo50560v2(false);
                        runnable = new C7099r1(iVar, 9);
                    }
                    iVar.f49610s = runnable;
                    return;
                }
                return;
            case 1:
                C18845j jVar = (C18845j) this.f49608c;
                jVar.getClass();
                if (!task.isSuccessful()) {
                    jVar.mo51334u2();
                    return;
                }
                C17707d dVar3 = (C17707d) task.getResult();
                LocationDescriptor locationDescriptor2 = dVar3.f45454e;
                if (locationDescriptor2 != null) {
                    jVar.mo51335v2(locationDescriptor2);
                } else {
                    jVar.mo51335v2(dVar3.f45450a);
                }
                jVar.mo51334u2();
                return;
            case 2:
                LocationDescriptor locationDescriptor3 = (LocationDescriptor) this.f49608c;
                C24362h.m61211f(task, "task");
                if (task.isSuccessful()) {
                    dVar = (C17707d) task.getResult();
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    locationDescriptor = dVar.f45454e;
                }
                if (dVar != null && dVar.f45452c == 2 && locationDescriptor != null) {
                    locationDescriptor3.f23655j = locationDescriptor.f23655j;
                    locationDescriptor3.f23651f = locationDescriptor.f23651f;
                    locationDescriptor3.f23652g = locationDescriptor.f23652g;
                    return;
                }
                return;
            case 3:
                ((TodBookingOrderViewModel) this.f49608c).f40080l.setValue(Boolean.FALSE);
                return;
            case 4:
                MapWalkingDirectionsActivity mapWalkingDirectionsActivity = (MapWalkingDirectionsActivity) this.f49608c;
                int i = MapWalkingDirectionsActivity.f42571p0;
                C13556a aVar = mapWalkingDirectionsActivity.f42579o0;
                if (aVar != null) {
                    aVar.cancel(true);
                    mapWalkingDirectionsActivity.f42579o0 = null;
                }
                LocationDescriptor locationDescriptor4 = mapWalkingDirectionsActivity.f42574Y;
                LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.CURRENT;
                if (locationDescriptor4.mo24316j(locationType)) {
                    location = mapWalkingDirectionsActivity.mo44542u1();
                } else {
                    location = locationDescriptor4.mo24310d().mo46929u((Location) null);
                }
                LocationDescriptor locationDescriptor5 = mapWalkingDirectionsActivity.f42575Z;
                if (locationDescriptor5.mo24316j(locationType)) {
                    location2 = mapWalkingDirectionsActivity.mo44542u1();
                } else {
                    location2 = locationDescriptor5.mo24310d().mo46929u((Location) null);
                }
                if (location == null || location2 == null) {
                    mapWalkingDirectionsActivity.mo48828z2();
                    return;
                }
                C20275b bVar = new C20275b(mapWalkingDirectionsActivity.mo44548x1(), location, location2);
                String str = bVar.f51409w;
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                mapWalkingDirectionsActivity.f42579o0 = mapWalkingDirectionsActivity.mo44527k2(str, bVar, requestOptions, mapWalkingDirectionsActivity.f42573X);
                return;
            case 5:
                int i2 = MicroMobilityRideDetailsActivity.f14839Y;
                ((MicroMobilityRideDetailsActivity) this.f49608c).mo19437A2();
                return;
            case 6:
                Context context = (Context) this.f49608c;
                if (task.isSuccessful()) {
                    ProfilerLog.m41879c(context).mo49244b("FusedLocationClientCommands", "getLastLocation-completed successfully");
                    return;
                }
                ProfilerLog c = ProfilerLog.m41879c(context);
                StringBuilder k = C13555b.m33972k("getLastLocation-failed with error ");
                k.append(task.getException());
                c.mo49244b("FusedLocationClientCommands", k.toString());
                Objects.toString(task.getException());
                return;
            case 7:
                ((C12820b) this.f49608c).f31691q.setRefreshing(false);
                return;
            default:
                ((C13052c) this.f49608c).f32281p.mo23802c();
                return;
        }
    }
}
