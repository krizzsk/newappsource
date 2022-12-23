package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.m1 */
public final /* synthetic */ class C14292m1 implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f35950a;

    public /* synthetic */ C14292m1(String str) {
        this.f35950a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f35950a).concat("-")) && str.endsWith(".apk");
    }
}
