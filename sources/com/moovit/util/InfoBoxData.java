package com.moovit.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import kotlin.Metadata;
import mf0.C24362h;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/util/InfoBoxData;", "Landroid/os/Parcelable;", "BaseApp_worldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class InfoBoxData implements Parcelable {
    public static final Parcelable.Creator<InfoBoxData> CREATOR = new C7885b();

    /* renamed from: f */
    public static final C7884a f23849f = new C7884a(InfoBoxData.class);

    /* renamed from: b */
    public final Image f23850b;

    /* renamed from: c */
    public final String f23851c;

    /* renamed from: d */
    public final String f23852d;

    /* renamed from: e */
    public final ColorScheme f23853e;

    /* renamed from: com.moovit.util.InfoBoxData$a */
    public static final class C7884a extends C19619s<InfoBoxData> {
        public C7884a(Class<InfoBoxData> cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) {
            C24362h.m61211f(pVar, "source");
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            ColorScheme colorScheme = (ColorScheme) C13555b.m33968g(ColorScheme.CODER, pVar);
            C24362h.m61210e(colorScheme, "backgroundColor");
            return new InfoBoxData((Image) pVar.mo51962q(C16019d.m40803a().f41718d), colorScheme, t, t2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) {
            InfoBoxData infoBoxData = (InfoBoxData) obj;
            C24362h.m61211f(infoBoxData, "obj");
            C24362h.m61211f(qVar, "target");
            qVar.mo51967q(infoBoxData.f23850b, C16019d.m40803a().f41718d);
            qVar.mo51955t(infoBoxData.f23851c);
            qVar.mo51955t(infoBoxData.f23852d);
            ColorScheme.CODER.write(infoBoxData.f23853e, qVar);
        }
    }

    /* renamed from: com.moovit.util.InfoBoxData$b */
    public static final class C7885b implements Parcelable.Creator<InfoBoxData> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new InfoBoxData((Image) parcel.readParcelable(InfoBoxData.class.getClassLoader()), ColorScheme.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new InfoBoxData[i];
        }
    }

    public InfoBoxData(Image image, ColorScheme colorScheme, String str, String str2) {
        C24362h.m61211f(colorScheme, "backgroundColor");
        this.f23850b = image;
        this.f23851c = str;
        this.f23852d = str2;
        this.f23853e = colorScheme;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoBoxData)) {
            return false;
        }
        InfoBoxData infoBoxData = (InfoBoxData) obj;
        return C24362h.m61206a(this.f23850b, infoBoxData.f23850b) && C24362h.m61206a(this.f23851c, infoBoxData.f23851c) && C24362h.m61206a(this.f23852d, infoBoxData.f23852d) && this.f23853e == infoBoxData.f23853e;
    }

    public final int hashCode() {
        Image image = this.f23850b;
        int i = 0;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.f23851c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23852d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.f23853e.hashCode() + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("InfoBoxData(icon=");
        k.append(this.f23850b);
        k.append(", title=");
        k.append(this.f23851c);
        k.append(", subtitle=");
        k.append(this.f23852d);
        k.append(", backgroundColor=");
        k.append(this.f23853e);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f23850b, i);
        parcel.writeString(this.f23851c);
        parcel.writeString(this.f23852d);
        parcel.writeString(this.f23853e.name());
    }
}
