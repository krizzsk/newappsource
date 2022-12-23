package com.moovit.app.tod.center;

import android.os.Parcel;
import android.os.Parcelable;
import com.tranzmate.R;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0013\b\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, mo59060d2 = {"Lcom/moovit/app/tod/center/TodRidesCenterTab;", "", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "titleResId", "I", "getTitleResId", "()I", "<init>", "(Ljava/lang/String;II)V", "RIDES", "SUBSCRIPTIONS", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public enum TodRidesCenterTab implements Parcelable {
    RIDES(R.string.tod_passenger_rides_center_all_tab),
    SUBSCRIPTIONS(R.string.tod_passenger_rides_center_recurring_tab);
    
    public static final Parcelable.Creator<TodRidesCenterTab> CREATOR = null;
    private final int titleResId;

    /* renamed from: com.moovit.app.tod.center.TodRidesCenterTab$a */
    public static final class C15488a implements Parcelable.Creator<TodRidesCenterTab> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return TodRidesCenterTab.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new TodRidesCenterTab[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C15488a();
    }

    private TodRidesCenterTab(int i) {
        this.titleResId = i;
    }

    public int describeContents() {
        return 0;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(name());
    }
}
