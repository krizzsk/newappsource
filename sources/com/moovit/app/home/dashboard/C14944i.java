package com.moovit.app.home.dashboard;

import a40.C0078a;
import android.app.Activity;
import c70.C13756i;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.C14742i;
import com.moovit.app.map.DocklessVehicleBottomSheetDialog;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.search.SearchLocationMapActivity;
import com.moovit.transit.LocationDescriptor;
import j20.C17706c;
import j20.C17708e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import l30.C5585p;
import p693nz.C18659h;
import p824tp.C19728f;
import p910xf.C20477f;
import p944yq.C20750a;
import t30.C6585y;
import t30.C6586z;

/* renamed from: com.moovit.app.home.dashboard.i */
public final /* synthetic */ class C14944i implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ int f38242a;

    /* renamed from: b */
    public final /* synthetic */ Object f38243b;

    /* renamed from: c */
    public final /* synthetic */ Object f38244c;

    public /* synthetic */ C14944i(int i, Object obj, Object obj2) {
        this.f38242a = i;
        this.f38243b = obj;
        this.f38244c = obj2;
    }

    /* renamed from: a */
    public final void mo21406a() {
        switch (this.f38242a) {
            case 0:
                int i = FavoriteLocationEditorActivity.f38158s0;
                ((FavoriteLocationEditorActivity) this.f38243b).mo45103I2((LocationDescriptor) this.f38244c);
                return;
            case 1:
                DocklessVehicleBottomSheetDialog.m38542d2((DocklessVehicleBottomSheetDialog) this.f38243b, (MapFragment) this.f38244c);
                return;
            case 2:
                C5585p pVar = (C5585p) this.f38243b;
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) this.f38244c;
                pVar.f18304c.mo48609E2();
                LatLonE6 Q2 = pVar.f18304c.mo48620Q2();
                switch (C5585p.C5586a.f18309a[microMobilityRide.f14991i.f15007b.ordinal()]) {
                    case 1:
                        if (Q2 != null) {
                            C0078a aVar = microMobilityRide.f14992j;
                            LocationDescriptor locationDescriptor = aVar.f198c;
                            pVar.mo21413f(aVar.f197b, locationDescriptor).addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C14742i(2, pVar, locationDescriptor, Q2));
                            return;
                        }
                        pVar.mo21410c(microMobilityRide);
                        return;
                    case 2:
                    case 3:
                        String str = microMobilityRide.f14984b;
                        C18659h<String, Task<C6586z>> hVar = C5585p.f18299j;
                        Task task = hVar.get(str);
                        if (task == null) {
                            synchronized (hVar) {
                                task = hVar.get(str);
                                if (task == null) {
                                    task = Tasks.call(MoovitExecutors.f37327IO, new C6585y(C13756i.m34349a(pVar.f18302a.getApplicationContext()).mo40679b(), str));
                                    hVar.put(str, task);
                                }
                            }
                        }
                        task.addOnSuccessListener(MoovitExecutors.MAIN_THREAD, new C20750a(pVar, 5));
                        return;
                    case 4:
                        C0078a aVar2 = microMobilityRide.f14992j;
                        LocationDescriptor locationDescriptor2 = aVar2.f198c;
                        LocationDescriptor locationDescriptor3 = aVar2.f199d;
                        if (locationDescriptor3 == null) {
                            pVar.mo21410c(microMobilityRide);
                            return;
                        }
                        pVar.f18304c.mo48646o2(locationDescriptor2, locationDescriptor2, pVar.f18305d);
                        pVar.f18304c.mo48646o2(locationDescriptor3, locationDescriptor3, pVar.f18306e);
                        pVar.mo21411d(locationDescriptor2.mo24310d(), locationDescriptor3.mo24310d());
                        return;
                    case 5:
                    case 6:
                        pVar.mo21410c(microMobilityRide);
                        return;
                    default:
                        return;
                }
            default:
                SearchLocationMapActivity searchLocationMapActivity = (SearchLocationMapActivity) this.f38243b;
                List<LocationDescriptor> list = (List) this.f38244c;
                int i2 = SearchLocationMapActivity.f23138p0;
                searchLocationMapActivity.mo23900z2(list);
                ArrayList arrayList = new ArrayList(list.size());
                searchLocationMapActivity.f23143l0.setVisibility(0);
                for (LocationDescriptor eVar : list) {
                    ExecutorService executorService = MoovitExecutors.f37327IO;
                    HashSet hashSet = C19728f.f50164e;
                    arrayList.add(Tasks.call(executorService, new C17708e(searchLocationMapActivity, (C19728f) searchLocationMapActivity.getSystemService("metro_context"), eVar, false)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()));
                }
                Tasks.whenAll((Collection<? extends Task<?>>) arrayList).addOnCompleteListener((Activity) searchLocationMapActivity, new C20477f(1, searchLocationMapActivity, list, arrayList));
                return;
        }
    }
}
