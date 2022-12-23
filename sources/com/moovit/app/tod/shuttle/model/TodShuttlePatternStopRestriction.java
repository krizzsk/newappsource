package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum TodShuttlePatternStopRestriction implements Parcelable {
    PICKUP_ONLY,
    DROP_OFF_ONLY;
    
    public static final C19577c<TodShuttlePatternStopRestriction> CODER = null;
    public static final Parcelable.Creator<TodShuttlePatternStopRestriction> CREATOR = null;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttlePatternStopRestriction$a */
    public class C15557a implements Parcelable.Creator<TodShuttlePatternStopRestriction> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodShuttlePatternStopRestriction) C19612n.m46981v(parcel, TodShuttlePatternStopRestriction.CODER);
        }

        public final Object[] newArray(int i) {
            return new TodShuttlePatternStopRestriction[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        TodShuttlePatternStopRestriction todShuttlePatternStopRestriction;
        TodShuttlePatternStopRestriction todShuttlePatternStopRestriction2;
        CREATOR = new C15557a();
        CODER = new C19577c<>(TodShuttlePatternStopRestriction.class, todShuttlePatternStopRestriction, todShuttlePatternStopRestriction2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
