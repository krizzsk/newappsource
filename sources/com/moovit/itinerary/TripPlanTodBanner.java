package com.moovit.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TripPlanTodBanner implements Parcelable {
    public static final Parcelable.Creator<TripPlanTodBanner> CREATOR = new C16076a();

    /* renamed from: j */
    public static final C16077b f41856j = new C16077b(TripPlanTodBanner.class);

    /* renamed from: b */
    public final ServerId f41857b;

    /* renamed from: c */
    public final ServerId f41858c;

    /* renamed from: d */
    public final long f41859d;

    /* renamed from: e */
    public final long f41860e;

    /* renamed from: f */
    public final CurrencyAmount f41861f;

    /* renamed from: g */
    public final String f41862g;

    /* renamed from: h */
    public final C16078c f41863h;

    /* renamed from: i */
    public final String f41864i;

    /* renamed from: com.moovit.itinerary.TripPlanTodBanner$a */
    public class C16076a implements Parcelable.Creator<TripPlanTodBanner> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlanTodBanner) C19612n.m46981v(parcel, TripPlanTodBanner.f41856j);
        }

        public final Object[] newArray(int i) {
            return new TripPlanTodBanner[i];
        }
    }

    /* renamed from: com.moovit.itinerary.TripPlanTodBanner$b */
    public class C16077b extends C19619s<TripPlanTodBanner> {
        public C16077b(Class cls) {
            super(6, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 6;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            switch (i) {
                case 1:
                    pVar.getClass();
                    ServerId serverId = new ServerId(pVar.mo51924l());
                    pVar.mo51919b();
                    long currentTimeMillis = System.currentTimeMillis() + ((long) pVar.mo51924l());
                    pVar.mo51924l();
                    return new TripPlanTodBanner(serverId, new ServerId(-1), currentTimeMillis, -1, (CurrencyAmount) null, pVar.mo51948t(), (C16078c) null, (String) null);
                case 2:
                    pVar.getClass();
                    return new TripPlanTodBanner(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51925m(), -1, (CurrencyAmount) pVar.mo51962q(CurrencyAmount.f23843f), pVar.mo51948t(), (C16078c) null, (String) null);
                case 3:
                    pVar.getClass();
                    return new TripPlanTodBanner(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51925m(), -1, (CurrencyAmount) pVar.mo51962q(CurrencyAmount.f23843f), pVar.mo51948t(), new C16078c(pVar.mo51948t(), pVar.mo51948t(), (String) null, (String) null), (String) null);
                case 4:
                    pVar.getClass();
                    return new TripPlanTodBanner(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51925m(), -1, (CurrencyAmount) pVar.mo51962q(CurrencyAmount.f23843f), pVar.mo51948t(), (C16078c) pVar.mo51962q(C16078c.f41865e), (String) null);
                case 5:
                    pVar.getClass();
                    return new TripPlanTodBanner(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51925m(), pVar.mo51925m(), (CurrencyAmount) pVar.mo51962q(CurrencyAmount.f23843f), pVar.mo51948t(), (C16078c) pVar.mo51962q(C16078c.f41865e), (String) null);
                case 6:
                    pVar.getClass();
                    return new TripPlanTodBanner(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51925m(), pVar.mo51925m(), (CurrencyAmount) pVar.mo51962q(CurrencyAmount.f23843f), pVar.mo51948t(), (C16078c) pVar.mo51962q(C16078c.f41865e), pVar.mo51948t());
                default:
                    pVar.getClass();
                    ServerId serverId2 = new ServerId(pVar.mo51924l());
                    pVar.mo51919b();
                    long currentTimeMillis2 = System.currentTimeMillis() + ((long) pVar.mo51924l());
                    pVar.mo51924l();
                    return new TripPlanTodBanner(serverId2, new ServerId(-1), currentTimeMillis2, -1, (CurrencyAmount) null, (String) null, (C16078c) null, (String) null);
            }
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TripPlanTodBanner tripPlanTodBanner = (TripPlanTodBanner) obj;
            ServerId serverId = tripPlanTodBanner.f41857b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(tripPlanTodBanner.f41858c.f15142b);
            qVar.mo51940m(tripPlanTodBanner.f41859d);
            qVar.mo51940m(tripPlanTodBanner.f41860e);
            qVar.mo51967q(tripPlanTodBanner.f41861f, CurrencyAmount.f23843f);
            qVar.mo51955t(tripPlanTodBanner.f41862g);
            qVar.mo51967q(tripPlanTodBanner.f41863h, C16078c.f41865e);
            qVar.mo51955t(tripPlanTodBanner.f41864i);
        }
    }

    /* renamed from: com.moovit.itinerary.TripPlanTodBanner$c */
    public static class C16078c {

        /* renamed from: e */
        public static final C16079a f41865e = new C16079a();

        /* renamed from: a */
        public final String f41866a;

        /* renamed from: b */
        public final String f41867b;

        /* renamed from: c */
        public final String f41868c;

        /* renamed from: d */
        public final String f41869d;

        /* renamed from: com.moovit.itinerary.TripPlanTodBanner$c$a */
        public class C16079a extends C19619s<C16078c> {
            public C16079a() {
                super(0, C16078c.class);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                return new C16078c(pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                C16078c cVar = (C16078c) obj;
                qVar.mo51955t(cVar.f41866a);
                qVar.mo51955t(cVar.f41867b);
                qVar.mo51955t(cVar.f41868c);
                qVar.mo51955t(cVar.f41869d);
            }
        }

        public C16078c(String str, String str2, String str3, String str4) {
            this.f41866a = str;
            this.f41867b = str2;
            this.f41868c = str3;
            this.f41869d = str4;
        }
    }

    public TripPlanTodBanner(ServerId serverId, ServerId serverId2, long j, long j2, CurrencyAmount currencyAmount, String str, C16078c cVar, String str2) {
        this.f41857b = serverId;
        this.f41858c = serverId2;
        this.f41859d = j;
        this.f41860e = j2;
        this.f41861f = currencyAmount;
        this.f41862g = str;
        this.f41863h = cVar;
        this.f41864i = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41856j);
    }
}
