package com.veriff.sdk.internal;

import android.net.Uri;
import com.appboy.support.AppboyFileUtils;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24450d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/picasso/EncryptedFileRequestHandler;", "Lcom/squareup/picasso/RequestHandler;", "Lcom/squareup/picasso/Request;", "data", "", "canHandleRequest", "request", "", "networkPolicy", "Lcom/squareup/picasso/RequestHandler$Result;", "load", "Ljava/io/IOException;", "ioe", "Lbf0/d;", "report", "Lmobi/lab/veriff/util/Encryption;", "encryption", "Lmobi/lab/veriff/util/Encryption;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "<init>", "(Lcom/veriff/sdk/internal/errors/ErrorReporter;Lmobi/lab/veriff/util/Encryption;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mo */
public final class C22033mo extends C21529cn {

    /* renamed from: a */
    private final C21910kf f55583a;

    /* renamed from: b */
    private final C24450d f55584b;

    public C22033mo(C21910kf kfVar, C24450d dVar) {
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(dVar, "encryption");
        this.f55583a = kfVar;
        this.f55584b = dVar;
    }

    /* renamed from: a */
    public boolean mo54408a(C21525cl clVar) {
        C24362h.m61211f(clVar, "data");
        Uri uri = clVar.f54153d;
        C24362h.m61210e(uri, "data.uri");
        return C24362h.m61206a(uri.getScheme(), "encfile");
    }

    /* renamed from: a */
    public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
        C24362h.m61211f(clVar, "request");
        try {
            return new C21529cn.C21530a(abr.m50514a(this.f55584b.mo60664a((InputStream) new FileInputStream(new File(new URI(clVar.f54153d.buildUpon().scheme(AppboyFileUtils.FILE_SCHEME).build().toString()))))), C21512ci.C21518d.DISK);
        } catch (IOException e) {
            m53714a(e);
            throw e;
        }
    }

    /* renamed from: a */
    private final void m53714a(IOException iOException) {
        this.f55583a.mo55690a(iOException, "PreviewImage#load()", C21720gj.file_handling);
        C22034mp.f55585a.mo60708e("Image failed to load", iOException);
    }
}
