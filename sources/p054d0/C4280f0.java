package p054d0;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.appboy.Appboy;
import com.appboy.events.IValueCallback;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.umo.ads.p350u.zzs;
import com.veriff.sdk.camera.core.impl.DeferrableSurface;
import gc0.C12724b;
import hc0.C12753b;
import java.util.Iterator;
import java.util.List;
import kc0.C12844i;
import lc0.C12860c;
import mf0.C24362h;
import p277ub.C6774a0;
import p290vb.C6953n;
import p290vb.C6955o;

/* renamed from: d0.f0 */
public final /* synthetic */ class C4280f0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15202b;

    /* renamed from: c */
    public final /* synthetic */ Object f15203c;

    /* renamed from: d */
    public final /* synthetic */ Object f15204d;

    public /* synthetic */ C4280f0(int i, Object obj, Object obj2) {
        this.f15202b = i;
        this.f15203c = obj;
        this.f15204d = obj2;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        zzs zzs;
        switch (this.f15202b) {
            case 1:
                ((Appboy) this.f15203c).m5387a((IValueCallback) this.f15204d);
                return;
            case 2:
                ((Appboy) this.f15203c).m5399b((Intent) this.f15204d);
                return;
            case 3:
                C6953n nVar = ((C6953n.C6954a) this.f15203c).f21703b;
                int i = C6774a0.f20959a;
                nVar.mo20414j((C6955o) this.f15204d);
                return;
            case 4:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f15203c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f15204d;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f14649h;
                Surface surface = sphericalGLSurfaceView.f14650i;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.f14649h = surfaceTexture;
                sphericalGLSurfaceView.f14650i = surface2;
                Iterator<SphericalGLSurfaceView.C4081b> it = sphericalGLSurfaceView.f14643b.iterator();
                while (it.hasNext()) {
                    it.next().mo16741c(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 5:
                ((FirebaseMessaging) this.f15203c).lambda$getToken$4((TaskCompletionSource) this.f15204d);
                return;
            case 6:
                C12724b bVar = (C12724b) this.f15203c;
                FrameLayout frameLayout = (FrameLayout) this.f15204d;
                C24362h.m61211f(bVar, "this$0");
                C24362h.m61211f(frameLayout, "$it");
                C12860c cVar = bVar.f31441r;
                C24362h.m61208c(cVar);
                ViewGroup.LayoutParams layoutParams2 = cVar.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = frameLayout.getWidth();
                }
                if (layoutParams2 != null) {
                    layoutParams2.height = frameLayout.getHeight();
                }
                C12860c cVar2 = bVar.f31441r;
                if (cVar2 != null) {
                    cVar2.setLayoutParams(layoutParams2);
                }
                C12860c cVar3 = bVar.f31441r;
                if (cVar3 == null) {
                    layoutParams = null;
                } else {
                    layoutParams = cVar3.getLayoutParams();
                }
                C24362h.m61208c(layoutParams);
                if (bVar.mo39529j()) {
                    zzs = zzs.THUMBNAIL;
                } else {
                    zzs = zzs.FULLSCREEN;
                }
                bVar.mo39521a(layoutParams, zzs);
                return;
            case 7:
                C12844i iVar = (C12844i) this.f15203c;
                Intent intent = (Intent) this.f15204d;
                int i2 = C12844i.f31735I;
                C24362h.m61211f(iVar, "this$0");
                C24362h.m61211f(intent, "$intent");
                List<ResolveInfo> queryIntentActivities = iVar.getContext().getPackageManager().queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX);
                C24362h.m61210e(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
                if (!queryIntentActivities.isEmpty()) {
                    iVar.getContext().startActivity(intent);
                    C12844i.C12846b bVar2 = iVar.f31745c;
                    if (bVar2 != null) {
                        ((C12753b) bVar2).mo39556H(iVar.f31744b);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((DeferrableSurface) this.f15203c).lambda$new$1((String) this.f15204d);
                return;
        }
    }
}
