package com.moovit.micromobility;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum MicroMobilityIntegrationFlow implements Parcelable {
    DEEP_LINK,
    RESERVE,
    UNLOCK;
    
    public static final C19584i<MicroMobilityIntegrationFlow> CODER = null;
    public static final Parcelable.Creator<MicroMobilityIntegrationFlow> CREATOR = null;

    /* renamed from: com.moovit.micromobility.MicroMobilityIntegrationFlow$a */
    public class C4121a implements Parcelable.Creator<MicroMobilityIntegrationFlow> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityIntegrationFlow) C19612n.m46981v(parcel, MicroMobilityIntegrationFlow.CODER);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityIntegrationFlow[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        MicroMobilityIntegrationFlow microMobilityIntegrationFlow;
        MicroMobilityIntegrationFlow microMobilityIntegrationFlow2;
        MicroMobilityIntegrationFlow microMobilityIntegrationFlow3;
        CREATOR = new C4121a();
        CODER = new C19577c(MicroMobilityIntegrationFlow.class, microMobilityIntegrationFlow, microMobilityIntegrationFlow2, microMobilityIntegrationFlow3);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
