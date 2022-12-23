package p364al;

import com.masabi.justride.sdk.platform.jobs.CallBackOn;
import java.util.ArrayList;
import p364al.C13489j;
import p941yn.C20746a;

/* renamed from: al.k */
public class C13491k<S> extends C13482c<S> {

    /* renamed from: a */
    public final C20746a f33368a;

    /* renamed from: b */
    public final C13489j.C13490a f33369b;

    /* renamed from: c */
    public final C13483d<S> f33370c;

    /* renamed from: d */
    public final ArrayList f33371d = new ArrayList();

    public C13491k(C20746a aVar, C13489j.C13490a aVar2, C13483d<S> dVar) {
        this.f33368a = aVar;
        this.f33369b = aVar2;
        this.f33370c = dVar;
    }

    /* renamed from: a */
    public final synchronized void mo40395a(C13481b bVar) {
        this.f33371d.add(bVar);
        if (this.f33371d.size() <= 1) {
            C20746a aVar = this.f33368a;
            C13483d<S> dVar = this.f33370c;
            CallBackOn callBackOn = CallBackOn.BACKGROUND_THREAD;
            this.f33369b.getClass();
            aVar.mo40390a(dVar, callBackOn, new C13489j(this));
        }
    }
}
