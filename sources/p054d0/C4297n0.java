package p054d0;

import android.util.Size;
import androidx.camera.core.C0631r;
import androidx.camera.core.impl.C0591o;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: d0.n0 */
public final /* synthetic */ class C4297n0 implements SessionConfig.C0567c {

    /* renamed from: a */
    public final /* synthetic */ C0631r f15224a;

    /* renamed from: b */
    public final /* synthetic */ String f15225b;

    /* renamed from: c */
    public final /* synthetic */ C0591o f15226c;

    /* renamed from: d */
    public final /* synthetic */ Size f15227d;

    public /* synthetic */ C4297n0(C0631r rVar, String str, C0591o oVar, Size size) {
        this.f15224a = rVar;
        this.f15225b = str;
        this.f15226c = oVar;
        this.f15227d = size;
    }

    public final void onError() {
        C0631r rVar = this.f15224a;
        String str = this.f15225b;
        C0591o oVar = this.f15226c;
        Size size = this.f15227d;
        if (rVar.mo2374i(str)) {
            rVar.mo2390y(rVar.mo2574z(str, oVar, size).mo2460c());
            rVar.mo2378m();
        }
    }
}
