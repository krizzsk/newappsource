package p304x;

import a70.C13396b;
import android.widget.RelativeLayout;
import androidx.camera.camera2.internal.C0520l;
import androidx.camera.core.C0642t;
import androidx.camera.core.SurfaceRequest;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.exoplayer2.p052ui.PlayerView;
import com.google.firebase.installations.C14459a;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.editing.entity.AbstractEditEntityActivity;
import com.moovit.app.wondo.tickets.codes.WondoCodeDetailsActivity;
import com.moovit.app.wondo.tickets.invite.WondoInviteActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import com.umo.ads.p348o.zzc;
import com.veriff.sdk.camera.core.internal.CameraUseCaseAdapter;
import gc0.C12724b;
import java.util.LinkedHashSet;
import java.util.List;
import jc0.C12804b;
import kc0.C12844i;
import mf0.C24362h;
import p099ga.C4874d1;
import p543hq.C17474b;
import p695od.C18728c;
import p777rq.C19315e;

/* renamed from: x.b1 */
public final /* synthetic */ class C7029b1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21872b;

    /* renamed from: c */
    public final /* synthetic */ Object f21873c;

    public /* synthetic */ C7029b1(Object obj, int i) {
        this.f21872b = i;
        this.f21873c = obj;
    }

    public final void run() {
        RelativeLayout relativeLayout;
        switch (this.f21872b) {
            case 0:
                for (C0520l lVar : (LinkedHashSet) this.f21873c) {
                    lVar.getStateCallback().mo2338g(lVar);
                }
                return;
            case 1:
                ((C0642t) this.f21873c).mo2580b();
                return;
            case 2:
                ((SurfaceRequest) this.f21873c).f1844e.cancel(true);
                return;
            case 3:
                Carousel carousel = (Carousel) this.f21873c;
                carousel.f2601q.setTransitionDuration(carousel.f2596D);
                if (carousel.f2595C < carousel.f2600p) {
                    MotionLayout motionLayout = carousel.f2601q;
                    int i = carousel.f2606v;
                    int i2 = carousel.f2596D;
                    if (!motionLayout.isAttachedToWindow()) {
                        if (motionLayout.f2719y0 == null) {
                            motionLayout.f2719y0 = new MotionLayout.C0715h();
                        }
                        motionLayout.f2719y0.f2755d = i;
                        return;
                    }
                    motionLayout.mo2924B(i, i2);
                    return;
                }
                MotionLayout motionLayout2 = carousel.f2601q;
                int i3 = carousel.f2607w;
                int i4 = carousel.f2596D;
                if (!motionLayout2.isAttachedToWindow()) {
                    if (motionLayout2.f2719y0 == null) {
                        motionLayout2.f2719y0 = new MotionLayout.C0715h();
                    }
                    motionLayout2.f2719y0.f2755d = i3;
                    return;
                }
                motionLayout2.mo2924B(i3, i4);
                return;
            case 4:
                int i5 = C4874d1.C4876b.f16410b;
                ((C4874d1) this.f21873c).mo20448c();
                return;
            case 5:
                Object obj = C14459a.f36530m;
                ((C14459a) this.f21873c).mo43365a(false);
                return;
            case 6:
                int i6 = C19315e.f49157u;
                ((C19315e) this.f21873c).mo50553o2();
                return;
            case 7:
                AbstractEditEntityActivity abstractEditEntityActivity = (AbstractEditEntityActivity) this.f21873c;
                int i7 = AbstractEditEntityActivity.f37951E0;
                abstractEditEntityActivity.startActivity(WebViewActivity.m18168y2(abstractEditEntityActivity, abstractEditEntityActivity.getString(R.string.photos_compliance_url), abstractEditEntityActivity.getString(R.string.photos_compliance_title)));
                return;
            case 8:
                WondoCodeDetailsActivity wondoCodeDetailsActivity = (WondoCodeDetailsActivity) this.f21873c;
                int i8 = WondoCodeDetailsActivity.f40677X;
                wondoCodeDetailsActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_code_terms_clicked");
                wondoCodeDetailsActivity.mo44545v2(aVar.mo49933a());
                wondoCodeDetailsActivity.startActivity(WebViewActivity.m18168y2(wondoCodeDetailsActivity, wondoCodeDetailsActivity.f40678U.f40698d.f40709j.toString(), wondoCodeDetailsActivity.getString(R.string.wondo_code_details_terms_and_conditions_title)));
                return;
            case 9:
                WondoInviteActivity wondoInviteActivity = (WondoInviteActivity) this.f21873c;
                int i9 = WondoInviteActivity.f40691Y;
                wondoInviteActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_invite_terms_clicked");
                wondoInviteActivity.mo44545v2(aVar2.mo49933a());
                wondoInviteActivity.startActivity(WebViewActivity.m18168y2(wondoInviteActivity, wondoInviteActivity.f40692U.f50320e, wondoInviteActivity.getString(R.string.wondo_code_details_terms_and_conditions_title)));
                return;
            case 11:
                int i11 = C13396b.f33246q;
                ListItemView listItemView = ((C13396b) this.f21873c).f33249p;
                if (listItemView != null) {
                    listItemView.setVisibility(8);
                    return;
                }
                return;
            case 12:
                C12724b bVar = (C12724b) this.f21873c;
                C24362h.m61211f(bVar, "this$0");
                RelativeLayout relativeLayout2 = bVar.f31434k;
                if (relativeLayout2 != null) {
                    relativeLayout2.bringToFront();
                    return;
                }
                return;
            case 13:
                zzc zzc = (zzc) this.f21873c;
                C24362h.m61211f(zzc, "this$0");
                C12804b bVar2 = zzc.f30867w;
                if (bVar2 != null) {
                    bVar2.dismiss();
                    zzc.mo35802J();
                    PlayerView playerView = zzc.f30857m;
                    if (!(playerView == null || (relativeLayout = zzc.f30833A) == null)) {
                        relativeLayout.addView(playerView);
                    }
                }
                zzc.f30867w = null;
                return;
            case 14:
                C12844i.m32629l((C12844i) this.f21873c);
                return;
            case 15:
                ((C18728c) this.f21873c).cancel(true);
                return;
            default:
                CameraUseCaseAdapter.lambda$notifyAttachedUseCasesChange$0((List) this.f21873c);
                return;
        }
    }
}
