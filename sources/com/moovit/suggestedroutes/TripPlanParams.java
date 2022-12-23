package com.moovit.suggestedroutes;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13717b;
import c00.C13719c;
import c00.C13720d;
import c00.C13722f;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.TripPlanResult;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitType;
import com.moovit.tripplanner.TripPlannerParams;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n10.C18505b;
import p009a8.C0111k;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19620t;
import p810sz.C19621u;

public class TripPlanParams extends TripPlannerParams {
    public static final Parcelable.Creator<TripPlanParams> CREATOR = new C7623a();

    /* renamed from: h */
    public static final C7624b f23216h = new C7624b();

    /* renamed from: i */
    public static final C7625c f23217i = new C7625c(TripPlanParams.class);

    /* renamed from: d */
    public final TripPlannerTime f23218d;

    /* renamed from: e */
    public final TripPlannerRouteType f23219e;

    /* renamed from: f */
    public final Set<TripPlannerTransportType> f23220f;

    /* renamed from: g */
    public final List<TripPlanResult> f23221g;

    /* renamed from: com.moovit.suggestedroutes.TripPlanParams$a */
    public class C7623a implements Parcelable.Creator<TripPlanParams> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlanParams) C19612n.m46981v(parcel, TripPlanParams.f23217i);
        }

        public final Object[] newArray(int i) {
            return new TripPlanParams[i];
        }
    }

    /* renamed from: com.moovit.suggestedroutes.TripPlanParams$b */
    public class C7624b extends C19621u<TripPlanParams> {
        public C7624b() {
            super(3);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlanParams tripPlanParams = (TripPlanParams) obj;
            Parcelable.Creator<TripPlanParams> creator = TripPlanParams.CREATOR;
            LocationDescriptor locationDescriptor = tripPlanParams.f23788b;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.mo51967q(locationDescriptor, bVar);
            qVar.mo51967q(tripPlanParams.f23789c, bVar);
            qVar.mo51967q(tripPlanParams.f23218d, TripPlannerTime.f23797d);
            qVar.mo51967q(tripPlanParams.f23219e, TripPlannerRouteType.CODER);
            qVar.mo51964g(tripPlanParams.f23220f, TripPlannerTransportType.CODER);
            qVar.mo51964g(tripPlanParams.f23221g, TripPlanResult.f41849g);
        }
    }

    /* renamed from: com.moovit.suggestedroutes.TripPlanParams$c */
    public class C7625c extends C19620t<TripPlanParams> {
        public C7625c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 3;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            HashSet hashSet;
            if (i == 1) {
                LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
                return new TripPlanParams((LocationDescriptor) pVar.mo51962q(cVar), (LocationDescriptor) pVar.mo51962q(cVar), (TripPlannerTime) pVar.mo51962q(TripPlannerTime.f23798e), (TripPlannerRouteType) null, (HashSet) null, pVar.mo51958f(TripPlanResult.f41850h));
            } else if (i == 2) {
                LocationDescriptor.C7795c cVar2 = LocationDescriptor.f23646m;
                ArrayList f = pVar.mo51958f(TransitType.f23756g);
                C19617r rVar = C16080a.f41870a;
                return new TripPlanParams((LocationDescriptor) pVar.mo51962q(cVar2), (LocationDescriptor) pVar.mo51962q(cVar2), (TripPlannerTime) pVar.mo51962q(TripPlannerTime.f23798e), (TripPlannerRouteType) pVar.mo51962q(TripPlannerRouteType.CODER), C13720d.m34277g(f, (C13722f) null, new C13719c(new C18505b(1), new C0111k(3))), pVar.mo51958f(TripPlanResult.f41850h));
            } else if (i != 3) {
                LocationDescriptor.C7795c cVar3 = LocationDescriptor.f23646m;
                return new TripPlanParams((LocationDescriptor) pVar.mo51962q(cVar3), (LocationDescriptor) pVar.mo51962q(cVar3), (TripPlannerTime) pVar.mo51962q(TripPlannerTime.f23798e), (TripPlannerRouteType) null, (HashSet) null, (List) null);
            } else {
                LocationDescriptor.C7795c cVar4 = LocationDescriptor.f23646m;
                LocationDescriptor locationDescriptor = (LocationDescriptor) pVar.mo51962q(cVar4);
                LocationDescriptor locationDescriptor2 = (LocationDescriptor) pVar.mo51962q(cVar4);
                TripPlannerTime tripPlannerTime = (TripPlannerTime) pVar.mo51962q(TripPlannerTime.f23798e);
                TripPlannerRouteType tripPlannerRouteType = (TripPlannerRouteType) pVar.mo51962q(TripPlannerRouteType.CODER);
                C19584i iVar = TripPlannerTransportType.CODER;
                HashSet hashSet2 = new HashSet();
                int l = pVar.mo51924l();
                if (l == -1) {
                    hashSet = null;
                } else {
                    for (int i2 = 0; i2 < l; i2++) {
                        hashSet2.add(pVar.mo51962q(iVar));
                    }
                    hashSet = hashSet2;
                }
                return new TripPlanParams(locationDescriptor, locationDescriptor2, tripPlannerTime, tripPlannerRouteType, hashSet, pVar.mo51958f(TripPlanResult.f41850h));
            }
        }
    }

    /* renamed from: com.moovit.suggestedroutes.TripPlanParams$d */
    public static class C7626d extends TripPlannerParams.C7851a<TripPlanParams, C7626d> {

        /* renamed from: c */
        public TripPlannerTime f23222c = null;

        /* renamed from: d */
        public TripPlannerRouteType f23223d = null;

        /* renamed from: e */
        public HashSet f23224e = null;

        /* renamed from: f */
        public List<TripPlanResult> f23225f;

        /* renamed from: a */
        public final TripPlanParams mo23958a() {
            return new TripPlanParams(this.f23790a, this.f23791b, this.f23222c, this.f23223d, this.f23224e, this.f23225f);
        }

        /* renamed from: b */
        public final C7626d mo23959b(Set set) {
            if (C13717b.m34258e(set)) {
                return this;
            }
            if (this.f23224e == null) {
                this.f23224e = new HashSet(set.size());
            }
            this.f23224e.addAll(set);
            return this;
        }
    }

    public TripPlanParams() {
        throw null;
    }

    public TripPlanParams(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, TripPlannerTime tripPlannerTime, TripPlannerRouteType tripPlannerRouteType, HashSet hashSet, List list) {
        super(locationDescriptor, locationDescriptor2);
        this.f23218d = tripPlannerTime;
        this.f23219e = tripPlannerRouteType;
        this.f23220f = hashSet;
        this.f23221g = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23216h);
    }
}
