package ud0;

import android.os.Bundle;
import com.vungle.warren.C23236v0;
import com.vungle.warren.Vungle;

/* renamed from: ud0.i */
public final class C25025i implements C25021e {

    /* renamed from: b */
    public static final /* synthetic */ int f63206b = 0;

    /* renamed from: a */
    public C25026a f63207a;

    /* renamed from: ud0.i$a */
    public interface C25026a {
    }

    public C25025i(C25026a aVar) {
        this.f63207a = aVar;
    }

    /* renamed from: a */
    public final int mo61555a(Bundle bundle, C25024h hVar) {
        if (bundle.getString("appId", (String) null) == null) {
            return 1;
        }
        ((C23236v0.C23238b) this.f63207a).getClass();
        Vungle.reConfigure();
        return 0;
    }
}
