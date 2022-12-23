package com.moovit.micromobility;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.AppDeepLink;
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

public class MicroMobilityIntegrationItem implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityIntegrationItem> CREATOR = new C4122a();

    /* renamed from: f */
    public static final C4123b f14811f = new C4123b(MicroMobilityIntegrationItem.class);

    /* renamed from: b */
    public final String f14812b;

    /* renamed from: c */
    public final String f14813c;

    /* renamed from: d */
    public final List<MicroMobilityIntegrationFlow> f14814d;

    /* renamed from: e */
    public final AppDeepLink f14815e;

    /* renamed from: com.moovit.micromobility.MicroMobilityIntegrationItem$a */
    public class C4122a implements Parcelable.Creator<MicroMobilityIntegrationItem> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityIntegrationItem) C19612n.m46981v(parcel, MicroMobilityIntegrationItem.f14811f);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityIntegrationItem[i];
        }
    }

    /* renamed from: com.moovit.micromobility.MicroMobilityIntegrationItem$b */
    public class C4123b extends C19619s<MicroMobilityIntegrationItem> {
        public C4123b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityIntegrationItem(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51959g(MicroMobilityIntegrationFlow.CODER), (AppDeepLink) pVar.mo51962q(AppDeepLink.f40996d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityIntegrationItem microMobilityIntegrationItem = (MicroMobilityIntegrationItem) obj;
            qVar.mo51954p(microMobilityIntegrationItem.f14812b);
            qVar.mo51954p(microMobilityIntegrationItem.f14813c);
            qVar.mo51965h(microMobilityIntegrationItem.f14814d, MicroMobilityIntegrationFlow.CODER);
            qVar.mo51967q(microMobilityIntegrationItem.f14815e, AppDeepLink.f40996d);
        }
    }

    public MicroMobilityIntegrationItem(String str, String str2, ArrayList arrayList, AppDeepLink appDeepLink) {
        C21100e.m49373x(str, "serviceId");
        this.f14812b = str;
        C21100e.m49373x(str2, "itemId");
        this.f14813c = str2;
        C21100e.m49373x(arrayList, "integrationFlow");
        this.f14814d = Collections.unmodifiableList(arrayList);
        this.f14815e = appDeepLink;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroMobilityIntegrationItem)) {
            return false;
        }
        MicroMobilityIntegrationItem microMobilityIntegrationItem = (MicroMobilityIntegrationItem) obj;
        if (!this.f14812b.equals(microMobilityIntegrationItem.f14812b) || !this.f14813c.equals(microMobilityIntegrationItem.f14813c) || !this.f14814d.equals(microMobilityIntegrationItem.f14814d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f14812b), C17884p.m44335F(this.f14813c), C17884p.m44335F(this.f14814d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14811f);
    }
}
