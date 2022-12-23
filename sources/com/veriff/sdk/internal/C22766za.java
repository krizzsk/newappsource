package com.veriff.sdk.internal;

import com.appboy.support.ValidationUtils;
import com.veriff.sdk.internal.C22736yk;
import hd0.C23453m;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p001a0.C0016g;
import p304x.C7072l1;
import p358af.C13437d;
import p988j$.util.DesugarTimeZone;

/* renamed from: com.veriff.sdk.internal.za */
public final class C22766za {

    /* renamed from: a */
    public static final byte[] f57694a;

    /* renamed from: b */
    public static final String[] f57695b = new String[0];

    /* renamed from: c */
    public static final C22736yk f57696c = C22736yk.m55552a(new String[0]);

    /* renamed from: d */
    public static final C22759yv f57697d;

    /* renamed from: f */
    public static final TimeZone f57698f = DesugarTimeZone.getTimeZone("GMT");

    /* renamed from: g */
    public static final Comparator<String> f57699g = new C7072l1(9);

    /* renamed from: k */
    private static final Method f57700k;

    /* renamed from: l */
    private static final Pattern f57701l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        byte[] bArr = new byte[0];
        f57694a = bArr;
        Method method = null;
        f57697d = C22759yv.m55785a((C22742yn) null, bArr);
        C22754yt.m55736a((C22742yn) null, bArr);
        C21325abs.m50530a(abl.m50464c("efbbbf"), abl.m50464c("feff"), abl.m50464c("fffe"), abl.m50464c("0000ffff"), abl.m50464c("ffff0000"));
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f57700k = method;
    }

    /* renamed from: a */
    public static int m55815a(char c) {
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

    /* renamed from: a */
    public static void m55835a(Throwable th, Throwable th2) {
        Method method = f57700k;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m55847b(aca aca, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long d = aca.mo53672a().mo53961o_() ? aca.mo53672a().mo53958d() - nanoTime : Long.MAX_VALUE;
        aca.mo53672a().mo53956a(Math.min(d, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            abi abi = new abi();
            while (aca.mo53671a(abi, 8192) != -1) {
                abi.mo53920v();
            }
            if (d == Long.MAX_VALUE) {
                aca.mo53672a().mo53959f();
            } else {
                aca.mo53672a().mo53956a(nanoTime + d);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (d == Long.MAX_VALUE) {
                aca.mo53672a().mo53959f();
            } else {
                aca.mo53672a().mo53956a(nanoTime + d);
            }
            return false;
        } catch (Throwable th) {
            if (d == Long.MAX_VALUE) {
                aca.mo53672a().mo53959f();
            } else {
                aca.mo53672a().mo53956a(nanoTime + d);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static String m55849c(String str, int i, int i2) {
        int a = m55816a(str, i, i2);
        return str.substring(a, m55844b(str, a, i2));
    }

    /* renamed from: d */
    private static boolean m55852d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m55833a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static void m55834a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m55850c(String str) {
        return f57701l.matcher(str).matches();
    }

    /* renamed from: d */
    private static InetAddress m55851d(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, ":", 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m55840a(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int a = m55815a(str.charAt(i));
                    if (a == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + a;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                i3 = i9 + 1;
                bArr[i9] = (byte) (i7 & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            }
        }
        if (i3 != 16) {
            if (i4 == -1) {
                return null;
            }
            int i11 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, 16 - i11, i11);
            Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static void m55836a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m55839a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m55837a(aca aca, int i, TimeUnit timeUnit) {
        try {
            return m55847b(aca, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <T> List<T> m55828a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m55830a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> List<T> m55829a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: b */
    public static boolean m55848b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
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

    /* renamed from: a */
    public static ThreadFactory m55831a(String str, boolean z) {
        return new C23453m(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Thread m55826a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* renamed from: a */
    public static String[] m55841a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
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

    /* renamed from: b */
    public static int m55844b(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m55843b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static C22736yk m55845b(List<aag> list) {
        C22736yk.C22737a aVar = new C22736yk.C22737a();
        for (aag next : list) {
            C22763yy.f57691a.mo57372a(aVar, next.f53342g.mo53932a(), next.f53343h.mo53932a());
        }
        return aVar.mo57277a();
    }

    /* renamed from: a */
    public static String m55821a(C22738yl ylVar, boolean z) {
        String str;
        if (ylVar.mo57292f().contains(":")) {
            StringBuilder k = C13555b.m33972k("[");
            k.append(ylVar.mo57292f());
            k.append("]");
            str = k.toString();
        } else {
            str = ylVar.mo57292f();
        }
        if (!z && ylVar.mo57293g() == C22738yl.m55570a(ylVar.mo57284b())) {
            return str;
        }
        StringBuilder t = C0016g.m36t(str, ":");
        t.append(ylVar.mo57293g());
        return t.toString();
    }

    /* renamed from: a */
    public static boolean m55839a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static int m55820a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String[] m55842a(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: a */
    public static int m55816a(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m55818a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m55817a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static String m55822a(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m55851d(str, 0, str.length());
            } else {
                inetAddress = m55851d(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m55825a(address);
            }
            if (address.length == 4) {
                return inetAddress.getHostAddress();
            }
            throw new AssertionError(C13437d.m33706k("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m55852d(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m55824a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static int m55819a(String str, long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(C25541a.m63881k(str, " < 0"));
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(C25541a.m63881k(str, " too large."));
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(C25541a.m63881k(str, " too small."));
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    private static boolean m55840a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m55825a(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        abi abi = new abi();
        while (i < bArr.length) {
            if (i == i2) {
                abi.mo53899i(58);
                i += i4;
                if (i == 16) {
                    abi.mo53899i(58);
                }
            } else {
                if (i > 0) {
                    abi.mo53899i(58);
                }
                abi.mo53907l((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return abi.mo53914r();
    }

    /* renamed from: a */
    public static X509TrustManager m55832a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* renamed from: a */
    public static List<aag> m55827a(C22736yk ykVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ykVar.mo57265a(); i++) {
            arrayList.add(new aag(ykVar.mo57266a(i), ykVar.mo57269b(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m55823a(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static boolean m55838a(C22738yl ylVar, C22738yl ylVar2) {
        return ylVar.mo57292f().equals(ylVar2.mo57292f()) && ylVar.mo57293g() == ylVar2.mo57293g() && ylVar.mo57284b().equals(ylVar2.mo57284b());
    }
}
