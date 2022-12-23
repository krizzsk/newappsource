package p111h9;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.analytics.AnalyticsEventKey;
import p497fs.C17066a;
import p543hq.C17474b;

/* renamed from: h9.j */
public final class C5162j implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: b */
    public AccelerateDecelerateInterpolator f17217b = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    public int f17218c = 200;

    /* renamed from: d */
    public float f17219d = 1.0f;

    /* renamed from: e */
    public float f17220e = 1.75f;

    /* renamed from: f */
    public float f17221f = 3.0f;

    /* renamed from: g */
    public boolean f17222g = true;

    /* renamed from: h */
    public boolean f17223h = false;

    /* renamed from: i */
    public ImageView f17224i;

    /* renamed from: j */
    public GestureDetector f17225j;

    /* renamed from: k */
    public C5152a f17226k;

    /* renamed from: l */
    public final Matrix f17227l = new Matrix();

    /* renamed from: m */
    public final Matrix f17228m = new Matrix();

    /* renamed from: n */
    public final Matrix f17229n = new Matrix();

    /* renamed from: o */
    public final RectF f17230o = new RectF();

    /* renamed from: p */
    public final float[] f17231p = new float[9];

    /* renamed from: q */
    public View.OnClickListener f17232q;

    /* renamed from: r */
    public View.OnLongClickListener f17233r;

    /* renamed from: s */
    public C5158f f17234s;

    /* renamed from: t */
    public C5168f f17235t;

    /* renamed from: u */
    public int f17236u = 2;

    /* renamed from: v */
    public int f17237v = 2;

    /* renamed from: w */
    public boolean f17238w = true;

    /* renamed from: x */
    public ImageView.ScaleType f17239x = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: y */
    public C5163a f17240y = new C5163a();

    /* renamed from: h9.j$a */
    public class C5163a implements C5154b {
        public C5163a() {
        }

        /* renamed from: a */
        public final void mo20905a(float f, float f2, float f3) {
            float f4 = C5162j.this.mo20899f();
            C5162j jVar = C5162j.this;
            if (f4 < jVar.f17221f || f < 1.0f) {
                C5158f fVar = jVar.f17234s;
                if (fVar != null) {
                    C17066a.C17068b bVar = (C17066a.C17068b) fVar;
                    if (!bVar.f44248a) {
                        bVar.f44248a = true;
                        C17066a.this.mo46797j2(new C17474b(AnalyticsEventKey.IMAGE_ZOOM));
                    }
                }
                C5162j.this.f17229n.postScale(f, f, f2, f3);
                C5162j.this.mo20894a();
            }
        }
    }

    /* renamed from: h9.j$b */
    public class C5164b extends GestureDetector.SimpleOnGestureListener {
        public C5164b() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C5162j.this.getClass();
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            C5162j jVar = C5162j.this;
            View.OnLongClickListener onLongClickListener = jVar.f17233r;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(jVar.f17224i);
            }
        }
    }

    /* renamed from: h9.j$c */
    public class C5165c implements GestureDetector.OnDoubleTapListener {
        public C5165c() {
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float f = C5162j.this.mo20899f();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                C5162j jVar = C5162j.this;
                float f2 = jVar.f17220e;
                if (f < f2) {
                    jVar.mo20900g(f2, x, y, true);
                } else {
                    if (f >= f2) {
                        float f3 = jVar.f17221f;
                        if (f < f3) {
                            jVar.mo20900g(f3, x, y, true);
                        }
                    }
                    jVar.mo20900g(jVar.f17219d, x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C5162j jVar = C5162j.this;
            View.OnClickListener onClickListener = jVar.f17232q;
            if (onClickListener != null) {
                onClickListener.onClick(jVar.f17224i);
            }
            RectF c = C5162j.this.mo20896c();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            C5162j.this.getClass();
            if (c == null) {
                return false;
            }
            if (c.contains(x, y)) {
                c.width();
                c.height();
                C5162j.this.getClass();
                return true;
            }
            C5162j.this.getClass();
            return false;
        }
    }

    /* renamed from: h9.j$d */
    public static /* synthetic */ class C5166d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17244a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17244a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17244a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17244a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17244a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p111h9.C5162j.C5166d.<clinit>():void");
        }
    }

    /* renamed from: h9.j$e */
    public class C5167e implements Runnable {

        /* renamed from: b */
        public final float f17245b;

        /* renamed from: c */
        public final float f17246c;

        /* renamed from: d */
        public final long f17247d = System.currentTimeMillis();

        /* renamed from: e */
        public final float f17248e;

        /* renamed from: f */
        public final float f17249f;

        public C5167e(float f, float f2, float f3, float f4) {
            this.f17245b = f3;
            this.f17246c = f4;
            this.f17248e = f;
            this.f17249f = f2;
        }

        public final void run() {
            float interpolation = C5162j.this.f17217b.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f17247d)) * 1.0f) / ((float) C5162j.this.f17218c)));
            float f = this.f17248e;
            C5162j.this.f17240y.mo20905a(C16759e.m42347c(this.f17249f, f, interpolation, f) / C5162j.this.mo20899f(), this.f17245b, this.f17246c);
            if (interpolation < 1.0f) {
                C5162j.this.f17224i.postOnAnimation(this);
            }
        }
    }

    /* renamed from: h9.j$f */
    public class C5168f implements Runnable {

        /* renamed from: b */
        public final OverScroller f17251b;

        /* renamed from: c */
        public int f17252c;

        /* renamed from: d */
        public int f17253d;

        public C5168f(Context context) {
            this.f17251b = new OverScroller(context);
        }

        public final void run() {
            if (!this.f17251b.isFinished() && this.f17251b.computeScrollOffset()) {
                int currX = this.f17251b.getCurrX();
                int currY = this.f17251b.getCurrY();
                C5162j.this.f17229n.postTranslate((float) (this.f17252c - currX), (float) (this.f17253d - currY));
                C5162j.this.mo20894a();
                this.f17252c = currX;
                this.f17253d = currY;
                C5162j.this.f17224i.postOnAnimation(this);
            }
        }
    }

    public C5162j(ImageView imageView) {
        this.f17224i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f17226k = new C5152a(imageView.getContext(), this.f17240y);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C5164b());
            this.f17225j = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new C5165c());
        }
    }

    /* renamed from: a */
    public final void mo20894a() {
        if (mo20895b()) {
            this.f17224i.setImageMatrix(mo20898e());
        }
    }

    /* renamed from: b */
    public final boolean mo20895b() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF d = mo20897d(mo20898e());
        if (d == null) {
            return false;
        }
        float height = d.height();
        float width = d.width();
        ImageView imageView = this.f17224i;
        float height2 = (float) ((imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
        float f6 = BitmapDescriptorFactory.HUE_RED;
        if (height <= height2) {
            int i = C5166d.f17244a[this.f17239x.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f4 = (height2 - height) / 2.0f;
                    f5 = d.top;
                } else {
                    f4 = height2 - height;
                    f5 = d.top;
                }
                f = f4 - f5;
            } else {
                f = -d.top;
            }
            this.f17237v = 2;
        } else {
            float f7 = d.top;
            if (f7 > BitmapDescriptorFactory.HUE_RED) {
                this.f17237v = 0;
                f = -f7;
            } else {
                float f8 = d.bottom;
                if (f8 < height2) {
                    this.f17237v = 1;
                    f = height2 - f8;
                } else {
                    this.f17237v = -1;
                    f = BitmapDescriptorFactory.HUE_RED;
                }
            }
        }
        ImageView imageView2 = this.f17224i;
        float width2 = (float) ((imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight());
        if (width <= width2) {
            int i2 = C5166d.f17244a[this.f17239x.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f2 = (width2 - width) / 2.0f;
                    f3 = d.left;
                } else {
                    f2 = width2 - width;
                    f3 = d.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -d.left;
            }
            this.f17236u = 2;
        } else {
            float f9 = d.left;
            if (f9 > BitmapDescriptorFactory.HUE_RED) {
                this.f17236u = 0;
                f6 = -f9;
            } else {
                float f11 = d.right;
                if (f11 < width2) {
                    f6 = width2 - f11;
                    this.f17236u = 1;
                } else {
                    this.f17236u = -1;
                }
            }
        }
        this.f17229n.postTranslate(f6, f);
        return true;
    }

    /* renamed from: c */
    public final RectF mo20896c() {
        mo20895b();
        return mo20897d(mo20898e());
    }

    /* renamed from: d */
    public final RectF mo20897d(Matrix matrix) {
        Drawable drawable = this.f17224i.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f17230o.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.f17230o);
        return this.f17230o;
    }

    /* renamed from: e */
    public final Matrix mo20898e() {
        this.f17228m.set(this.f17227l);
        this.f17228m.postConcat(this.f17229n);
        return this.f17228m;
    }

    /* renamed from: f */
    public final float mo20899f() {
        this.f17229n.getValues(this.f17231p);
        this.f17229n.getValues(this.f17231p);
        return (float) Math.sqrt((double) (((float) Math.pow((double) this.f17231p[0], 2.0d)) + ((float) Math.pow((double) this.f17231p[3], 2.0d))));
    }

    /* renamed from: g */
    public final void mo20900g(float f, float f2, float f3, boolean z) {
        if (f < this.f17219d || f > this.f17221f) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            this.f17224i.post(new C5167e(mo20899f(), f, f2, f3));
        } else {
            this.f17229n.setScale(f, f, f2, f3);
            mo20894a();
        }
    }

    /* renamed from: h */
    public final void mo20901h() {
        if (this.f17238w) {
            mo20902i(this.f17224i.getDrawable());
            return;
        }
        this.f17229n.reset();
        this.f17229n.postRotate(BitmapDescriptorFactory.HUE_RED);
        mo20894a();
        this.f17224i.setImageMatrix(mo20898e());
        mo20895b();
    }

    /* renamed from: i */
    public final void mo20902i(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.f17224i;
            float width = (float) ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight());
            ImageView imageView2 = this.f17224i;
            float height = (float) ((imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f17227l.reset();
            float f = (float) intrinsicWidth;
            float f2 = width / f;
            float f3 = (float) intrinsicHeight;
            float f4 = height / f3;
            ImageView.ScaleType scaleType = this.f17239x;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.f17227l.postTranslate((width - f) / 2.0f, (height - f3) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f2, f4);
                this.f17227l.postScale(max, max);
                this.f17227l.postTranslate((width - (f * max)) / 2.0f, (height - (f3 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f2, f4));
                this.f17227l.postScale(min, min);
                this.f17227l.postTranslate((width - (f * min)) / 2.0f, (height - (f3 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f3);
                RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
                if (((int) BitmapDescriptorFactory.HUE_RED) % 180 != 0) {
                    rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3, f);
                }
                int i = C5166d.f17244a[this.f17239x.ordinal()];
                if (i == 1) {
                    this.f17227l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i == 2) {
                    this.f17227l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i == 3) {
                    this.f17227l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i == 4) {
                    this.f17227l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            this.f17229n.reset();
            this.f17229n.postRotate(BitmapDescriptorFactory.HUE_RED);
            mo20894a();
            this.f17224i.setImageMatrix(mo20898e());
            mo20895b();
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            mo20902i(this.f17224i.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cf A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f17238w
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d0
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x00d0
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x0073
            if (r0 == r2) goto L_0x0020
            r3 = 3
            if (r0 == r3) goto L_0x0020
            goto L_0x0088
        L_0x0020:
            float r0 = r10.mo20899f()
            float r3 = r10.f17219d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            android.graphics.RectF r0 = r10.mo20896c()
            if (r0 == 0) goto L_0x0088
            h9.j$e r9 = new h9.j$e
            float r5 = r10.mo20899f()
            float r6 = r10.f17219d
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L_0x0071
        L_0x0049:
            float r0 = r10.mo20899f()
            float r3 = r10.f17221f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            android.graphics.RectF r0 = r10.mo20896c()
            if (r0 == 0) goto L_0x0088
            h9.j$e r9 = new h9.j$e
            float r5 = r10.mo20899f()
            float r6 = r10.f17221f
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L_0x0071:
            r11 = 1
            goto L_0x0089
        L_0x0073:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x007c
            r11.requestDisallowInterceptTouchEvent(r2)
        L_0x007c:
            h9.j$f r11 = r10.f17235t
            if (r11 == 0) goto L_0x0088
            android.widget.OverScroller r11 = r11.f17251b
            r11.forceFinished(r2)
            r11 = 0
            r10.f17235t = r11
        L_0x0088:
            r11 = 0
        L_0x0089:
            h9.a r0 = r10.f17226k
            if (r0 == 0) goto L_0x00c4
            android.view.ScaleGestureDetector r11 = r0.f17208c
            boolean r11 = r11.isInProgress()
            h9.a r0 = r10.f17226k
            boolean r3 = r0.f17210e
            android.view.ScaleGestureDetector r4 = r0.f17208c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.onTouchEvent(r12)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r0.mo20884a(r12)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a1
        L_0x00a0:
        L_0x00a1:
            if (r11 != 0) goto L_0x00af
            h9.a r11 = r10.f17226k
            android.view.ScaleGestureDetector r11 = r11.f17208c
            boolean r11 = r11.isInProgress()
            if (r11 != 0) goto L_0x00af
            r11 = 1
            goto L_0x00b0
        L_0x00af:
            r11 = 0
        L_0x00b0:
            if (r3 != 0) goto L_0x00ba
            h9.a r0 = r10.f17226k
            boolean r0 = r0.f17210e
            if (r0 != 0) goto L_0x00ba
            r0 = 1
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r11 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x00c0
            r1 = 1
        L_0x00c0:
            r10.f17223h = r1
            r1 = 1
            goto L_0x00c5
        L_0x00c4:
            r1 = r11
        L_0x00c5:
            android.view.GestureDetector r11 = r10.f17225j
            if (r11 == 0) goto L_0x00d0
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L_0x00d0
            r1 = 1
        L_0x00d0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p111h9.C5162j.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
