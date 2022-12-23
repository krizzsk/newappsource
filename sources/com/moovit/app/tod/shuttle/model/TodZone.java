package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodZone implements Parcelable {
    public static final Parcelable.Creator<TodZone> CREATOR = new C15568a();

    /* renamed from: e */
    public static final C15569b f40446e = new C15569b(TodZone.class);

    /* renamed from: b */
    public final ServerId f40447b;

    /* renamed from: c */
    public final String f40448c;

    /* renamed from: d */
    public final List<TodZoneDaySchedule> f40449d;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodZone$a */
    public class C15568a implements Parcelable.Creator<TodZone> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodZone) C19612n.m46981v(parcel, TodZone.f40446e);
        }

        public final Object[] newArray(int i) {
            return new TodZone[i];
        }
    }

    /* renamed from: com.moovit.app.tod.shuttle.model.TodZone$b */
    public class C15569b extends C19619s<TodZone> {
        public C15569b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new TodZone(new ServerId(pVar.mo51924l()), pVar.mo51947p(), pVar.mo51959g(TodZoneDaySchedule.f40450d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodZone todZone = (TodZone) obj;
            ServerId serverId = todZone.f40447b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(todZone.f40448c);
            qVar.mo51965h(todZone.f40449d, TodZoneDaySchedule.f40450d);
        }
    }

    public TodZone(ServerId serverId, String str, ArrayList arrayList) {
        this.f40447b = serverId;
        C21100e.m49373x(str, "name");
        this.f40448c = str;
        C21100e.m49373x(arrayList, "daySchedules");
        this.f40449d = Collections.unmodifiableList(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodZone{id=");
        k.append(this.f40447b);
        k.append(", name='");
        C25541a.m63890u(k, this.f40448c, '\'', ", daySchedules=");
        return C13555b.m33970i(k, this.f40449d, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40446e);
    }
}
