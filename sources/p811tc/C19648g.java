package p811tc;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.BitSet;
import p141k1.C5455c;
import p229r1.C6232b;
import p599kc.C18017a;
import p787sc.C19444a;
import p811tc.C19656l;
import p811tc.C19659n;

/* renamed from: tc.g */
public class C19648g extends Drawable implements C5455c, C19666o {

    /* renamed from: y */
    public static final Paint f49836y;

    /* renamed from: b */
    public C19650b f49837b;

    /* renamed from: c */
    public final C19659n.C19665f[] f49838c;

    /* renamed from: d */
    public final C19659n.C19665f[] f49839d;

    /* renamed from: e */
    public final BitSet f49840e;

    /* renamed from: f */
    public boolean f49841f;

    /* renamed from: g */
    public final Matrix f49842g;

    /* renamed from: h */
    public final Path f49843h;

    /* renamed from: i */
    public final Path f49844i;

    /* renamed from: j */
    public final RectF f49845j;

    /* renamed from: k */
    public final RectF f49846k;

    /* renamed from: l */
    public final Region f49847l;

    /* renamed from: m */
    public final Region f49848m;

    /* renamed from: n */
    public C19654k f49849n;

    /* renamed from: o */
    public final Paint f49850o;

    /* renamed from: p */
    public final Paint f49851p;

    /* renamed from: q */
    public final C19444a f49852q;

    /* renamed from: r */
    public final C19649a f49853r;

    /* renamed from: s */
    public final C19656l f49854s;

    /* renamed from: t */
    public PorterDuffColorFilter f49855t;

    /* renamed from: u */
    public PorterDuffColorFilter f49856u;

    /* renamed from: v */
    public int f49857v;

    /* renamed from: w */
    public final RectF f49858w;

    /* renamed from: x */
    public boolean f49859x;

    /* renamed from: tc.g$a */
    public class C19649a {
        public C19649a() {
        }
    }

    static {
        Class<C19648g> cls = C19648g.class;
        Paint paint = new Paint(1);
        f49836y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C19648g() {
        this(new C19654k());
    }

    /* renamed from: b */
    public final void mo51989b(RectF rectF, Path path) {
        C19656l lVar = this.f49854s;
        C19650b bVar = this.f49837b;
        C19654k kVar = bVar.f49861a;
        float f = bVar.f49870j;
        lVar.mo52028a(kVar, f, rectF, this.f49853r, path);
        if (this.f49837b.f49869i != 1.0f) {
            this.f49842g.reset();
            Matrix matrix = this.f49842g;
            float f2 = this.f49837b.f49869i;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f49842g);
        }
        path.computeBounds(this.f49858w, true);
    }

