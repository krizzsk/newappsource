package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p072e6.C4564b;
import p584jl.C17885a;

public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f7143a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f7144b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo10987a() throws IOException;

        /* renamed from: b */
        int mo10988b(int i, byte[] bArr) throws IOException;

        /* renamed from: c */
        short mo10989c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C2189a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f7145a;

        public C2189a(ByteBuffer byteBuffer) {
            this.f7145a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public final int mo10987a() throws Reader.EndOfFileException {
            return (mo10989c() << 8) | mo10989c();
        }

        /* renamed from: b */
        public final int mo10988b(int i, byte[] bArr) {
            int min = Math.min(i, this.f7145a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f7145a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public final short mo10989c() throws Reader.EndOfFileException {
            if (this.f7145a.remaining() >= 1) {
                return (short) (this.f7145a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public final long skip(long j) {
            int min = (int) Math.min((long) this.f7145a.remaining(), j);
            ByteBuffer byteBuffer = this.f7145a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C2190b {

        /* renamed from: a */
        public final ByteBuffer f7146a;

        public C2190b(byte[] bArr, int i) {
            this.f7146a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public final short mo10991a(int i) {
            boolean z;
            if (this.f7146a.remaining() - i >= 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this.f7146a.getShort(i);
            }
            return -1;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C2191c implements Reader {

        /* renamed from: a */
        public final InputStream f7147a;

        public C2191c(InputStream inputStream) {
            this.f7147a = inputStream;
        }

        /* renamed from: a */
        public final int mo10987a() throws IOException {
            return (mo10989c() << 8) | mo10989c();
        }

        /* renamed from: b */
        public final int mo10988b(int i, byte[] bArr) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f7147a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new Reader.EndOfFileException();
        }

        /* renamed from: c */
        public final short mo10989c() throws IOException {
            int read = this.f7147a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f7147a.skip(j2);
                if (skip <= 0) {
                    if (this.f7147a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[Catch:{ all -> 0x0059, EndOfFileException -> 0x005e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[Catch:{ all -> 0x0059, EndOfFileException -> 0x005e }, LOOP:0: B:13:0x001b->B:25:0x0043, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m5688e(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6, p072e6.C4564b r7) throws java.io.IOException {
        /*
            r0 = -1
            int r1 = r6.mo10987a()     // Catch:{ EndOfFileException -> 0x005e }
            r2 = 65496(0xffd8, float:9.178E-41)
            r3 = r1 & r2
            if (r3 == r2) goto L_0x0017
            r2 = 19789(0x4d4d, float:2.773E-41)
            if (r1 == r2) goto L_0x0017
            r2 = 18761(0x4949, float:2.629E-41)
            if (r1 != r2) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            if (r1 != 0) goto L_0x001b
            return r0
        L_0x001b:
            short r1 = r6.mo10989c()     // Catch:{ EndOfFileException -> 0x005e }
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == r2) goto L_0x0024
            goto L_0x0045
        L_0x0024:
            short r1 = r6.mo10989c()     // Catch:{ EndOfFileException -> 0x005e }
            r2 = 218(0xda, float:3.05E-43)
            if (r1 != r2) goto L_0x002d
            goto L_0x0045
        L_0x002d:
            r2 = 217(0xd9, float:3.04E-43)
            if (r1 != r2) goto L_0x0032
            goto L_0x0045
        L_0x0032:
            int r2 = r6.mo10987a()     // Catch:{ EndOfFileException -> 0x005e }
            int r2 = r2 + -2
            r3 = 225(0xe1, float:3.15E-43)
            if (r1 == r3) goto L_0x0046
            long r1 = (long) r2     // Catch:{ EndOfFileException -> 0x005e }
            long r3 = r6.skip(r1)     // Catch:{ EndOfFileException -> 0x005e }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x001b
        L_0x0045:
            r2 = -1
        L_0x0046:
            if (r2 != r0) goto L_0x0049
            return r0
        L_0x0049:
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r1 = r7.mo20074c(r2, r1)     // Catch:{ EndOfFileException -> 0x005e }
            byte[] r1 = (byte[]) r1     // Catch:{ EndOfFileException -> 0x005e }
            int r6 = m5690g(r6, r1, r2)     // Catch:{ all -> 0x0059 }
            r7.put(r1)     // Catch:{ EndOfFileException -> 0x005e }
            return r6
        L_0x0059:
            r6 = move-exception
            r7.put(r1)     // Catch:{ EndOfFileException -> 0x005e }
            throw r6     // Catch:{ EndOfFileException -> 0x005e }
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.m5688e(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader, e6.b):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType m5689f(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r7) throws java.io.IOException {
        /*
            int r0 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r7.mo10989c()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r7.mo10989c()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r7.skip(r0)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.mo10989c()     // Catch:{ EndOfFileException -> 0x0039 }
            r0 = 3
            if (r7 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x0039 }
        L_0x0038:
            return r7
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            r2 = 4
            if (r0 == r1) goto L_0x0099
            int r1 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r1 = r1 << 16
            int r4 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = r1 | r4
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r5 = 0
            if (r1 == r4) goto L_0x0055
            goto L_0x0091
        L_0x0055:
            int r1 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r1 = r1 << 16
            int r4 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            r1 = r1 | r4
            r4 = 1635150182(0x61766966, float:2.8409336E20)
            if (r1 == r4) goto L_0x0090
            r6 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 + -16
            int r1 = r0 % 4
            if (r1 == 0) goto L_0x0075
            goto L_0x0091
        L_0x0075:
            r1 = 0
        L_0x0076:
            r2 = 5
            if (r1 >= r2) goto L_0x0091
            if (r0 <= 0) goto L_0x0091
            int r2 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r2 = r2 << 16
            int r3 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            r2 = r2 | r3
            if (r2 == r4) goto L_0x0090
            if (r2 != r6) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            int r1 = r1 + 1
            int r0 = r0 + -4
            goto L_0x0076
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x0096
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF     // Catch:{ EndOfFileException -> 0x00fa }
            goto L_0x0098
        L_0x0096:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
        L_0x0098:
            return r7
        L_0x0099:
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.16888601E14)
            if (r0 == r1) goto L_0x00af
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00af:
            int r0 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.mo10987a()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r0 | r1
            r1 = r0 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto L_0x00c4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00c4:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto L_0x00e2
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.mo10989c()     // Catch:{ EndOfFileException -> 0x00fa }
            r0 = r7 & 2
            if (r0 == 0) goto L_0x00d8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00d8:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00df
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00df:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00e2:
            r1 = 76
            if (r0 != r1) goto L_0x00f7
            r7.skip(r2)     // Catch:{ EndOfFileException -> 0x00fa }
            short r7 = r7.mo10989c()     // Catch:{ EndOfFileException -> 0x00fa }
            r7 = r7 & 8
            if (r7 == 0) goto L_0x00f4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00fa }
            goto L_0x00f6
        L_0x00f4:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
        L_0x00f6:
            return r7
        L_0x00f7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00fa }
            return r7
        L_0x00fa:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.m5689f(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: g */
    public static int m5690g(Reader reader, byte[] bArr, int i) throws IOException {
        boolean z;
        ByteOrder byteOrder;
        boolean z2;
        int i2;
        short a;
        boolean z3;
        int i3;
        int i4;
        int i5;
        if (reader.mo10988b(i, bArr) != i) {
            return -1;
        }
        if (bArr == null || i <= f7143a.length) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i6 = 0;
            while (true) {
                byte[] bArr2 = f7143a;
                if (i6 >= bArr2.length) {
                    break;
                } else if (bArr[i6] != bArr2[i6]) {
                    z = false;
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (!z) {
            return -1;
        }
        C2190b bVar = new C2190b(bArr, i);
        short a2 = bVar.mo10991a(6);
        if (a2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a2 != 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.f7146a.order(byteOrder);
        if (bVar.f7146a.remaining() - 10 >= 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = bVar.f7146a.getInt(10);
        } else {
            i2 = -1;
        }
        int i7 = i2 + 6;
        short a3 = bVar.mo10991a(i7);
        for (int i8 = 0; i8 < a3; i8++) {
            int i9 = (i8 * 12) + i7 + 2;
            if (bVar.mo10991a(i9) == 274 && (a = bVar.mo10991a(i9 + 2)) >= 1 && a <= 12) {
                int i11 = i9 + 4;
                if (bVar.f7146a.remaining() - i11 >= 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i3 = bVar.f7146a.getInt(i11);
                } else {
                    i3 = -1;
                }
                if (i3 >= 0 && (i4 = i3 + f7144b[a]) <= 4 && (i5 = i9 + 8) >= 0 && i5 <= bVar.f7146a.remaining() && i4 >= 0 && i4 + i5 <= bVar.f7146a.remaining()) {
                    return bVar.mo10991a(i5);
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo10892a(InputStream inputStream, C4564b bVar) throws IOException {
        C17885a.m44458r(inputStream);
        C2191c cVar = new C2191c(inputStream);
        C17885a.m44458r(bVar);
        return m5688e(cVar, bVar);
    }

    /* renamed from: b */
    public final ImageHeaderParser.ImageType mo10893b(ByteBuffer byteBuffer) throws IOException {
        C17885a.m44458r(byteBuffer);
        return m5689f(new C2189a(byteBuffer));
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo10894c(InputStream inputStream) throws IOException {
        C17885a.m44458r(inputStream);
        return m5689f(new C2191c(inputStream));
    }

    /* renamed from: d */
    public final int mo10895d(ByteBuffer byteBuffer, C4564b bVar) throws IOException {
        C17885a.m44458r(byteBuffer);
        C2189a aVar = new C2189a(byteBuffer);
        C17885a.m44458r(bVar);
        return m5688e(aVar, bVar);
    }
}
