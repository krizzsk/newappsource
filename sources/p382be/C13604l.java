package p382be;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p986firebaseauthapi.zzpz;
import java.util.HashMap;
import java.util.Map;
import p357ae.C13415b;

/* renamed from: be.l */
public final class C13604l {

    /* renamed from: a */
    public static final Logger f33571a = new Logger("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C13415b m34017a(String str) {
        Map map;
        try {
            map = C13605m.m34019b(str);
        } catch (zzpz e) {
            f33571a.mo65851e("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        return new C13415b(str, map);
    }
}
