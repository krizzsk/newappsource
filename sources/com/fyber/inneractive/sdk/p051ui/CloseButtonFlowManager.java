package com.fyber.inneractive.sdk.p051ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;

/* renamed from: com.fyber.inneractive.sdk.ui.CloseButtonFlowManager */
public class CloseButtonFlowManager {

    /* renamed from: a */
    public final View f12787a;

    /* renamed from: b */
    public final TextView f12788b;

    /* renamed from: c */
    public final View f12789c;

    /* renamed from: d */
    public final ImageView f12790d;

    /* renamed from: e */
    public final FrameLayout f12791e;

    /* renamed from: com.fyber.inneractive.sdk.ui.CloseButtonFlowManager$a */
    public class C3659a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ InneractiveFullscreenAdActivity f12792a;

        public C3659a(CloseButtonFlowManager closeButtonFlowManager, InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
            this.f12792a = inneractiveFullscreenAdActivity;
        }

        public void onClick(View view) {
            this.f12792a.dismissAd(true);
        }
    }

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View findViewById = inneractiveFullscreenAdActivity.findViewById(C2524R.C2526id.ia_fl_close_button);
        this.f12787a = findViewById;
        this.f12788b = (TextView) inneractiveFullscreenAdActivity.findViewById(C2524R.C2526id.ia_tv_close_button);
        View findViewById2 = inneractiveFullscreenAdActivity.findViewById(C2524R.C2526id.ia_clickable_close_button);
        this.f12789c = findViewById2;
        this.f12790d = (ImageView) inneractiveFullscreenAdActivity.findViewById(C2524R.C2526id.ia_iv_close_button);
        this.f12791e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(C2524R.C2526id.close_button_container);
        findViewById.setVisibility(8);
        findViewById2.setOnClickListener(new C3659a(this, inneractiveFullscreenAdActivity));
    }
}
