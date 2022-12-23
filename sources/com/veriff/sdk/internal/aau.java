package com.veriff.sdk.internal;

import android.os.Build;
import android.util.Log;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

class aau extends aay {

    /* renamed from: b */
    private final Class<?> f53502b;

    /* renamed from: c */
    private final Method f53503c;

    /* renamed from: d */
    private final Method f53504d;

    /* renamed from: e */
    private final Method f53505e;

    /* renamed from: f */
    private final Method f53506f;

    /* renamed from: g */
    private final C21313b f53507g = C21313b.m50259a();

    /* renamed from: com.veriff.sdk.internal.aau$a */
    public static final class C21312a extends abd {

        /* renamed from: a */
        private final Object f53508a;

        /* renamed from: b */
        private final Method f53509b;

        public C21312a(Object obj, Method method) {
            this.f53508a = obj;
            this.f53509b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo53806a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f53509b.invoke(this.f53508a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), KeyProvider18.KEY_ALGORITHM_RSA, str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C21312a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: com.veriff.sdk.internal.aau$c */
    public static final class C21314c implements abf {

        /* renamed from: a */
        private final X509TrustManager f53513a;

        /* renamed from: b */
        private final Method f53514b;

        public C21314c(X509TrustManager x509TrustManager, Method method) {
            this.f53514b = method;
            this.f53513a = x509TrustManager;
        }

        /* renamed from: a */
        public X509Certificate mo53811a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f53514b.invoke(this.f53513a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C21314c)) {
                return false;
            }
            C21314c cVar = (C21314c) obj;
            if (!this.f53513a.equals(cVar.f53513a) || !this.f53514b.equals(cVar.f53514b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f53514b.hashCode() * 31) + this.f53513a.hashCode();
        }
    }

    public aau(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f53502b = cls2;
        this.f53503c = method;
        this.f53504d = method2;
        this.f53505e = method3;
        this.f53506f = method4;
    }

    /* renamed from: d */
    public static int m50247d() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo53802a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C22766za.m55839a(e)) {
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

    /* renamed from: b */
    public boolean mo53804b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m50244a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo53804b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    /* renamed from: c */
    public SSLContext mo53805c() {
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

    /* renamed from: com.veriff.sdk.internal.aau$b */
    public static final class C21313b {

        /* renamed from: a */
        private final Method f53510a;

        /* renamed from: b */
        private final Method f53511b;

        /* renamed from: c */
        private final Method f53512c;

        public C21313b(Method method, Method method2, Method method3) {
            this.f53510a = method;
            this.f53511b = method2;
            this.f53512c = method3;
        }

        /* renamed from: a */
        public Object mo53809a(String str) {
            Method method = this.f53510a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f53511b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo53810a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f53512c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: a */
        public static C21313b m50259a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C21313b(method3, method, method2);
        }
    }

    /* renamed from: b */
    private boolean m50246b(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo53804b(str);
        }
    }

    /* renamed from: a */
    public void mo53797a(SSLSocket sSLSocket, String str, List<C22749yq> list) throws IOException {
        if (this.f53502b.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f53503c.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                    this.f53504d.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }
            this.f53506f.invoke(sSLSocket, new Object[]{aay.m50279b(list)});
        }
    }

    /* renamed from: b */
    public static aay m50245b() {
        if (!aay.m50283h()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                Method declaredMethod = cls2.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
                Method method = cls2.getMethod("setHostname", new Class[]{String.class});
                return new aau(cls, cls2, declaredMethod, method, cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", new Class[]{byte[].class}));
            } catch (NoSuchMethodException unused) {
                StringBuilder k = C13555b.m33972k("Expected Android API level 21+ but was ");
                k.append(Build.VERSION.SDK_INT);
                throw new IllegalStateException(k.toString());
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo53796a(SSLSocket sSLSocket) {
        if (!this.f53502b.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f53505e.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public void mo53800a(int i, String str, Throwable th) {
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

    /* renamed from: a */
    public Object mo53799a(String str) {
        return this.f53507g.mo53809a(str);
    }

    /* renamed from: a */
    public void mo53801a(String str, Object obj) {
        if (!this.f53507g.mo53810a(obj)) {
            mo53800a(5, str, (Throwable) null);
        }
    }

    /* renamed from: a */
    private boolean m50244a(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m50246b(str, cls, obj);
        }
    }

    /* renamed from: b */
    public abf mo53803b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C21314c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo53803b(x509TrustManager);
        }
    }

    /* renamed from: a */
    public abd mo53798a(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C21312a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.mo53798a(x509TrustManager);
        }
    }
}
