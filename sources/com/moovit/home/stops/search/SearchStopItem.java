package com.moovit.home.stops.search;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SearchStopItem implements C5384a, Parcelable {
    public static final Parcelable.Creator<SearchStopItem> CREATOR = new C16009a();

    /* renamed from: f */
    public static C16010b f41687f = new C16010b(SearchStopItem.class);

    /* renamed from: b */
    public final DbEntityRef<TransitStop> f41688b;

    /* renamed from: c */
    public final String f41689c;

    /* renamed from: d */
    public final String f41690d;

    /* renamed from: e */
    public final Image f41691e;

    /* renamed from: com.moovit.home.stops.search.SearchStopItem$a */
    public class C16009a implements Parcelable.Creator<SearchStopItem> {
        public final Object createFromParcel(Parcel parcel) {
            return (SearchStopItem) C19612n.m46981v(parcel, SearchStopItem.f41687f);
        }

        public final Object[] newArray(int i) {
            return new SearchStopItem[i];
        }
    }

    /* renamed from: com.moovit.home.stops.search.SearchStopItem$b */
    public class C16010b extends C19619s<SearchStopItem> {
        public C16010b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19584i<DbEntityRef<TransitStop>> iVar = DbEntityRef.TRANSIT_STOP_REF_CODER;
            pVar.getClass();
            return new SearchStopItem(iVar.read(pVar), pVar.mo51947p(), pVar.mo51948t(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SearchStopItem searchStopItem = (SearchStopItem) obj;
            DbEntityRef<TransitStop> dbEntityRef = searchStopItem.f41688b;
            C19584i<DbEntityRef<TransitStop>> iVar = DbEntityRef.TRANSIT_STOP_REF_CODER;
            qVar.getClass();
            iVar.write(dbEntityRef, qVar);
            qVar.mo51954p(searchStopItem.f41689c);
            qVar.mo51955t(searchStopItem.f41690d);
            qVar.mo51967q(searchStopItem.f41691e, C16019d.m40803a().f41718d);
        }
    }

    public SearchStopItem(DbEntityRef<TransitStop> dbEntityRef, String str, String str2, Image image) {
        C21100e.m49373x(dbEntityRef, "ref");
        this.f41688b = dbEntityRef;
        C21100e.m49373x(str, "name");
        this.f41689c = str;
        this.f41690d = str2;
        this.f41691e = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final ServerId getServerId() {
        return this.f41688b.getServerId();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41687f);
    }
}
