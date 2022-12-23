package p364al;

import java.util.Iterator;
import java.util.Map;
import je0.C23712e;
import le0.C24224b;
import p565io.reactivex.internal.observers.ConsumerSingleObserver;
import p565io.reactivex.internal.operators.single.SingleCreate;
import p565io.reactivex.internal.operators.single.SingleSubscribeOn;
import p941yn.C20746a;
import we0.C25128a;

/* renamed from: al.a */
public final class C13480a implements C20746a {

    /* renamed from: a */
    public final C13485f f33358a = new C13485f();

    /* JADX WARNING: type inference failed for: r0v3, types: [io.reactivex.internal.operators.single.SingleObserveOn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <S> void mo40390a(p364al.C13483d<S> r2, com.masabi.justride.sdk.platform.jobs.CallBackOn r3, p364al.C13488i<S> r4) {
        /*
            r1 = this;
            al.g r0 = new al.g
            r0.<init>(r2)
            io.reactivex.internal.operators.single.SingleCreate r2 = new io.reactivex.internal.operators.single.SingleCreate
            r2.<init>(r0)
            com.masabi.justride.sdk.platform.jobs.CallBackOn r0 = com.masabi.justride.sdk.platform.jobs.CallBackOn.MAIN_THREAD
            if (r3 != r0) goto L_0x0021
            ke0.b r3 = ke0.C23761a.f60029a
            if (r3 == 0) goto L_0x0019
            io.reactivex.internal.operators.single.SingleObserveOn r0 = new io.reactivex.internal.operators.single.SingleObserveOn
            r0.<init>(r2, r3)
            r2 = r0
            goto L_0x0021
        L_0x0019:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "scheduler == null"
            r2.<init>(r3)
            throw r2
        L_0x0021:
            je0.e r3 = we0.C25128a.f63408a
            if (r3 == 0) goto L_0x0035
            io.reactivex.internal.operators.single.SingleSubscribeOn r0 = new io.reactivex.internal.operators.single.SingleSubscribeOn
            r0.<init>(r2, r3)
            al.e r2 = new al.e
            al.f r3 = r1.f33358a
            r2.<init>(r4, r3)
            r0.mo58950f(r2)
            return
        L_0x0035:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "scheduler is null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p364al.C13480a.mo40390a(al.d, com.masabi.justride.sdk.platform.jobs.CallBackOn, al.i):void");
    }

    /* renamed from: b */
    public final <S> void mo40391b(C13483d<S> dVar) {
        SingleCreate singleCreate = new SingleCreate(new C13486g(dVar));
        C23712e eVar = C25128a.f63408a;
        if (eVar != null) {
            new SingleSubscribeOn(singleCreate, eVar).mo58950f(new ConsumerSingleObserver());
            return;
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: c */
    public final void mo40392c(C13488i<?> iVar) {
        C13485f fVar = this.f33358a;
        synchronized (fVar) {
            Iterator it = fVar.f33363a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((C13484e) entry.getKey()).f33361b.equals(iVar)) {
                    ((C24224b) entry.getValue()).dispose();
                    it.remove();
                }
            }
        }
    }
}
