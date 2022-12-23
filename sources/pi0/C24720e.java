package pi0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* renamed from: pi0.e */
public final class C24720e extends C24721f {

    /* renamed from: c */
    public final Method f62582c;

    /* renamed from: d */
    public final Method f62583d;

    public C24720e(Method method, Method method2) {
        this.f62582c = method;
        this.f62583d = method2;
    }

    /* renamed from: g */
    public final void mo61194g(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b = C24721f.m62200b(list);
            this.f62582c.invoke(sSLParameters, new Object[]{b.toArray(new String[b.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    /* renamed from: j */
    public final String mo61195j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f62583d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
