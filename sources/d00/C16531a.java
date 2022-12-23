package d00;

import android.content.Context;
import p117i2.C5258a;

/* renamed from: d00.a */
public abstract class C16531a<D> extends C5258a<D> {

    /* renamed from: a */
    public D f43158a = null;

    public C16531a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo21481a(Context context) {
    }

    /* renamed from: b */
    public void mo48168b(D d) {
    }

    /* renamed from: c */
    public void mo21482c(Context context) {
    }

    public final void deliverResult(D d) {
        if (!isReset()) {
            D d2 = this.f43158a;
            this.f43158a = d;
            if (isStarted()) {
                super.deliverResult(d);
            }
            if (d2 != null && d2 != d) {
                mo48168b(d2);
            }
        } else if (d != null) {
            mo48168b(d);
        }
    }

    public final void onCanceled(D d) {
        super.onCanceled(d);
        if (d != null) {
            mo48168b(d);
        }
    }

    public final void onReset() {
        super.onReset();
        onStopLoading();
        mo21482c(getContext());
        D d = this.f43158a;
        if (d != null) {
            mo48168b(d);
            this.f43158a = null;
        }
    }

    public final void onStartLoading() {
        D d = this.f43158a;
        if (d != null) {
            deliverResult(d);
        }
        mo21481a(getContext());
        if (takeContentChanged() || this.f43158a == null) {
            forceLoad();
        }
    }

    public final void onStopLoading() {
        super.onStopLoading();
        cancelLoad();
    }
}
