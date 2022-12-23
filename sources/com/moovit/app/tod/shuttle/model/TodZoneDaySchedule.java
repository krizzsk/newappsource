package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodZoneDaySchedule implements Parcelable {
    public static final Parcelable.Creator<TodZoneDaySchedule> CREATOR = new C15570a();

    /* renamed from: d */
    public static final C15571b f40450d = new C15571b(TodZoneDaySchedule.class);

    /* renamed from: b */
    public final long f40451b;

    /* renamed from: c */
    public final List<TodShuttleTrip> f40452c;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodZoneDaySchedule$a */
    public class C15570a implements Parcelable.Creator<TodZoneDaySchedule> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodZoneDaySchedule) C19612n.m46981v(parcel, TodZoneDaySchedule.f40450d);
        }

        public final Object[] newArray(int i) {
            return new TodZoneDaySchedule[i];
        }
    }

    /* renamed from: com.moovit.app.tod.shuttle.model.TodZoneDaySchedule$b */
    public class C15571b extends C19619s<TodZoneDaySchedule> {
        public C15571b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TodZoneDaySchedule(pVar.mo51925m(), pVar.mo51959g(TodShuttleTrip.f40430g));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodZoneDaySchedule todZoneDaySchedule = (TodZoneDaySchedule) obj;
            qVar.mo51940m(todZoneDaySchedule.f40451b);
            qVar.mo51965h(todZoneDaySchedule.f40452c, TodShuttleTrip.f40430g);
        }
    }

    public TodZoneDaySchedule(long j, ArrayList arrayList) {
        this.f40451b = j;
        C21100e.m49373x(arrayList, "trips");
        this.f40452c = Collections.unmodifiableList(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodZoneDaySchedule{day=");
        k.append(this.f40451b);
        k.append(", trips=");
        return C13555b.m33970i(k, this.f40452c, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40450d);
    }
}
