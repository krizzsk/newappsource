package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C13961a();

    /* renamed from: b */
    public final long f34637b;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$a */
    public class C13961a implements Parcelable.Creator<DateValidatorPointBackward> {
        public final Object createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong());
        }

        public final Object[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    public DateValidatorPointBackward(long j) {
        this.f34637b = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointBackward) && this.f34637b == ((DateValidatorPointBackward) obj).f34637b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f34637b)});
    }

    /* renamed from: v0 */
    public final boolean mo41488v0(long j) {
        return j <= this.f34637b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f34637b);
    }
}
