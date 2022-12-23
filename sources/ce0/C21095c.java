package ce0;

import android.util.Base64;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.gson.JsonSyntaxException;
import com.unity3d.ads.metadata.MediationMetaData;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.model.admarkup.AdMarkupV1;
import com.vungle.warren.model.admarkup.AdMarkupV2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import p359ag.C13447d;
import p359ag.C13450g;
import p359ag.C13452i;
import p359ag.C13453j;

/* renamed from: ce0.c */
public final class C21095c {
    /* renamed from: a */
    public static AdMarkup m49293a(String str) {
        if (str == null) {
            return null;
        }
        try {
            C13450g b = C13453j.m33762b(str);
            if (!(b instanceof C13452i)) {
                return null;
            }
            C13452i u = b.mo40342u();
            int p = b.mo40342u().mo40351I(MediationMetaData.KEY_VERSION).mo40337p();
            if (p == 1) {
                return AdMarkupV1.m57197c(str);
            }
            if (p != 2) {
                return null;
            }
            return m49294b(u);
        } catch (JsonSyntaxException unused) {
            VungleLogger.m57029b(C21095c.class.getName(), "Encountered issue serializing models");
            return null;
        }
    }

    /* renamed from: b */
    public static AdMarkupV2 m49294b(C13452i iVar) {
        String B = iVar.mo40351I("adunit").mo40326B();
        C13447d s = iVar.mo40351I(AdSDKNotificationListener.IMPRESSION_EVENT).mo40340s();
        String[] strArr = new String[s.size()];
        for (int i = 0; i < s.size(); i++) {
            strArr[i] = s.mo40329E(i).mo40326B();
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(B, 0));
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[32];
            while (true) {
                int read = gZIPInputStream.read(bArr);
                if (read != -1) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return new AdMarkupV2(C13453j.m33762b(sb.toString()).mo40342u(), strArr);
                }
            }
        } catch (IOException unused) {
            VungleLogger.m57029b(C21095c.class.getName(), "Encountered issue serializing models");
            return null;
        }
    }
}
