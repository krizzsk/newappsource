package com.moovit.util.time;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class DayTime implements Parcelable {
    public static final Parcelable.Creator<DayTime> CREATOR = new C7901a();

    /* renamed from: e */
    public static final C7902b f23885e = new C7902b();

    /* renamed from: f */
    public static final C7903c f23886f = new C7903c(DayTime.class);

    /* renamed from: b */
    public final int f23887b;

    /* renamed from: c */
    public final int f23888c;

    /* renamed from: d */
    public final int f23889d;

    /* renamed from: com.moovit.util.time.DayTime$a */
    public class C7901a implements Parcelable.Creator<DayTime> {
        public final Object createFromParcel(Parcel parcel) {
            return (DayTime) C19612n.m46981v(parcel, DayTime.f23886f);
        }

        public final Object[] newArray(int i) {
            return new DayTime[i];
        }
    }

    /* renamed from: com.moovit.util.time.DayTime$b */
    public class C7902b extends C19621u<DayTime> {
        public C7902b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            DayTime dayTime = (DayTime) obj;
            qVar.mo51939l(dayTime.f23887b);
            qVar.mo51939l(dayTime.f23888c);
            qVar.mo51939l(dayTime.f23889d);
        }
    }

    /* renamed from: com.moovit.util.time.DayTime$c */
    public class C7903c extends C19620t<DayTime> {
        public C7903c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new DayTime(pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l());
        }
    }

    public DayTime(int i, int i2, int i3) {
        C21100e.m49375y(0, 23, "hourOfDay", i);
        this.f23887b = i;
        C21100e.m49375y(0, 59, "minutes", i2);
        this.f23888c = i2;
        C21100e.m49375y(0, 59, "seconds", i3);
        this.f23889d = i3;
    }

    /* renamed from: b */
    public final long mo24593b() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, this.f23887b);
        instance.set(12, this.f23888c);
        instance.set(13, this.f23889d);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayTime)) {
            return false;
        }
        DayTime dayTime = (DayTime) obj;
        if (this.f23887b == dayTime.f23887b && this.f23888c == dayTime.f23888c && this.f23889d == dayTime.f23889d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f23887b, this.f23888c, this.f23889d);
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "DayTime[%02d:%02d:%02d", new Object[]{Integer.valueOf(this.f23887b), Integer.valueOf(this.f23888c), Integer.valueOf(this.f23889d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23885e);
    }
}
