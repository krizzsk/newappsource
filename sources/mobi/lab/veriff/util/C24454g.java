package mobi.lab.veriff.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001:\u0001-BC\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0002HÆ\u0001J\u000e\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010 \u001a\u00020\u001dR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b*\u0010#¨\u0006."}, mo59060d2 = {"Lmobi/lab/veriff/util/LanguageCountryLocale;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "component1", "component2", "component3", "component4", "component5", "component6", "languageCode", "serverLanguageCode", "countryCode", "scriptCode", "layoutDirection", "label", "copy", "Ljava/util/Locale;", "locale", "matches", "toLocale", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "getLabel", "getLanguageCode", "I", "getLayoutDirection", "()I", "getScriptCode", "getServerLanguageCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.util.g */
public final class C24454g implements Parcelable {
    public static final Parcelable.Creator<C24454g> CREATOR = new C24456b();

    /* renamed from: a */
    public static final C24455a f61890a = new C24455a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f61891b;

    /* renamed from: c */
    private final String f61892c;

    /* renamed from: d */
    private final String f61893d;

    /* renamed from: e */
    private final String f61894e;

    /* renamed from: f */
    private final int f61895f;

    /* renamed from: g */
    private final String f61896g;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, mo59060d2 = {"Lmobi/lab/veriff/util/LanguageCountryLocale$Companion;", "", "()V", "fromLocale", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "locale", "Ljava/util/Locale;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.g$a */
    public static final class C24455a {
        private C24455a() {
        }

        public /* synthetic */ C24455a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24454g mo60686a(Locale locale) {
            T t;
            T t2 = null;
            if (locale == null) {
                return null;
            }
            Iterator<T> it = C24457h.f61897a.mo60702b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C24454g) t).mo60676a(locale)) {
                    break;
                }
            }
            C24454g gVar = (C24454g) t;
            Iterator<T> it2 = C24457h.f61897a.mo60702b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (C25081h.m62830A(((C24454g) next).mo60677b(), locale.getLanguage(), true)) {
                    t2 = next;
                    break;
                }
            }
            C24454g gVar2 = (C24454g) t2;
            if (gVar != null) {
                return gVar;
            }
            return gVar2;
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.g$b */
    public static class C24456b implements Parcelable.Creator<C24454g> {
        /* renamed from: a */
        public final C24454g createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C24454g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* renamed from: a */
        public final C24454g[] newArray(int i) {
            return new C24454g[i];
        }
    }

    public C24454g(String str, String str2, String str3, String str4, int i, String str5) {
        C13437d.m33711q(str, "languageCode", str2, "serverLanguageCode", str5, "label");
        this.f61891b = str;
        this.f61892c = str2;
        this.f61893d = str3;
        this.f61894e = str4;
        this.f61895f = i;
        this.f61896g = str5;
    }

    /* renamed from: a */
    public final boolean mo60676a(Locale locale) {
        C24362h.m61211f(locale, "locale");
        String str = this.f61894e;
        if (str != null && !C25081h.m62830A(str, locale.getScript(), true)) {
            return false;
        }
        String str2 = this.f61893d;
        if (str2 == null || C25081h.m62830A(str2, locale.getCountry(), true)) {
            return C25081h.m62830A(this.f61891b, locale.getLanguage(), true);
        }
        return false;
    }

    /* renamed from: b */
    public final String mo60677b() {
        return this.f61891b;
    }

    /* renamed from: c */
    public final String mo60678c() {
        return this.f61892c;
    }

    /* renamed from: d */
    public final int mo60679d() {
        return this.f61895f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo60681e() {
        return this.f61896g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24454g)) {
            return false;
        }
        C24454g gVar = (C24454g) obj;
        return C24362h.m61206a(this.f61891b, gVar.f61891b) && C24362h.m61206a(this.f61892c, gVar.f61892c) && C24362h.m61206a(this.f61893d, gVar.f61893d) && C24362h.m61206a(this.f61894e, gVar.f61894e) && this.f61895f == gVar.f61895f && C24362h.m61206a(this.f61896g, gVar.f61896g);
    }

    public int hashCode() {
        String str = this.f61891b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f61892c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f61893d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f61894e;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f61895f) * 31;
        String str5 = this.f61896g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return this.f61892c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeString(this.f61891b);
        parcel.writeString(this.f61892c);
        parcel.writeString(this.f61893d);
        parcel.writeString(this.f61894e);
        parcel.writeInt(this.f61895f);
        parcel.writeString(this.f61896g);
    }

    /* renamed from: a */
    public final Locale mo60675a() {
        Locale.Builder builder = new Locale.Builder();
        builder.setLanguage(this.f61891b);
        String str = this.f61894e;
        if (str != null) {
            builder.setScript(str);
        }
        String str2 = this.f61893d;
        if (str2 != null) {
            builder.setRegion(str2);
        }
        Locale build = builder.build();
        C24362h.m61210e(build, "builder.build()");
        return build;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24454g(String str, String str2, String str3, String str4, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? str : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0 : i, str5);
    }
}
