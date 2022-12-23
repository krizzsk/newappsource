package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p129j1.C5349b;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6396v0;
import p255t1.C6531g;
import p255t1.C6541k;
import p306x1.C7148c;
import p318y1.C7283a;
import p318y1.C7284b;
import p318y1.C7285c;

public class DrawerLayout extends ViewGroup {

    /* renamed from: E */
    public static final int[] f3432E = {16843828};

    /* renamed from: F */
    public static final int[] f3433F = {16842931};

    /* renamed from: G */
    public static final boolean f3434G = true;

    /* renamed from: H */
    public static final boolean f3435H = true;

    /* renamed from: I */
    public static boolean f3436I;

    /* renamed from: A */
    public final ArrayList<View> f3437A;

    /* renamed from: B */
    public Rect f3438B;

    /* renamed from: C */
    public Matrix f3439C;

    /* renamed from: D */
    public final C0816a f3440D;

    /* renamed from: b */
    public final C0819d f3441b;

    /* renamed from: c */
    public float f3442c;

    /* renamed from: d */
    public int f3443d;

    /* renamed from: e */
    public int f3444e;

    /* renamed from: f */
    public float f3445f;

    /* renamed from: g */
    public Paint f3446g;

    /* renamed from: h */
    public final C7148c f3447h;

    /* renamed from: i */
    public final C7148c f3448i;

    /* renamed from: j */
    public final C0822g f3449j;

    /* renamed from: k */
    public final C0822g f3450k;

    /* renamed from: l */
    public int f3451l;

    /* renamed from: m */
    public boolean f3452m;

    /* renamed from: n */
    public boolean f3453n;

    /* renamed from: o */
    public int f3454o;

    /* renamed from: p */
    public int f3455p;

    /* renamed from: q */
    public int f3456q;

    /* renamed from: r */
    public int f3457r;

    /* renamed from: s */
    public boolean f3458s;

    /* renamed from: t */
    public C0820e f3459t;

    /* renamed from: u */
    public ArrayList f3460u;

    /* renamed from: v */
    public float f3461v;

    /* renamed from: w */
    public float f3462w;

    /* renamed from: x */
    public Drawable f3463x;

    /* renamed from: y */
    public Object f3464y;

