package p697of;

import com.google.firebase.perf.p414v1.NetworkRequestMetric;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import p626lf.C18200a;
import p649mf.C18367b;

/* renamed from: of.h */
public final class C18746h {

    /* renamed from: a */
    public static final Pattern f47685a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m45751a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C18200a.m44901d().mo50610a();
            return null;
        }
    }

    /* renamed from: b */
    public static String m45752b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* renamed from: c */
    public static void m45753c(C18367b bVar) {
        if (!((NetworkRequestMetric) bVar.f46833e.f36809c).mo43540T()) {
            NetworkRequestMetric.C14496b bVar2 = bVar.f46833e;
            NetworkRequestMetric.NetworkClientErrorReason networkClientErrorReason = NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
            bVar2.mo43956p();
            NetworkRequestMetric.m36103u((NetworkRequestMetric) bVar2.f36809c, networkClientErrorReason);
        }
        bVar.mo50831c();
    }
}
