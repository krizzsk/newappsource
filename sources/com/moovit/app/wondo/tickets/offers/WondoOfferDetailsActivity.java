package com.moovit.app.wondo.tickets.offers;

import android.content.Intent;
import android.os.Bundle;
import b00.C13556a;
import ci0.C21211f;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationType;
import com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenActivity;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.tranzmate.R;
import p881vy.C20251e;
import p881vy.C20252f;
import p906wz.C20431c;
import p906wz.C20436g;

public class WondoOfferDetailsActivity extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f40747Y = 0;

    /* renamed from: U */
    public final C15665a f40748U = new C15665a();

    /* renamed from: X */
    public C13556a f40749X = null;

    /* renamed from: com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity$a */
    public class C15665a extends C21211f {
        public C15665a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C20251e eVar = (C20251e) cVar;
            WondoOfferDetailsActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20251e eVar = (C20251e) cVar;
            C20252f fVar = (C20252f) gVar;
            WondoOfferDetailsActivity wondoOfferDetailsActivity = WondoOfferDetailsActivity.this;
            int i = WondoOfferDetailsActivity.f40747Y;
            wondoOfferDetailsActivity.getClass();
            WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo = fVar.f51356m;
            if (wondoFullScreenDisplayInfo != null) {
                wondoOfferDetailsActivity.startActivity(WondoFullScreenActivity.m39967y2(wondoOfferDetailsActivity, wondoFullScreenDisplayInfo));
                wondoOfferDetailsActivity.finish();
                return;
            }
            wondoOfferDetailsActivity.startActivityForResult(RideSharingRegistrationActivity.m39024z2(wondoOfferDetailsActivity, RideSharingRegistrationType.PURCHASE, fVar.f51357n, "offer_purchase"), 1745);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_offer_details_activity);
        mo46733y2();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1745) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && this.f37299H) {
            mo46733y2();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* renamed from: y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46733y2() {
        /*
            r6 = this;
            r0 = 2131363874(0x7f0a0822, float:1.834757E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.core.widget.ContentLoadingProgressBar r0 = (androidx.core.widget.ContentLoadingProgressBar) r0
            r0.mo3436b()
            r0 = 2131362232(0x7f0a01b8, float:1.8344239E38)
            android.view.View r0 = r6.findViewById(r0)
            r1 = 4
            r0.setVisibility(r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 != 0) goto L_0x001e
            goto L_0x0043
        L_0x001e:
            java.lang.String r1 = r0.getAction()
            java.lang.String r2 = "android.intent.action.VIEW"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0045
            android.net.Uri r1 = r0.getData()
            if (r1 == 0) goto L_0x0045
            android.net.Uri r0 = r0.getData()
            java.lang.String r0 = r0.getLastPathSegment()
            boolean r1 = p977zz.C20964s0.m49089g(r0)
            if (r1 == 0) goto L_0x0043
            com.moovit.network.model.ServerId r0 = com.moovit.network.model.ServerId.m11392b(r0)
            goto L_0x004d
        L_0x0043:
            r0 = 0
            goto L_0x004d
        L_0x0045:
            java.lang.String r1 = "offer_id"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.moovit.network.model.ServerId r0 = (com.moovit.network.model.ServerId) r0
        L_0x004d:
            r1 = 3
            if (r0 != 0) goto L_0x005c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing offer id parameter!"
            r0.<init>(r2)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)
            goto L_0x008d
        L_0x005c:
            ry.e r2 = p785ry.C19385e.f49315c
            com.google.android.gms.tasks.Task r2 = r2.mo51792b()
            java.util.concurrent.ExecutorService r3 = com.moovit.MoovitExecutors.COMPUTATION
            e0.r0 r4 = new e0.r0
            r5 = 11
            r4.<init>(r5)
            com.google.android.gms.tasks.Task r2 = r2.onSuccessTask(r3, r4)
            ry.c r4 = new ry.c
            r5 = 0
            r4.<init>(r5, r0)
            com.google.android.gms.tasks.Task r2 = r2.onSuccessTask(r3, r4)
            au.e r4 = new au.e
            r5 = 10
            r4.<init>(r0, r5)
            com.google.android.gms.tasks.Task r0 = r2.onSuccessTask(r3, r4)
            at.b r2 = new at.b
            r2.<init>(r6, r1)
            com.google.android.gms.tasks.Task r0 = r0.addOnSuccessListener((android.app.Activity) r6, r2)
        L_0x008d:
            ff.m r2 = new ff.m
            r3 = 7
            r2.<init>(r6, r3)
            com.google.android.gms.tasks.Task r0 = r0.addOnSuccessListener((android.app.Activity) r6, r2)
            xf.j r2 = new xf.j
            r2.<init>(r6, r1)
            r0.addOnFailureListener((android.app.Activity) r6, (com.google.android.gms.tasks.OnFailureListener) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity.mo46733y2():void");
    }
}
