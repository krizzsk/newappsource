package com.veriff.sdk.internal;

import bf0.C21050d;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import lf0.C24225a;
import lf0.C24236l;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J$\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&J\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\fH&J$\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006H&R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/views/barcode/BarcodeMVP$Model;", "", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "getSession", "", "jpegPicture", "Lkotlin/Function1;", "Ljava/io/File;", "Lbf0/d;", "onDone", "savePictureToDisk", "picture", "Lkotlin/Function0;", "tryPictureForDocBack", "", "callback", "validateBarcodePicture", "", "getMaxScanAttempts", "()I", "maxScanAttempts", "", "getResultDelayMs", "()J", "resultDelayMs", "getScanTimeoutMs", "scanTimeoutMs", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public interface oo$a {
    /* renamed from: a */
    long mo56115a();

    /* renamed from: a */
    void mo56116a(File file, C24225a<C21050d> aVar);

    /* renamed from: a */
    void mo56117a(File file, C24236l<? super Boolean, C21050d> lVar);

    /* renamed from: a */
    void mo56118a(byte[] bArr, C24236l<? super File, C21050d> lVar) throws IOException;

    /* renamed from: b */
    int mo56119b();

    /* renamed from: c */
    long mo56120c();

    /* renamed from: d */
    C22661wm mo56121d();
}
