package p054d0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d0.w0 */
public final /* synthetic */ class C4317w0 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ int f15285b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f15286c;

    /* renamed from: d */
    public final /* synthetic */ String f15287d;

    public /* synthetic */ C4317w0(AtomicReference atomicReference, String str, int i) {
        this.f15285b = i;
        this.f15286c = atomicReference;
        this.f15287d = str;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        switch (this.f15285b) {
            case 0:
                AtomicReference atomicReference = this.f15286c;
                String str = this.f15287d;
                atomicReference.set(aVar);
                return str + "-cancellation";
            default:
                return this.f15286c.set(aVar);
        }
    }
}
