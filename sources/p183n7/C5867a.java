package p183n7;

import com.cubic.umo.Environment;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;

/* renamed from: n7.a */
public final class C5867a {

    /* renamed from: n7.a$a */
    public /* synthetic */ class C5868a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18856a;

        static {
            int[] iArr = new int[Environment.values().length];
            iArr[Environment.PROD.ordinal()] = 1;
            iArr[Environment.SANDBOX.ordinal()] = 2;
            iArr[Environment.DEV.ordinal()] = 3;
            iArr[Environment.MOOVIT.ordinal()] = 4;
            f18856a = iArr;
        }
    }

    /* renamed from: a */
    public static final String m14302a(Environment environment) {
        String str;
        C24362h.m61211f(environment, "<this>");
        int i = C5868a.f18856a[environment.ordinal()];
        if (i == 1) {
            str = "id.cloud.umomobility.com";
        } else if (i == 2) {
            str = "id.demo.cloud.umomobility.com";
        } else if (i == 3 || i == 4) {
            str = "id.stg.cloud.umomobility.com";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return UrlPrivacyValidator.HTTPS_SCHEME + str + '/';
    }
}
