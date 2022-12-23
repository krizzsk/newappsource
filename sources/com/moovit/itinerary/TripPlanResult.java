package com.moovit.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20944i0;

public class TripPlanResult implements Parcelable {
    public static final Parcelable.Creator<TripPlanResult> CREATOR = new C16073a();

    /* renamed from: g */
    public static final C16074b f41849g = new C16074b();

    /* renamed from: h */
    public static final C16075c f41850h = new C16075c(TripPlanResult.class);

    /* renamed from: b */
    public final TripPlanConfig f41851b;

    /* renamed from: c */
    public final Itinerary f41852c;

    /* renamed from: d */
    public final C20944i0<ServerId, Integer> f41853d;

    /* renamed from: e */
    public final TripPlanTodBanner f41854e;

    /* renamed from: f */
    public final TripPlanFlexTimeBanner f41855f;

    /* renamed from: com.moovit.itinerary.TripPlanResult$a */
    public class C16073a implements Parcelable.Creator<TripPlanResult> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlanResult) C19612n.m46981v(parcel, TripPlanResult.f41850h);
        }

        public final Object[] newArray(int i) {
            return new TripPlanResult[i];
        }
    }

    /* renamed from: com.moovit.itinerary.TripPlanResult$b */
    public class C16074b extends C19621u<TripPlanResult> {
        public C16074b() {
            super(6);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlanResult tripPlanResult = (TripPlanResult) obj;
            qVar.mo51967q(tripPlanResult.f41851b, TripPlanConfig.f41930d);
            qVar.mo51967q(tripPlanResult.f41852c, Itinerary.f41892f);
            C20944i0<ServerId, Integer> i0Var = tripPlanResult.f41853d;
            if (i0Var == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                F f = i0Var.f52692a;
                if (f == null) {
                    qVar.mo51934b(false);
                } else {
                    qVar.mo51934b(true);
                    qVar.mo51939l(((ServerId) f).f15142b);
                }
                S s = i0Var.f52693b;
                if (s == null) {
                    qVar.mo51934b(false);
                } else {
                    qVar.mo51934b(true);
                    qVar.mo51939l(((Integer) s).intValue());
                }
            }
            qVar.mo51967q(tripPlanResult.f41854e, TripPlanTodBanner.f41856j);
            qVar.mo51967q(tripPlanResult.f41855f, TripPlanFlexTimeBanner.f41844f);
        }
    }

    /* renamed from: com.moovit.itinerary.TripPlanResult$c */
    public class C16075c extends C19620t<TripPlanResult> {
        public C16075c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 6;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C20944i0 i0Var;
            ServerId serverId;
            C20944i0 i0Var2;
            ServerId serverId2;
            C20944i0 i0Var3;
            ServerId serverId3;
            C20944i0 i0Var4;
            ServerId serverId4;
            Integer num = null;
            switch (i) {
                case 0:
                    return new TripPlanResult((TripPlanConfig) pVar.mo51962q(TripPlanConfig.f41931e), (Itinerary) pVar.mo51962q(Itinerary.f41893g), (C20944i0<ServerId, Integer>) null, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null);
                case 1:
                    TripPlanConfig tripPlanConfig = (TripPlanConfig) pVar.mo51962q(TripPlanConfig.f41931e);
                    Itinerary itinerary = (Itinerary) pVar.mo51962q(Itinerary.f41893g);
                    if (!(!pVar.mo51919b())) {
                        pVar.mo51924l();
                        pVar.mo51926r();
                    }
                    return new TripPlanResult(tripPlanConfig, itinerary, (C20944i0<ServerId, Integer>) null, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null);
                case 2:
                    pVar.mo51924l();
                    pVar.mo51924l();
                    return new TripPlanResult((TripPlanConfig) pVar.mo51962q(TripPlanConfig.f41931e), (Itinerary) pVar.mo51962q(Itinerary.f41893g), (C20944i0<ServerId, Integer>) null, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null);
                case 3:
                    TripPlanConfig tripPlanConfig2 = (TripPlanConfig) pVar.mo51962q(TripPlanConfig.f41931e);
                    Itinerary itinerary2 = (Itinerary) pVar.mo51962q(Itinerary.f41893g);
                    pVar.mo51924l();
                    pVar.mo51924l();
                    if (!pVar.mo51919b()) {
                        i0Var = null;
                    } else {
                        if (!pVar.mo51919b()) {
                            serverId = null;
                        } else {
                            serverId = new ServerId(pVar.mo51924l());
                        }
                        if (!(!pVar.mo51919b())) {
                            num = Integer.valueOf(pVar.mo51924l());
                        }
                        i0Var = new C20944i0(serverId, num);
                    }
                    return new TripPlanResult(tripPlanConfig2, itinerary2, i0Var, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null);
                case 4:
                    TripPlanConfig tripPlanConfig3 = (TripPlanConfig) pVar.mo51962q(TripPlanConfig.f41931e);
                    Itinerary itinerary3 = (Itinerary) pVar.mo51962q(Itinerary.f41893g);
                    if (!pVar.mo51919b()) {
                        i0Var2 = null;
                    } else {
                        if (!pVar.mo51919b()) {
                            serverId2 = null;
                        } else {
                            serverId2 = new ServerId(pVar.mo51924l());
                        }
                        if (!(!pVar.mo51919b())) {
                            num = Integer.valueOf(pVar.mo51924l());
                        }
                        i0Var2 = new C20944i0(serverId2, num);
                    }
                    return new TripPlanResult(tripPlanConfig3, itinerary3, i0Var2, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null);
                case 5:
                    TripPlanConfig tripPlanConfig4 = (TripPlanConfig) pVar.mo51962q(TripPlanConfig.f41931e);
                    Itinerary itinerary4 = (Itinerary) pVar.mo51962q(Itinerary.f41893g);
                    if (!pVar.mo51919b()) {
                        i0Var3 = null;
                    } else {
                        if (!pVar.mo51919b()) {
                            serverId3 = null;
                        } else {
                            serverId3 = new ServerId(pVar.mo51924l());
                        }
                        if (!(!pVar.mo51919b())) {
                            num = Integer.valueOf(pVar.mo51924l());
                        }
                        i0Var3 = new C20944i0(serverId3, num);
                    }
                    return new TripPlanResult(tripPlanConfig4, itinerary4, i0Var3, (TripPlanTodBanner) pVar.mo51962q(TripPlanTodBanner.f41856j), (TripPlanFlexTimeBanner) null);
                case 6:
                    TripPlanConfig tripPlanConfig5 = (TripPlanConfig) pVar.mo51962q(TripPlanConfig.f41931e);
                    Itinerary itinerary5 = (Itinerary) pVar.mo51962q(Itinerary.f41893g);
                    if (!pVar.mo51919b()) {
                        i0Var4 = null;
                    } else {
                        if (!pVar.mo51919b()) {
                            serverId4 = null;
                        } else {
                            serverId4 = new ServerId(pVar.mo51924l());
                        }
                        if (!(!pVar.mo51919b())) {
                            num = Integer.valueOf(pVar.mo51924l());
                        }
                        i0Var4 = new C20944i0(serverId4, num);
                    }
                    return new TripPlanResult(tripPlanConfig5, itinerary5, i0Var4, (TripPlanTodBanner) pVar.mo51962q(TripPlanTodBanner.f41856j), (TripPlanFlexTimeBanner) pVar.mo51962q(TripPlanFlexTimeBanner.f41844f));
                default:
                    throw new IllegalStateException(C16759e.m42349e("Unsupported version: ", i));
            }
        }
    }

    public TripPlanResult() {
        throw null;
    }

    public TripPlanResult(Itinerary itinerary) {
        this((TripPlanConfig) null, itinerary, (C20944i0<ServerId, Integer>) null, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null);
    }

    /* renamed from: b */
    public final boolean mo48273b() {
        return this.f41852c != null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41849g);
    }

    public TripPlanResult(TripPlanConfig tripPlanConfig, Itinerary itinerary, C20944i0<ServerId, Integer> i0Var, TripPlanTodBanner tripPlanTodBanner, TripPlanFlexTimeBanner tripPlanFlexTimeBanner) {
        this.f41851b = tripPlanConfig;
        this.f41852c = itinerary;
        this.f41853d = i0Var;
        this.f41854e = tripPlanTodBanner;
        this.f41855f = tripPlanFlexTimeBanner;
    }
}
