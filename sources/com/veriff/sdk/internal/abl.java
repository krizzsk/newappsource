package com.veriff.sdk.internal;

import com.appsflyer.share.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p001a0.C0016g;
import p358af.C13437d;

public class abl implements Serializable, Comparable<abl> {

    /* renamed from: a */
    public static final char[] f53558a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final abl f53559b = m50462a(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: c */
    public final byte[] f53560c;

    /* renamed from: d */
    public transient int f53561d;

    /* renamed from: e */
    public transient String f53562e;

    public abl(byte[] bArr) {
        this.f53560c = bArr;
    }

    /* renamed from: a */
    public static abl m50462a(byte... bArr) {
        if (bArr != null) {
            return new abl((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        abl a = m50460a((InputStream) objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = abl.class.getDeclaredField(Constants.URL_CAMPAIGN);
            declaredField.setAccessible(true);
            declaredField.set(this, a.f53560c);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f53560c.length);
        objectOutputStream.write(this.f53560c);
    }

    /* renamed from: b */
    public String mo53938b() {
        return abh.m50336a(this.f53560c);
    }

    /* renamed from: c */
    public abl mo53939c() {
        return m50465d("MD5");
    }

    /* renamed from: d */
    public abl mo53941d() {
        return m50465d("SHA-1");
    }

    /* renamed from: e */
    public abl mo53942e() {
        return m50465d("SHA-256");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abl) {
            abl abl = (abl) obj;
            int h = abl.mo53946h();
            byte[] bArr = this.f53560c;
            if (h != bArr.length || !abl.mo53935a(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo53944f() {
        byte[] bArr = this.f53560c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f53558a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: g */
    public abl mo53945g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f53560c;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new abl(bArr2);
            }
        }
    }

    /* renamed from: h */
    public int mo53946h() {
        return this.f53560c.length;
    }

    public int hashCode() {
        int i = this.f53561d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f53560c);
        this.f53561d = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public byte[] mo53948i() {
        return (byte[]) this.f53560c.clone();
    }

    /* renamed from: j */
    public byte[] mo53949j() {
        return this.f53560c;
    }

    public String toString() {
        if (this.f53560c.length == 0) {
            return "[size=0]";
        }
        String a = mo53932a();
        int a2 = m50459a(a, 64);
        if (a2 != -1) {
            String replace = a.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (a2 >= a.length()) {
                return C13437d.m33706k("[text=", replace, "]");
            }
            StringBuilder k = C13555b.m33972k("[size=");
            k.append(this.f53560c.length);
            k.append(" text=");
            k.append(replace);
            k.append("…]");
            return k.toString();
        } else if (this.f53560c.length <= 64) {
            StringBuilder k2 = C13555b.m33972k("[hex=");
            k2.append(mo53944f());
            k2.append("]");
            return k2.toString();
        } else {
            StringBuilder k3 = C13555b.m33972k("[size=");
            k3.append(this.f53560c.length);
            k3.append(" hex=");
            k3.append(mo53931a(0, 64).mo53944f());
            k3.append("…]");
            return k3.toString();
        }
    }

    /* renamed from: b */
    public static abl m50463b(String str) {
        if (str != null) {
            byte[] a = abh.m50338a(str);
            if (a != null) {
                return new abl(a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: c */
    public static abl m50464c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m50458a(str.charAt(i2)) << 4) + m50458a(str.charAt(i2 + 1)));
            }
            return m50462a(bArr);
        } else {
            throw new IllegalArgumentException(C25541a.m63881k("Unexpected hex string: ", str));
        }
    }

    /* renamed from: d */
    private abl m50465d(String str) {
        try {
            return m50462a(MessageDigest.getInstance(str).digest(this.f53560c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static abl m50461a(String str) {
        if (str != null) {
            abl abl = new abl(str.getBytes(acc.f53612a));
            abl.f53562e = str;
            return abl;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: b */
    public int compareTo(abl abl) {
        int h = mo53946h();
        int h2 = abl.mo53946h();
        int min = Math.min(h, h2);
        int i = 0;
        while (i < min) {
            byte a = mo53930a(i) & 255;
            byte a2 = abl.mo53930a(i) & 255;
            if (a == a2) {
                i++;
            } else if (a < a2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (h == h2) {
            return 0;
        }
        if (h < h2) {
            return -1;
        }
        return 1;
    }

    /* renamed from: a */
    public String mo53932a() {
        String str = this.f53562e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f53560c, acc.f53612a);
        this.f53562e = str2;
        return str2;
    }

    /* renamed from: a */
    private static int m50458a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException(C0016g.m28k("Unexpected hex digit: ", c));
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static abl m50460a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new abl(bArr);
        } else {
            throw new IllegalArgumentException(C16759e.m42349e("byteCount < 0: ", i));
        }
    }

    /* renamed from: a */
    public abl mo53931a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f53560c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    return new abl(bArr2);
                }
            } else {
                throw new IllegalArgumentException(C13437d.m33707l(C13555b.m33972k("endIndex > length("), this.f53560c.length, ")"));
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public byte mo53930a(int i) {
        return this.f53560c[i];
    }

    /* renamed from: a */
    public void mo53933a(abi abi) {
        byte[] bArr = this.f53560c;
        abi.mo53878c(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo53934a(int i, abl abl, int i2, int i3) {
        return abl.mo53935a(i2, this.f53560c, i, i3);
    }

    /* renamed from: a */
    public boolean mo53935a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f53560c;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && acc.m50629a(bArr2, i, bArr, i2, i3);
        }
    }

    /* renamed from: a */
    public final boolean mo53936a(abl abl) {
        return mo53934a(0, abl, 0, abl.mo53946h());
    }

    /* renamed from: a */
    public static int m50459a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
