package mobi.lab.veriff.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.places.Place;
import com.veriff.sdk.internal.C22696xo;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.util.C24450d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\b\u0018\u00002\u00020\u0001:\u0001@Bo\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\u0006\u0010\"\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001a\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b>\u0010?J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0018HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0002HÆ\u0003J\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0001R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010#\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010$\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\"\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b3\u00104R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0019\u0010&\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b;\u0010*R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b<\u0010*R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b=\u0010*¨\u0006A"}, mo59060d2 = {"Lmobi/lab/veriff/data/SessionArguments;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "Ljava/util/Locale;", "component10", "component2", "component3", "component4", "", "component5", "Lmobi/lab/veriff/util/Encryption;", "component6", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "component7", "component8", "component9", "sdkInvokeId", "baseUrl", "sessionToken", "webRtcLogLevel", "encryption", "branding", "customIntroScreen", "apiVersion", "locale", "copy", "Ljava/lang/String;", "getApiVersion", "()Ljava/lang/String;", "getBaseUrl", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "getBranding", "()Lmobi/lab/veriff/util/resourcesHelper/Branding;", "Z", "getCustomIntroScreen", "()Z", "Lmobi/lab/veriff/util/Encryption;", "getEncryption", "()Lmobi/lab/veriff/util/Encryption;", "Ljava/util/Map;", "getFlags", "()Ljava/util/Map;", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "getSdkInvokeId", "getSessionToken", "getWebRtcLogLevel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lmobi/lab/veriff/util/Encryption;Lmobi/lab/veriff/util/resourcesHelper/Branding;ZLjava/lang/String;Ljava/util/Locale;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.data.d */
public final class C24426d implements Parcelable {
    public static final Parcelable.Creator<C24426d> CREATOR = new C24428b();

    /* renamed from: a */
    public static final C24427a f61816a = new C24427a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f61817b;

    /* renamed from: c */
    private final String f61818c;

    /* renamed from: d */
    private final String f61819d;

    /* renamed from: e */
    private final String f61820e;

    /* renamed from: f */
    private final Map<String, String> f61821f;

    /* renamed from: g */
    private final C24450d f61822g;

    /* renamed from: h */
    private final C22696xo f61823h;

    /* renamed from: i */
    private final boolean f61824i;

    /* renamed from: j */
    private final String f61825j;

    /* renamed from: k */
    private final Locale f61826k;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, mo59060d2 = {"Lmobi/lab/veriff/data/SessionArguments$Companion;", "", "()V", "create", "Lmobi/lab/veriff/data/SessionArguments;", "sessionToken", "", "copyWith", "locale", "Ljava/util/Locale;", "newBaseUrl", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.data.d$a */
    public static final class C24427a {
        private C24427a() {
        }

        public /* synthetic */ C24427a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24426d mo60611a(C24426d dVar, String str) {
            C24362h.m61211f(dVar, "$this$copyWith");
            String str2 = str;
            C24362h.m61211f(str2, "newBaseUrl");
            return C24426d.m61426a(dVar, (String) null, str2, (String) null, (String) null, (Map) null, (C24450d) null, (C22696xo) null, false, (String) null, (Locale) null, Place.TYPE_STREET_ADDRESS, (Object) null);
        }

        /* renamed from: a */
        public final C24426d mo60612a(C24426d dVar, Locale locale) {
            C24362h.m61211f(dVar, "$this$copyWith");
            return C24426d.m61426a(dVar, (String) null, (String) null, (String) null, (String) null, (Map) null, (C24450d) null, (C22696xo) null, false, (String) null, locale, 511, (Object) null);
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.data.d$b */
    public static class C24428b implements Parcelable.Creator<C24426d> {
        /* renamed from: a */
        public final C24426d createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            C24362h.m61211f(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    readInt--;
                }
            } else {
                linkedHashMap = null;
            }
            return new C24426d(readString, readString2, readString3, readString4, linkedHashMap, (C24450d) parcel.readParcelable(C24426d.class.getClassLoader()), C22696xo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), (Locale) parcel.readSerializable());
        }

        /* renamed from: a */
        public final C24426d[] newArray(int i) {
            return new C24426d[i];
        }
    }

    public C24426d(String str, String str2, String str3, String str4, Map<String, String> map, C24450d dVar, C22696xo xoVar, boolean z, String str5, Locale locale) {
        C24362h.m61211f(str, "sdkInvokeId");
        C24362h.m61211f(str2, "baseUrl");
        C24362h.m61211f(str3, "sessionToken");
        C24362h.m61211f(dVar, "encryption");
        C24362h.m61211f(xoVar, "branding");
        C24362h.m61211f(str5, "apiVersion");
        this.f61817b = str;
        this.f61818c = str2;
        this.f61819d = str3;
        this.f61820e = str4;
        this.f61821f = map;
        this.f61822g = dVar;
        this.f61823h = xoVar;
        this.f61824i = z;
        this.f61825j = str5;
        this.f61826k = locale;
    }

    /* renamed from: a */
    public static final C24426d m61425a(C24426d dVar, String str) {
        return f61816a.mo60611a(dVar, str);
    }

    /* renamed from: a */
    public static /* synthetic */ C24426d m61426a(C24426d dVar, String str, String str2, String str3, String str4, Map map, C24450d dVar2, C22696xo xoVar, boolean z, String str5, Locale locale, int i, Object obj) {
        C24426d dVar3 = dVar;
        int i2 = i;
        return dVar.mo60596a((i2 & 1) != 0 ? dVar3.f61817b : str, (i2 & 2) != 0 ? dVar3.f61818c : str2, (i2 & 4) != 0 ? dVar3.f61819d : str3, (i2 & 8) != 0 ? dVar3.f61820e : str4, (i2 & 16) != 0 ? dVar3.f61821f : map, (i2 & 32) != 0 ? dVar3.f61822g : dVar2, (i2 & 64) != 0 ? dVar3.f61823h : xoVar, (i2 & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? dVar3.f61824i : z, (i2 & 256) != 0 ? dVar3.f61825j : str5, (i2 & 512) != 0 ? dVar3.f61826k : locale);
    }

    /* renamed from: a */
    public static final C24426d m61427a(C24426d dVar, Locale locale) {
        return f61816a.mo60612a(dVar, locale);
    }

    /* renamed from: a */
    public final String mo60595a() {
        return this.f61817b;
    }

    /* renamed from: a */
    public final C24426d mo60596a(String str, String str2, String str3, String str4, Map<String, String> map, C24450d dVar, C22696xo xoVar, boolean z, String str5, Locale locale) {
        C24362h.m61211f(str, "sdkInvokeId");
        C24362h.m61211f(str2, "baseUrl");
        C24362h.m61211f(str3, "sessionToken");
        C24450d dVar2 = dVar;
        C24362h.m61211f(dVar2, "encryption");
        C22696xo xoVar2 = xoVar;
        C24362h.m61211f(xoVar2, "branding");
        String str6 = str5;
        C24362h.m61211f(str6, "apiVersion");
        return new C24426d(str, str2, str3, str4, map, dVar2, xoVar2, z, str6, locale);
    }

    /* renamed from: b */
    public final String mo60597b() {
        return this.f61818c;
    }

    /* renamed from: c */
    public final String mo60598c() {
        return this.f61819d;
    }

    /* renamed from: d */
    public final String mo60599d() {
        return this.f61820e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Map<String, String> mo60601e() {
        return this.f61821f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24426d)) {
            return false;
        }
        C24426d dVar = (C24426d) obj;
        return C24362h.m61206a(this.f61817b, dVar.f61817b) && C24362h.m61206a(this.f61818c, dVar.f61818c) && C24362h.m61206a(this.f61819d, dVar.f61819d) && C24362h.m61206a(this.f61820e, dVar.f61820e) && C24362h.m61206a(this.f61821f, dVar.f61821f) && C24362h.m61206a(this.f61822g, dVar.f61822g) && C24362h.m61206a(this.f61823h, dVar.f61823h) && this.f61824i == dVar.f61824i && C24362h.m61206a(this.f61825j, dVar.f61825j) && C24362h.m61206a(this.f61826k, dVar.f61826k);
    }

    /* renamed from: f */
    public final C24450d mo60603f() {
        return this.f61822g;
    }

    /* renamed from: g */
    public final C22696xo mo60604g() {
        return this.f61823h;
    }

    /* renamed from: h */
    public final boolean mo60605h() {
        return this.f61824i;
    }

    public int hashCode() {
        String str = this.f61817b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f61818c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f61819d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f61820e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Map<String, String> map = this.f61821f;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        C24450d dVar = this.f61822g;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C22696xo xoVar = this.f61823h;
        int hashCode7 = (hashCode6 + (xoVar != null ? xoVar.hashCode() : 0)) * 31;
        boolean z = this.f61824i;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        String str5 = this.f61825j;
        int hashCode8 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Locale locale = this.f61826k;
        if (locale != null) {
            i = locale.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public final String mo60607i() {
        return this.f61825j;
    }

    /* renamed from: j */
    public final Locale mo60608j() {
        return this.f61826k;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("SessionArguments(sdkInvokeId=");
        k.append(this.f61817b);
        k.append(", baseUrl=");
        k.append(this.f61818c);
        k.append(", sessionToken=");
        k.append(this.f61819d);
        k.append(", webRtcLogLevel=");
        k.append(this.f61820e);
        k.append(", flags=");
        k.append(this.f61821f);
        k.append(", encryption=");
        k.append(this.f61822g);
        k.append(", branding=");
        k.append(this.f61823h);
        k.append(", customIntroScreen=");
        k.append(this.f61824i);
        k.append(", apiVersion=");
        k.append(this.f61825j);
        k.append(", locale=");
        k.append(this.f61826k);
        k.append(")");
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f61817b);
        parcel.writeString(this.f61818c);
        parcel.writeString(this.f61819d);
        parcel.writeString(this.f61820e);
        Map<String, String> map = this.f61821f;
        if (map != null) {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> next : map.entrySet()) {
                parcel.writeString(next.getKey());
                parcel.writeString(next.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.f61822g, i);
        this.f61823h.writeToParcel(parcel, 0);
        parcel.writeInt(this.f61824i ? 1 : 0);
        parcel.writeString(this.f61825j);
        parcel.writeSerializable(this.f61826k);
    }
}
