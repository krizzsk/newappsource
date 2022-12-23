package com.moovit.home.lines.search;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitType;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import x00.C20440a;

public class SearchLineItem implements Parcelable, C5384a {
    public static final Parcelable.Creator<SearchLineItem> CREATOR = new C15996a();

    /* renamed from: i */
    public static final C15997b f41635i = new C15997b();

    /* renamed from: j */
    public static final C15998c f41636j = new C15998c(SearchLineItem.class);

    /* renamed from: b */
    public final ServerId f41637b;

    /* renamed from: c */
    public final String f41638c;

    /* renamed from: d */
    public final DbEntityRef<TransitType> f41639d;

    /* renamed from: e */
    public final DbEntityRef<TransitAgency> f41640e;

    /* renamed from: f */
    public final Image f41641f;

    /* renamed from: g */
    public final String f41642g;

    /* renamed from: h */
    public final List<C20440a> f41643h;

    /* renamed from: com.moovit.home.lines.search.SearchLineItem$a */
    public class C15996a implements Parcelable.Creator<SearchLineItem> {
        public final Object createFromParcel(Parcel parcel) {
            return (SearchLineItem) C19612n.m46981v(parcel, SearchLineItem.f41636j);
        }

        public final Object[] newArray(int i) {
            return new SearchLineItem[i];
        }
    }

    /* renamed from: com.moovit.home.lines.search.SearchLineItem$b */
    public class C15997b extends C19621u<SearchLineItem> {
        public C15997b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            SearchLineItem searchLineItem = (SearchLineItem) obj;
            ServerId serverId = searchLineItem.f41637b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(searchLineItem.f41638c);
            DbEntityRef.TRANSIT_TYPE_REF_CODER.write(searchLineItem.f41639d, qVar);
            qVar.mo51967q(searchLineItem.f41640e, DbEntityRef.AGENCY_REF_CODER);
            qVar.mo51967q(searchLineItem.f41641f, C16019d.m40803a().f41718d);
            qVar.mo51955t(searchLineItem.f41642g);
            qVar.mo51964g(searchLineItem.f41643h, C20440a.f51780d);
        }
    }

    /* renamed from: com.moovit.home.lines.search.SearchLineItem$c */
    public class C15998c extends C19620t<SearchLineItem> {
        public C15998c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            if (i != 1) {
                pVar.getClass();
                ServerId serverId = new ServerId(pVar.mo51924l());
                DbEntityRef read = DbEntityRef.TRANSIT_TYPE_REF_CODER.read(pVar);
                DbEntityRef dbEntityRef = (DbEntityRef) pVar.mo51962q(DbEntityRef.AGENCY_REF_CODER);
                Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
                String t = pVar.mo51948t();
                ArrayList f = pVar.mo51958f(C20440a.f51780d);
                int l = pVar.mo51924l();
                if (l != -1) {
                    ArrayList arrayList = new ArrayList(l);
                    for (int i2 = 0; i2 < l; i2++) {
                        arrayList.add(pVar.mo51948t());
                    }
                }
                return new SearchLineItem(serverId, "", read, dbEntityRef, image, t, f);
            }
            pVar.getClass();
            return new SearchLineItem(new ServerId(pVar.mo51924l()), pVar.mo51947p(), DbEntityRef.TRANSIT_TYPE_REF_CODER.read(pVar), (DbEntityRef) pVar.mo51962q(DbEntityRef.AGENCY_REF_CODER), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51958f(C20440a.f51780d));
        }
    }

    public SearchLineItem(ServerId serverId, String str, DbEntityRef<TransitType> dbEntityRef, DbEntityRef<TransitAgency> dbEntityRef2, Image image, String str2, List<C20440a> list) {
        this.f41637b = serverId;
        C21100e.m49373x(str, "lineNumber");
        this.f41638c = str;
        C21100e.m49373x(dbEntityRef, "transitTypeRef");
        this.f41639d = dbEntityRef;
        this.f41640e = dbEntityRef2;
        this.f41641f = image;
        this.f41642g = str2;
        this.f41643h = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SearchLineItem)) {
            return false;
        }
        return this.f41637b.equals(((SearchLineItem) obj).f41637b);
    }

    public final ServerId getServerId() {
        return this.f41637b;
    }

    public final int hashCode() {
        return this.f41637b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41635i);
    }
}