    /* renamed from: c */
    public final PorterDuffColorFilter mo51990c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList == null || mode == null) {
            if (z) {
                int color = paint.getColor();
                int d = mo51991d(color);
                this.f49857v = d;
                if (d != color) {
                    porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
                    return porterDuffColorFilter;
                }
            }
            porterDuffColorFilter = null;
            return porterDuffColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo51991d(colorForState);
        }
        this.f49857v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: d */
    public final int mo51991d(int i) {
        C19650b bVar = this.f49837b;
        float f = bVar.f49874n + bVar.f49875o + bVar.f49873m;
        C18017a aVar = bVar.f49862b;
        if (aVar != null) {
            return aVar.mo50512a(f, i);
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0136, code lost:
        if (r0 != false) goto L_0x0138;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0223  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            android.graphics.Paint r0 = r6.f49850o
            android.graphics.PorterDuffColorFilter r1 = r6.f49855t
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r6.f49850o
            int r8 = r0.getAlpha()
            android.graphics.Paint r0 = r6.f49850o
            tc.g$b r1 = r6.f49837b
            int r1 = r1.f49872l
            int r2 = r1 >>> 7
            int r1 = r1 + r2
            int r1 = r1 * r8
            int r1 = r1 >>> 8
            r0.setAlpha(r1)
            android.graphics.Paint r0 = r6.f49851p
            android.graphics.PorterDuffColorFilter r1 = r6.f49856u
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r6.f49851p
            tc.g$b r1 = r6.f49837b
            float r1 = r1.f49871k
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r6.f49851p
            int r9 = r0.getAlpha()
            android.graphics.Paint r0 = r6.f49851p
            tc.g$b r1 = r6.f49837b
            int r1 = r1.f49872l
            int r2 = r1 >>> 7
            int r1 = r1 + r2
            int r1 = r1 * r9
            int r1 = r1 >>> 8
            r0.setAlpha(r1)
            boolean r0 = r6.f49841f
            r10 = 0
            r11 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0112
            tc.g$b r0 = r6.f49837b
            android.graphics.Paint$Style r0 = r0.f49881u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r2) goto L_0x005a
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            if (r0 != r2) goto L_0x0066
        L_0x005a:
            android.graphics.Paint r0 = r6.f49851p
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0066
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0073
            android.graphics.Paint r0 = r6.f49851p
            float r0 = r0.getStrokeWidth()
            float r0 = r0 / r2
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            float r0 = -r0
            tc.g$b r3 = r6.f49837b
            tc.k r3 = r3.f49861a
            r3.getClass()
            tc.k$a r4 = new tc.k$a
            r4.<init>(r3)
            tc.c r5 = r3.f49891e
            boolean r12 = r5 instanceof p811tc.C19652i
            if (r12 == 0) goto L_0x0088
            goto L_0x008e
        L_0x0088:
            tc.b r12 = new tc.b
            r12.<init>(r0, r5)
            r5 = r12
        L_0x008e:
            r4.f49903e = r5
            tc.c r5 = r3.f49892f
            boolean r12 = r5 instanceof p811tc.C19652i
            if (r12 == 0) goto L_0x0097
            goto L_0x009d
        L_0x0097:
            tc.b r12 = new tc.b
            r12.<init>(r0, r5)
            r5 = r12
        L_0x009d:
            r4.f49904f = r5
            tc.c r5 = r3.f49894h
            boolean r12 = r5 instanceof p811tc.C19652i
            if (r12 == 0) goto L_0x00a6
            goto L_0x00ac
        L_0x00a6:
            tc.b r12 = new tc.b
            r12.<init>(r0, r5)
            r5 = r12
        L_0x00ac:
            r4.f49906h = r5
            tc.c r3 = r3.f49893g
            boolean r5 = r3 instanceof p811tc.C19652i
            if (r5 == 0) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            tc.b r5 = new tc.b
            r5.<init>(r0, r3)
            r3 = r5
        L_0x00bb:
            r4.f49905g = r3
            tc.k r13 = new tc.k
            r13.<init>(r4)
            r6.f49849n = r13
            tc.l r12 = r6.f49854s
            tc.g$b r0 = r6.f49837b
            float r14 = r0.f49870j
            android.graphics.RectF r0 = r6.f49846k
            android.graphics.RectF r3 = r18.mo51997h()
            r0.set(r3)
            tc.g$b r0 = r6.f49837b
            android.graphics.Paint$Style r0 = r0.f49881u
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r3) goto L_0x00df
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            if (r0 != r3) goto L_0x00eb
        L_0x00df:
            android.graphics.Paint r0 = r6.f49851p
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            r0 = 1
            goto L_0x00ec
        L_0x00eb:
            r0 = 0
        L_0x00ec:
            if (r0 == 0) goto L_0x00f6
            android.graphics.Paint r0 = r6.f49851p
            float r0 = r0.getStrokeWidth()
            float r0 = r0 / r2
            goto L_0x00f7
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            android.graphics.RectF r2 = r6.f49846k
            r2.inset(r0, r0)
            android.graphics.RectF r15 = r6.f49846k
            android.graphics.Path r0 = r6.f49844i
            r16 = 0
            r17 = r0
            r12.mo52028a(r13, r14, r15, r16, r17)
            android.graphics.RectF r0 = r18.mo51997h()
            android.graphics.Path r2 = r6.f49843h
            r6.mo51989b(r0, r2)
            r6.f49841f = r11
        L_0x0112:
            tc.g$b r0 = r6.f49837b
            int r2 = r0.f49876p
            r3 = 2
            if (r2 == r1) goto L_0x013a
            int r0 = r0.f49877q
            if (r0 <= 0) goto L_0x013a
            if (r2 == r3) goto L_0x0138
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r1 = r18.mo52002l()
            if (r1 != 0) goto L_0x0135
            android.graphics.Path r1 = r6.f49843h
            boolean r1 = r1.isConvex()
            if (r1 != 0) goto L_0x0135
            r1 = 29
            if (r0 >= r1) goto L_0x0135
            r0 = 1
            goto L_0x0136
        L_0x0135:
            r0 = 0
        L_0x0136:
            if (r0 == 0) goto L_0x013a
        L_0x0138:
            r0 = 1
            goto L_0x013b
        L_0x013a:
            r0 = 0
        L_0x013b:
            if (r0 != 0) goto L_0x013f
            goto L_0x01e7
        L_0x013f:
            r19.save()
            tc.g$b r0 = r6.f49837b
            int r1 = r0.f49878r
            double r1 = (double) r1
            int r0 = r0.f49879s
            double r3 = (double) r0
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.sin(r3)
            double r3 = r3 * r1
            int r0 = (int) r3
            int r1 = r18.mo51998i()
            float r0 = (float) r0
            float r1 = (float) r1
            r7.translate(r0, r1)
            boolean r0 = r6.f49859x
            if (r0 != 0) goto L_0x016a
            r18.mo51992e(r19)
            r19.restore()
            goto L_0x01e7
        L_0x016a:
            android.graphics.RectF r0 = r6.f49858w
            float r0 = r0.width()
            android.graphics.Rect r1 = r18.getBounds()
            int r1 = r1.width()
            float r1 = (float) r1
            float r0 = r0 - r1
            int r0 = (int) r0
            android.graphics.RectF r1 = r6.f49858w
            float r1 = r1.height()
            android.graphics.Rect r2 = r18.getBounds()
            int r2 = r2.height()
            float r2 = (float) r2
            float r1 = r1 - r2
            int r1 = (int) r1
            if (r0 < 0) goto L_0x0231
            if (r1 < 0) goto L_0x0231
            android.graphics.RectF r2 = r6.f49858w
            float r2 = r2.width()
            int r2 = (int) r2
            tc.g$b r3 = r6.f49837b
            int r3 = r3.f49877q
            r4 = 2
            int r2 = p379.C16530d.m42021o(r3, r4, r2, r0)
            android.graphics.RectF r3 = r6.f49858w
            float r3 = r3.height()
            int r3 = (int) r3
            tc.g$b r4 = r6.f49837b
            int r4 = r4.f49877q
            r5 = 2
            int r3 = p379.C16530d.m42021o(r4, r5, r3, r1)
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.graphics.Rect r4 = r18.getBounds()
            int r4 = r4.left
            tc.g$b r5 = r6.f49837b
            int r5 = r5.f49877q
            int r4 = r4 - r5
            int r4 = r4 - r0
            float r0 = (float) r4
            android.graphics.Rect r4 = r18.getBounds()
            int r4 = r4.top
            tc.g$b r5 = r6.f49837b
            int r5 = r5.f49877q
            int r4 = r4 - r5
            int r4 = r4 - r1
            float r1 = (float) r4
            float r4 = -r0
            float r5 = -r1
            r3.translate(r4, r5)
            r6.mo51992e(r3)
            r3 = 0
            r7.drawBitmap(r2, r0, r1, r3)
            r2.recycle()
            r19.restore()
        L_0x01e7:
            tc.g$b r0 = r6.f49837b
            android.graphics.Paint$Style r1 = r0.f49881u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r2) goto L_0x01f6
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            if (r1 != r2) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r1 = 0
            goto L_0x01f7
        L_0x01f6:
            r1 = 1
        L_0x01f7:
            if (r1 == 0) goto L_0x020a
            android.graphics.Paint r2 = r6.f49850o
            android.graphics.Path r3 = r6.f49843h
            tc.k r4 = r0.f49861a
            android.graphics.RectF r5 = r18.mo51997h()
            r0 = r18
            r1 = r19
            r0.mo51993f(r1, r2, r3, r4, r5)
        L_0x020a:
            tc.g$b r0 = r6.f49837b
            android.graphics.Paint$Style r0 = r0.f49881u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0216
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x0221
        L_0x0216:
            android.graphics.Paint r0 = r6.f49851p
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0221
            r11 = 1
        L_0x0221:
            if (r11 == 0) goto L_0x0226
            r18.mo42603g(r19)
        L_0x0226:
            android.graphics.Paint r0 = r6.f49850o
            r0.setAlpha(r8)
            android.graphics.Paint r0 = r6.f49851p
            r0.setAlpha(r9)
            return
        L_0x0231:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p811tc.C19648g.draw(android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public final void mo51992e(Canvas canvas) {
        this.f49840e.cardinality();
        if (this.f49837b.f49878r != 0) {
            canvas.drawPath(this.f49843h, this.f49852q.f49458a);
        }
        for (int i = 0; i < 4; i++) {
            C19659n.C19665f fVar = this.f49838c[i];
            C19444a aVar = this.f49852q;
            int i2 = this.f49837b.f49877q;
            Matrix matrix = C19659n.C19665f.f49948a;
            fVar.mo52030a(matrix, aVar, i2, canvas);
            this.f49839d[i].mo52030a(matrix, this.f49852q, this.f49837b.f49877q, canvas);
        }
        if (this.f49859x) {
            C19650b bVar = this.f49837b;
            int sin = (int) (Math.sin(Math.toRadians((double) bVar.f49879s)) * ((double) bVar.f49878r));
            int i3 = mo51998i();
            canvas.translate((float) (-sin), (float) (-i3));
            canvas.drawPath(this.f49843h, f49836y);
            canvas.translate((float) sin, (float) i3);
        }
    }

    /* renamed from: f */
    public final void mo51993f(Canvas canvas, Paint paint, Path path, C19654k kVar, RectF rectF) {
        if (kVar.mo52020f(rectF)) {
            float a = kVar.f49892f.mo51983a(rectF) * this.f49837b.f49870j;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: g */
    public void mo42603g(Canvas canvas) {
        boolean z;
        Paint paint = this.f49851p;
        Path path = this.f49844i;
        C19654k kVar = this.f49849n;
        this.f49846k.set(mo51997h());
        Paint.Style style = this.f49837b.f49881u;
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        float f = BitmapDescriptorFactory.HUE_RED;
        if ((style == style2 || style == Paint.Style.STROKE) && this.f49851p.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = this.f49851p.getStrokeWidth() / 2.0f;
        }
        this.f49846k.inset(f, f);
        mo51993f(canvas, paint, path, kVar, this.f49846k);
    }

    public int getAlpha() {
        return this.f49837b.f49872l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f49837b;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f49837b.f49876p != 2) {
            if (mo52002l()) {
                outline.setRoundRect(getBounds(), mo52000j() * this.f49837b.f49870j);
                return;
            }
            mo51989b(mo51997h(), this.f49843h);
            if (this.f49843h.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f49843h);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f49837b.f49868h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        this.f49847l.set(getBounds());
        mo51989b(mo51997h(), this.f49843h);
        this.f49848m.setPath(this.f49843h, this.f49847l);
        this.f49847l.op(this.f49848m, Region.Op.DIFFERENCE);
        return this.f49847l;
    }

    /* renamed from: h */
    public final RectF mo51997h() {
        this.f49845j.set(getBounds());
        return this.f49845j;
    }

    /* renamed from: i */
    public final int mo51998i() {
        C19650b bVar = this.f49837b;
        return (int) (Math.cos(Math.toRadians((double) bVar.f49879s)) * ((double) bVar.f49878r));
    }

    public final void invalidateSelf() {
        this.f49841f = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f49837b.f49866f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f49837b.f49865e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f49837b.f49864d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f49837b.f49863c) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final float mo52000j() {
        return this.f49837b.f49861a.f49891e.mo51983a(mo51997h());
    }

    /* renamed from: k */
    public final void mo52001k(Context context) {
        this.f49837b.f49862b = new C18017a(context);
        mo52015v();
    }

    /* renamed from: l */
    public final boolean mo52002l() {
        return this.f49837b.f49861a.mo52020f(mo51997h());
    }

    /* renamed from: m */
    public final void mo52003m(float f) {
        C19650b bVar = this.f49837b;
        if (bVar.f49874n != f) {
            bVar.f49874n = f;
            mo52015v();
        }
    }

    public final Drawable mutate() {
        this.f49837b = new C19650b(this.f49837b);
        return this;
    }

    /* renamed from: n */
    public final void mo52005n(ColorStateList colorStateList) {
        C19650b bVar = this.f49837b;
        if (bVar.f49863c != colorStateList) {
            bVar.f49863c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: o */
    public final void mo52006o(float f) {
        C19650b bVar = this.f49837b;
        if (bVar.f49870j != f) {
            bVar.f49870j = f;
            this.f49841f = true;
            invalidateSelf();
        }
    }

    public void onBoundsChange(Rect rect) {
        this.f49841f = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean t = mo52013t(iArr);
        boolean u = mo52014u();
        if (t || u) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public final void mo52008p(Paint.Style style) {
        this.f49837b.f49881u = style;
        super.invalidateSelf();
    }

    /* renamed from: q */
    public final void mo52009q() {
        this.f49852q.mo51854a(-12303292);
        this.f49837b.f49880t = false;
        super.invalidateSelf();
    }

    /* renamed from: r */
    public final void mo52010r() {
        C19650b bVar = this.f49837b;
        if (bVar.f49876p != 2) {
            bVar.f49876p = 2;
            super.invalidateSelf();
        }
    }

    /* renamed from: s */
    public final void mo52011s(ColorStateList colorStateList) {
        C19650b bVar = this.f49837b;
        if (bVar.f49864d != colorStateList) {
            bVar.f49864d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setAlpha(int i) {
        C19650b bVar = this.f49837b;
        if (bVar.f49872l != i) {
            bVar.f49872l = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f49837b.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(C19654k kVar) {
        this.f49837b.f49861a = kVar;
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f49837b.f49866f = colorStateList;
        mo52014u();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C19650b bVar = this.f49837b;
        if (bVar.f49867g != mode) {
            bVar.f49867g = mode;
            mo52014u();
            super.invalidateSelf();
        }
    }

    /* renamed from: t */
    public final boolean mo52013t(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f49837b.f49863c == null || (color2 = this.f49850o.getColor()) == (colorForState2 = this.f49837b.f49863c.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f49850o.setColor(colorForState2);
            z = true;
        }
        if (this.f49837b.f49864d == null || (color = this.f49851p.getColor()) == (colorForState = this.f49837b.f49864d.getColorForState(iArr, color))) {
            return z;
        }
        this.f49851p.setColor(colorForState);
        return true;
    }

    /* renamed from: u */
    public final boolean mo52014u() {
        PorterDuffColorFilter porterDuffColorFilter = this.f49855t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f49856u;
        C19650b bVar = this.f49837b;
        this.f49855t = mo51990c(bVar.f49866f, bVar.f49867g, this.f49850o, true);
        C19650b bVar2 = this.f49837b;
        this.f49856u = mo51990c(bVar2.f49865e, bVar2.f49867g, this.f49851p, false);
        C19650b bVar3 = this.f49837b;
        if (bVar3.f49880t) {
            this.f49852q.mo51854a(bVar3.f49866f.getColorForState(getState(), 0));
        }
        if (!C6232b.m14816a(porterDuffColorFilter, this.f49855t) || !C6232b.m14816a(porterDuffColorFilter2, this.f49856u)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void mo52015v() {
        C19650b bVar = this.f49837b;
        float f = bVar.f49874n + bVar.f49875o;
        bVar.f49877q = (int) Math.ceil((double) (0.75f * f));
        this.f49837b.f49878r = (int) Math.ceil((double) (f * 0.25f));
        mo52014u();
        super.invalidateSelf();
    }

    public C19648g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C19654k.m47124c(context, attributeSet, i, i2).mo52022a());
    }

    public C19648g(C19654k kVar) {
        this(new C19650b(kVar));
    }

    public C19648g(C19650b bVar) {
        C19656l lVar;
        this.f49838c = new C19659n.C19665f[4];
        this.f49839d = new C19659n.C19665f[4];
        this.f49840e = new BitSet(8);
        this.f49842g = new Matrix();
        this.f49843h = new Path();
        this.f49844i = new Path();
        this.f49845j = new RectF();
        this.f49846k = new RectF();
        this.f49847l = new Region();
        this.f49848m = new Region();
        Paint paint = new Paint(1);
        this.f49850o = paint;
        Paint paint2 = new Paint(1);
        this.f49851p = paint2;
        this.f49852q = new C19444a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = C19656l.C19657a.f49923a;
        } else {
            lVar = new C19656l();
        }
        this.f49854s = lVar;
        this.f49858w = new RectF();
        this.f49859x = true;
        this.f49837b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        mo52014u();
        mo52013t(getState());
        this.f49853r = new C19649a();
    }

    /* renamed from: tc.g$b */
    public static final class C19650b extends Drawable.ConstantState {

        /* renamed from: a */
        public C19654k f49861a;

        /* renamed from: b */
        public C18017a f49862b;

        /* renamed from: c */
        public ColorStateList f49863c = null;

        /* renamed from: d */
        public ColorStateList f49864d = null;

        /* renamed from: e */
        public ColorStateList f49865e = null;

        /* renamed from: f */
        public ColorStateList f49866f = null;

        /* renamed from: g */
        public PorterDuff.Mode f49867g = PorterDuff.Mode.SRC_IN;

        /* renamed from: h */
        public Rect f49868h = null;

        /* renamed from: i */
        public float f49869i = 1.0f;

        /* renamed from: j */
        public float f49870j = 1.0f;

        /* renamed from: k */
        public float f49871k;

        /* renamed from: l */
        public int f49872l = ValidationUtils.APPBOY_STRING_MAX_LENGTH;

        /* renamed from: m */
        public float f49873m = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: n */
        public float f49874n = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: o */
        public float f49875o = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: p */
        public int f49876p = 0;

        /* renamed from: q */
        public int f49877q = 0;

        /* renamed from: r */
        public int f49878r = 0;

        /* renamed from: s */
        public int f49879s = 0;

        /* renamed from: t */
        public boolean f49880t = false;

        /* renamed from: u */
        public Paint.Style f49881u = Paint.Style.FILL_AND_STROKE;

        public C19650b(C19654k kVar) {
            this.f49861a = kVar;
            this.f49862b = null;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            C19648g gVar = new C19648g(this);
            gVar.f49841f = true;
            return gVar;
        }

        public C19650b(C19650b bVar) {
            this.f49861a = bVar.f49861a;
            this.f49862b = bVar.f49862b;
            this.f49871k = bVar.f49871k;
            this.f49863c = bVar.f49863c;
            this.f49864d = bVar.f49864d;
            this.f49867g = bVar.f49867g;
            this.f49866f = bVar.f49866f;
            this.f49872l = bVar.f49872l;
            this.f49869i = bVar.f49869i;
            this.f49878r = bVar.f49878r;
            this.f49876p = bVar.f49876p;
            this.f49880t = bVar.f49880t;
            this.f49870j = bVar.f49870j;
            this.f49873m = bVar.f49873m;
            this.f49874n = bVar.f49874n;
            this.f49875o = bVar.f49875o;
            this.f49877q = bVar.f49877q;
            this.f49879s = bVar.f49879s;
            this.f49865e = bVar.f49865e;
            this.f49881u = bVar.f49881u;
            if (bVar.f49868h != null) {
                this.f49868h = new Rect(bVar.f49868h);
            }
        }
    }
}
