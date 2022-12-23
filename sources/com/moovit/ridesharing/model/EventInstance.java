package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.Event;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class EventInstance implements Parcelable, C5384a {
    public static final Parcelable.Creator<EventInstance> CREATOR = new C16428a();

    /* renamed from: j */
    public static final C16429b f42942j = new C16429b(EventInstance.class);

    /* renamed from: b */
    public final Event f42943b;

    /* renamed from: c */
    public final ServerId f42944c;

    /* renamed from: d */
    public final Image f42945d;

    /* renamed from: e */
    public final String f42946e;

    /* renamed from: f */
    public final long f42947f;

    /* renamed from: g */
    public final EventVehicleType f42948g;

    /* renamed from: h */
    public final int f42949h;

    /* renamed from: i */
    public final ServerId f42950i;

    /* renamed from: com.moovit.ridesharing.model.EventInstance$a */
    public class C16428a implements Parcelable.Creator<EventInstance> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventInstance) C19612n.m46981v(parcel, EventInstance.f42942j);
        }

        public final Object[] newArray(int i) {
            return new EventInstance[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventInstance$b */
    public class C16429b extends C19619s<EventInstance> {
        public C16429b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            if (i != 1) {
                Event.C16421b bVar = Event.f42910j;
                pVar.getClass();
                Event event = (Event) bVar.read(pVar);
                return new EventInstance(event, new ServerId(pVar.mo51924l()), event.f42912c, event.f42913d, pVar.mo51925m(), (EventVehicleType) C13555b.m33968g(EventVehicleType.CODER, pVar), pVar.mo51924l(), (ServerId) null);
            }
            Event.C16421b bVar2 = Event.f42910j;
            pVar.getClass();
            Event event2 = (Event) bVar2.read(pVar);
            ServerId serverId2 = new ServerId(pVar.mo51924l());
            Image image = (Image) C16019d.m40803a().f41718d.read(pVar);
            String p = pVar.mo51947p();
            long m = pVar.mo51925m();
            EventVehicleType eventVehicleType = (EventVehicleType) C13555b.m33968g(EventVehicleType.CODER, pVar);
            int l = pVar.mo51924l();
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new EventInstance(event2, serverId2, image, p, m, eventVehicleType, l, serverId);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EventInstance eventInstance = (EventInstance) obj;
            Event event = eventInstance.f42943b;
            Event.C16421b bVar = Event.f42910j;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(event, qVar);
            qVar.mo51939l(eventInstance.f42944c.f15142b);
            C16019d.m40803a().f41718d.write(eventInstance.f42945d, qVar);
            qVar.mo51954p(eventInstance.f42946e);
            qVar.mo51940m(eventInstance.f42947f);
            EventVehicleType.CODER.write(eventInstance.f42948g, qVar);
            qVar.mo51939l(eventInstance.f42949h);
            ServerId serverId = eventInstance.f42950i;
            if (serverId == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51939l(serverId.f15142b);
        }
    }

    public EventInstance(Event event, ServerId serverId, Image image, String str, long j, EventVehicleType eventVehicleType, int i, ServerId serverId2) {
        C21100e.m49373x(event, "event");
        this.f42943b = event;
        this.f42944c = serverId;
        C21100e.m49373x(image, "image");
        this.f42945d = image;
        C21100e.m49373x(str, "name");
        this.f42946e = str;
        this.f42947f = j;
        C21100e.m49373x(eventVehicleType, "vehicleType");
        this.f42948g = eventVehicleType;
        this.f42949h = i;
        this.f42950i = serverId2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EventInstance)) {
            return false;
        }
        return this.f42944c.equals(((EventInstance) obj).f42944c);
    }

    public final ServerId getServerId() {
        return this.f42944c;
    }

    public final int hashCode() {
        return this.f42944c.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42942j);
    }
}
