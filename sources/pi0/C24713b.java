package pi0;

import android.os.Build;
import android.util.Log;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import ii0.C23610d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import ri0.C24830b;
import ri0.C24831c;
import ri0.C24833e;

/* renamed from: pi0.b */
public class C24713b extends C24721f {

    /* renamed from: c */
    public final Class<?> f62561c;

    /* renamed from: d */
    public final Method f62562d;

    /* renamed from: e */
    public final Method f62563e;

    /* renamed from: f */
    public final Method f62564f;

    /* renamed from: g */
    public final Method f62565g;

    /* renamed from: h */
    public final C24715b f62566h;

    /* renamed from: pi0.b$a */
    public static final class C24714a extends C24831c {

        /* renamed from: a */
        public final Object f62567a;

        /* renamed from: b */
        public final Method f62568b;

        public C24714a(Object obj, Method method) {
            this.f62567a = obj;
            this.f62568b = method;
        }

        /* renamed from: a */
        public final List mo61204a(String str, List list) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f62568b.invoke(this.f62567a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), KeyProvider18.KEY_ALGORITHM_RSA, str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof C24714a;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* renamed from: pi0.b$b */
    public static final class C24715b {

        /* renamed from: a */
        public final Method f62569a;

        /* renamed from: b */
        public final Method f62570b;

        /* renamed from: c */
        public final Method f62571c;

        public C24715b(Method method, Method method2, Method method3) {
            this.f62569a = method;
            this.f62570b = method2;
            this.f62571c = method3;
        }
    }

    /* renamed from: pi0.b$c */
    public static final class C24716c implements C24833e {

        /* renamed from: a */
        public final X509TrustManager f62572a;

        /* renamed from: b */
        public final Method f62573b;

        public C24716c(X509TrustManager x509TrustManager, Method method) {
            this.f62573b = method;
            this.f62572a = x509TrustManager;
        }

        /* renamed from: a */
        public final X509Certificate mo61207a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f62573b.invoke(this.f62572a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C24716c)) {
                return false;
            }
            C24716c cVar = (C24716c) obj;
            if (!this.f62572a.equals(cVar.f62572a) || !this.f62573b.equals(cVar.f62573b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.f62573b.hashCode() * 31) + this.f62572a.hashCode();
        }
    }

    public C24713b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls3 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls3.getMethod("get", new Class[0]);
            method5 = cls3.getMethod("open", new Class[]{String.class});
            method6 = cls3.getMethod("warnIfOpen", new Class[0]);
            method7 = method8;
        } catch (Exception unused) {
            method6 = null;
            method5 = null;
        }
        this.f62566h = new C24715b(method7, method5, method6);
        this.f62561c = cls2;
        this.f62562d = method;
        this.f62563e = method2;
        this.f62564f = method3;
        this.f62565g = method4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return ((java.lang.Boolean) r6.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(r7, new java.lang.Object[0])).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001d */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m62176o(java.lang.String r5, java.lang.Class r6, java.lang.Object r7) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        /*
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.reflect.Method r3 = r6.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            r4[r1] = r5     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object r5 = r3.invoke(r7, r4)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ NoSuchMethodException -> 0x001d }
            boolean r5 = r5.booleanValue()     // Catch:{ NoSuchMethodException -> 0x001d }
            return r5
        L_0x001d:
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Method r5 = r6.getMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object r5 = r5.invoke(r7, r6)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ NoSuchMethodException -> 0x002f }
            boolean r2 = r5.booleanValue()     // Catch:{ NoSuchMethodException -> 0x002f }
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.C24713b.m62176o(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    /* renamed from: c */
    public final C24831c mo61196c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C24714a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo61196c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public final C24833e mo61197d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C24716c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new C24830b(x509TrustManager.getAcceptedIssuers());
        }
    }

    /* renamed from: g */
    public void mo61194g(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (this.f62561c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f62562d.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                    this.f62563e.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }
            this.f62565g.invoke(sSLSocket, new Object[]{C24721f.m62201e(list)});
        }
    }

    /* renamed from: h */
    public final void mo61198h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C23610d.m57807o(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    /* renamed from: i */
    public final SSLContext mo61199i() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: j */
    public String mo61195j(SSLSocket sSLSocket) {
        if (!this.f62561c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f62564f.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: k */
    public final Object mo61200k() {
        C24715b bVar = this.f62566h;
        Method method = bVar.f62569a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            bVar.f62570b.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public final boolean mo61201l(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m62176o(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    /* renamed from: m */
    public final void mo61202m(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: n */
    public final void mo61203n(Object obj, String str) {
        C24715b bVar = this.f62566h;
        bVar.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                bVar.f62571c.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            mo61202m(5, str, (Throwable) null);
        }
    }
}
