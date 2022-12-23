package com.moovit.app.mot.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Polygon;
import com.moovit.commons.geo.Polylon;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotActivationRegion implements Parcelable {
    public static final Parcelable.Creator<MotActivationRegion> CREATOR = new C15147a();

    /* renamed from: e */
    public static final C15148b f39008e = new C15148b(MotActivationRegion.class);

    /* renamed from: b */
    public final ServerId f39009b;

    /* renamed from: c */
    public final List<Polygon> f39010c;

    /* renamed from: d */
    public final String f39011d;

    /* renamed from: com.moovit.app.mot.model.MotActivationRegion$a */
    public class C15147a implements Parcelable.Creator<MotActivationRegion> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotActivationRegion) C19612n.m46981v(parcel, MotActivationRegion.f39008e);
        }

        public final Object[] newArray(int i) {
            return new MotActivationRegion[i];
        }
    }

    /* renamed from: com.moovit.app.mot.model.MotActivationRegion$b */
    public class C15148b extends C19619s<MotActivationRegion> {
        public C15148b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new MotActivationRegion(new ServerId(pVar.mo51924l()), pVar.mo51947p(), pVar.mo51959g(Polylon.f40985h));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotActivationRegion motActivationRegion = (MotActivationRegion) obj;
            ServerId serverId = motActivationRegion.f39009b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51965h(motActivationRegion.f39010c, Polylon.f40986i);
            qVar.mo51954p(motActivationRegion.f39011d);
        }
    }

    public MotActivationRegion(ServerId serverId, String str, ArrayList arrayList) {
        this.f39009b = serverId;
        C21100e.m49373x(arrayList, "polygons");
        this.f39010c = Collections.unmodifiableList(arrayList);
        C21100e.m49373x(str, "name");
        this.f39011d = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotActivationRegion)) {
            return false;
        }
        return this.f39009b.equals(((MotActivationRegion) obj).f39009b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f39009b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39008e);
    }
}
