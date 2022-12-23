package p947yt;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity;

/* renamed from: yt.a */
public final /* synthetic */ class C20766a implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ ItineraryNoGroupActivity f52403b;

    /* renamed from: c */
    public final /* synthetic */ int f52404c;

    /* renamed from: d */
    public final /* synthetic */ boolean f52405d;

    public /* synthetic */ C20766a(ItineraryNoGroupActivity itineraryNoGroupActivity, int i, boolean z) {
        this.f52403b = itineraryNoGroupActivity;
        this.f52404c = i;
        this.f52405d = z;
    }

    public final void onSuccess(Object obj) {
        ItineraryNoGroupActivity itineraryNoGroupActivity = this.f52403b;
        int i = this.f52404c;
        boolean z = this.f52405d;
        Bundle bundle = (Bundle) obj;
        int i2 = ItineraryNoGroupActivity.f38596o0;
        bundle.setClassLoader(itineraryNoGroupActivity.getClassLoader());
        itineraryNoGroupActivity.mo45321y2(i, bundle.getParcelableArrayList("itineraries"), z);
    }
}
