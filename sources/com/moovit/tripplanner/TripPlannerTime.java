package com.moovit.tripplanner;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TripPlannerTime implements Parcelable {
    public static final Parcelable.Creator<TripPlannerTime> CREATOR = new C7857a();

    /* renamed from: d */
    public static final C7858b f23797d = new C7858b();

    /* renamed from: e */
    public static final C7859c f23798e = new C7859c(TripPlannerTime.class);

    /* renamed from: b */
    public final Type f23799b;

    /* renamed from: c */
    public final long f23800c;

    public enum Type {
        DEPART,
        ARRIVE,
        LAST;
        
        public static final C19577c<Type> CODER = null;

        /* access modifiers changed from: public */
        static {
            Type type;
            Type type2;
            Type type3;
            CODER = new C19577c<>(Type.class, type, type2, type3);
        }
    }

    /* renamed from: com.moovit.tripplanner.TripPlannerTime$a */
    public class C7857a implements Parcelable.Creator<TripPlannerTime> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlannerTime) C19612n.m46981v(parcel, TripPlannerTime.f23798e);
        }

        public final Object[] newArray(int i) {
            return new TripPlannerTime[i];
        }
    }

    /* renamed from: com.moovit.tripplanner.TripPlannerTime$b */
    public class C7858b extends C19621u<TripPlannerTime> {
        public C7858b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlannerTime tripPlannerTime = (TripPlannerTime) obj;
            Type type = tripPlannerTime.f23799b;
            C19577c<Type> cVar = Type.CODER;
            qVar.getClass();
            cVar.write(type, qVar);
            qVar.mo51940m(tripPlannerTime.f23800c);
        }
    }

    /* renamed from: com.moovit.tripplanner.TripPlannerTime$c */
    public class C7859c extends C19620t<TripPlannerTime> {
        public C7859c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19577c<Type> cVar = Type.CODER;
            pVar.getClass();
            return new TripPlannerTime((Type) cVar.read(pVar), pVar.mo51925m());
        }
    }

    public TripPlannerTime(Type type, long j) {
        C21100e.m49373x(type, "type");
        this.f23799b = type;
        this.f23800c = j;
    }

    /* renamed from: f */
    public static TripPlannerTime m17899f() {
        return new TripPlannerTime(Type.DEPART, -1);
    }

    /* renamed from: b */
    public final long mo24487b() {
        return mo24489d() ? System.currentTimeMillis() : this.f23800c;
    }

    /* renamed from: c */
    public final boolean mo24488c() {
        return this.f23799b.equals(Type.LAST);
    }

    /* renamed from: d */
    public final boolean mo24489d() {
        return this.f23800c == -1 && !mo24488c();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TripPlannerTime)) {
            return false;
        }
        TripPlannerTime tripPlannerTime = (TripPlannerTime) obj;
        if (!this.f23799b.equals(tripPlannerTime.f23799b) || this.f23800c != tripPlannerTime.f23800c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23799b), C17884p.m44334E(this.f23800c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23797d);
    }
}
