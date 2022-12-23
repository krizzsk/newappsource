package com.moovit.metro.selection;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class Country implements C5384a, Parcelable {
    public static final Parcelable.Creator<Country> CREATOR = new C4115a();

    /* renamed from: g */
    public static C4116b f14795g = new C4116b(Country.class);

    /* renamed from: b */
    public final ServerId f14796b;

    /* renamed from: c */
    public final String f14797c;

    /* renamed from: d */
    public final Image f14798d;

    /* renamed from: e */
    public final List<MetroArea> f14799e;

    /* renamed from: f */
    public final List<String> f14800f;

    /* renamed from: com.moovit.metro.selection.Country$a */
    public class C4115a implements Parcelable.Creator<Country> {
        public final Object createFromParcel(Parcel parcel) {
            return (Country) C19612n.m46981v(parcel, Country.f14795g);
        }

        public final Object[] newArray(int i) {
            return new Country[i];
        }
    }

    /* renamed from: com.moovit.metro.selection.Country$b */
    public class C4116b extends C19619s<Country> {
        public C4116b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ArrayList arrayList;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            String p = pVar.mo51947p();
            Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            ArrayList g = pVar.mo51959g(MetroArea.f14801e);
            int l = pVar.mo51924l();
            if (l == -1) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(l);
                for (int i2 = 0; i2 < l; i2++) {
                    arrayList2.add(pVar.mo51948t());
                }
                arrayList = arrayList2;
            }
            return new Country(serverId, p, image, g, arrayList);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Country country = (Country) obj;
            ServerId serverId = country.f14796b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(country.f14797c);
            qVar.mo51967q(country.f14798d, C16019d.m40803a().f41718d);
            qVar.mo51965h(country.f14799e, MetroArea.f14801e);
            List<String> list = country.f14800f;
            if (list == null) {
                qVar.mo51939l(-1);
                return;
            }
            qVar.mo51939l(list.size());
            for (String t : list) {
                qVar.mo51955t(t);
            }
        }
    }

    public Country(ServerId serverId, String str, Image image, ArrayList arrayList, List list) {
        this.f14796b = serverId;
        C21100e.m49373x(str, "name");
        this.f14797c = str;
        this.f14798d = image;
        C21100e.m49373x(arrayList, "metros");
        this.f14799e = Collections.unmodifiableList(arrayList);
        C21100e.m49373x(list, "keywords");
        this.f14800f = Collections.unmodifiableList(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Country)) {
            return false;
        }
        return this.f14796b.equals(((Country) obj).f14796b);
    }

    public final ServerId getServerId() {
        return this.f14796b;
    }

    public final int hashCode() {
        return this.f14796b.f15142b;
    }

    public final String toString() {
        return this.f14797c + " (id=" + this.f14796b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14795g);
    }
}
