package mobi.lab.veriff.util;

import com.appboy.support.AppboyFileUtils;
import com.veriff.sdk.internal.C22742yn;
import com.veriff.sdk.internal.C22754yt;
import java.io.File;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo59060d2 = {"Lmobi/lab/veriff/util/UploadBinaryStreamRequestBody;", "Lhi0/b0;", "", "contentLength", "Lhi0/t;", "contentType", "Lsi0/h;", "sink", "Lbf0/d;", "writeTo", "Lmobi/lab/veriff/util/Encryption;", "encryption", "Lmobi/lab/veriff/util/Encryption;", "getEncryption", "()Lmobi/lab/veriff/util/Encryption;", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "", "mediaType", "Ljava/lang/String;", "<init>", "(Ljava/io/File;Lmobi/lab/veriff/util/Encryption;Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.util.m */
public final class C24468m extends C22754yt {

    /* renamed from: a */
    private final File f61928a;

    /* renamed from: b */
    private final C24450d f61929b;

    /* renamed from: c */
    private final String f61930c;

    public C24468m(File file, C24450d dVar, String str) {
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        C24362h.m61211f(str, "mediaType");
        this.f61928a = file;
        this.f61929b = dVar;
        this.f61930c = str;
    }

    /* renamed from: a */
    public C22742yn mo54065a() {
        return C22742yn.m55640b(this.f61930c);
    }

    /* renamed from: b */
    public long mo54067b() {
        long length = this.f61928a.length();
        C24450d dVar = this.f61929b;
        return length - ((long) (dVar != null ? dVar.mo60666b() : 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        p584jl.C17885a.m44462t(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo54066a(com.veriff.sdk.internal.abj r6) {
        /*
            r5 = this;
            java.lang.String r0 = "sink"
            mf0.C24362h.m61211f(r6, r0)
            java.io.File r0 = r5.f61928a
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r0)
            mobi.lab.veriff.util.d r0 = r5.f61929b
            if (r0 == 0) goto L_0x0017
            java.io.InputStream r0 = r0.mo60664a((java.io.InputStream) r1)
            if (r0 == 0) goto L_0x0017
            r1 = r0
        L_0x0017:
            r0 = 0
            com.veriff.sdk.internal.aca r2 = com.veriff.sdk.internal.abr.m50514a((java.io.InputStream) r1)     // Catch:{ all -> 0x0027 }
            long r3 = r5.mo54067b()     // Catch:{ all -> 0x0027 }
            r6.mo53857a(r2, r3)     // Catch:{ all -> 0x0027 }
            p584jl.C17885a.m44462t(r1, r0)
            return
        L_0x0027:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0 = move-exception
            p584jl.C17885a.m44462t(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.lab.veriff.util.C24468m.mo54066a(com.veriff.sdk.internal.abj):void");
    }
}
