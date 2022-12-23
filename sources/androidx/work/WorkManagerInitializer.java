package androidx.work;

import android.content.Context;
import androidx.work.C1385a;
import java.util.Collections;
import java.util.List;
import p081f3.C4656h;
import p081f3.C4669n;
import p092g3.C4763k;
import p294w2.C6970b;

public final class WorkManagerInitializer implements C6970b<C4669n> {
    static {
        C4656h.m11961e("WrkMgrInitializer");
    }

    public final Object create(Context context) {
        C4656h.m11960c().mo20176a(new Throwable[0]);
        C4763k.m12080h(context, new C1385a(new C1385a.C1386a()));
        return C4763k.m12079g(context);
    }

    public final List<Class<? extends C6970b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
