package com.veriff.sdk.internal;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/PictureStorage;", "", "mediaStorage", "Lcom/veriff/sdk/internal/upload/MediaStorage;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "(Lcom/veriff/sdk/internal/upload/MediaStorage;Lcom/veriff/sdk/internal/errors/ErrorReporter;)V", "savePictureToFile", "Ljava/io/File;", "bytes", "", "fileName", "", "webpResize", "", "rotationDegrees", "", "([BLjava/lang/String;ZLjava/lang/Integer;)Ljava/io/File;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nh */
public final class C22061nh {

    /* renamed from: a */
    private final C22047nb f55649a;

    /* renamed from: b */
    private final C21910kf f55650b;

    public C22061nh(C22047nb nbVar, C21910kf kfVar) {
        C24362h.m61211f(nbVar, "mediaStorage");
        C24362h.m61211f(kfVar, "errorReporter");
        this.f55649a = nbVar;
        this.f55650b = kfVar;
    }

    /* renamed from: a */
    public static /* synthetic */ File m53800a(C22061nh nhVar, byte[] bArr, String str, boolean z, Integer num, int i, Object obj) throws IOException {
        if ((i & 8) != 0) {
            num = null;
        }
        return nhVar.mo55941a(bArr, str, z, num);
    }

    /* renamed from: a */
    public final File mo55941a(byte[] bArr, String str, boolean z, Integer num) throws IOException {
        C24362h.m61211f(bArr, "bytes");
        C24362h.m61211f(str, "fileName");
        File a = new C22694xm(bArr, new C22695xn(this.f55649a, str, z), this.f55650b).mo57080a(num);
        C24362h.m61210e(a, "imageSaver.save(rotationDegrees)");
        return a;
    }
}
