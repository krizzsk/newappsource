package pi0;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
/* renamed from: pi0.a */
public final class C24712a extends C24713b {
    public C24712a(Class<?> cls) {
        super(cls, (Class<?>) null, (Method) null, (Method) null, (Method) null, (Method) null);
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    /* renamed from: g */
    public final void mo61194g(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C24721f.m62200b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: j */
    public final String mo61195j(SSLSocket sSLSocket) {
        String a = sSLSocket.getApplicationProtocol();
        if (a == null || a.isEmpty()) {
            return null;
        }
        return a;
    }
}
