package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p762qz.C19206b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class Event implements Parcelable, C5384a, C19206b {
    public static final Parcelable.Creator<Event> CREATOR = new C16420a();

    /* renamed from: j */
    public static final C16421b f42910j = new C16421b(Event.class);

    /* renamed from: b */
    public final ServerId f42911b;

    /* renamed from: c */
    public final Image f42912c;

    /* renamed from: d */
    public final String f42913d;

    /* renamed from: e */
    public final String f42914e;

    /* renamed from: f */
    public final String f42915f;

    /* renamed from: g */
    public final LatLonE6 f42916g;

    /* renamed from: h */
    public final long f42917h;

    /* renamed from: i */
    public final long f42918i;

    /* renamed from: com.moovit.ridesharing.model.Event$a */
    public class C16420a implements Parcelable.Creator<Event> {
        public final Object createFromParcel(Parcel parcel) {
            return (Event) C19612n.m46981v(parcel, Event.f42910j);
        }

        public final Object[] newArray(int i) {
            return new Event[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.Event$b */
    public class C16421b extends C19619s<Event> {
        public C16421b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            if (i == 1) {
                pVar.getClass();
                return new Event(new ServerId(pVar.mo51924l()), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51947p(), (LatLonE6) LatLonE6.f40979g.read(pVar), pVar.mo51925m(), pVar.mo51925m());
            }
            pVar.getClass();
            return new Event(new ServerId(pVar.mo51924l()), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51947p(), (String) null, pVar.mo51947p(), (LatLonE6) LatLonE6.f40979g.read(pVar), pVar.mo51925m(), pVar.mo51925m());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Event event = (Event) obj;
            ServerId serverId = event.f42911b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            C16019d.m40803a().f41718d.write(event.f42912c, qVar);
            qVar.mo51954p(event.f42913d);
            qVar.mo51955t(event.f42914e);
            qVar.mo51954p(event.f42915f);
            LatLonE6.f40978f.write(event.f42916g, qVar);
            qVar.mo51940m(event.f42917h);
            qVar.mo51940m(event.f42918i);
        }
    }

    public Event(ServerId serverId, Image image, String str, String str2, String str3, LatLonE6 latLonE6, long j, long j2) {
        this.f42911b = serverId;
        C21100e.m49373x(image, "image");
        this.f42912c = image;
        C21100e.m49373x(str, "name");
        this.f42913d = str;
        this.f42914e = str2;
        C21100e.m49373x(str3, "address");
        this.f42915f = str3;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f42916g = latLonE6;
        this.f42917h = j;
        this.f42918i = j2;
    }

    /* renamed from: b */
    public final boolean mo49163b() {
        return this.f42918i != -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        return this.f42911b.equals(((Event) obj).f42911b);
    }

    public final LatLonE6 getLocation() {
        return this.f42916g;
    }

    public final ServerId getServerId() {
        return this.f42911b;
    }

    public final int hashCode() {
        return this.f42911b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42910j);
    }
}
