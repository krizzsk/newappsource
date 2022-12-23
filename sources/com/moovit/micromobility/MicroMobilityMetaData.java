package com.moovit.micromobility;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.util.StyledText;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MicroMobilityMetaData implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityMetaData> CREATOR = new C4124a();

    /* renamed from: h */
    public static final C4125b f14816h = new C4125b(MicroMobilityMetaData.class);

    /* renamed from: b */
    public final String f14817b;

    /* renamed from: c */
    public final String f14818c;

    /* renamed from: d */
    public final Image f14819d;

    /* renamed from: e */
    public final String f14820e;

    /* renamed from: f */
    public final String f14821f;

    /* renamed from: g */
    public final List<StyledText> f14822g;

    /* renamed from: com.moovit.micromobility.MicroMobilityMetaData$a */
    public class C4124a implements Parcelable.Creator<MicroMobilityMetaData> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityMetaData) C19612n.m46981v(parcel, MicroMobilityMetaData.f14816h);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityMetaData[i];
        }
    }

    /* renamed from: com.moovit.micromobility.MicroMobilityMetaData$b */
    public class C4125b extends C19619s<MicroMobilityMetaData> {
        public C4125b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityMetaData(pVar.mo51947p(), pVar.mo51947p(), (Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51958f(StyledText.f23869f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityMetaData microMobilityMetaData = (MicroMobilityMetaData) obj;
            qVar.mo51954p(microMobilityMetaData.f14817b);
            qVar.mo51954p(microMobilityMetaData.f14818c);
            C16019d.m40803a().f41718d.write(microMobilityMetaData.f14819d, qVar);
            qVar.mo51955t(microMobilityMetaData.f14820e);
            qVar.mo51955t(microMobilityMetaData.f14821f);
            qVar.mo51964g(microMobilityMetaData.f14822g, StyledText.f23869f);
        }
    }

    public MicroMobilityMetaData(String str, String str2, Image image, String str3, String str4, List<StyledText> list) {
        List<StyledText> list2;
        C21100e.m49373x(str, "serviceId");
        this.f14817b = str;
        C21100e.m49373x(str2, "itemId");
        this.f14818c = str2;
        C21100e.m49373x(image, "providerImage");
        this.f14819d = image;
        this.f14820e = str3;
        this.f14821f = str4;
        if (list != null) {
            list2 = Collections.unmodifiableList(list);
        } else {
            list2 = null;
        }
        this.f14822g = list2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroMobilityMetaData)) {
            return false;
        }
        MicroMobilityMetaData microMobilityMetaData = (MicroMobilityMetaData) obj;
        if (!this.f14817b.equals(microMobilityMetaData.f14817b) || !this.f14818c.equals(microMobilityMetaData.f14818c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14818c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14816h);
    }
}
