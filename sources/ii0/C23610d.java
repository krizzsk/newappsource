package ii0;

import hi0.C23521b0;
import hi0.C23533d0;
import hi0.C23556q;
import hi0.C23558r;
import hi0.C23562t;
import hi0.C23566v;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ni0.C24505a;
import okio.ByteString;
import p001a0.C0016g;
import p220q5.C6179a;
import p358af.C13437d;
import p988j$.util.DesugarTimeZone;
import si0.C24893c0;
import si0.C24898f;
import si0.C24902i;
import si0.C24913t;

/* renamed from: ii0.d */
public final class C23610d {

    /* renamed from: a */
    public static final byte[] f59684a;

    /* renamed from: b */
    public static final String[] f59685b = new String[0];

    /* renamed from: c */
    public static final C23556q f59686c = C23556q.m57709f(new String[0]);

    /* renamed from: d */
    public static final C23533d0 f59687d;

    /* renamed from: e */
    public static final C24913t f59688e = C24913t.m62554i(ByteString.m61903h("efbbbf"), ByteString.m61903h("feff"), ByteString.m61903h("fffe"), ByteString.m61903h("0000ffff"), ByteString.m61903h("ffff0000"));

    /* renamed from: f */
    public static final Charset f59689f = Charset.forName("UTF-32BE");

    /* renamed from: g */
    public static final Charset f59690g = Charset.forName("UTF-32LE");

    /* renamed from: h */
    public static final TimeZone f59691h = DesugarTimeZone.getTimeZone("GMT");

    /* renamed from: i */
    public static final C6179a f59692i = new C6179a(6);

    /* renamed from: j */
    public static final Method f59693j;

    /* renamed from: k */
    public static final Pattern f59694k = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        byte[] bArr = new byte[0];
        f59684a = bArr;
        C24898f fVar = new C24898f();
        fVar.mo61392T(0, 0, bArr);
        Method method = null;
        f59687d = new C23533d0((C23562t) null, (long) 0, fVar);
        C23521b0.m57646c((C23562t) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f59693j = method;
    }

