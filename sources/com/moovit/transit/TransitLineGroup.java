package com.moovit.transit;

import a20.C13388b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import ce0.C21100e;
import com.moovit.commons.utils.Color;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16019d;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageRef;
import com.moovit.network.model.ServerId;
import com.moovit.util.ServerIdMap;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p834tz.C19794a;

public final class TransitLineGroup implements C5384a, Parcelable {
    public static final Parcelable.Creator<TransitLineGroup> CREATOR = new C7815a();

    /* renamed from: n */
    public static final C7816b f23692n = new C7816b();

    /* renamed from: o */
    public static final C7817c f23693o = new C7817c(TransitLineGroup.class);

    /* renamed from: b */
    public final ServerId f23694b;

    /* renamed from: c */
    public final int f23695c;

    /* renamed from: d */
    public final DbEntityRef<TransitAgency> f23696d;

    /* renamed from: e */
    public final String f23697e;

    /* renamed from: f */
    public final String f23698f;

    /* renamed from: g */
    public final String f23699g;

    /* renamed from: h */
    public final List<TransitLine> f23700h;

    /* renamed from: i */
    public final Map<ServerId, TransitLine> f23701i;

    /* renamed from: j */
    public final Color f23702j;

    /* renamed from: k */
    public final Color f23703k;

    /* renamed from: l */
    public final C13388b f23704l;

    /* renamed from: m */
    public final SparseIntArray f23705m;

    /* renamed from: com.moovit.transit.TransitLineGroup$a */
    public class C7815a implements Parcelable.Creator<TransitLineGroup> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitLineGroup) C19612n.m46981v(parcel, TransitLineGroup.f23693o);
        }

        public final Object[] newArray(int i) {
            return new TransitLineGroup[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitLineGroup$b */
    public class C7816b extends C19621u<TransitLineGroup> {
        public C7816b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitLineGroup transitLineGroup = (TransitLineGroup) obj;
            ServerId serverId = transitLineGroup.f23694b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            DbEntityRef.AGENCY_REF_CODER.write(transitLineGroup.f23696d, qVar);
            qVar.mo51954p(transitLineGroup.f23697e);
            qVar.mo51955t(transitLineGroup.f23698f);
            qVar.mo51955t(transitLineGroup.f23699g);
            qVar.mo51965h(transitLineGroup.f23700h, TransitLine.f23684j);
            qVar.mo51967q(transitLineGroup.f23702j, Color.f41005i);
            C13388b bVar = transitLineGroup.f23704l;
            C13388b.C13389a aVar = C16019d.m40803a().f41721g;
            qVar.mo51939l(aVar.f49802v);
            aVar.mo179c(bVar, qVar);
            C19794a.f50325c.write(transitLineGroup.f23705m, qVar);
            qVar.mo51939l(transitLineGroup.f23695c);
        }
    }

    /* renamed from: com.moovit.transit.TransitLineGroup$c */
    public class C7817c extends C19620t<TransitLineGroup> {
        public C7817c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            int i2;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            DbEntityRef read = DbEntityRef.AGENCY_REF_CODER.read(pVar);
            String p = pVar.mo51947p();
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            ArrayList g = pVar.mo51959g(TransitLine.f23685k);
            Color color = (Color) pVar.mo51962q(Color.f41006j);
            C13388b bVar = (C13388b) C16019d.m40803a().f41721g.read(pVar);
            SparseIntArray sparseIntArray = (SparseIntArray) C19794a.f50325c.read(pVar);
            if (i >= 1) {
                i2 = pVar.mo51924l();
            } else {
                i2 = 1;
            }
            return new TransitLineGroup(serverId, i2, read, p, t, t2, g, color, bVar, sparseIntArray);
        }
    }

    public TransitLineGroup(ServerId serverId, int i, DbEntityRef dbEntityRef, String str, String str2, String str3, ArrayList arrayList, Color color, C13388b bVar, SparseIntArray sparseIntArray) {
        Color color2;
        this.f23694b = serverId;
        this.f23695c = i;
        C21100e.m49373x(dbEntityRef, "agencyRef");
        this.f23696d = dbEntityRef;
        C21100e.m49373x(str, "lineNumber");
        this.f23697e = str;
        this.f23698f = str2;
        this.f23699g = str3;
        C21100e.m49373x(arrayList, "lines");
        this.f23700h = Collections.unmodifiableList(arrayList);
        this.f23701i = Collections.unmodifiableMap(ServerIdMap.m17949a(arrayList));
        this.f23702j = color;
        if (color != null) {
            color2 = new Color(Color.m40221f(color.f41007b));
        } else {
            color2 = null;
        }
        this.f23703k = color2;
        C21100e.m49373x(bVar, "imageRefSet");
        this.f23704l = bVar;
        C21100e.m49373x(sparseIntArray, "innerImageIds");
        this.f23705m = sparseIntArray;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TransitLine transitLine = (TransitLine) it.next();
            transitLine.getClass();
            transitLine.f23686b = this;
            if (mo24377c(transitLine.f23687c) == null) {
                StringBuilder k = C13555b.m33972k("Line id ");
                k.append(transitLine.f23687c);
                k.append(" does not exist in attached group id ");
                k.append(this.f23694b);
                throw new IllegalStateException(k.toString());
            }
        }
    }

    /* renamed from: b */
    public final Image mo24376b(int i, String str) {
        int i2;
        ImageRef imageRef = this.f23704l.f33226a.get(i);
        Image image = null;
        if (imageRef == null) {
            return null;
        }
        Color color = this.f23702j;
        if (color == null) {
            color = Color.f41004h;
        }
        String valueOf = String.valueOf(this.f23705m.get(i));
        TransitAgency transitAgency = this.f23696d.get();
        if (transitAgency != null) {
            image = transitAgency.f23675e;
        }
        if (image == null) {
            i2 = 0;
        } else if (image.mo48223b() == null || image.mo48223b().length <= 0) {
            Object obj = image.f41804c;
            if (obj instanceof ServerId) {
                i2 = Integer.valueOf(((ServerId) obj).f15142b);
            } else {
                i2 = Integer.valueOf(C16028g.m40831i(((Integer) obj).intValue()));
            }
        } else {
            throw new IllegalArgumentException("This method can not be called with an image that has params");
        }
        return imageRef.mo48235p(color.mo46956l(), str, valueOf, String.valueOf(i2));
    }

    /* renamed from: c */
    public final TransitLine mo24377c(ServerId serverId) {
        return this.f23701i.get(serverId);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitLineGroup)) {
            return false;
        }
        return this.f23694b.equals(((TransitLineGroup) obj).f23694b);
    }

    public final ServerId getServerId() {
        return this.f23694b;
    }

    public final int hashCode() {
        return this.f23694b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23692n);
    }
}
