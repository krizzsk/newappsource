package p054d0;

import android.util.Size;
import androidx.camera.core.C0612l;
import androidx.camera.core.impl.C0585i;
import androidx.camera.core.impl.SessionConfig;

/* renamed from: d0.b0 */
public final /* synthetic */ class C4270b0 implements SessionConfig.C0567c {

    /* renamed from: a */
    public final /* synthetic */ C0612l f15179a;

    /* renamed from: b */
    public final /* synthetic */ String f15180b;

    /* renamed from: c */
    public final /* synthetic */ C0585i f15181c;

    /* renamed from: d */
    public final /* synthetic */ Size f15182d;

    public /* synthetic */ C4270b0(C0612l lVar, String str, C0585i iVar, Size size) {
        this.f15179a = lVar;
        this.f15180b = str;
        this.f15181c = iVar;
        this.f15182d = size;
    }

    public final void onError() {
        C0612l lVar = this.f15179a;
        String str = this.f15180b;
        C0585i iVar = this.f15181c;
        Size size = this.f15182d;
        lVar.mo2551z();
        if (lVar.mo2374i(str)) {
            SessionConfig.C0566b A = lVar.mo2544A(str, iVar, size);
            lVar.f2128y = A;
            lVar.mo2390y(A.mo2460c());
            lVar.mo2378m();
        }
    }
}
