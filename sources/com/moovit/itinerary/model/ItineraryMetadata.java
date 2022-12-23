package com.moovit.itinerary.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20975x0;

public class ItineraryMetadata implements Parcelable {
    public static final Parcelable.Creator<ItineraryMetadata> CREATOR = new C16088a();

    /* renamed from: m */
    public static final C16089b f41898m = new C16089b();

    /* renamed from: n */
    public static final C16090c f41899n = new C16090c(ItineraryMetadata.class);

    /* renamed from: b */
    public final String f41900b;

    /* renamed from: c */
    public final ServerId f41901c;

    /* renamed from: d */
    public final int f41902d;

    /* renamed from: e */
    public final String f41903e;

    /* renamed from: f */
    public final CurrencyAmount f41904f;

    /* renamed from: g */
    public final boolean f41905g;

    /* renamed from: h */
    public final boolean f41906h;

    /* renamed from: i */
    public final boolean f41907i;

    /* renamed from: j */
    public final boolean f41908j;

    /* renamed from: k */
    public final EmissionLevel f41909k;

    /* renamed from: l */
    public final String f41910l;

    /* renamed from: com.moovit.itinerary.model.ItineraryMetadata$a */
    public class C16088a implements Parcelable.Creator<ItineraryMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (ItineraryMetadata) C19612n.m46981v(parcel, ItineraryMetadata.f41899n);
        }

        public final Object[] newArray(int i) {
            return new ItineraryMetadata[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.ItineraryMetadata$b */
    public class C16089b extends C19621u<ItineraryMetadata> {
        public C16089b() {
            super(4);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ItineraryMetadata itineraryMetadata = (ItineraryMetadata) obj;
            ServerId serverId = itineraryMetadata.f41901c;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51939l(itineraryMetadata.f41902d);
            qVar.mo51955t(itineraryMetadata.f41903e);
            qVar.mo51967q(itineraryMetadata.f41904f, CurrencyAmount.f23843f);
            qVar.mo51934b(itineraryMetadata.f41905g);
            qVar.mo51934b(itineraryMetadata.f41906h);
            qVar.mo51934b(itineraryMetadata.f41907i);
            qVar.mo51934b(itineraryMetadata.f41908j);
            qVar.mo51967q(itineraryMetadata.f41909k, EmissionLevel.f41889d);
            qVar.mo51955t(itineraryMetadata.f41910l);
            qVar.mo51955t(itineraryMetadata.f41900b);
        }
    }

    /* renamed from: com.moovit.itinerary.model.ItineraryMetadata$c */
    public class C16090c extends C19620t<ItineraryMetadata> {
        public C16090c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 4;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            CurrencyAmount currencyAmount;
            boolean z;
            EmissionLevel emissionLevel;
            String str;
            C19615p pVar2 = pVar;
            int i2 = i;
            String str2 = null;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            int l = pVar.mo51924l();
            String t = pVar.mo51948t();
            if (i2 >= 2) {
                currencyAmount = (CurrencyAmount) pVar2.mo51962q(CurrencyAmount.f23843f);
            } else {
                currencyAmount = null;
            }
            boolean b = pVar.mo51919b();
            boolean b2 = pVar.mo51919b();
            boolean b3 = pVar.mo51919b();
            if (i2 < 1 || !pVar.mo51919b()) {
                z = false;
            } else {
                z = true;
            }
            if (i2 >= 3) {
                emissionLevel = (EmissionLevel) pVar2.mo51962q(EmissionLevel.f41889d);
            } else {
                emissionLevel = null;
            }
            if (i2 >= 4) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i2 >= 4) {
                str2 = pVar.mo51948t();
            }
            return new ItineraryMetadata(str2, serverId, l, t, currencyAmount, b, b2, b3, z, emissionLevel, str);
        }
    }

    public ItineraryMetadata(String str, ServerId serverId, int i, String str2, CurrencyAmount currencyAmount, boolean z, boolean z2, boolean z3, boolean z4, EmissionLevel emissionLevel, String str3) {
        this.f41900b = str;
        this.f41901c = serverId;
        this.f41902d = i;
        this.f41903e = str2;
        this.f41904f = currencyAmount;
        this.f41905g = z;
        this.f41906h = z2;
        this.f41907i = z3;
        this.f41908j = z4;
        this.f41909k = emissionLevel;
        this.f41910l = str3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ItineraryMetadata)) {
            return false;
        }
        ItineraryMetadata itineraryMetadata = (ItineraryMetadata) obj;
        if (!C20975x0.m49118e(this.f41901c, itineraryMetadata.f41901c) || this.f41902d != itineraryMetadata.f41902d || !C20975x0.m49118e(this.f41903e, itineraryMetadata.f41903e) || !C20975x0.m49118e(this.f41904f, itineraryMetadata.f41904f) || this.f41905g != itineraryMetadata.f41905g || this.f41906h != itineraryMetadata.f41906h || this.f41907i != itineraryMetadata.f41907i || this.f41908j != itineraryMetadata.f41908j || !C20975x0.m49118e(this.f41909k, itineraryMetadata.f41909k) || !C20975x0.m49118e(this.f41910l, itineraryMetadata.f41910l)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f41901c), this.f41902d, C17884p.m44335F(this.f41903e), C17884p.m44335F(this.f41904f), this.f41905g, this.f41906h, this.f41907i, this.f41908j, C17884p.m44335F(this.f41909k), C17884p.m44335F(this.f41910l));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41898m);
    }
}
