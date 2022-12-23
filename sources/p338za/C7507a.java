package p338za;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p011aa.C0141e;
import p277ub.C6802q;
import p326ya.C7357c;
import p624ld.C18187b;

/* renamed from: za.a */
public final class C7507a extends C0141e {
    /* renamed from: m */
    public final Metadata mo321m(C7357c cVar, ByteBuffer byteBuffer) {
        String str;
        if (byteBuffer.get() != 116) {
            return null;
        }
        C6802q qVar = new C6802q(byteBuffer.array(), byteBuffer.limit());
        qVar.mo22979l(12);
        int d = (qVar.mo22971d() + qVar.mo22973f(12)) - 4;
        qVar.mo22979l(44);
        qVar.mo22980m(qVar.mo22973f(12));
        qVar.mo22979l(16);
        ArrayList arrayList = new ArrayList();
        while (qVar.mo22971d() < d) {
            qVar.mo22979l(48);
            int f = qVar.mo22973f(8);
            qVar.mo22979l(4);
            int d2 = qVar.mo22971d() + qVar.mo22973f(12);
            String str2 = null;
            String str3 = null;
            while (qVar.mo22971d() < d2) {
                int f2 = qVar.mo22973f(8);
                int f3 = qVar.mo22973f(8);
                int d3 = qVar.mo22971d() + f3;
                if (f2 == 2) {
                    int f4 = qVar.mo22973f(16);
                    qVar.mo22979l(8);
                    if (f4 != 3) {
                    }
                    while (qVar.mo22971d() < d3) {
                        int f5 = qVar.mo22973f(8);
                        Charset charset = C18187b.f46427a;
                        byte[] bArr = new byte[f5];
                        qVar.mo22975h(f5, bArr);
                        str2 = new String(bArr, charset);
                        int f6 = qVar.mo22973f(8);
                        for (int i = 0; i < f6; i++) {
                            qVar.mo22980m(qVar.mo22973f(8));
                        }
                    }
                } else if (f2 == 21) {
                    Charset charset2 = C18187b.f46427a;
                    byte[] bArr2 = new byte[f3];
                    qVar.mo22975h(f3, bArr2);
                    str3 = new String(bArr2, charset2);
                }
                qVar.mo22977j(d3 * 8);
            }
            qVar.mo22977j(d2 * 8);
            if (!(str2 == null || str3 == null)) {
                if (str3.length() != 0) {
                    str = str2.concat(str3);
                } else {
                    str = new String(str2);
                }
                arrayList.add(new AppInfoTable(f, str));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
