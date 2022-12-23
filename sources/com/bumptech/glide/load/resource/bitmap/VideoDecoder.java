package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p001a0.C0016g;
import p025b6.C1489d;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4566d;
import p146k6.C5498d;

public final class VideoDecoder<T> implements C1493f<T, Bitmap> {

    /* renamed from: d */
    public static final C1489d<Long> f7161d = new C1489d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C2198a());

    /* renamed from: e */
    public static final C1489d<Integer> f7162e = new C1489d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C2199b());

    /* renamed from: f */
    public static final C2202e f7163f = new C2202e();

    /* renamed from: a */
    public final C2203f<T> f7164a;

    /* renamed from: b */
    public final C4566d f7165b;

    /* renamed from: c */
    public final C2202e f7166c;

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C2198a implements C1489d.C1491b<Long> {

        /* renamed from: b */
        public final ByteBuffer f7167b = ByteBuffer.allocate(8);

        /* renamed from: a */
        public final void mo250a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            synchronized (this.f7167b) {
                this.f7167b.position(0);
                messageDigest.update(this.f7167b.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C2199b implements C1489d.C1491b<Integer> {

        /* renamed from: b */
        public final ByteBuffer f7168b = ByteBuffer.allocate(4);

        /* renamed from: a */
        public final void mo250a(byte[] bArr, Object obj, MessageDigest messageDigest) {
            Integer num = (Integer) obj;
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f7168b) {
                    this.f7168b.position(0);
                    messageDigest.update(this.f7168b.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C2200c implements C2203f<AssetFileDescriptor> {
        /* renamed from: a */
        public final void mo11004a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C2201d implements C2203f<ByteBuffer> {
        /* renamed from: a */
        public final void mo11004a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new C2214d((ByteBuffer) obj));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public static class C2202e {
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public interface C2203f<T> {
        /* renamed from: a */
        void mo11004a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C2204g implements C2203f<ParcelFileDescriptor> {
        /* renamed from: a */
        public final void mo11004a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public VideoDecoder(C4566d dVar, C2203f<T> fVar) {
        C2202e eVar = f7163f;
        this.f7165b = dVar;
        this.f7164a = fVar;
        this.f7166c = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m5721c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L_0x0053
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x0053
            if (r14 == r0) goto L_0x0053
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f7151d
            if (r15 == r0) goto L_0x0053
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch:{ all -> 0x0053 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0053 }
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch:{ all -> 0x0053 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0053 }
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch:{ all -> 0x0053 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0053 }
            r3 = 90
            if (r2 == r3) goto L_0x0036
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L_0x0039
        L_0x0036:
            r8 = r1
            r1 = r0
            r0 = r8
        L_0x0039:
            float r13 = r15.mo10993b(r0, r1, r13, r14)     // Catch:{ all -> 0x0053 }
            float r14 = (float) r0     // Catch:{ all -> 0x0053 }
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0053 }
            float r14 = (float) r1     // Catch:{ all -> 0x0053 }
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0053 }
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = r2.getScaledFrameAtTime(r3, r5, r6, r7)     // Catch:{ all -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            if (r13 != 0) goto L_0x005a
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L_0x005a:
            if (r13 == 0) goto L_0x005d
            return r13
        L_0x005d:
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException r9 = new com.bumptech.glide.load.resource.bitmap.VideoDecoder$VideoDecoderException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.VideoDecoder.m5721c(android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.DownsampleStrategy):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public final boolean mo5850a(T t, C1492e eVar) {
        return true;
    }

    /* renamed from: b */
    public final C4397l<Bitmap> mo5851b(T t, int i, int i2, C1492e eVar) throws IOException {
        int i3;
        long longValue = ((Long) eVar.mo5848c(f7161d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) eVar.mo5848c(f7162e);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) eVar.mo5848c(DownsampleStrategy.f7153f);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.f7152e;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            this.f7166c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f7164a.mo11004a(mediaMetadataRetriever, t);
                Bitmap c = m5721c(mediaMetadataRetriever, longValue, num.intValue(), i, i2, downsampleStrategy2);
                if (i3 < 29) {
                    mediaMetadataRetriever.release();
                }
                return C5498d.m13681c(c, this.f7165b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.close();
                } else {
                    mediaMetadataRetriever.release();
                }
            }
        } else {
            throw new IllegalArgumentException(C0016g.m29l("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }
}
