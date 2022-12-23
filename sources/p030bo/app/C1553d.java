package p030bo.app;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import p030bo.app.C1540c;

/* renamed from: bo.app.d */
public final class C1553d {

    /* renamed from: a */
    public final String f5585a;

    /* renamed from: b */
    public final long[] f5586b;

    /* renamed from: c */
    public boolean f5587c;

    /* renamed from: d */
    public C1540c.C1543c f5588d;

    /* renamed from: e */
    public long f5589e;

    /* renamed from: f */
    public final int f5590f;

    /* renamed from: g */
    public final File f5591g;

    public C1553d(String str, int i, File file) {
        this.f5585a = str;
        this.f5590f = i;
        this.f5591g = file;
        this.f5586b = new long[i];
    }

    /* renamed from: a */
    public String mo5961a() {
        StringBuilder sb = new StringBuilder();
        for (long append : this.f5586b) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public void mo5963b(String[] strArr) {
        if (strArr.length == this.f5590f) {
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.f5586b[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException unused) {
                    mo5960a(strArr);
                    throw null;
                }
            }
            return;
        }
        mo5960a(strArr);
        throw null;
    }

    /* renamed from: a */
    public IOException mo5960a(String[] strArr) {
        StringBuilder k = C13555b.m33972k("unexpected journal line: ");
        k.append(Arrays.toString(strArr));
        throw new IOException(k.toString());
    }

    /* renamed from: b */
    public File mo5962b(int i) {
        File file = this.f5591g;
        return new File(file, this.f5585a + "." + i + ".tmp");
    }

    /* renamed from: a */
    public File mo5959a(int i) {
        File file = this.f5591g;
        return new File(file, this.f5585a + "." + i);
    }
}
