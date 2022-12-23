package com.moovit.commons.utils;

import android.os.Parcel;
import android.os.Parcelable;

public class NonSerializingParcelable implements Parcelable {
    public static final Parcelable.Creator<NonSerializingParcelable> CREATOR = new C15775a();

    /* renamed from: com.moovit.commons.utils.NonSerializingParcelable$a */
    public class C15775a implements Parcelable.Creator<NonSerializingParcelable> {
        public final Object createFromParcel(Parcel parcel) {
            return new NonSerializingParcelable();
        }

        public final Object[] newArray(int i) {
            return new NonSerializingParcelable[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
