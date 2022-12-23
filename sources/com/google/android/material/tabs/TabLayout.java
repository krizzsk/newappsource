package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0432l1;
import androidx.core.widget.C0801k;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.C13897a;
import com.google.android.material.internal.C14083r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p127j.C5344a;
import p141k1.C5450a;
import p229r1.C6235e;
import p229r1.C6236f;
import p242s1.C6333d0;
import p242s1.C6362h;
import p242s1.C6382p0;
import p242s1.C6411x;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13407h;
import p355ac.C13409j;
import p355ac.C13410k;
import p380bc.C13577a;
import p859vc.C20103a;
import p859vc.C20104b;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {

    /* renamed from: S */
    public static final int f35372S = C13410k.Widget_Design_TabLayout;

    /* renamed from: T */
    public static final C6236f f35373T = new C6236f(16);

    /* renamed from: A */
    public int f35374A;

    /* renamed from: B */
    public boolean f35375B;

    /* renamed from: C */
    public boolean f35376C;

    /* renamed from: D */
    public int f35377D;

    /* renamed from: E */
    public int f35378E;

    /* renamed from: F */
    public boolean f35379F;

    /* renamed from: G */
    public C14147a f35380G;

    /* renamed from: H */
    public C14139c f35381H;

    /* renamed from: I */
    public final ArrayList<C14139c> f35382I;

    /* renamed from: J */
    public C14146j f35383J;

    /* renamed from: K */
    public ValueAnimator f35384K;

    /* renamed from: L */
    public ViewPager f35385L;

    /* renamed from: M */
    public PagerAdapter f35386M;

    /* renamed from: N */
    public C14141e f35387N;

    /* renamed from: O */
    public C14144h f35388O;

    /* renamed from: P */
    public C14138b f35389P;

    /* renamed from: Q */
    public boolean f35390Q;

    /* renamed from: R */
    public final C6235e f35391R;

    /* renamed from: b */
    public final ArrayList<C14143g> f35392b;

    /* renamed from: c */
    public C14143g f35393c;

    /* renamed from: d */
    public final C14142f f35394d;

    /* renamed from: e */
    public int f35395e;

    /* renamed from: f */
    public int f35396f;

    /* renamed from: g */
    public int f35397g;

    /* renamed from: h */
    public int f35398h;

    /* renamed from: i */
    public int f35399i;

    /* renamed from: j */
    public ColorStateList f35400j;

    /* renamed from: k */
    public ColorStateList f35401k;

    /* renamed from: l */
    public ColorStateList f35402l;

    /* renamed from: m */
    public Drawable f35403m;

    /* renamed from: n */
    public int f35404n;

    /* renamed from: o */
    public PorterDuff.Mode f35405o;

    /* renamed from: p */
    public float f35406p;

    /* renamed from: q */
    public float f35407q;

    /* renamed from: r */
    public final int f35408r;

    /* renamed from: s */
    public int f35409s;

    /* renamed from: t */
    public final int f35410t;

    /* renamed from: u */
    public final int f35411u;

    /* renamed from: v */
    public final int f35412v;

    /* renamed from: w */
    public int f35413w;

    /* renamed from: x */
    public int f35414x;

    /* renamed from: y */
    public int f35415y;

    /* renamed from: z */
    public int f35416z;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C14137a implements ValueAnimator.AnimatorUpdateListener {
        public C14137a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C14138b implements ViewPager.OnAdapterChangeListener {

        /* renamed from: b */
        public boolean f35418b;

        public C14138b() {
        }

        public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f35385L == viewPager) {
                tabLayout.mo42312l(pagerAdapter2, this.f35418b);
            }
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C14139c<T extends C14143g> {
        /* renamed from: a */
        void mo42349a();

        /* renamed from: b */
        void mo42350b(T t);

        /* renamed from: c */
        void mo42351c();
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface C14140d extends C14139c<C14143g> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C14141e extends DataSetObserver {
        public C14141e() {
        }

        public final void onChanged() {
            TabLayout.this.mo42309i();
        }

        public final void onInvalidated() {
            TabLayout.this.mo42309i();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public class C14142f extends LinearLayout {

        /* renamed from: g */
        public static final /* synthetic */ int f35421g = 0;

        /* renamed from: b */
        public ValueAnimator f35422b;

        /* renamed from: c */
        public int f35423c = -1;

        /* renamed from: d */
        public float f35424d;

        /* renamed from: e */
        public int f35425e = -1;

        public C14142f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* renamed from: a */
        public final void mo42354a() {
            View childAt = getChildAt(this.f35423c);
            TabLayout tabLayout = TabLayout.this;
            C14147a aVar = tabLayout.f35380G;
            Drawable drawable = tabLayout.f35403m;
            aVar.getClass();
            RectF a = C14147a.m35210a(tabLayout, childAt);
            drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        }

        /* renamed from: b */
        public final void mo42355b(int i) {
            Rect bounds = TabLayout.this.f35403m.getBounds();
            TabLayout.this.f35403m.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* renamed from: c */
        public final void mo42356c(View view, View view2, float f) {
            boolean z;
            if (view == null || view.getWidth() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f35380G.mo42381b(tabLayout, view, view2, f, tabLayout.f35403m);
            } else {
                Drawable drawable = TabLayout.this.f35403m;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f35403m.getBounds().bottom);
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }

        /* renamed from: d */
        public final void mo42357d(int i, int i2, boolean z) {
            View childAt = getChildAt(this.f35423c);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                mo42354a();
                return;
            }
            C14148b bVar = new C14148b(this, childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f35422b = valueAnimator;
                valueAnimator.setInterpolator(C13577a.f33538b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
                valueAnimator.addUpdateListener(bVar);
                valueAnimator.addListener(new C14149c(this, i));
                valueAnimator.start();
                return;
            }
            this.f35422b.removeAllUpdateListeners();
            this.f35422b.addUpdateListener(bVar);
        }

        public final void draw(Canvas canvas) {
            int height = TabLayout.this.f35403m.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.f35403m.getIntrinsicHeight();
            }
            int i = TabLayout.this.f35416z;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                if (i != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.f35403m.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f35403m.getBounds();
                TabLayout.this.f35403m.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f35403m;
                if (tabLayout.f35404n != 0) {
                    drawable = C5450a.m13604g(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f35404n, PorterDuff.Mode.SRC_IN);
                    } else {
                        C5450a.C5452b.m13616g(drawable, TabLayout.this.f35404n);
                    }
                } else if (Build.VERSION.SDK_INT == 21) {
                    drawable.setColorFilter((ColorFilter) null);
                } else {
                    C5450a.C5452b.m13617h(drawable, (ColorStateList) null);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f35422b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo42354a();
            } else {
                mo42357d(this.f35423c, -1, false);
            }
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f35414x == 1 || tabLayout.f35374A == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C14083r.m35066b(16, getContext())) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != BitmapDescriptorFactory.HUE_RED) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f35414x = 0;
                            tabLayout2.mo42315o(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f35425e != i) {
                requestLayout();
                this.f35425e = i;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C14143g {

        /* renamed from: a */
        public Drawable f35427a;

        /* renamed from: b */
        public CharSequence f35428b;

        /* renamed from: c */
        public CharSequence f35429c;

        /* renamed from: d */
        public int f35430d = -1;

        /* renamed from: e */
        public View f35431e;

        /* renamed from: f */
        public int f35432f = 1;

        /* renamed from: g */
        public TabLayout f35433g;

        /* renamed from: h */
        public C14145i f35434h;

        /* renamed from: i */
        public int f35435i = -1;

        /* renamed from: a */
        public final void mo42362a(int i) {
            this.f35431e = LayoutInflater.from(this.f35434h.getContext()).inflate(i, this.f35434h, false);
            mo42365d();
        }

        /* renamed from: b */
        public final void mo42363b(Drawable drawable) {
            this.f35427a = drawable;
            TabLayout tabLayout = this.f35433g;
            if (tabLayout.f35414x == 1 || tabLayout.f35374A == 2) {
                tabLayout.mo42315o(true);
            }
            mo42365d();
        }

        /* renamed from: c */
        public final void mo42364c(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f35429c) && !TextUtils.isEmpty(charSequence)) {
                this.f35434h.setContentDescription(charSequence);
            }
            this.f35428b = charSequence;
            mo42365d();
        }

        /* renamed from: d */
        public final void mo42365d() {
            C14145i iVar = this.f35434h;
            if (iVar != null) {
                iVar.mo42369d();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C14144h implements ViewPager.OnPageChangeListener {

        /* renamed from: b */
        public final WeakReference<TabLayout> f35436b;

        /* renamed from: c */
        public int f35437c;

        /* renamed from: d */
        public int f35438d;

        public C14144h(TabLayout tabLayout) {
            this.f35436b = new WeakReference<>(tabLayout);
        }

        public final void onPageScrollStateChanged(int i) {
            this.f35437c = this.f35438d;
            this.f35438d = i;
        }

        public final void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f35436b.get();
            if (tabLayout != null) {
                int i3 = this.f35438d;
                boolean z2 = false;
                if (i3 != 2 || this.f35437c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i3 == 2 && this.f35437c == 0)) {
                    z2 = true;
                }
                tabLayout.mo42313m(i, f, z, z2);
            }
        }

        public final void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = this.f35436b.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f35438d;
                if (i2 == 0 || (i2 == 2 && this.f35437c == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo42311k(tabLayout.mo42295g(i), z);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C14145i extends LinearLayout {

        /* renamed from: m */
        public static final /* synthetic */ int f35439m = 0;

        /* renamed from: b */
        public C14143g f35440b;

        /* renamed from: c */
        public TextView f35441c;

        /* renamed from: d */
        public ImageView f35442d;

        /* renamed from: e */
        public View f35443e;

        /* renamed from: f */
        public C13897a f35444f;

        /* renamed from: g */
        public View f35445g;

        /* renamed from: h */
        public TextView f35446h;

        /* renamed from: i */
        public ImageView f35447i;

        /* renamed from: j */
        public Drawable f35448j;

        /* renamed from: k */
        public int f35449k = 2;

        public C14145i(Context context) {
            super(context);
            C6411x xVar;
            mo42371e(context);
            int i = TabLayout.this.f35395e;
            int i2 = TabLayout.this.f35396f;
            int i3 = TabLayout.this.f35397g;
            int i4 = TabLayout.this.f35398h;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6338e.m15070k(this, i, i2, i3, i4);
            setGravity(17);
            setOrientation(TabLayout.this.f35375B ^ true ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                xVar = new C6411x(C6411x.C6412a.m15316b(context2, 1002));
            } else {
                xVar = new C6411x((PointerIcon) null);
            }
            if (i5 >= 24) {
                C6333d0.C6345k.m15117d(this, xVar.f20078a);
            }
        }

        private C13897a getBadge() {
            return this.f35444f;
        }

        private C13897a getOrCreateBadge() {
            if (this.f35444f == null) {
                this.f35444f = new C13897a(getContext(), (BadgeState.State) null);
            }
            mo42367b();
            C13897a aVar = this.f35444f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: a */
        public final void mo42366a() {
            boolean z;
            if (this.f35444f != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f35443e;
                if (view != null) {
                    C13897a aVar = this.f35444f;
                    if (aVar != null) {
                        if (aVar.mo40985d() != null) {
                            aVar.mo40985d().setForeground((Drawable) null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.f35443e = null;
                }
            }
        }

        /* renamed from: b */
        public final void mo42367b() {
            boolean z;
            C14143g gVar;
            C14143g gVar2;
            boolean z2 = true;
            if (this.f35444f != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f35445g != null) {
                    mo42366a();
                    return;
                }
                ImageView imageView = this.f35442d;
                if (imageView == null || (gVar2 = this.f35440b) == null || gVar2.f35427a == null) {
                    TextView textView = this.f35441c;
                    if (textView == null || (gVar = this.f35440b) == null || gVar.f35432f != 1) {
                        mo42366a();
                    } else if (this.f35443e != textView) {
                        mo42366a();
                        TextView textView2 = this.f35441c;
                        if (this.f35444f == null) {
                            z2 = false;
                        }
                        if (z2 && textView2 != null) {
                            setClipChildren(false);
                            setClipToPadding(false);
                            ViewGroup viewGroup = (ViewGroup) getParent();
                            if (viewGroup != null) {
                                viewGroup.setClipChildren(false);
                                viewGroup.setClipToPadding(false);
                            }
                            C13897a aVar = this.f35444f;
                            Rect rect = new Rect();
                            textView2.getDrawingRect(rect);
                            aVar.setBounds(rect);
                            aVar.mo40989g(textView2, (FrameLayout) null);
                            if (aVar.mo40985d() != null) {
                                aVar.mo40985d().setForeground(aVar);
                            } else {
                                textView2.getOverlay().add(aVar);
                            }
                            this.f35443e = textView2;
                        }
                    } else {
                        mo42368c(textView);
                    }
                } else if (this.f35443e != imageView) {
                    mo42366a();
                    ImageView imageView2 = this.f35442d;
                    if (this.f35444f == null) {
                        z2 = false;
                    }
                    if (z2 && imageView2 != null) {
                        setClipChildren(false);
                        setClipToPadding(false);
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.setClipChildren(false);
                            viewGroup2.setClipToPadding(false);
                        }
                        C13897a aVar2 = this.f35444f;
                        Rect rect2 = new Rect();
                        imageView2.getDrawingRect(rect2);
                        aVar2.setBounds(rect2);
                        aVar2.mo40989g(imageView2, (FrameLayout) null);
                        if (aVar2.mo40985d() != null) {
                            aVar2.mo40985d().setForeground(aVar2);
                        } else {
                            imageView2.getOverlay().add(aVar2);
                        }
                        this.f35443e = imageView2;
                    }
                } else {
                    mo42368c(imageView);
                }
            }
        }

        /* renamed from: c */
        public final void mo42368c(View view) {
            boolean z;
            C13897a aVar = this.f35444f;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && view == this.f35443e) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                aVar.setBounds(rect);
                aVar.mo40989g(view, (FrameLayout) null);
            }
        }

        /* renamed from: d */
        public final void mo42369d() {
            View view;
            boolean z;
            C14143g gVar = this.f35440b;
            if (gVar != null) {
                view = gVar.f35431e;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f35445g = view;
                TextView textView = this.f35441c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f35442d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f35442d.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f35446h = textView2;
                if (textView2 != null) {
                    this.f35449k = C0801k.C0802a.m2428b(textView2);
                }
                this.f35447i = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f35445g;
                if (view2 != null) {
                    removeView(view2);
                    this.f35445g = null;
                }
                this.f35446h = null;
                this.f35447i = null;
            }
            boolean z2 = false;
            if (this.f35445g == null) {
                if (this.f35442d == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C13407h.design_layout_tab_icon, this, false);
                    this.f35442d = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f35441c == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(C13407h.design_layout_tab_text, this, false);
                    this.f35441c = textView3;
                    addView(textView3);
                    this.f35449k = C0801k.C0802a.m2428b(this.f35441c);
                }
                C0801k.m2424f(this.f35441c, TabLayout.this.f35399i);
                ColorStateList colorStateList = TabLayout.this.f35400j;
                if (colorStateList != null) {
                    this.f35441c.setTextColor(colorStateList);
                }
                mo42372f(this.f35441c, this.f35442d);
                mo42367b();
                ImageView imageView3 = this.f35442d;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new C14150d(this, imageView3));
                }
                TextView textView4 = this.f35441c;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new C14150d(this, textView4));
                }
            } else {
                TextView textView5 = this.f35446h;
                if (!(textView5 == null && this.f35447i == null)) {
                    mo42372f(textView5, this.f35447i);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f35429c)) {
                setContentDescription(gVar.f35429c);
            }
            if (gVar != null) {
                TabLayout tabLayout = gVar.f35433g;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    if (selectedTabPosition == -1 || selectedTabPosition != gVar.f35430d) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        z2 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z2);
        }

        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f35448j;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f35448j.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo42371e(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f35408r
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = p127j.C5344a.m13397a(r6, r0)
                r5.f35448j = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f35448j
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f35448j = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f35402l
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f35402l
                android.content.res.ColorStateList r2 = p763rc.C19252b.m46504a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f35379F
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                java.util.WeakHashMap<android.view.View, s1.p0> r0 = p242s1.C6333d0.f19990a
                p242s1.C6333d0.C6337d.m15057q(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C14145i.mo42371e(android.content.Context):void");
        }

        /* renamed from: f */
        public final void mo42372f(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i;
            Drawable drawable2;
            C14143g gVar = this.f35440b;
            CharSequence charSequence2 = null;
            if (gVar == null || (drawable2 = gVar.f35427a) == null) {
                drawable = null;
            } else {
                drawable = C5450a.m13604g(drawable2).mutate();
            }
            if (drawable != null) {
                C5450a.C5452b.m13617h(drawable, TabLayout.this.f35401k);
                PorterDuff.Mode mode = TabLayout.this.f35405o;
                if (mode != null) {
                    C5450a.C5452b.m13618i(drawable, mode);
                }
            }
            C14143g gVar2 = this.f35440b;
            if (gVar2 != null) {
                charSequence = gVar2.f35428b;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.f35440b.f35432f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i = 0;
                } else {
                    i = (int) C14083r.m35066b(8, getContext());
                }
                if (TabLayout.this.f35375B) {
                    if (i != C6362h.m15166b(marginLayoutParams)) {
                        C6362h.m15171g(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    C6362h.m15171g(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C14143g gVar3 = this.f35440b;
            if (gVar3 != null) {
                charSequence2 = gVar3.f35429c;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    charSequence = charSequence2;
                }
                C0432l1.m1181a(this, charSequence);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f35441c, this.f35442d, this.f35445g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f35441c, this.f35442d, this.f35445g};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public C14143g getTab() {
            return this.f35440b;
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C13897a aVar = this.f35444f;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f35444f.mo40984c());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C6531g.C6534c.m15467a(0, 1, this.f35440b.f35430d, 1, isSelected()).f20353a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C6531g.C6532a.f20339g.f20348a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(C13409j.item_view_role_description));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x0096;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L_0x001e
                if (r1 == 0) goto L_0x0014
                if (r0 <= r2) goto L_0x001e
            L_0x0014:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.f35409s
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x001e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.f35441c
                if (r0 == 0) goto L_0x00a6
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f35406p
                int r1 = r7.f35449k
                android.widget.ImageView r2 = r7.f35442d
                r3 = 1
                if (r2 == 0) goto L_0x0038
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L_0x0038
                r1 = 1
                goto L_0x0046
            L_0x0038:
                android.widget.TextView r2 = r7.f35441c
                if (r2 == 0) goto L_0x0046
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L_0x0046
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.f35407q
            L_0x0046:
                android.widget.TextView r2 = r7.f35441c
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.f35441c
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.f35441c
                int r5 = androidx.core.widget.C0801k.C0802a.m2428b(r5)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L_0x0060
                if (r5 < 0) goto L_0x00a6
                if (r1 == r5) goto L_0x00a6
            L_0x0060:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.f35374A
                r6 = 0
                if (r5 != r3) goto L_0x0097
                if (r2 <= 0) goto L_0x0097
                if (r4 != r3) goto L_0x0097
                android.widget.TextView r2 = r7.f35441c
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L_0x0096
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0097
            L_0x0096:
                r3 = 0
            L_0x0097:
                if (r3 == 0) goto L_0x00a6
                android.widget.TextView r2 = r7.f35441c
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.f35441c
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L_0x00a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C14145i.onMeasure(int, int):void");
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f35440b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            C14143g gVar = this.f35440b;
            TabLayout tabLayout = gVar.f35433g;
            if (tabLayout != null) {
                tabLayout.mo42311k(gVar, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f35441c;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f35442d;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f35445g;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(C14143g gVar) {
            if (gVar != this.f35440b) {
                this.f35440b = gVar;
                mo42369d();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C14146j implements C14140d {

        /* renamed from: a */
        public final ViewPager f35451a;

        public C14146j(ViewPager viewPager) {
            this.f35451a = viewPager;
        }

        /* renamed from: a */
        public final void mo42349a() {
        }

        /* renamed from: b */
        public final void mo42350b(C14143g gVar) {
            this.f35451a.setCurrentItem(gVar.f35430d);
        }

        /* renamed from: c */
        public final void mo42351c() {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.tabStyle);
    }

    private int getDefaultHeight() {
        int size = this.f35392b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C14143g gVar = this.f35392b.get(i);
                if (gVar != null && gVar.f35427a != null && !TextUtils.isEmpty(gVar.f35428b)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        if (!z || this.f35375B) {
            return 48;
        }
        return 72;
    }

    private int getTabMinWidth() {
        int i = this.f35410t;
        if (i != -1) {
            return i;
        }
        int i2 = this.f35374A;
        if (i2 == 0 || i2 == 2) {
            return this.f35412v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f35394d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f35394d.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f35394d.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    /* renamed from: a */
    public final void mo42285a(C14143g gVar, boolean z) {
        int size = this.f35392b.size();
        if (gVar.f35433g == this) {
            gVar.f35430d = size;
            this.f35392b.add(size, gVar);
            int size2 = this.f35392b.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                this.f35392b.get(size).f35430d = size;
            }
            C14145i iVar = gVar.f35434h;
            iVar.setSelected(false);
            iVar.setActivated(false);
            C14142f fVar = this.f35394d;
            int i = gVar.f35430d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.f35374A == 1 && this.f35414x == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
            }
            fVar.addView(iVar, i, layoutParams);
            if (z) {
                TabLayout tabLayout = gVar.f35433g;
                if (tabLayout != null) {
                    tabLayout.mo42311k(gVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void addView(View view) {
        mo42290b(view);
    }

    /* renamed from: b */
    public final void mo42290b(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            C14143g h = mo42308h();
            CharSequence charSequence = tabItem.f35369b;
            if (charSequence != null) {
                h.mo42364c(charSequence);
            }
            Drawable drawable = tabItem.f35370c;
            if (drawable != null) {
                h.mo42363b(drawable);
            }
            int i = tabItem.f35371d;
            if (i != 0) {
                h.mo42362a(i);
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                h.f35429c = tabItem.getContentDescription();
                h.mo42365d();
            }
            mo42285a(h, this.f35392b.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: c */
    public final void mo42291c(int i) {
        boolean z;
        if (i != -1) {
            if (getWindowToken() != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6340g.m15076c(this)) {
                    C14142f fVar = this.f35394d;
                    int childCount = fVar.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            z = false;
                            break;
                        } else if (fVar.getChildAt(i2).getWidth() <= 0) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        int scrollX = getScrollX();
                        int e = mo42293e(BitmapDescriptorFactory.HUE_RED, i);
                        if (scrollX != e) {
                            mo42294f();
                            this.f35384K.setIntValues(new int[]{scrollX, e});
                            this.f35384K.start();
                        }
                        C14142f fVar2 = this.f35394d;
                        int i3 = this.f35415y;
                        ValueAnimator valueAnimator = fVar2.f35422b;
                        if (valueAnimator != null && valueAnimator.isRunning()) {
                            fVar2.f35422b.cancel();
                        }
                        fVar2.mo42357d(i, i3, true);
                        return;
                    }
                }
            }
            mo42313m(i, BitmapDescriptorFactory.HUE_RED, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 != 2) goto L_0x0042;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42292d() {
        /*
            r5 = this;
            int r0 = r5.f35374A
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x0014
        L_0x000b:
            int r0 = r5.f35413w
            int r3 = r5.f35395e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            com.google.android.material.tabs.TabLayout$f r3 = r5.f35394d
            java.util.WeakHashMap<android.view.View, s1.p0> r4 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6338e.m15070k(r3, r0, r2, r2, r2)
            int r0 = r5.f35374A
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r2) goto L_0x0025
            if (r0 == r1) goto L_0x0025
            goto L_0x0042
        L_0x0025:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f35394d
            r0.setGravity(r2)
            goto L_0x0042
        L_0x002b:
            int r0 = r5.f35414x
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0034
            if (r0 == r1) goto L_0x003a
            goto L_0x0042
        L_0x0034:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f35394d
            r0.setGravity(r2)
            goto L_0x0042
        L_0x003a:
            com.google.android.material.tabs.TabLayout$f r0 = r5.f35394d
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L_0x0042:
            r5.mo42315o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.mo42292d():void");
    }

    /* renamed from: e */
    public final int mo42293e(float f, int i) {
        View childAt;
        View view;
        int i2 = this.f35374A;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f35394d.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        if (i4 < this.f35394d.getChildCount()) {
            view = this.f35394d.getChildAt(i4);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* renamed from: f */
    public final void mo42294f() {
        if (this.f35384K == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f35384K = valueAnimator;
            valueAnimator.setInterpolator(C13577a.f33538b);
            this.f35384K.setDuration((long) this.f35415y);
            this.f35384K.addUpdateListener(new C14137a());
        }
    }

    /* renamed from: g */
    public final C14143g mo42295g(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f35392b.get(i);
    }

    public int getSelectedTabPosition() {
        C14143g gVar = this.f35393c;
        if (gVar != null) {
            return gVar.f35430d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f35392b.size();
    }

    public int getTabGravity() {
        return this.f35414x;
    }

    public ColorStateList getTabIconTint() {
        return this.f35401k;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f35378E;
    }

    public int getTabIndicatorGravity() {
        return this.f35416z;
    }

    public int getTabMaxWidth() {
        return this.f35409s;
    }

    public int getTabMode() {
        return this.f35374A;
    }

    public ColorStateList getTabRippleColor() {
        return this.f35402l;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f35403m;
    }

    public ColorStateList getTabTextColors() {
        return this.f35400j;
    }

    /* renamed from: h */
    public final C14143g mo42308h() {
        C14145i iVar;
        C14143g gVar = (C14143g) f35373T.mo22237b();
        if (gVar == null) {
            gVar = new C14143g();
        }
        gVar.f35433g = this;
        C6235e eVar = this.f35391R;
        if (eVar != null) {
            iVar = (C14145i) eVar.mo22237b();
        } else {
            iVar = null;
        }
        if (iVar == null) {
            iVar = new C14145i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f35429c)) {
            iVar.setContentDescription(gVar.f35428b);
        } else {
            iVar.setContentDescription(gVar.f35429c);
        }
        gVar.f35434h = iVar;
        int i = gVar.f35435i;
        if (i != -1) {
            iVar.setId(i);
        }
        return gVar;
    }

    /* renamed from: i */
    public final void mo42309i() {
        int currentItem;
        mo42310j();
        PagerAdapter pagerAdapter = this.f35386M;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C14143g h = mo42308h();
                h.mo42364c(this.f35386M.getPageTitle(i));
                mo42285a(h, false);
            }
            ViewPager viewPager = this.f35385L;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo42311k(mo42295g(currentItem), true);
            }
        }
    }

    /* renamed from: j */
    public final void mo42310j() {
        for (int childCount = this.f35394d.getChildCount() - 1; childCount >= 0; childCount--) {
            C14145i iVar = (C14145i) this.f35394d.getChildAt(childCount);
            this.f35394d.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab((C14143g) null);
                iVar.setSelected(false);
                this.f35391R.mo22236a(iVar);
            }
            requestLayout();
        }
        Iterator<C14143g> it = this.f35392b.iterator();
        while (it.hasNext()) {
            C14143g next = it.next();
            it.remove();
            next.f35433g = null;
            next.f35434h = null;
            next.f35427a = null;
            next.f35435i = -1;
            next.f35428b = null;
            next.f35429c = null;
            next.f35430d = -1;
            next.f35431e = null;
            f35373T.mo22236a(next);
        }
        this.f35393c = null;
    }

    /* renamed from: k */
    public final void mo42311k(C14143g gVar, boolean z) {
        int i;
        C14143g gVar2 = this.f35393c;
        if (gVar2 != gVar) {
            if (gVar != null) {
                i = gVar.f35430d;
            } else {
                i = -1;
            }
            if (z) {
                if ((gVar2 == null || gVar2.f35430d == -1) && i != -1) {
                    mo42313m(i, BitmapDescriptorFactory.HUE_RED, true, true);
                } else {
                    mo42291c(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.f35393c = gVar;
            if (gVar2 != null) {
                for (int size = this.f35382I.size() - 1; size >= 0; size--) {
                    this.f35382I.get(size).mo42349a();
                }
            }
            if (gVar != null) {
                for (int size2 = this.f35382I.size() - 1; size2 >= 0; size2--) {
                    this.f35382I.get(size2).mo42350b(gVar);
                }
            }
        } else if (gVar2 != null) {
            for (int size3 = this.f35382I.size() - 1; size3 >= 0; size3--) {
                this.f35382I.get(size3).mo42351c();
            }
            mo42291c(gVar.f35430d);
        }
    }

    /* renamed from: l */
    public final void mo42312l(PagerAdapter pagerAdapter, boolean z) {
        C14141e eVar;
        PagerAdapter pagerAdapter2 = this.f35386M;
        if (!(pagerAdapter2 == null || (eVar = this.f35387N) == null)) {
            pagerAdapter2.unregisterDataSetObserver(eVar);
        }
        this.f35386M = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f35387N == null) {
                this.f35387N = new C14141e();
            }
            pagerAdapter.registerDataSetObserver(this.f35387N);
        }
        mo42309i();
    }

    /* renamed from: m */
    public final void mo42313m(int i, float f, boolean z, boolean z2) {
        int i2;
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f35394d.getChildCount()) {
            if (z2) {
                C14142f fVar = this.f35394d;
                ValueAnimator valueAnimator = fVar.f35422b;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.f35422b.cancel();
                }
                fVar.f35423c = i;
                fVar.f35424d = f;
                fVar.mo42356c(fVar.getChildAt(i), fVar.getChildAt(fVar.f35423c + 1), fVar.f35424d);
            }
            ValueAnimator valueAnimator2 = this.f35384K;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f35384K.cancel();
            }
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = mo42293e(f, i);
            }
            scrollTo(i2, 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: n */
    public final void mo42314n(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.f35385L;
        if (viewPager2 != null) {
            C14144h hVar = this.f35388O;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            C14138b bVar = this.f35389P;
            if (bVar != null) {
                this.f35385L.removeOnAdapterChangeListener(bVar);
            }
        }
        C14146j jVar = this.f35383J;
        if (jVar != null) {
            this.f35382I.remove(jVar);
            this.f35383J = null;
        }
        if (viewPager != null) {
            this.f35385L = viewPager;
            if (this.f35388O == null) {
                this.f35388O = new C14144h(this);
            }
            C14144h hVar2 = this.f35388O;
            hVar2.f35438d = 0;
            hVar2.f35437c = 0;
            viewPager.addOnPageChangeListener(hVar2);
            C14146j jVar2 = new C14146j(viewPager);
            this.f35383J = jVar2;
            if (!this.f35382I.contains(jVar2)) {
                this.f35382I.add(jVar2);
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo42312l(adapter, true);
            }
            if (this.f35389P == null) {
                this.f35389P = new C14138b();
            }
            C14138b bVar2 = this.f35389P;
            bVar2.f35418b = true;
            viewPager.addOnAdapterChangeListener(bVar2);
            mo42313m(viewPager.getCurrentItem(), BitmapDescriptorFactory.HUE_RED, true, true);
        } else {
            this.f35385L = null;
            mo42312l((PagerAdapter) null, false);
        }
        this.f35390Q = z;
    }

    /* renamed from: o */
    public final void mo42315o(boolean z) {
        for (int i = 0; i < this.f35394d.getChildCount(); i++) {
            View childAt = this.f35394d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f35374A == 1 && this.f35414x == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
            }
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21100e.m49297A0(this);
        if (this.f35385L == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                mo42314n((ViewPager) parent, true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f35390Q) {
            setupWithViewPager((ViewPager) null);
            this.f35390Q = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.C14145i) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$f r1 = r7.f35394d
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.google.android.material.tabs.TabLayout$f r1 = r7.f35394d
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.C14145i
            if (r2 == 0) goto L_0x0031
            com.google.android.material.tabs.TabLayout$i r1 = (com.google.android.material.tabs.TabLayout.C14145i) r1
            android.graphics.drawable.Drawable r2 = r1.f35448j
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.f35448j
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6531g.C6533b.m15466a(1, getTabCount(), 1, false).f20352a);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (getTabMode() == 0 || getTabMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C14083r.m35066b(r1, r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f35411u
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C14083r.m35066b(r2, r1)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f35409s = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f35374A
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getActionMasked() == 8) {
            if (getTabMode() == 0 || getTabMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C21100e.m49378z0(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f35375B != z) {
            this.f35375B = z;
            for (int i = 0; i < this.f35394d.getChildCount(); i++) {
                View childAt = this.f35394d.getChildAt(i);
                if (childAt instanceof C14145i) {
                    C14145i iVar = (C14145i) childAt;
                    iVar.setOrientation(TabLayout.this.f35375B ^ true ? 1 : 0);
                    TextView textView = iVar.f35446h;
                    if (textView == null && iVar.f35447i == null) {
                        iVar.mo42372f(iVar.f35441c, iVar.f35442d);
                    } else {
                        iVar.mo42372f(textView, iVar.f35447i);
                    }
                }
            }
            mo42292d();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C14140d dVar) {
        setOnTabSelectedListener((C14139c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        mo42294f();
        this.f35384K.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f35403m != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f35403m = drawable;
            int i = this.f35377D;
            if (i == -1) {
                i = drawable.getIntrinsicHeight();
            }
            this.f35394d.mo42355b(i);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f35404n = i;
        mo42315o(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f35416z != i) {
            this.f35416z = i;
            C14142f fVar = this.f35394d;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(fVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f35377D = i;
        this.f35394d.mo42355b(i);
    }

    public void setTabGravity(int i) {
        if (this.f35414x != i) {
            this.f35414x = i;
            mo42292d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f35401k != colorStateList) {
            this.f35401k = colorStateList;
            int size = this.f35392b.size();
            for (int i = 0; i < size; i++) {
                this.f35392b.get(i).mo42365d();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C4732a.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f35378E = i;
        if (i == 0) {
            this.f35380G = new C14147a();
        } else if (i == 1) {
            this.f35380G = new C20103a();
        } else if (i == 2) {
            this.f35380G = new C20104b();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f35376C = z;
        C14142f fVar = this.f35394d;
        int i = C14142f.f35421g;
        fVar.mo42354a();
        C14142f fVar2 = this.f35394d;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15051k(fVar2);
    }

    public void setTabMode(int i) {
        if (i != this.f35374A) {
            this.f35374A = i;
            mo42292d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f35402l != colorStateList) {
            this.f35402l = colorStateList;
            for (int i = 0; i < this.f35394d.getChildCount(); i++) {
                View childAt = this.f35394d.getChildAt(i);
                if (childAt instanceof C14145i) {
                    Context context = getContext();
                    int i2 = C14145i.f35439m;
                    ((C14145i) childAt).mo42371e(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C4732a.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f35400j != colorStateList) {
            this.f35400j = colorStateList;
            int size = this.f35392b.size();
            for (int i = 0; i < size; i++) {
                this.f35392b.get(i).mo42365d();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo42312l(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f35379F != z) {
            this.f35379F = z;
            for (int i = 0; i < this.f35394d.getChildCount(); i++) {
                View childAt = this.f35394d.getChildAt(i);
                if (childAt instanceof C14145i) {
                    Context context = getContext();
                    int i2 = C14145i.f35439m;
                    ((C14145i) childAt).mo42371e(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        mo42314n(viewPager, false);
    }

    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = f35372S
            android.content.Context r12 = p883wc.C20289a.m47861a(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f35392b = r12
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r11.f35403m = r12
            r12 = 0
            r11.f35404n = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.f35409s = r0
            r6 = -1
            r11.f35377D = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f35382I = r0
            r1.e r0 = new r1.e
            r1 = 12
            r0.<init>(r1)
            r11.f35391R = r0
            android.content.Context r7 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$f r8 = new com.google.android.material.tabs.TabLayout$f
            r8.<init>(r7)
            r11.f35394d = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r6)
            super.addView(r8, r12, r0)
            int[] r2 = p355ac.C13411l.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = p355ac.C13411l.TabLayout_tabTextAppearance
            r5[r12] = r10
            r0 = r7
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.google.android.material.internal.C14077m.m35060d(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x0086
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            tc.g r0 = new tc.g
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo52005n(r14)
            r0.mo52001k(r7)
            java.util.WeakHashMap<android.view.View, s1.p0> r14 = p242s1.C6333d0.f19990a
            float r14 = p242s1.C6333d0.C6342i.m15092i(r11)
            r0.mo52003m(r14)
            p242s1.C6333d0.C6337d.m15057q(r11, r0)
        L_0x0086:
            int r14 = p355ac.C13411l.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r14 = p742qc.C19099c.m46250d(r7, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = p355ac.C13411l.TabLayout_tabIndicatorColor
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = p355ac.C13411l.TabLayout_tabIndicatorHeight
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r8.mo42355b(r14)
            int r14 = p355ac.C13411l.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = p355ac.C13411l.TabLayout_tabIndicatorAnimationMode
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = p355ac.C13411l.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = p355ac.C13411l.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f35398h = r14
            r11.f35397g = r14
            r11.f35396f = r14
            r11.f35395e = r14
            int r0 = p355ac.C13411l.TabLayout_tabPaddingStart
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.f35395e = r14
            int r14 = p355ac.C13411l.TabLayout_tabPaddingTop
            int r0 = r11.f35396f
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f35396f = r14
            int r14 = p355ac.C13411l.TabLayout_tabPaddingEnd
            int r0 = r11.f35397g
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f35397g = r14
            int r14 = p355ac.C13411l.TabLayout_tabPaddingBottom
            int r0 = r11.f35398h
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f35398h = r14
            int r14 = p355ac.C13410k.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.f35399i = r14
            int[] r0 = p114i.C5224j.TextAppearance
            android.content.res.TypedArray r14 = r7.obtainStyledAttributes(r14, r0)
            int r0 = p114i.C5224j.TextAppearance_android_textSize     // Catch:{ all -> 0x01cd }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01cd }
            float r0 = (float) r0     // Catch:{ all -> 0x01cd }
            r11.f35406p = r0     // Catch:{ all -> 0x01cd }
            int r0 = p114i.C5224j.TextAppearance_android_textColor     // Catch:{ all -> 0x01cd }
            android.content.res.ColorStateList r0 = p742qc.C19099c.m46247a(r7, r14, r0)     // Catch:{ all -> 0x01cd }
            r11.f35400j = r0     // Catch:{ all -> 0x01cd }
            r14.recycle()
            int r14 = p355ac.C13411l.TabLayout_tabTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0120
            android.content.res.ColorStateList r14 = p742qc.C19099c.m46247a(r7, r13, r14)
            r11.f35400j = r14
        L_0x0120:
            int r14 = p355ac.C13411l.TabLayout_tabSelectedTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x014a
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.f35400j
            int r0 = r0.getDefaultColor()
            r1 = 2
            int[][] r2 = new int[r1][]
            int[] r1 = new int[r1]
            int[] r3 = android.widget.HorizontalScrollView.SELECTED_STATE_SET
            r2[r12] = r3
            r1[r12] = r14
            int[] r14 = android.widget.HorizontalScrollView.EMPTY_STATE_SET
            r2[r9] = r14
            r1[r9] = r0
            android.content.res.ColorStateList r14 = new android.content.res.ColorStateList
            r14.<init>(r2, r1)
            r11.f35400j = r14
        L_0x014a:
            int r14 = p355ac.C13411l.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = p742qc.C19099c.m46247a(r7, r13, r14)
            r11.f35401k = r14
            int r14 = p355ac.C13411l.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r6)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.google.android.material.internal.C14083r.m35069e(r14, r0)
            r11.f35405o = r14
            int r14 = p355ac.C13411l.TabLayout_tabRippleColor
            android.content.res.ColorStateList r14 = p742qc.C19099c.m46247a(r7, r13, r14)
            r11.f35402l = r14
            int r14 = p355ac.C13411l.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.f35415y = r14
            int r14 = p355ac.C13411l.TabLayout_tabMinWidth
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f35410t = r14
            int r14 = p355ac.C13411l.TabLayout_tabMaxWidth
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f35411u = r14
            int r14 = p355ac.C13411l.TabLayout_tabBackground
            int r14 = r13.getResourceId(r14, r12)
            r11.f35408r = r14
            int r14 = p355ac.C13411l.TabLayout_tabContentStart
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f35413w = r14
            int r14 = p355ac.C13411l.TabLayout_tabMode
            int r14 = r13.getInt(r14, r9)
            r11.f35374A = r14
            int r14 = p355ac.C13411l.TabLayout_tabGravity
            int r14 = r13.getInt(r14, r12)
            r11.f35414x = r14
            int r14 = p355ac.C13411l.TabLayout_tabInlineLabel
            boolean r14 = r13.getBoolean(r14, r12)
            r11.f35375B = r14
            int r14 = p355ac.C13411l.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r14, r12)
            r11.f35379F = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = p355ac.C13403d.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f35407q = r13
            int r13 = p355ac.C13403d.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.f35412v = r12
            r11.mo42292d()
            return
        L_0x01cd:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void addView(View view, int i) {
        mo42290b(view);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(C14139c cVar) {
        C14139c cVar2 = this.f35381H;
        if (cVar2 != null) {
            this.f35382I.remove(cVar2);
        }
        this.f35381H = cVar;
        if (cVar != null && !this.f35382I.contains(cVar)) {
            this.f35382I.add(cVar);
        }
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        mo42290b(view);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo42290b(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C5344a.m13397a(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
