package p462eh;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;
import p935yg.C20720c;

/* renamed from: eh.c */
public final class C16822c {

    /* renamed from: a */
    public final String f43783a;

    /* renamed from: b */
    public SymbolShapeHint f43784b;

    /* renamed from: c */
    public C20720c f43785c;

    /* renamed from: d */
    public C20720c f43786d;

    /* renamed from: e */
    public final StringBuilder f43787e;

    /* renamed from: f */
    public int f43788f;

    /* renamed from: g */
    public int f43789g;

    /* renamed from: h */
    public C16824e f43790h;

    /* renamed from: i */
    public int f43791i;

    public C16822c(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f43783a = sb.toString();
        this.f43784b = SymbolShapeHint.FORCE_NONE;
        this.f43787e = new StringBuilder(str.length());
        this.f43789g = -1;
    }

    /* renamed from: a */
    public final int mo49492a() {
        return this.f43787e.length();
    }

    /* renamed from: b */
    public final char mo49493b() {
        return this.f43783a.charAt(this.f43788f);
    }

    /* renamed from: c */
    public final boolean mo49494c() {
        if (this.f43788f < this.f43783a.length() - this.f43791i) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo49495d(int i) {
        C16824e eVar = this.f43790h;
        if (eVar == null || i > eVar.f43798b) {
            this.f43790h = C16824e.m42609f(i, this.f43784b, this.f43785c, this.f43786d);
        }
    }

    /* renamed from: e */
    public final void mo49496e(char c) {
        this.f43787e.append(c);
    }
}
