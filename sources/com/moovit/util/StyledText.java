package com.moovit.util;

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

public class StyledText implements Parcelable {
    public static final Parcelable.Creator<StyledText> CREATOR = new C7895a();

    /* renamed from: f */
    public static final C7896b f23869f = new C7896b(StyledText.class);

    /* renamed from: b */
    public final Image f23870b;

    /* renamed from: c */
    public final String f23871c;

    /* renamed from: d */
    public final ColorScheme f23872d;

    /* renamed from: e */
    public final String f23873e;

    /* renamed from: com.moovit.util.StyledText$a */
    public class C7895a implements Parcelable.Creator<StyledText> {
        public final Object createFromParcel(Parcel parcel) {
            return (StyledText) C19612n.m46981v(parcel, StyledText.f23869f);
        }

        public final Object[] newArray(int i) {
            return new StyledText[i];
        }
    }

    /* renamed from: com.moovit.util.StyledText$b */
    public class C7896b extends C19619s<StyledText> {
        public C7896b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new StyledText((Image) pVar.mo51962q(C16019d.m40803a().f41718d), (ColorScheme) C13555b.m33968g(ColorScheme.CODER, pVar), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            StyledText styledText = (StyledText) obj;
            qVar.mo51967q(styledText.f23870b, C16019d.m40803a().f41718d);
            qVar.mo51955t(styledText.f23871c);
            ColorScheme.CODER.write(styledText.f23872d, qVar);
            qVar.mo51955t(styledText.f23873e);
        }
    }

    public StyledText(Image image, ColorScheme colorScheme, String str, String str2) {
        this.f23870b = image;
        this.f23871c = str;
        C21100e.m49373x(colorScheme, "color");
        this.f23872d = colorScheme;
        this.f23873e = str2;
        if (image == null && str == null) {
            throw new IllegalArgumentException("icon and/or text must be set!");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyledText)) {
            return false;
        }
        StyledText styledText = (StyledText) obj;
        if (!C20975x0.m49118e(this.f23870b, styledText.f23870b) || !C20975x0.m49118e(this.f23871c, styledText.f23871c) || this.f23872d != styledText.f23872d || !C20975x0.m49118e(this.f23873e, styledText.f23873e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23870b), C17884p.m44335F(this.f23871c), C17884p.m44335F(this.f23872d), C17884p.m44335F(this.f23873e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23869f);
    }
}
