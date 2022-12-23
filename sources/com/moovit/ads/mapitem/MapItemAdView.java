package com.moovit.ads.mapitem;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appboy.models.outgoing.AttributionData;
import com.moovit.ads.MapItemAd;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p393bq.C13653b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0007¨\u0006\r"}, mo59060d2 = {"Lcom/moovit/ads/mapitem/MapItemAdView;", "Lcom/moovit/ads/MapItemAd;", "A", "Landroidx/constraintlayout/widget/ConstraintLayout;", "ad", "Lbf0/d;", "setMapItemAd", "(Lcom/moovit/ads/MapItemAd;)V", "h", "Lcom/moovit/ads/MapItemAd;", "getAd", "()Lcom/moovit/ads/MapItemAd;", "setAd", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class MapItemAdView<A extends MapItemAd> extends ConstraintLayout {

    /* renamed from: h */
    public A f37395h;

    /* renamed from: i */
    public C13653b f37396i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MapItemAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MapItemAdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MapItemAdView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, int r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.ads.mapitem.MapItemAdView.<init>(android.content.Context, android.util.AttributeSet, int, int, int):void");
    }

    /* renamed from: c */
    public abstract void mo44673c(A a);

    public final A getAd() {
        return this.f37395h;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C13653b bVar = this.f37396i;
        if (bVar != null) {
            bVar.mo52606b();
        }
    }

    public final void setAd(A a) {
        this.f37395h = a;
    }

    public final void setMapItemAd(A a) {
        C13653b bVar;
        C24362h.m61211f(a, AttributionData.CREATIVE_KEY);
        if (!C24362h.m61206a(this.f37395h, a)) {
            this.f37395h = a;
            Context context = getContext();
            C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
            this.f37396i = new C13653b(context, a.mo44644b());
            if (isAttachedToWindow() && (bVar = this.f37396i) != null) {
                bVar.mo52606b();
            }
            mo44673c(a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }
}
