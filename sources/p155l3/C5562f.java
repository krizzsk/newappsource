package p155l3;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import p081f3.C4656h;
import p143k3.C5463b;
import p167m3.C5677g;
import p192o3.C5956p;
import p218q3.C6165a;

/* renamed from: l3.f */
public final class C5562f extends C5558c<C5463b> {
    static {
        C4656h.m11961e("NetworkNotRoamingCtrlr");
    }

    public C5562f(Context context, C6165a aVar) {
        super(C5677g.m13960a(context, aVar).f18455c);
    }

    /* renamed from: b */
    public final boolean mo21396b(C5956p pVar) {
        if (pVar.f19091j.f15877a == NetworkType.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo21397c(Object obj) {
        C5463b bVar = (C5463b) obj;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 24) {
            C4656h.m11960c().mo20176a(new Throwable[0]);
            return !bVar.f17984a;
        }
        if (!bVar.f17984a || !bVar.f17987d) {
            z = true;
        }
        return z;
    }
}
