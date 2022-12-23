package com.veriff.sdk.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

final class aax extends aay {

    /* renamed from: a */
    public final Method f53523a;

    /* renamed from: b */
    public final Method f53524b;

    public aax(Method method, Method method2) {
        this.f53523a = method;
        this.f53524b = method2;
    }

    /* renamed from: a */
    public void mo53797a(SSLSocket sSLSocket, String str, List<C22749yq> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> a = aay.m50277a(list);
            this.f53523a.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    /* renamed from: a */
    public String mo53796a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f53524b.invoke(sSLSocket, new Object[0]);
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

    /* renamed from: a */
    public static aax m50273a() {
        try {
            return new aax(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
