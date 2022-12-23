package com.moovit.app.ads;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import p883wc.C20289a;
import p921xq.C20558d;
import p977zz.C20964s0;

public class MoovitNativeAdView extends FrameLayout {

    /* renamed from: i */
    public static final /* synthetic */ int f37482i = 0;

    /* renamed from: b */
    public final NativeAdView f37483b;

    /* renamed from: c */
    public final TextView f37484c;

    /* renamed from: d */
    public final TextView f37485d;

    /* renamed from: e */
    public final RatingBar f37486e;

    /* renamed from: f */
    public final ImageView f37487f;

    /* renamed from: g */
    public final Button f37488g;

    /* renamed from: h */
    public AdSource f37489h;

    public MoovitNativeAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nativeAdStyle);
    }

    private void setRatingBar(Double d) {
        this.f37485d.setVisibility(8);
        this.f37486e.setVisibility(0);
        this.f37486e.setRating(d.floatValue());
        this.f37483b.setStarRatingView(this.f37486e);
    }

    /* renamed from: a */
    public final void mo44738a(MoovitActivity moovitActivity, C20558d dVar) {
        if (dVar == null) {
            setVisibility(8);
            removeAllViews();
            return;
        }
        Application application = moovitActivity.getApplication();
        if (application instanceof MoovitApplication) {
            C14766z zVar = (C14766z) dVar.f51994f;
            zVar.f37584b.f37500b = new NativeAdListener(moovitActivity, (MoovitApplication) application, dVar);
            NativeAd nativeAd = zVar.f37583a;
            this.f37483b.setIconView(this.f37487f);
            this.f37483b.setHeadlineView(this.f37484c);
            this.f37483b.setCallToActionView(this.f37488g);
            NativeAd.Image icon = nativeAd.getIcon();
            if (icon != null) {
                this.f37487f.setImageDrawable(icon.getDrawable());
                this.f37487f.setVisibility(0);
            } else {
                this.f37487f.setVisibility(8);
            }
            UiUtils.m40234B(this.f37484c, nativeAd.getHeadline());
            UiUtils.m40234B(this.f37488g, nativeAd.getCallToAction());
            Double starRating = nativeAd.getStarRating();
            if (starRating == null || starRating.doubleValue() <= 0.0d) {
                String advertiser = nativeAd.getAdvertiser();
                String store = nativeAd.getStore();
                this.f37485d.setVisibility(0);
                this.f37486e.setVisibility(8);
                if (!C20964s0.m49090h(advertiser)) {
                    this.f37483b.setAdvertiserView(this.f37485d);
                    this.f37485d.setText(advertiser);
                } else if (!C20964s0.m49090h(store)) {
                    this.f37483b.setStoreView(this.f37485d);
                    this.f37485d.setText(store);
                } else {
                    this.f37485d.setText("");
                }
            } else {
                setRatingBar(starRating);
            }
            this.f37483b.setNativeAd(nativeAd);
            removeAllViews();
            addView(this.f37483b);
            setVisibility(0);
        }
    }

    public MoovitNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, 2131953326), attributeSet, i);
        NativeAdView nativeAdView = (NativeAdView) LayoutInflater.from(getContext()).inflate(R.layout.native_ad_view_layout, this, false);
        this.f37483b = nativeAdView;
        this.f37484c = (TextView) nativeAdView.findViewById(R.id.primary);
        this.f37485d = (TextView) nativeAdView.findViewById(R.id.secondary);
        this.f37486e = (RatingBar) nativeAdView.findViewById(R.id.rating_bar);
        this.f37487f = (ImageView) nativeAdView.findViewById(R.id.icon);
        this.f37488g = (Button) nativeAdView.findViewById(R.id.cta);
    }
}
