package p379;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.C0627p;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.Config;
import com.google.android.gms.internal.mlkit_vision_face.zzcs;
import com.google.android.gms.internal.mlkit_vision_face.zzcw;
import com.moovit.image.model.Image;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Objects;
import p025b6.C1489d;
import p066e0.C4462z;
import p583jk.C17884p;

/* renamed from: c */
public final /* synthetic */ class C13715c implements C4462z.C4463a, C1489d.C1491b {
    /* renamed from: b */
    public static int m34237b(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    /* renamed from: d */
    public static int m34238d(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    /* renamed from: e */
    public static View m34239e(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    /* renamed from: f */
    public static zzcw m34240f(int i) {
        zzcs zzcs = new zzcs();
        zzcs.zza(i);
        return zzcs.zzb();
    }

    /* renamed from: g */
    public static String m34241g(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: h */
    public static String m34242h(int i, String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m34243i(int i, String str, int i2, String str2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: j */
    public static String m34244j(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    /* renamed from: k */
    public static String m34245k(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: l */
    public static String m34246l(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* renamed from: m */
    public static String m34247m(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: n */
    public static void m34248n(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }

    /* renamed from: o */
    public static void m34249o(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    /* renamed from: p */
    public static C0590n m34250p(Config config, Config config2) {
        C0589m mVar;
        if (config == null && config2 == null) {
            return C0590n.f2014z;
        }
        if (config2 != null) {
            mVar = C0589m.m1675u(config2);
        } else {
            mVar = C0589m.m1674t();
        }
        if (config != null) {
            for (Config.C0564a next : config.listOptions()) {
                mVar.mo2502v(next, config.mo2424c(next), config.mo2422a(next));
            }
        }
        return C0590n.m1678s(mVar);
    }

    /* renamed from: a */
    public void mo250a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Image image = (Image) obj;
        if (image != null) {
            messageDigest.update(bArr);
            C17884p.m44381u(messageDigest, image.f41803b);
            C17884p.m44380t(messageDigest, image.f41804c.hashCode());
            if (image.mo48223b() != null) {
                for (String u : image.mo48223b()) {
                    C17884p.m44381u(messageDigest, u);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2538c(C4462z zVar) {
        C0627p acquireLatestImage;
        try {
            acquireLatestImage = zVar.acquireLatestImage();
            Objects.toString(acquireLatestImage);
            if (acquireLatestImage != null) {
                acquireLatestImage.close();
                return;
            }
            return;
        } catch (IllegalStateException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
