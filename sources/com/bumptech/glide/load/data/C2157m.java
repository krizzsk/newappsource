package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.m */
public final class C2157m extends C2140b<InputStream> {
    public C2157m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public final Class<InputStream> mo6607a() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final void mo10906c(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* renamed from: f */
    public final Object mo10907f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
