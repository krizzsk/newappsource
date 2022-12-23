package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.recyclerview.widget.n */
public final class C1218n extends RecyclerView.C1133l implements RecyclerView.C1141p {

    /* renamed from: D */
    public static final int[] f4572D = {16842919};

    /* renamed from: E */
    public static final int[] f4573E = new int[0];

    /* renamed from: A */
    public final ValueAnimator f4574A;

    /* renamed from: B */
    public int f4575B;

    /* renamed from: C */
    public final C1219a f4576C;

    /* renamed from: b */
    public final int f4577b;

    /* renamed from: c */
    public final int f4578c;

    /* renamed from: d */
    public final StateListDrawable f4579d;

    /* renamed from: e */
    public final Drawable f4580e;

    /* renamed from: f */
    public final int f4581f;

    /* renamed from: g */
    public final int f4582g;

    /* renamed from: h */
    public final StateListDrawable f4583h;

    /* renamed from: i */
    public final Drawable f4584i;

    /* renamed from: j */
    public final int f4585j;

    /* renamed from: k */
    public final int f4586k;

    /* renamed from: l */
    public int f4587l;

    /* renamed from: m */
    public int f4588m;

    /* renamed from: n */
    public float f4589n;

    /* renamed from: o */
    public int f4590o;

    /* renamed from: p */
    public int f4591p;

    /* renamed from: q */
    public float f4592q;

    /* renamed from: r */
    public int f4593r = 0;

    /* renamed from: s */
    public int f4594s = 0;

    /* renamed from: t */
    public RecyclerView f4595t;

    /* renamed from: u */
    public boolean f4596u = false;

    /* renamed from: v */
    public boolean f4597v = false;

    /* renamed from: w */
    public int f4598w = 0;

    /* renamed from: x */
    public int f4599x = 0;

    /* renamed from: y */
    public final int[] f4600y = new int[2];

    /* renamed from: z */
    public final int[] f4601z = new int[2];

    /* renamed from: androidx.recyclerview.widget.n$a */
    public class C1219a implements Runnable {
        public C1219a() {
        }

