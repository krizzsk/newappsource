package ki0;

import hi0.C23542h;
import hi0.C23543i;
import hi0.C23566v;
import ii0.C23607a;
import ii0.C23610d;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p252sb.C6501a;

/* renamed from: ki0.b */
public final class C23794b {

    /* renamed from: a */
    public final List<C23543i> f60088a;

    /* renamed from: b */
    public int f60089b = 0;

    /* renamed from: c */
    public boolean f60090c;

    /* renamed from: d */
    public boolean f60091d;

    public C23794b(List<C23543i> list) {
        this.f60088a = list;
    }

    /* renamed from: a */
    public final C23543i mo59024a(SSLSocket sSLSocket) throws IOException {
        C23543i iVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        int i = this.f60089b;
        int size = this.f60088a.size();
        while (true) {
            if (i >= size) {
                iVar = null;
                break;
            }
            iVar = this.f60088a.get(i);
            if (iVar.mo58662a(sSLSocket)) {
                this.f60089b = i + 1;
                break;
            }
            i++;
        }
        if (iVar != null) {
            int i2 = this.f60089b;
            while (true) {
                if (i2 >= this.f60088a.size()) {
                    z = false;
                    break;
                } else if (this.f60088a.get(i2).mo58662a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f60090c = z;
            C23566v.C23567a aVar = C23607a.f59680a;
            boolean z2 = this.f60091d;
            aVar.getClass();
            if (iVar.f59494c != null) {
                strArr = C23610d.m57806n(C23542h.f59471b, sSLSocket.getEnabledCipherSuites(), iVar.f59494c);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (iVar.f59495d != null) {
                strArr2 = C23610d.m57806n(C23610d.f59692i, sSLSocket.getEnabledProtocols(), iVar.f59495d);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            C6501a aVar2 = C23542h.f59471b;
            byte[] bArr = C23610d.f59684a;
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                } else if (aVar2.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                } else {
                    i3++;
                }
            }
            if (z2 && i3 != -1) {
                String str = supportedCipherSuites[i3];
                int length2 = strArr.length + 1;
                String[] strArr3 = new String[length2];
                System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
                strArr3[length2 - 1] = str;
                strArr = strArr3;
            }
            C23543i.C23544a aVar3 = new C23543i.C23544a(iVar);
            aVar3.mo58667b(strArr);
            aVar3.mo58668c(strArr2);
            C23543i iVar2 = new C23543i(aVar3);
            String[] strArr4 = iVar2.f59495d;
            if (strArr4 != null) {
                sSLSocket.setEnabledProtocols(strArr4);
            }
            String[] strArr5 = iVar2.f59494c;
            if (strArr5 != null) {
                sSLSocket.setEnabledCipherSuites(strArr5);
            }
            return iVar;
        }
        StringBuilder k = C13555b.m33972k("Unable to find acceptable protocols. isFallback=");
        k.append(this.f60091d);
        k.append(", modes=");
        k.append(this.f60088a);
        k.append(", supported protocols=");
        k.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(k.toString());
    }
}
