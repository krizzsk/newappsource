package p242s1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p241s0.C6313h;
import p583jk.C17875h;

/* renamed from: s1.z0 */
public final class C6417z0 extends C17875h {

    /* renamed from: n */
    public final WindowInsetsController f20079n;

    /* renamed from: o */
    public Window f20080o;

    public C6417z0(Window window) {
        WindowInsetsController a = window.getInsetsController();
        new C6313h();
        this.f20079n = a;
        this.f20080o = window;
    }

    /* renamed from: P */
    public final void mo22541P(boolean z) {
        if (z) {
            Window window = this.f20080o;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f20079n.setSystemBarsAppearance(16, 16);
            return;
        }
        Window window2 = this.f20080o;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.f20079n.setSystemBarsAppearance(0, 16);
    }

    /* renamed from: Q */
    public final void mo22540Q(boolean z) {
        if (z) {
            Window window = this.f20080o;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f20079n.setSystemBarsAppearance(8, 8);
            return;
        }
        Window window2 = this.f20080o;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.f20079n.setSystemBarsAppearance(0, 8);
    }
}
