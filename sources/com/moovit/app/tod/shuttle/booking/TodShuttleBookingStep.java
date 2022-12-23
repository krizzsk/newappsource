package com.moovit.app.tod.shuttle.booking;

import android.os.Parcel;
import android.os.Parcelable;
import p644lx.C18283a;
import p644lx.C18289f;
import p644lx.C18294i;
import p644lx.C18296j;

public enum TodShuttleBookingStep implements Parcelable {
    CHOOSE_ZONE(C18296j.class),
    CHOOSE_TRIP(C18294i.class),
    CHOOSE_STOPS(C18289f.class);
    
    public static final Parcelable.Creator<TodShuttleBookingStep> CREATOR = null;
    public final Class<? extends C18283a> fragmentClass;

    /* renamed from: com.moovit.app.tod.shuttle.booking.TodShuttleBookingStep$a */
    public class C15541a implements Parcelable.Creator<TodShuttleBookingStep> {
        public final Object createFromParcel(Parcel parcel) {
            return TodShuttleBookingStep.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new TodShuttleBookingStep[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C15541a();
    }

    private TodShuttleBookingStep(Class<? extends C18283a> cls) {
        this.fragmentClass = cls;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
