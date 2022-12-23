package com.moovit.app.mot.center;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0928f0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.tabs.TabLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.activation.MotActivationDetailsActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.commons.view.pager.ViewPager;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.HashSet;
import java.util.Set;
import n00.C18492b;
import p543hq.C17474b;
import p688nu.C18633e;
import p688nu.C18636f;

public class MotActivationCenterActivity extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f38976Y = 0;

    /* renamed from: U */
    public final C15136a f38977U = new C15136a();

    /* renamed from: X */
    public ViewPager f38978X;

    public enum ActivationStateTab {
        CURRENT(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, R.string.payment_mot_my_rides_active_tab),
        HISTORY("history", R.string.payment_mot_my_rides_history_tab);
        
        /* access modifiers changed from: private */
        public final String analyticsType;
        /* access modifiers changed from: private */
        public final int title;

        private ActivationStateTab(String str, int i) {
            C21100e.m49373x(str, "analyticsType");
            this.analyticsType = str;
            this.title = i;
        }
    }

    /* renamed from: com.moovit.app.mot.center.MotActivationCenterActivity$a */
    public class C15136a extends ViewPager.SimpleOnPageChangeListener {
        public C15136a() {
        }

        public final void onPageSelected(int i) {
            int b = MotActivationCenterActivity.this.f38978X.mo47353b(i);
            MotActivationCenterActivity motActivationCenterActivity = MotActivationCenterActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, b);
            aVar.mo49945m(AnalyticsAttributeKey.TYPE, C15138c.f38982i[b].analyticsType);
            motActivationCenterActivity.mo44545v2(aVar.mo49933a());
        }
    }

    /* renamed from: com.moovit.app.mot.center.MotActivationCenterActivity$b */
    public static /* synthetic */ class C15137b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38980a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38981b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                com.moovit.app.mot.center.MotActivationCenterActivity$ActivationStateTab[] r0 = com.moovit.app.mot.center.MotActivationCenterActivity.ActivationStateTab.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38981b = r0
                r1 = 1
                com.moovit.app.mot.center.MotActivationCenterActivity$ActivationStateTab r2 = com.moovit.app.mot.center.MotActivationCenterActivity.ActivationStateTab.CURRENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f38981b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.mot.center.MotActivationCenterActivity$ActivationStateTab r3 = com.moovit.app.mot.center.MotActivationCenterActivity.ActivationStateTab.HISTORY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.moovit.app.mot.model.MotActivation$Status[] r2 = com.moovit.app.mot.model.MotActivation.Status.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f38980a = r2
                com.moovit.app.mot.model.MotActivation$Status r3 = com.moovit.app.mot.model.MotActivation.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f38980a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.moovit.app.mot.model.MotActivation$Status r2 = com.moovit.app.mot.model.MotActivation.Status.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f38980a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.moovit.app.mot.model.MotActivation$Status r1 = com.moovit.app.mot.model.MotActivation.Status.HISTORICAL     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.mot.center.MotActivationCenterActivity.C15137b.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.mot.center.MotActivationCenterActivity$c */
    public static class C15138c extends C0928f0 {

        /* renamed from: i */
        public static final ActivationStateTab[] f38982i = {ActivationStateTab.CURRENT, ActivationStateTab.HISTORY};

        /* renamed from: h */
        public final Context f38983h;

        public C15138c(Context context, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f38983h = context;
        }

        /* renamed from: a */
        public final Fragment mo4098a(int i) {
            ActivationStateTab activationStateTab = f38982i[i];
            int i2 = C15137b.f38981b[activationStateTab.ordinal()];
            if (i2 == 1) {
                return new C18633e();
            }
            if (i2 == 2) {
                return new C18636f();
            }
            StringBuilder k = C13555b.m33972k("Unknown ride type: ");
            k.append(activationStateTab.name());
            throw new IllegalArgumentException(k.toString());
        }

        public final int getCount() {
            return f38982i.length;
        }

        public final CharSequence getPageTitle(int i) {
            return this.f38983h.getString(f38982i[i].title);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.mot_activation_center_activity);
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(true);
            supportActionBar.mo791m(true);
        }
        com.moovit.commons.view.pager.ViewPager viewPager = (com.moovit.commons.view.pager.ViewPager) findViewById(R.id.view_pager);
        this.f38978X = viewPager;
        viewPager.setAdapter(new C18492b((PagerAdapter) new C15138c(this, getSupportFragmentManager()), this.f38978X));
        this.f38978X.setCurrentLogicalItem(0);
        this.f38978X.addOnPageChangeListener(this.f38977U);
        ((TabLayout) findViewById(R.id.tabs)).setupWithViewPager(this.f38978X);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("MOT_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45523y2(MotActivation motActivation) {
        MotActivation.Status status = motActivation.f38990g;
        int i = C15137b.f38980a[status.ordinal()];
        if (i == 1) {
            startActivity(MotQrCodeViewerActivity.m38705y2(this, motActivation.f38985b, motActivation.f38989f));
        } else if (i == 2 || i == 3) {
            Intent intent = new Intent(this, MotActivationDetailsActivity.class);
            intent.putExtra("activation", motActivation);
            startActivity(intent);
        } else {
            throw new IllegalStateException("Unknown activation status: " + status);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.SELECTED_ID, motActivation.f38985b);
        aVar.mo49939g(AnalyticsAttributeKey.STATUS, motActivation.f38990g.name());
        mo44545v2(aVar.mo49933a());
    }
}
