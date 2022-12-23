package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.net.InetAddress;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: bo.app.s */
public class C1684s extends SSLSocketFactory {

    /* renamed from: b */
    public static final String f5975b = AppboyLogger.getBrazeLogTag(C1684s.class);

    /* renamed from: a */
    public SSLSocketFactory f5976a;

    public C1684s() {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        this.f5976a = instance.getSocketFactory();
    }

    /* renamed from: a */
    public final Socket mo6351a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            ArrayList arrayList = new ArrayList();
            for (String str : sSLSocket.getSupportedProtocols()) {
                if (!str.equals("SSLv3")) {
                    arrayList.add(str);
                }
            }
            AppboyLogger.m5457v(f5975b, "Enabling SSL protocols: " + arrayList);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    public Socket createSocket() {
        return mo6351a(this.f5976a.createSocket());
    }

    public String[] getDefaultCipherSuites() {
        return this.f5976a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f5976a.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return mo6351a(this.f5976a.createSocket(socket, str, i, z));
    }

    public Socket createSocket(String str, int i) {
        return mo6351a(this.f5976a.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return mo6351a(this.f5976a.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return mo6351a(this.f5976a.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return mo6351a(this.f5976a.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
