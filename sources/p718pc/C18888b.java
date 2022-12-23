package p718pc;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14077m;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.ArrayList;
import java.util.Arrays;
import p004a3.C0050b;
import p355ac.C13401b;
import p355ac.C13410k;
import p355ac.C13411l;
import p718pc.C18893c;
import p883wc.C20289a;

/* renamed from: pc.b */
public abstract class C18888b<S extends C18893c> extends ProgressBar {

    /* renamed from: n */
    public static final int f48065n = C13410k.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: b */
    public S f48066b;

    /* renamed from: c */
    public int f48067c;

    /* renamed from: d */
    public boolean f48068d;

    /* renamed from: e */
    public boolean f48069e;

    /* renamed from: f */
    public final int f48070f;

    /* renamed from: g */
    public C18887a f48071g;

    /* renamed from: h */
    public boolean f48072h = false;

    /* renamed from: i */
    public int f48073i = 4;

    /* renamed from: j */
    public final C18889a f48074j = new C18889a();

    /* renamed from: k */
    public final C18890b f48075k = new C18890b();

    /* renamed from: l */
    public final C18891c f48076l = new C18891c();

    /* renamed from: m */
    public final C18892d f48077m = new C18892d();

    /* renamed from: pc.b$a */
    public class C18889a implements Runnable {
        public C18889a() {
        }

        public final void run() {
            C18888b bVar = C18888b.this;
            if (bVar.f48070f > 0) {
                SystemClock.uptimeMillis();
            }
            bVar.setVisibility(0);
        }
    }

    /* renamed from: pc.b$b */
    public class C18890b implements Runnable {
        public C18890b() {
        }

        public final void run() {
            C18888b bVar = C18888b.this;
            boolean z = false;
            ((C18904k) bVar.getCurrentDrawable()).mo51405e(false, false, true);
            if ((bVar.getProgressDrawable() == null || !bVar.getProgressDrawable().isVisible()) && (bVar.getIndeterminateDrawable() == null || !bVar.getIndeterminateDrawable().isVisible())) {
                z = true;
            }
            if (z) {
                bVar.setVisibility(4);
            }
            C18888b.this.getClass();
        }
    }

    /* renamed from: pc.b$c */
    public class C18891c extends C0050b {
        public C18891c() {
        }

        /* renamed from: a */
        public final void mo26a() {
            C18888b.this.setIndeterminate(false);
            C18888b bVar = C18888b.this;
            bVar.mo42100b(bVar.f48067c, bVar.f48068d);
        }
    }

    /* renamed from: pc.b$d */
    public class C18892d extends C0050b {
        public C18892d() {
        }

        /* renamed from: a */
        public final void mo26a() {
            C18888b bVar = C18888b.this;
            if (!bVar.f48072h) {
                bVar.setVisibility(bVar.f48073i);
            }
        }
    }