        public final void run() {
            C1218n nVar = C1218n.this;
            int i = nVar.f4575B;
            if (i == 1) {
                nVar.f4574A.cancel();
            } else if (i != 2) {
                return;
            }
            nVar.f4575B = 3;
            ValueAnimator valueAnimator = nVar.f4574A;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            nVar.f4574A.setDuration((long) 500);
            nVar.f4574A.start();
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    public class C1220b extends RecyclerView.C1142q {
        public C1220b() {
        }

        /* renamed from: b */
        public final void mo4914b(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            boolean z2;
            C1218n nVar = C1218n.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = nVar.f4595t.computeVerticalScrollRange();
            int i3 = nVar.f4594s;
            if (computeVerticalScrollRange - i3 <= 0 || i3 < nVar.f4577b) {
                z = false;
            } else {
                z = true;
            }
            nVar.f4596u = z;
            int computeHorizontalScrollRange = nVar.f4595t.computeHorizontalScrollRange();
            int i4 = nVar.f4593r;
            if (computeHorizontalScrollRange - i4 <= 0 || i4 < nVar.f4577b) {
                z2 = false;
            } else {
                z2 = true;
            }
            nVar.f4597v = z2;
            boolean z3 = nVar.f4596u;
            if (z3 || z2) {
                if (z3) {
                    float f = (float) i3;
                    nVar.f4588m = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                    nVar.f4587l = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (nVar.f4597v) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    nVar.f4591p = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                    nVar.f4590o = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = nVar.f4598w;
                if (i5 == 0 || i5 == 1) {
                    nVar.mo5107g(1);
                }
            } else if (nVar.f4598w != 0) {
                nVar.mo5107g(0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$c */
    public class C1221c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f4604a = false;

        public C1221c() {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f4604a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f4604a) {
                this.f4604a = false;
            } else if (((Float) C1218n.this.f4574A.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
                C1218n nVar = C1218n.this;
                nVar.f4575B = 0;
                nVar.mo5107g(0);
            } else {
                C1218n nVar2 = C1218n.this;
                nVar2.f4575B = 2;
                nVar2.f4595t.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$d */
    public class C1222d implements ValueAnimator.AnimatorUpdateListener {
        public C1222d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1218n.this.f4579d.setAlpha(floatValue);
            C1218n.this.f4580e.setAlpha(floatValue);
            C1218n.this.f4595t.invalidate();
        }
    }

    public C1218n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        this.f4574A = ofFloat;
        this.f4575B = 0;
        C1219a aVar = new C1219a();
        this.f4576C = aVar;
        C1220b bVar = new C1220b();
        this.f4579d = stateListDrawable;
        this.f4580e = drawable;
        this.f4583h = stateListDrawable2;
        this.f4584i = drawable2;
        this.f4581f = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4582g = Math.max(i, drawable.getIntrinsicWidth());
        this.f4585j = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4586k = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4577b = i2;
        this.f4578c = i3;
        stateListDrawable.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        drawable.setAlpha(ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        ofFloat.addListener(new C1221c());
        ofFloat.addUpdateListener(new C1222d());
        RecyclerView recyclerView2 = this.f4595t;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo4568Z(this);
                RecyclerView recyclerView3 = this.f4595t;
                recyclerView3.f4279r.remove(this);
                if (recyclerView3.f4281s == this) {
                    recyclerView3.f4281s = null;
                }
                ArrayList arrayList = this.f4595t.f4292x0;
                if (arrayList != null) {
                    arrayList.remove(bVar);
                }
                this.f4595t.removeCallbacks(aVar);
            }
            this.f4595t = recyclerView;
            if (recyclerView != null) {
                recyclerView.mo4593g(this, -1);
                this.f4595t.f4279r.add(this);
                this.f4595t.mo4615h(bVar);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo4910b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4598w;
        if (i == 1) {
            boolean f = mo5106f(motionEvent.getX(), motionEvent.getY());
            boolean e = mo5105e(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (f || e)) {
                if (e) {
                    this.f4599x = 1;
                    this.f4592q = (float) ((int) motionEvent.getX());
                } else if (f) {
                    this.f4599x = 2;
                    this.f4589n = (float) ((int) motionEvent.getY());
                }
                mo5107g(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo4911d(boolean z) {
    }

    /* renamed from: e */
    public final boolean mo5105e(float f, float f2) {
        if (f2 >= ((float) (this.f4594s - this.f4585j))) {
            int i = this.f4591p;
            int i2 = this.f4590o;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
        }
    }

    /* renamed from: f */
    public final boolean mo5106f(float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.f4595t;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(recyclerView) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f > ((float) this.f4581f)) {
                return false;
            }
        } else if (f < ((float) (this.f4593r - this.f4581f))) {
            return false;
        }
        int i = this.f4588m;
        int i2 = this.f4587l / 2;
        if (f2 < ((float) (i - i2)) || f2 > ((float) (i2 + i))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void mo5107g(int i) {
        if (i == 2 && this.f4598w != 2) {
            this.f4579d.setState(f4572D);
            this.f4595t.removeCallbacks(this.f4576C);
        }
        if (i == 0) {
            this.f4595t.invalidate();
        } else {
            mo5108h();
        }
        if (this.f4598w == 2 && i != 2) {
            this.f4579d.setState(f4573E);
            this.f4595t.removeCallbacks(this.f4576C);
            this.f4595t.postDelayed(this.f4576C, (long) 1200);
        } else if (i == 1) {
            this.f4595t.removeCallbacks(this.f4576C);
            this.f4595t.postDelayed(this.f4576C, (long) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f4598w = i;
    }

    /* renamed from: h */
    public final void mo5108h() {
        int i = this.f4575B;
        if (i != 0) {
            if (i == 3) {
                this.f4574A.cancel();
            } else {
                return;
            }
        }
        this.f4575B = 1;
        ValueAnimator valueAnimator = this.f4574A;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f4574A.setDuration(500);
        this.f4574A.setStartDelay(0);
        this.f4574A.start();
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        if (this.f4593r != this.f4595t.getWidth() || this.f4594s != this.f4595t.getHeight()) {
            this.f4593r = this.f4595t.getWidth();
            this.f4594s = this.f4595t.getHeight();
            mo5107g(0);
        } else if (this.f4575B != 0) {
            if (this.f4596u) {
                int i = this.f4593r;
                int i2 = this.f4581f;
                int i3 = i - i2;
                int i4 = this.f4588m;
                int i5 = this.f4587l;
                int i6 = i4 - (i5 / 2);
                this.f4579d.setBounds(0, 0, i2, i5);
                this.f4580e.setBounds(0, 0, this.f4582g, this.f4594s);
                RecyclerView recyclerView2 = this.f4595t;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                boolean z = true;
                if (C6333d0.C6338e.m15063d(recyclerView2) != 1) {
                    z = false;
                }
                if (z) {
                    this.f4580e.draw(canvas);
                    canvas.translate((float) this.f4581f, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f4579d.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.f4581f), (float) (-i6));
                } else {
                    canvas.translate((float) i3, BitmapDescriptorFactory.HUE_RED);
                    this.f4580e.draw(canvas);
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) i6);
                    this.f4579d.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f4597v) {
                int i7 = this.f4594s;
                int i8 = this.f4585j;
                int i9 = i7 - i8;
                int i11 = this.f4591p;
                int i12 = this.f4590o;
                int i13 = i11 - (i12 / 2);
                this.f4583h.setBounds(0, 0, i12, i8);
                this.f4584i.setBounds(0, 0, this.f4593r, this.f4586k);
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) i9);
                this.f4584i.draw(canvas);
                canvas.translate((float) i13, BitmapDescriptorFactory.HUE_RED);
                this.f4583h.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i9));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        if (r8 >= 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0116, code lost:
        if (r5 >= 0) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r11.f4598w
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L_0x0047
            float r0 = r12.getX()
            float r3 = r12.getY()
            boolean r0 = r11.mo5106f(r0, r3)
            float r3 = r12.getX()
            float r4 = r12.getY()
            boolean r3 = r11.mo5105e(r3, r4)
            if (r0 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x0121
        L_0x0029:
            if (r3 == 0) goto L_0x0036
            r11.f4599x = r2
            float r12 = r12.getX()
            int r12 = (int) r12
            float r12 = (float) r12
            r11.f4592q = r12
            goto L_0x0042
        L_0x0036:
            if (r0 == 0) goto L_0x0042
            r11.f4599x = r1
            float r12 = r12.getY()
            int r12 = (int) r12
            float r12 = (float) r12
            r11.f4589n = r12
        L_0x0042:
            r11.mo5107g(r1)
            goto L_0x0121
        L_0x0047:
            int r0 = r12.getAction()
            r3 = 0
            if (r0 != r2) goto L_0x005e
            int r0 = r11.f4598w
            if (r0 != r1) goto L_0x005e
            r12 = 0
            r11.f4589n = r12
            r11.f4592q = r12
            r11.mo5107g(r2)
            r11.f4599x = r3
            goto L_0x0121
        L_0x005e:
            int r0 = r12.getAction()
            if (r0 != r1) goto L_0x0121
            int r0 = r11.f4598w
            if (r0 != r1) goto L_0x0121
            r11.mo5108h()
            int r0 = r11.f4599x
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x00c7
            float r0 = r12.getX()
            int[] r5 = r11.f4601z
            int r6 = r11.f4578c
            r5[r3] = r6
            int r7 = r11.f4593r
            int r7 = r7 - r6
            r5[r2] = r7
            float r6 = (float) r6
            float r7 = (float) r7
            float r0 = java.lang.Math.min(r7, r0)
            float r0 = java.lang.Math.max(r6, r0)
            int r6 = r11.f4591p
            float r6 = (float) r6
            float r6 = r6 - r0
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0097
            goto L_0x00c7
        L_0x0097:
            float r6 = r11.f4592q
            androidx.recyclerview.widget.RecyclerView r7 = r11.f4595t
            int r7 = r7.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r8 = r11.f4595t
            int r8 = r8.computeHorizontalScrollOffset()
            int r9 = r11.f4593r
            r10 = r5[r2]
            r5 = r5[r3]
            int r10 = r10 - r5
            if (r10 != 0) goto L_0x00b0
        L_0x00ae:
            r5 = 0
            goto L_0x00be
        L_0x00b0:
            float r5 = r0 - r6
            float r6 = (float) r10
            float r5 = r5 / r6
            int r7 = r7 - r9
            float r6 = (float) r7
            float r5 = r5 * r6
            int r5 = (int) r5
            int r8 = r8 + r5
            if (r8 >= r7) goto L_0x00ae
            if (r8 < 0) goto L_0x00ae
        L_0x00be:
            if (r5 == 0) goto L_0x00c5
            androidx.recyclerview.widget.RecyclerView r6 = r11.f4595t
            r6.scrollBy(r5, r3)
        L_0x00c5:
            r11.f4592q = r0
        L_0x00c7:
            int r0 = r11.f4599x
            if (r0 != r1) goto L_0x0121
            float r12 = r12.getY()
            int[] r0 = r11.f4600y
            int r1 = r11.f4578c
            r0[r3] = r1
            int r5 = r11.f4594s
            int r5 = r5 - r1
            r0[r2] = r5
            float r1 = (float) r1
            float r5 = (float) r5
            float r12 = java.lang.Math.min(r5, r12)
            float r12 = java.lang.Math.max(r1, r12)
            int r1 = r11.f4588m
            float r1 = (float) r1
            float r1 = r1 - r12
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f1
            goto L_0x0121
        L_0x00f1:
            float r1 = r11.f4589n
            androidx.recyclerview.widget.RecyclerView r4 = r11.f4595t
            int r4 = r4.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r5 = r11.f4595t
            int r5 = r5.computeVerticalScrollOffset()
            int r6 = r11.f4594s
            r2 = r0[r2]
            r0 = r0[r3]
            int r2 = r2 - r0
            if (r2 != 0) goto L_0x010a
        L_0x0108:
            r0 = 0
            goto L_0x0118
        L_0x010a:
            float r0 = r12 - r1
            float r1 = (float) r2
            float r0 = r0 / r1
            int r4 = r4 - r6
            float r1 = (float) r4
            float r0 = r0 * r1
            int r0 = (int) r0
            int r5 = r5 + r0
            if (r5 >= r4) goto L_0x0108
            if (r5 < 0) goto L_0x0108
        L_0x0118:
            if (r0 == 0) goto L_0x011f
            androidx.recyclerview.widget.RecyclerView r1 = r11.f4595t
            r1.scrollBy(r3, r0)
        L_0x011f:
            r11.f4589n = r12
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1218n.onTouchEvent(android.view.MotionEvent):void");
    }
}
