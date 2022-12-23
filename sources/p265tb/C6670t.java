package p265tb;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: tb.t */
public final class C6670t implements C6654g {

    /* renamed from: a */
    public final C6654g f20748a;

    /* renamed from: b */
    public long f20749b;

    /* renamed from: c */
    public Uri f20750c = Uri.EMPTY;

    /* renamed from: d */
    public Map<String, List<String>> f20751d = Collections.emptyMap();

    public C6670t(C6654g gVar) {
        gVar.getClass();
        this.f20748a = gVar;
    }

    /* renamed from: b */
    public final Map<String, List<String>> mo20679b() {
        return this.f20748a.mo20679b();
    }

    public final void close() throws IOException {
        this.f20748a.close();
    }

    /* renamed from: d */
    public final void mo20680d(C6671u uVar) {
        uVar.getClass();
        this.f20748a.mo20680d(uVar);
    }

    /* renamed from: e */
    public final long mo16699e(C6657i iVar) throws IOException {
        this.f20750c = iVar.f20668a;
        this.f20751d = Collections.emptyMap();
        long e = this.f20748a.mo16699e(iVar);
        Uri uri = getUri();
        uri.getClass();
        this.f20750c = uri;
        this.f20751d = mo20679b();
        return e;
    }

    public final Uri getUri() {
        return this.f20748a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f20748a.read(bArr, i, i2);
        if (read != -1) {
            this.f20749b += (long) read;
        }
        return read;
    }
}
