package p304x;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: x.f */
public final /* synthetic */ class C7044f implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ C7090q f21908b;

    /* renamed from: c */
    public final /* synthetic */ long f21909c;

    public /* synthetic */ C7044f(C7090q qVar, long j) {
        this.f21908b = qVar;
        this.f21909c = j;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        C7090q qVar = this.f21908b;
        long j = this.f21909c;
        qVar.getClass();
        qVar.mo23326c(new C7058h(j, aVar));
        return "waitForSessionUpdateId:" + j;
    }
}
