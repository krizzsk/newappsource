package p304x;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0585i;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.HashSet;
import p032c0.C1755e;
import p066e0.C4427f0;
import p066e0.C4428g;
import p066e0.C4450p0;
import p291w.C6956a;

/* renamed from: x.c0 */
public class C7032c0 implements C0578e.C0580b {

    /* renamed from: a */
    public static final C7032c0 f21879a = new C7032c0();

    /* renamed from: a */
    public void mo2483a(C0585i iVar, C0578e.C0579a aVar) {
        C0578e t = iVar.mo2501t();
        Config config = C0590n.f2014z;
        C0572a aVar2 = C0578e.f1968h;
        HashSet hashSet = new HashSet();
        C0589m t2 = C0589m.m1674t();
        ArrayList arrayList = new ArrayList();
        C4427f0 c = C4427f0.m11609c();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C0590n s = C0590n.m1678s(t2);
        C4450p0 p0Var = C4450p0.f15508b;
        ArrayMap arrayMap = new ArrayMap();
        for (String next : c.mo19987b()) {
            arrayMap.put(next, c.mo19986a(next));
        }
        C4450p0 p0Var2 = new C4450p0(arrayMap);
        int i = -1;
        new C0578e(arrayList2, s, -1, arrayList, false, p0Var2, (C4428g) null);
        if (t != null) {
            i = t.f1972c;
            aVar.mo2479a(t.f1973d);
            config = t.f1971b;
        }
        aVar.f1978b = C0589m.m1675u(config);
        aVar.f1979c = ((Integer) iVar.mo2423b(C6956a.f21713y, Integer.valueOf(i))).intValue();
        aVar.mo2480b(new C7122y0((CameraCaptureSession.CaptureCallback) iVar.mo2423b(C6956a.f21709B, new C7028b0())));
        aVar.mo2481c(C1755e.C1756a.m5005b(iVar).mo6514a());
    }
}
