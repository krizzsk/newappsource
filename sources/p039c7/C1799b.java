package p039c7;

import android.widget.FrameLayout;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import mf0.C24362h;

/* renamed from: c7.b */
public final /* synthetic */ class C1799b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f6282b;

    /* renamed from: c */
    public final /* synthetic */ boolean f6283c;

    /* renamed from: d */
    public final /* synthetic */ boolean f6284d;

    public /* synthetic */ C1799b(FrameLayout frameLayout, boolean z, boolean z2) {
        this.f6282b = frameLayout;
        this.f6283c = z;
        this.f6284d = z2;
    }

    public final void run() {
        int i;
        FrameLayout frameLayout = this.f6282b;
        boolean z = this.f6283c;
        boolean z2 = this.f6284d;
        UMOAdKitBannerView.Companion companion = UMOAdKitBannerView.f7241i;
        C24362h.m61211f(frameLayout, "$it");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (z2) {
            frameLayout.bringToFront();
        }
    }
}
