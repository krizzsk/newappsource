package p531he;

import java.io.File;
import p577je.C17746a0;
import p577je.C17780b;

/* renamed from: he.b */
public final class C17389b extends C17421w {

    /* renamed from: a */
    public final C17746a0 f44791a;

    /* renamed from: b */
    public final String f44792b;

    /* renamed from: c */
    public final File f44793c;

    public C17389b(C17780b bVar, String str, File file) {
        this.f44791a = bVar;
        if (str != null) {
            this.f44792b = str;
            this.f44793c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    /* renamed from: a */
    public final C17746a0 mo49857a() {
        return this.f44791a;
    }

    /* renamed from: b */
    public final File mo49858b() {
        return this.f44793c;
    }

    /* renamed from: c */
    public final String mo49859c() {
        return this.f44792b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17421w)) {
            return false;
        }
        C17421w wVar = (C17421w) obj;
        if (!this.f44791a.equals(wVar.mo49857a()) || !this.f44792b.equals(wVar.mo49859c()) || !this.f44793c.equals(wVar.mo49858b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f44791a.hashCode() ^ 1000003) * 1000003) ^ this.f44792b.hashCode()) * 1000003) ^ this.f44793c.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CrashlyticsReportWithSessionId{report=");
        k.append(this.f44791a);
        k.append(", sessionId=");
        k.append(this.f44792b);
        k.append(", reportFile=");
        k.append(this.f44793c);
        k.append("}");
        return k.toString();
    }
}
