package com.moovit.app.tod.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c20.C13744a;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.commons.utils.C15780a;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import java.util.EnumSet;
import p927xw.C20652s;
import p977zz.C20941h;
import p977zz.C20943i;

public class TodRideView extends ConstraintLayout {

    /* renamed from: n */
    public static final EnumSet f40481n = EnumSet.of(TodRideStatus.CANCELLED, TodRideStatus.PASSENGER_NOT_SHOWN);

    /* renamed from: h */
    public final TextView f40482h;

    /* renamed from: i */
    public final PriceView f40483i;

    /* renamed from: j */
    public final TextView f40484j;

    /* renamed from: k */
    public final ImageView f40485k;

    /* renamed from: l */
    public final TextView f40486l;

    /* renamed from: m */
    public final TextView f40487m;

    /* renamed from: com.moovit.app.tod.view.TodRideView$a */
    public static /* synthetic */ class C15573a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40488a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.app.tod.model.TodRideStatus[] r0 = com.moovit.app.tod.model.TodRideStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40488a = r0
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40488a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.FUTURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40488a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40488a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40488a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.PASSENGER_NOT_SHOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40488a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.app.tod.model.TodRideStatus r1 = com.moovit.app.tod.model.TodRideStatus.DECLINED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.view.TodRideView.C15573a.<clinit>():void");
        }
    }

    public TodRideView() {
        throw null;
    }

    public TodRideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setRideStatus(TodRideStatus todRideStatus) {
        this.f40486l.setText(todRideStatus.textResId);
        this.f40486l.setTextColor(C20941h.m49044g(todRideStatus.textColorAttrId, getContext()));
        C15780a.m40272e(this.f40486l, todRideStatus.iconResId);
        this.f40486l.setVisibility(0);
    }

    private void setStatusDescription(TodRide todRide) {
        if (todRide.f40281s) {
            TextView textView = this.f40487m;
            textView.setText(R.string.tod_payment_credit_error);
            textView.setTextColor(C20941h.m49043f(R.attr.colorCritical, textView.getContext()));
            textView.setVisibility(0);
        } else if (!f40481n.contains(todRide.f40266d) || todRide.f40269g == null) {
            this.f40487m.setVisibility(8);
        } else {
            TextView textView2 = this.f40487m;
            textView2.setText(R.string.tod_passenger_ride_details_status_description);
            textView2.setTextColor(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisMedium, textView2.getContext()));
            textView2.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo46511c(CurrencyAmount currencyAmount, boolean z) {
        boolean z2;
        int i;
        int i2 = 0;
        if (currencyAmount != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        PriceView priceView = this.f40483i;
        if (!z2) {
            i2 = 8;
        }
        priceView.setVisibility(i2);
        if (z2) {
            this.f40483i.setPrice(currencyAmount);
            PriceView priceView2 = this.f40483i;
            if (z) {
                i = R.attr.colorCritical;
            } else {
                i = R.attr.colorOnSurface;
            }
            priceView2.setPriceTextThemeColor(i);
        }
    }

    public void setTodRide(TodRide todRide) {
        switch (C15573a.f40488a[todRide.f40266d.ordinal()]) {
            case 1:
                C13744a.m34301c(this.f40485k, todRide.f40274l, 4);
                this.f40482h.setText(C7925b.m18023k(getContext(), todRide.f40265c));
                mo46511c(todRide.f40269g, todRide.f40281s);
                this.f40484j.setText(todRide.f40267e.f40287e.mo24313f());
                this.f40486l.setVisibility(8);
                return;
            case 2:
                C13744a.m34301c(this.f40485k, todRide.f40274l, 4);
                this.f40482h.setText(todRide.f40273k);
                mo46511c(todRide.f40269g, todRide.f40281s);
                this.f40484j.setText(C20652s.m48548c(getContext(), todRide.f40265c));
                this.f40486l.setVisibility(8);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                C13744a.m34301c(this.f40485k, todRide.f40274l, 4);
                this.f40482h.setText(C7925b.m18023k(getContext(), todRide.f40265c));
                mo46511c(todRide.f40269g, todRide.f40281s);
                this.f40484j.setText(todRide.f40267e.f40287e.mo24313f());
                setRideStatus(todRide.f40266d);
                setStatusDescription(todRide);
                return;
            default:
                return;
        }
    }

    public TodRideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.screen_edge);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        C20943i.m49053f(this, C20941h.m49045h(R.attr.selectableItemBackground, context));
        LayoutInflater.from(context).inflate(R.layout.tod_ride_view, this, true);
        this.f40482h = (TextView) findViewById(R.id.title);
        this.f40483i = (PriceView) findViewById(R.id.price_view);
        this.f40484j = (TextView) findViewById(R.id.subtitle);
        this.f40485k = (ImageView) findViewById(R.id.provider_icon);
        this.f40486l = (TextView) findViewById(R.id.status);
        this.f40487m = (TextView) findViewById(R.id.status_description);
    }
}
