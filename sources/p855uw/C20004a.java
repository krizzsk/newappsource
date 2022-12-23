package p855uw;

import aa0.C7543n;
import android.content.Context;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.IOException;
import p435de.C16596f;
import s00.C19390c;
import t00.C19622a;

/* renamed from: uw.a */
public final class C20004a extends C19622a {

    /* renamed from: b */
    public static volatile C7543n<TaxiProvidersManager> f50855b;

    public C20004a(C19390c cVar) {
        super(cVar);
    }

    /* renamed from: d */
    public static C7543n<TaxiProvidersManager> m47494d(Context context) {
        if (f50855b == null) {
            synchronized (C20004a.class) {
                if (f50855b == null) {
                    Context applicationContext = context.getApplicationContext();
                    TaxiProvidersManager.C15442b bVar = TaxiProvidersManager.f39984d;
                    C7543n<TaxiProvidersManager> q = C7543n.m17285q(applicationContext, bVar, bVar, "taxi_providers_manager_store");
                    try {
                        q.mo51042l();
                    } catch (IOException e) {
                        C16596f.m42113a().mo49364c(new ApplicationBugException("Unable to initialize taxi providers manager store!", e));
                        q = null;
                    }
                    f50855b = q;
                }
            }
        }
        return f50855b;
    }
}
