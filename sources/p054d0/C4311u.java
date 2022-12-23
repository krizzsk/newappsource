package p054d0;

import android.util.Size;
import androidx.camera.core.C0556i;
import androidx.camera.core.impl.C0584h;
import androidx.camera.core.impl.SessionConfig;
import p066e0.C4415a0;
import p583jk.C17884p;

/* renamed from: d0.u */
public final /* synthetic */ class C4311u implements SessionConfig.C0567c {

    /* renamed from: a */
    public final /* synthetic */ C0556i f15262a;

    /* renamed from: b */
    public final /* synthetic */ String f15263b;

    /* renamed from: c */
    public final /* synthetic */ C0584h f15264c;

    /* renamed from: d */
    public final /* synthetic */ Size f15265d;

    public /* synthetic */ C4311u(C0556i iVar, String str, C0584h hVar, Size size) {
        this.f15262a = iVar;
        this.f15263b = str;
        this.f15264c = hVar;
        this.f15265d = size;
    }

    public final void onError() {
        C0556i iVar = this.f15262a;
        String str = this.f15263b;
        C0584h hVar = this.f15264c;
        Size size = this.f15265d;
        iVar.getClass();
        C17884p.m44372k();
        C4415a0 a0Var = iVar.f1915o;
        if (a0Var != null) {
            a0Var.mo2450a();
            iVar.f1915o = null;
        }
        iVar.f1912l.mo2539d();
        if (iVar.mo2374i(str)) {
            iVar.mo2390y(iVar.mo2440z(str, hVar, size).mo2460c());
            iVar.mo2378m();
        }
    }
}
