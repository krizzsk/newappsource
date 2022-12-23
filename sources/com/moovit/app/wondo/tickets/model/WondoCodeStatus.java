package com.moovit.app.wondo.tickets.model;

import android.os.Parcel;
import android.os.Parcelable;

public enum WondoCodeStatus implements Parcelable {
    BOUGHT,
    USED,
    CANCELLED,
    TEST_CODE;
    
    public static final Parcelable.Creator<WondoCodeStatus> CREATOR = null;

    /* renamed from: com.moovit.app.wondo.tickets.model.WondoCodeStatus$a */
    public class C15655a implements Parcelable.Creator<WondoCodeStatus> {
        public final Object createFromParcel(Parcel parcel) {
            return WondoCodeStatus.valueOf(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new WondoCodeStatus[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new C15655a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
