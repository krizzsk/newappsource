package p258t4;

import com.appboy.support.ValidationUtils;
import com.bumptech.glide.load.EncodeStrategy;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import com.google.android.play.core.assetpacks.C14335x0;
import java.io.File;
import java.io.IOException;
import p001a0.C0016g;
import p025b6.C1492e;
import p025b6.C1494g;
import p060d6.C4397l;
import p172m9.C5720b;
import p195o6.C5998c;
import p221q6.C6188h;
import p311x6.C7160a;
import p367ao.C13501a;
import p434dd.C16552f0;
import p462eh.C16821b;
import p462eh.C16822c;

/* renamed from: t4.c */
public final class C6589c implements C6588b, C1494g, C6188h, zzef, C13501a, C16552f0, C16821b {

    /* renamed from: b */
    public static C6589c f20408b;

    /* renamed from: a */
    public void mo22178a() {
    }

    /* renamed from: i */
    public EncodeStrategy mo5852i(C1492e eVar) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: j */
    public void mo22175j(C16822c cVar) {
        boolean z;
        StringBuilder q = C25541a.m63886q(0);
        while (true) {
            if (!cVar.mo49494c()) {
                break;
            }
            q.append(cVar.mo49493b());
            int i = cVar.f43788f + 1;
            cVar.f43788f = i;
            if (C5720b.m14075z(cVar.f43783a, i, 5) != 5) {
                cVar.f43789g = 0;
                break;
            }
        }
        int length = q.length() - 1;
        int a = cVar.mo49492a() + length + 1;
        cVar.mo49495d(a);
        if (cVar.f43790h.f43798b - a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (cVar.mo49494c() || z) {
            if (length <= 249) {
                q.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                q.setCharAt(0, (char) ((length / 250) + 249));
                q.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = q.length();
        for (int i2 = 0; i2 < length2; i2++) {
            int a2 = (((cVar.mo49492a() + 1) * 149) % ValidationUtils.APPBOY_STRING_MAX_LENGTH) + 1 + q.charAt(i2);
            if (a2 > 255) {
                a2 -= 256;
            }
            cVar.mo49496e((char) a2);
        }
    }

    /* renamed from: n */
    public boolean mo979n(Object obj, File file, C1492e eVar) {
        try {
            C7160a.m16769c(((C5998c) ((C4397l) obj).get()).f19162b.f19172a.f19174a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public void mo22700p(String str, StringBuffer stringBuffer, char c, int i) {
        char c2;
        if (str.indexOf(c) >= 0 || c == '\\') {
            stringBuffer.append(c);
        } else if (c != '_') {
            if (c == 'n') {
                c2 = 10;
            } else if (c == 'r') {
                c2 = 13;
            } else if (c != 't') {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < str.length(); i2++) {
                    sb.append(", \\");
                    sb.append(str.charAt(i2));
                }
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Illegal char '");
                sb3.append(c);
                sb3.append(" at column ");
                sb3.append(i);
                sb3.append(". Only \\\\, \\_");
                throw new IllegalArgumentException(C0016g.m31o(sb3, sb2, ", \\t, \\n, \\r combinations are allowed as escape characters."));
            } else {
                c2 = 9;
            }
            stringBuffer.append(c2);
        }
    }

    public /* synthetic */ Object zza() {
        return new C14335x0();
    }
}
