package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.h */
public final class C2150h extends C2140b<AssetFileDescriptor> {
    public C2150h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public final Class<AssetFileDescriptor> mo6607a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: c */
    public final void mo10906c(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    /* renamed from: f */
    public final Object mo10907f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
