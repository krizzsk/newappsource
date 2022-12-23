package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DbEntityRef;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.network.model.LongServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TransitLineLeg implements Leg {
    public static final Parcelable.Creator<TransitLineLeg> CREATOR = new C16154a();

    /* renamed from: i */
    public static final C16155b f42106i = new C16155b();

    /* renamed from: j */
    public static final C16156c f42107j = new C16156c(TransitLineLeg.class);

    /* renamed from: b */
    public final Time f42108b;

    /* renamed from: c */
    public final Time f42109c;

    /* renamed from: d */
    public final DbEntityRef<TransitLine> f42110d;

    /* renamed from: e */
    public final List<DbEntityRef<TransitStop>> f42111e;

    /* renamed from: f */
    public final Polyline f42112f;

    /* renamed from: g */
    public final CurrencyAmount f42113g;

    /* renamed from: h */
    public final LongServerId f42114h;

    /* renamed from: com.moovit.itinerary.model.leg.TransitLineLeg$a */
    public class C16154a implements Parcelable.Creator<TransitLineLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitLineLeg) C19612n.m46981v(parcel, TransitLineLeg.f42107j);
        }

        public final Object[] newArray(int i) {
            return new TransitLineLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.TransitLineLeg$b */
    public class C16155b extends C19621u<TransitLineLeg> {
        public C16155b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitLineLeg transitLineLeg = (TransitLineLeg) obj;
            Time time = transitLineLeg.f42108b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = transitLineLeg.f42109c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            DbEntityRef.TRANSIT_LINE_REF_CODER.write(transitLineLeg.f42110d, qVar);
            qVar.mo51965h(transitLineLeg.f42111e, DbEntityRef.TRANSIT_STOP_REF_CODER);
            Polyline polyline = transitLineLeg.f42112f;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51967q(transitLineLeg.f42113g, CurrencyAmount.f23843f);
            qVar.mo51967q(transitLineLeg.f42114h, LongServerId.f15136c);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.TransitLineLeg$c */
    public class C16156c extends C19620t<TransitLineLeg> {
        public C16156c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            CurrencyAmount currencyAmount;
            LongServerId longServerId;
            Time.C7914c cVar = Time.f23900p;
            pVar.getClass();
            Time time = (Time) cVar.read(pVar);
            Time time2 = (Time) cVar.read(pVar);
            DbEntityRef read = DbEntityRef.TRANSIT_LINE_REF_CODER.read(pVar);
            ArrayList<DbEntityRef<TransitStop>> g = pVar.mo51959g(DbEntityRef.TRANSIT_STOP_REF_CODER);
            Polyline polyline = (Polyline) Polylon.f40988k.read(pVar);
            if (i >= 1) {
                currencyAmount = (CurrencyAmount) pVar.mo51962q(CurrencyAmount.f23843f);
            } else {
                currencyAmount = null;
            }
            if (i >= 2) {
                longServerId = (LongServerId) pVar.mo51962q(LongServerId.f15136c);
            } else {
                longServerId = null;
            }
            return new TransitLineLeg(time, time2, read, g, polyline, currencyAmount, longServerId);
        }
    }

    public TransitLineLeg(Time time, Time time2, DbEntityRef<TransitLine> dbEntityRef, List<DbEntityRef<TransitStop>> list, Polyline polyline, CurrencyAmount currencyAmount, LongServerId longServerId) {
        C21100e.m49373x(time, "startTime");
        this.f42108b = time;
        C21100e.m49373x(time2, "endTime");
        this.f42109c = time2;
        C21100e.m49373x(dbEntityRef, "lineRef");
        this.f42110d = dbEntityRef;
        C21100e.m49373x(list, "stopRefs");
        this.f42111e = Collections.unmodifiableList(list);
        C21100e.m49373x(polyline, "shape");
        this.f42112f = polyline;
        this.f42113g = currencyAmount;
        this.f42114h = longServerId;
        if (list.size() < 2) {
            throw new IllegalArgumentException("Number of stops must be at least 2 stops!");
        }
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42109c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return LocationDescriptor.m17769c(mo48460c().get());
    }

    /* renamed from: b */
    public final DbEntityRef<TransitStop> mo48459b() {
        List<DbEntityRef<TransitStop>> list = this.f42111e;
        return list.get(list.size() - 1);
    }

    /* renamed from: c */
    public final DbEntityRef<TransitStop> mo48460c() {
        return this.f42111e.get(0);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return LocationDescriptor.m17769c(mo48459b().get());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitLineLeg)) {
            return false;
        }
        TransitLineLeg transitLineLeg = (TransitLineLeg) obj;
        if (!this.f42108b.equals(transitLineLeg.f42108b) || !this.f42109c.equals(transitLineLeg.f42109c) || !this.f42110d.equals(transitLineLeg.f42110d) || !this.f42111e.equals(transitLineLeg.f42111e)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f42108b.hashCode(), this.f42109c.hashCode(), this.f42110d.hashCode(), this.f42111e.hashCode());
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39922n(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42108b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return this.f42112f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42106i);
    }
}
