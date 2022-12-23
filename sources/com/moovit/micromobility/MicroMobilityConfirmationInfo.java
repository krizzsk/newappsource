package com.moovit.micromobility;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class MicroMobilityConfirmationInfo implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityConfirmationInfo> CREATOR = new C4119a();

    /* renamed from: g */
    public static final C4120b f14805g = new C4120b(MicroMobilityConfirmationInfo.class);

    /* renamed from: b */
    public final Image f14806b;

    /* renamed from: c */
    public final String f14807c;

    /* renamed from: d */
    public final String f14808d;

    /* renamed from: e */
    public final String f14809e;

    /* renamed from: f */
    public final String f14810f;

    /* renamed from: com.moovit.micromobility.MicroMobilityConfirmationInfo$a */
    public class C4119a implements Parcelable.Creator<MicroMobilityConfirmationInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityConfirmationInfo) C19612n.m46981v(parcel, MicroMobilityConfirmationInfo.f14805g);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityConfirmationInfo[i];
        }
    }

    /* renamed from: com.moovit.micromobility.MicroMobilityConfirmationInfo$b */
    public class C4120b extends C19619s<MicroMobilityConfirmationInfo> {
        public C4120b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityConfirmationInfo((Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51947p(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityConfirmationInfo microMobilityConfirmationInfo = (MicroMobilityConfirmationInfo) obj;
            qVar.mo51967q(microMobilityConfirmationInfo.f14806b, C16019d.m40803a().f41718d);
            qVar.mo51955t(microMobilityConfirmationInfo.f14807c);
            qVar.mo51955t(microMobilityConfirmationInfo.f14808d);
            qVar.mo51954p(microMobilityConfirmationInfo.f14809e);
            qVar.mo51955t(microMobilityConfirmationInfo.f14810f);
        }
    }

    public MicroMobilityConfirmationInfo(Image image, String str, String str2, String str3, String str4) {
        this.f14806b = image;
        this.f14807c = str;
        this.f14808d = str2;
        C21100e.m49373x(str3, "positiveConfirmationText");
        this.f14809e = str3;
        this.f14810f = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroMobilityConfirmationInfo)) {
            return false;
        }
        MicroMobilityConfirmationInfo microMobilityConfirmationInfo = (MicroMobilityConfirmationInfo) obj;
        if (!C20975x0.m49118e(this.f14806b, microMobilityConfirmationInfo.f14806b) || !C20975x0.m49118e(this.f14807c, microMobilityConfirmationInfo.f14807c) || !C20975x0.m49118e(this.f14808d, microMobilityConfirmationInfo.f14808d) || !C20975x0.m49118e(this.f14809e, microMobilityConfirmationInfo.f14809e) || !C20975x0.m49118e(this.f14810f, microMobilityConfirmationInfo.f14810f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f14806b), C17884p.m44335F(this.f14807c), C17884p.m44335F(this.f14808d), C17884p.m44335F(this.f14809e), C17884p.m44335F(this.f14810f));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14805g);
    }
}
