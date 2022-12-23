package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.core.VideoCapture;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.room.C1258c;
import com.appboy.p044ui.inappmessage.InAppMessageWebViewClient;
import com.google.android.exoplayer2.p052ui.C4037f;
import com.google.android.exoplayer2.p052ui.C4060z;
import com.google.android.exoplayer2.p052ui.DefaultTimeBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.tod.order.TodOrderActivity;
import com.moovit.app.useraccount.ConnectPopUpActivity;
import com.moovit.payment.invoices.AccountInvoicesActivity;
import com.umo.ads.p350u.zzu;
import fc0.C12669a;
import fc0.C12675e;
import hc0.C12753b;
import java.util.Iterator;
import jc0.C12804b;
import kc0.C12840e;
import kc0.C12844i;
import mf0.C24362h;
import p030bo.app.C1565e2;
import p030bo.app.C1660p1;
import p087fb.C4716a;
import p637lq.C18253d;
import p684nq.C18584e;
import p695od.C18728c;

/* renamed from: androidx.appcompat.widget.m1 */
public final /* synthetic */ class C0436m1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f1574b;

    /* renamed from: c */
    public final /* synthetic */ Object f1575c;

    public /* synthetic */ C0436m1(Object obj, int i) {
        this.f1574b = i;
        this.f1575c = obj;
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        Activity activity = null;
        switch (this.f1574b) {
            case 0:
                ((C0444o1) this.f1575c).mo2174c(false);
                return;
            case 1:
                for (DeferrableSurface b : ((ProcessingCaptureSession) this.f1575c).f1751e) {
                    b.mo2451b();
                }
                return;
            case 2:
                ((HandlerThread) this.f1575c).quitSafely();
                return;
            case 3:
                VideoCapture.C0543c cVar = VideoCapture.f1872s;
                ((VideoCapture) this.f1575c).mo2396D();
                return;
            case 4:
                ((C18728c) this.f1575c).cancel(true);
                return;
            case 5:
                ((C1258c) this.f1575c).getClass();
                throw null;
            case 6:
                ((C1565e2) this.f1575c).m4119p();
                return;
            case 7:
                C1660p1.m4575a((Context) this.f1575c);
                return;
            case 8:
                ((InAppMessageWebViewClient) this.f1575c).lambda$new$0();
                return;
            case 9:
                ((MediaCodec) this.f1575c).start();
                return;
            case 10:
                ((C4716a) this.f1575c).getClass();
                throw null;
            case 11:
                C4060z zVar = (C4060z) this.f1575c;
                ViewGroup viewGroup = zVar.f14524e;
                if (viewGroup != null) {
                    if (zVar.f14517A) {
                        i3 = 0;
                    } else {
                        i3 = 4;
                    }
                    viewGroup.setVisibility(i3);
                }
                View view = zVar.f14529j;
                if (view != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int dimensionPixelSize = zVar.f14520a.getResources().getDimensionPixelSize(C4037f.exo_styled_progress_margin_bottom);
                    if (zVar.f14517A) {
                        dimensionPixelSize = 0;
                    }
                    marginLayoutParams.bottomMargin = dimensionPixelSize;
                    zVar.f14529j.setLayoutParams(marginLayoutParams);
                    View view2 = zVar.f14529j;
                    if (view2 instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                        if (zVar.f14517A) {
                            if (defaultTimeBar.f14167F.isStarted()) {
                                defaultTimeBar.f14167F.cancel();
                            }
                            defaultTimeBar.f14169H = true;
                            defaultTimeBar.f14168G = BitmapDescriptorFactory.HUE_RED;
                            defaultTimeBar.invalidate(defaultTimeBar.f14178b);
                        } else {
                            int i4 = zVar.f14545z;
                            if (i4 == 1) {
                                if (defaultTimeBar.f14167F.isStarted()) {
                                    defaultTimeBar.f14167F.cancel();
                                }
                                defaultTimeBar.f14169H = false;
                                defaultTimeBar.f14168G = BitmapDescriptorFactory.HUE_RED;
                                defaultTimeBar.invalidate(defaultTimeBar.f14178b);
                            } else if (i4 != 3) {
                                if (defaultTimeBar.f14167F.isStarted()) {
                                    defaultTimeBar.f14167F.cancel();
                                }
                                defaultTimeBar.f14169H = false;
                                defaultTimeBar.f14168G = 1.0f;
                                defaultTimeBar.invalidate(defaultTimeBar.f14178b);
                            }
                        }
                    }
                }
                Iterator it = zVar.f14544y.iterator();
                while (it.hasNext()) {
                    View view3 = (View) it.next();
                    if (!zVar.f14517A || !C4060z.m10923j(view3)) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    view3.setVisibility(i2);
                }
                return;
            case 12:
                C18253d dVar = (C18253d) this.f1575c;
                int i5 = C18253d.f46570t;
                Context requireContext = dVar.requireContext();
                int i6 = ConnectPopUpActivity.f40551l0;
                dVar.startActivity(new Intent(requireContext, ConnectPopUpActivity.class));
                return;
            case 13:
                int i7 = C18584e.f47313w;
                ((C18584e) this.f1575c).mo50977B2();
                return;
            case 14:
                ((TodOrderActivity) this.f1575c).f40339m0.setVisibility(4);
                return;
            case 15:
                int i8 = AccountInvoicesActivity.f42708l0;
                ((AccountInvoicesActivity) this.f1575c).mo48999y2();
                return;
            default:
                C12844i iVar = (C12844i) this.f1575c;
                int i9 = C12844i.f31735I;
                C24362h.m61211f(iVar, "this$0");
                if (!iVar.f31762t) {
                    C12804b bVar = iVar.f31759q;
                    if (bVar != null) {
                        bVar.f31668c.removeView(iVar.f31736A);
                    }
                    iVar.getHandler().postDelayed(new C12840e(iVar, 1), 100);
                } else {
                    C12804b bVar2 = iVar.f31759q;
                    if (bVar2 != null) {
                        bVar2.f31668c.removeView(iVar.f31765w);
                    }
                    C12675e eVar = iVar.f31765w;
                    if (eVar != null) {
                        eVar.stopLoading();
                        eVar.loadUrl("");
                    }
                    iVar.f31765w = null;
                    iVar.f31763u = null;
                    iVar.f31762t = false;
                }
                iVar.f31759q = null;
                C12669a aVar = iVar.f31755m;
                zzu zzu = zzu.DEFAULT;
                iVar.mo39680d(aVar, zzu);
                C12669a aVar2 = iVar.f31755m;
                if (aVar2 != null) {
                    aVar2.mo39455b(zzu);
                }
                Context context = iVar.getContext();
                if (context != null && (context instanceof Activity)) {
                    activity = context;
                }
                Activity activity2 = activity;
                if (!(activity2 == null || (i = iVar.f31767y) == iVar.f31766x)) {
                    activity2.setRequestedOrientation(i);
                }
                iVar.mo39696q();
                C12844i.C12846b bVar3 = iVar.f31745c;
                if (bVar3 != null) {
                    ((C12753b) bVar3).zze(iVar.f31744b);
                    return;
                }
                return;
        }
    }
}
