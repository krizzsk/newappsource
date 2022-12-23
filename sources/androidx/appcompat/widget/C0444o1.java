package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p114i.C5218d;
import p242s1.C6333d0;
import p242s1.C6365i0;
import p242s1.C6382p0;

/* renamed from: androidx.appcompat.widget.o1 */
public final class C0444o1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l */
    public static C0444o1 f1590l;

    /* renamed from: m */
    public static C0444o1 f1591m;

    /* renamed from: b */
    public final View f1592b;

    /* renamed from: c */
    public final CharSequence f1593c;

    /* renamed from: d */
    public final int f1594d;

    /* renamed from: e */
    public final C0436m1 f1595e = new C0436m1(this, 0);

    /* renamed from: f */
    public final C0441n1 f1596f = new C0441n1(this, 0);

    /* renamed from: g */
    public int f1597g;

    /* renamed from: h */
    public int f1598h;

    /* renamed from: i */
    public C0447p1 f1599i;

    /* renamed from: j */
    public boolean f1600j;

    /* renamed from: k */
    public boolean f1601k;

    public C0444o1(View view, CharSequence charSequence) {
        int i;
        this.f1592b = view;
        this.f1593c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C6365i0.f20017a;
        if (Build.VERSION.SDK_INT >= 28) {
            i = C6365i0.C6367b.m15177a(viewConfiguration);
        } else {
            i = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1594d = i;
        this.f1601k = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m1227b(C0444o1 o1Var) {
        C0444o1 o1Var2 = f1590l;
        if (o1Var2 != null) {
            o1Var2.f1592b.removeCallbacks(o1Var2.f1595e);
        }
        f1590l = o1Var;
        if (o1Var != null) {
            o1Var.f1592b.postDelayed(o1Var.f1595e, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void mo2173a() {
        boolean z;
        if (f1591m == this) {
            f1591m = null;
            C0447p1 p1Var = this.f1599i;
            if (p1Var != null) {
                if (p1Var.f1603b.getParent() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((WindowManager) p1Var.f1602a.getSystemService("window")).removeView(p1Var.f1603b);
                }
                this.f1599i = null;
                this.f1601k = true;
                this.f1592b.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1590l == this) {
            m1227b((C0444o1) null);
        }
        this.f1592b.removeCallbacks(this.f1596f);
    }

    /* renamed from: c */
    public final void mo2174c(boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        long j2;
        int i5;
        boolean z3;
        View view = this.f1592b;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15075b(view)) {
            m1227b((C0444o1) null);
            C0444o1 o1Var = f1591m;
            if (o1Var != null) {
                o1Var.mo2173a();
            }
            f1591m = this;
            this.f1600j = z;
            C0447p1 p1Var = new C0447p1(this.f1592b.getContext());
            this.f1599i = p1Var;
            View view2 = this.f1592b;
            int i6 = this.f1597g;
            int i7 = this.f1598h;
            boolean z4 = this.f1600j;
            CharSequence charSequence = this.f1593c;
            if (p1Var.f1603b.getParent() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (p1Var.f1603b.getParent() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    ((WindowManager) p1Var.f1602a.getSystemService("window")).removeView(p1Var.f1603b);
                }
            }
            p1Var.f1604c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = p1Var.f1605d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = p1Var.f1602a.getResources().getDimensionPixelOffset(C5218d.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i6 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = p1Var.f1602a.getResources().getDimensionPixelOffset(C5218d.tooltip_precise_anchor_extra_offset);
                i = i7 + dimensionPixelOffset2;
                i2 = i7 - dimensionPixelOffset2;
            } else {
                i = view2.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = p1Var.f1602a.getResources();
            if (z4) {
                i3 = C5218d.tooltip_y_offset_touch;
            } else {
                i3 = C5218d.tooltip_y_offset_non_touch;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i3);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(p1Var.f1606e);
                Rect rect = p1Var.f1606e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources2 = p1Var.f1602a.getResources();
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                    if (identifier != 0) {
                        i5 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i5 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    p1Var.f1606e.set(0, i5, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(p1Var.f1608g);
                view2.getLocationOnScreen(p1Var.f1607f);
                int[] iArr = p1Var.f1607f;
                int i8 = iArr[0];
                int[] iArr2 = p1Var.f1608g;
                int i9 = i8 - iArr2[0];
                iArr[0] = i9;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (i9 + i6) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                p1Var.f1603b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = p1Var.f1603b.getMeasuredHeight();
                int i11 = p1Var.f1607f[1];
                int i12 = ((i2 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i13 = i11 + i + dimensionPixelOffset3;
                if (z4) {
                    if (i12 >= 0) {
                        layoutParams.y = i12;
                    } else {
                        layoutParams.y = i13;
                    }
                } else if (measuredHeight + i13 <= p1Var.f1606e.height()) {
                    layoutParams.y = i13;
                } else {
                    layoutParams.y = i12;
                }
            }
            ((WindowManager) p1Var.f1602a.getSystemService("window")).addView(p1Var.f1603b, p1Var.f1605d);
            this.f1592b.addOnAttachStateChangeListener(this);
            if (this.f1600j) {
                j = 2500;
            } else {
                if ((C6333d0.C6337d.m15047g(this.f1592b) & 1) == 1) {
                    j2 = 3000;
                    i4 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i4 = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i4);
            }
            this.f1592b.removeCallbacks(this.f1596f);
            this.f1592b.postDelayed(this.f1596f, j);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1599i != null && this.f1600j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1592b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 7) {
            if (action == 10) {
                this.f1601k = true;
                mo2173a();
            }
        } else if (this.f1592b.isEnabled() && this.f1599i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f1601k || Math.abs(x - this.f1597g) > this.f1594d || Math.abs(y - this.f1598h) > this.f1594d) {
                this.f1597g = x;
                this.f1598h = y;
                this.f1601k = false;
            } else {
                z = false;
            }
            if (z) {
                m1227b(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f1597g = view.getWidth() / 2;
        this.f1598h = view.getHeight() / 2;
        mo2174c(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        mo2173a();
    }
}
