package com.veriff.sdk.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.appboy.support.AppboyFileUtils;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C21529cn;
import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.bq */
class C21478bq extends C21529cn {

    /* renamed from: a */
    private static final int f54021a = 22;

    /* renamed from: b */
    private final Context f54022b;

    /* renamed from: c */
    private final Object f54023c = new Object();

    /* renamed from: d */
    private AssetManager f54024d;

    public C21478bq(Context context) {
        this.f54022b = context;
    }

    /* renamed from: b */
    public static String m51314b(C21525cl clVar) {
        return clVar.f54153d.toString().substring(f54021a);
    }

    /* renamed from: a */
    public boolean mo54408a(C21525cl clVar) {
        Uri uri = clVar.f54153d;
        if (!AppboyFileUtils.FILE_SCHEME.equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C21529cn.C21530a mo54407a(C21525cl clVar, int i) throws IOException {
        if (this.f54024d == null) {
            synchronized (this.f54023c) {
                if (this.f54024d == null) {
                    this.f54024d = this.f54022b.getAssets();
                }
            }
        }
        return new C21529cn.C21530a(abr.m50514a(this.f54024d.open(m51314b(clVar))), C21512ci.C21518d.DISK);
    }
}
