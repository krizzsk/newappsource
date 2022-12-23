package p484ff;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import c00.C13717b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;
import com.moovit.app.tripplanner.TripPlannerResultsFragment;
import com.moovit.itinerary.model.TripPlanConfig;
import java.util.ArrayList;
import p924xt.C20598h;

/* renamed from: ff.i */
public final /* synthetic */ class C16977i implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f44073b;

    /* renamed from: c */
    public final /* synthetic */ ComponentCallbacks f44074c;

    /* renamed from: d */
    public final /* synthetic */ Parcelable f44075d;

    public /* synthetic */ C16977i(ComponentCallbacks componentCallbacks, Parcelable parcelable, int i) {
        this.f44073b = i;
        this.f44074c = componentCallbacks;
        this.f44075d = parcelable;
    }

    public final void onComplete(Task task) {
        String str;
        TripPlanConfig tripPlanConfig;
        switch (this.f44073b) {
            case 0:
                ((EnhancedIntentService) this.f44074c).lambda$onStartCommand$1((Intent) this.f44075d, task);
                return;
            default:
                C20598h hVar = (C20598h) this.f44074c;
                TripPlannerResultsFragment.SearchParams searchParams = (TripPlannerResultsFragment.SearchParams) this.f44075d;
                int i = C20598h.f52097z;
                hVar.getClass();
                if (task.isSuccessful()) {
                    Bundle bundle = (Bundle) task.getResult();
                    boolean z = false;
                    if (bundle != null) {
                        bundle.setClassLoader(hVar.getClass().getClassLoader());
                        TripPlannerResultsFragment.SearchParams<O> searchParams2 = hVar.f40516o;
                        if (searchParams2 != null) {
                            str = searchParams2.f40517b;
                        } else {
                            str = null;
                        }
                        String string = bundle.getString("search_id");
                        if (!(string == null || !string.equals(str) || (tripPlanConfig = (TripPlanConfig) bundle.getParcelable("config")) == null)) {
                            ArrayList parcelableArrayList = bundle.getParcelableArrayList("itineraries");
                            if (!C13717b.m34258e(parcelableArrayList)) {
                                hVar.mo40558y2();
                                hVar.mo52808q2(parcelableArrayList);
                                hVar.mo52810z2(tripPlanConfig);
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        return;
                    }
                }
                if (searchParams != null) {
                    hVar.mo46524n2(searchParams.f40518c, searchParams.f40519d);
                    return;
                }
                return;
        }
    }
}
