package p054d0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d0.y0 */
public final /* synthetic */ class C4322y0 implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f15299b;

    /* renamed from: c */
    public final /* synthetic */ String f15300c;

    public /* synthetic */ C4322y0(AtomicReference atomicReference, String str) {
        this.f15299b = atomicReference;
        this.f15300c = str;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        AtomicReference atomicReference = this.f15299b;
        String str = this.f15300c;
        atomicReference.set(aVar);
        return str + "-Surface";
    }
}
