package com.veriff.sdk.internal;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

class aaw extends aay {

    /* renamed from: a */
    private final Method f53515a;

    /* renamed from: b */
    private final Method f53516b;

    /* renamed from: c */
    private final Method f53517c;

    /* renamed from: d */
    private final Class<?> f53518d;

    /* renamed from: e */
    private final Class<?> f53519e;

    /* renamed from: com.veriff.sdk.internal.aaw$a */
    public static class C21315a implements InvocationHandler {

        /* renamed from: a */
        public boolean f53520a;

        /* renamed from: b */
        public String f53521b;

        /* renamed from: c */
        private final List<String> f53522c;

        public C21315a(List<String> list) {
            this.f53522c = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C22766za.f57695b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f53520a = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f53522c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = (String) list.get(i);
                            if (this.f53522c.contains(str)) {
                                this.f53521b = str;
                                return str;
                            }
                        }
                        String str2 = this.f53522c.get(0);
                        this.f53521b = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f53521b = (String) objArr[0];
                return null;
            }
        }
    }

    public aaw(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f53515a = method;
        this.f53516b = method2;
        this.f53517c = method3;
        this.f53518d = cls;
        this.f53519e = cls2;
    }

    /* renamed from: a */
    public void mo53797a(SSLSocket sSLSocket, String str, List<C22749yq> list) {
        List<String> a = aay.m50277a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(aay.class.getClassLoader(), new Class[]{this.f53518d, this.f53519e}, new C21315a(a));
            this.f53515a.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    /* renamed from: b */
    public void mo53815b(SSLSocket sSLSocket) {
        try {
            this.f53517c.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }

    /* renamed from: a */
    public String mo53796a(SSLSocket sSLSocket) {
        try {
            C21315a aVar = (C21315a) Proxy.getInvocationHandler(this.f53516b.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = aVar.f53520a;
            if (!z && aVar.f53521b == null) {
                aay.m50281e().mo53800a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.f53521b;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    /* renamed from: a */
    public static aay m50269a() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, (ClassLoader) null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, (ClassLoader) null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, (ClassLoader) null);
            Class[] clsArr = {SSLSocket.class};
            return new aaw(cls.getMethod("put", new Class[]{SSLSocket.class, cls2}), cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod(ProductAction.ACTION_REMOVE, clsArr), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }
}
