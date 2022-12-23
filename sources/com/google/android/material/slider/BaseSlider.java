package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14050d;
import com.google.android.material.internal.C14077m;
import com.google.android.material.internal.C14080o;
import com.google.android.material.internal.C14083r;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.C14113a;
import com.google.android.material.slider.C14114b;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import p066e0.C4454r0;
import p090g1.C4732a;
import p129j1.C5348a;
import p141k1.C5450a;
import p221q6.C6181b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p306x1.C7141a;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13409j;
import p355ac.C13410k;
import p355ac.C13411l;
import p380bc.C13577a;
import p739px.C19039c;
import p742qc.C19098b;
import p742qc.C19099c;
import p742qc.C19100d;
import p811tc.C19648g;
import p811tc.C19654k;
import p907xc.C20455a;
import p977zz.C20964s0;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends C14113a<S>, T extends C14114b<S>> extends View {

    /* renamed from: r0 */
    public static final int f35235r0 = C13410k.Widget_MaterialComponents_Slider;

    /* renamed from: A */
    public int f35236A;

    /* renamed from: B */
    public int f35237B;

    /* renamed from: C */
    public float f35238C;

    /* renamed from: D */
    public MotionEvent f35239D;

    /* renamed from: E */
    public C14115c f35240E;

    /* renamed from: F */
    public boolean f35241F;

    /* renamed from: G */
    public float f35242G;

    /* renamed from: H */
    public float f35243H;

    /* renamed from: I */
    public ArrayList<Float> f35244I;

    /* renamed from: J */
    public int f35245J;

    /* renamed from: K */
    public int f35246K;

    /* renamed from: L */
    public float f35247L;

    /* renamed from: M */
    public float[] f35248M;

    /* renamed from: N */
    public boolean f35249N;

    /* renamed from: O */
    public int f35250O;

    /* renamed from: P */
    public boolean f35251P;

    /* renamed from: Q */
    public boolean f35252Q;

    /* renamed from: R */
    public ColorStateList f35253R;

    /* renamed from: S */
    public ColorStateList f35254S;

    /* renamed from: T */
    public ColorStateList f35255T;

    /* renamed from: U */
    public ColorStateList f35256U;

    /* renamed from: b */
    public final Paint f35257b;

    /* renamed from: c */
    public final Paint f35258c;

    /* renamed from: d */
    public final Paint f35259d;

    /* renamed from: e */
    public final Paint f35260e;

    /* renamed from: f */
    public final Paint f35261f;

    /* renamed from: g */
    public final Paint f35262g;

    /* renamed from: h */
    public final C14111e f35263h;

    /* renamed from: i */
    public final AccessibilityManager f35264i;

    /* renamed from: j */
    public BaseSlider<S, L, T>.C16530d f35265j;

    /* renamed from: k */
    public final C14107a f35266k;

    /* renamed from: l */
    public final ArrayList f35267l;

    /* renamed from: l0 */
    public ColorStateList f35268l0;

    /* renamed from: m */
    public final ArrayList f35269m;

    /* renamed from: m0 */
    public final C19648g f35270m0;

    /* renamed from: n */
    public final ArrayList f35271n;

    /* renamed from: n0 */
    public Drawable f35272n0;

    /* renamed from: o */
    public boolean f35273o;

    /* renamed from: o0 */
    public List<Drawable> f35274o0;

    /* renamed from: p */
    public ValueAnimator f35275p;

    /* renamed from: p0 */
    public float f35276p0;

    /* renamed from: q */
    public ValueAnimator f35277q;

    /* renamed from: q0 */
    public int f35278q0;

    /* renamed from: r */
    public final int f35279r;

    /* renamed from: s */
    public int f35280s;

    /* renamed from: t */
    public int f35281t;

    /* renamed from: u */
    public int f35282u;

    /* renamed from: v */
    public int f35283v;

    /* renamed from: w */
    public int f35284w;

    /* renamed from: x */
    public int f35285x;

    /* renamed from: y */
    public int f35286y;

    /* renamed from: z */
    public int f35287z;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C14106a();

        /* renamed from: b */
        public float f35288b;

        /* renamed from: c */
        public float f35289c;

        /* renamed from: d */
        public ArrayList<Float> f35290d;

        /* renamed from: e */
        public float f35291e;

        /* renamed from: f */
        public boolean f35292f;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        public class C14106a implements Parcelable.Creator<SliderState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SliderState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f35288b);
            parcel.writeFloat(this.f35289c);
            parcel.writeList(this.f35290d);
            parcel.writeFloat(this.f35291e);
            parcel.writeBooleanArray(new boolean[]{this.f35292f});
        }

        public SliderState(Parcel parcel) {
            super(parcel);
            this.f35288b = parcel.readFloat();
            this.f35289c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f35290d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f35291e = parcel.readFloat();
            this.f35292f = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    public class C14107a {

        /* renamed from: a */
        public final /* synthetic */ AttributeSet f35293a;

        /* renamed from: b */
        public final /* synthetic */ int f35294b;

        public C14107a(AttributeSet attributeSet, int i) {
            this.f35293a = attributeSet;
            this.f35294b = i;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    public class C14108b implements ValueAnimator.AnimatorUpdateListener {
        public C14108b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f35267l.iterator();
            while (it.hasNext()) {
                C20455a aVar = (C20455a) it.next();
                aVar.f51822N = 1.2f;
                aVar.f51820L = floatValue;
                aVar.f51821M = floatValue;
                aVar.f51823O = C13577a.m33993a(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.19f, 1.0f, floatValue);
                aVar.invalidateSelf();
            }
            BaseSlider baseSlider = BaseSlider.this;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(baseSlider);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    public class C14109c extends AnimatorListenerAdapter {
        public C14109c() {
        }

        public final void onAnimationEnd(Animator animator) {
            C14080o oVar;
            super.onAnimationEnd(animator);
            Iterator it = BaseSlider.this.f35267l.iterator();
            while (it.hasNext()) {
                C20455a aVar = (C20455a) it.next();
                ViewGroup c = C14083r.m35067c(BaseSlider.this);
                if (c == null) {
                    oVar = null;
                } else {
                    oVar = new C14080o(c);
                }
                ((ViewOverlay) oVar.f35108a).remove(aVar);
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    public class C14110d implements Runnable {

        /* renamed from: b */
        public int f35298b = -1;

        public C14110d() {
        }

        public final void run() {
            BaseSlider.this.f35263h.mo23412o(this.f35298b, 4);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$e */
    public static class C14111e extends C7141a {

        /* renamed from: n */
        public final BaseSlider<?, ?, ?> f35300n;

        /* renamed from: o */
        public final Rect f35301o = new Rect();

        public C14111e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f35300n = baseSlider;
        }

        /* renamed from: e */
        public final int mo23402e(float f, float f2) {
            for (int i = 0; i < this.f35300n.getValues().size(); i++) {
                this.f35300n.mo42169s(i, this.f35301o);
                if (this.f35301o.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: f */
        public final void mo23403f(ArrayList arrayList) {
            for (int i = 0; i < this.f35300n.getValues().size(); i++) {
                arrayList.add(Integer.valueOf(i));
            }
        }

        /* renamed from: j */
        public final boolean mo23407j(int i, int i2, Bundle bundle) {
            if (!this.f35300n.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                BaseSlider<?, ?, ?> baseSlider = this.f35300n;
                int i3 = BaseSlider.f35235r0;
                float f = baseSlider.f35247L;
                if (f == BitmapDescriptorFactory.HUE_RED) {
                    f = 1.0f;
                }
                float f2 = (baseSlider.f35243H - baseSlider.f35242G) / f;
                float f3 = (float) 20;
                if (f2 > f3) {
                    f *= (float) Math.round(f2 / f3);
                }
                if (i2 == 8192) {
                    f = -f;
                }
                if (this.f35300n.mo42149j()) {
                    f = -f;
                }
                float floatValue = this.f35300n.getValues().get(i).floatValue() + f;
                float valueFrom = this.f35300n.getValueFrom();
                float valueTo = this.f35300n.getValueTo();
                if (floatValue < valueFrom) {
                    floatValue = valueFrom;
                } else if (floatValue > valueTo) {
                    floatValue = valueTo;
                }
                if (!this.f35300n.mo42168r(floatValue, i)) {
                    return false;
                }
                this.f35300n.mo42205t();
                this.f35300n.postInvalidate();
                mo23404g(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                float f4 = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                BaseSlider<?, ?, ?> baseSlider2 = this.f35300n;
                int i4 = BaseSlider.f35235r0;
                if (baseSlider2.mo42168r(f4, i)) {
                    this.f35300n.mo42205t();
                    this.f35300n.postInvalidate();
                    mo23404g(i);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: l */
        public final void mo23409l(int i, C6531g gVar) {
            String str;
            gVar.mo22635b(C6531g.C6532a.f20347o);
            List<Float> values = this.f35300n.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f35300n.getValueFrom();
            float valueTo = this.f35300n.getValueTo();
            if (this.f35300n.isEnabled()) {
                if (floatValue > valueFrom) {
                    gVar.mo22634a(8192);
                }
                if (floatValue < valueTo) {
                    gVar.mo22634a(4096);
                }
            }
            gVar.f20334a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
            gVar.mo22644i(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f35300n.getContentDescription() != null) {
                sb.append(this.f35300n.getContentDescription());
                sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            }
            if (values.size() > 1) {
                if (i == this.f35300n.getValues().size() - 1) {
                    str = this.f35300n.getContext().getString(C13409j.material_slider_range_end);
                } else if (i == 0) {
                    str = this.f35300n.getContext().getString(C13409j.material_slider_range_start);
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(this.f35300n.mo42119f(floatValue));
            }
            gVar.mo22646k(sb.toString());
            this.f35300n.mo42169s(i, this.f35301o);
            gVar.mo22642h(this.f35301o);
        }
    }

    static {
        Class<BaseSlider> cls = BaseSlider.class;
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.sliderStyle);
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f35244I.size() == 1) {
            floatValue2 = this.f35242G;
        }
        float n = mo42153n(floatValue2);
        float n2 = mo42153n(floatValue);
        if (mo42149j()) {
            return new float[]{n2, n};
        }
        return new float[]{n, n2};
    }

    private float getValueOfTouchPosition() {
        double d;
        float f = this.f35276p0;
        float f2 = this.f35247L;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            int i = (int) ((this.f35243H - this.f35242G) / f2);
            d = ((double) Math.round(f * ((float) i))) / ((double) i);
        } else {
            d = (double) f;
        }
        if (mo42149j()) {
            d = 1.0d - d;
        }
        float f3 = this.f35243H;
        float f4 = this.f35242G;
        return (float) ((d * ((double) (f3 - f4))) + ((double) f4));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f35276p0;
        if (mo42149j()) {
            f = 1.0f - f;
        }
        float f2 = this.f35243H;
        float f3 = this.f35242G;
        return C16759e.m42347c(f2, f3, f, f3);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        C19100d dVar;
        ViewGroup c;
        int resourceId;
        C14080o oVar;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f35244I.size() != arrayList.size() || !this.f35244I.equals(arrayList)) {
                this.f35244I = arrayList;
                int i = 1;
                this.f35252Q = true;
                this.f35246K = 0;
                mo42205t();
                if (this.f35267l.size() > this.f35244I.size()) {
                    List<C20455a> subList = this.f35267l.subList(this.f35244I.size(), this.f35267l.size());
                    for (C20455a aVar : subList) {
                        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                        if (C6333d0.C6340g.m15075b(this)) {
                            ViewGroup c2 = C14083r.m35067c(this);
                            if (c2 == null) {
                                oVar = null;
                            } else {
                                oVar = new C14080o(c2);
                            }
                            if (oVar != null) {
                                ((ViewOverlay) oVar.f35108a).remove(aVar);
                                ViewGroup c3 = C14083r.m35067c(this);
                                if (c3 == null) {
                                    aVar.getClass();
                                } else {
                                    c3.removeOnLayoutChangeListener(aVar.f51812D);
                                }
                            }
                        }
                    }
                    subList.clear();
                }
                while (this.f35267l.size() < this.f35244I.size()) {
                    C14107a aVar2 = this.f35266k;
                    TypedArray d = C14077m.m35060d(BaseSlider.this.getContext(), aVar2.f35293a, C13411l.Slider, aVar2.f35294b, f35235r0, new int[0]);
                    Context context = BaseSlider.this.getContext();
                    int resourceId2 = d.getResourceId(C13411l.Slider_labelStyle, C13410k.Widget_MaterialComponents_Tooltip);
                    C20455a aVar3 = new C20455a(context, resourceId2);
                    TypedArray d2 = C14077m.m35060d(aVar3.f51809A, (AttributeSet) null, C13411l.Tooltip, 0, resourceId2, new int[0]);
                    aVar3.f51818J = aVar3.f51809A.getResources().getDimensionPixelSize(C13403d.mtrl_tooltip_arrowSize);
                    C19654k kVar = aVar3.f49837b.f49861a;
                    kVar.getClass();
                    C19654k.C19655a aVar4 = new C19654k.C19655a(kVar);
                    aVar4.f49909k = aVar3.mo52647x();
                    aVar3.setShapeAppearanceModel(new C19654k(aVar4));
                    CharSequence text = d2.getText(C13411l.Tooltip_android_text);
                    if (!TextUtils.equals(aVar3.f51824z, text)) {
                        aVar3.f51824z = text;
                        aVar3.f51811C.f35100d = true;
                        aVar3.invalidateSelf();
                    }
                    Context context2 = aVar3.f51809A;
                    int i2 = C13411l.Tooltip_android_textAppearance;
                    if (!d2.hasValue(i2) || (resourceId = d2.getResourceId(i2, 0)) == 0) {
                        dVar = null;
                    } else {
                        dVar = new C19100d(context2, resourceId);
                    }
                    if (dVar != null) {
                        int i3 = C13411l.Tooltip_android_textColor;
                        if (d2.hasValue(i3)) {
                            dVar.f48551j = C19099c.m46247a(aVar3.f51809A, d2, i3);
                        }
                    }
                    aVar3.f51811C.mo41883b(dVar, aVar3.f51809A);
                    aVar3.mo52005n(ColorStateList.valueOf(d2.getColor(C13411l.Tooltip_backgroundTint, C5348a.m13413i(C5348a.m13417m(C19098b.m46246b(aVar3.f51809A, C13401b.colorOnBackground, C20455a.class.getCanonicalName()), 153), C5348a.m13417m(C19098b.m46246b(aVar3.f51809A, 16842801, C20455a.class.getCanonicalName()), 229)))));
                    aVar3.mo52011s(ColorStateList.valueOf(C19098b.m46246b(aVar3.f51809A, C13401b.colorSurface, C20455a.class.getCanonicalName())));
                    aVar3.f51814F = d2.getDimensionPixelSize(C13411l.Tooltip_android_padding, 0);
                    aVar3.f51815G = d2.getDimensionPixelSize(C13411l.Tooltip_android_minWidth, 0);
                    aVar3.f51816H = d2.getDimensionPixelSize(C13411l.Tooltip_android_minHeight, 0);
                    aVar3.f51817I = d2.getDimensionPixelSize(C13411l.Tooltip_android_layout_margin, 0);
                    d2.recycle();
                    d.recycle();
                    this.f35267l.add(aVar3);
                    WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                    if (C6333d0.C6340g.m15075b(this) && (c = C14083r.m35067c(this)) != null) {
                        int[] iArr = new int[2];
                        c.getLocationOnScreen(iArr);
                        aVar3.f51819K = iArr[0];
                        c.getWindowVisibleDisplayFrame(aVar3.f51813E);
                        c.addOnLayoutChangeListener(aVar3.f51812D);
                    }
                }
                if (this.f35267l.size() == 1) {
                    i = 0;
                }
                Iterator it = this.f35267l.iterator();
                while (it.hasNext()) {
                    C20455a aVar5 = (C20455a) it.next();
                    aVar5.f49837b.f49871k = (float) i;
                    aVar5.invalidateSelf();
                }
                Iterator it2 = this.f35269m.iterator();
                while (it2.hasNext()) {
                    C14113a aVar6 = (C14113a) it2.next();
                    Iterator<Float> it3 = this.f35244I.iterator();
                    while (it3.hasNext()) {
                        aVar6.mo42221a(this, it3.next().floatValue());
                    }
                }
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: a */
    public final void mo42111a(Drawable drawable) {
        int i = this.f35287z * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = ((float) i) / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        drawable.setBounds(0, 0, (int) (((float) intrinsicWidth) * max), (int) (((float) intrinsicHeight) * max));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r2 != false) goto L_0x000f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo42112b() {
        /*
            r5 = this;
            int r0 = r5.f35286y
            int r1 = r5.f35283v
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x000f
            r4 = 3
            if (r1 != r4) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            if (r2 == 0) goto L_0x001b
        L_0x000f:
            java.util.ArrayList r1 = r5.f35267l
            java.lang.Object r1 = r1.get(r3)
            xc.a r1 = (p907xc.C20455a) r1
            int r3 = r1.getIntrinsicHeight()
        L_0x001b:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.mo42112b():int");
    }

    /* renamed from: c */
    public final ValueAnimator mo42113c(boolean z) {
        float f;
        ValueAnimator valueAnimator;
        long j;
        TimeInterpolator timeInterpolator;
        float f2 = 1.0f;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        if (z) {
            valueAnimator = this.f35277q;
        } else {
            valueAnimator = this.f35275p;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        if (!z) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        if (z) {
            j = 83;
        } else {
            j = 117;
        }
        ofFloat.setDuration(j);
        if (z) {
            timeInterpolator = C13577a.f33541e;
        } else {
            timeInterpolator = C13577a.f33539c;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new C14108b());
        return ofFloat;
    }

    /* renamed from: d */
    public final void mo42114d(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate(((float) (this.f35285x + ((int) (mo42153n(f) * ((float) i))))) - (((float) drawable.getBounds().width()) / 2.0f), ((float) i2) - (((float) drawable.getBounds().height()) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f35263h.mo23401d(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f35257b.setColor(mo42120g(this.f35268l0));
        this.f35258c.setColor(mo42120g(this.f35256U));
        this.f35261f.setColor(mo42120g(this.f35255T));
        this.f35262g.setColor(mo42120g(this.f35254S));
        Iterator it = this.f35267l.iterator();
        while (it.hasNext()) {
            C20455a aVar = (C20455a) it.next();
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.f35270m0.isStateful()) {
            this.f35270m0.setState(getDrawableState());
        }
        this.f35260e.setColor(mo42120g(this.f35253R));
        this.f35260e.setAlpha(63);
    }

    /* renamed from: e */
    public final void mo42118e() {
        if (this.f35273o) {
            this.f35273o = false;
            ValueAnimator c = mo42113c(false);
            this.f35277q = c;
            this.f35275p = null;
            c.addListener(new C14109c());
            this.f35277q.start();
        }
    }

    /* renamed from: f */
    public final String mo42119f(float f) {
        boolean z;
        String str;
        C14115c cVar = this.f35240E;
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C4454r0) cVar).getClass();
            String[] strArr = C19039c.f48415s;
            Object[] objArr = {Integer.valueOf(Math.round(f))};
            String str2 = C20964s0.f52718a;
            return String.format((Locale) null, "%d°C", objArr);
        }
        if (((float) ((int) f)) == f) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, new Object[]{Float.valueOf(f)});
    }

    /* renamed from: g */
    public final int mo42120g(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f35263h.f22189h;
    }

    public int getActiveThumbIndex() {
        return this.f35245J;
    }

    public int getFocusedThumbIndex() {
        return this.f35246K;
    }

    public int getHaloRadius() {
        return this.f35236A;
    }

    public ColorStateList getHaloTintList() {
        return this.f35253R;
    }

    public int getLabelBehavior() {
        return this.f35283v;
    }

    public float getMinSeparation() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getStepSize() {
        return this.f35247L;
    }

    public float getThumbElevation() {
        return this.f35270m0.f49837b.f49874n;
    }

    public int getThumbRadius() {
        return this.f35287z;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f35270m0.f49837b.f49864d;
    }

    public float getThumbStrokeWidth() {
        return this.f35270m0.f49837b.f49871k;
    }

    public ColorStateList getThumbTintList() {
        return this.f35270m0.f49837b.f49863c;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f35254S;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f35255T;
    }

    public ColorStateList getTickTintList() {
        if (this.f35255T.equals(this.f35254S)) {
            return this.f35254S;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f35256U;
    }

    public int getTrackHeight() {
        return this.f35284w;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f35268l0;
    }

    public int getTrackSidePadding() {
        return this.f35285x;
    }

    public ColorStateList getTrackTintList() {
        if (this.f35268l0.equals(this.f35256U)) {
            return this.f35256U;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f35250O;
    }

    public float getValueFrom() {
        return this.f35242G;
    }

    public float getValueTo() {
        return this.f35243H;
    }

    public List<Float> getValues() {
        return new ArrayList(this.f35244I);
    }

    /* renamed from: h */
    public final boolean mo42147h() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: i */
    public final boolean mo42148i(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f35247L)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo42149j() {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo42150k() {
        if (this.f35247L > BitmapDescriptorFactory.HUE_RED) {
            mo42206u();
            int min = Math.min((int) (((this.f35243H - this.f35242G) / this.f35247L) + 1.0f), (this.f35250O / (this.f35284w * 2)) + 1);
            float[] fArr = this.f35248M;
            if (fArr == null || fArr.length != min * 2) {
                this.f35248M = new float[(min * 2)];
            }
            float f = ((float) this.f35250O) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.f35248M;
                fArr2[i] = (((float) (i / 2)) * f) + ((float) this.f35285x);
                fArr2[i + 1] = (float) mo42112b();
            }
        }
    }

    /* renamed from: l */
    public final boolean mo42151l(int i) {
        int i2 = this.f35246K;
        long j = ((long) i2) + ((long) i);
        long size = (long) (this.f35244I.size() - 1);
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.f35246K = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.f35245J != -1) {
            this.f35245J = i3;
        }
        mo42205t();
        postInvalidate();
        return true;
    }

    /* renamed from: m */
    public final void mo42152m(int i) {
        if (mo42149j()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        mo42151l(i);
    }

    /* renamed from: n */
    public final float mo42153n(float f) {
        float f2 = this.f35242G;
        float f3 = (f - f2) / (this.f35243H - f2);
        if (mo42149j()) {
            return 1.0f - f3;
        }
        return f3;
    }

    /* renamed from: o */
    public final void mo42154o() {
        Iterator it = this.f35271n.iterator();
        while (it.hasNext()) {
            ((C14114b) it.next()).mo42223b();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f35267l.iterator();
        while (it.hasNext()) {
            C20455a aVar = (C20455a) it.next();
            ViewGroup c = C14083r.m35067c(this);
            if (c == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                c.getLocationOnScreen(iArr);
                aVar.f51819K = iArr[0];
                c.getWindowVisibleDisplayFrame(aVar.f51813E);
                c.addOnLayoutChangeListener(aVar.f51812D);
            }
        }
    }

    public final void onDetachedFromWindow() {
        C14080o oVar;
        BaseSlider<S, L, T>.C16530d dVar = this.f35265j;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f35273o = false;
        Iterator it = this.f35267l.iterator();
        while (it.hasNext()) {
            C20455a aVar = (C20455a) it.next();
            ViewGroup c = C14083r.m35067c(this);
            if (c == null) {
                oVar = null;
            } else {
                oVar = new C14080o(c);
            }
            if (oVar != null) {
                ((ViewOverlay) oVar.f35108a).remove(aVar);
                ViewGroup c2 = C14083r.m35067c(this);
                if (c2 == null) {
                    aVar.getClass();
                } else {
                    c2.removeOnLayoutChangeListener(aVar.f51812D);
                }
            }
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d9, code lost:
        if (r0 != false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            boolean r0 = r6.f35252Q
            if (r0 == 0) goto L_0x000d
            r15.mo42206u()
            r15.mo42150k()
        L_0x000d:
            super.onDraw(r16)
            int r8 = r15.mo42112b()
            int r0 = r6.f35250O
            float[] r9 = r15.getActiveRange()
            int r1 = r6.f35285x
            float r2 = (float) r1
            r10 = 1
            r3 = r9[r10]
            float r11 = (float) r0
            float r3 = r3 * r11
            float r2 = r2 + r3
            int r1 = r1 + r0
            float r3 = (float) r1
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0034
            float r4 = (float) r8
            android.graphics.Paint r5 = r6.f35257b
            r0 = r16
            r1 = r2
            r2 = r4
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x0034:
            int r0 = r6.f35285x
            float r1 = (float) r0
            r12 = 0
            r0 = r9[r12]
            float r0 = r0 * r11
            float r3 = r0 + r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004b
            float r4 = (float) r8
            android.graphics.Paint r5 = r6.f35257b
            r0 = r16
            r2 = r4
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x004b:
            java.util.List r0 = r15.getValues()
            java.lang.Object r0 = java.util.Collections.max(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r1 = r6.f35242G
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            int r0 = r6.f35250O
            float[] r1 = r15.getActiveRange()
            int r2 = r6.f35285x
            float r2 = (float) r2
            r3 = r1[r10]
            float r0 = (float) r0
            float r3 = r3 * r0
            float r3 = r3 + r2
            r1 = r1[r12]
            float r1 = r1 * r0
            float r1 = r1 + r2
            float r4 = (float) r8
            android.graphics.Paint r5 = r6.f35258c
            r0 = r16
            r2 = r4
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x007c:
            boolean r0 = r6.f35249N
            r9 = -1
            r11 = 2
            if (r0 == 0) goto L_0x00c7
            float r0 = r6.f35247L
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
            goto L_0x00c7
        L_0x008a:
            float[] r0 = r15.getActiveRange()
            float[] r1 = r6.f35248M
            r2 = r0[r12]
            int r1 = r1.length
            int r1 = r1 / r11
            int r1 = r1 + r9
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            float[] r2 = r6.f35248M
            r0 = r0[r10]
            int r2 = r2.length
            int r2 = r2 / r11
            int r2 = r2 + r9
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float[] r2 = r6.f35248M
            int r1 = r1 * 2
            android.graphics.Paint r3 = r6.f35261f
            r7.drawPoints(r2, r12, r1, r3)
            float[] r2 = r6.f35248M
            int r0 = r0 * 2
            int r3 = r0 - r1
            android.graphics.Paint r4 = r6.f35262g
            r7.drawPoints(r2, r1, r3, r4)
            float[] r1 = r6.f35248M
            int r2 = r1.length
            int r2 = r2 - r0
            android.graphics.Paint r3 = r6.f35261f
            r7.drawPoints(r1, r0, r2, r3)
        L_0x00c7:
            boolean r0 = r6.f35241F
            r13 = 3
            if (r0 != 0) goto L_0x00db
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x00db
            int r0 = r6.f35283v
            if (r0 != r13) goto L_0x00d8
            r0 = 1
            goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            if (r0 == 0) goto L_0x01cb
        L_0x00db:
            boolean r0 = r15.isEnabled()
            if (r0 == 0) goto L_0x01cb
            int r0 = r6.f35250O
            android.graphics.drawable.Drawable r1 = r15.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.RippleDrawable
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x012a
            int r1 = r6.f35285x
            float r1 = (float) r1
            java.util.ArrayList<java.lang.Float> r2 = r6.f35244I
            int r3 = r6.f35246K
            java.lang.Object r2 = r2.get(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r2 = r15.mo42153n(r2)
            float r0 = (float) r0
            float r2 = r2 * r0
            float r2 = r2 + r1
            int r14 = (int) r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0120
            int r0 = r6.f35236A
            int r1 = r14 - r0
            float r1 = (float) r1
            int r2 = r8 - r0
            float r2 = (float) r2
            int r3 = r14 + r0
            float r3 = (float) r3
            int r0 = r0 + r8
            float r4 = (float) r0
            android.graphics.Region$Op r5 = android.graphics.Region.Op.UNION
            r0 = r16
            r0.clipRect(r1, r2, r3, r4, r5)
        L_0x0120:
            float r0 = (float) r14
            float r1 = (float) r8
            int r2 = r6.f35236A
            float r2 = (float) r2
            android.graphics.Paint r3 = r6.f35260e
            r7.drawCircle(r0, r1, r2, r3)
        L_0x012a:
            int r0 = r6.f35245J
            if (r0 != r9) goto L_0x013d
            int r0 = r6.f35283v
            if (r0 != r13) goto L_0x0134
            r0 = 1
            goto L_0x0135
        L_0x0134:
            r0 = 0
        L_0x0135:
            if (r0 == 0) goto L_0x0138
            goto L_0x013d
        L_0x0138:
            r15.mo42118e()
            goto L_0x01ce
        L_0x013d:
            int r0 = r6.f35283v
            if (r0 != r11) goto L_0x0143
            goto L_0x01ce
        L_0x0143:
            boolean r0 = r6.f35273o
            if (r0 != 0) goto L_0x0155
            r6.f35273o = r10
            android.animation.ValueAnimator r0 = r15.mo42113c(r10)
            r6.f35275p = r0
            r1 = 0
            r6.f35277q = r1
            r0.start()
        L_0x0155:
            java.util.ArrayList r0 = r6.f35267l
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x015c:
            java.util.ArrayList<java.lang.Float> r2 = r6.f35244I
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0187
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0187
            int r2 = r6.f35246K
            if (r1 != r2) goto L_0x016f
            goto L_0x0184
        L_0x016f:
            java.lang.Object r2 = r0.next()
            xc.a r2 = (p907xc.C20455a) r2
            java.util.ArrayList<java.lang.Float> r3 = r6.f35244I
            java.lang.Object r3 = r3.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r15.mo42167q(r2, r3)
        L_0x0184:
            int r1 = r1 + 1
            goto L_0x015c
        L_0x0187:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01a5
            java.lang.Object r0 = r0.next()
            xc.a r0 = (p907xc.C20455a) r0
            java.util.ArrayList<java.lang.Float> r1 = r6.f35244I
            int r2 = r6.f35246K
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r15.mo42167q(r0, r1)
            goto L_0x01ce
        L_0x01a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.util.ArrayList r2 = r6.f35267l
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r12] = r2
            java.util.ArrayList<java.lang.Float> r2 = r6.f35244I
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r10] = r2
            java.lang.String r2 = "Not enough labels(%d) to display all the values(%d)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x01cb:
            r15.mo42118e()
        L_0x01ce:
            int r9 = r6.f35250O
        L_0x01d0:
            java.util.ArrayList<java.lang.Float> r0 = r6.f35244I
            int r0 = r0.size()
            if (r12 >= r0) goto L_0x0232
            java.util.ArrayList<java.lang.Float> r0 = r6.f35244I
            java.lang.Object r0 = r0.get(r12)
            java.lang.Float r0 = (java.lang.Float) r0
            float r4 = r0.floatValue()
            android.graphics.drawable.Drawable r5 = r6.f35272n0
            if (r5 == 0) goto L_0x01f1
            r0 = r15
            r1 = r16
            r2 = r9
            r3 = r8
            r0.mo42114d(r1, r2, r3, r4, r5)
            goto L_0x022f
        L_0x01f1:
            java.util.List<android.graphics.drawable.Drawable> r0 = r6.f35274o0
            int r0 = r0.size()
            if (r12 >= r0) goto L_0x020b
            java.util.List<android.graphics.drawable.Drawable> r0 = r6.f35274o0
            java.lang.Object r0 = r0.get(r12)
            r5 = r0
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r0 = r15
            r1 = r16
            r2 = r9
            r3 = r8
            r0.mo42114d(r1, r2, r3, r4, r5)
            goto L_0x022f
        L_0x020b:
            boolean r0 = r15.isEnabled()
            if (r0 != 0) goto L_0x0225
            int r0 = r6.f35285x
            float r0 = (float) r0
            float r1 = r15.mo42153n(r4)
            float r2 = (float) r9
            float r1 = r1 * r2
            float r1 = r1 + r0
            float r0 = (float) r8
            int r2 = r6.f35287z
            float r2 = (float) r2
            android.graphics.Paint r3 = r6.f35259d
            r7.drawCircle(r1, r0, r2, r3)
        L_0x0225:
            tc.g r5 = r6.f35270m0
            r0 = r15
            r1 = r16
            r2 = r9
            r3 = r8
            r0.mo42114d(r1, r2, r3, r4, r5)
        L_0x022f:
            int r12 = r12 + 1
            goto L_0x01d0
        L_0x0232:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onDraw(android.graphics.Canvas):void");
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f35245J = -1;
            this.f35263h.mo23398a(this.f35246K);
            return;
        }
        if (i == 1) {
            mo42151l(Integer.MAX_VALUE);
        } else if (i == 2) {
            mo42151l(Integer.MIN_VALUE);
        } else if (i == 17) {
            mo42152m(Integer.MAX_VALUE);
        } else if (i == 66) {
            mo42152m(Integer.MIN_VALUE);
        }
        this.f35263h.mo23411n(this.f35246K);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r13.isEnabled()
            if (r0 != 0) goto L_0x000b
            boolean r14 = super.onKeyDown(r14, r15)
            return r14
        L_0x000b:
            java.util.ArrayList<java.lang.Float> r0 = r13.f35244I
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0017
            r13.f35245J = r1
        L_0x0017:
            int r0 = r13.f35245J
            r3 = 66
            r4 = 61
            r5 = 0
            r6 = 81
            r7 = 70
            r8 = 69
            r9 = -1
            if (r0 != r9) goto L_0x0083
            if (r14 == r4) goto L_0x0057
            if (r14 == r3) goto L_0x004d
            if (r14 == r6) goto L_0x0047
            if (r14 == r8) goto L_0x0041
            if (r14 == r7) goto L_0x0047
            switch(r14) {
                case 21: goto L_0x003b;
                case 22: goto L_0x0035;
                case 23: goto L_0x004d;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0077
        L_0x0035:
            r13.mo42152m(r2)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x003b:
            r13.mo42152m(r9)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0041:
            r13.mo42151l(r9)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0047:
            r13.mo42151l(r2)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x004d:
            int r0 = r13.f35246K
            r13.f35245J = r0
            r13.postInvalidate()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0077
        L_0x0057:
            boolean r0 = r15.hasNoModifiers()
            if (r0 == 0) goto L_0x0066
            boolean r0 = r13.mo42151l(r2)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            goto L_0x0077
        L_0x0066:
            boolean r0 = r15.isShiftPressed()
            if (r0 == 0) goto L_0x0075
            boolean r0 = r13.mo42151l(r9)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            goto L_0x0077
        L_0x0075:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L_0x0077:
            if (r5 == 0) goto L_0x007e
            boolean r14 = r5.booleanValue()
            goto L_0x0082
        L_0x007e:
            boolean r14 = super.onKeyDown(r14, r15)
        L_0x0082:
            return r14
        L_0x0083:
            boolean r0 = r13.f35251P
            boolean r10 = r15.isLongPress()
            r0 = r0 | r10
            r13.f35251P = r0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r0 == 0) goto L_0x00b0
            float r0 = r13.f35247L
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r10 = r0
        L_0x0099:
            float r0 = r13.f35243H
            float r11 = r13.f35242G
            float r0 = r0 - r11
            float r0 = r0 / r10
            r11 = 20
            float r11 = (float) r11
            int r12 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r12 > 0) goto L_0x00a7
            goto L_0x00b8
        L_0x00a7:
            float r0 = r0 / r11
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r10 = r10 * r0
            goto L_0x00b8
        L_0x00b0:
            float r0 = r13.f35247L
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r10 = r0
        L_0x00b8:
            r0 = 21
            if (r14 == r0) goto L_0x00de
            r0 = 22
            if (r14 == r0) goto L_0x00d2
            if (r14 == r8) goto L_0x00cc
            if (r14 == r7) goto L_0x00c7
            if (r14 == r6) goto L_0x00c7
            goto L_0x00ea
        L_0x00c7:
            java.lang.Float r5 = java.lang.Float.valueOf(r10)
            goto L_0x00ea
        L_0x00cc:
            float r0 = -r10
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            goto L_0x00ea
        L_0x00d2:
            boolean r0 = r13.mo42149j()
            if (r0 == 0) goto L_0x00d9
            float r10 = -r10
        L_0x00d9:
            java.lang.Float r5 = java.lang.Float.valueOf(r10)
            goto L_0x00ea
        L_0x00de:
            boolean r0 = r13.mo42149j()
            if (r0 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            float r10 = -r10
        L_0x00e6:
            java.lang.Float r5 = java.lang.Float.valueOf(r10)
        L_0x00ea:
            if (r5 == 0) goto L_0x010e
            java.util.ArrayList<java.lang.Float> r14 = r13.f35244I
            int r15 = r13.f35245J
            java.lang.Object r14 = r14.get(r15)
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            float r15 = r5.floatValue()
            float r15 = r15 + r14
            int r14 = r13.f35245J
            boolean r14 = r13.mo42168r(r15, r14)
            if (r14 == 0) goto L_0x010d
            r13.mo42205t()
            r13.postInvalidate()
        L_0x010d:
            return r2
        L_0x010e:
            r0 = 23
            if (r14 == r0) goto L_0x0132
            if (r14 == r4) goto L_0x011b
            if (r14 == r3) goto L_0x0132
            boolean r14 = super.onKeyDown(r14, r15)
            return r14
        L_0x011b:
            boolean r14 = r15.hasNoModifiers()
            if (r14 == 0) goto L_0x0126
            boolean r14 = r13.mo42151l(r2)
            return r14
        L_0x0126:
            boolean r14 = r15.isShiftPressed()
            if (r14 == 0) goto L_0x0131
            boolean r14 = r13.mo42151l(r9)
            return r14
        L_0x0131:
            return r1
        L_0x0132:
            r13.f35245J = r9
            r13.postInvalidate()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f35251P = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r6 = r4.f35282u
            int r0 = r4.f35283v
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x000f
            r3 = 3
            if (r0 != r3) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            if (r1 == 0) goto L_0x001b
        L_0x000f:
            java.util.ArrayList r0 = r4.f35267l
            java.lang.Object r0 = r0.get(r2)
            xc.a r0 = (p907xc.C20455a) r0
            int r2 = r0.getIntrinsicHeight()
        L_0x001b:
            int r6 = r6 + r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f35242G = sliderState.f35288b;
        this.f35243H = sliderState.f35289c;
        setValuesInternal(sliderState.f35290d);
        this.f35247L = sliderState.f35291e;
        if (sliderState.f35292f) {
            requestFocus();
        }
    }

    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f35288b = this.f35242G;
        sliderState.f35289c = this.f35243H;
        sliderState.f35290d = new ArrayList<>(this.f35244I);
        sliderState.f35291e = this.f35247L;
        sliderState.f35292f = hasFocus();
        return sliderState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f35250O = Math.max(i - (this.f35285x * 2), 0);
        mo42150k();
        mo42205t();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.f35285x)) / ((float) this.f35250O);
        this.f35276p0 = f;
        float max = Math.max(BitmapDescriptorFactory.HUE_RED, f);
        this.f35276p0 = max;
        this.f35276p0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f35238C = x;
            if (!mo42147h()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo42166p()) {
                    requestFocus();
                    this.f35241F = true;
                    mo42168r(getValueOfTouchPosition(), this.f35245J);
                    mo42205t();
                    invalidate();
                    mo42154o();
                }
            }
        } else if (actionMasked == 1) {
            this.f35241F = false;
            MotionEvent motionEvent2 = this.f35239D;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f35239D.getX() - motionEvent.getX()) <= ((float) this.f35279r) && Math.abs(this.f35239D.getY() - motionEvent.getY()) <= ((float) this.f35279r) && mo42166p()) {
                mo42154o();
            }
            if (this.f35245J != -1) {
                mo42168r(getValueOfTouchPosition(), this.f35245J);
                this.f35245J = -1;
                Iterator it = this.f35271n.iterator();
                while (it.hasNext()) {
                    ((C14114b) it.next()).mo42222a();
                }
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f35241F) {
                if (mo42147h() && Math.abs(x - this.f35238C) < ((float) this.f35279r)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                mo42154o();
            }
            if (mo42166p()) {
                this.f35241F = true;
                mo42168r(getValueOfTouchPosition(), this.f35245J);
                mo42205t();
                invalidate();
            }
        }
        setPressed(this.f35241F);
        this.f35239D = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* renamed from: p */
    public boolean mo42166p() {
        boolean z;
        if (this.f35245J != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float n = (mo42153n(valueOfTouchPositionAbsolute) * ((float) this.f35250O)) + ((float) this.f35285x);
        this.f35245J = 0;
        float abs = Math.abs(this.f35244I.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f35244I.size(); i++) {
            float abs2 = Math.abs(this.f35244I.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float n2 = (mo42153n(this.f35244I.get(i).floatValue()) * ((float) this.f35250O)) + ((float) this.f35285x);
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!mo42149j() ? n2 - n >= BitmapDescriptorFactory.HUE_RED : n2 - n <= BitmapDescriptorFactory.HUE_RED) {
                z = false;
            } else {
                z = true;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f35245J = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(n2 - n) < ((float) this.f35279r)) {
                    this.f35245J = -1;
                    return false;
                } else if (z) {
                    this.f35245J = i;
                }
            }
            abs = abs2;
        }
        if (this.f35245J != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void mo42167q(C20455a aVar, float f) {
        C14080o oVar;
        String f2 = mo42119f(f);
        if (!TextUtils.equals(aVar.f51824z, f2)) {
            aVar.f51824z = f2;
            aVar.f51811C.f35100d = true;
            aVar.invalidateSelf();
        }
        int n = (this.f35285x + ((int) (mo42153n(f) * ((float) this.f35250O)))) - (aVar.getIntrinsicWidth() / 2);
        int b = mo42112b() - (this.f35237B + this.f35287z);
        aVar.setBounds(n, b - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + n, b);
        Rect rect = new Rect(aVar.getBounds());
        C14050d.m35035c(C14083r.m35067c(this), this, rect);
        aVar.setBounds(rect);
        ViewGroup c = C14083r.m35067c(this);
        if (c == null) {
            oVar = null;
        } else {
            oVar = new C14080o(c);
        }
        ((ViewOverlay) oVar.f35108a).add(aVar);
    }

    /* renamed from: r */
    public final boolean mo42168r(float f, int i) {
        float f2;
        float f3;
        this.f35246K = i;
        if (((double) Math.abs(f - this.f35244I.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f35278q0 == 0) {
            if (minSeparation == BitmapDescriptorFactory.HUE_RED) {
                minSeparation = BitmapDescriptorFactory.HUE_RED;
            } else {
                float f4 = (minSeparation - ((float) this.f35285x)) / ((float) this.f35250O);
                float f5 = this.f35242G;
                minSeparation = C16759e.m42347c(f5, this.f35243H, f4, f5);
            }
        }
        if (mo42149j()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        if (i2 >= this.f35244I.size()) {
            f2 = this.f35243H;
        } else {
            f2 = this.f35244I.get(i2).floatValue() - minSeparation;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            f3 = this.f35242G;
        } else {
            f3 = minSeparation + this.f35244I.get(i3).floatValue();
        }
        if (f < f3) {
            f = f3;
        } else if (f > f2) {
            f = f2;
        }
        this.f35244I.set(i, Float.valueOf(f));
        Iterator it = this.f35269m.iterator();
        while (it.hasNext()) {
            ((C14113a) it.next()).mo42221a(this, this.f35244I.get(i).floatValue());
        }
        AccessibilityManager accessibilityManager = this.f35264i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        BaseSlider<S, L, T>.C16530d dVar = this.f35265j;
        if (dVar == null) {
            this.f35265j = new C14110d();
        } else {
            removeCallbacks(dVar);
        }
        BaseSlider<S, L, T>.C16530d dVar2 = this.f35265j;
        dVar2.f35298b = i;
        postDelayed(dVar2, 200);
        return true;
    }

    /* renamed from: s */
    public final void mo42169s(int i, Rect rect) {
        int n = this.f35285x + ((int) (mo42153n(getValues().get(i).floatValue()) * ((float) this.f35250O)));
        int b = mo42112b();
        int i2 = this.f35287z;
        rect.set(n - i2, b - i2, n + i2, b + i2);
    }

    public void setActiveThumbIndex(int i) {
        this.f35245J = i;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, (Paint) null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f35244I.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f35246K = i;
        this.f35263h.mo23411n(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.f35236A) {
            this.f35236A = i;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                postInvalidate();
                return;
            }
            RippleDrawable rippleDrawable = (RippleDrawable) background;
            int i2 = this.f35236A;
            if (Build.VERSION.SDK_INT >= 23) {
                rippleDrawable.setRadius(i2);
                return;
            }
            Class<RippleDrawable> cls = RippleDrawable.class;
            try {
                cls.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE}).invoke(rippleDrawable, new Object[]{Integer.valueOf(i2)});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f35253R)) {
            this.f35253R = colorStateList;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                this.f35260e.setColor(mo42120g(colorStateList));
                this.f35260e.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.f35283v != i) {
            this.f35283v = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(C14115c cVar) {
        this.f35240E = cVar;
    }

    public void setSeparationUnit(int i) {
        this.f35278q0 = i;
        this.f35252Q = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(f), Float.valueOf(this.f35242G), Float.valueOf(this.f35243H)}));
        } else if (this.f35247L != f) {
            this.f35247L = f;
            this.f35252Q = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f35270m0.mo52003m(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i != this.f35287z) {
            this.f35287z = i;
            this.f35285x = this.f35280s + Math.max(i - this.f35281t, 0);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15076c(this)) {
                this.f35250O = Math.max(getWidth() - (this.f35285x * 2), 0);
                mo42150k();
            }
            C19648g gVar = this.f35270m0;
            C19654k.C19655a aVar = new C19654k.C19655a();
            float f = (float) this.f35287z;
            C6181b I = C21100e.m49312I(0);
            aVar.f49899a = I;
            float b = C19654k.C19655a.m47129b(I);
            if (b != -1.0f) {
                aVar.mo52026f(b);
            }
            aVar.f49900b = I;
            float b2 = C19654k.C19655a.m47129b(I);
            if (b2 != -1.0f) {
                aVar.mo52027g(b2);
            }
            aVar.f49901c = I;
            float b3 = C19654k.C19655a.m47129b(I);
            if (b3 != -1.0f) {
                aVar.mo52025e(b3);
            }
            aVar.f49902d = I;
            float b4 = C19654k.C19655a.m47129b(I);
            if (b4 != -1.0f) {
                aVar.mo52024d(b4);
            }
            aVar.mo52023c(f);
            gVar.setShapeAppearanceModel(new C19654k(aVar));
            C19648g gVar2 = this.f35270m0;
            int i2 = this.f35287z * 2;
            gVar2.setBounds(0, 0, i2, i2);
            Drawable drawable = this.f35272n0;
            if (drawable != null) {
                mo42111a(drawable);
            }
            for (Drawable a : this.f35274o0) {
                mo42111a(a);
            }
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f35270m0.mo52011s(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(C4732a.getColorStateList(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        C19648g gVar = this.f35270m0;
        gVar.f49837b.f49871k = f;
        gVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f35270m0.f49837b.f49863c)) {
            this.f35270m0.mo52005n(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f35254S)) {
            this.f35254S = colorStateList;
            this.f35262g.setColor(mo42120g(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f35255T)) {
            this.f35255T = colorStateList;
            this.f35261f.setColor(mo42120g(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f35249N != z) {
            this.f35249N = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f35256U)) {
            this.f35256U = colorStateList;
            this.f35258c.setColor(mo42120g(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.f35284w != i) {
            this.f35284w = i;
            this.f35257b.setStrokeWidth((float) i);
            this.f35258c.setStrokeWidth((float) this.f35284w);
            this.f35261f.setStrokeWidth(((float) this.f35284w) / 2.0f);
            this.f35262g.setStrokeWidth(((float) this.f35284w) / 2.0f);
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f35268l0)) {
            this.f35268l0 = colorStateList;
            this.f35257b.setColor(mo42120g(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f35242G = f;
        this.f35252Q = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f35243H = f;
        this.f35252Q = true;
        postInvalidate();
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* renamed from: t */
    public final void mo42205t() {
        if (!(!(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int n = (int) ((mo42153n(this.f35244I.get(this.f35246K).floatValue()) * ((float) this.f35250O)) + ((float) this.f35285x));
                int b = mo42112b();
                int i = this.f35236A;
                C5450a.C5452b.m13615f(background, n - i, b - i, n + i, b + i);
            }
        }
    }

    /* renamed from: u */
    public final void mo42206u() {
        if (this.f35252Q) {
            float f = this.f35242G;
            float f2 = this.f35243H;
            if (f >= f2) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.valueOf(this.f35242G), Float.valueOf(this.f35243H)}));
            } else if (f2 <= f) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.valueOf(this.f35243H), Float.valueOf(this.f35242G)}));
            } else if (this.f35247L <= BitmapDescriptorFactory.HUE_RED || mo42148i(f2 - f)) {
                Iterator<Float> it = this.f35244I.iterator();
                while (it.hasNext()) {
                    Float next = it.next();
                    if (next.floatValue() < this.f35242G || next.floatValue() > this.f35243H) {
                        throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{next, Float.valueOf(this.f35242G), Float.valueOf(this.f35243H)}));
                    } else if (this.f35247L > BitmapDescriptorFactory.HUE_RED && !mo42148i(next.floatValue() - this.f35242G)) {
                        throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{next, Float.valueOf(this.f35242G), Float.valueOf(this.f35247L), Float.valueOf(this.f35247L)}));
                    }
                }
                float minSeparation = getMinSeparation();
                if (minSeparation >= BitmapDescriptorFactory.HUE_RED) {
                    float f3 = this.f35247L;
                    if (f3 > BitmapDescriptorFactory.HUE_RED && minSeparation > BitmapDescriptorFactory.HUE_RED) {
                        if (this.f35278q0 != 1) {
                            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f35247L)}));
                        } else if (minSeparation < f3 || !mo42148i(minSeparation)) {
                            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f35247L), Float.valueOf(this.f35247L)}));
                        }
                    }
                    float f4 = this.f35247L;
                    if (f4 != BitmapDescriptorFactory.HUE_RED) {
                        if (((float) ((int) f4)) != f4) {
                            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"stepSize", Float.valueOf(f4)});
                        }
                        float f5 = this.f35242G;
                        if (((float) ((int) f5)) != f5) {
                            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"valueFrom", Float.valueOf(f5)});
                        }
                        float f6 = this.f35243H;
                        if (((float) ((int) f6)) != f6) {
                            String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", new Object[]{"valueTo", Float.valueOf(f6)});
                        }
                    }
                    this.f35252Q = false;
                    return;
                }
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", new Object[]{Float.valueOf(minSeparation)}));
            } else {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.valueOf(this.f35247L), Float.valueOf(this.f35242G), Float.valueOf(this.f35243H)}));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BaseSlider(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f35235r0
            android.content.Context r11 = p883wc.C20289a.m47861a(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f35267l = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f35269m = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f35271n = r11
            r11 = 0
            r10.f35273o = r11
            r10.f35241F = r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f35244I = r0
            r0 = -1
            r10.f35245J = r0
            r10.f35246K = r0
            r6 = 0
            r10.f35247L = r6
            r7 = 1
            r10.f35249N = r7
            r10.f35251P = r11
            tc.g r8 = new tc.g
            r8.<init>()
            r10.f35270m0 = r8
            java.util.List r0 = java.util.Collections.emptyList()
            r10.f35274o0 = r0
            r10.f35278q0 = r11
            android.content.Context r9 = r10.getContext()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f35257b = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f35258c = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r7)
            r10.f35259d = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            r1.<init>(r2)
            r0.setXfermode(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r7)
            r10.f35260e = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f35261f = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f35262g = r0
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.content.res.Resources r0 = r9.getResources()
            int r1 = p355ac.C13403d.mtrl_slider_widget_height
            int r1 = r0.getDimensionPixelSize(r1)
            r10.f35282u = r1
            int r1 = p355ac.C13403d.mtrl_slider_track_side_padding
            int r1 = r0.getDimensionPixelOffset(r1)
            r10.f35280s = r1
            r10.f35285x = r1
            int r1 = p355ac.C13403d.mtrl_slider_thumb_radius
            int r1 = r0.getDimensionPixelSize(r1)
            r10.f35281t = r1
            int r1 = p355ac.C13403d.mtrl_slider_track_top
            int r1 = r0.getDimensionPixelOffset(r1)
            r10.f35286y = r1
            int r1 = p355ac.C13403d.mtrl_slider_label_padding
            int r0 = r0.getDimensionPixelSize(r1)
            r10.f35237B = r0
            com.google.android.material.slider.BaseSlider$a r0 = new com.google.android.material.slider.BaseSlider$a
            r0.<init>(r12, r13)
            r10.f35266k = r0
            int[] r2 = p355ac.C13411l.Slider
            int[] r5 = new int[r11]
            r0 = r9
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            int r13 = p355ac.C13411l.Slider_android_valueFrom
            float r13 = r12.getFloat(r13, r6)
            r10.f35242G = r13
            int r13 = p355ac.C13411l.Slider_android_valueTo
            r0 = 1065353216(0x3f800000, float:1.0)
            float r13 = r12.getFloat(r13, r0)
            r10.f35243H = r13
            java.lang.Float[] r13 = new java.lang.Float[r7]
            float r0 = r10.f35242G
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r13[r11] = r0
            r10.setValues((java.lang.Float[]) r13)
            int r13 = p355ac.C13411l.Slider_android_stepSize
            float r13 = r12.getFloat(r13, r6)
            r10.f35247L = r13
            int r13 = p355ac.C13411l.Slider_trackColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0121
            r1 = r13
            goto L_0x0123
        L_0x0121:
            int r1 = p355ac.C13411l.Slider_trackColorInactive
        L_0x0123:
            if (r0 == 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            int r13 = p355ac.C13411l.Slider_trackColorActive
        L_0x0128:
            android.content.res.ColorStateList r0 = p742qc.C19099c.m46247a(r9, r12, r1)
            if (r0 == 0) goto L_0x012f
            goto L_0x0135
        L_0x012f:
            int r0 = p355ac.C13402c.material_slider_inactive_track_color
            android.content.res.ColorStateList r0 = p090g1.C4732a.getColorStateList(r9, r0)
        L_0x0135:
            r10.setTrackInactiveTintList(r0)
            android.content.res.ColorStateList r13 = p742qc.C19099c.m46247a(r9, r12, r13)
            if (r13 == 0) goto L_0x013f
            goto L_0x0145
        L_0x013f:
            int r13 = p355ac.C13402c.material_slider_active_track_color
            android.content.res.ColorStateList r13 = p090g1.C4732a.getColorStateList(r9, r13)
        L_0x0145:
            r10.setTrackActiveTintList(r13)
            int r13 = p355ac.C13411l.Slider_thumbColor
            android.content.res.ColorStateList r13 = p742qc.C19099c.m46247a(r9, r12, r13)
            r8.mo52005n(r13)
            int r13 = p355ac.C13411l.Slider_thumbStrokeColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0160
            android.content.res.ColorStateList r13 = p742qc.C19099c.m46247a(r9, r12, r13)
            r10.setThumbStrokeColor(r13)
        L_0x0160:
            int r13 = p355ac.C13411l.Slider_thumbStrokeWidth
            float r13 = r12.getDimension(r13, r6)
            r10.setThumbStrokeWidth(r13)
            int r13 = p355ac.C13411l.Slider_haloColor
            android.content.res.ColorStateList r13 = p742qc.C19099c.m46247a(r9, r12, r13)
            if (r13 == 0) goto L_0x0172
            goto L_0x0178
        L_0x0172:
            int r13 = p355ac.C13402c.material_slider_halo_color
            android.content.res.ColorStateList r13 = p090g1.C4732a.getColorStateList(r9, r13)
        L_0x0178:
            r10.setHaloTintList(r13)
            int r13 = p355ac.C13411l.Slider_tickVisible
            boolean r13 = r12.getBoolean(r13, r7)
            r10.f35249N = r13
            int r13 = p355ac.C13411l.Slider_tickColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x018d
            r1 = r13
            goto L_0x018f
        L_0x018d:
            int r1 = p355ac.C13411l.Slider_tickColorInactive
        L_0x018f:
            if (r0 == 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            int r13 = p355ac.C13411l.Slider_tickColorActive
        L_0x0194:
            android.content.res.ColorStateList r0 = p742qc.C19099c.m46247a(r9, r12, r1)
            if (r0 == 0) goto L_0x019b
            goto L_0x01a1
        L_0x019b:
            int r0 = p355ac.C13402c.material_slider_inactive_tick_marks_color
            android.content.res.ColorStateList r0 = p090g1.C4732a.getColorStateList(r9, r0)
        L_0x01a1:
            r10.setTickInactiveTintList(r0)
            android.content.res.ColorStateList r13 = p742qc.C19099c.m46247a(r9, r12, r13)
            if (r13 == 0) goto L_0x01ab
            goto L_0x01b1
        L_0x01ab:
            int r13 = p355ac.C13402c.material_slider_active_tick_marks_color
            android.content.res.ColorStateList r13 = p090g1.C4732a.getColorStateList(r9, r13)
        L_0x01b1:
            r10.setTickActiveTintList(r13)
            int r13 = p355ac.C13411l.Slider_thumbRadius
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.setThumbRadius(r13)
            int r13 = p355ac.C13411l.Slider_haloRadius
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.setHaloRadius(r13)
            int r13 = p355ac.C13411l.Slider_thumbElevation
            float r13 = r12.getDimension(r13, r6)
            r10.setThumbElevation(r13)
            int r13 = p355ac.C13411l.Slider_trackHeight
            int r13 = r12.getDimensionPixelSize(r13, r11)
            r10.setTrackHeight(r13)
            int r13 = p355ac.C13411l.Slider_labelBehavior
            int r13 = r12.getInt(r13, r11)
            r10.setLabelBehavior(r13)
            int r13 = p355ac.C13411l.Slider_android_enabled
            boolean r13 = r12.getBoolean(r13, r7)
            if (r13 != 0) goto L_0x01ec
            r10.setEnabled(r11)
        L_0x01ec:
            r12.recycle()
            r10.setFocusable(r7)
            r10.setClickable(r7)
            r8.mo52010r()
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r9)
            int r11 = r11.getScaledTouchSlop()
            r10.f35279r = r11
            com.google.android.material.slider.BaseSlider$e r11 = new com.google.android.material.slider.BaseSlider$e
            r11.<init>(r10)
            r10.f35263h = r11
            p242s1.C6333d0.m15029q(r10, r11)
            android.content.Context r11 = r10.getContext()
            java.lang.String r12 = "accessibility"
            java.lang.Object r11 = r11.getSystemService(r12)
            android.view.accessibility.AccessibilityManager r11 = (android.view.accessibility.AccessibilityManager) r11
            r10.f35264i = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        mo42111a(newDrawable);
        this.f35272n0 = newDrawable;
        this.f35274o0.clear();
        postInvalidate();
    }

    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.f35272n0 = null;
        this.f35274o0 = new ArrayList();
        for (Drawable mutate : drawableArr) {
            List<Drawable> list = this.f35274o0;
            Drawable newDrawable = mutate.mutate().getConstantState().newDrawable();
            mo42111a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
