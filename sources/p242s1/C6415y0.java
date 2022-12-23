package p242s1;

import android.view.View;
import android.view.Window;

/* renamed from: s1.y0 */
public final class C6415y0 extends C6413x0 {
    public C6415y0(Window window, View view) {
        super(window, view);
    }

    /* renamed from: P */
    public final void mo22541P(boolean z) {
        if (z) {
            this.f20076n.clearFlags(134217728);
            this.f20076n.addFlags(Integer.MIN_VALUE);
            View decorView = this.f20076n.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = this.f20076n.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
    }
}
