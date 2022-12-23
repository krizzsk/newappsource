package com.veriff.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.appboy.support.AppboyFileUtils;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import java.io.IOException;
import p034c2.C1759a;

/* renamed from: com.veriff.sdk.internal.bz */
class C21497bz extends C21489bv {
    public C21497bz(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo54408a(C21525cl clVar) {
        return AppboyFileUtils.FILE_SCHEME.equals(clVar.f54153d.getScheme());
    }

    /* renamed from: a */
    public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
        return new C21529cn.C21530a((Bitmap) null, abr.m50514a(mo54439b(clVar)), C21512ci.C21518d.DISK, m51384a(clVar.f54153d));
    }

    /* renamed from: a */
    public static int m51384a(Uri uri) throws IOException {
        return new C1759a(uri.getPath()).mo6534g(1, "Orientation");
    }
}
