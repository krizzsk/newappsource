package com.p341rd;

import ab0.C7556a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import bb0.C7569a;
import cb0.C7581a;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.p341rd.C7981a;
import com.p341rd.animation.type.AnimationType;
import com.p341rd.draw.data.Orientation;
import com.p341rd.draw.data.PositionSavedState;
import com.p341rd.draw.data.RtlMode;
import db0.C12611a;
import fb0.C12652a;
import gb0.C12722a;
import hb0.C12747a;
import hb0.C12750b;
import ib0.C12770a;
import java.util.Locale;
import lb0.C12855a;
import mb0.C12908a;
import p019b0.C1426c;
import p172m9.C5720b;
import p216q1.C6143f;

/* renamed from: com.rd.PageIndicatorView */
public class PageIndicatorView extends View implements ViewPager.OnPageChangeListener, C7981a.C7982a, ViewPager.OnAdapterChangeListener, View.OnTouchListener {

    /* renamed from: g */
    public static final Handler f24178g = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public C7981a f24179b;

    /* renamed from: c */
    public C7556a f24180c;

    /* renamed from: d */
    public ViewPager f24181d;

    /* renamed from: e */
    public boolean f24182e;

    /* renamed from: f */
    public C7979a f24183f = new C7979a();

    /* renamed from: com.rd.PageIndicatorView$a */
    public class C7979a implements Runnable {
        public C7979a() {
        }

        public final void run() {
            PageIndicatorView.this.f24179b.mo24974a().getClass();
            PageIndicatorView pageIndicatorView = PageIndicatorView.this;
            pageIndicatorView.animate().cancel();
            pageIndicatorView.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(250);
        }
    }

