package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLineGroup;
import j40.C5384a;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20975x0;

public class TransitLine implements C5384a, Parcelable {
    public static final Parcelable.Creator<TransitLine> CREATOR = new C7810a();

    /* renamed from: h */
    public static final C7811b f23682h = new C7811b();

    /* renamed from: i */
    public static final C7812c f23683i = new C7812c(TransitLine.class);

    /* renamed from: j */
    public static final C7813d f23684j = new C7813d();

    /* renamed from: k */
    public static final C7814e f23685k = new C7814e(TransitLine.class);

    /* renamed from: b */
    public TransitLineGroup f23686b;

    /* renamed from: c */
    public final ServerId f23687c;

    /* renamed from: d */
    public final String f23688d;

    /* renamed from: e */
    public final String f23689e;

    /* renamed from: f */
    public final String f23690f;

    /* renamed from: g */
    public final String f23691g;

    /* renamed from: com.moovit.transit.TransitLine$a */
    public class C7810a implements Parcelable.Creator<TransitLine> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitLine) C19612n.m46981v(parcel, TransitLine.f23683i);
        }

        public final Object[] newArray(int i) {
            return new TransitLine[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitLine$b */
    public class C7811b extends C19621u<TransitLine> {
        public C7811b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitLine transitLine = (TransitLine) obj;
            TransitLineGroup transitLineGroup = transitLine.f23686b;
            TransitLineGroup.C7816b bVar = TransitLineGroup.f23692n;
            qVar.getClass();
            qVar.mo51939l(1);
            bVar.mo19622a(transitLineGroup, qVar);
            qVar.mo51939l(transitLine.f23687c.f15142b);
        }
    }

    /* renamed from: com.moovit.transit.TransitLine$c */
    public class C7812c extends C19620t<TransitLine> {
        public C7812c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            TransitLineGroup.C7817c cVar = TransitLineGroup.f23693o;
            pVar.getClass();
            TransitLine c = ((TransitLineGroup) cVar.read(pVar)).mo24377c(new ServerId(pVar.mo51924l()));
            if (c != null) {
                return c;
            }
            throw new ApplicationBugException("Serialized line group missing target line");
        }
    }

    /* renamed from: com.moovit.transit.TransitLine$d */
    public class C7813d extends C19621u<TransitLine> {
        public C7813d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitLine transitLine = (TransitLine) obj;
            ServerId serverId = transitLine.f23687c;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51955t(transitLine.f23688d);
            qVar.mo51954p(transitLine.f23689e);
            qVar.mo51955t(transitLine.f23690f);
            qVar.mo51955t(transitLine.f23691g);
        }
    }

    /* renamed from: com.moovit.transit.TransitLine$e */
    public class C7814e extends C19620t<TransitLine> {
        public C7814e(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            String str;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            String t = pVar.mo51948t();
            String p = pVar.mo51947p();
            String t2 = pVar.mo51948t();
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            return new TransitLine(serverId, t, p, t2, str);
        }
    }

    public TransitLine(ServerId serverId, String str, String str2, String str3, String str4) {
        this.f23687c = serverId;
        this.f23688d = str;
        C21100e.m49373x(str2, "destination");
        this.f23689e = str2;
        this.f23690f = str3;
        this.f23691g = str4;
    }

    /* renamed from: b */
    public final TransitLineGroup mo24369b() {
        TransitLineGroup transitLineGroup = this.f23686b;
        if (transitLineGroup != null) {
            return transitLineGroup;
        }
        throw new ApplicationBugException("Transit line group may not be null");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitLine)) {
            return false;
        }
        TransitLine transitLine = (TransitLine) obj;
        if (!C20975x0.m49118e(this.f23686b, transitLine.f23686b) || !this.f23687c.equals(transitLine.f23687c)) {
            return false;
        }
        return true;
    }

    public final ServerId getServerId() {
        return this.f23687c;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23686b), this.f23687c.f15142b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23682h);
    }
}
