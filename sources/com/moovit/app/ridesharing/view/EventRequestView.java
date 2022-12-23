package com.moovit.app.ridesharing.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import com.moovit.ridesharing.model.EventRequestStatus;
import com.tranzmate.R;
import java.util.WeakHashMap;
import k00.C17988b;
import p141k1.C5450a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p977zz.C20941h;
import p977zz.C20943i;
import p977zz.C20964s0;

public class EventRequestView extends ConstraintLayout {

    /* renamed from: p */
    public static final /* synthetic */ int f39409p = 0;

    /* renamed from: h */
    public final ImageView f39410h;

    /* renamed from: i */
    public final TextView f39411i;

    /* renamed from: j */
    public final TextView f39412j;

    /* renamed from: k */
    public final TextView f39413k;

    /* renamed from: l */
    public final TextView f39414l;

    /* renamed from: m */
    public final TextView f39415m;

    /* renamed from: n */
    public final TextView f39416n;

    /* renamed from: o */
    public final TextView f39417o;

    /* renamed from: com.moovit.app.ridesharing.view.EventRequestView$a */
    public static /* synthetic */ class C15263a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39418a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.ridesharing.model.EventRequestStatus[] r0 = com.moovit.ridesharing.model.EventRequestStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39418a = r0
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.WAITING_FOR_PROVIDER_APPROVAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39418a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.APPROVED_BY_PROVIDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39418a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.REJECTED_BY_PROVIDER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39418a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.CANCELED_BY_PASSENGER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f39418a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.FULFILLED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f39418a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.ridesharing.model.EventRequestStatus r1 = com.moovit.ridesharing.model.EventRequestStatus.UNFULFILLED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ridesharing.view.EventRequestView.C15263a.<clinit>():void");
        }
    }

    public EventRequestView() {
        throw null;
    }

    public EventRequestView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static void m39049c(TextView textView, CharSequence charSequence, int i, float f) {
        int i2;
        Drawable drawable;
        if (C20964s0.m49090h(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        if (i != 0) {
            i2 = C20941h.m49043f(i, textView.getContext());
        } else {
            i2 = C20941h.m49043f(R.attr.colorOnSurface, textView.getContext());
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
        textView.setTextColor(i2);
        if (f > BitmapDescriptorFactory.HUE_RED) {
            int argb = Color.argb(Math.round(f * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
            Drawable b = C17988b.m44611b(R.drawable.bg_badge, textView.getContext());
            ColorStateList valueOf = ColorStateList.valueOf(argb);
            if (b == null) {
                drawable = null;
            } else {
                Drawable g = C5450a.m13604g(b.mutate());
                C5450a.C5452b.m13617h(g, valueOf);
                drawable = g;
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15057q(textView, drawable);
            return;
        }
        textView.setBackgroundResource(0);
    }

    private void setRequestStatus(EventRequestStatus eventRequestStatus) {
        CharSequence charSequence;
        int i = C15263a.f39418a[eventRequestStatus.ordinal()];
        int i2 = R.attr.colorSecondary;
        int i3 = 0;
        float f = 0.15f;
        switch (i) {
            case 1:
                i3 = R.string.event_status_waiting_for_approval;
                i2 = R.attr.colorProblem;
                break;
            case 2:
                i3 = R.string.event_status_approved_by_provider;
                i2 = R.attr.colorGood;
                f = 0.2f;
                break;
            case 3:
                i3 = R.string.event_status_rejected_by_provider;
                break;
            case 4:
                i3 = R.string.event_status_cancelled_by_passenger;
                break;
            case 5:
                i3 = R.string.event_status_fulfilled;
                break;
            case 6:
                i3 = R.string.event_status_unfulfilled;
                break;
            default:
                f = BitmapDescriptorFactory.HUE_RED;
                i2 = 0;
                break;
        }
        i2 = R.attr.colorCritical;
        TextView textView = this.f39415m;
        if (i3 == 0) {
            charSequence = null;
        } else {
            charSequence = textView.getResources().getText(i3);
        }
        m39049c(textView, charSequence, i2, f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x010a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45799d(com.moovit.ridesharing.model.EventRequest r11, p665mv.C18472f r12) {
        /*
            r10 = this;
            android.content.res.Resources r0 = r10.getResources()
            com.moovit.ridesharing.model.EventInstance r1 = r11.f42953c
            com.moovit.image.model.Image r2 = r1.f42945d
            android.widget.ImageView r3 = r10.f39410h
            r10.e r3 = p583jk.C17884p.m44354Y(r3)
            r10.d r3 = r3.mo51642v(r2)
            r10.d r2 = r3.mo51628o0(r2)
            r2.getClass()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d r3 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f7150c
            k6.h r4 = new k6.h
            r4.<init>()
            t6.a r2 = r2.mo22718I(r3, r4)
            r10.d r2 = (r10.C19220d) r2
            android.widget.ImageView r3 = r10.f39410h
            r2.mo10850T(r3)
            int r2 = r11.f42958h
            android.widget.TextView r3 = r10.f39411i
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7 = 0
            r5[r7] = r6
            r6 = 2131755041(0x7f100021, float:1.914095E38)
            java.lang.String r5 = r0.getQuantityString(r6, r2, r5)
            r3.setText(r5)
            com.moovit.ridesharing.model.EventVehicleType r3 = r1.f42948g
            int[] r5 = p665mv.C18470e.C18471a.f47074a
            int r6 = r3.ordinal()
            r5 = r5[r6]
            r6 = 2
            if (r5 == r4) goto L_0x0074
            if (r5 == r6) goto L_0x0070
            r8 = 3
            if (r5 != r8) goto L_0x0059
            r3 = 2131887229(0x7f12047d, float:1.940906E38)
            goto L_0x0077
        L_0x0059:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Unknown vehicle type: "
            r12.append(r0)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0070:
            r3 = 2131887228(0x7f12047c, float:1.9409057E38)
            goto L_0x0077
        L_0x0074:
            r3 = 2131887227(0x7f12047b, float:1.9409055E38)
        L_0x0077:
            java.lang.String r3 = r0.getString(r3)
            int r5 = r1.f42949h
            if (r5 != r4) goto L_0x0083
            r5 = 2131887207(0x7f120467, float:1.9409015E38)
            goto L_0x0086
        L_0x0083:
            r5 = 2131887206(0x7f120466, float:1.9409013E38)
        L_0x0086:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r7] = r3
            java.lang.String r0 = r0.getString(r5, r8)
            android.widget.TextView r3 = r10.f39412j
            r3.setText(r0)
            android.widget.TextView r0 = r10.f39413k
            java.lang.String r3 = r1.f42946e
            r0.setText(r3)
            android.widget.TextView r0 = r10.f39414l
            android.content.Context r3 = r10.getContext()
            long r8 = r1.f42947f
            java.lang.String r5 = com.moovit.util.time.C7925b.m18018f(r3, r8, r7)
            r8 = 2131888899(0x7f120b03, float:1.9412446E38)
            java.lang.String r3 = r3.getString(r8)
            com.moovit.ridesharing.model.Event r1 = r1.f42943b
            java.lang.String r1 = r1.f42915f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r3)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r0.setText(r1)
            com.moovit.ridesharing.model.EventRequestStatus r0 = r11.f42955e
            r10.setRequestStatus(r0)
            com.moovit.util.CurrencyAmount r0 = r11.f42956f
            com.moovit.util.CurrencyAmount r0 = com.moovit.util.CurrencyAmount.m17929f(r2, r0)
            com.moovit.ridesharing.model.EventRequestStatus r1 = r11.f42955e
            java.math.BigDecimal r2 = r0.f23845c
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
            int r2 = r2.compareTo(r3)
            r3 = 0
            r5 = 0
            r8 = 4
            if (r2 > 0) goto L_0x00e6
            android.widget.TextView r0 = r10.f39416n
            m39049c(r0, r5, r7, r3)
            goto L_0x011f
        L_0x00e6:
            int[] r2 = com.moovit.app.ridesharing.view.EventRequestView.C15263a.f39418a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r6) goto L_0x0102
            if (r1 == r8) goto L_0x00fb
            r2 = 5
            if (r1 == r2) goto L_0x0102
            r2 = 6
            if (r1 == r2) goto L_0x0102
            r1 = 0
            r2 = 0
            goto L_0x0108
        L_0x00fb:
            r1 = 2131887209(0x7f120469, float:1.9409019E38)
            r2 = 2130968971(0x7f04018b, float:1.754661E38)
            goto L_0x0108
        L_0x0102:
            r1 = 2131887208(0x7f120468, float:1.9409017E38)
            r2 = 2130968985(0x7f040199, float:1.754664E38)
        L_0x0108:
            if (r1 == 0) goto L_0x011a
            android.content.res.Resources r5 = r10.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.toString()
            r4[r7] = r0
            java.lang.String r5 = r5.getString(r1, r4)
        L_0x011a:
            android.widget.TextView r0 = r10.f39416n
            m39049c(r0, r5, r2, r3)
        L_0x011f:
            android.widget.TextView r0 = r10.f39417o
            com.moovit.ridesharing.model.EventRide r1 = r11.f42957g
            if (r1 == 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r7 = 4
        L_0x0127:
            r0.setVisibility(r7)
            android.widget.TextView r0 = r10.f39417o
            fr.b r1 = new fr.b
            r1.<init>(r8, r12, r11)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ridesharing.view.EventRequestView.mo45799d(com.moovit.ridesharing.model.EventRequest, mv.f):void");
    }

    public EventRequestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMinHeight(UiUtils.m40249h(context.getResources(), 72.0f));
        LayoutInflater.from(context).inflate(R.layout.event_view_layout, this, true);
        this.f39410h = (ImageView) findViewById(R.id.image);
        this.f39411i = (TextView) findViewById(R.id.tickets_amount);
        this.f39412j = (TextView) findViewById(R.id.label);
        this.f39413k = (TextView) findViewById(R.id.title);
        this.f39414l = (TextView) findViewById(R.id.subtitle);
        this.f39415m = (TextView) findViewById(R.id.status);
        this.f39416n = (TextView) findViewById(R.id.price);
        this.f39417o = (TextView) findViewById(R.id.ticket);
        if (getBackground() == null) {
            C20943i.m49053f(this, C20941h.m49045h(16843534, context));
        }
    }
}
