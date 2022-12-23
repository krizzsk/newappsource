package okio;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.play.core.appupdate.C14226d;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import mf0.C24362h;
import p584jl.C17885a;
import si0.C24886a;
import si0.C24898f;
import uh0.C25072a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo59060d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lbf0/d;", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "data", "[B", "j", "()[B", "a", "okio"}, mo59061k = 1, mo59062mv = {1, 4, 1})
public class ByteString implements Serializable, Comparable<ByteString> {

    /* renamed from: d */
    public static final ByteString f62330d = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public transient int f62331b;

    /* renamed from: c */
    public transient String f62332c;
    private final byte[] data;

    /* renamed from: okio.ByteString$a */
    public static final class C24633a {
        /* renamed from: a */
        public static ByteString m61918a(String str) {
            C24362h.m61211f(str, "$this$encodeUtf8");
            byte[] bytes = str.getBytes(C25072a.f63272a);
            C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.f62332c = str;
            return byteString;
        }
    }

    public ByteString(byte[] bArr) {
        C24362h.m61211f(bArr, "data");
        this.data = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r5 = r0 - 1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final okio.ByteString m61902g(java.lang.String r15) {
        /*
            java.lang.String r0 = "$this$decodeBase64"
            mf0.C24362h.m61211f(r15, r0)
            byte[] r0 = si0.C24886a.f62930a
            int r0 = r15.length()
        L_0x000b:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L_0x002a
            int r5 = r0 + -1
            char r6 = r15.charAt(r5)
            r7 = 61
            if (r6 == r7) goto L_0x0028
            if (r6 == r4) goto L_0x0028
            if (r6 == r3) goto L_0x0028
            if (r6 == r2) goto L_0x0028
            if (r6 == r1) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = r5
            goto L_0x000b
        L_0x002a:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0039:
            r11 = 0
            if (r7 >= r0) goto L_0x00a4
            char r12 = r15.charAt(r7)
            r13 = 90
            r14 = 65
            if (r14 <= r12) goto L_0x0047
            goto L_0x004c
        L_0x0047:
            if (r13 < r12) goto L_0x004c
            int r12 = r12 + -65
            goto L_0x0084
        L_0x004c:
            r13 = 122(0x7a, float:1.71E-43)
            r14 = 97
            if (r14 <= r12) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            if (r13 < r12) goto L_0x0058
            int r12 = r12 + -71
            goto L_0x0084
        L_0x0058:
            r13 = 57
            r14 = 48
            if (r14 <= r12) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            if (r13 < r12) goto L_0x0064
            int r12 = r12 + 4
            goto L_0x0084
        L_0x0064:
            r13 = 43
            if (r12 == r13) goto L_0x0082
            r13 = 45
            if (r12 != r13) goto L_0x006d
            goto L_0x0082
        L_0x006d:
            r13 = 47
            if (r12 == r13) goto L_0x007f
            r13 = 95
            if (r12 != r13) goto L_0x0076
            goto L_0x007f
        L_0x0076:
            if (r12 == r4) goto L_0x00a1
            if (r12 == r3) goto L_0x00a1
            if (r12 == r2) goto L_0x00a1
            if (r12 != r1) goto L_0x00d8
            goto L_0x00a1
        L_0x007f:
            r12 = 63
            goto L_0x0084
        L_0x0082:
            r12 = 62
        L_0x0084:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r8 = r8 + 1
            int r11 = r8 % 4
            if (r11 != 0) goto L_0x00a1
            int r11 = r10 + 1
            int r12 = r9 >> 16
            byte r12 = (byte) r12
            r5[r10] = r12
            int r10 = r11 + 1
            int r12 = r9 >> 8
            byte r12 = (byte) r12
            r5[r11] = r12
            int r11 = r10 + 1
            byte r12 = (byte) r9
            r5[r10] = r12
            r10 = r11
        L_0x00a1:
            int r7 = r7 + 1
            goto L_0x0039
        L_0x00a4:
            int r8 = r8 % 4
            r15 = 1
            if (r8 == r15) goto L_0x00d8
            r15 = 2
            if (r8 == r15) goto L_0x00c1
            r15 = 3
            if (r8 == r15) goto L_0x00b0
            goto L_0x00cb
        L_0x00b0:
            int r15 = r9 << 6
            int r0 = r10 + 1
            int r1 = r15 >> 16
            byte r1 = (byte) r1
            r5[r10] = r1
            int r10 = r0 + 1
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r5[r0] = r15
            goto L_0x00cb
        L_0x00c1:
            int r15 = r9 << 12
            int r0 = r10 + 1
            int r15 = r15 >> 16
            byte r15 = (byte) r15
            r5[r10] = r15
            r10 = r0
        L_0x00cb:
            if (r10 != r6) goto L_0x00ce
            goto L_0x00d9
        L_0x00ce:
            byte[] r5 = java.util.Arrays.copyOf(r5, r10)
            java.lang.String r15 = "java.util.Arrays.copyOf(this, newSize)"
            mf0.C24362h.m61210e(r5, r15)
            goto L_0x00d9
        L_0x00d8:
            r5 = r11
        L_0x00d9:
            if (r5 == 0) goto L_0x00e0
            okio.ByteString r11 = new okio.ByteString
            r11.<init>(r5)
        L_0x00e0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.m61902g(java.lang.String):okio.ByteString");
    }

    /* renamed from: h */
    public static final ByteString m61903h(String str) {
        boolean z;
        if (str.length() % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (C14226d.m35349o0(str.charAt(i2 + 1)) + (C14226d.m35349o0(str.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException(C25541a.m63881k("Unexpected hex string: ", str).toString());
    }

    /* renamed from: o */
    public static final ByteString m61904o(byte... bArr) {
        C24362h.m61211f(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C24362h.m61210e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        boolean z;
        int readInt = objectInputStream.readInt();
        int i = 0;
        if (readInt >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = new byte[readInt];
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            ByteString byteString = new ByteString(bArr);
            Field declaredField = ByteString.class.getDeclaredField("data");
            C24362h.m61210e(declaredField, "field");
            declaredField.setAccessible(true);
            declaredField.set(this, byteString.data);
            return;
        }
        throw new IllegalArgumentException(C16759e.m42349e("byteCount < 0: ", readInt).toString());
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            okio.ByteString r8 = (okio.ByteString) r8
            java.lang.String r0 = "other"
            mf0.C24362h.m61211f(r8, r0)
            int r0 = r7.mo60873k()
            int r1 = r8.mo60873k()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0015:
            if (r4 >= r2) goto L_0x002b
            byte r5 = r7.mo60876n(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.mo60876n(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0028:
            if (r5 >= r6) goto L_0x0032
            goto L_0x0030
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            if (r0 >= r1) goto L_0x0032
        L_0x0030:
            r3 = -1
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int k = byteString.mo60873k();
            byte[] bArr = this.data;
            if (k != bArr.length || !byteString.mo60877p(0, 0, bArr.length, bArr)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo60869f() {
        byte[] bArr = this.data;
        byte[] bArr2 = C24886a.f62930a;
        C24362h.m61211f(bArr, "$this$encodeBase64");
        C24362h.m61211f(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i11 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i11] = b5;
            bArr3[i11 + 1] = b5;
        } else if (length2 == 2) {
            int i12 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i12];
            int i13 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i14] = bArr2[(b7 & 15) << 2];
            bArr3[i14 + 1] = (byte) 61;
        }
        return new String(bArr3, C25072a.f63272a);
    }

    public int hashCode() {
        int i = this.f62331b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.f62331b = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public ByteString mo60871i(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(this.data, 0, mo60873k());
        byte[] digest = instance.digest();
        C24362h.m61210e(digest, "digestBytes");
        return new ByteString(digest);
    }

    /* renamed from: j */
    public final byte[] mo60872j() {
        return this.data;
    }

    /* renamed from: k */
    public int mo60873k() {
        return this.data.length;
    }

    /* renamed from: l */
    public String mo60874l() {
        byte[] bArr = this.data;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = C14226d.f35757l;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: m */
    public byte[] mo60875m() {
        return this.data;
    }

    /* renamed from: n */
    public byte mo60876n(int i) {
        return this.data[i];
    }

    /* renamed from: p */
    public boolean mo60877p(int i, int i2, int i3, byte[] bArr) {
        C24362h.m61211f(bArr, InneractiveMediationNameConsts.OTHER);
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3 || !C17885a.m44447l(i, bArr2, i2, bArr, i3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo60878q(ByteString byteString, int i) {
        C24362h.m61211f(byteString, InneractiveMediationNameConsts.OTHER);
        return byteString.mo60877p(0, 0, i, this.data);
    }

    /* renamed from: r */
    public ByteString mo60879r() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                C24362h.m61210e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
    }

    /* renamed from: s */
    public byte[] mo60880s() {
        byte[] bArr = this.data;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C24362h.m61210e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: t */
    public final String mo60881t() {
        String str = this.f62332c;
        if (str != null) {
            return str;
        }
        byte[] m = mo60875m();
        C24362h.m61211f(m, "$this$toUtf8String");
        String str2 = new String(m, C25072a.f63272a);
        this.f62332c = str2;
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x011b, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x015b, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x016c, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x017d, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x018c, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01a2, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01aa, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01b1, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01e8, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01eb, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0086, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0095, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a0, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e0, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00f1, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0100, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0112, code lost:
        if (r4 == 64) goto L_0x01ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            byte[] r1 = r0.data
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x02ba
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0014:
            r6 = 64
            if (r3 >= r2) goto L_0x01ec
            byte r7 = r1[r3]
            r8 = 13
            r9 = 10
            r10 = 31
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 159(0x9f, float:2.23E-43)
            r13 = 65533(0xfffd, float:9.1831E-41)
            r14 = 65536(0x10000, float:9.18355E-41)
            if (r7 < 0) goto L_0x007b
            int r15 = r4 + 1
            if (r4 != r6) goto L_0x0031
            goto L_0x01ec
        L_0x0031:
            if (r7 == r9) goto L_0x0043
            if (r7 == r8) goto L_0x0043
            if (r7 < 0) goto L_0x0039
            if (r10 >= r7) goto L_0x003e
        L_0x0039:
            if (r11 <= r7) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            if (r12 < r7) goto L_0x0040
        L_0x003e:
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 != 0) goto L_0x01eb
        L_0x0043:
            if (r7 != r13) goto L_0x0047
            goto L_0x01eb
        L_0x0047:
            if (r7 >= r14) goto L_0x004b
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r4 = 2
        L_0x004c:
            int r5 = r5 + r4
            int r3 = r3 + 1
        L_0x004f:
            r4 = r15
            if (r3 >= r2) goto L_0x0014
            byte r7 = r1[r3]
            if (r7 < 0) goto L_0x0014
            int r3 = r3 + 1
            int r15 = r4 + 1
            if (r4 != r6) goto L_0x005e
            goto L_0x01ec
        L_0x005e:
            if (r7 == r9) goto L_0x0070
            if (r7 == r8) goto L_0x0070
            if (r7 < 0) goto L_0x0066
            if (r10 >= r7) goto L_0x006b
        L_0x0066:
            if (r11 <= r7) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            if (r12 < r7) goto L_0x006d
        L_0x006b:
            r4 = 1
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r4 != 0) goto L_0x01eb
        L_0x0070:
            if (r7 != r13) goto L_0x0074
            goto L_0x01eb
        L_0x0074:
            if (r7 >= r14) goto L_0x0078
            r4 = 1
            goto L_0x0079
        L_0x0078:
            r4 = 2
        L_0x0079:
            int r5 = r5 + r4
            goto L_0x004f
        L_0x007b:
            int r13 = r7 >> 5
            r14 = -2
            r15 = 128(0x80, float:1.794E-43)
            if (r13 != r14) goto L_0x00d2
            int r13 = r3 + 1
            if (r2 > r13) goto L_0x008a
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x008a:
            byte r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x0092
            r14 = 1
            goto L_0x0093
        L_0x0092:
            r14 = 0
        L_0x0093:
            if (r14 != 0) goto L_0x0099
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x0099:
            r13 = r13 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r7 = r7 ^ r13
            if (r7 >= r15) goto L_0x00a4
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x00a4:
            int r13 = r4 + 1
            if (r4 != r6) goto L_0x00aa
            goto L_0x01ec
        L_0x00aa:
            if (r7 == r9) goto L_0x00bc
            if (r7 == r8) goto L_0x00bc
            if (r7 < 0) goto L_0x00b2
            if (r10 >= r7) goto L_0x00b7
        L_0x00b2:
            if (r11 <= r7) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            if (r12 < r7) goto L_0x00b9
        L_0x00b7:
            r4 = 1
            goto L_0x00ba
        L_0x00b9:
            r4 = 0
        L_0x00ba:
            if (r4 != 0) goto L_0x01eb
        L_0x00bc:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x00c3
            goto L_0x01eb
        L_0x00c3:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x00c9
            r15 = 1
            goto L_0x00ca
        L_0x00c9:
            r15 = 2
        L_0x00ca:
            int r5 = r5 + r15
            bf0.d r4 = bf0.C21050d.f52856a
            int r3 = r3 + 2
            r4 = r13
            goto L_0x0014
        L_0x00d2:
            int r10 = r7 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r10 != r14) goto L_0x0153
            int r10 = r3 + 2
            if (r2 > r10) goto L_0x00e4
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x00e4:
            int r13 = r3 + 1
            byte r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x00ee
            r14 = 1
            goto L_0x00ef
        L_0x00ee:
            r14 = 0
        L_0x00ef:
            if (r14 != 0) goto L_0x00f5
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x00f5:
            byte r10 = r1[r10]
            r14 = r10 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x00fd
            r14 = 1
            goto L_0x00fe
        L_0x00fd:
            r14 = 0
        L_0x00fe:
            if (r14 != 0) goto L_0x0104
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x0104:
            r14 = -123008(0xfffffffffffe1f80, float:NaN)
            r10 = r10 ^ r14
            int r13 = r13 << 6
            r10 = r10 ^ r13
            int r7 = r7 << 12
            r7 = r7 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L_0x0116
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x0116:
            if (r11 <= r7) goto L_0x0119
            goto L_0x011f
        L_0x0119:
            if (r12 < r7) goto L_0x011f
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x011f:
            int r10 = r4 + 1
            if (r4 != r6) goto L_0x0125
            goto L_0x01ec
        L_0x0125:
            if (r7 == r9) goto L_0x013d
            if (r7 == r8) goto L_0x013d
            if (r7 < 0) goto L_0x012f
            r4 = 31
            if (r4 >= r7) goto L_0x0138
        L_0x012f:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x0134
            goto L_0x013a
        L_0x0134:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x013a
        L_0x0138:
            r4 = 1
            goto L_0x013b
        L_0x013a:
            r4 = 0
        L_0x013b:
            if (r4 != 0) goto L_0x01eb
        L_0x013d:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x0144
            goto L_0x01eb
        L_0x0144:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x014a
            r15 = 1
            goto L_0x014b
        L_0x014a:
            r15 = 2
        L_0x014b:
            int r5 = r5 + r15
            bf0.d r4 = bf0.C21050d.f52856a
            int r3 = r3 + 3
            r4 = r10
            goto L_0x0014
        L_0x0153:
            int r8 = r7 >> 3
            if (r8 != r14) goto L_0x01e8
            int r8 = r3 + 3
            if (r2 > r8) goto L_0x015f
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x015f:
            int r10 = r3 + 1
            byte r10 = r1[r10]
            r13 = r10 & 192(0xc0, float:2.69E-43)
            if (r13 != r15) goto L_0x0169
            r13 = 1
            goto L_0x016a
        L_0x0169:
            r13 = 0
        L_0x016a:
            if (r13 != 0) goto L_0x0170
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x0170:
            int r13 = r3 + 2
            byte r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x017a
            r14 = 1
            goto L_0x017b
        L_0x017a:
            r14 = 0
        L_0x017b:
            if (r14 != 0) goto L_0x0181
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x0181:
            byte r8 = r1[r8]
            r14 = r8 & 192(0xc0, float:2.69E-43)
            if (r14 != r15) goto L_0x0189
            r14 = 1
            goto L_0x018a
        L_0x0189:
            r14 = 0
        L_0x018a:
            if (r14 != 0) goto L_0x0190
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x0190:
            r14 = 3678080(0x381f80, float:5.154088E-39)
            r8 = r8 ^ r14
            int r13 = r13 << 6
            r8 = r8 ^ r13
            int r10 = r10 << 12
            r8 = r8 ^ r10
            int r7 = r7 << 18
            r7 = r7 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r8) goto L_0x01a5
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x01a5:
            if (r11 <= r7) goto L_0x01a8
            goto L_0x01ad
        L_0x01a8:
            if (r12 < r7) goto L_0x01ad
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x01ad:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r8) goto L_0x01b4
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x01b4:
            int r8 = r4 + 1
            if (r4 != r6) goto L_0x01b9
            goto L_0x01ec
        L_0x01b9:
            if (r7 == r9) goto L_0x01d3
            r4 = 13
            if (r7 == r4) goto L_0x01d3
            if (r7 < 0) goto L_0x01c5
            r4 = 31
            if (r4 >= r7) goto L_0x01ce
        L_0x01c5:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x01ca
            goto L_0x01d0
        L_0x01ca:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x01d0
        L_0x01ce:
            r4 = 1
            goto L_0x01d1
        L_0x01d0:
            r4 = 0
        L_0x01d1:
            if (r4 != 0) goto L_0x01eb
        L_0x01d3:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x01d9
            goto L_0x01eb
        L_0x01d9:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x01df
            r15 = 1
            goto L_0x01e0
        L_0x01df:
            r15 = 2
        L_0x01e0:
            int r5 = r5 + r15
            bf0.d r4 = bf0.C21050d.f52856a
            int r3 = r3 + 4
            r4 = r8
            goto L_0x0014
        L_0x01e8:
            if (r4 != r6) goto L_0x01eb
            goto L_0x01ec
        L_0x01eb:
            r5 = -1
        L_0x01ec:
            java.lang.String r1 = "…]"
            r2 = 93
            java.lang.String r3 = "[size="
            r4 = -1
            if (r5 != r4) goto L_0x0260
            byte[] r4 = r0.data
            int r4 = r4.length
            if (r4 > r6) goto L_0x0210
            java.lang.String r1 = "[hex="
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r3 = r16.mo60874l()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x02ba
        L_0x0210:
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r3)
            byte[] r3 = r0.data
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " hex="
            r2.append(r3)
            byte[] r3 = r0.data
            int r4 = r3.length
            if (r6 > r4) goto L_0x0226
            r4 = 1
            goto L_0x0227
        L_0x0226:
            r4 = 0
        L_0x0227:
            if (r4 == 0) goto L_0x0247
            int r4 = r3.length
            if (r6 != r4) goto L_0x022e
            r4 = r0
            goto L_0x0238
        L_0x022e:
            okio.ByteString r4 = new okio.ByteString
            r5 = 0
            byte[] r3 = cf0.C21132f.m49432O0(r5, r6, r3)
            r4.<init>(r3)
        L_0x0238:
            java.lang.String r3 = r4.mo60874l()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02ba
        L_0x0247:
            java.lang.String r1 = "endIndex > length("
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            byte[] r2 = r0.data
            int r2 = r2.length
            r3 = 41
            java.lang.String r1 = p379.C16530d.m42014g(r1, r2, r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0260:
            java.lang.String r4 = r16.mo60881t()
            r6 = 0
            java.lang.String r7 = r4.substring(r6, r5)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            mf0.C24362h.m61210e(r7, r8)
            java.lang.String r8 = "\\"
            java.lang.String r9 = "\\\\"
            java.lang.String r7 = uh0.C25081h.m62833D(r7, r8, r9, r6)
            java.lang.String r8 = "\n"
            java.lang.String r9 = "\\n"
            java.lang.String r7 = uh0.C25081h.m62833D(r7, r8, r9, r6)
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r6 = uh0.C25081h.m62833D(r7, r8, r9, r6)
            int r4 = r4.length()
            if (r5 >= r4) goto L_0x02a6
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r3)
            byte[] r3 = r0.data
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " text="
            r2.append(r3)
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02ba
        L_0x02a6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "[text="
            r1.append(r3)
            r1.append(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x02ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.toString():java.lang.String");
    }

    /* renamed from: u */
    public void mo60883u(C24898f fVar, int i) {
        C24362h.m61211f(fVar, "buffer");
        fVar.mo61392T(0, i, this.data);
    }
}
