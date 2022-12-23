package com.moovit.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import f00.C16919g;
import java.util.concurrent.TimeUnit;
import n60.C18531b;
import p501fw.C17102a;
import p644lx.C18284b;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p824tp.C19748z;
import p977zz.C20964s0;

public class PromotionBannerView extends FrameLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f23956n = 0;

    /* renamed from: b */
    public final C16919g.C16925f f23957b;

    /* renamed from: c */
    public final int f23958c;

    /* renamed from: d */
    public final Drawable f23959d;

    /* renamed from: e */
    public final int f23960e;

    /* renamed from: f */
    public final int f23961f;

    /* renamed from: g */
    public final int f23962g;

    /* renamed from: h */
    public final int f23963h;

    /* renamed from: i */
    public final int f23964i;

    /* renamed from: j */
    public final int f23965j;

    /* renamed from: k */
    public final int f23966k;

    /* renamed from: l */
    public final Drawable f23967l;

    /* renamed from: m */
    public C7926a f23968m;

    /* renamed from: com.moovit.view.PromotionBannerView$a */
    public interface C7926a {
        /* renamed from: a */
        void mo24257a();

        /* renamed from: b */
        void mo24258b();
    }

    public PromotionBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo24712a() {
        ListItemView listItemView;
        removeAllViews();
        long longValue = this.f23957b.mo19759a(getContext().getSharedPreferences("promotion_banner_view", 0)).longValue();
        boolean z = true;
        if (longValue != -1 && (this.f23958c == -1 || System.currentTimeMillis() - longValue < TimeUnit.DAYS.toMillis((long) this.f23958c))) {
            z = false;
        }
        if (z) {
            LayoutInflater from = LayoutInflater.from(getContext());
            int i = C19742t.promotion_banner_large_view;
            View inflate = from.inflate(i, this, false);
            setTag(C19740r.view_tag_param1, Integer.valueOf(i));
            ((ImageView) inflate.findViewById(C19740r.image)).setImageDrawable(this.f23959d);
            View findViewById = inflate.findViewById(C19740r.close);
            findViewById.setContentDescription(getContext().getString(this.f23963h));
            findViewById.setOnClickListener(new C17102a(this, 26));
            UiUtils.m40233A((TextView) inflate.findViewById(C19740r.title), this.f23960e);
            UiUtils.m40233A((TextView) inflate.findViewById(C19740r.subtitle), this.f23961f);
            UiUtils.m40233A((Button) inflate.findViewById(C19740r.join_button), this.f23962g);
            inflate.setOnClickListener(new C18531b(this, 6));
            listItemView = inflate;
        } else {
            LayoutInflater from2 = LayoutInflater.from(getContext());
            int i2 = C19742t.promotion_banner_small_view;
            ListItemView listItemView2 = (ListItemView) from2.inflate(i2, this, false);
            setTag(C19740r.view_tag_param1, Integer.valueOf(i2));
            listItemView2.setIcon(this.f23967l);
            listItemView2.setTitle(this.f23964i);
            listItemView2.setSubtitle(this.f23965j);
            UiUtils.m40233A((TextView) listItemView2.getAccessoryView(), this.f23966k);
            listItemView2.setOnClickListener(new C18284b(this, 19));
            listItemView = listItemView2;
        }
        addView(listItemView);
    }

    public long getDismissTime() {
        return this.f23957b.mo19759a(getContext().getSharedPreferences("promotion_banner_view", 0)).longValue();
    }

    public void setListener(C7926a aVar) {
        this.f23968m = aVar;
    }

    /* JADX INFO: finally extract failed */
    public PromotionBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23968m = null;
        TypedArray o = UiUtils.m40256o(context, attributeSet, C19748z.PromotionBannerView, i);
        try {
            String string = o.getString(C19748z.PromotionBannerView_dismissTag);
            if (!C20964s0.m49092j(string)) {
                this.f23957b = new C16919g.C16925f("dismiss_time_" + string, -1);
                this.f23958c = o.getInteger(C19748z.PromotionBannerView_daysToReopen, -1);
                this.f23959d = o.getDrawable(C19748z.PromotionBannerView_largeViewDrawable);
                this.f23960e = o.getResourceId(C19748z.PromotionBannerView_largeViewTitle, 0);
                this.f23961f = o.getResourceId(C19748z.PromotionBannerView_largeViewSubtitle, 0);
                this.f23962g = o.getResourceId(C19748z.PromotionBannerView_largeViewButtonText, 0);
                this.f23963h = o.getResourceId(C19748z.PromotionBannerView_largeViewDismissContentDescription, C19746x.close);
                this.f23967l = o.getDrawable(C19748z.PromotionBannerView_smallViewIcon);
                this.f23964i = o.getResourceId(C19748z.PromotionBannerView_smallViewTitle, 0);
                this.f23965j = o.getResourceId(C19748z.PromotionBannerView_smallViewSubtitle, 0);
                this.f23966k = o.getResourceId(C19748z.PromotionBannerView_smallViewAccessoryText, 0);
                o.recycle();
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setDuration((long) context.getResources().getInteger(17694720));
                setLayoutTransition(layoutTransition);
                mo24712a();
                return;
            }
            throw new IllegalStateException("dismissTag may not be null!");
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }
}
