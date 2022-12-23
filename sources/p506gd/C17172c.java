package p506gd;

import java.io.File;
import p001a0.C0017h;

/* renamed from: gd.c */
public final class C17172c extends C17184o {

    /* renamed from: a */
    public final File f44409a;

    /* renamed from: b */
    public final String f44410b;

    public C17172c(File file, String str) {
        this.f44409a = file;
        if (str != null) {
            this.f44410b = str;
            return;
        }
        throw new NullPointerException("Null splitId");
    }

    /* renamed from: a */
    public final File mo49755a() {
        return this.f44409a;
    }

    /* renamed from: b */
    public final String mo49756b() {
        return this.f44410b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17184o) {
            C17184o oVar = (C17184o) obj;
            if (!this.f44409a.equals(oVar.mo49755a()) || !this.f44410b.equals(oVar.mo49756b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f44409a.hashCode() ^ 1000003) * 1000003) ^ this.f44410b.hashCode();
    }

    public final String toString() {
        String obj = this.f44409a.toString();
        String str = this.f44410b;
        StringBuilder sb = new StringBuilder(str.length() + obj.length() + 35);
        C0017h.m61R(sb, "SplitFileInfo{splitFile=", obj, ", splitId=", str);
        sb.append("}");
        return sb.toString();
    }
}
