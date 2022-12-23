package zendesk.core;

import com.zendesk.logger.Logger;
import hi0.C23543i;
import hi0.C23566v;
import ii0.C23610d;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.TlsVersion;

class Tls12SocketFactory extends SSLSocketFactory {
    static {
        TlsVersion.TLS_1_2.javaName();
    }

    public static C23566v.C23568b enableTls12OnPreLollipop(C23566v.C23568b bVar) {
        Logger.m57302a("Skipping TLS 1.2 patch", new Object[0]);
        C23543i.C23544a aVar = new C23543i.C23544a(C23543i.f59490e);
        aVar.mo58669d(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3);
        List singletonList = Collections.singletonList(new C23543i(aVar));
        bVar.getClass();
        bVar.f59605d = C23610d.m57804l(singletonList);
        return bVar;
    }
}
