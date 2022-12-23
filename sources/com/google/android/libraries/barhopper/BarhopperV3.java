package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import p600kd.C18018a;
import p887wg.C20305a;

public class BarhopperV3 implements Closeable {

    /* renamed from: b */
    public long f14786b;

    static {
        Class<BarhopperV3> cls = BarhopperV3.class;
    }

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j);

    private native long createNativeWithClientOptions(byte[] bArr);

    /* renamed from: g */
    public static C20305a m11071g(byte[] bArr) {
        try {
            return C20305a.m47882b(bArr, zzdn.zza());
        } catch (zzen e) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}".concat(e.toString()));
        }
    }

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    /* renamed from: a */
    public final void mo19349a(C18018a aVar) {
        if (this.f14786b == 0) {
            try {
                byte[] bArr = new byte[aVar.zzE()];
                zzdi zzF = zzdi.zzF(bArr);
                aVar.zzW(zzF);
                zzF.zzG();
                long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
                this.f14786b = createNativeWithClientOptions;
                if (createNativeWithClientOptions == 0) {
                    throw new IllegalArgumentException("Failed to create native context with client options.");
                }
            } catch (IOException e) {
                String name = aVar.getClass().getName();
                throw new RuntimeException(C13715c.m34245k(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            }
        }
    }

    /* renamed from: c */
    public final C20305a mo19350c(int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.f14786b;
        if (j != 0) {
            return m11071g(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public final void close() {
        long j = this.f14786b;
        if (j != 0) {
            closeNative(j);
            this.f14786b = 0;
        }
    }

    /* renamed from: e */
    public final C20305a mo19352e(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.f14786b;
        if (j != 0) {
            return m11071g(recognizeNative(j, i, i2, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    /* renamed from: f */
    public final C20305a mo19353f(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        long j = this.f14786b;
        if (j != 0) {
            return m11071g(recognizeBitmapNative(j, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
