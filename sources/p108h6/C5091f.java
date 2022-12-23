package p108h6;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import p025b6.C1487b;
import p584jl.C17885a;

/* renamed from: h6.f */
public final class C5091f implements C1487b {

    /* renamed from: b */
    public final C5092g f17081b;

    /* renamed from: c */
    public final URL f17082c;

    /* renamed from: d */
    public final String f17083d;

    /* renamed from: e */
    public String f17084e;

    /* renamed from: f */
    public URL f17085f;

    /* renamed from: g */
    public volatile byte[] f17086g;

    /* renamed from: h */
    public int f17087h;

    public C5091f(URL url) {
        C5094i iVar = C5092g.f17088a;
        C17885a.m44458r(url);
        this.f17082c = url;
        this.f17083d = null;
        C17885a.m44458r(iVar);
        this.f17081b = iVar;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        if (this.f17086g == null) {
            this.f17086g = mo20825c().getBytes(C1487b.f5389a);
        }
        messageDigest.update(this.f17086g);
    }

    /* renamed from: c */
    public final String mo20825c() {
        String str = this.f17083d;
        if (str != null) {
            return str;
        }
        URL url = this.f17082c;
        C17885a.m44458r(url);
        return url.toString();
    }

    /* renamed from: d */
    public final URL mo20826d() throws MalformedURLException {
        if (this.f17085f == null) {
            if (TextUtils.isEmpty(this.f17084e)) {
                String str = this.f17083d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f17082c;
                    C17885a.m44458r(url);
                    str = url.toString();
                }
                this.f17084e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f17085f = new URL(this.f17084e);
        }
        return this.f17085f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5091f)) {
            return false;
        }
        C5091f fVar = (C5091f) obj;
        if (!mo20825c().equals(fVar.mo20825c()) || !this.f17081b.equals(fVar.f17081b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f17087h == 0) {
            int hashCode = mo20825c().hashCode();
            this.f17087h = hashCode;
            this.f17087h = this.f17081b.hashCode() + (hashCode * 31);
        }
        return this.f17087h;
    }

    public final String toString() {
        return mo20825c();
    }

    public C5091f(String str) {
        C5094i iVar = C5092g.f17088a;
        this.f17082c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f17083d = str;
            C17885a.m44458r(iVar);
            this.f17081b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
