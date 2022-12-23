package com.moovit.micromobility.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.util.ColorScheme;
import com.moovit.util.StyledText;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class MicroMobilityProperty implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityProperty> CREATOR = new C4153a();

    /* renamed from: g */
    public static final C4154b f14905g = new C4154b(MicroMobilityProperty.class);

    /* renamed from: b */
    public final ColorScheme f14906b;

    /* renamed from: c */
    public final Image f14907c;

    /* renamed from: d */
    public final String f14908d;

    /* renamed from: e */
    public final String f14909e;

    /* renamed from: f */
    public final StyledText f14910f;

    /* renamed from: com.moovit.micromobility.nearby.MicroMobilityProperty$a */
    public class C4153a implements Parcelable.Creator<MicroMobilityProperty> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityProperty) C19612n.m46981v(parcel, MicroMobilityProperty.f14905g);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityProperty[i];
        }
    }

    /* renamed from: com.moovit.micromobility.nearby.MicroMobilityProperty$b */
    public class C4154b extends C19619s<MicroMobilityProperty> {
        public C4154b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityProperty((ColorScheme) pVar.mo51962q(ColorScheme.CODER), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t(), (StyledText) pVar.mo51962q(StyledText.f23869f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityProperty microMobilityProperty = (MicroMobilityProperty) obj;
            qVar.mo51967q(microMobilityProperty.f14906b, ColorScheme.CODER);
            qVar.mo51967q(microMobilityProperty.f14907c, C16019d.m40803a().f41718d);
            qVar.mo51955t(microMobilityProperty.f14908d);
            qVar.mo51955t(microMobilityProperty.f14909e);
            qVar.mo51967q(microMobilityProperty.f14910f, StyledText.f23869f);
        }
    }

    public MicroMobilityProperty(ColorScheme colorScheme, Image image, String str, String str2, StyledText styledText) {
        this.f14906b = colorScheme;
        this.f14907c = image;
        this.f14908d = str;
        this.f14909e = str2;
        this.f14910f = styledText;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroMobilityProperty)) {
            return false;
        }
        MicroMobilityProperty microMobilityProperty = (MicroMobilityProperty) obj;
        if (this.f14906b != microMobilityProperty.f14906b || !C20975x0.m49118e(this.f14907c, microMobilityProperty.f14907c) || !C20975x0.m49118e(this.f14908d, microMobilityProperty.f14908d) || !C20975x0.m49118e(this.f14909e, microMobilityProperty.f14909e) || !C20975x0.m49118e(this.f14910f, microMobilityProperty.f14910f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f14906b), C17884p.m44335F(this.f14907c), C17884p.m44335F(this.f14908d), C17884p.m44335F(this.f14909e), C17884p.m44335F(this.f14910f));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14905g);
    }
}
