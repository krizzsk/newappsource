package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.navigation.NavigationPath;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class NavigationLeg implements Parcelable {
    public static final Parcelable.Creator<NavigationLeg> CREATOR = new C4214a();

    /* renamed from: g */
    public static final C4215b f15052g = new C4215b();

    /* renamed from: h */
    public static final C4216c f15053h = new C4216c(NavigationLeg.class);

    /* renamed from: b */
    public final Type f15054b;

    /* renamed from: c */
    public final List<NavigationPath> f15055c;

    /* renamed from: d */
    public final ServerId f15056d;

    /* renamed from: e */
    public final TransitLine f15057e;

    /* renamed from: f */
    public final boolean f15058f;

    public enum Type {
        TRANSIT,
        WALK,
        WAIT,
        TAXI,
        BICYCLE,
        DOCKLESS,
        CAR;
        
        public static final C19584i<Type> CODER = null;

        /* access modifiers changed from: public */
        static {
            Type type;
            Type type2;
            Type type3;
            Type type4;
            Type type5;
            Type type6;
            Type type7;
            CODER = new C19577c(Type.class, type, type2, type3, type4, type5, type6, type7);
        }
    }

    /* renamed from: com.moovit.navigation.NavigationLeg$a */
    public class C4214a implements Parcelable.Creator<NavigationLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationLeg) C19612n.m46981v(parcel, NavigationLeg.f15053h);
        }

        public final Object[] newArray(int i) {
            return new NavigationLeg[i];
        }
    }

    /* renamed from: com.moovit.navigation.NavigationLeg$b */
    public class C4215b extends C19621u<NavigationLeg> {
        public C4215b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            NavigationLeg navigationLeg = (NavigationLeg) obj;
            Type type = navigationLeg.f15054b;
            C19584i<Type> iVar = Type.CODER;
            qVar.getClass();
            iVar.write(type, qVar);
            qVar.mo51965h(navigationLeg.f15055c, NavigationPath.f15060l);
            ServerId serverId = navigationLeg.f15056d;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51967q(navigationLeg.f15057e, TransitLine.f23682h);
        }
    }

    /* renamed from: com.moovit.navigation.NavigationLeg$c */
    public class C4216c extends C19620t<NavigationLeg> {
        public C4216c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            C19584i<Type> iVar = Type.CODER;
            pVar.getClass();
            Type read = iVar.read(pVar);
            ArrayList g = pVar.mo51959g(NavigationPath.f15061m);
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new NavigationLeg(read, g, serverId, (TransitLine) pVar.mo51962q(TransitLine.f23683i));
        }
    }

    public NavigationLeg(Type type, ArrayList arrayList, ServerId serverId, TransitLine transitLine) {
        C21100e.m49373x(type, "type");
        this.f15054b = type;
        C21100e.m49373x(arrayList, "paths");
        this.f15055c = arrayList;
        this.f15056d = serverId;
        this.f15057e = transitLine;
        Type type2 = Type.TRANSIT;
        if (type == type2 && serverId == null) {
            throw new IllegalArgumentException("Transit legs must have a non-null destStopId");
        } else if (type == type2 && transitLine == null) {
            throw new IllegalArgumentException("Transit legs must have a non-null line");
        } else {
            boolean z = true;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((NavigationPath) it.next()).f15064d != NavigationPath.ShapeReliability.RELIABLE) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f15058f = z;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f15054b.name() + " to stop " + this.f15056d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15052g);
    }
}
