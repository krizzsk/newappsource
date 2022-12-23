package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class EventRide implements Parcelable, C5384a {
    public static final Parcelable.Creator<EventRide> CREATOR = new C16435a();

    /* renamed from: g */
    public static C16436b f42968g = new C16436b(EventRide.class);

    /* renamed from: b */
    public final ServerId f42969b;

    /* renamed from: c */
    public final long f42970c;

    /* renamed from: d */
    public final long f42971d;

    /* renamed from: e */
    public final Polyline f42972e;

    /* renamed from: f */
    public final EventDriver f42973f;

    /* renamed from: com.moovit.ridesharing.model.EventRide$a */
    public class C16435a implements Parcelable.Creator<EventRide> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventRide) C19612n.m46981v(parcel, EventRide.f42968g);
        }

        public final Object[] newArray(int i) {
            return new EventRide[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventRide$b */
    public class C16436b extends C19619s<EventRide> {
        public C16436b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new EventRide(new ServerId(pVar.mo51924l()), pVar.mo51925m(), pVar.mo51925m(), (Polyline) Polylon.f40988k.read(pVar), (EventDriver) pVar.mo51962q(EventDriver.f42936g));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EventRide eventRide = (EventRide) obj;
            ServerId serverId = eventRide.f42969b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51940m(eventRide.f42970c);
            qVar.mo51940m(eventRide.f42971d);
            Polyline polyline = eventRide.f42972e;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
            qVar.mo51967q(eventRide.f42973f, EventDriver.f42936g);
        }
    }

    public EventRide(ServerId serverId, long j, long j2, Polyline polyline, EventDriver eventDriver) {
        this.f42969b = serverId;
        this.f42970c = j;
        this.f42971d = j2;
        C21100e.m49373x(polyline, "shape");
        this.f42972e = polyline;
        this.f42973f = eventDriver;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EventRide)) {
            return false;
        }
        return this.f42969b.equals(((EventRide) obj).f42969b);
    }

    public final ServerId getServerId() {
        return this.f42969b;
    }

    public final int hashCode() {
        return this.f42969b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42968g);
    }
}
