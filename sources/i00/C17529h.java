package i00;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EdgeEffect;
import android.widget.ListView;
import android.widget.OverScroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6354e;
import p242s1.C6382p0;
import p977zz.C20943i;

/* renamed from: i00.h */
public abstract class C17529h extends ViewGroup {

    /* renamed from: k */
    public static final C17530a f45114k = new C17530a();

    /* renamed from: b */
    public boolean f45115b = false;

    /* renamed from: c */
    public ArrayList f45116c = new ArrayList(1);

    /* renamed from: d */
    public C17532c f45117d = f45114k;

    /* renamed from: e */
    public final OverScroller f45118e;

    /* renamed from: f */
    public final C6354e f45119f;

    /* renamed from: g */
    public final EdgeEffect f45120g;

    /* renamed from: h */
    public final EdgeEffect f45121h;

    /* renamed from: i */
    public boolean f45122i = false;

    /* renamed from: j */
    public boolean f45123j = false;

    /* renamed from: i00.h$a */
    public class C17530a implements C17532c {
    }

    /* renamed from: i00.h$b */
    public interface C17531b {
        /* renamed from: a */
        boolean mo49997a();
    }

    /* renamed from: i00.h$c */
    public interface C17532c {
    }

    public C17529h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45118e = new OverScroller(context);
        this.f45119f = new C6354e(context, new C17533i(this));
        this.f45120g = new EdgeEffect(context);
        this.f45121h = new EdgeEffect(context);
    }

    /* renamed from: a */
    public final boolean mo49981a(float f) {
        int i = (int) f;
        return this.f45115b ? canScrollHorizontally(i) : canScrollVertically(i);
    }

    /* renamed from: b */
    public final void mo49982b(int i) {
        this.f45118e.forceFinished(true);
        int size = getSize();
        int contentSize = getContentSize();
        if (this.f45115b) {
            this.f45118e.fling(getScroll(), 0, i, 0, 0, contentSize - size, 0, 0, size / 2, 0);
        } else {
            this.f45118e.fling(0, getScroll(), 0, i, 0, 0, 0, contentSize - size, 0, size / 2);
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15051k(this);
    }

    public final int computeHorizontalScrollRange() {
        return this.f45115b ? getContentSize() : super.computeHorizontalScrollRange();
    }

    public final void computeScroll() {
        int i;
        boolean z;
        if (this.f45118e.computeScrollOffset()) {
            if (this.f45115b) {
                i = this.f45118e.getCurrX();
            } else {
                i = this.f45118e.getCurrY();
            }
            int currVelocity = (int) this.f45118e.getCurrVelocity();
            int size = getSize();
            int contentSize = getContentSize();
            setScroll(i);
            if (size == getSize() && contentSize == getContentSize()) {
                this.f45117d.getClass();
                boolean z2 = true;
                if (i >= 0 || !this.f45120g.isFinished() || this.f45122i) {
                    if (this.f45120g.isFinished()) {
                        this.f45122i = false;
                    }
                    z = false;
                } else {
                    this.f45120g.onAbsorb(currVelocity);
                    this.f45122i = true;
                    this.f45118e.forceFinished(true);
                    z = true;
                }
                if (i > getContentSize() - getSize() && this.f45121h.isFinished() && !this.f45123j) {
                    this.f45121h.onAbsorb(currVelocity);
                    this.f45123j = true;
                    this.f45118e.forceFinished(true);
                    z = true;
                } else if (this.f45121h.isFinished()) {
                    this.f45123j = false;
                }
                if (awakenScrollBars()) {
                    z2 = z;
                }
                if (z2) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15051k(this);
                }
                super.computeScroll();
                return;
            }
            mo49982b(currVelocity);
        }
    }

    public final int computeVerticalScrollRange() {
        return this.f45115b ? super.computeVerticalScrollRange() : getContentSize();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (width - paddingLeft) - getPaddingRight();
        int paddingBottom = (height - paddingTop) - getPaddingBottom();
        int contentSize = getContentSize();
        if (!this.f45120g.isFinished()) {
            int save = canvas.save();
            if (this.f45115b) {
                this.f45120g.setSize(paddingBottom, paddingRight);
                canvas.translate((float) paddingLeft, (float) paddingTop);
                canvas.rotate(90.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                canvas.scale(1.0f, -1.0f);
            } else {
                this.f45120g.setSize(paddingRight, paddingBottom);
                canvas.translate((float) paddingLeft, (float) paddingTop);
            }
            boolean draw = this.f45120g.draw(canvas);
            canvas.restoreToCount(save);
            z = draw;
        }
        if (!this.f45121h.isFinished()) {
            int save2 = canvas.save();
            if (this.f45115b) {
                this.f45121h.setSize(paddingBottom, paddingRight);
                canvas.translate((float) (contentSize + paddingLeft), (float) paddingTop);
                canvas.rotate(90.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } else {
                this.f45121h.setSize(paddingRight, paddingBottom);
                canvas.translate((float) paddingLeft, (float) (contentSize + paddingTop));
                canvas.scale(1.0f, -1.0f);
            }
            if (this.f45121h.draw(canvas)) {
                z = true;
            }
            canvas.restoreToCount(save2);
        }
        if (z) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return ListView.class.getName();
    }

    public abstract int getContentSize();

    public int getScroll() {
        return this.f45115b ? getScrollX() : getScrollY();
    }

    public int getSize() {
        int i;
        int i2;
        if (this.f45115b) {
            i2 = getWidth() - getPaddingLeft();
            i = getPaddingRight();
        } else {
            i2 = getHeight() - getPaddingTop();
            i = getPaddingBottom();
        }
        return i2 - i;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (mo49981a(-1.0f) || mo49981a(1.0f)) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(getScrollX());
        accessibilityEvent.setScrollY(getScrollY());
        accessibilityEvent.setMaxScrollX(computeHorizontalScrollRange());
        accessibilityEvent.setMaxScrollY(computeVerticalScrollRange());
        accessibilityEvent.setItemCount(getChildCount());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean a = mo49981a(-1.0f);
        boolean a2 = mo49981a(1.0f);
        if (a || a2) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setScrollable(z);
        if (a) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (a2) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (C20943i.m49051d(19)) {
            if (this.f45115b) {
                i = 0;
            } else {
                i = getChildCount();
            }
            if (this.f45115b) {
                i2 = getChildCount();
            } else {
                i2 = 0;
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false));
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f45119f.mo22474a(motionEvent);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        getScroll();
        Iterator it = this.f45116c.iterator();
        while (it.hasNext()) {
            if (((C17531b) it.next()).mo49997a()) {
                it.remove();
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f45119f.mo22474a(motionEvent)) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        int i3;
        if (i != 4096 && i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        }
        if (this.f45115b) {
            i2 = getWidth() - getPaddingLeft();
            i3 = getPaddingRight();
        } else {
            i2 = getHeight() - getPaddingTop();
            i3 = getPaddingBottom();
        }
        int i4 = i2 - i3;
        if (i == 8192) {
            i4 = -i4;
        }
        int scroll = getScroll();
        if (this.f45115b) {
            this.f45118e.startScroll(scroll, getScrollY(), i4, 0);
        } else {
            this.f45118e.startScroll(getScrollX(), scroll, 0, i4);
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15051k(this);
        return true;
    }

    public void setScroll(int i) {
        int max = Math.max(0, Math.min(getContentSize() - getSize(), i));
        if (this.f45115b) {
            setScrollX(max);
        } else {
            setScrollY(max);
        }
    }

    public void setScrollInterceptor(C17532c cVar) {
        if (cVar == null) {
            cVar = f45114k;
        }
        this.f45117d = cVar;
    }
}
