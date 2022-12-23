package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appsflyer.ServerParameters;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.EventInstance;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j40.C5384a;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class EventRequest implements Parcelable, C5384a {
    public static final Parcelable.Creator<EventRequest> CREATOR = new C16432a();

    /* renamed from: j */
    public static final C16433b f42951j = new C16433b(EventRequest.class);

    /* renamed from: b */
    public final int f42952b;

    /* renamed from: c */
    public final EventInstance f42953c;

    /* renamed from: d */
    public final LocationDescriptor f42954d;

    /* renamed from: e */
    public final EventRequestStatus f42955e;

    /* renamed from: f */
    public final CurrencyAmount f42956f;

    /* renamed from: g */
    public final EventRide f42957g;

    /* renamed from: h */
    public final int f42958h;

    /* renamed from: i */
    public final Key f42959i;

    public static class Key implements Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new C16430a();

        /* renamed from: h */
        public static C16431b f42960h = new C16431b(Key.class);

        /* renamed from: b */
        public final ServerId f42961b;

        /* renamed from: c */
        public final ServerId f42962c;

        /* renamed from: d */
        public final ServerId f42963d;

        /* renamed from: e */
        public final ServerId f42964e;

        /* renamed from: f */
        public final ServerId f42965f;

        /* renamed from: g */
        public final ServerId f42966g;

        /* renamed from: com.moovit.ridesharing.model.EventRequest$Key$a */
        public class C16430a implements Parcelable.Creator<Key> {
            public final Object createFromParcel(Parcel parcel) {
                return (Key) C19612n.m46981v(parcel, Key.f42960h);
            }

            public final Object[] newArray(int i) {
                return new Key[i];
            }
        }

        /* renamed from: com.moovit.ridesharing.model.EventRequest$Key$b */
        public class C16431b extends C19619s<Key> {
            public C16431b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                ServerId.C4255c cVar = ServerId.f15141f;
                pVar.getClass();
                return new Key(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), (ServerId) pVar.mo51962q(cVar), (ServerId) pVar.mo51962q(cVar), (ServerId) pVar.mo51962q(cVar), (ServerId) pVar.mo51962q(cVar));
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                Key key = (Key) obj;
                ServerId serverId = key.f42961b;
                ServerId.C4254b bVar = ServerId.f15140e;
                qVar.getClass();
                bVar.write(serverId, qVar);
                bVar.write(key.f42962c, qVar);
                qVar.mo51967q(key.f42963d, bVar);
                qVar.mo51967q(key.f42964e, bVar);
                qVar.mo51967q(key.f42965f, bVar);
                qVar.mo51967q(key.f42966g, bVar);
            }
        }

        public Key(ServerId serverId, ServerId serverId2, ServerId serverId3, ServerId serverId4, ServerId serverId5, ServerId serverId6) {
            C21100e.m49373x(serverId, "eventId");
            this.f42961b = serverId;
            C21100e.m49373x(serverId2, "eventInstanceId");
            this.f42962c = serverId2;
            this.f42963d = serverId3;
            this.f42964e = serverId4;
            this.f42965f = serverId5;
            this.f42966g = serverId6;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (!this.f42961b.equals(key.f42961b) || !this.f42962c.equals(key.f42962c) || !C20975x0.m49118e(this.f42963d, key.f42963d) || !C20975x0.m49118e(this.f42964e, key.f42964e) || !C20975x0.m49118e(this.f42965f, key.f42965f) || !C20975x0.m49118e(this.f42966g, key.f42966g)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C17884p.m44333D(C17884p.m44335F(this.f42961b), C17884p.m44335F(this.f42962c), C17884p.m44335F(this.f42963d), C17884p.m44335F(this.f42964e));
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Key[");
            k.append(this.f42961b);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f42962c);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f42963d);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f42964e);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f42965f);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f42966g);
            k.append("]");
            return k.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f42960h);
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventRequest$a */
    public class C16432a implements Parcelable.Creator<EventRequest> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventRequest) C19612n.m46981v(parcel, EventRequest.f42951j);
        }

        public final Object[] newArray(int i) {
            return new EventRequest[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventRequest$b */
    public class C16433b extends C19619s<EventRequest> {
        public C16433b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0 || i == 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            int i2;
            int l = pVar.mo51924l();
            EventInstance eventInstance = (EventInstance) EventInstance.f42942j.read(pVar);
            LocationDescriptor locationDescriptor = (LocationDescriptor) LocationDescriptor.f23646m.read(pVar);
            EventRequestStatus eventRequestStatus = (EventRequestStatus) C13555b.m33968g(EventRequestStatus.CODER, pVar);
            CurrencyAmount currencyAmount = (CurrencyAmount) CurrencyAmount.f23843f.read(pVar);
            EventRide eventRide = (EventRide) pVar.mo51962q(EventRide.f42968g);
            Key key = (Key) Key.f42960h.read(pVar);
            if (i >= 1) {
                i2 = pVar.mo51924l();
            } else {
                i2 = 1;
            }
            return new EventRequest(l, eventInstance, locationDescriptor, eventRequestStatus, currencyAmount, eventRide, i2, key);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EventRequest eventRequest = (EventRequest) obj;
            qVar.mo51939l(eventRequest.f42952b);
            EventInstance eventInstance = eventRequest.f42953c;
            EventInstance.C16429b bVar = EventInstance.f42942j;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(eventInstance, qVar);
            LocationDescriptor locationDescriptor = eventRequest.f42954d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar2.mo19622a(locationDescriptor, qVar);
            EventRequestStatus.CODER.write(eventRequest.f42955e, qVar);
            CurrencyAmount currencyAmount = eventRequest.f42956f;
            CurrencyAmount.C7881b bVar3 = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(currencyAmount, qVar);
            qVar.mo51967q(eventRequest.f42957g, EventRide.f42968g);
            Key key = eventRequest.f42959i;
            Key.C16431b bVar4 = Key.f42960h;
            qVar.mo51939l(bVar4.f49802v);
            bVar4.mo179c(key, qVar);
            qVar.mo51939l(eventRequest.f42958h);
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventRequest$c */
    public static /* synthetic */ class C16434c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42967a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.ridesharing.model.EventRequestStatus[] r0 = com.moovit.ridesharing.model.EventRequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42967a = r0
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.WAITING_FOR_PROVIDER_APPROVAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42967a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.APPROVED_BY_PROVIDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42967a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.REJECTED_BY_PROVIDER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42967a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.CANCELED_BY_PASSENGER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f42967a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.FULFILLED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f42967a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.UNFULFILLED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ridesharing.model.EventRequest.C16434c.<clinit>():void");
        }
    }

    public EventRequest(int i, EventInstance eventInstance, LocationDescriptor locationDescriptor, EventRequestStatus eventRequestStatus, CurrencyAmount currencyAmount, EventRide eventRide, int i2, Key key) {
        this.f42952b = i;
        C21100e.m49373x(eventInstance, "instance");
        this.f42953c = eventInstance;
        C21100e.m49373x(locationDescriptor, "userLocation");
        this.f42954d = locationDescriptor;
        C21100e.m49373x(eventRequestStatus, ServerParameters.STATUS);
        this.f42955e = eventRequestStatus;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f42956f = currencyAmount;
        this.f42957g = eventRide;
        C21100e.m49375y(1, Integer.MAX_VALUE, "ticketsAmount", i2);
        this.f42958h = i2;
        C21100e.m49373x(key, "id");
        this.f42959i = key;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EventRequest)) {
            return false;
        }
        return this.f42953c.equals(((EventRequest) obj).f42953c);
    }

    public final ServerId getServerId() {
        return this.f42953c.f42944c;
    }

    public final int hashCode() {
        return this.f42953c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42951j);
    }
}
