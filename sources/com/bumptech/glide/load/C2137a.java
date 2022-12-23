package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p072e6.C4564b;

/* renamed from: com.bumptech.glide.load.a */
public final class C2137a {
    /* renamed from: a */
    public static int m5566a(C4564b bVar, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                int a = ((ImageHeaderParser) list.get(i)).mo10892a(inputStream, bVar);
                if (a != -1) {
                    return a;
                }
                i++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static ImageHeaderParser.ImageType m5567b(C4564b bVar, InputStream inputStream, List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ImageHeaderParser.ImageType c = ((ImageHeaderParser) list.get(i)).mo10894c(inputStream);
                inputStream.reset();
                if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c;
                }
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public static ImageHeaderParser.ImageType m5568c(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType b = list.get(i).mo10893b(byteBuffer);
            if (b != ImageHeaderParser.ImageType.UNKNOWN) {
                return b;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
