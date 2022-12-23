package p242s1;

import android.view.View;
import android.view.Window;

/* renamed from: s1.s0 */
public final class C6390s0 {
    /* renamed from: a */
    public static void m15241a(Window window, boolean z) {
        int i;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & -1793;
        } else {
            i = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i);
    }
}
