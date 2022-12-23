package p565io.reactivex.disposables;

import te0.C24956e;

/* renamed from: io.reactivex.disposables.RunnableDisposable */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public RunnableDisposable(C24956e.C24959c.C24960a aVar) {
        super(aVar);
    }

    public final String toString() {
        boolean z;
        StringBuilder k = C13555b.m33972k("RunnableDisposable(disposed=");
        if (get() == null) {
            z = true;
        } else {
            z = false;
        }
        k.append(z);
        k.append(", ");
        k.append(get());
        k.append(")");
        return k.toString();
    }
}