    /* renamed from: com.rd.PageIndicatorView$b */
    public static /* synthetic */ class C7980b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24185a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.rd.draw.data.RtlMode[] r0 = com.p341rd.draw.data.RtlMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24185a = r0
                com.rd.draw.data.RtlMode r1 = com.p341rd.draw.data.RtlMode.On     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24185a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.draw.data.RtlMode r1 = com.p341rd.draw.data.RtlMode.Off     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24185a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.draw.data.RtlMode r1 = com.p341rd.draw.data.RtlMode.Auto     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p341rd.PageIndicatorView.C7980b.<clinit>():void");
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo24926b(attributeSet);
    }

    /* renamed from: a */
    public final void mo24925a(ViewParent viewParent) {
        boolean z;
        KeyEvent.Callback findViewById;
        if (viewParent == null || !(viewParent instanceof ViewGroup) || ((ViewGroup) viewParent).getChildCount() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i = this.f24179b.mo24974a().f31560w;
            ViewGroup viewGroup = (ViewGroup) viewParent;
            ViewPager viewPager = null;
            if (viewGroup.getChildCount() > 0 && (findViewById = viewGroup.findViewById(i)) != null && (findViewById instanceof ViewPager)) {
                viewPager = (ViewPager) findViewById;
            }
            if (viewPager != null) {
                setViewPager(viewPager);
            } else {
                mo24925a(viewParent.getParent());
            }
        }
    }

    /* renamed from: b */
    public final void mo24926b(AttributeSet attributeSet) {
        int i;
        if (getId() == -1) {
            int i2 = C12908a.f31945a;
            setId(View.generateViewId());
        }
        C7981a aVar = new C7981a(this);
        this.f24179b = aVar;
        C12722a aVar2 = aVar.f24186a;
        Context context = getContext();
        C1426c cVar = aVar2.f31421d;
        cVar.getClass();
        int i3 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12855a.PageIndicatorView, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C12855a.PageIndicatorView_piv_viewPager, -1);
        boolean z = obtainStyledAttributes.getBoolean(C12855a.PageIndicatorView_piv_autoVisibility, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C12855a.PageIndicatorView_piv_dynamicCount, false);
        int i4 = obtainStyledAttributes.getInt(C12855a.PageIndicatorView_piv_count, -1);
        if (i4 == -1) {
            i4 = 3;
        }
        int i5 = obtainStyledAttributes.getInt(C12855a.PageIndicatorView_piv_select, 0);
        if (i5 < 0) {
            i5 = 0;
        } else if (i4 > 0 && i5 > i4 - 1) {
            i5 = i;
        }
        C12770a aVar3 = (C12770a) cVar.f5273c;
        aVar3.f31560w = resourceId;
        aVar3.f31551n = z;
        aVar3.f31552o = z2;
        aVar3.f31556s = i4;
        aVar3.f31557t = i5;
        aVar3.f31558u = i5;
        aVar3.f31559v = i5;
        int color = obtainStyledAttributes.getColor(C12855a.PageIndicatorView_piv_unselectedColor, Color.parseColor("#33ffffff"));
        int color2 = obtainStyledAttributes.getColor(C12855a.PageIndicatorView_piv_selectedColor, Color.parseColor("#ffffff"));
        C12770a aVar4 = (C12770a) cVar.f5273c;
        aVar4.f31548k = color;
        aVar4.f31549l = color2;
        boolean z3 = obtainStyledAttributes.getBoolean(C12855a.PageIndicatorView_piv_interactiveAnimation, false);
        long j = (long) obtainStyledAttributes.getInt(C12855a.PageIndicatorView_piv_animationDuration, 350);
        if (j < 0) {
            j = 0;
        }
        int i6 = C12855a.PageIndicatorView_piv_animationType;
        AnimationType animationType = AnimationType.NONE;
        switch (obtainStyledAttributes.getInt(i6, animationType.ordinal())) {
            case 1:
                animationType = AnimationType.COLOR;
                break;
            case 2:
                animationType = AnimationType.SCALE;
                break;
            case 3:
                animationType = AnimationType.WORM;
                break;
            case 4:
                animationType = AnimationType.SLIDE;
                break;
            case 5:
                animationType = AnimationType.FILL;
                break;
            case 6:
                animationType = AnimationType.THIN_WORM;
                break;
            case 7:
                animationType = AnimationType.DROP;
                break;
            case 8:
                animationType = AnimationType.SWAP;
                break;
            case 9:
                animationType = AnimationType.SCALE_DOWN;
                break;
        }
        int i7 = C12855a.PageIndicatorView_piv_rtl_mode;
        RtlMode rtlMode = RtlMode.Off;
        int i8 = obtainStyledAttributes.getInt(i7, rtlMode.ordinal());
        if (i8 == 0) {
            rtlMode = RtlMode.On;
        } else if (i8 != 1) {
            if (i8 != 2) {
                rtlMode = RtlMode.Auto;
            } else {
                rtlMode = RtlMode.Auto;
            }
        }
        boolean z4 = obtainStyledAttributes.getBoolean(C12855a.PageIndicatorView_piv_fadeOnIdle, false);
        C12770a aVar5 = (C12770a) cVar.f5273c;
        aVar5.f31555r = j;
        aVar5.f31550m = z3;
        aVar5.f31562y = animationType;
        aVar5.f31563z = rtlMode;
        aVar5.f31553p = z4;
        aVar5.f31554q = (long) obtainStyledAttributes.getInt(C12855a.PageIndicatorView_piv_idleDuration, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        int i9 = C12855a.PageIndicatorView_piv_orientation;
        Orientation orientation = Orientation.HORIZONTAL;
        if (obtainStyledAttributes.getInt(i9, orientation.ordinal()) != 0) {
            orientation = Orientation.VERTICAL;
        }
        int dimension = (int) obtainStyledAttributes.getDimension(C12855a.PageIndicatorView_piv_radius, (float) C5720b.m14055f(6));
        if (dimension < 0) {
            dimension = 0;
        }
        int dimension2 = (int) obtainStyledAttributes.getDimension(C12855a.PageIndicatorView_piv_padding, (float) C5720b.m14055f(8));
        if (dimension2 < 0) {
            dimension2 = 0;
        }
        float f = obtainStyledAttributes.getFloat(C12855a.PageIndicatorView_piv_scaleFactor, 0.7f);
        if (f < 0.3f) {
            f = 0.3f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        int dimension3 = (int) obtainStyledAttributes.getDimension(C12855a.PageIndicatorView_piv_strokeWidth, (float) C5720b.m14055f(1));
        if (dimension3 > dimension) {
            dimension3 = dimension;
        }
        if (((C12770a) cVar.f5273c).mo39619a() == AnimationType.FILL) {
            i3 = dimension3;
        }
        C12770a aVar6 = (C12770a) cVar.f5273c;
        aVar6.f31540c = dimension;
        aVar6.f31561x = orientation;
        aVar6.f31541d = dimension2;
        aVar6.f31547j = f;
        aVar6.f31546i = i3;
        obtainStyledAttributes.recycle();
        C12770a a = this.f24179b.mo24974a();
        a.f31542e = getPaddingLeft();
        a.f31543f = getPaddingTop();
        a.f31544g = getPaddingRight();
        a.f31545h = getPaddingBottom();
        this.f24182e = a.f31550m;
        if (this.f24179b.mo24974a().f31553p) {
            mo24928d();
        }
    }

    /* renamed from: c */
    public final boolean mo24927c() {
        int[] iArr = C7980b.f24185a;
        C12770a a = this.f24179b.mo24974a();
        if (a.f31563z == null) {
            a.f31563z = RtlMode.Off;
        }
        int i = iArr[a.f31563z.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 3) {
            return false;
        }
        Locale locale = getContext().getResources().getConfiguration().locale;
        int i2 = C6143f.f19508a;
        if (C6143f.C6144a.m14704a(locale) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo24928d() {
        Handler handler = f24178g;
        handler.removeCallbacks(this.f24183f);
        handler.postDelayed(this.f24183f, this.f24179b.mo24974a().f31554q);
    }

    /* renamed from: e */
    public final void mo24929e() {
        f24178g.removeCallbacks(this.f24183f);
        animate().cancel();
        animate().alpha(1.0f).setDuration(250);
    }

    /* renamed from: f */
    public final void mo24930f() {
        ViewPager viewPager;
        if (this.f24180c != null && (viewPager = this.f24181d) != null && viewPager.getAdapter() != null) {
            try {
                this.f24181d.getAdapter().unregisterDataSetObserver(this.f24180c);
                this.f24180c = null;
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public final void mo24931g() {
        int i;
        C12652a aVar;
        T t;
        ViewPager viewPager = this.f24181d;
        if (viewPager != null && viewPager.getAdapter() != null) {
            int count = this.f24181d.getAdapter().getCount();
            if (mo24927c()) {
                i = (count - 1) - this.f24181d.getCurrentItem();
            } else {
                i = this.f24181d.getCurrentItem();
            }
            this.f24179b.mo24974a().f31557t = i;
            this.f24179b.mo24974a().f31558u = i;
            this.f24179b.mo24974a().f31559v = i;
            this.f24179b.mo24974a().f31556s = count;
            C7581a aVar2 = this.f24179b.f24187b.f23063a;
            if (!(aVar2 == null || (aVar = aVar2.f23085c) == null || (t = aVar.f31272c) == null || !t.isStarted())) {
                aVar.f31272c.end();
            }
            mo24941h();
            requestLayout();
        }
    }

    public long getAnimationDuration() {
        return this.f24179b.mo24974a().f31555r;
    }

    public int getCount() {
        return this.f24179b.mo24974a().f31556s;
    }

    public int getPadding() {
        return this.f24179b.mo24974a().f31541d;
    }

    public int getRadius() {
        return this.f24179b.mo24974a().f31540c;
    }

    public float getScaleFactor() {
        return this.f24179b.mo24974a().f31547j;
    }

    public int getSelectedColor() {
        return this.f24179b.mo24974a().f31549l;
    }

    public int getSelection() {
        return this.f24179b.mo24974a().f31557t;
    }

    public int getStrokeWidth() {
        return this.f24179b.mo24974a().f31546i;
    }

    public int getUnselectedColor() {
        return this.f24179b.mo24974a().f31548k;
    }

    /* renamed from: h */
    public final void mo24941h() {
        if (this.f24179b.mo24974a().f31551n) {
            int i = this.f24179b.mo24974a().f31556s;
            int visibility = getVisibility();
            if (visibility != 0 && i > 1) {
                setVisibility(0);
            } else if (visibility != 4 && i <= 1) {
                setVisibility(4);
            }
        }
    }

    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        mo24931g();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo24925a(getParent());
    }

    public final void onDetachedFromWindow() {
        mo24930f();
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.rd.a r2 = r0.f24179b
            gb0.a r2 = r2.f24186a
            hb0.a r2 = r2.f31419b
            ib0.a r3 = r2.f31494c
            int r3 = r3.f31556s
            r5 = 0
        L_0x000f:
            if (r5 >= r3) goto L_0x0442
            ib0.a r6 = r2.f31494c
            if (r6 != 0) goto L_0x0017
            r7 = 0
            goto L_0x0033
        L_0x0017:
            com.rd.draw.data.Orientation r7 = r6.mo39620b()
            com.rd.draw.data.Orientation r8 = com.p341rd.draw.data.Orientation.HORIZONTAL
            if (r7 != r8) goto L_0x0024
            int r7 = com.google.android.play.core.appupdate.C14226d.m35356w0(r6, r5)
            goto L_0x0030
        L_0x0024:
            int r7 = r6.f31540c
            com.rd.animation.type.AnimationType r8 = r6.mo39619a()
            com.rd.animation.type.AnimationType r9 = com.p341rd.animation.type.AnimationType.DROP
            if (r8 != r9) goto L_0x0030
            int r7 = r7 * 3
        L_0x0030:
            int r6 = r6.f31542e
            int r7 = r7 + r6
        L_0x0033:
            ib0.a r6 = r2.f31494c
            if (r6 != 0) goto L_0x0039
            r8 = 0
            goto L_0x0055
        L_0x0039:
            com.rd.draw.data.Orientation r8 = r6.mo39620b()
            com.rd.draw.data.Orientation r9 = com.p341rd.draw.data.Orientation.HORIZONTAL
            if (r8 != r9) goto L_0x004e
            int r8 = r6.f31540c
            com.rd.animation.type.AnimationType r9 = r6.mo39619a()
            com.rd.animation.type.AnimationType r10 = com.p341rd.animation.type.AnimationType.DROP
            if (r9 != r10) goto L_0x0052
            int r8 = r8 * 3
            goto L_0x0052
        L_0x004e:
            int r8 = com.google.android.play.core.appupdate.C14226d.m35356w0(r6, r5)
        L_0x0052:
            int r6 = r6.f31543f
            int r8 = r8 + r6
        L_0x0055:
            ib0.a r6 = r2.f31494c
            boolean r9 = r6.f31550m
            int r10 = r6.f31557t
            int r11 = r6.f31558u
            int r12 = r6.f31559v
            r13 = 1
            if (r9 != 0) goto L_0x0068
            if (r5 == r10) goto L_0x0066
            if (r5 != r12) goto L_0x0068
        L_0x0066:
            r12 = 1
            goto L_0x0069
        L_0x0068:
            r12 = 0
        L_0x0069:
            if (r9 == 0) goto L_0x0071
            if (r5 == r10) goto L_0x006f
            if (r5 != r11) goto L_0x0071
        L_0x006f:
            r9 = 1
            goto L_0x0072
        L_0x0071:
            r9 = 0
        L_0x0072:
            r9 = r9 | r12
            jb0.a r10 = r2.f31493b
            r10.f31662k = r5
            r10.f31663l = r7
            r10.f31664m = r8
            db0.a r7 = r2.f31492a
            if (r7 == 0) goto L_0x0435
            if (r9 == 0) goto L_0x0435
            com.rd.animation.type.AnimationType r6 = r6.mo39619a()
            int[] r7 = hb0.C12747a.C12748a.f31495a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            switch(r6) {
                case 1: goto L_0x042d;
                case 2: goto L_0x03df;
                case 3: goto L_0x0384;
                case 4: goto L_0x0310;
                case 5: goto L_0x02b6;
                case 6: goto L_0x0236;
                case 7: goto L_0x01c0;
                case 8: goto L_0x0158;
                case 9: goto L_0x00ec;
                case 10: goto L_0x0092;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x0154
        L_0x0092:
            jb0.a r6 = r2.f31493b
            db0.a r7 = r2.f31492a
            kb0.e r8 = r6.f31661j
            if (r8 == 0) goto L_0x0154
            int r9 = r6.f31662k
            int r10 = r6.f31663l
            int r6 = r6.f31664m
            boolean r11 = r7 instanceof eb0.C12627d
            if (r11 != 0) goto L_0x00a6
            goto L_0x0154
        L_0x00a6:
            eb0.d r7 = (eb0.C12627d) r7
            java.lang.Object r11 = r8.f43144b
            ib0.a r11 = (ib0.C12770a) r11
            int r12 = r11.f31540c
            float r12 = (float) r12
            int r13 = r11.f31549l
            int r14 = r11.f31557t
            int r15 = r11.f31558u
            int r4 = r11.f31559v
            boolean r11 = r11.f31550m
            if (r11 == 0) goto L_0x00cb
            if (r9 != r15) goto L_0x00c3
            int r4 = r7.f31220c
            float r12 = (float) r4
            int r13 = r7.f31211a
            goto L_0x00da
        L_0x00c3:
            if (r9 != r14) goto L_0x00da
            int r4 = r7.f31221d
            float r12 = (float) r4
            int r13 = r7.f31212b
            goto L_0x00da
        L_0x00cb:
            if (r9 != r14) goto L_0x00d3
            int r4 = r7.f31220c
            float r12 = (float) r4
            int r13 = r7.f31211a
            goto L_0x00da
        L_0x00d3:
            if (r9 != r4) goto L_0x00da
            int r4 = r7.f31221d
            float r12 = (float) r4
            int r13 = r7.f31212b
        L_0x00da:
            java.lang.Object r4 = r8.f43143a
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r4.setColor(r13)
            float r4 = (float) r10
            float r6 = (float) r6
            java.lang.Object r7 = r8.f43143a
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r1.drawCircle(r4, r6, r12, r7)
            goto L_0x0154
        L_0x00ec:
            jb0.a r4 = r2.f31493b
            db0.a r6 = r2.f31492a
            kb0.h r7 = r4.f31660i
            if (r7 == 0) goto L_0x0154
            int r8 = r4.f31662k
            int r9 = r4.f31663l
            int r4 = r4.f31664m
            boolean r10 = r6 instanceof eb0.C12629f
            if (r10 != 0) goto L_0x00ff
            goto L_0x0154
        L_0x00ff:
            eb0.f r6 = (eb0.C12629f) r6
            java.lang.Object r10 = r7.f43144b
            ib0.a r10 = (ib0.C12770a) r10
            int r11 = r10.f31549l
            int r12 = r10.f31548k
            int r13 = r10.f31540c
            int r14 = r10.f31557t
            int r15 = r10.f31558u
            int r0 = r10.f31559v
            r16 = r3
            int r3 = r6.f31223a
            boolean r10 = r10.f31550m
            if (r10 == 0) goto L_0x0121
            if (r8 != r15) goto L_0x011c
            goto L_0x0129
        L_0x011c:
            if (r8 != r14) goto L_0x0128
            int r3 = r6.f31224b
            goto L_0x0128
        L_0x0121:
            if (r8 != r0) goto L_0x0124
            goto L_0x0129
        L_0x0124:
            if (r8 != r14) goto L_0x0128
            int r3 = r6.f31224b
        L_0x0128:
            r11 = r12
        L_0x0129:
            java.lang.Object r0 = r7.f43143a
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r11)
            java.lang.Object r0 = r7.f43144b
            ib0.a r0 = (ib0.C12770a) r0
            com.rd.draw.data.Orientation r0 = r0.mo39620b()
            com.rd.draw.data.Orientation r6 = com.p341rd.draw.data.Orientation.HORIZONTAL
            if (r0 != r6) goto L_0x0148
            float r0 = (float) r3
            float r3 = (float) r4
            float r4 = (float) r13
            java.lang.Object r6 = r7.f43143a
            android.graphics.Paint r6 = (android.graphics.Paint) r6
            r1.drawCircle(r0, r3, r4, r6)
            goto L_0x043a
        L_0x0148:
            float r0 = (float) r9
            float r3 = (float) r3
            float r4 = (float) r13
            java.lang.Object r6 = r7.f43143a
            android.graphics.Paint r6 = (android.graphics.Paint) r6
            r1.drawCircle(r0, r3, r4, r6)
            goto L_0x043a
        L_0x0154:
            r16 = r3
            goto L_0x043a
        L_0x0158:
            r16 = r3
            jb0.a r0 = r2.f31493b
            db0.a r3 = r2.f31492a
            kb0.c r4 = r0.f31659h
            if (r4 == 0) goto L_0x043a
            int r6 = r0.f31663l
            int r0 = r0.f31664m
            boolean r7 = r3 instanceof eb0.C12625b
            if (r7 != 0) goto L_0x016c
            goto L_0x043a
        L_0x016c:
            eb0.b r3 = (eb0.C12625b) r3
            java.lang.Object r7 = r4.f43144b
            ib0.a r7 = (ib0.C12770a) r7
            int r8 = r7.f31548k
            int r9 = r7.f31549l
            int r7 = r7.f31540c
            float r7 = (float) r7
            java.lang.Object r10 = r4.f43143a
            android.graphics.Paint r10 = (android.graphics.Paint) r10
            r10.setColor(r8)
            float r6 = (float) r6
            float r0 = (float) r0
            java.lang.Object r8 = r4.f43143a
            android.graphics.Paint r8 = (android.graphics.Paint) r8
            r1.drawCircle(r6, r0, r7, r8)
            java.lang.Object r0 = r4.f43143a
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r9)
            java.lang.Object r0 = r4.f43144b
            ib0.a r0 = (ib0.C12770a) r0
            com.rd.draw.data.Orientation r0 = r0.mo39620b()
            com.rd.draw.data.Orientation r6 = com.p341rd.draw.data.Orientation.HORIZONTAL
            if (r0 != r6) goto L_0x01ae
            int r0 = r3.f31213a
            float r0 = (float) r0
            int r6 = r3.f31214b
            float r6 = (float) r6
            int r3 = r3.f31215c
            float r3 = (float) r3
            java.lang.Object r4 = r4.f43143a
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r1.drawCircle(r0, r6, r3, r4)
            goto L_0x043a
        L_0x01ae:
            int r0 = r3.f31214b
            float r0 = (float) r0
            int r6 = r3.f31213a
            float r6 = (float) r6
            int r3 = r3.f31215c
            float r3 = (float) r3
            java.lang.Object r4 = r4.f43143a
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r1.drawCircle(r0, r6, r3, r4)
            goto L_0x043a
        L_0x01c0:
            r16 = r3
            jb0.a r0 = r2.f31493b
            db0.a r3 = r2.f31492a
            kb0.i r4 = r0.f31658g
            if (r4 == 0) goto L_0x043a
            int r6 = r0.f31663l
            int r0 = r0.f31664m
            boolean r7 = r3 instanceof eb0.C12630g
            if (r7 != 0) goto L_0x01d4
            goto L_0x043a
        L_0x01d4:
            eb0.g r3 = (eb0.C12630g) r3
            int r7 = r3.f31226a
            int r8 = r3.f31227b
            int r3 = r3.f31225c
            int r3 = r3 / 2
            java.lang.Object r9 = r4.f43144b
            ib0.a r9 = (ib0.C12770a) r9
            int r10 = r9.f31540c
            int r11 = r9.f31548k
            int r12 = r9.f31549l
            com.rd.draw.data.Orientation r9 = r9.mo39620b()
            com.rd.draw.data.Orientation r13 = com.p341rd.draw.data.Orientation.HORIZONTAL
            if (r9 != r13) goto L_0x0202
            android.graphics.RectF r9 = r4.f31705d
            float r7 = (float) r7
            r9.left = r7
            float r7 = (float) r8
            r9.right = r7
            int r7 = r0 - r3
            float r7 = (float) r7
            r9.top = r7
            int r3 = r3 + r0
            float r3 = (float) r3
            r9.bottom = r3
            goto L_0x0213
        L_0x0202:
            android.graphics.RectF r9 = r4.f31705d
            int r13 = r6 - r3
            float r13 = (float) r13
            r9.left = r13
            int r3 = r3 + r6
            float r3 = (float) r3
            r9.right = r3
            float r3 = (float) r7
            r9.top = r3
            float r3 = (float) r8
            r9.bottom = r3
        L_0x0213:
            java.lang.Object r3 = r4.f43143a
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r3.setColor(r11)
            float r3 = (float) r6
            float r0 = (float) r0
            float r6 = (float) r10
            java.lang.Object r7 = r4.f43143a
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r1.drawCircle(r3, r0, r6, r7)
            java.lang.Object r0 = r4.f43143a
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r12)
            android.graphics.RectF r0 = r4.f31705d
            java.lang.Object r3 = r4.f43143a
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r1.drawRoundRect(r0, r6, r6, r3)
            goto L_0x043a
        L_0x0236:
            r16 = r3
            jb0.a r0 = r2.f31493b
            db0.a r3 = r2.f31492a
            kb0.d r4 = r0.f31657f
            if (r4 == 0) goto L_0x043a
            int r6 = r0.f31662k
            int r7 = r0.f31663l
            int r0 = r0.f31664m
            boolean r8 = r3 instanceof eb0.C12626c
            if (r8 != 0) goto L_0x024c
            goto L_0x043a
        L_0x024c:
            eb0.c r3 = (eb0.C12626c) r3
            java.lang.Object r8 = r4.f43144b
            ib0.a r8 = (ib0.C12770a) r8
            int r9 = r8.f31548k
            int r10 = r8.f31540c
            float r10 = (float) r10
            int r11 = r8.f31546i
            int r12 = r8.f31557t
            int r13 = r8.f31558u
            int r14 = r8.f31559v
            boolean r8 = r8.f31550m
            if (r8 == 0) goto L_0x0277
            if (r6 != r13) goto L_0x026d
            int r9 = r3.f31211a
            int r6 = r3.f31216c
            float r10 = (float) r6
            int r11 = r3.f31218e
            goto L_0x028a
        L_0x026d:
            if (r6 != r12) goto L_0x028a
            int r9 = r3.f31212b
            int r6 = r3.f31217d
            float r10 = (float) r6
            int r11 = r3.f31219f
            goto L_0x028a
        L_0x0277:
            if (r6 != r12) goto L_0x0281
            int r9 = r3.f31211a
            int r6 = r3.f31216c
            float r10 = (float) r6
            int r11 = r3.f31218e
            goto L_0x028a
        L_0x0281:
            if (r6 != r14) goto L_0x028a
            int r9 = r3.f31212b
            int r6 = r3.f31217d
            float r10 = (float) r6
            int r11 = r3.f31219f
        L_0x028a:
            android.graphics.Paint r3 = r4.f31704d
            r3.setColor(r9)
            android.graphics.Paint r3 = r4.f31704d
            java.lang.Object r6 = r4.f43144b
            ib0.a r6 = (ib0.C12770a) r6
            int r6 = r6.f31546i
            float r6 = (float) r6
            r3.setStrokeWidth(r6)
            float r3 = (float) r7
            float r0 = (float) r0
            java.lang.Object r6 = r4.f43144b
            ib0.a r6 = (ib0.C12770a) r6
            int r6 = r6.f31540c
            float r6 = (float) r6
            android.graphics.Paint r7 = r4.f31704d
            r1.drawCircle(r3, r0, r6, r7)
            android.graphics.Paint r6 = r4.f31704d
            float r7 = (float) r11
            r6.setStrokeWidth(r7)
            android.graphics.Paint r4 = r4.f31704d
            r1.drawCircle(r3, r0, r10, r4)
            goto L_0x043a
        L_0x02b6:
            r16 = r3
            jb0.a r0 = r2.f31493b
            db0.a r3 = r2.f31492a
            kb0.g r4 = r0.f31656e
            if (r4 == 0) goto L_0x043a
            int r6 = r0.f31663l
            int r0 = r0.f31664m
            boolean r7 = r3 instanceof eb0.C12628e
            if (r7 != 0) goto L_0x02ca
            goto L_0x043a
        L_0x02ca:
            eb0.e r3 = (eb0.C12628e) r3
            int r3 = r3.f31222a
            java.lang.Object r7 = r4.f43144b
            ib0.a r7 = (ib0.C12770a) r7
            int r8 = r7.f31548k
            int r9 = r7.f31549l
            int r7 = r7.f31540c
            java.lang.Object r10 = r4.f43143a
            android.graphics.Paint r10 = (android.graphics.Paint) r10
            r10.setColor(r8)
            float r6 = (float) r6
            float r0 = (float) r0
            float r7 = (float) r7
            java.lang.Object r8 = r4.f43143a
            android.graphics.Paint r8 = (android.graphics.Paint) r8
            r1.drawCircle(r6, r0, r7, r8)
            java.lang.Object r8 = r4.f43143a
            android.graphics.Paint r8 = (android.graphics.Paint) r8
            r8.setColor(r9)
            java.lang.Object r8 = r4.f43144b
            ib0.a r8 = (ib0.C12770a) r8
            com.rd.draw.data.Orientation r8 = r8.mo39620b()
            com.rd.draw.data.Orientation r9 = com.p341rd.draw.data.Orientation.HORIZONTAL
            if (r8 != r9) goto L_0x0306
            float r3 = (float) r3
            java.lang.Object r4 = r4.f43143a
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r1.drawCircle(r3, r0, r7, r4)
            goto L_0x043a
        L_0x0306:
            float r0 = (float) r3
            java.lang.Object r3 = r4.f43143a
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r1.drawCircle(r6, r0, r7, r3)
            goto L_0x043a
        L_0x0310:
            r16 = r3
            jb0.a r0 = r2.f31493b
            db0.a r3 = r2.f31492a
            kb0.j r4 = r0.f31655d
            if (r4 == 0) goto L_0x043a
            int r6 = r0.f31663l
            int r0 = r0.f31664m
            boolean r7 = r3 instanceof eb0.C12631h
            if (r7 != 0) goto L_0x0324
            goto L_0x043a
        L_0x0324:
            eb0.h r3 = (eb0.C12631h) r3
            int r7 = r3.f31226a
            int r3 = r3.f31227b
            java.lang.Object r8 = r4.f43144b
            ib0.a r8 = (ib0.C12770a) r8
            int r9 = r8.f31540c
            int r10 = r8.f31548k
            int r11 = r8.f31549l
            com.rd.draw.data.Orientation r8 = r8.mo39620b()
            com.rd.draw.data.Orientation r12 = com.p341rd.draw.data.Orientation.HORIZONTAL
            if (r8 != r12) goto L_0x034f
            android.graphics.RectF r8 = r4.f31705d
            float r7 = (float) r7
            r8.left = r7
            float r3 = (float) r3
            r8.right = r3
            int r3 = r0 - r9
            float r3 = (float) r3
            r8.top = r3
            int r3 = r0 + r9
            float r3 = (float) r3
            r8.bottom = r3
            goto L_0x0361
        L_0x034f:
            android.graphics.RectF r8 = r4.f31705d
            int r12 = r6 - r9
            float r12 = (float) r12
            r8.left = r12
            int r12 = r6 + r9
            float r12 = (float) r12
            r8.right = r12
            float r7 = (float) r7
            r8.top = r7
            float r3 = (float) r3
            r8.bottom = r3
        L_0x0361:
            java.lang.Object r3 = r4.f43143a
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r3.setColor(r10)
            float r3 = (float) r6
            float r0 = (float) r0
            float r6 = (float) r9
            java.lang.Object r7 = r4.f43143a
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r1.drawCircle(r3, r0, r6, r7)
            java.lang.Object r0 = r4.f43143a
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setColor(r11)
            android.graphics.RectF r0 = r4.f31705d
            java.lang.Object r3 = r4.f43143a
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r1.drawRoundRect(r0, r6, r6, r3)
            goto L_0x043a
        L_0x0384:
            r16 = r3
            jb0.a r0 = r2.f31493b
            db0.a r3 = r2.f31492a
            kb0.f r4 = r0.f31654c
            if (r4 == 0) goto L_0x043a
            int r6 = r0.f31662k
            int r7 = r0.f31663l
            int r0 = r0.f31664m
            boolean r8 = r3 instanceof eb0.C12627d
            if (r8 != 0) goto L_0x039a
            goto L_0x043a
        L_0x039a:
            eb0.d r3 = (eb0.C12627d) r3
            java.lang.Object r8 = r4.f43144b
            ib0.a r8 = (ib0.C12770a) r8
            int r9 = r8.f31540c
            float r9 = (float) r9
            int r10 = r8.f31549l
            int r11 = r8.f31557t
            int r12 = r8.f31558u
            int r13 = r8.f31559v
            boolean r8 = r8.f31550m
            if (r8 == 0) goto L_0x03bf
            if (r6 != r12) goto L_0x03b7
            int r6 = r3.f31220c
            float r9 = (float) r6
            int r10 = r3.f31211a
            goto L_0x03ce
        L_0x03b7:
            if (r6 != r11) goto L_0x03ce
            int r6 = r3.f31221d
            float r9 = (float) r6
            int r10 = r3.f31212b
            goto L_0x03ce
        L_0x03bf:
            if (r6 != r11) goto L_0x03c7
            int r6 = r3.f31220c
            float r9 = (float) r6
            int r10 = r3.f31211a
            goto L_0x03ce
        L_0x03c7:
            if (r6 != r13) goto L_0x03ce
            int r6 = r3.f31221d
            float r9 = (float) r6
            int r10 = r3.f31212b
        L_0x03ce:
            java.lang.Object r3 = r4.f43143a
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r3.setColor(r10)
            float r3 = (float) r7
            float r0 = (float) r0
            java.lang.Object r4 = r4.f43143a
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r1.drawCircle(r3, r0, r9, r4)
            goto L_0x043a
        L_0x03df:
            r16 = r3
            jb0.a r0 = r2.f31493b
            db0.a r3 = r2.f31492a
            kb0.b r4 = r0.f31653b
            if (r4 == 0) goto L_0x043a
            int r6 = r0.f31662k
            int r7 = r0.f31663l
            int r0 = r0.f31664m
            boolean r8 = r3 instanceof eb0.C12624a
            if (r8 != 0) goto L_0x03f4
            goto L_0x043a
        L_0x03f4:
            eb0.a r3 = (eb0.C12624a) r3
            java.lang.Object r8 = r4.f43144b
            ib0.a r8 = (ib0.C12770a) r8
            int r9 = r8.f31540c
            float r9 = (float) r9
            int r10 = r8.f31549l
            int r11 = r8.f31557t
            int r12 = r8.f31558u
            int r13 = r8.f31559v
            boolean r8 = r8.f31550m
            if (r8 == 0) goto L_0x0413
            if (r6 != r12) goto L_0x040e
            int r10 = r3.f31211a
            goto L_0x041c
        L_0x040e:
            if (r6 != r11) goto L_0x041c
            int r10 = r3.f31212b
            goto L_0x041c
        L_0x0413:
            if (r6 != r11) goto L_0x0418
            int r10 = r3.f31211a
            goto L_0x041c
        L_0x0418:
            if (r6 != r13) goto L_0x041c
            int r10 = r3.f31212b
        L_0x041c:
            java.lang.Object r3 = r4.f43143a
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r3.setColor(r10)
            float r3 = (float) r7
            float r0 = (float) r0
            java.lang.Object r4 = r4.f43143a
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r1.drawCircle(r3, r0, r9, r4)
            goto L_0x043a
        L_0x042d:
            r16 = r3
            jb0.a r0 = r2.f31493b
            r0.mo39642a(r1, r13)
            goto L_0x043a
        L_0x0435:
            r16 = r3
            r10.mo39642a(r1, r9)
        L_0x043a:
            int r5 = r5 + 1
            r0 = r17
            r3 = r16
            goto L_0x000f
        L_0x0442:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p341rd.PageIndicatorView.onDraw(android.graphics.Canvas):void");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C12722a aVar = this.f24179b.f24186a;
        C12750b bVar = aVar.f31420c;
        C12770a aVar2 = aVar.f31418a;
        bVar.getClass();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = aVar2.f31556s;
        int i6 = aVar2.f31540c;
        int i7 = aVar2.f31546i;
        int i8 = aVar2.f31541d;
        int i9 = aVar2.f31542e;
        int i11 = aVar2.f31543f;
        int i12 = aVar2.f31544g;
        int i13 = aVar2.f31545h;
        int i14 = i6 * 2;
        Orientation b = aVar2.mo39620b();
        int i15 = 0;
        if (i5 != 0) {
            i3 = (i14 * i5) + (i7 * 2 * i5) + ((i5 - 1) * i8);
            i4 = i14 + i7;
            if (b != Orientation.HORIZONTAL) {
                int i16 = i3;
                i3 = i4;
                i4 = i16;
            }
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (aVar2.mo39619a() == AnimationType.DROP) {
            if (b == Orientation.HORIZONTAL) {
                i4 *= 2;
            } else {
                i3 *= 2;
            }
        }
        Orientation orientation = Orientation.HORIZONTAL;
        int i17 = i3 + i9 + i12;
        int i18 = i4 + i11 + i13;
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(i17, size);
            } else {
                size = i17;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i18, size2);
            } else {
                size2 = i18;
            }
        }
        if (size < 0) {
            size = 0;
        }
        if (size2 >= 0) {
            i15 = size2;
        }
        aVar2.f31539b = size;
        aVar2.f31538a = i15;
        Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(i15));
        setMeasuredDimension(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
    }

    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f24179b.mo24974a().f31550m = this.f24182e;
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C12770a a = this.f24179b.mo24974a();
        AnimationType a2 = a.mo39619a();
        boolean z6 = a.f31550m;
        int i3 = 0;
        if (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !z6 || a2 == AnimationType.NONE) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            boolean c = mo24927c();
            int i4 = a.f31556s;
            int i5 = a.f31557t;
            if (c) {
                i = (i4 - 1) - i;
            }
            if (i < 0) {
                i = 0;
            } else {
                int i6 = i4 - 1;
                if (i > i6) {
                    i = i6;
                }
            }
            if (i > i5) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!c ? i + 1 >= i5 : i - 1 >= i5) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z3 || z4) {
                a.f31557t = i;
                i5 = i;
            }
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (i5 != i || f == BitmapDescriptorFactory.HUE_RED) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                f = 1.0f - f;
            } else if (c) {
                i--;
            } else {
                i++;
            }
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < BitmapDescriptorFactory.HUE_RED) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            Pair pair = new Pair(Integer.valueOf(i), Float.valueOf(f));
            int intValue = ((Integer) pair.first).intValue();
            float floatValue = ((Float) pair.second).floatValue();
            C12770a a3 = this.f24179b.mo24974a();
            if (a3.f31550m) {
                int i7 = a3.f31556s;
                if (i7 > 0 && intValue >= 0 && intValue <= i7 - 1) {
                    i3 = intValue;
                }
                if (floatValue >= BitmapDescriptorFactory.HUE_RED) {
                    if (floatValue > 1.0f) {
                        f2 = 1.0f;
                    } else {
                        f2 = floatValue;
                    }
                }
                if (f2 == 1.0f) {
                    a3.f31559v = a3.f31557t;
                    a3.f31557t = i3;
                }
                a3.f31558u = i3;
                C7581a aVar = this.f24179b.f24187b.f23063a;
                if (aVar != null) {
                    aVar.f23088f = true;
                    aVar.f23087e = f2;
                    aVar.mo23843a();
                }
            }
        }
    }

    public final void onPageSelected(int i) {
        boolean z;
        C12770a a = this.f24179b.mo24974a();
        if (getMeasuredHeight() == 0 && getMeasuredWidth() == 0) {
            z = false;
        } else {
            z = true;
        }
        int i2 = a.f31556s;
        if (z) {
            if (mo24927c()) {
                i = (i2 - 1) - i;
            }
            setSelection(i);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof PositionSavedState) {
            C12770a a = this.f24179b.mo24974a();
            PositionSavedState positionSavedState = (PositionSavedState) parcelable;
            a.f31557t = positionSavedState.f24198b;
            a.f31558u = positionSavedState.f24199c;
            a.f31559v = positionSavedState.f24200d;
            super.onRestoreInstanceState(positionSavedState.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        C12770a a = this.f24179b.mo24974a();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.f24198b = a.f31557t;
        positionSavedState.f24199c = a.f31558u;
        positionSavedState.f24200d = a.f31559v;
        return positionSavedState;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f24179b.mo24974a().f31553p) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            mo24929e();
        } else if (action == 1) {
            mo24928d();
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C12747a aVar = this.f24179b.f24186a.f31419b;
        aVar.getClass();
        if (motionEvent != null && motionEvent.getAction() == 1) {
            motionEvent.getX();
            motionEvent.getY();
            aVar.getClass();
        }
        return true;
    }

    public void setAnimationDuration(long j) {
        this.f24179b.mo24974a().f31555r = j;
    }

    public void setAnimationType(AnimationType animationType) {
        this.f24179b.mo24975b((C12611a) null);
        if (animationType != null) {
            this.f24179b.mo24974a().f31562y = animationType;
        } else {
            this.f24179b.mo24974a().f31562y = AnimationType.NONE;
        }
        invalidate();
    }

    public void setAutoVisibility(boolean z) {
        if (!z) {
            setVisibility(0);
        }
        this.f24179b.mo24974a().f31551n = z;
        mo24941h();
    }

    public void setClickListener(C12747a.C12749b bVar) {
        this.f24179b.f24186a.f31419b.getClass();
    }

    public void setCount(int i) {
        if (i >= 0 && this.f24179b.mo24974a().f31556s != i) {
            this.f24179b.mo24974a().f31556s = i;
            mo24941h();
            requestLayout();
        }
    }

    public void setDynamicCount(boolean z) {
        ViewPager viewPager;
        this.f24179b.mo24974a().f31552o = z;
        if (!z) {
            mo24930f();
        } else if (this.f24180c == null && (viewPager = this.f24181d) != null && viewPager.getAdapter() != null) {
            this.f24180c = new C7556a(this);
            try {
                this.f24181d.getAdapter().registerDataSetObserver(this.f24180c);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFadeOnIdle(boolean z) {
        this.f24179b.mo24974a().f31553p = z;
        if (z) {
            mo24928d();
        } else {
            mo24929e();
        }
    }

    public void setIdleDuration(long j) {
        this.f24179b.mo24974a().f31554q = j;
        if (this.f24179b.mo24974a().f31553p) {
            mo24928d();
        } else {
            mo24929e();
        }
    }

    public void setInteractiveAnimation(boolean z) {
        this.f24179b.mo24974a().f31550m = z;
        this.f24182e = z;
    }

    public void setOrientation(Orientation orientation) {
        if (orientation != null) {
            this.f24179b.mo24974a().f31561x = orientation;
            requestLayout();
        }
    }

    public void setPadding(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f24179b.mo24974a().f31541d = C5720b.m14055f(i);
        invalidate();
    }

    public void setRadius(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f24179b.mo24974a().f31540c = C5720b.m14055f(i);
        invalidate();
    }

    public void setRtlMode(RtlMode rtlMode) {
        C12770a a = this.f24179b.mo24974a();
        if (rtlMode == null) {
            a.f31563z = RtlMode.Off;
        } else {
            a.f31563z = rtlMode;
        }
        if (this.f24181d != null) {
            int i = a.f31557t;
            if (mo24927c()) {
                i = (a.f31556s - 1) - i;
            } else {
                ViewPager viewPager = this.f24181d;
                if (viewPager != null) {
                    i = viewPager.getCurrentItem();
                }
            }
            a.f31559v = i;
            a.f31558u = i;
            a.f31557t = i;
            invalidate();
        }
    }

    public void setScaleFactor(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.3f) {
            f = 0.3f;
        }
        this.f24179b.mo24974a().f31547j = f;
    }

    public void setSelected(int i) {
        C12770a a = this.f24179b.mo24974a();
        AnimationType a2 = a.mo39619a();
        a.f31562y = AnimationType.NONE;
        setSelection(i);
        a.f31562y = a2;
    }

    public void setSelectedColor(int i) {
        this.f24179b.mo24974a().f31549l = i;
        invalidate();
    }

    public void setSelection(int i) {
        T t;
        C12770a a = this.f24179b.mo24974a();
        int i2 = this.f24179b.mo24974a().f31556s - 1;
        if (i < 0) {
            i = 0;
        } else if (i > i2) {
            i = i2;
        }
        int i3 = a.f31557t;
        if (i != i3 && i != a.f31558u) {
            a.f31550m = false;
            a.f31559v = i3;
            a.f31558u = i;
            a.f31557t = i;
            C7569a aVar = this.f24179b.f24187b;
            C7581a aVar2 = aVar.f23063a;
            if (aVar2 != null) {
                C12652a aVar3 = aVar2.f23085c;
                if (!(aVar3 == null || (t = aVar3.f31272c) == null || !t.isStarted())) {
                    aVar3.f31272c.end();
                }
                C7581a aVar4 = aVar.f23063a;
                aVar4.f23088f = false;
                aVar4.f23087e = BitmapDescriptorFactory.HUE_RED;
                aVar4.mo23843a();
            }
        }
    }

    public void setStrokeWidth(float f) {
        int i = this.f24179b.mo24974a().f31540c;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            float f2 = (float) i;
            if (f > f2) {
                f = f2;
            }
        }
        this.f24179b.mo24974a().f31546i = (int) f;
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f24179b.mo24974a().f31548k = i;
        invalidate();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f24181d;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this);
            this.f24181d.removeOnAdapterChangeListener(this);
            this.f24181d = null;
        }
        if (viewPager != null) {
            this.f24181d = viewPager;
            viewPager.addOnPageChangeListener(this);
            this.f24181d.addOnAdapterChangeListener(this);
            this.f24181d.setOnTouchListener(this);
            this.f24179b.mo24974a().f31560w = this.f24181d.getId();
            setDynamicCount(this.f24179b.mo24974a().f31552o);
            mo24931g();
        }
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo24926b(attributeSet);
    }

    public void setPadding(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f24179b.mo24974a().f31541d = (int) f;
        invalidate();
    }

    public void setRadius(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        this.f24179b.mo24974a().f31540c = (int) f;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        int f = C5720b.m14055f(i);
        int i2 = this.f24179b.mo24974a().f31540c;
        if (f < 0) {
            f = 0;
        } else if (f > i2) {
            f = i2;
        }
        this.f24179b.mo24974a().f31546i = f;
        invalidate();
    }
}
