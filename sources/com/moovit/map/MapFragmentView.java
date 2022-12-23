package com.moovit.map;

import a00.C13382a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.activity.C0199g;
import com.moovit.commons.utils.UiUtils;
import com.moovit.map.C16245a;
import com.moovit.map.MapFragment;
import java.util.WeakHashMap;
import k00.C17988b;
import o20.C18705k;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p687nt.C18603k;
import p824tp.C19737o;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19746x;
import p977zz.C20943i;

public class MapFragmentView extends ViewGroup {

    /* renamed from: q */
    public static final /* synthetic */ int f42425q = 0;

    /* renamed from: b */
    public final Point f42426b = new Point();

    /* renamed from: c */
    public final Point f42427c = new Point();

    /* renamed from: d */
    public final Point f42428d = new Point();

    /* renamed from: e */
    public final Rect f42429e = new Rect();

    /* renamed from: f */
    public MapFragment f42430f;

    /* renamed from: g */
    public View f42431g;

    /* renamed from: h */
    public MapOverlaysLayout f42432h;

    /* renamed from: i */
    public float f42433i = 1.0f;

    /* renamed from: j */
    public float f42434j = 1.0f;

    /* renamed from: k */
    public int f42435k = 0;

    /* renamed from: l */
    public int f42436l = 0;

    /* renamed from: m */
    public boolean f42437m = false;

    /* renamed from: n */
    public final Drawable f42438n;

    /* renamed from: o */
    public boolean f42439o = false;

    /* renamed from: p */
    public final Drawable f42440p;

    /* renamed from: com.moovit.map.MapFragmentView$a */
    public interface C16241a {
        /* renamed from: a */
        void mo48698a(int i, int i2, int i3, int i4);
    }

    public MapFragmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(C19737o.map_background_color);
        this.f42438n = C17988b.m44611b(C19739q.shadow_top, context);
        this.f42440p = C17988b.m44611b(C19739q.shadow_bottom, context);
    }

    /* renamed from: a */
    public final Rect mo48685a(Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        View view = this.f42431g;
        if (view != null) {
            int i = (int) (-view.getX());
            int i2 = (int) (-this.f42431g.getY());
            rect.set(i, i2, getWidth() + i, getHeight() + i2);
        }
        return rect;
    }

    /* renamed from: b */
    public final void mo48686b(int i, int i2, int i3, int i4) {
        boolean z;
        View view = (View) this.f42432h.getParent();
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            view.forceLayout();
        }
        MapOverlaysLayout mapOverlaysLayout = this.f42432h;
        mapOverlaysLayout.f42443d.set(i, i2, i3, i4);
        mapOverlaysLayout.requestLayout();
        if (z) {
            UiUtils.m40258q(view);
        }
        int paddingLeft = getPaddingLeft() + i;
        int paddingTop = getPaddingTop() + i2;
        int paddingRight = getPaddingRight() + i3;
        this.f42427c.set((paddingLeft - paddingRight) / 2, (paddingTop - (getPaddingBottom() + i4)) / 2);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15076c(this)) {
            mo48688d(getWidth(), getHeight());
        }
    }

    /* renamed from: c */
    public final void mo48687c() {
        MapFragment mapFragment;
        MapFragment.C16240u uVar;
        if (this.f42431g != null && this.f42430f != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15075b(this)) {
                if (!this.f42430f.mo48624U2()) {
                    this.f42430f.mo48656t2(new C18705k(this));
                } else if (!C6333d0.C6340g.m15076c(this) || C6333d0.C6339f.m15072b(this)) {
                    C6333d0.C6337d.m15053m(this, new C0199g(this, 16));
                } else {
                    this.f42431g.setTranslationX((float) this.f42428d.x);
                    this.f42431g.setTranslationY((float) this.f42428d.y);
                    Rect rect = this.f42429e;
                    if (rect == null) {
                        rect = new Rect();
                    }
                    if (this.f42431g != null) {
                        int width = getWidth();
                        int height = getHeight();
                        int x = (int) this.f42431g.getX();
                        int y = (int) this.f42431g.getY();
                        rect.set(0 - x, 0 - y, (this.f42431g.getWidth() + x) - width, (this.f42431g.getHeight() + y) - height);
                    }
                    View view = this.f42431g;
                    if (view instanceof C16241a) {
                        ((C16241a) view).mo48698a(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    if (!isInEditMode() && (mapFragment = this.f42430f) != null && (uVar = mapFragment.f42343E0) != null) {
                        mapFragment.mo48607C2(new C16245a.C16251f(mapFragment, uVar.f42423a, uVar.f42424b, mapFragment.f42389x0), false);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo48688d(int i, int i2) {
        int width = this.f42431g.getWidth();
        Point point = this.f42427c;
        int height = ((i2 - this.f42431g.getHeight()) / 2) + point.y;
        this.f42428d.set(((i - width) / 2) + point.x, height);
        mo48687c();
    }

    public View getMapView() {
        return this.f42431g;
    }

    public MapOverlaysLayout getOverlaysLayout() {
        return this.f42432h;
    }

    public final void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        if (C20943i.m49051d(17)) {
            display = getDisplay();
        } else {
            display = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        }
        display.getSize(this.f42426b);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f42437m) {
            Drawable drawable = this.f42438n;
            drawable.setBounds(0, 0, width, drawable.getIntrinsicHeight());
            this.f42438n.draw(canvas);
        }
        if (this.f42439o) {
            this.f42440p.setBounds(0, height - this.f42440p.getIntrinsicHeight(), width, height);
            this.f42440p.draw(canvas);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f42431g = findViewById(C19740r.map_view);
        this.f42432h = (MapOverlaysLayout) findViewById(C19740r.overlays);
        C13382a.m33673i(this);
        C13382a.m33674j(this, getResources().getString(C19746x.voice_over_map));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        View view = this.f42431g;
        if (view != null) {
            this.f42431g.layout(0, 0, view.getMeasuredWidth(), this.f42431g.getMeasuredHeight());
            mo48688d(i5, i6);
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = i5 - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!(childAt.getVisibility() == 8 || childAt == this.f42431g)) {
                childAt.layout(paddingLeft, paddingTop, paddingRight, i7);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.f42431g != null) {
            int round = Math.round((((float) this.f42426b.x) * this.f42433i) + ((float) this.f42435k));
            int round2 = Math.round((((float) this.f42426b.y) * this.f42434j) + ((float) this.f42436l));
            this.f42431g.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), View.MeasureSpec.makeMeasureSpec(round2, 1073741824));
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt.getVisibility() == 8 || childAt == this.f42431g)) {
                childAt.measure(i, i2);
            }
        }
        setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(size2, i2));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f42431g != null) {
            mo48688d(i, i2);
        }
        MapOverlaysLayout mapOverlaysLayout = this.f42432h;
        if (mapOverlaysLayout != null) {
            mapOverlaysLayout.setBottom(i2);
            this.f42432h.setRight(i);
        }
    }

    public void setOwner(MapFragment mapFragment) {
        this.f42430f = mapFragment;
        if (mapFragment != null) {
            mapFragment.mo48656t2(new C18603k(this, 1));
        } else {
            setBackgroundResource(C19737o.map_background_color);
        }
        mo48687c();
    }
}
