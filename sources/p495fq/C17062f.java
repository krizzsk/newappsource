package p495fq;

import com.google.android.play.core.install.InstallState;
import p458ed.C16807a;

/* renamed from: fq.f */
public final /* synthetic */ class C17062f implements C16807a {

    /* renamed from: a */
    public final /* synthetic */ C17063g f44227a;

    public /* synthetic */ C17062f(C17063g gVar) {
        this.f44227a = gVar;
    }

    /* renamed from: a */
    public final void mo49479a(Object obj) {
        int c;
        C17063g gVar = this.f44227a;
        InstallState installState = (InstallState) obj;
        gVar.getClass();
        if (installState != null && gVar.f44231h != (c = installState.mo40479c())) {
            gVar.f44231h = c;
            gVar.mo49522q(gVar.mo49514i());
        }
    }
}
