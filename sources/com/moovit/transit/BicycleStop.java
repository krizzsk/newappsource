package com.moovit.transit;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.Color;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16028g;
import com.moovit.image.model.ResourceImage;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p762qz.C19206b;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19745w;

public class BicycleStop implements Parcelable, C5384a, C19206b {
    public static final Parcelable.Creator<BicycleStop> CREATOR = new C7788a();

    /* renamed from: g */
    public static C7789b f23635g = new C7789b(BicycleStop.class);

    /* renamed from: b */
    public final DbEntityRef<BicycleProvider> f23636b;

    /* renamed from: c */
    public final ServerId f23637c;

    /* renamed from: d */
    public final String f23638d;

    /* renamed from: e */
    public final String f23639e;

    /* renamed from: f */
    public final LatLonE6 f23640f;

    /* renamed from: com.moovit.transit.BicycleStop$a */
    public class C7788a implements Parcelable.Creator<BicycleStop> {
        public final Object createFromParcel(Parcel parcel) {
            return (BicycleStop) C19612n.m46981v(parcel, BicycleStop.f23635g);
        }

        public final Object[] newArray(int i) {
            return new BicycleStop[i];
        }
    }

    /* renamed from: com.moovit.transit.BicycleStop$b */
    public class C7789b extends C19619s<BicycleStop> {
        public C7789b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            C19584i<DbEntityRef<BicycleProvider>> iVar = DbEntityRef.BICYCLE_PROVIDER_REF_CODER;
            pVar.getClass();
            DbEntityRef read = iVar.read(pVar);
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new BicycleStop(read, serverId, pVar.mo51947p(), pVar.mo51948t(), (LatLonE6) LatLonE6.f40979g.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            BicycleStop bicycleStop = (BicycleStop) obj;
            DbEntityRef<BicycleProvider> dbEntityRef = bicycleStop.f23636b;
            C19584i<DbEntityRef<BicycleProvider>> iVar = DbEntityRef.BICYCLE_PROVIDER_REF_CODER;
            qVar.getClass();
            iVar.write(dbEntityRef, qVar);
            qVar.mo51939l(bicycleStop.f23637c.f15142b);
            qVar.mo51954p(bicycleStop.f23638d);
            qVar.mo51955t(bicycleStop.f23639e);
            LatLonE6.f40978f.write(bicycleStop.f23640f, qVar);
        }
    }

    public BicycleStop(DbEntityRef<BicycleProvider> dbEntityRef, ServerId serverId, String str, String str2, LatLonE6 latLonE6) {
        C21100e.m49373x(dbEntityRef, "providerRef");
        this.f23636b = dbEntityRef;
        C21100e.m49373x(serverId, "id");
        this.f23637c = serverId;
        C21100e.m49373x(str, "name");
        this.f23638d = str;
        this.f23639e = str2;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f23640f = latLonE6;
    }

    /* renamed from: c */
    public static ResourceImage m17760c(Context context) {
        String l = Color.m40220d(C19735m.colorSurfaceInverse, context).mo46956l();
        String l2 = Color.m40220d(C19735m.colorOnSurfaceInverse, context).mo46956l();
        String valueOf = String.valueOf(C16028g.m40831i(C19739q.mvf_bicycle_dock_icon));
        return new ResourceImage(C19745w.mvf_bicycle, l, l2, valueOf);
    }

    /* renamed from: b */
    public final ResourceImage mo24299b() {
        String l = this.f23636b.get().f23631d.mo46956l();
        String l2 = this.f23636b.get().f23632e.mo46956l();
        String valueOf = String.valueOf(C16028g.m40831i(C19739q.mvf_bicycle_icon));
        return new ResourceImage(C19745w.mvf_bicycle, l, l2, valueOf);
    }

    public final int describeContents() {
        return 0;
    }

    public final LatLonE6 getLocation() {
        return this.f23640f;
    }

    public final ServerId getServerId() {
        return this.f23637c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23635g);
    }
}
