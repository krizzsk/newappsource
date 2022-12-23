package pi0;

import ii0.C23610d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* renamed from: pi0.d */
public final class C24718d extends C24721f {

    /* renamed from: c */
    public final Method f62574c;

    /* renamed from: d */
    public final Method f62575d;

    /* renamed from: e */
    public final Method f62576e;

    /* renamed from: f */
    public final Class<?> f62577f;

    /* renamed from: g */
    public final Class<?> f62578g;

    /* renamed from: pi0.d$a */
    public static class C24719a implements InvocationHandler {

        /* renamed from: a */
        public final List<String> f62579a;

        /* renamed from: b */
        public boolean f62580b;

        /* renamed from: c */
        public String f62581c;

        public C24719a(ArrayList arrayList) {
            this.f62579a = arrayList;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C23610d.f59685b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f62580b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f62579a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = (String) list.get(i);
                            if (this.f62579a.contains(str)) {
                                this.f62581c = str;
                                return str;
                            }
                        }
                        String str2 = this.f62579a.get(0);
                        this.f62581c = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f62581c = (String) objArr[0];
                return null;
            }
        }
    }

    public C24718d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f62574c = method;
        this.f62575d = method2;
        this.f62576e = method3;
        this.f62577f = cls;
        this.f62578g = cls2;
    }

    /* renamed from: a */
    public final void mo61211a(SSLSocket sSLSocket) {
        try {
            this.f62576e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }

    /* renamed from: g */
    public final void mo61194g(SSLSocket sSLSocket, String str, List<Protocol> list) {
        ArrayList b = C24721f.m62200b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C24721f.class.getClassLoader(), new Class[]{this.f62577f, this.f62578g}, new C24719a(b));
            this.f62574c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    /* renamed from: j */
    public final String mo61195j(SSLSocket sSLSocket) {
        try {
            C24719a aVar = (C24719a) Proxy.getInvocationHandler(this.f62575d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z = aVar.f62580b;
            if (!z && aVar.f62581c == null) {
                C24721f.f62584a.mo61202m(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.f62581c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}
