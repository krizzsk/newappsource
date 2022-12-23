package nc0;

import android.view.View;
import mf0.C24362h;

/* renamed from: nc0.b */
public final /* synthetic */ class C12951b implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f32091a;

    public /* synthetic */ C12951b(View view) {
        this.f32091a = view;
    }

    public final void onSystemUiVisibilityChange(int i) {
        View view = this.f32091a;
        C24362h.m61211f(view, "$view");
        if ((i & 2) == 0) {
            view.setSystemUiVisibility(4870);
        }
    }
}