    public C18888b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C20289a.m47861a(context, attributeSet, i, f48065n), attributeSet, i);
        Context context2 = getContext();
        this.f48066b = mo42091a(context2, attributeSet);
        TypedArray d = C14077m.m35060d(context2, attributeSet, C13411l.BaseProgressIndicator, i, i2, new int[0]);
        d.getInt(C13411l.BaseProgressIndicator_showDelay, -1);
        this.f48070f = Math.min(d.getInt(C13411l.BaseProgressIndicator_minHideDelay, -1), 1000);
        d.recycle();
        this.f48071g = new C18887a();
        this.f48069e = true;
    }

    private C18906l<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f48128m;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().f48108m;
        }
    }

    /* renamed from: a */
    public abstract S mo42091a(Context context, AttributeSet attributeSet);

    /* renamed from: b */
    public void mo42100b(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f48067c = i;
            this.f48068d = z;
            this.f48072h = true;
            if (getIndeterminateDrawable().isVisible()) {
                C18887a aVar = this.f48071g;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != BitmapDescriptorFactory.HUE_RED) {
                    getIndeterminateDrawable().f48129n.mo21799h();
                    return;
                }
            }
            C18891c cVar = this.f48076l;
            getIndeterminateDrawable();
            cVar.mo26a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (getWindowVisibility() == 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo51354c() {
        /*
            r4 = this;
            java.util.WeakHashMap<android.view.View, s1.p0> r0 = p242s1.C6333d0.f19990a
            boolean r0 = p242s1.C6333d0.C6340g.m15075b(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0034
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L_0x0034
            r0 = r4
        L_0x0011:
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0028
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x002d
        L_0x0026:
            r0 = 0
            goto L_0x002d
        L_0x0028:
            boolean r3 = r0 instanceof android.view.View
            if (r3 != 0) goto L_0x0031
            goto L_0x0024
        L_0x002d:
            if (r0 == 0) goto L_0x0034
            r1 = 1
            goto L_0x0034
        L_0x0031:
            android.view.View r0 = (android.view.View) r0
            goto L_0x0011
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p718pc.C18888b.mo51354c():boolean");
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f48066b.f48087f;
    }

    public int[] getIndicatorColor() {
        return this.f48066b.f48084c;
    }

    public int getShowAnimationBehavior() {
        return this.f48066b.f48086e;
    }

    public int getTrackColor() {
        return this.f48066b.f48085d;
    }

    public int getTrackCornerRadius() {
        return this.f48066b.f48083b;
    }

    public int getTrackThickness() {
        return this.f48066b.f48082a;
    }

    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().f48129n.mo21798g(this.f48076l);
        }
        if (getProgressDrawable() != null) {
            C18900h progressDrawable = getProgressDrawable();
            C18892d dVar = this.f48077m;
            if (progressDrawable.f48121g == null) {
                progressDrawable.f48121g = new ArrayList();
            }
            if (!progressDrawable.f48121g.contains(dVar)) {
                progressDrawable.f48121g.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            C18907m indeterminateDrawable = getIndeterminateDrawable();
            C18892d dVar2 = this.f48077m;
            if (indeterminateDrawable.f48121g == null) {
                indeterminateDrawable.f48121g = new ArrayList();
            }
            if (!indeterminateDrawable.f48121g.contains(dVar2)) {
                indeterminateDrawable.f48121g.add(dVar2);
            }
        }
        if (mo51354c()) {
            if (this.f48070f > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f48075k);
        removeCallbacks(this.f48074j);
        ((C18904k) getCurrentDrawable()).mo51405e(false, false, false);
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo51406g(this.f48077m);
            getIndeterminateDrawable().f48129n.mo21801j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo51406g(this.f48077m);
        }
        super.onDetachedFromWindow();
    }

    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        C18906l currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.mo51386e();
            int d = currentDrawingDelegate.mo51385d();
            if (e < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = e + getPaddingLeft() + getPaddingRight();
            }
            if (d < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = d + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f48069e) {
            ((C18904k) getCurrentDrawable()).mo51405e(mo51354c(), false, z);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f48069e) {
            ((C18904k) getCurrentDrawable()).mo51405e(mo51354c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C18887a aVar) {
        this.f48071g = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f48118d = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f48118d = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f48066b.f48087f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            C18904k kVar = (C18904k) getCurrentDrawable();
            if (kVar != null) {
                kVar.mo51405e(false, false, false);
            }
            super.setIndeterminate(z);
            C18904k kVar2 = (C18904k) getCurrentDrawable();
            if (kVar2 != null) {
                kVar2.mo51405e(mo51354c(), false, false);
            }
            if ((kVar2 instanceof C18907m) && mo51354c()) {
                ((C18907m) kVar2).f48129n.mo21800i();
            }
            this.f48072h = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof C18907m) {
            ((C18904k) drawable).mo51405e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C14256d1.m35486d(getContext(), C13401b.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f48066b.f48084c = iArr;
            getIndeterminateDrawable().f48129n.mo21797f();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            mo42100b(i, false);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof C18900h) {
            C18900h hVar = (C18900h) drawable;
            hVar.mo51405e(false, false, false);
            super.setProgressDrawable(hVar);
            hVar.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f48066b.f48086e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f48066b;
        if (s.f48085d != i) {
            s.f48085d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f48066b;
        if (s.f48083b != i) {
            s.f48083b = Math.min(i, s.f48082a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f48066b;
        if (s.f48082a != i) {
            s.f48082a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f48073i = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public C18907m<S> getIndeterminateDrawable() {
        return (C18907m) super.getIndeterminateDrawable();
    }

    public C18900h<S> getProgressDrawable() {
        return (C18900h) super.getProgressDrawable();
    }
}
