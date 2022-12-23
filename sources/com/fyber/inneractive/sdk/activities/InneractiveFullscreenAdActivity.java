package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C2778l;
import com.fyber.inneractive.sdk.flow.C2790s;
import com.fyber.inneractive.sdk.interfaces.C2812c;
import com.fyber.inneractive.sdk.network.C2931r;
import com.fyber.inneractive.sdk.p051ui.CloseButtonFlowManager;
import com.fyber.inneractive.sdk.renderers.C3638k;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class InneractiveFullscreenAdActivity extends Activity implements C2812c.C2813a {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";

    /* renamed from: a */
    public ViewGroup f8995a;

    /* renamed from: b */
    public InneractiveAdSpot f8996b;

    /* renamed from: c */
    public C2812c f8997c;

    /* renamed from: d */
    public int f8998d = 0;

    /* renamed from: e */
    public int f8999e = 0;

    /* renamed from: f */
    public int f9000f = 0;

    /* renamed from: g */
    public boolean f9001g = false;

    /* renamed from: h */
    public CloseButtonFlowManager f9002h;

    public interface FullScreenRendererProvider {
        C2812c getFullscreenRenderer();
    }

    public interface OnInneractiveFullscreenAdDestroyListener {
        void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity);
    }

    /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$a */
    public class C2528a implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity$a$a */
        public class C2529a implements Runnable {
            public C2529a() {
            }

            public void run() {
                if (!InneractiveFullscreenAdActivity.this.isFinishing()) {
                    InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity = InneractiveFullscreenAdActivity.this;
                    String str = InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID;
                    inneractiveFullscreenAdActivity.mo12759a();
                }
            }
        }

        public C2528a() {
        }

        public void onSystemUiVisibilityChange(int i) {
            if ((i & 2) == 0) {
                C3714n.f12902b.postDelayed(new C2529a(), 3000);
            }
        }
    }

    /* renamed from: a */
    public final void mo12759a() {
        View decorView = getWindow().getDecorView();
        if ((decorView.getSystemUiVisibility() & 2) == 0) {
            decorView.setSystemUiVisibility(2818);
        }
        decorView.setOnSystemUiVisibilityChangeListener(new C2528a());
    }

    public void destroy() {
        if (!isFinishing() && this.f8995a != null) {
            finish();
        }
    }

    public void disableCloseButton() {
        CloseButtonFlowManager closeButtonFlowManager = this.f9002h;
        closeButtonFlowManager.f12789c.setVisibility(8);
        closeButtonFlowManager.f12787a.setVisibility(8);
    }

    public void dismissAd(boolean z) {
        this.f9001g = z;
        C2812c cVar = this.f8997c;
        if (cVar != null) {
            cVar.mo13575c(z);
        }
        finish();
    }

    public View getCloseButton() {
        return this.f9002h.f12791e;
    }

    public ViewGroup getLayout() {
        return this.f8995a;
    }

    public void initWindowFeatures(C2812c cVar) {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(RecyclerView.C1119a0.FLAG_IGNORE);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().addFlags(2);
        }
        if (cVar != null && (((C2778l) cVar) instanceof C3638k)) {
            setTheme(16973831);
            requestWindowFeature(67108864);
            requestWindowFeature(134217728);
            requestWindowFeature(Integer.MIN_VALUE);
        }
        mo12759a();
        C2619a0 a0Var = ((C2702y) this.f8996b.getAdContent().f9593d).f9427f;
        if (a0Var != null) {
            Orientation orientation = a0Var.f9251e;
            setActivityOrientation(orientation.allowOrientationChange, orientation);
        }
    }

    public boolean isCloseButtonDisplay() {
        if (this.f9002h.f12790d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void onBackPressed() {
        C2812c cVar = this.f8997c;
        if (cVar == null || !cVar.mo13356u()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2812c cVar = this.f8997c;
        if (cVar != null) {
            int i = configuration.orientation;
            if (i != this.f8998d) {
                this.f8998d = i;
                cVar.mo13353b();
                return;
            }
            int i2 = this.f8999e;
            int i3 = configuration.screenHeightDp;
            if (i2 != i3 || this.f9000f != configuration.screenWidthDp) {
                this.f8999e = i3;
                this.f9000f = configuration.screenWidthDp;
                cVar.mo13353b();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        String stringExtra = getIntent().getStringExtra("spotId");
        InneractiveAdSpot inneractiveAdSpot = null;
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.m9906e("%sSpot id must be provided as an extra before calling createActivity with InneractiveInterstitialAdActivty", IAlog.m9899a((Object) this));
        } else {
            InneractiveAdSpot spot = InneractiveAdSpotManager.get().getSpot(stringExtra);
            if (spot == null) {
                IAlog.m9903b("%sSpot id %s cannot be found in spot manager!", IAlog.m9899a((Object) this), stringExtra);
            }
            if (spot != null && spot.getAdContent() == null) {
                IAlog.m9902a("%sSpot does not have a content. Cannot start activity", IAlog.m9899a((Object) this));
            }
            if (!(spot == null || spot.getAdContent() == null)) {
                inneractiveAdSpot = spot;
            }
        }
        this.f8996b = inneractiveAdSpot;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || this.f8996b.getAdContent().f9593d == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            super.onCreate(bundle);
            finish();
            return;
        }
        InneractiveUnitController selectedUnitController = this.f8996b.getSelectedUnitController();
        if (selectedUnitController == null || !(selectedUnitController instanceof FullScreenRendererProvider)) {
            IAlog.m9906e("%sno appropriate unit controller found for full screen ad. Aborting", IAlog.m9899a((Object) this));
            super.onCreate(bundle);
            finish();
            return;
        }
        C2812c fullscreenRenderer = ((FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
        this.f8997c = fullscreenRenderer;
        initWindowFeatures(fullscreenRenderer);
        super.onCreate(bundle);
        IAlog.m9902a("%sInterstitial for spot id %s created", IAlog.m9899a((Object) this), this.f8996b.getLocalUniqueId());
        this.f8998d = getResources().getConfiguration().orientation;
        this.f8999e = getResources().getConfiguration().screenHeightDp;
        this.f9000f = getResources().getConfiguration().screenWidthDp;
        if (this.f8997c != null) {
            try {
                setContentView(C2524R.layout.ia_fullscreen_activity);
                this.f8995a = (ViewGroup) findViewById(C2524R.C2526id.ia_ad_content);
                this.f9002h = new CloseButtonFlowManager(this);
                C2812c cVar = this.f8997c;
                InneractiveAdSpot inneractiveAdSpot2 = this.f8996b;
                C2790s sVar = (C2790s) cVar;
                sVar.f9597a = inneractiveAdSpot2;
                sVar.f9598b = inneractiveAdSpot2.getAdContent();
                sVar.f9599c = inneractiveAdSpot2.getSelectedUnitController().getEventsListener();
                sVar.f9643u.f12817a = inneractiveAdSpot2;
                try {
                    this.f8997c.mo13351a(this, this);
                    this.f8996b.getAdContent().f9594e = true;
                } catch (InneractiveUnitController.AdDisplayError e) {
                    IAlog.m9906e("Interstitial Activity: %s", e.getMessage());
                    finish();
                } catch (Resources.NotFoundException e2) {
                    IAlog.m9906e("Interstitial Activity: %s", e2.getMessage());
                    finish();
                }
            } catch (Throwable th) {
                C2931r.m7254a(th, this.f8996b.getAdContent().f9590a, this.f8996b.getAdContent().mo13293c());
                finish();
            }
        } else {
            IAlog.m9906e("Interstitial Activity: Could not find an appropriate full screen ad renderer for content!", new Object[0]);
            finish();
        }
    }

    public void onDestroy() {
        InneractiveUnitController inneractiveUnitController;
        ViewGroup viewGroup = this.f8995a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f8995a = null;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f8996b;
        if (inneractiveAdSpot == null) {
            inneractiveUnitController = null;
        } else {
            inneractiveUnitController = inneractiveAdSpot.getSelectedUnitController();
        }
        if (inneractiveUnitController != null && (inneractiveUnitController instanceof OnInneractiveFullscreenAdDestroyListener)) {
            ((OnInneractiveFullscreenAdDestroyListener) inneractiveUnitController).onActivityDestroyed(this);
        }
        C2812c cVar = this.f8997c;
        if (cVar != null) {
            cVar.mo13355m();
            this.f8997c.destroy();
            this.f8997c = null;
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            C2812c cVar = this.f8997c;
            if (cVar != null) {
                cVar.mo13355m();
                this.f8997c.destroy();
                this.f8997c = null;
                return;
            }
            return;
        }
        C2812c cVar2 = this.f8997c;
        if (cVar2 != null) {
            cVar2.mo13579s();
        }
    }

    public void onResume() {
        super.onResume();
        C2812c cVar = this.f8997c;
        if (cVar != null) {
            cVar.mo13578o();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo12759a();
        }
    }

    public void setActivityOrientation(boolean z, Orientation orientation) {
        if (z && orientation.equals(Orientation.USER)) {
            setRequestedOrientation(13);
        } else if (z && orientation.equals(Orientation.NONE)) {
            setRequestedOrientation(getRequestedOrientation());
        } else if (orientation.equals(Orientation.LANDSCAPE)) {
            setRequestedOrientation(6);
        } else if (orientation.equals(Orientation.PORTRAIT)) {
            setRequestedOrientation(7);
        } else {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                setRequestedOrientation(7);
            } else if (i == 2) {
                setRequestedOrientation(6);
            }
        }
    }

    public void showCloseButton(boolean z, int i, int i2) {
        int i3;
        int i4;
        CloseButtonFlowManager closeButtonFlowManager = this.f9002h;
        if (z) {
            closeButtonFlowManager.f12787a.setAlpha(BitmapDescriptorFactory.HUE_RED);
            closeButtonFlowManager.f12790d.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        closeButtonFlowManager.f12788b.setText("");
        closeButtonFlowManager.f12788b.setVisibility(8);
        if (i >= 5) {
            int a = C3707l.m9956a(i);
            closeButtonFlowManager.f12790d.getLayoutParams().width = a;
            closeButtonFlowManager.f12790d.getLayoutParams().height = a;
        }
        if (i2 >= 5) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) closeButtonFlowManager.f12787a.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) closeButtonFlowManager.f12789c.getLayoutParams();
            int a2 = C3707l.m9956a(i2);
            int i5 = ((FrameLayout.LayoutParams) closeButtonFlowManager.f12790d.getLayoutParams()).width;
            int i6 = a2 - i5;
            if (a2 <= i5 || i6 <= (i4 = layoutParams.rightMargin)) {
                layoutParams2.width = a2;
                layoutParams2.height = a2;
                i3 = layoutParams.rightMargin;
                if (i6 < i3) {
                    i3 -= i6 / 2;
                }
            } else {
                int i7 = (i5 / 2) + (a2 / 2) + i4;
                layoutParams2.width = i7;
                layoutParams2.height = i7;
                layoutParams.gravity = 53;
                i3 = 0;
            }
            layoutParams2.setMargins(i3, i3, i3, i3);
            layoutParams2.gravity = 17;
        }
        closeButtonFlowManager.f12787a.setVisibility(0);
        closeButtonFlowManager.f12790d.setVisibility(0);
        closeButtonFlowManager.f12789c.setVisibility(0);
    }

    public void showCloseCountdown() {
        CloseButtonFlowManager closeButtonFlowManager = this.f9002h;
        closeButtonFlowManager.f12788b.setBackgroundResource(C2524R.C2525drawable.ia_round_overlay_bg);
        closeButtonFlowManager.f12787a.setVisibility(0);
        closeButtonFlowManager.f12788b.setVisibility(0);
        closeButtonFlowManager.f12790d.setVisibility(8);
        closeButtonFlowManager.f12789c.setVisibility(8);
    }

    public void updateCloseCountdown(int i) {
        CloseButtonFlowManager closeButtonFlowManager = this.f9002h;
        closeButtonFlowManager.getClass();
        if (i > 0) {
            closeButtonFlowManager.f12788b.setText(Integer.toString(i));
        }
    }

    public boolean wasDismissedByUser() {
        return this.f9001g;
    }
}
