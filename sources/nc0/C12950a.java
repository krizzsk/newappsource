package nc0;

import android.view.View;

/* renamed from: nc0.a */
public final /* synthetic */ class C12950a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f32089b;

    /* renamed from: c */
    public final /* synthetic */ boolean f32090c;

    public /* synthetic */ C12950a(View view, boolean z) {
        this.f32089b = view;
        this.f32090c = z;
    }

    public final void run() {
        View view = this.f32089b;
        boolean z = this.f32090c;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }
}
