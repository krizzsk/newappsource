package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C13968a();

    /* renamed from: b */
    public final Calendar f34655b;

    /* renamed from: c */
    public final int f34656c;

    /* renamed from: d */
    public final int f34657d;

    /* renamed from: e */
    public final int f34658e;

    /* renamed from: f */
    public final int f34659f;

    /* renamed from: g */
    public final long f34660g;

    /* renamed from: h */
    public String f34661h;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    public class C13968a implements Parcelable.Creator<Month> {
        public final Object createFromParcel(Parcel parcel) {
            return Month.m34864b(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = C13979d0.m34894d(calendar);
        this.f34655b = d;
        this.f34656c = d.get(2);
        this.f34657d = d.get(1);
        this.f34658e = d.getMaximum(7);
        this.f34659f = d.getActualMaximum(5);
        this.f34660g = d.getTimeInMillis();
    }

    /* renamed from: b */
    public static Month m34864b(int i, int i2) {
        Calendar i3 = C13979d0.m34899i((Calendar) null);
        i3.set(1, i);
        i3.set(2, i2);
        return new Month(i3);
    }

    /* renamed from: c */
    public static Month m34865c(long j) {
        Calendar i = C13979d0.m34899i((Calendar) null);
        i.setTimeInMillis(j);
        return new Month(i);
    }

    public final int compareTo(Object obj) {
        return this.f34655b.compareTo(((Month) obj).f34655b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f34656c == month.f34656c && this.f34657d == month.f34657d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo41536f() {
        int firstDayOfWeek = this.f34655b.get(7) - this.f34655b.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f34658e;
        }
        return firstDayOfWeek;
    }

    /* renamed from: g */
    public final long mo41537g(int i) {
        Calendar d = C13979d0.m34894d(this.f34655b);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f34656c), Integer.valueOf(this.f34657d)});
    }

    /* renamed from: j */
    public final String mo41539j() {
        if (this.f34661h == null) {
            this.f34661h = DateUtils.formatDateTime((Context) null, this.f34655b.getTimeInMillis(), 8228);
        }
        return this.f34661h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34657d);
        parcel.writeInt(this.f34656c);
    }
}
