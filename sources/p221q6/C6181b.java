package p221q6;

import com.google.android.play.core.assetpacks.C14287l0;
import com.google.android.play.core.internal.zzbx;
import java.io.File;
import java.util.HashSet;
import mf0.C24361g;
import mf0.C24368m;
import nj0.C24540a;
import nj0.C24541b;
import org.slf4j.helpers.NOPLogger;
import p172m9.C5720b;
import p334z6.C7490c;
import p334z6.C7491d;
import p389bl.C13637c;
import p406cg.C13815e;
import p434dd.C16552f0;
import p434dd.C16571p;
import p434dd.C16577s;
import p462eh.C16821b;
import p462eh.C16822c;
import p626lf.C18201b;
import p811tc.C19659n;

/* renamed from: q6.b */
public class C6181b implements C6189i, C7491d, C16552f0, C16577s, C16571p, C16821b, C24540a {
    /* renamed from: m */
    public static void m14739m(C16822c cVar, StringBuilder sb) {
        char charAt = sb.charAt(0);
        int charAt2 = (sb.charAt(1) * '(') + (charAt * 1600) + sb.charAt(2) + 1;
        cVar.f43787e.append(new String(new char[]{(char) (charAt2 / 256), (char) (charAt2 % 256)}));
        sb.delete(0, 3);
    }

    /* renamed from: a */
    public final C24541b mo22168a(String str) {
        return NOPLogger.f62478b;
    }

    /* renamed from: b */
    public final boolean mo22169b(Object obj, File file, File file2) {
        Class<?> cls = obj.getClass();
        try {
            return new File(String.class.cast(C5720b.m14049Q(cls, "optimizedPathFor", File.class, File.class).invoke((Object) null, new Object[]{file, file2}))).exists();
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e);
        }
    }

    /* renamed from: c */
    public final void mo22165c(C6190j jVar) {
        jVar.onStart();
    }

    /* renamed from: d */
    public final void mo22166d(C6190j jVar) {
    }

    /* renamed from: e */
    public final boolean mo22170e(ClassLoader classLoader, File file, File file2, boolean z) {
        return C24368m.m61238o(classLoader, file, file2, z, new C24361g(), "path", new C13815e());
    }

    /* renamed from: f */
    public final void mo22171f(ClassLoader classLoader, HashSet hashSet) {
        C13637c.m34062S(classLoader, hashSet, new C18201b());
    }

    /* renamed from: g */
    public final void mo22172g(C7490c cVar) {
    }

    /* renamed from: h */
    public int mo22173h(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return mo22173h((char) (c - 128), sb) + 2;
        } else {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        }
    }

    /* renamed from: i */
    public void mo22174i(float f, float f2, C19659n nVar) {
        throw null;
    }

    /* renamed from: j */
    public void mo22175j(C16822c cVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!cVar.mo49494c()) {
                break;
            }
            char b = cVar.mo49493b();
            cVar.f43788f++;
            int h = mo22173h(b, sb);
            int a = cVar.mo49492a() + ((sb.length() / 3) << 1);
            cVar.mo49495d(a);
            int i = cVar.f43790h.f43798b - a;
            if (cVar.mo49494c()) {
                if (sb.length() % 3 == 0 && C5720b.m14075z(cVar.f43783a, cVar.f43788f, mo22176k()) != mo22176k()) {
                    cVar.f43789g = 0;
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length = sb.length();
                    sb.delete(length - h, length);
                    cVar.f43788f--;
                    h = mo22173h(cVar.mo49493b(), sb2);
                    cVar.f43790h = null;
                }
                while (sb.length() % 3 == 1 && ((h <= 3 && i != 1) || h > 3)) {
                    int length2 = sb.length();
                    sb.delete(length2 - h, length2);
                    cVar.f43788f--;
                    h = mo22173h(cVar.mo49493b(), sb2);
                    cVar.f43790h = null;
                }
            }
        }
        mo22177l(cVar, sb);
    }

    /* renamed from: k */
    public int mo22176k() {
        return 1;
    }

    /* renamed from: l */
    public void mo22177l(C16822c cVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = cVar.mo49492a() + ((sb.length() / 3) << 1);
        cVar.mo49495d(a);
        int i = cVar.f43790h.f43798b - a;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                m14739m(cVar, sb);
            }
            if (cVar.mo49494c()) {
                cVar.mo49496e(254);
            }
        } else if (i == 1 && length == 1) {
            while (sb.length() >= 3) {
                m14739m(cVar, sb);
            }
            if (cVar.mo49494c()) {
                cVar.mo49496e(254);
            }
            cVar.f43788f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m14739m(cVar, sb);
            }
            if (i > 0 || cVar.mo49494c()) {
                cVar.mo49496e(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        cVar.f43789g = 0;
    }

    public final /* synthetic */ Object zza() {
        return new C14287l0();
    }
}