    /* renamed from: a */
    public static Charset m57793a(C24902i iVar, Charset charset) throws IOException {
        int R0 = iVar.mo61389R0(f59688e);
        if (R0 == -1) {
            return charset;
        }
        if (R0 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (R0 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (R0 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (R0 == 3) {
            return f59689f;
        }
        if (R0 == 4) {
            return f59690g;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static String m57794b(String str) {
        InetAddress inetAddress;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m57799g(0, str.length(), str);
            } else {
                inetAddress = m57799g(1, str.length() - 1, str);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C24898f fVar = new C24898f();
                while (i < address.length) {
                    if (i == i2) {
                        fVar.mo61395V(58);
                        i += i4;
                        if (i == 16) {
                            fVar.mo61395V(58);
                        }
                    } else {
                        if (i > 0) {
                            fVar.mo61395V(58);
                        }
                        fVar.mo61399X((long) (((address[i] & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return fVar.mo61380H();
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError(C13437d.m33706k("Invalid IPv6 address: '", str, "'"));
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                int i7 = 0;
                while (true) {
                    if (i7 >= lowerCase.length()) {
                        z = false;
                        break;
                    }
                    char charAt = lowerCase.charAt(i7);
                    if (charAt <= 31) {
                        break;
                    } else if (charAt >= 127) {
                        break;
                    } else if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (z) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* renamed from: c */
    public static int m57795c(long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("timeout too large.");
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException("timeout too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: d */
    public static void m57796d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static void m57797e(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m57807o(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    public static int m57798f(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r7 == 16) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        if (r8 != -1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f5, code lost:
        throw new java.lang.AssertionError();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress m57799g(int r16, int r17, java.lang.String r18) {
        /*
            r0 = r17
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r7 = 0
            r8 = -1
            r9 = -1
            r6 = r16
        L_0x000f:
            r10 = 0
            if (r6 >= r0) goto L_0x00d5
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r0) goto L_0x0032
            java.lang.String r14 = "::"
            r15 = 2
            boolean r14 = r1.regionMatches(r6, r14, r5, r15)
            if (r14 == 0) goto L_0x0032
            if (r8 == r4) goto L_0x0028
            return r10
        L_0x0028:
            int r7 = r7 + 2
            r8 = r7
            if (r11 != r0) goto L_0x002f
            goto L_0x00d5
        L_0x002f:
            r9 = r11
            goto L_0x00a2
        L_0x0032:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r11 = ":"
            r14 = 1
            boolean r11 = r1.regionMatches(r6, r11, r5, r14)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = r1.regionMatches(r6, r11, r5, r14)
            if (r6 == 0) goto L_0x00a0
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r0) goto L_0x0094
            if (r11 != r2) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            if (r11 == r6) goto L_0x005e
            char r15 = r1.charAt(r9)
            r14 = 46
            if (r15 == r14) goto L_0x005c
            goto L_0x0097
        L_0x005c:
            int r9 = r9 + 1
        L_0x005e:
            r14 = r9
            r15 = 0
        L_0x0060:
            if (r14 >= r0) goto L_0x0082
            char r5 = r1.charAt(r14)
            r2 = 48
            if (r5 < r2) goto L_0x0082
            r4 = 57
            if (r5 <= r4) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            if (r15 != 0) goto L_0x0074
            if (r9 == r14) goto L_0x0074
            goto L_0x0097
        L_0x0074:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x007b
            goto L_0x0097
        L_0x007b:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0060
        L_0x0082:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            r14 = 1
            goto L_0x004c
        L_0x0094:
            int r6 = r6 + r13
            if (r11 == r6) goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 != 0) goto L_0x009d
            return r10
        L_0x009d:
            int r7 = r7 + 2
            goto L_0x00d5
        L_0x00a0:
            return r10
        L_0x00a1:
            r9 = r6
        L_0x00a2:
            r6 = r9
            r2 = 0
        L_0x00a4:
            if (r6 >= r0) goto L_0x00b8
            char r4 = r1.charAt(r6)
            int r4 = m57798f(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b8:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d4
            if (r4 <= r13) goto L_0x00bf
            goto L_0x00d4
        L_0x00bf:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d4:
            return r10
        L_0x00d5:
            r0 = 16
            if (r7 == r0) goto L_0x00eb
            r1 = -1
            if (r8 != r1) goto L_0x00dd
            return r10
        L_0x00dd:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00eb:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00f0 }
            return r0
        L_0x00f0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ii0.C23610d.m57799g(int, int, java.lang.String):java.net.InetAddress");
    }

    /* renamed from: h */
    public static int m57800h(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: i */
    public static int m57801i(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: j */
    public static String m57802j(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: k */
    public static String m57803k(C23558r rVar, boolean z) {
        String str;
        if (rVar.f59537d.contains(":")) {
            str = C0016g.m31o(C13555b.m33972k("["), rVar.f59537d, "]");
        } else {
            str = rVar.f59537d;
        }
        if (!z && rVar.f59538e == C23558r.m57724d(rVar.f59534a)) {
            return str;
        }
        StringBuilder t = C0016g.m36t(str, ":");
        t.append(rVar.f59538e);
        return t.toString();
    }

    /* renamed from: l */
    public static <T> List<T> m57804l(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    /* renamed from: m */
    public static <T> List<T> m57805m(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: n */
    public static String[] m57806n(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: o */
    public static boolean m57807o(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m57808p(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m57809q(C23558r rVar, C23558r rVar2) {
        if (!rVar.f59537d.equals(rVar2.f59537d) || rVar.f59538e != rVar2.f59538e || !rVar.f59534a.equals(rVar2.f59534a)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m57810r(C24893c0 c0Var, int i, TimeUnit timeUnit) throws IOException {
        long j;
        long nanoTime = System.nanoTime();
        if (c0Var.mo58974E().mo61371e()) {
            j = c0Var.mo58974E().mo61369c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        c0Var.mo58974E().mo61370d(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C24898f fVar = new C24898f();
            while (c0Var.mo53601m(fVar, 8192) != -1) {
                fVar.mo61413i();
            }
            if (j == Long.MAX_VALUE) {
                c0Var.mo58974E().mo61367a();
            } else {
                c0Var.mo58974E().mo61370d(nanoTime + j);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                c0Var.mo58974E().mo61367a();
            } else {
                c0Var.mo58974E().mo61370d(nanoTime + j);
            }
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                c0Var.mo58974E().mo61367a();
            } else {
                c0Var.mo58974E().mo61370d(nanoTime + j);
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static int m57811s(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: t */
    public static int m57812t(int i, int i2, String str) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static C23556q m57813u(ArrayList arrayList) {
        C23556q.C23557a aVar = new C23556q.C23557a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24505a aVar2 = (C24505a) it.next();
            C23566v.C23567a aVar3 = C23607a.f59680a;
            String t = aVar2.f62017a.mo60881t();
            String t2 = aVar2.f62018b.mo60881t();
            aVar3.getClass();
            aVar.mo58692c(t, t2);
        }
        return new C23556q(aVar);
    }

    /* renamed from: v */
    public static String m57814v(int i, int i2, String str) {
        int s = m57811s(i, i2, str);
        return str.substring(s, m57812t(s, i2, str));
    }
}
