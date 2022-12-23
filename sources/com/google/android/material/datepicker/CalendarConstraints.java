package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.GregorianCalendar;
import p229r1.C6232b;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C13955a();

    /* renamed from: b */
    public final Month f34621b;

    /* renamed from: c */
    public final Month f34622c;

    /* renamed from: d */
    public final DateValidator f34623d;

    /* renamed from: e */
    public Month f34624e;

    /* renamed from: f */
    public final int f34625f;

    /* renamed from: g */
    public final int f34626g;

    public interface DateValidator extends Parcelable {
        /* renamed from: v0 */
        boolean mo41488v0(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    public class C13955a implements Parcelable.Creator<CalendarConstraints> {
        public final Object createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C13956b {

        /* renamed from: e */
        public static final long f34627e = C13979d0.m34891a(Month.m34864b(1900, 0).f34660g);

        /* renamed from: f */
        public static final long f34628f = C13979d0.m34891a(Month.m34864b(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f34660g);

        /* renamed from: a */
        public long f34629a = f34627e;

        /* renamed from: b */
        public long f34630b = f34628f;

        /* renamed from: c */
        public Long f34631c;

        /* renamed from: d */
        public DateValidator f34632d = new DateValidatorPointForward(Long.MIN_VALUE);

        public C13956b(CalendarConstraints calendarConstraints) {
            this.f34629a = calendarConstraints.f34621b.f34660g;
            this.f34630b = calendarConstraints.f34622c.f34660g;
            this.f34631c = Long.valueOf(calendarConstraints.f34624e.f34660g);
            this.f34632d = calendarConstraints.f34623d;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f34621b = month;
        this.f34622c = month2;
        this.f34624e = month3;
        this.f34623d = dateValidator;
        if (month3 != null && month.f34655b.compareTo(month3.f34655b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 != null && month3.f34655b.compareTo(month2.f34655b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (month.f34655b instanceof GregorianCalendar) {
            int i = month2.f34657d;
            int i2 = month.f34657d;
            this.f34626g = (month2.f34656c - month.f34656c) + ((i - i2) * 12) + 1;
            this.f34625f = (i - i2) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f34621b.equals(calendarConstraints.f34621b) || !this.f34622c.equals(calendarConstraints.f34622c) || !C6232b.m14816a(this.f34624e, calendarConstraints.f34624e) || !this.f34623d.equals(calendarConstraints.f34623d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34621b, this.f34622c, this.f34624e, this.f34623d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f34621b, 0);
        parcel.writeParcelable(this.f34622c, 0);
        parcel.writeParcelable(this.f34624e, 0);
        parcel.writeParcelable(this.f34623d, 0);
    }
}
