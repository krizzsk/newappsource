package com.moovit.util.time;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20950l0;

public class TimeFrequency implements Parcelable {
    public static final Parcelable.Creator<TimeFrequency> CREATOR = new C7915a();

    /* renamed from: d */
    public static final C7916b f23914d = new C7916b(TimeFrequency.class);

    /* renamed from: b */
    public final C20950l0<Long> f23915b;

    /* renamed from: c */
    public final C20950l0<Integer> f23916c;

    /* renamed from: com.moovit.util.time.TimeFrequency$a */
    public class C7915a implements Parcelable.Creator<TimeFrequency> {
        public final Object createFromParcel(Parcel parcel) {
            return (TimeFrequency) C19612n.m46981v(parcel, TimeFrequency.f23914d);
        }

        public final Object[] newArray(int i) {
            return new TimeFrequency[i];
        }
    }

    /* renamed from: com.moovit.util.time.TimeFrequency$b */
    public class C7916b extends C19619s<TimeFrequency> {
        public C7916b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Long l;
            Long l2;
            Integer num;
            pVar.getClass();
            Integer num2 = null;
            if (!pVar.mo51919b()) {
                l = null;
            } else {
                l = Long.valueOf(pVar.mo51925m());
            }
            if (!pVar.mo51919b()) {
                l2 = null;
            } else {
                l2 = Long.valueOf(pVar.mo51925m());
            }
            C20950l0 l0Var = new C20950l0(l, l2);
            if (!pVar.mo51919b()) {
                num = null;
            } else {
                num = Integer.valueOf(pVar.mo51924l());
            }
            if (!(!pVar.mo51919b())) {
                num2 = Integer.valueOf(pVar.mo51924l());
            }
            return new TimeFrequency(l0Var, new C20950l0(num, num2));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TimeFrequency timeFrequency = (TimeFrequency) obj;
            C20950l0<Long> l0Var = timeFrequency.f23915b;
            qVar.getClass();
            T t = l0Var.f52695a;
            if (t == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51940m(((Long) t).longValue());
            }
            T t2 = l0Var.f52696b;
            if (t2 == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51940m(((Long) t2).longValue());
            }
            C20950l0<Integer> l0Var2 = timeFrequency.f23916c;
            T t3 = l0Var2.f52695a;
            if (t3 == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(((Integer) t3).intValue());
            }
            T t4 = l0Var2.f52696b;
            if (t4 == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51939l(((Integer) t4).intValue());
        }
    }

    public TimeFrequency(C20950l0<Long> l0Var, C20950l0<Integer> l0Var2) {
        C21100e.m49373x(l0Var, "window");
        this.f23915b = l0Var;
        C21100e.m49373x(l0Var2, "interval");
        this.f23916c = l0Var2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TimeFrequency)) {
            return false;
        }
        TimeFrequency timeFrequency = (TimeFrequency) obj;
        if (!this.f23915b.equals(timeFrequency.f23915b) || !this.f23916c.equals(timeFrequency.f23916c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23915b), C17884p.m44335F(this.f23916c));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TimeFrequency[");
        k.append(C7925b.m18013a(((Long) this.f23915b.f52695a).longValue()));
        k.append(" - ");
        k.append(C7925b.m18013a(((Long) this.f23915b.f52696b).longValue()));
        k.append("]");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23914d);
    }
}
