package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C13962a();

    /* renamed from: b */
    public final long f34638b;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    public class C13962a implements Parcelable.Creator<DateValidatorPointForward> {
        public final Object createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        public final Object[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public DateValidatorPointForward(long j) {
        this.f34638b = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointForward) && this.f34638b == ((DateValidatorPointForward) obj).f34638b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f34638b)});
    }

    /* renamed from: v0 */
    public final boolean mo41488v0(long j) {
        return j >= this.f34638b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f34638b);
    }
}
