package p242s1;

import android.view.View;
import android.view.Window;

/* renamed from: s1.x0 */
public class C6413x0 extends C6410w0 {
    public C6413x0(Window window, View view) {
        super(window, view);
    }

    /* renamed from: Q */
    public final void mo22540Q(boolean z) {
        if (z) {
            this.f20076n.clearFlags(67108864);
            this.f20076n.addFlags(Integer.MIN_VALUE);
            View decorView = this.f20076n.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = this.f20076n.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
    }
}
