package p977zz;

import com.moovit.commons.utils.SafeCallable;

/* renamed from: zz.n0 */
public final /* synthetic */ class C20954n0<V> {
    /* renamed from: a */
    public static Object m49068a(SafeCallable safeCallable) {
        try {
            return safeCallable.safeCall();
        } catch (Throwable th) {
            return safeCallable.onError(th);
        }
    }

    /* renamed from: b */
    public static Object m49069b(SafeCallable safeCallable, Throwable th) {
        return null;
    }
}
