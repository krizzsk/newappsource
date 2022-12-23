package p304x;

import android.content.Context;
import android.media.CamcorderProfile;
import androidx.camera.core.CameraUnavailableException;
import java.util.HashMap;
import java.util.Set;
import p066e0.C4437k;
import p078f0.C4642h;
import p316y.C7197a0;

/* renamed from: x.o0 */
public final class C7083o0 implements C4437k {

    /* renamed from: a */
    public final HashMap f22002a = new HashMap();

    /* renamed from: b */
    public final C7027b f22003b;

    /* renamed from: x.o0$a */
    public class C7084a implements C7027b {
        public final CamcorderProfile get(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        public final boolean hasProfile(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public C7083o0(Context context, Object obj, Set<String> set) throws CameraUnavailableException {
        C7197a0 a0Var;
        C7084a aVar = new C7084a();
        this.f22003b = aVar;
        if (obj instanceof C7197a0) {
            a0Var = (C7197a0) obj;
        } else {
            a0Var = C7197a0.m16800a(context, C4642h.m11958a());
        }
        context.getClass();
        for (String next : set) {
            this.f22002a.put(next, new C7085o1(context, next, a0Var, this.f22003b));
        }
    }
}
