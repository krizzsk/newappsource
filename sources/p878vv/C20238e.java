package p878vv;

import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.actions.SearchIntents;
import p358af.C13437d;
import p583jk.C17884p;

/* renamed from: vv.e */
public final class C20238e {

    /* renamed from: a */
    public final String f51344a;

    /* renamed from: b */
    public final short f51345b;

    public C20238e(String str, short s) {
        C21100e.m49373x(str, SearchIntents.EXTRA_QUERY);
        this.f51344a = str;
        this.f51345b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20238e)) {
            return false;
        }
        C20238e eVar = (C20238e) obj;
        if (!this.f51344a.equals(eVar.f51344a) || this.f51345b != eVar.f51345b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f51344a), this.f51345b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SearchPageToken[‎");
        k.append(this.f51344a);
        k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        return C13437d.m33707l(k, this.f51345b, "]");
    }
}
