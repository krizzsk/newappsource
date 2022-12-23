package p357ae;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.usebutton.sdk.internal.WebViewActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ae.a */
public final class C13414a {

    /* renamed from: c */
    public static final Map f33281c;

    /* renamed from: a */
    public final String f33282a;

    /* renamed from: b */
    public final String f33283b;

    static {
        HashMap hashMap = new HashMap();
        C13715c.m34248n(2, hashMap, "recoverEmail", 0, "resetPassword", 4, "signIn", 1, "verifyEmail");
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f33281c = Collections.unmodifiableMap(hashMap);
    }

    public C13414a(String str) {
        String a = m33688a(str, "apiKey");
        String a2 = m33688a(str, "oobCode");
        String a3 = m33688a(str, "mode");
        if (a == null || a2 == null || a3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        Preconditions.checkNotEmpty(a);
        this.f33282a = Preconditions.checkNotEmpty(a2);
        Preconditions.checkNotEmpty(a3);
        m33688a(str, "continueUrl");
        m33688a(str, "languageCode");
        this.f33283b = m33688a(str, "tenantId");
    }

    /* renamed from: a */
    public static String m33688a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains(WebViewActivity.EXTRA_LINK)) {
                return Uri.parse(Preconditions.checkNotEmpty(parse.getQueryParameter(WebViewActivity.EXTRA_LINK))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
