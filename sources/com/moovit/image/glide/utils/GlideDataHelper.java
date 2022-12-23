package com.moovit.image.glide.utils;

import com.moovit.image.glide.data.ImageData;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p060d6.C4397l;
import p810sz.C19578d;
import p810sz.C19600l;
import p810sz.C19610m;
import v10.C20065a;
import z10.C20796a;

public final class GlideDataHelper {

    public enum Marker {
        MOOVIT("moovit"),
        IMAGE_DATA("image_data"),
        ANCHORED_BITMAP("anchored_bitmap");
        
        private final ThreadLocal<byte[]> buffer;
        private final AtomicReference<byte[]> bytes;
        private final String name;

        private Marker(String str) {
            this.bytes = new AtomicReference<>();
            this.buffer = new ThreadLocal<>();
            this.name = str;
        }

        private byte[] getBuffer(byte[] bArr) {
            byte[] bArr2 = this.buffer.get();
            if (bArr2 != null) {
                return bArr2;
            }
            byte[] bArr3 = new byte[bArr.length];
            this.buffer.set(bArr3);
            return bArr3;
        }

        public byte[] getBytes() throws IOException {
            byte[] bArr = this.bytes.get();
            if (bArr == null) {
                synchronized (this.bytes) {
                    bArr = this.bytes.get();
                    if (bArr == null) {
                        bArr = this.name.getBytes("UTF-8");
                        this.bytes.set(bArr);
                    }
                }
            }
            return bArr;
        }

        public boolean startsWith(InputStream inputStream) throws IOException {
            byte[] bytes2 = getBytes();
            byte[] buffer2 = getBuffer(bytes2);
            if (inputStream.read(buffer2) != bytes2.length) {
                return false;
            }
            return Arrays.equals(bytes2, buffer2);
        }
    }

    /* renamed from: a */
    public static C4397l m40838a(C20796a aVar, InputStream inputStream) throws IOException {
        Marker marker = Marker.ANCHORED_BITMAP;
        Object obj = null;
        if (Marker.MOOVIT.startsWith(inputStream) && marker.startsWith(inputStream)) {
            obj = aVar.read(new C19578d(inputStream));
        }
        return (C4397l) obj;
    }

    /* renamed from: b */
    public static ImageData m40839b(File file) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            Marker marker = Marker.IMAGE_DATA;
            ImageData.C16030a aVar = ImageData.f41738f;
            Object obj = null;
            if (Marker.MOOVIT.startsWith(bufferedInputStream)) {
                if (marker.startsWith(bufferedInputStream)) {
                    obj = aVar.read(new C19578d(bufferedInputStream));
                }
            }
            ImageData imageData = (ImageData) obj;
            bufferedInputStream.close();
            return imageData;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: c */
    public static boolean m40840c(File file, C20065a aVar, C19600l<C20065a> lVar) {
        return m40841d(file, Marker.ANCHORED_BITMAP, aVar, lVar);
    }

    /* renamed from: d */
    public static <T> boolean m40841d(File file, Marker marker, T t, C19600l<T> lVar) {
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            bufferedOutputStream.write(Marker.MOOVIT.getBytes());
            bufferedOutputStream.write(marker.getBytes());
            lVar.write(t, new C19610m(bufferedOutputStream));
            bufferedOutputStream.close();
            return true;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: e */
    public static boolean m40842e(File file, ImageData imageData) {
        return m40841d(file, Marker.IMAGE_DATA, imageData, ImageData.f41738f);
    }
}
