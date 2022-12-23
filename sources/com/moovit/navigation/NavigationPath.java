package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class NavigationPath implements C5384a, Parcelable {
    public static final Parcelable.Creator<NavigationPath> CREATOR = new C4218b();

    /* renamed from: k */
    public static final C4217a f15059k = new C4217a();

    /* renamed from: l */
    public static final C4219c f15060l = new C4219c();

    /* renamed from: m */
    public static final C4220d f15061m = new C4220d(NavigationPath.class);

    /* renamed from: b */
    public final ServerId f15062b;

    /* renamed from: c */
    public final Polyline f15063c;

    /* renamed from: d */
    public final ShapeReliability f15064d;

    /* renamed from: e */
    public final List<ServerId> f15065e;

    /* renamed from: f */
    public final List<NavigationGeofence> f15066f;

    /* renamed from: g */
    public final HashSet f15067g;

    /* renamed from: h */
    public final GeofencePath f15068h;

    /* renamed from: i */
    public final int f15069i;

    /* renamed from: j */
    public final int f15070j;

    public enum ShapeReliability {
        RELIABLE,
        UNRELIABLE,
        IRRELEVANT;
        
        public static C19584i<ShapeReliability> CODER;

        /* access modifiers changed from: public */
        static {
            ShapeReliability shapeReliability;
            ShapeReliability shapeReliability2;
            ShapeReliability shapeReliability3;
            CODER = new C19577c(ShapeReliability.class, shapeReliability, shapeReliability2, shapeReliability3);
        }
    }

    /* renamed from: com.moovit.navigation.NavigationPath$a */
    public class C4217a implements C13722f<NavigationGeofence> {
        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            return ((NavigationGeofence) obj).f15051g.f15025c;
        }
    }

    /* renamed from: com.moovit.navigation.NavigationPath$b */
    public class C4218b implements Parcelable.Creator<NavigationPath> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationPath) C19612n.m46981v(parcel, NavigationPath.f15061m);
        }

        public final Object[] newArray(int i) {
            return new NavigationPath[i];
        }
    }

    /* renamed from: com.moovit.navigation.NavigationPath$c */
    public class C4219c extends C19621u<NavigationPath> {
        public C4219c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Polylon polylon;
            NavigationPath navigationPath = (NavigationPath) obj;
            ServerId serverId = navigationPath.f15062b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            Polyline polyline = navigationPath.f15063c;
            Parcelable.Creator<Polylon> creator = Polylon.CREATOR;
            if (polyline == null) {
                polylon = null;
            } else if (polyline instanceof Polylon) {
                polylon = (Polylon) polyline;
            } else {
                polylon = new Polylon(polyline.getPoints(), polyline.mo24339Z0(), true);
            }
            qVar.mo51967q(polylon, Polylon.f40984g);
            ShapeReliability.CODER.write(navigationPath.f15064d, qVar);
            List<ServerId> list = navigationPath.f15065e;
            if (list == null) {
                qVar.mo51939l(-1);
            } else {
                qVar.mo51939l(list.size());
                for (ServerId serverId2 : list) {
                    qVar.mo51939l(serverId2.f15142b);
                }
            }
            qVar.mo51967q(navigationPath.f15068h, GeofencePath.f15033d);
            qVar.mo51939l(navigationPath.f15069i);
            qVar.mo51939l(navigationPath.f15070j);
        }
    }

    /* renamed from: com.moovit.navigation.NavigationPath$d */
    public class C4220d extends C19620t<NavigationPath> {
        public C4220d(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ShapeReliability shapeReliability;
            ArrayList arrayList;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            Polyline polyline = (Polyline) pVar.mo51962q(Polylon.f40985h);
            if (i == 0) {
                shapeReliability = ShapeReliability.UNRELIABLE;
            } else {
                shapeReliability = ShapeReliability.CODER.read(pVar);
            }
            ShapeReliability shapeReliability2 = shapeReliability;
            int l = pVar.mo51924l();
            if (l == -1) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(l);
                for (int i2 = 0; i2 < l; i2++) {
                    arrayList2.add(new ServerId(pVar.mo51924l()));
                }
                arrayList = arrayList2;
            }
            return new NavigationPath(serverId, polyline, shapeReliability2, arrayList, (GeofencePath) pVar.mo51962q(GeofencePath.f15034e), pVar.mo51924l(), pVar.mo51924l());
        }
    }

    public NavigationPath(ServerId serverId, Polyline polyline, ShapeReliability shapeReliability, ArrayList arrayList, GeofencePath geofencePath, int i, int i2) {
        this.f15062b = serverId;
        this.f15063c = polyline;
        C21100e.m49373x(shapeReliability, "shapeReliability");
        this.f15064d = shapeReliability;
        C21100e.m49373x(arrayList, "stopIds");
        this.f15065e = Collections.unmodifiableList(arrayList);
        this.f15066f = Collections.unmodifiableList(C13723g.m34282c(Collections.unmodifiableList(geofencePath.f15035b), f15059k));
        this.f15067g = new HashSet(arrayList);
        this.f15068h = geofencePath;
        C21100e.m49359q(i, "pathLengthMeters");
        this.f15069i = i;
        C21100e.m49359q(i2, "pathTimeSeconds");
        this.f15070j = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f15062b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15060l);
    }
}
