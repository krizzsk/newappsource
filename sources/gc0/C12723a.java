package gc0;

import ac0.C7557a;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ce0.C21100e;
import com.umo.ads.p350u.zzs;
import lc0.C12860c;
import mf0.C24362h;
import p043ch.qos.logback.classic.Logger;

/* renamed from: gc0.a */
public final /* synthetic */ class C12723a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C12724b f31422b;

    /* renamed from: c */
    public final /* synthetic */ FrameLayout f31423c;

    /* renamed from: d */
    public final /* synthetic */ boolean f31424d;

    public /* synthetic */ C12723a(C12724b bVar, FrameLayout frameLayout, boolean z) {
        this.f31422b = bVar;
        this.f31423c = frameLayout;
        this.f31424d = z;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        zzs zzs;
        C12724b bVar = this.f31422b;
        FrameLayout frameLayout = this.f31423c;
        boolean z = this.f31424d;
        C24362h.m61211f(bVar, "this$0");
        C24362h.m61211f(frameLayout, "$vpaidLayout");
        C12860c cVar = bVar.f31441r;
        if (cVar != null && (layoutParams = cVar.getLayoutParams()) != null) {
            layoutParams.width = frameLayout.getWidth();
            layoutParams.height = frameLayout.getHeight();
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VPAID Layout Params");
            J0.append(bVar.f31446w);
            J0.append(": W: ");
            J0.append(layoutParams.width);
            J0.append(", H: ");
            J0.append(layoutParams.height);
            logger.mo6666c(J0.toString());
            if (z) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
                if (bVar.mo39529j()) {
                    zzs = zzs.THUMBNAIL;
                } else {
                    zzs = zzs.FULLSCREEN;
                }
                bVar.mo39521a(layoutParams, zzs);
            }
        }
    }
}
