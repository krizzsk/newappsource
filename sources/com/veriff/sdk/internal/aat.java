package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
class aat extends aau {
    public aat(Class<?> cls) {
        super(cls, (Class<?>) null, (Method) null, (Method) null, (Method) null, (Method) null);
    }

    /* renamed from: c */
    private void m50241c(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    /* renamed from: a */
    public void mo53797a(SSLSocket sSLSocket, String str, List<C22749yq> list) throws IOException {
        try {
            m50241c(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) aay.m50277a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public String mo53796a(SSLSocket sSLSocket) {
        String a = sSLSocket.getApplicationProtocol();
        if (a == null || a.isEmpty()) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public static aay m50240a() {
        if (!aay.m50283h()) {
            return null;
        }
        try {
            if (aau.m50247d() >= 29) {
                return new aat(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }
}
