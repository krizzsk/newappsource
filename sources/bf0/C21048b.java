package bf0;

import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.moovit.database.sqlite.SQLiteDatabase;
import mf0.C24362h;
import rf0.C24806h;

/* renamed from: bf0.b */
public final class C21048b implements Comparable<C21048b> {

    /* renamed from: f */
    public static final C21048b f52851f = new C21048b(7, 20);

    /* renamed from: b */
    public final int f52852b;

    /* renamed from: c */
    public final int f52853c;

    /* renamed from: d */
    public final int f52854d;

    /* renamed from: e */
    public final int f52855e;

    public C21048b() {
        throw null;
    }

    public C21048b(int i, int i2) {
        this.f52852b = 1;
        this.f52853c = i;
        this.f52854d = i2;
        boolean z = false;
        if (new C24806h(0, ValidationUtils.APPBOY_STRING_MAX_LENGTH).mo61258s(1) && new C24806h(0, ValidationUtils.APPBOY_STRING_MAX_LENGTH).mo61258s(i) && new C24806h(0, ValidationUtils.APPBOY_STRING_MAX_LENGTH).mo61258s(i2)) {
            z = true;
        }
        if (z) {
            this.f52855e = SQLiteDatabase.OPEN_FULLMUTEX + (i << 8) + i2;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + 1 + '.' + i + '.' + i2).toString());
    }

    public final int compareTo(Object obj) {
        C21048b bVar = (C21048b) obj;
        C24362h.m61211f(bVar, InneractiveMediationNameConsts.OTHER);
        return this.f52855e - bVar.f52855e;
    }

    public final boolean equals(Object obj) {
        C21048b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21048b) {
            bVar = (C21048b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && this.f52855e == bVar.f52855e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52855e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52852b);
        sb.append('.');
        sb.append(this.f52853c);
        sb.append('.');
        sb.append(this.f52854d);
        return sb.toString();
    }
}
