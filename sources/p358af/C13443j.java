package p358af;

import android.text.TextUtils;
import com.google.firebase.installations.local.C14462a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p258t4.C6589c;

/* renamed from: af.j */
public final class C13443j {

    /* renamed from: b */
    public static final long f33298b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f33299c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C13443j f33300d;

    /* renamed from: a */
    public final C6589c f33301a;

    public C13443j(C6589c cVar) {
        this.f33301a = cVar;
    }

    /* renamed from: a */
    public final boolean mo40319a(C14462a aVar) {
        if (TextUtils.isEmpty(aVar.f36551d)) {
            return true;
        }
        long j = aVar.f36554g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f33301a.getClass();
        if (aVar.f36553f + j < timeUnit.toSeconds(System.currentTimeMillis()) + f33298b) {
            return true;
        }
        return false;
    }
}
