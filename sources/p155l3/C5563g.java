package p155l3;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import p143k3.C5463b;
import p167m3.C5677g;
import p192o3.C5956p;
import p218q3.C6165a;

/* renamed from: l3.g */
public final class C5563g extends C5558c<C5463b> {
    public C5563g(Context context, C6165a aVar) {
        super(C5677g.m13960a(context, aVar).f18455c);
    }

    /* renamed from: b */
    public final boolean mo21396b(C5956p pVar) {
        NetworkType networkType = pVar.f19091j.f15877a;
        if (networkType == NetworkType.UNMETERED || (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo21397c(Object obj) {
        C5463b bVar = (C5463b) obj;
        if (!bVar.f17984a || bVar.f17986c) {
            return true;
        }
        return false;
    }
}
