package androidx.camera.core.impl.utils;

import androidx.camera.core.impl.utils.ExifData;
import com.appboy.support.ValidationUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import mf0.C24361g;
import p078f0.C4634a;
import p078f0.C4639e;
import p078f0.C4640f;
import p115i0.C5235k;

/* renamed from: androidx.camera.core.impl.utils.b */
public final class C0603b extends FilterOutputStream {

    /* renamed from: h */
    public static final byte[] f2054h = "Exif\u0000\u0000".getBytes(C4639e.f15860d);

    /* renamed from: b */
    public final ExifData f2055b;

    /* renamed from: c */
    public final byte[] f2056c = new byte[1];

    /* renamed from: d */
    public final ByteBuffer f2057d = ByteBuffer.allocate(4);

    /* renamed from: e */
    public int f2058e = 0;

    /* renamed from: f */
    public int f2059f;

    /* renamed from: g */
    public int f2060g;

    public C0603b(C5235k.C5236a aVar, ExifData exifData) {
        super(new BufferedOutputStream(aVar, SQLiteDatabase.OPEN_FULLMUTEX));
        this.f2055b = exifData;
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            int i3 = this.f2059f;
            if ((i3 > 0 || this.f2060g > 0 || this.f2058e != 2) && i2 > 0) {
                if (i3 > 0) {
                    int min = Math.min(i2, i3);
                    i2 -= min;
                    this.f2059f -= min;
                    i += min;
                }
                int i4 = this.f2060g;
                if (i4 > 0) {
                    int min2 = Math.min(i2, i4);
                    this.out.write(bArr, i, min2);
                    i2 -= min2;
                    this.f2060g -= min2;
                    i += min2;
                }
                if (i2 != 0) {
                    int i5 = this.f2058e;
                    boolean z = true;
                    int i6 = 4;
                    if (i5 == 0) {
                        int min3 = Math.min(i2, 2 - this.f2057d.position());
                        this.f2057d.put(bArr, i, min3);
                        i += min3;
                        i2 -= min3;
                        if (this.f2057d.position() >= 2) {
                            this.f2057d.rewind();
                            if (this.f2057d.getShort() == -40) {
                                this.out.write(this.f2057d.array(), 0, 2);
                                this.f2058e = 1;
                                this.f2057d.rewind();
                                C4634a aVar = new C4634a(this.out, ByteOrder.BIG_ENDIAN);
                                aVar.mo20157c(-31);
                                int[] iArr = new int[4];
                                int[] iArr2 = new int[4];
                                C4640f[] fVarArr = ExifData.f2038c;
                                int i7 = 0;
                                while (i7 < i6) {
                                    C4640f fVar = fVarArr[i7];
                                    int i8 = 0;
                                    while (true) {
                                        C4640f[] fVarArr2 = ExifData.f2038c;
                                        if (i8 >= i6) {
                                            break;
                                        }
                                        this.f2055b.mo2508a(i8).remove(fVar.f15867b);
                                        i8++;
                                        i6 = 4;
                                    }
                                    i7++;
                                    i6 = 4;
                                }
                                if (!this.f2055b.mo2508a(1).isEmpty()) {
                                    this.f2055b.mo2508a(0).put(ExifData.f2038c[1].f15867b, C4639e.m11956a(0, this.f2055b.f2042b));
                                }
                                if (!this.f2055b.mo2508a(2).isEmpty()) {
                                    this.f2055b.mo2508a(0).put(ExifData.f2038c[2].f15867b, C4639e.m11956a(0, this.f2055b.f2042b));
                                }
                                if (!this.f2055b.mo2508a(3).isEmpty()) {
                                    this.f2055b.mo2508a(1).put(ExifData.f2038c[3].f15867b, C4639e.m11956a(0, this.f2055b.f2042b));
                                }
                                int i9 = 0;
                                while (true) {
                                    C4640f[] fVarArr3 = ExifData.f2038c;
                                    if (i9 >= 4) {
                                        break;
                                    }
                                    int i11 = 0;
                                    for (Map.Entry<String, C4639e> value : this.f2055b.mo2508a(i9).entrySet()) {
                                        C4639e eVar = (C4639e) value.getValue();
                                        int i12 = C4639e.f15862f[eVar.f15863a] * eVar.f15864b;
                                        if (i12 > 4) {
                                            i11 += i12;
                                        }
                                    }
                                    iArr2[i9] = iArr2[i9] + i11;
                                    i9++;
                                }
                                int i13 = 8;
                                int i14 = 0;
                                while (true) {
                                    C4640f[] fVarArr4 = ExifData.f2038c;
                                    if (i14 >= 4) {
                                        break;
                                    }
                                    if (!this.f2055b.mo2508a(i14).isEmpty()) {
                                        iArr[i14] = i13;
                                        i13 = (this.f2055b.mo2508a(i14).size() * 12) + 2 + 4 + iArr2[i14] + i13;
                                    }
                                    i14++;
                                }
                                int i15 = i13 + 8;
                                if (!this.f2055b.mo2508a(1).isEmpty()) {
                                    this.f2055b.mo2508a(0).put(ExifData.f2038c[1].f15867b, C4639e.m11956a((long) iArr[1], this.f2055b.f2042b));
                                }
                                if (!this.f2055b.mo2508a(2).isEmpty()) {
                                    this.f2055b.mo2508a(0).put(ExifData.f2038c[2].f15867b, C4639e.m11956a((long) iArr[2], this.f2055b.f2042b));
                                }
                                if (!this.f2055b.mo2508a(3).isEmpty()) {
                                    this.f2055b.mo2508a(1).put(ExifData.f2038c[3].f15867b, C4639e.m11956a((long) iArr[3], this.f2055b.f2042b));
                                }
                                aVar.mo20157c((short) i15);
                                aVar.write(f2054h);
                                aVar.mo20157c(this.f2055b.f2042b == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
                                aVar.f15858c = this.f2055b.f2042b;
                                aVar.mo20157c((short) 42);
                                aVar.mo20156a((int) 8);
                                int i16 = 0;
                                while (true) {
                                    C4640f[] fVarArr5 = ExifData.f2038c;
                                    if (i16 >= 4) {
                                        break;
                                    }
                                    if (!this.f2055b.mo2508a(i16).isEmpty()) {
                                        aVar.mo20157c((short) this.f2055b.mo2508a(i16).size());
                                        int size = (this.f2055b.mo2508a(i16).size() * 12) + iArr[i16] + 2 + 4;
                                        for (Map.Entry next : this.f2055b.mo2508a(i16).entrySet()) {
                                            C4640f fVar2 = (C4640f) ((HashMap) ExifData.C0599b.f2048f.get(i16)).get(next.getKey());
                                            StringBuilder k = C13555b.m33972k("Tag not supported: ");
                                            k.append((String) next.getKey());
                                            k.append(". Tag needs to be ported from ExifInterface to ExifData.");
                                            C24361g.m61185s(fVar2, k.toString());
                                            int i17 = fVar2.f15866a;
                                            C4639e eVar2 = (C4639e) next.getValue();
                                            int i18 = C4639e.f15862f[eVar2.f15863a] * eVar2.f15864b;
                                            aVar.mo20157c((short) i17);
                                            aVar.mo20157c((short) eVar2.f15863a);
                                            aVar.mo20156a(eVar2.f15864b);
                                            if (i18 > 4) {
                                                aVar.mo20156a((int) ((long) size));
                                                size += i18;
                                            } else {
                                                aVar.write(eVar2.f15865c);
                                                if (i18 < 4) {
                                                    for (int i19 = 4; i18 < i19; i19 = 4) {
                                                        aVar.f15857b.write(0);
                                                        i18++;
                                                    }
                                                }
                                            }
                                        }
                                        aVar.mo20156a((int) 0);
                                        for (Map.Entry<String, C4639e> value2 : this.f2055b.mo2508a(i16).entrySet()) {
                                            byte[] bArr2 = ((C4639e) value2.getValue()).f15865c;
                                            if (bArr2.length > 4) {
                                                aVar.write(bArr2, 0, bArr2.length);
                                            }
                                        }
                                    }
                                    i16++;
                                }
                                aVar.f15858c = ByteOrder.BIG_ENDIAN;
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    } else if (i5 != 1) {
                        continue;
                    } else {
                        int min4 = Math.min(i2, 4 - this.f2057d.position());
                        this.f2057d.put(bArr, i, min4);
                        i += min4;
                        i2 -= min4;
                        if (this.f2057d.position() == 2 && this.f2057d.getShort() == -39) {
                            this.out.write(this.f2057d.array(), 0, 2);
                            this.f2057d.rewind();
                        }
                        if (this.f2057d.position() >= 4) {
                            this.f2057d.rewind();
                            short s = this.f2057d.getShort();
                            if (s == -31) {
                                this.f2059f = (this.f2057d.getShort() & 65535) - 2;
                                this.f2058e = 2;
                            } else {
                                if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                                    z = false;
                                }
                                if (!z) {
                                    this.out.write(this.f2057d.array(), 0, 4);
                                    this.f2060g = (this.f2057d.getShort() & 65535) - 2;
                                } else {
                                    this.out.write(this.f2057d.array(), 0, 4);
                                    this.f2058e = 2;
                                }
                            }
                            this.f2057d.rewind();
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (i2 > 0) {
            this.out.write(bArr, i, i2);
        }
    }

    public final void write(int i) throws IOException {
        byte[] bArr = this.f2056c;
        bArr[0] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        write(bArr);
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
