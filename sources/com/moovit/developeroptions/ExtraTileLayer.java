package com.moovit.developeroptions;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ExtraTileLayer implements Parcelable {
    public static final Parcelable.Creator<ExtraTileLayer> CREATOR = new C15872a();

    /* renamed from: h */
    public static C15873b f41462h = new C15873b(ExtraTileLayer.class);

    /* renamed from: b */
    public final String f41463b;

    /* renamed from: c */
    public final int f41464c;

    /* renamed from: d */
    public final int f41465d;

    /* renamed from: e */
    public final String f41466e;

    /* renamed from: f */
    public final String f41467f;

    /* renamed from: g */
    public final boolean f41468g;

    /* renamed from: com.moovit.developeroptions.ExtraTileLayer$a */
    public class C15872a implements Parcelable.Creator<ExtraTileLayer> {
        public final Object createFromParcel(Parcel parcel) {
            return (ExtraTileLayer) C19612n.m46981v(parcel, ExtraTileLayer.f41462h);
        }

        public final Object[] newArray(int i) {
            return new ExtraTileLayer[i];
        }
    }

    /* renamed from: com.moovit.developeroptions.ExtraTileLayer$b */
    public class C15873b extends C19619s<ExtraTileLayer> {
        public C15873b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String p = pVar.mo51947p();
            return new ExtraTileLayer(pVar.mo51924l(), p, pVar.mo51947p(), pVar.mo51947p(), pVar.mo51919b(), pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ExtraTileLayer extraTileLayer = (ExtraTileLayer) obj;
            qVar.mo51954p(extraTileLayer.f41463b);
            qVar.mo51939l(extraTileLayer.f41464c);
            qVar.mo51939l(extraTileLayer.f41464c);
            qVar.mo51954p(extraTileLayer.f41466e);
            qVar.mo51954p(extraTileLayer.f41467f);
            qVar.mo51934b(extraTileLayer.f41468g);
        }
    }

    public ExtraTileLayer(int i, String str, String str2, String str3, boolean z, int i2) {
        C21100e.m49373x(str, "id");
        this.f41463b = str;
        this.f41464c = i;
        this.f41465d = i2;
        C21100e.m49373x(str2, "baseUrl");
        this.f41466e = str2;
        C21100e.m49373x(str3, "extension");
        this.f41467f = str3;
        this.f41468g = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExtraTileLayer)) {
            return false;
        }
        return ((ExtraTileLayer) obj).f41463b.equals(this.f41463b);
    }

    public final int hashCode() {
        return this.f41463b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41462h);
    }
}
