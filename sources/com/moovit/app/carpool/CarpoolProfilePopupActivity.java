package com.moovit.app.carpool;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import p067e1.C4472b;
import p472er.C16862d;
import p543hq.C17474b;
import p583jk.C17884p;
import p977zz.C20943i;
import r10.C19220d;
import r10.C19221e;

public class CarpoolProfilePopupActivity extends MoovitAppActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f37640l0 = 0;

    /* renamed from: U */
    public Uri f37641U;

    /* renamed from: X */
    public int f37642X;

    /* renamed from: Y */
    public ImageView f37643Y;

    /* renamed from: Z */
    public ViewGroup f37644Z;

    /* renamed from: com.moovit.app.carpool.CarpoolProfilePopupActivity$a */
    public class C14786a implements Runnable {
        public C14786a() {
        }

        public final void run() {
            CarpoolProfilePopupActivity.this.supportFinishAfterTransition();
        }
    }

    /* renamed from: y2 */
    public static C4472b.C4473a m37193y2(MoovitAppActivity moovitAppActivity, View view) {
        Activity activity;
        Context context = moovitAppActivity;
        if (!C20943i.m49051d(21)) {
            return new C4472b.C4473a(C4472b.C4474b.m11688b(view, 0, 0, view.getWidth(), view.getHeight()));
        }
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        C21100e.m49371w(activity);
        return new C4472b.C4473a(C4472b.C4475c.m11690a(activity, view, "profileImage"));
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        mo44823z2(true);
        return true;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.carpool_profile_popup_activity);
        Intent intent = getIntent();
        if (intent != null) {
            this.f37641U = (Uri) intent.getParcelableExtra("profile.image.url_extra");
            this.f37642X = intent.getIntExtra("profile.image.url.placeholder.drawable_extra", 0);
        }
        this.f37643Y = (ImageView) findViewById(R.id.profile_image);
        this.f37644Z = (ViewGroup) findViewById(R.id.root);
        if (this.f37641U == null) {
            this.f37643Y.setImageResource(this.f37642X);
        } else {
            C19221e Y = C17884p.m44354Y(this.f37643Y);
            ((C19220d) Y.mo10871m().mo10853W(this.f37641U)).mo10850T(this.f37643Y);
        }
        mo44823z2(false);
        this.f37644Z.setOnClickListener(new C16862d(this));
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        ServerId serverId = (ServerId) getIntent().getParcelableExtra("profile.ride.id");
        if (serverId != null) {
            m1.mo49939g(AnalyticsAttributeKey.CARPOOL_RIDE_ID, serverId.mo19751c());
        }
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("CARPOOL_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo44823z2(boolean z) {
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.f37644Z.getBackground();
        if (z) {
            int integer = getResources().getInteger(17694720);
            transitionDrawable.reverseTransition(integer);
            this.f37644Z.postDelayed(new C14786a(), (long) integer);
            return;
        }
        transitionDrawable.startTransition(getResources().getInteger(17694720));
    }
}
