package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.i */
public final class C2151i extends C2156l<ParcelFileDescriptor> {
    public C2151i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    public final Class<ParcelFileDescriptor> mo6607a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: c */
    public final void mo10904c(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    /* renamed from: f */
    public final Object mo10905f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
