package com.moovit.app.suggestedroutes;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13719c;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.itinerary.C16080a;
import com.moovit.transit.TransitType;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import mf0.C24361g;
import n10.C18505b;
import p009a8.C0111k;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20975x0;

public class TripPlanOptions implements TripPlannerOptions {
    public static final Parcelable.Creator<TripPlanOptions> CREATOR = new C15369a();

    /* renamed from: h */
    public static final C15370b f39801h = new C15370b();

    /* renamed from: i */
    public static final C15371c f39802i = new C15371c(TripPlanOptions.class);

    /* renamed from: b */
    public final TripPlannerTime f39803b;

    /* renamed from: c */
    public final TripPlannerRouteType f39804c;

    /* renamed from: d */
    public final Set<TripPlannerTransportType> f39805d;

    /* renamed from: e */
    public final TripPlannerSortType f39806e;

    /* renamed from: f */
    public final TripPlannerPersonalPrefs f39807f;

    /* renamed from: g */
    public final AccessibilityPersonalPrefs f39808g;

    /* renamed from: com.moovit.app.suggestedroutes.TripPlanOptions$a */
    public class C15369a implements Parcelable.Creator<TripPlanOptions> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlanOptions) C19612n.m46981v(parcel, TripPlanOptions.f39802i);
        }

        public final Object[] newArray(int i) {
            return new TripPlanOptions[i];
        }
    }

    /* renamed from: com.moovit.app.suggestedroutes.TripPlanOptions$b */
    public class C15370b extends C19621u<TripPlanOptions> {
        public C15370b() {
            super(4);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlanOptions tripPlanOptions = (TripPlanOptions) obj;
            TripPlannerTime tripPlannerTime = tripPlanOptions.f39803b;
            TripPlannerTime.C7858b bVar = TripPlannerTime.f23797d;
            qVar.getClass();
            qVar.mo51939l(0);
            bVar.mo19622a(tripPlannerTime, qVar);
            TripPlannerRouteType.CODER.write(tripPlanOptions.f39804c, qVar);
            qVar.mo51965h(tripPlanOptions.f39805d, TripPlannerTransportType.CODER);
            qVar.mo51967q(tripPlanOptions.f39806e, TripPlannerSortType.CODER);
            TripPlannerPersonalPrefs tripPlannerPersonalPrefs = tripPlanOptions.f39807f;
            TripPlannerPersonalPrefs.C7853b bVar2 = TripPlannerPersonalPrefs.f23792d;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(tripPlannerPersonalPrefs, qVar);
            AccessibilityPersonalPrefs accessibilityPersonalPrefs = tripPlanOptions.f39808g;
            AccessibilityPersonalPrefs.C14692b bVar3 = AccessibilityPersonalPrefs.f37351d;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(accessibilityPersonalPrefs, qVar);
        }
    }

    /* renamed from: com.moovit.app.suggestedroutes.TripPlanOptions$c */
    public class C15371c extends C19620t<TripPlanOptions> {
        public C15371c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 4;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            boolean z;
            boolean z2;
            if (i == 1) {
                TripPlannerTime.C7859c cVar = TripPlannerTime.f23798e;
                pVar.getClass();
                return new TripPlanOptions((TripPlannerTime) cVar.read(pVar), (TripPlannerRouteType) C13555b.m33968g(TripPlannerRouteType.CODER, pVar), (Set) pVar.mo51960h(TripPlannerTransportType.CODER, new HashSet()), (TripPlannerSortType) null, new TripPlannerPersonalPrefs(false, -1), new AccessibilityPersonalPrefs());
            } else if (i == 2) {
                TripPlannerTime.C7859c cVar2 = TripPlannerTime.f23798e;
                pVar.getClass();
                return new TripPlanOptions((TripPlannerTime) cVar2.read(pVar), (TripPlannerRouteType) C13555b.m33968g(TripPlannerRouteType.CODER, pVar), (Set) pVar.mo51960h(TripPlannerTransportType.CODER, new HashSet()), (TripPlannerSortType) pVar.mo51962q(TripPlannerSortType.CODER), new TripPlannerPersonalPrefs(false, -1), new AccessibilityPersonalPrefs());
            } else if (i == 3) {
                TripPlannerTime.C7859c cVar3 = TripPlannerTime.f23798e;
                pVar.getClass();
                TripPlannerTime tripPlannerTime = (TripPlannerTime) cVar3.read(pVar);
                TripPlannerRouteType tripPlannerRouteType = (TripPlannerRouteType) C13555b.m33968g(TripPlannerRouteType.CODER, pVar);
                Set set = (Set) pVar.mo51960h(TripPlannerTransportType.CODER, new HashSet());
                TripPlannerSortType tripPlannerSortType = (TripPlannerSortType) pVar.mo51962q(TripPlannerSortType.CODER);
                int l = pVar.mo51924l();
                if (l != -1) {
                    int[] iArr = new int[2];
                    for (int i2 = 0; i2 < l; i2++) {
                        iArr[i2] = pVar.mo51926r();
                    }
                    z2 = C24361g.m61132B(iArr, 0);
                    z = C24361g.m61132B(iArr, 1);
                } else {
                    z2 = false;
                    z = false;
                }
                return new TripPlanOptions(tripPlannerTime, tripPlannerRouteType, set, tripPlannerSortType, new TripPlannerPersonalPrefs(z2, -1), new AccessibilityPersonalPrefs(z, false));
            } else if (i != 4) {
                TripPlannerTime.C7859c cVar4 = TripPlannerTime.f23798e;
                pVar.getClass();
                ArrayList g = pVar.mo51959g(TransitType.f23756g);
                C19617r rVar = C16080a.f41870a;
                return new TripPlanOptions((TripPlannerTime) cVar4.read(pVar), (TripPlannerRouteType) C13555b.m33968g(TripPlannerRouteType.CODER, pVar), C13720d.m34277g(g, (C13722f) null, new C13719c(new C18505b(1), new C0111k(3))), (TripPlannerSortType) null, new TripPlannerPersonalPrefs(false, -1), new AccessibilityPersonalPrefs());
            } else {
                TripPlannerTime.C7859c cVar5 = TripPlannerTime.f23798e;
                pVar.getClass();
                return new TripPlanOptions((TripPlannerTime) cVar5.read(pVar), (TripPlannerRouteType) C13555b.m33968g(TripPlannerRouteType.CODER, pVar), (Set) pVar.mo51960h(TripPlannerTransportType.CODER, new HashSet()), (TripPlannerSortType) pVar.mo51962q(TripPlannerSortType.CODER), (TripPlannerPersonalPrefs) TripPlannerPersonalPrefs.f23792d.read(pVar), (AccessibilityPersonalPrefs) AccessibilityPersonalPrefs.f37351d.read(pVar));
            }
        }
    }

    public TripPlanOptions(TripPlannerTime tripPlannerTime, TripPlannerRouteType tripPlannerRouteType, Set<TripPlannerTransportType> set, TripPlannerSortType tripPlannerSortType, TripPlannerPersonalPrefs tripPlannerPersonalPrefs, AccessibilityPersonalPrefs accessibilityPersonalPrefs) {
        C21100e.m49373x(tripPlannerTime, "time");
        this.f39803b = tripPlannerTime;
        C21100e.m49373x(tripPlannerRouteType, "routeType");
        this.f39804c = tripPlannerRouteType;
        C21100e.m49373x(set, "transportTypes");
        this.f39805d = Collections.unmodifiableSet(new HashSet(set));
        this.f39806e = tripPlannerSortType;
        C21100e.m49373x(tripPlannerPersonalPrefs, "personalPrefs");
        this.f39807f = tripPlannerPersonalPrefs;
        C21100e.m49373x(accessibilityPersonalPrefs, "accessibilityPrefs");
        this.f39808g = accessibilityPersonalPrefs;
    }

    /* renamed from: V */
    public final TripPlannerTime mo24463V() {
        return this.f39803b;
    }

    /* renamed from: Y */
    public final TripPlannerSortType mo24464Y() {
        return this.f39806e;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TripPlanOptions)) {
            return false;
        }
        TripPlanOptions tripPlanOptions = (TripPlanOptions) obj;
        if (!this.f39803b.equals(tripPlanOptions.f39803b) || !this.f39804c.equals(tripPlanOptions.f39804c) || !this.f39805d.equals(tripPlanOptions.f39805d) || !C20975x0.m49118e(this.f39806e, tripPlanOptions.f39806e) || !this.f39807f.equals(tripPlanOptions.f39807f) || !this.f39808g.equals(tripPlanOptions.f39808g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f39803b), C17884p.m44335F(this.f39804c), C17884p.m44335F(this.f39805d), C17884p.m44335F(this.f39806e), C17884p.m44335F(this.f39807f), C17884p.m44335F(this.f39808g));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39801h);
    }
}
