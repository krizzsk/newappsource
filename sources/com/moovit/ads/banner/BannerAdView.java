package com.moovit.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appboy.models.outgoing.AttributionData;
import com.moovit.ads.BannerAd;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p920xp.C20552a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo59060d2 = {"Lcom/moovit/ads/banner/BannerAdView;", "Lcom/moovit/ads/BannerAd;", "B", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ad", "Lbf0/d;", "setBannerAd", "(Lcom/moovit/ads/BannerAd;)V", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class BannerAdView<B extends BannerAd> extends ConstraintLayout {

    /* renamed from: h */
    public B f37379h;

    /* renamed from: i */
    public C20552a f37380i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BannerAdView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            r4 = r4 & 4
            r5 = 0
            if (r4 == 0) goto L_0x000b
            r3 = 0
        L_0x000b:
            java.lang.String r4 = "context"
            mf0.C24362h.m61211f(r1, r4)
            r0.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ads.banner.BannerAdView.<init>(android.content.Context, android.util.AttributeSet, int, int, int):void");
    }

    /* renamed from: c */
    public abstract void mo44652c(B b);

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C20552a aVar = this.f37380i;
        if (aVar != null) {
            aVar.mo52606b();
        }
    }

    public final void setBannerAd(B b) {
        C20552a aVar;
        C24362h.m61211f(b, AttributionData.CREATIVE_KEY);
        if (!C24362h.m61206a(b, this.f37379h)) {
            this.f37379h = b;
            Context context = getContext();
            C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
            this.f37380i = new C20552a(context, b.mo44629b());
            if (isAttachedToWindow() && (aVar = this.f37380i) != null) {
                aVar.mo52606b();
            }
            mo44652c(b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }
}
