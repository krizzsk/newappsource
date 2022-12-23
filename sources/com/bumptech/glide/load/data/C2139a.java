package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.a */
public final class C2139a extends C2156l<AssetFileDescriptor> {
    public C2139a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    public final Class<AssetFileDescriptor> mo6607a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: c */
    public final void mo10904c(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    /* renamed from: f */
    public final Object mo10905f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