    /* renamed from: z */
    public boolean f3465z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C0816a implements C6541k {
        public C0816a() {
        }

        /* renamed from: a */
        public final boolean mo3589a(View view) {
            DrawerLayout.this.getClass();
            if (!DrawerLayout.m2479p(view) || DrawerLayout.this.mo3555j(view) == 2) {
                return false;
            }
            DrawerLayout.this.mo3539c(view, true);
            return true;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class C0817b implements View.OnApplyWindowInsetsListener {
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z2 = true;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z = true;
            } else {
                z = false;
            }
            drawerLayout.f3464y = windowInsets;
            drawerLayout.f3465z = z;
            if (z || drawerLayout.getBackground() != null) {
                z2 = false;
            }
            drawerLayout.setWillNotDraw(z2);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public class C0818c extends C6315a {

        /* renamed from: a */
        public final Rect f3476a = new Rect();

        public C0818c() {
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View h = DrawerLayout.this.mo3553h();
            if (h == null) {
                return true;
            }
            int k = DrawerLayout.this.mo3556k(h);
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            Gravity.getAbsoluteGravity(k, C6333d0.C6338e.m15063d(drawerLayout));
            return true;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            if (DrawerLayout.f3434G) {
                super.onInitializeAccessibilityNodeInfo(view, gVar);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(gVar.f20334a);
                super.onInitializeAccessibilityNodeInfo(view, new C6531g(obtain));
                gVar.f20336c = -1;
                gVar.f20334a.setSource(view);
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                ViewParent f = C6333d0.C6337d.m15046f(view);
                if (f instanceof View) {
                    gVar.f20335b = -1;
                    gVar.f20334a.setParent((View) f);
                }
                Rect rect = this.f3476a;
                obtain.getBoundsInScreen(rect);
                gVar.f20334a.setBoundsInScreen(rect);
                gVar.f20334a.setVisibleToUser(obtain.isVisibleToUser());
                gVar.f20334a.setPackageName(obtain.getPackageName());
                gVar.mo22644i(obtain.getClassName());
                gVar.mo22646k(obtain.getContentDescription());
                gVar.f20334a.setEnabled(obtain.isEnabled());
                gVar.f20334a.setFocused(obtain.isFocused());
                gVar.f20334a.setAccessibilityFocused(obtain.isAccessibilityFocused());
                gVar.f20334a.setSelected(obtain.isSelected());
                gVar.mo22634a(obtain.getActions());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.m2477m(childAt)) {
                        gVar.f20334a.addChild(childAt);
                    }
                }
            }
            gVar.mo22644i("androidx.drawerlayout.widget.DrawerLayout");
            gVar.f20334a.setFocusable(false);
            gVar.f20334a.setFocused(false);
            gVar.f20334a.removeAction((AccessibilityNodeInfo.AccessibilityAction) C6531g.C6532a.f20337e.f20348a);
            gVar.f20334a.removeAction((AccessibilityNodeInfo.AccessibilityAction) C6531g.C6532a.f20338f.f20348a);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f3434G || DrawerLayout.m2477m(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static final class C0819d extends C6315a {
        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            if (!DrawerLayout.m2477m(view)) {
                gVar.f20335b = -1;
                gVar.f20334a.setParent((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public interface C0820e {
        /* renamed from: a */
        void mo933a();

        /* renamed from: b */
        void mo934b(float f);

        /* renamed from: c */
        void mo935c();

        /* renamed from: d */
        void mo936d();
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static abstract class C0821f implements C0820e {
        /* renamed from: a */
        public final void mo933a() {
        }

        /* renamed from: b */
        public final void mo934b(float f) {
        }

        /* renamed from: c */
        public final void mo935c() {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    public class C0822g extends C7148c.C7151c {

        /* renamed from: a */
        public final int f3478a;

        /* renamed from: b */
        public C7148c f3479b;

        /* renamed from: c */
        public final C0823a f3480c = new C0823a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g$a */
        public class C0823a implements Runnable {
            public C0823a() {
            }

            public final void run() {
                boolean z;
                int i;
                View view;
                int i2;
                C0822g gVar = C0822g.this;
                int i3 = gVar.f3479b.f22212o;
                int i4 = 3;
                if (gVar.f3478a == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    view = DrawerLayout.this.mo3546f(3);
                    if (view != null) {
                        i2 = -view.getWidth();
                    } else {
                        i2 = 0;
                    }
                    i = i2 + i3;
                } else {
                    view = DrawerLayout.this.mo3546f(5);
                    i = DrawerLayout.this.getWidth() - i3;
                }
                if (view == null) {
                    return;
                }
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo3555j(view) == 0) {
                    gVar.f3479b.mo23432u(view, i, view.getTop());
                    ((LayoutParams) view.getLayoutParams()).f3468c = true;
                    DrawerLayout.this.invalidate();
                    if (gVar.f3478a == 3) {
                        i4 = 5;
                    }
                    View f = DrawerLayout.this.mo3546f(i4);
                    if (f != null) {
                        DrawerLayout.this.mo3539c(f, true);
                    }
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (!drawerLayout.f3458s) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                        int childCount = drawerLayout.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            drawerLayout.getChildAt(i5).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        drawerLayout.f3458s = true;
                    }
                }
            }
        }

        public C0822g(int i) {
            this.f3478a = i;
        }

        /* renamed from: a */
        public final int mo3593a(View view, int i) {
            if (DrawerLayout.this.mo3538b(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: b */
        public final int mo3594b(View view, int i) {
            return view.getTop();
        }

        /* renamed from: c */
        public final int mo3595c(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.m2480q(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: e */
        public final void mo3596e(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.mo3546f(3);
            } else {
                view = DrawerLayout.this.mo3546f(5);
            }
            if (view != null && DrawerLayout.this.mo3555j(view) == 0) {
                this.f3479b.mo23416c(i2, view);
            }
        }

        /* renamed from: f */
        public final void mo3597f() {
            DrawerLayout.this.postDelayed(this.f3480c, 160);
        }

        /* renamed from: g */
        public final void mo3598g(int i, View view) {
            ((LayoutParams) view.getLayoutParams()).f3468c = false;
            int i2 = 3;
            if (this.f3478a == 3) {
                i2 = 5;
            }
            View f = DrawerLayout.this.mo3546f(i2);
            if (f != null) {
                DrawerLayout.this.mo3539c(f, true);
            }
        }

        /* renamed from: h */
        public final void mo3599h(int i) {
            DrawerLayout.this.mo3585y(i, this.f3479b.f22217t);
        }

        /* renamed from: i */
        public final void mo3600i(View view, int i, int i2) {
            float f;
            int i3;
            int width = view.getWidth();
            if (DrawerLayout.this.mo3538b(3, view)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.mo3582v(view, f2);
            if (f2 == BitmapDescriptorFactory.HUE_RED) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            view.setVisibility(i3);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: j */
        public final void mo3601j(View view, float f, float f2) {
            int i;
            DrawerLayout.this.getClass();
            float f3 = ((LayoutParams) view.getLayoutParams()).f3467b;
            int width = view.getWidth();
            if (DrawerLayout.this.mo3538b(3, view)) {
                int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && f3 > 0.5f)) {
                    i = 0;
                } else {
                    i = -width;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f3479b.mo23430s(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: k */
        public final boolean mo3602k(int i, View view) {
            DrawerLayout.this.getClass();
            if (!DrawerLayout.m2480q(view) || !DrawerLayout.this.mo3538b(this.f3478a, view) || DrawerLayout.this.mo3555j(view) != 0) {
                return false;
            }
            return true;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            z = false;
        }
        f3436I = z;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7283a.drawerLayoutStyle);
    }

    /* renamed from: l */
    public static String m2476l(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: m */
    public static boolean m2477m(View view) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6337d.m15043c(view) == 4 || C6333d0.C6337d.m15043c(view) == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m2478n(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3466a == 0;
    }

    /* renamed from: p */
    public static boolean m2479p(View view) {
        if (!m2480q(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((LayoutParams) view.getLayoutParams()).f3469d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m2480q(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f3466a;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C6333d0.C6338e.m15063d(view));
        if ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m2481r(View view) {
        if (!m2480q(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if (((LayoutParams) view.getLayoutParams()).f3467b > BitmapDescriptorFactory.HUE_RED) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo3535a(C0820e eVar) {
        if (eVar != null) {
            if (this.f3460u == null) {
                this.f3460u = new ArrayList();
            }
            this.f3460u.add(eVar);
        }
    }

    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!m2480q(childAt)) {
                    this.f3437A.add(childAt);
                } else if (m2479p(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f3437A.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f3437A.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f3437A.clear();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo3547g() != null || m2480q(view)) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(view, 4);
        } else {
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(view, 1);
        }
        if (!f3434G) {
            C6333d0.m15029q(view, this.f3441b);
        }
    }

    /* renamed from: b */
    public final boolean mo3538b(int i, View view) {
        return (mo3556k(view) & i) == i;
    }

    /* renamed from: c */
    public final void mo3539c(View view, boolean z) {
        if (m2480q(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3453n) {
                layoutParams.f3467b = BitmapDescriptorFactory.HUE_RED;
                layoutParams.f3469d = 0;
            } else if (z) {
                layoutParams.f3469d |= 4;
                if (mo3538b(3, view)) {
                    this.f3447h.mo23432u(view, -view.getWidth(), view.getTop());
                } else {
                    this.f3448i.mo23432u(view, getWidth(), view.getTop());
                }
            } else {
                mo3572s(view, BitmapDescriptorFactory.HUE_RED);
                mo3585y(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        int childCount = getChildCount();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f3467b);
        }
        this.f3445f = f;
        boolean h = this.f3447h.mo23421h(true);
        boolean h2 = this.f3448i.mo23421h(true);
        if (h || h2) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    /* renamed from: d */
    public final void mo3542d(boolean z) {
        View f = mo3546f(8388611);
        if (f != null) {
            mo3539c(f, z);
            return;
        }
        StringBuilder k = C13555b.m33972k("No drawer view found with gravity ");
        k.append(m2476l(8388611));
        throw new IllegalArgumentException(k.toString());
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3445f <= BitmapDescriptorFactory.HUE_RED) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.f3438B == null) {
                this.f3438B = new Rect();
            }
            childAt.getHitRect(this.f3438B);
            if (this.f3438B.contains((int) x, (int) y) && !m2478n(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f3439C == null) {
                            this.f3439C = new Matrix();
                        }
                        matrix.invert(this.f3439C);
                        obtain.transform(this.f3439C);
                    }
                    z = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        int height = getHeight();
        boolean n = m2478n(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (n) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background == null || background.getOpacity() != -1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && m2480q(childAt) && childAt.getHeight() >= height) {
                        if (mo3538b(3, childAt)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f3445f;
        if (f > BitmapDescriptorFactory.HUE_RED && n) {
            int i4 = this.f3444e;
            this.f3446g.setColor((((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect((float) i, BitmapDescriptorFactory.HUE_RED, (float) width, (float) getHeight(), this.f3446g);
        }
        return drawChild;
    }

    /* renamed from: e */
    public final void mo3545e(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m2480q(childAt) && (!z || layoutParams.f3468c)) {
                int width = childAt.getWidth();
                if (mo3538b(3, childAt)) {
                    z2 = this.f3447h.mo23432u(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f3448i.mo23432u(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                layoutParams.f3468c = false;
            }
        }
        C0822g gVar = this.f3449j;
        DrawerLayout.this.removeCallbacks(gVar.f3480c);
        C0822g gVar2 = this.f3450k;
        DrawerLayout.this.removeCallbacks(gVar2.f3480c);
        if (z3) {
            invalidate();
        }
    }

    /* renamed from: f */
    public final View mo3546f(int i) {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C6333d0.C6338e.m15063d(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo3556k(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final View mo3547g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f3469d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f3435H) {
            return this.f3442c;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3463x;
    }

    /* renamed from: h */
    public final View mo3553h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2480q(childAt) && m2481r(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final int mo3554i(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int d = C6333d0.C6338e.m15063d(this);
        if (i == 3) {
            int i6 = this.f3454o;
            if (i6 != 3) {
                return i6;
            }
            if (d == 0) {
                i2 = this.f3456q;
            } else {
                i2 = this.f3457r;
            }
            if (i2 != 3) {
                return i2;
            }
            return 0;
        } else if (i == 5) {
            int i7 = this.f3455p;
            if (i7 != 3) {
                return i7;
            }
            if (d == 0) {
                i3 = this.f3457r;
            } else {
                i3 = this.f3456q;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 8388611) {
            int i8 = this.f3456q;
            if (i8 != 3) {
                return i8;
            }
            if (d == 0) {
                i4 = this.f3454o;
            } else {
                i4 = this.f3455p;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i9 = this.f3457r;
            if (i9 != 3) {
                return i9;
            }
            if (d == 0) {
                i5 = this.f3455p;
            } else {
                i5 = this.f3454o;
            }
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
    }

    /* renamed from: j */
    public final int mo3555j(View view) {
        if (m2480q(view)) {
            return mo3554i(((LayoutParams) view.getLayoutParams()).f3466a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: k */
    public final int mo3556k(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f3466a;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        return Gravity.getAbsoluteGravity(i, C6333d0.C6338e.m15063d(this));
    }

    /* renamed from: o */
    public final boolean mo3557o() {
        View f = mo3546f(8388611);
        if (f != null) {
            return m2479p(f);
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3453n = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3453n = true;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f3465z && this.f3463x != null) {
            Object obj = this.f3464y;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f3463x.setBounds(0, 0, getWidth(), i);
                this.f3463x.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[LOOP:0: B:8:0x0024->B:20:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0058 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            x1.c r1 = r8.f3447h
            boolean r1 = r1.mo23431t(r9)
            x1.c r2 = r8.f3448i
            boolean r2 = r2.mo23431t(r9)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x007a
            if (r0 == r2) goto L_0x0073
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x0073
            goto L_0x0078
        L_0x001e:
            x1.c r9 = r8.f3447h
            float[] r0 = r9.f22201d
            int r0 = r0.length
            r4 = 0
        L_0x0024:
            if (r4 >= r0) goto L_0x005d
            int r5 = r9.f22208k
            int r6 = r2 << r4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x002f
            r5 = 1
            goto L_0x0030
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 != 0) goto L_0x0033
            goto L_0x0055
        L_0x0033:
            float[] r5 = r9.f22203f
            r5 = r5[r4]
            float[] r6 = r9.f22201d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f22204g
            r6 = r6[r4]
            float[] r7 = r9.f22202e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r9.f22199b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 == 0) goto L_0x005a
            r9 = 1
            goto L_0x005e
        L_0x005a:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x005d:
            r9 = 0
        L_0x005e:
            if (r9 == 0) goto L_0x0078
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.f3449j
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$g$a r9 = r9.f3480c
            r0.removeCallbacks(r9)
            androidx.drawerlayout.widget.DrawerLayout$g r9 = r8.f3450k
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$g$a r9 = r9.f3480c
            r0.removeCallbacks(r9)
            goto L_0x0078
        L_0x0073:
            r8.mo3545e(r2)
            r8.f3458s = r3
        L_0x0078:
            r9 = 0
            goto L_0x00a2
        L_0x007a:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f3461v = r0
            r8.f3462w = r9
            float r4 = r8.f3445f
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x009f
            x1.c r4 = r8.f3447h
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.mo23422j(r0, r9)
            if (r9 == 0) goto L_0x009f
            boolean r9 = m2478n(r9)
            if (r9 == 0) goto L_0x009f
            r9 = 1
            goto L_0x00a0
        L_0x009f:
            r9 = 0
        L_0x00a0:
            r8.f3458s = r3
        L_0x00a2:
            if (r1 != 0) goto L_0x00c9
            if (r9 != 0) goto L_0x00c9
            int r9 = r8.getChildCount()
            r0 = 0
        L_0x00ab:
            if (r0 >= r9) goto L_0x00c0
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            boolean r1 = r1.f3468c
            if (r1 == 0) goto L_0x00bd
            r9 = 1
            goto L_0x00c1
        L_0x00bd:
            int r0 = r0 + 1
            goto L_0x00ab
        L_0x00c0:
            r9 = 0
        L_0x00c1:
            if (r9 != 0) goto L_0x00c9
            boolean r9 = r8.f3458s
            if (r9 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r2 = 0
        L_0x00c9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 4) {
            if (mo3553h() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View h = mo3553h();
        if (h != null && mo3555j(h) == 0) {
            mo3545e(false);
        }
        if (h != null) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2;
        int i6;
        this.f3452m = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m2478n(childAt)) {
                    int i9 = layoutParams.leftMargin;
                    childAt.layout(i9, layoutParams.topMargin, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + layoutParams.topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo3538b(3, childAt)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f3467b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i11 = i7 - ((int) (layoutParams.f3467b * f3));
                        f = ((float) (i7 - i11)) / f3;
                        i5 = i11;
                    }
                    if (f != layoutParams.f3467b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i12 = layoutParams.f3466a & 112;
                    if (i12 == 16) {
                        int i13 = i4 - i2;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = layoutParams.topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight;
                            int i17 = i13 - layoutParams.bottomMargin;
                            if (i16 > i17) {
                                i14 = i17 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i14, measuredWidth + i5, measuredHeight + i14);
                    } else if (i12 != 80) {
                        int i18 = layoutParams.topMargin;
                        childAt.layout(i5, i18, measuredWidth + i5, measuredHeight + i18);
                    } else {
                        int i19 = i4 - i2;
                        childAt.layout(i5, (i19 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i19 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        mo3582v(childAt, f);
                    }
                    if (layoutParams.f3467b > BitmapDescriptorFactory.HUE_RED) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
        }
        if (f3436I && (rootWindowInsets = getRootWindowInsets()) != null) {
            C5349b i21 = C6396v0.m15249i(rootWindowInsets, (View) null).f20044a.mo22534i();
            C7148c cVar = this.f3447h;
            cVar.f22212o = Math.max(cVar.f22213p, i21.f17646a);
            C7148c cVar2 = this.f3448i;
            cVar2.f22212o = Math.max(cVar2.f22213p, i21.f17648c);
        }
        this.f3452m = false;
        this.f3453n = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = android.view.View.MeasureSpec.getMode(r17)
            int r2 = android.view.View.MeasureSpec.getMode(r18)
            int r3 = android.view.View.MeasureSpec.getSize(r17)
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto L_0x0018
            if (r2 == r5) goto L_0x0026
        L_0x0018:
            boolean r5 = r16.isInEditMode()
            if (r5 == 0) goto L_0x01a3
            if (r1 != 0) goto L_0x0022
            r3 = 300(0x12c, float:4.2E-43)
        L_0x0022:
            if (r2 != 0) goto L_0x0026
            r4 = 300(0x12c, float:4.2E-43)
        L_0x0026:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.f3464y
            r2 = 0
            if (r1 == 0) goto L_0x0038
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            boolean r1 = p242s1.C6333d0.C6337d.m15042b(r16)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            java.util.WeakHashMap<android.view.View, s1.p0> r5 = p242s1.C6333d0.f19990a
            int r5 = p242s1.C6333d0.C6338e.m15063d(r16)
            int r6 = r16.getChildCount()
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0046:
            if (r7 >= r6) goto L_0x01a2
            android.view.View r10 = r0.getChildAt(r7)
            int r11 = r10.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x0056
            goto L_0x00fc
        L_0x0056:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r11 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r11
            r12 = 3
            if (r1 == 0) goto L_0x00db
            int r13 = r11.f3466a
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r5)
            boolean r14 = p242s1.C6333d0.C6337d.m15042b(r10)
            r15 = 5
            if (r14 == 0) goto L_0x0099
            java.lang.Object r14 = r0.f3464y
            android.view.WindowInsets r14 = (android.view.WindowInsets) r14
            if (r13 != r12) goto L_0x0083
            int r12 = r14.getSystemWindowInsetLeft()
            int r13 = r14.getSystemWindowInsetTop()
            int r15 = r14.getSystemWindowInsetBottom()
            android.view.WindowInsets r14 = r14.replaceSystemWindowInsets(r12, r13, r2, r15)
            goto L_0x0095
        L_0x0083:
            if (r13 != r15) goto L_0x0095
            int r12 = r14.getSystemWindowInsetTop()
            int r13 = r14.getSystemWindowInsetRight()
            int r15 = r14.getSystemWindowInsetBottom()
            android.view.WindowInsets r14 = r14.replaceSystemWindowInsets(r2, r12, r13, r15)
        L_0x0095:
            r10.dispatchApplyWindowInsets(r14)
            goto L_0x00db
        L_0x0099:
            java.lang.Object r12 = r0.f3464y
            android.view.WindowInsets r12 = (android.view.WindowInsets) r12
            r14 = 3
            if (r13 != r14) goto L_0x00b1
            int r13 = r12.getSystemWindowInsetLeft()
            int r14 = r12.getSystemWindowInsetTop()
            int r15 = r12.getSystemWindowInsetBottom()
            android.view.WindowInsets r12 = r12.replaceSystemWindowInsets(r13, r14, r2, r15)
            goto L_0x00c3
        L_0x00b1:
            if (r13 != r15) goto L_0x00c3
            int r13 = r12.getSystemWindowInsetTop()
            int r14 = r12.getSystemWindowInsetRight()
            int r15 = r12.getSystemWindowInsetBottom()
            android.view.WindowInsets r12 = r12.replaceSystemWindowInsets(r2, r13, r14, r15)
        L_0x00c3:
            int r2 = r12.getSystemWindowInsetLeft()
            r11.leftMargin = r2
            int r2 = r12.getSystemWindowInsetTop()
            r11.topMargin = r2
            int r2 = r12.getSystemWindowInsetRight()
            r11.rightMargin = r2
            int r2 = r12.getSystemWindowInsetBottom()
            r11.bottomMargin = r2
        L_0x00db:
            boolean r2 = m2478n(r10)
            if (r2 == 0) goto L_0x0102
            int r2 = r11.leftMargin
            int r2 = r3 - r2
            int r12 = r11.rightMargin
            int r2 = r2 - r12
            r12 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r12)
            int r13 = r11.topMargin
            int r13 = r4 - r13
            int r11 = r11.bottomMargin
            int r13 = r13 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r12)
            r10.measure(r2, r11)
        L_0x00fc:
            r13 = r17
            r14 = r18
            goto L_0x0179
        L_0x0102:
            boolean r2 = m2480q(r10)
            if (r2 == 0) goto L_0x017e
            boolean r2 = f3435H
            if (r2 == 0) goto L_0x0119
            float r2 = p242s1.C6333d0.C6342i.m15092i(r10)
            float r12 = r0.f3442c
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0119
            p242s1.C6333d0.C6342i.m15102s(r10, r12)
        L_0x0119:
            int r2 = r0.mo3556k(r10)
            r2 = r2 & 7
            r12 = 3
            if (r2 != r12) goto L_0x0124
            r12 = 1
            goto L_0x0125
        L_0x0124:
            r12 = 0
        L_0x0125:
            if (r12 == 0) goto L_0x0129
            if (r8 != 0) goto L_0x012e
        L_0x0129:
            if (r12 != 0) goto L_0x0154
            if (r9 != 0) goto L_0x012e
            goto L_0x0154
        L_0x012e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            java.lang.String r2 = m2476l(r2)
            r3.append(r2)
            java.lang.String r2 = " but this "
            r3.append(r2)
            java.lang.String r2 = "DrawerLayout"
            r3.append(r2)
            java.lang.String r2 = " already has a drawer view along that edge"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0154:
            if (r12 == 0) goto L_0x0158
            r8 = 1
            goto L_0x0159
        L_0x0158:
            r9 = 1
        L_0x0159:
            int r2 = r0.f3443d
            int r12 = r11.leftMargin
            int r2 = r2 + r12
            int r12 = r11.rightMargin
            int r2 = r2 + r12
            int r12 = r11.width
            r13 = r17
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r13, r2, r12)
            int r12 = r11.topMargin
            int r14 = r11.bottomMargin
            int r12 = r12 + r14
            int r11 = r11.height
            r14 = r18
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r14, r12, r11)
            r10.measure(r2, r11)
        L_0x0179:
            int r7 = r7 + 1
            r2 = 0
            goto L_0x0046
        L_0x017e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Child "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " at index "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            return
        L_0x01a3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        View f;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f3470b;
        if (!(i == 0 || (f = mo3546f(i)) == null)) {
            mo3580t(f);
        }
        int i2 = savedState.f3471c;
        if (i2 != 3) {
            mo3581u(i2, 3);
        }
        int i3 = savedState.f3472d;
        if (i3 != 3) {
            mo3581u(i3, 5);
        }
        int i4 = savedState.f3473e;
        if (i4 != 3) {
            mo3581u(i4, 8388611);
        }
        int i5 = savedState.f3474f;
        if (i5 != 3) {
            mo3581u(i5, 8388613);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        if (!f3435H) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6338e.m15063d(this);
            C6333d0.C6338e.m15063d(this);
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f3469d;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f3470b = layoutParams.f3466a;
            } else {
                i++;
            }
        }
        savedState.f3471c = this.f3454o;
        savedState.f3472d = this.f3455p;
        savedState.f3473e = this.f3456q;
        savedState.f3474f = this.f3457r;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (mo3555j(r7) != 2) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            x1.c r0 = r6.f3447h
            r0.mo23424m(r7)
            x1.c r0 = r6.f3448i
            r0.mo23424m(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0060
            if (r0 == r1) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.mo3545e(r1)
            r6.f3458s = r2
            goto L_0x006e
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            x1.c r3 = r6.f3447h
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo23422j(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = m2478n(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.f3461v
            float r0 = r0 - r3
            float r3 = r6.f3462w
            float r7 = r7 - r3
            x1.c r3 = r6.f3447h
            int r3 = r3.f22199b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.mo3547g()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.mo3555j(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r2 = 1
        L_0x005c:
            r6.mo3545e(r2)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3461v = r0
            r6.f3462w = r7
            r6.f3458s = r2
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo3545e(true);
        }
    }

    public final void requestLayout() {
        if (!this.f3452m) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void mo3572s(View view, float f) {
        float f2 = ((LayoutParams) view.getLayoutParams()).f3467b;
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!mo3538b(3, view)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo3582v(view, f);
    }

    public void setDrawerElevation(float f) {
        this.f3442c = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2480q(childAt)) {
                float f2 = this.f3442c;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6342i.m15102s(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0820e eVar) {
        ArrayList arrayList;
        C0820e eVar2 = this.f3459t;
        if (!(eVar2 == null || (arrayList = this.f3460u) == null)) {
            arrayList.remove(eVar2);
        }
        if (eVar != null) {
            mo3535a(eVar);
        }
        this.f3459t = eVar;
    }

    public void setDrawerLockMode(int i) {
        mo3581u(i, 3);
        mo3581u(i, 5);
    }

    public void setScrimColor(int i) {
        this.f3444e = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3463x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f3463x = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: t */
    public final void mo3580t(View view) {
        if (m2480q(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3453n) {
                layoutParams.f3467b = 1.0f;
                layoutParams.f3469d = 1;
                mo3584x(view, true);
                mo3583w(view);
            } else {
                layoutParams.f3469d |= 2;
                if (mo3538b(3, view)) {
                    this.f3447h.mo23432u(view, 0, view.getTop());
                } else {
                    this.f3448i.mo23432u(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: u */
    public final void mo3581u(int i, int i2) {
        View f;
        C7148c cVar;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, C6333d0.C6338e.m15063d(this));
        if (i2 == 3) {
            this.f3454o = i;
        } else if (i2 == 5) {
            this.f3455p = i;
        } else if (i2 == 8388611) {
            this.f3456q = i;
        } else if (i2 == 8388613) {
            this.f3457r = i;
        }
        if (i != 0) {
            if (absoluteGravity == 3) {
                cVar = this.f3447h;
            } else {
                cVar = this.f3448i;
            }
            cVar.mo23415b();
        }
        if (i == 1) {
            View f2 = mo3546f(absoluteGravity);
            if (f2 != null) {
                mo3539c(f2, true);
            }
        } else if (i == 2 && (f = mo3546f(absoluteGravity)) != null) {
            mo3580t(f);
        }
    }

    /* renamed from: v */
    public final void mo3582v(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f3467b) {
            layoutParams.f3467b = f;
            ArrayList arrayList = this.f3460u;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C0820e) this.f3460u.get(size)).mo934b(f);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo3583w(View view) {
        C6531g.C6532a aVar = C6531g.C6532a.f20344l;
        C6333d0.m15026n(aVar.mo22651a(), view);
        C6333d0.m15021i(0, view);
        if (m2479p(view) && mo3555j(view) != 2) {
            C6333d0.m15027o(view, aVar, this.f3440D);
        }
    }

    /* renamed from: x */
    public final void mo3584x(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m2480q(childAt)) && (!z || childAt != view)) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15059s(childAt, 4);
            } else {
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                C6333d0.C6337d.m15059s(childAt, 1);
            }
        }
    }

    /* renamed from: y */
    public final void mo3585y(int i, View view) {
        View rootView;
        int i2 = this.f3447h.f22198a;
        int i3 = this.f3448i.f22198a;
        int i4 = 2;
        if (i2 == 1 || i3 == 1) {
            i4 = 1;
        } else if (!(i2 == 2 || i3 == 2)) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f3467b;
            if (f == BitmapDescriptorFactory.HUE_RED) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.f3469d & 1) == 1) {
                    layoutParams.f3469d = 0;
                    ArrayList arrayList = this.f3460u;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((C0820e) this.f3460u.get(size)).mo935c();
                        }
                    }
                    mo3584x(view, false);
                    mo3583w(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.f3469d & 1) == 0) {
                    layoutParams2.f3469d = 1;
                    ArrayList arrayList2 = this.f3460u;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((C0820e) this.f3460u.get(size2)).mo936d();
                        }
                    }
                    mo3584x(view, true);
                    mo3583w(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != this.f3451l) {
            this.f3451l = i4;
            ArrayList arrayList3 = this.f3460u;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((C0820e) this.f3460u.get(size3)).mo933a();
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3441b = new C0819d();
        this.f3444e = -1728053248;
        this.f3446g = new Paint();
        this.f3453n = true;
        this.f3454o = 3;
        this.f3455p = 3;
        this.f3456q = 3;
        this.f3457r = 3;
        this.f3440D = new C0816a();
        setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        float f = getResources().getDisplayMetrics().density;
        this.f3443d = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C0822g gVar = new C0822g(3);
        this.f3449j = gVar;
        C0822g gVar2 = new C0822g(5);
        this.f3450k = gVar2;
        C7148c i2 = C7148c.m16728i(this, 1.0f, gVar);
        this.f3447h = i2;
        i2.f22214q = 1;
        i2.f22211n = f2;
        gVar.f3479b = i2;
        C7148c i3 = C7148c.m16728i(this, 1.0f, gVar2);
        this.f3448i = i3;
        i3.f22214q = 2;
        i3.f22211n = f2;
        gVar2.f3479b = i3;
        setFocusableInTouchMode(true);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15059s(this, 1);
        C6333d0.m15029q(this, new C0818c());
        setMotionEventSplittingEnabled(false);
        if (C6333d0.C6337d.m15042b(this)) {
            setOnApplyWindowInsetsListener(new C0817b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3432E);
            try {
                this.f3463x = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C7285c.DrawerLayout, i, 0);
        try {
            int i4 = C7285c.DrawerLayout_elevation;
            if (obtainStyledAttributes2.hasValue(i4)) {
                this.f3442c = obtainStyledAttributes2.getDimension(i4, BitmapDescriptorFactory.HUE_RED);
            } else {
                this.f3442c = getResources().getDimension(C7284b.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f3437A = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i) {
        this.f3463x = i != 0 ? C4732a.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3466a = 0;

        /* renamed from: b */
        public float f3467b;

        /* renamed from: c */
        public boolean f3468c;

        /* renamed from: d */
        public int f3469d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f3433F);
            this.f3466a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3466a = layoutParams.f3466a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0815a();

        /* renamed from: b */
        public int f3470b = 0;

        /* renamed from: c */
        public int f3471c;

        /* renamed from: d */
        public int f3472d;

        /* renamed from: e */
        public int f3473e;

        /* renamed from: f */
        public int f3474f;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        public class C0815a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3470b = parcel.readInt();
            this.f3471c = parcel.readInt();
            this.f3472d = parcel.readInt();
            this.f3473e = parcel.readInt();
            this.f3474f = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3470b);
            parcel.writeInt(this.f3471c);
            parcel.writeInt(this.f3472d);
            parcel.writeInt(this.f3473e);
            parcel.writeInt(this.f3474f);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
