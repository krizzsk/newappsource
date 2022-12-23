package com.moovit.ridesharing.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class EventBookingOption implements Parcelable, C5384a {
    public static final Parcelable.Creator<EventBookingOption> CREATOR = new C16424a();

    /* renamed from: k */
    public static C16425b f42926k = new C16425b(EventBookingOption.class);

    /* renamed from: b */
    public final ServerId f42927b;

    /* renamed from: c */
    public final long f42928c;

    /* renamed from: d */
    public final EventVehicleType f42929d;

    /* renamed from: e */
    public final CurrencyAmount f42930e;

    /* renamed from: f */
    public final CurrencyAmount f42931f;

    /* renamed from: g */
    public final int f42932g;

    /* renamed from: h */
    public final LocationDescriptor f42933h;

    /* renamed from: i */
    public final long f42934i;

    /* renamed from: j */
    public final String f42935j;

    /* renamed from: com.moovit.ridesharing.model.EventBookingOption$a */
    public class C16424a implements Parcelable.Creator<EventBookingOption> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventBookingOption) C19612n.m46981v(parcel, EventBookingOption.f42926k);
        }

        public final Object[] newArray(int i) {
            return new EventBookingOption[i];
        }
    }

    /* renamed from: com.moovit.ridesharing.model.EventBookingOption$b */
    public class C16425b extends C19619s<EventBookingOption> {
        public C16425b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            long j;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            long m = pVar.mo51925m();
            EventVehicleType eventVehicleType = (EventVehicleType) C13555b.m33968g(EventVehicleType.CODER, pVar);
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            CurrencyAmount currencyAmount = (CurrencyAmount) bVar.read(pVar);
            CurrencyAmount currencyAmount2 = (CurrencyAmount) bVar.read(pVar);
            int l = pVar.mo51924l();
            LocationDescriptor locationDescriptor = (LocationDescriptor) pVar.mo51962q(LocationDescriptor.f23646m);
            String t = pVar.mo51948t();
            if (i >= 1) {
                j = pVar.mo51925m();
            } else {
                j = -1;
            }
            return new EventBookingOption(serverId, m, eventVehicleType, currencyAmount, currencyAmount2, l, locationDescriptor, j, t);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EventBookingOption eventBookingOption = (EventBookingOption) obj;
            ServerId serverId = eventBookingOption.f42927b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51940m(eventBookingOption.f42928c);
            EventVehicleType.CODER.write(eventBookingOption.f42929d, qVar);
            CurrencyAmount currencyAmount = eventBookingOption.f42930e;
            CurrencyAmount.C7881b bVar = CurrencyAmount.f23843f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount, qVar);
            CurrencyAmount currencyAmount2 = eventBookingOption.f42931f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(currencyAmount2, qVar);
            qVar.mo51939l(eventBookingOption.f42932g);
            qVar.mo51967q(eventBookingOption.f42933h, LocationDescriptor.f23645l);
            qVar.mo51955t(eventBookingOption.f42935j);
            qVar.mo51940m(eventBookingOption.f42934i);
        }
    }

    public EventBookingOption(ServerId serverId, long j, EventVehicleType eventVehicleType, CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, int i, LocationDescriptor locationDescriptor, long j2, String str) {
        this.f42927b = serverId;
        this.f42928c = j;
        C21100e.m49373x(eventVehicleType, "vehicleType");
        this.f42929d = eventVehicleType;
        C21100e.m49373x(currencyAmount, "fullPrice");
        this.f42930e = currencyAmount;
        C21100e.m49373x(currencyAmount2, InAppPurchaseMetaData.KEY_PRICE);
        this.f42931f = currencyAmount2;
        this.f42932g = i;
        this.f42933h = locationDescriptor;
        this.f42934i = j2;
        this.f42935j = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f42927b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42926k);
    }
}
