package com.veriff.sdk.internal;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, mo59060d2 = {"SCHEME", "", "log", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "encryptedUri", "Landroid/net/Uri;", "Ljava/io/File;", "getEncryptedUri", "(Ljava/io/File;)Landroid/net/Uri;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mp */
public final class C22034mp {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C24465j f55585a = C24465j.m61536a(C22033mo.class);

    /* renamed from: a */
    public static final Uri m53717a(File file) {
        C24362h.m61211f(file, "$this$encryptedUri");
        Uri build = Uri.fromFile(file).buildUpon().scheme("encfile").build();
        C24362h.m61210e(build, "Uri.fromFile(this).build…().scheme(SCHEME).build()");
        return build;
    }
}
