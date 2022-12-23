package c30;

import aa0.C7543n;
import android.content.Context;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.matrolanguage.MetroLanguage;
import java.io.IOException;
import java.util.List;
import p435de.C16596f;
import p810sz.C19575a;
import p810sz.C19576b;
import p898wr.C20400b;
import u00.C19806a;

/* renamed from: c30.a */
public final class C1771a extends C19806a {

    /* renamed from: b */
    public static volatile C7543n<List<MetroLanguage>> f6243b;

    public C1771a(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: h */
    public static C7543n<List<MetroLanguage>> m5073h(Context context) {
        if (f6243b == null) {
            synchronized (C1771a.class) {
                if (f6243b == null) {
                    Context applicationContext = context.getApplicationContext();
                    MetroLanguage.C4111b bVar = MetroLanguage.f14787d;
                    C7543n<List<MetroLanguage>> q = C7543n.m17285q(applicationContext, C19575a.m46957a(bVar, true), new C19576b(bVar, true), "metro_languages_store");
                    try {
                        q.mo51042l();
                    } catch (IOException e) {
                        C16596f.m42113a().mo49364c(new ApplicationBugException("Unable to initialize metro languages store!", e));
                        q = null;
                    }
                    f6243b = q;
                }
            }
        }
        return f6243b;
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        C7543n<List<MetroLanguage>> h = m5073h(context);
        if (h != null) {
            h.remove(mo6589i());
        }
    }

    /* renamed from: i */
    public final String mo6589i() {
        return mo52108e() + "_" + mo52110g();
    }
}
