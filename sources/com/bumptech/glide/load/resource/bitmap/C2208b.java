package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2137a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2154k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p072e6.C4564b;
import p311x6.C7160a;
import p584jl.C17885a;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public interface C2208b {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    public static final class C2209a implements C2208b {

        /* renamed from: a */
        public final ByteBuffer f7181a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f7182b;

        /* renamed from: c */
        public final C4564b f7183c;

        public C2209a(C4564b bVar, ByteBuffer byteBuffer, List list) {
            this.f7181a = byteBuffer;
            this.f7182b = list;
            this.f7183c = bVar;
        }

        /* renamed from: a */
        public final Bitmap mo11009a(BitmapFactory.Options options) {
            ByteBuffer byteBuffer = this.f7181a;
            AtomicReference<byte[]> atomicReference = C7160a.f22239a;
            return BitmapFactory.decodeStream(new C7160a.C7161a((ByteBuffer) byteBuffer.position(0)), (Rect) null, options);
        }

        /* renamed from: b */
        public final void mo11010b() {
        }

        /* renamed from: c */
        public final int mo11011c() throws IOException {
            List<ImageHeaderParser> list = this.f7182b;
            ByteBuffer byteBuffer = this.f7181a;
            AtomicReference<byte[]> atomicReference = C7160a.f22239a;
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
            C4564b bVar = this.f7183c;
            if (byteBuffer2 == null) {
                return -1;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int d = list.get(i).mo10895d(byteBuffer2, bVar);
                if (d != -1) {
                    return d;
                }
            }
            return -1;
        }

        /* renamed from: d */
        public final ImageHeaderParser.ImageType mo11012d() throws IOException {
            List<ImageHeaderParser> list = this.f7182b;
            ByteBuffer byteBuffer = this.f7181a;
            AtomicReference<byte[]> atomicReference = C7160a.f22239a;
            return C2137a.m5568c(list, (ByteBuffer) byteBuffer.position(0));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    public static final class C2210b implements C2208b {

        /* renamed from: a */
        public final C2154k f7184a;

        /* renamed from: b */
        public final C4564b f7185b;

        /* renamed from: c */
        public final List<ImageHeaderParser> f7186c;

        public C2210b(C4564b bVar, InputStream inputStream, List list) {
            C17885a.m44458r(bVar);
            this.f7185b = bVar;
            C17885a.m44458r(list);
            this.f7186c = list;
            this.f7184a = new C2154k(inputStream, bVar);
        }

        /* renamed from: a */
        public final Bitmap mo11009a(BitmapFactory.Options options) throws IOException {
            C2154k kVar = this.f7184a;
            kVar.f6974a.reset();
            return BitmapFactory.decodeStream(kVar.f6974a, (Rect) null, options);
        }

        /* renamed from: b */
        public final void mo11010b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f7184a.f6974a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f7157d = recyclableBufferedInputStream.f7155b.length;
            }
        }

        /* renamed from: c */
        public final int mo11011c() throws IOException {
            List<ImageHeaderParser> list = this.f7186c;
            C2154k kVar = this.f7184a;
            kVar.f6974a.reset();
            return C2137a.m5566a(this.f7185b, kVar.f6974a, list);
        }

        /* renamed from: d */
        public final ImageHeaderParser.ImageType mo11012d() throws IOException {
            List<ImageHeaderParser> list = this.f7186c;
            C2154k kVar = this.f7184a;
            kVar.f6974a.reset();
            return C2137a.m5567b(this.f7185b, kVar.f6974a, list);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$c */
    public static final class C2211c implements C2208b {

        /* renamed from: a */
        public final C4564b f7187a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f7188b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f7189c;

        public C2211c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C4564b bVar) {
            C17885a.m44458r(bVar);
            this.f7187a = bVar;
            C17885a.m44458r(list);
            this.f7188b = list;
            this.f7189c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        /* renamed from: a */
        public final Bitmap mo11009a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f7189c.mo10898a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: b */
        public final void mo11010b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC, Splitter:B:19:0x003d] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo11011c() throws java.io.IOException {
            /*
                r10 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r10.f7188b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r10.f7189c
                e6.b r2 = r10.f7187a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                r5 = -1
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r6 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r7 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r9 = r1.mo10898a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r8.<init>(r9)     // Catch:{ all -> 0x0039 }
                r7.<init>(r8, r2)     // Catch:{ all -> 0x0039 }
                int r6 = r6.mo10892a(r7, r2)     // Catch:{ all -> 0x0037 }
                r7.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                r1.mo10898a()
                if (r6 == r5) goto L_0x0034
                r5 = r6
                goto L_0x0044
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r0 = move-exception
                goto L_0x003b
            L_0x0039:
                r0 = move-exception
                r7 = 0
            L_0x003b:
                if (r7 == 0) goto L_0x0040
                r7.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r1.mo10898a()
                throw r0
            L_0x0044:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2208b.C2211c.mo11011c():int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.ImageHeaderParser.ImageType mo11012d() throws java.io.IOException {
            /*
                r9 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r9.f7188b
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r9.f7189c
                e6.b r2 = r9.f7187a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r5 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r6 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r8 = r1.mo10898a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r7.<init>(r8)     // Catch:{ all -> 0x0039 }
                r6.<init>(r7, r2)     // Catch:{ all -> 0x0039 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo10894c(r6)     // Catch:{ all -> 0x0037 }
                r6.close()     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                r1.mo10898a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L_0x0034
                goto L_0x0046
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r0 = move-exception
                goto L_0x003b
            L_0x0039:
                r0 = move-exception
                r6 = 0
            L_0x003b:
                if (r6 == 0) goto L_0x0040
                r6.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r1.mo10898a()
                throw r0
            L_0x0044:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0046:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2208b.C2211c.mo11012d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: a */
    Bitmap mo11009a(BitmapFactory.Options options) throws IOException;

    /* renamed from: b */
    void mo11010b();

    /* renamed from: c */
    int mo11011c() throws IOException;

    /* renamed from: d */
    ImageHeaderParser.ImageType mo11012d() throws IOException;
}
