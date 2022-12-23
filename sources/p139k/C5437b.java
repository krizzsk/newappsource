package p139k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import com.appboy.support.ValidationUtils;
import p139k.C5443e;
import p141k1.C5450a;

/* renamed from: k.b */
public class C5437b extends Drawable implements Drawable.Callback {

    /* renamed from: n */
    public static final /* synthetic */ int f17899n = 0;

    /* renamed from: b */
    public C5440c f17900b;

    /* renamed from: c */
    public Rect f17901c;

    /* renamed from: d */
    public Drawable f17902d;

    /* renamed from: e */
    public Drawable f17903e;

    /* renamed from: f */
    public int f17904f = ValidationUtils.APPBOY_STRING_MAX_LENGTH;

    /* renamed from: g */
    public boolean f17905g;

    /* renamed from: h */
    public int f17906h = -1;

    /* renamed from: i */
    public boolean f17907i;

    /* renamed from: j */
    public C5438a f17908j;

    /* renamed from: k */
    public long f17909k;

    /* renamed from: l */
    public long f17910l;

    /* renamed from: m */
    public C5439b f17911m;

    /* renamed from: k.b$a */
    public class C5438a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C5437b f17912b;

        public C5438a(C5443e eVar) {
            this.f17912b = eVar;
        }

        public final void run() {
            this.f17912b.mo21222a(true);
            this.f17912b.invalidateSelf();
        }
    }

    /* renamed from: k.b$b */
    public static class C5439b implements Drawable.Callback {

        /* renamed from: b */
        public Drawable.Callback f17913b;

        public final void invalidateDrawable(Drawable drawable) {
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f17913b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f17913b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: k.b$c */
    public static abstract class C5440c extends Drawable.ConstantState {

        /* renamed from: A */
        public boolean f17914A;

        /* renamed from: B */
        public ColorFilter f17915B;

        /* renamed from: C */
        public boolean f17916C;

        /* renamed from: D */
        public ColorStateList f17917D;

        /* renamed from: E */
        public PorterDuff.Mode f17918E;

        /* renamed from: F */
        public boolean f17919F;

        /* renamed from: G */
        public boolean f17920G;

        /* renamed from: a */
        public final C5437b f17921a;

        /* renamed from: b */
        public Resources f17922b;

        /* renamed from: c */
        public int f17923c;

        /* renamed from: d */
        public int f17924d;

        /* renamed from: e */
        public int f17925e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f17926f;

        /* renamed from: g */
        public Drawable[] f17927g;

        /* renamed from: h */
        public int f17928h;

        /* renamed from: i */
        public boolean f17929i = false;

        /* renamed from: j */
        public boolean f17930j;

        /* renamed from: k */
        public Rect f17931k;

        /* renamed from: l */
        public boolean f17932l = false;

        /* renamed from: m */
        public boolean f17933m;

        /* renamed from: n */
        public int f17934n;

        /* renamed from: o */
        public int f17935o;

        /* renamed from: p */
        public int f17936p;

        /* renamed from: q */
        public int f17937q;

        /* renamed from: r */
        public boolean f17938r;

        /* renamed from: s */
        public int f17939s;

        /* renamed from: t */
        public boolean f17940t;

        /* renamed from: u */
        public boolean f17941u;

        /* renamed from: v */
        public boolean f17942v;

        /* renamed from: w */
        public boolean f17943w = true;

        /* renamed from: x */
        public int f17944x;

        /* renamed from: y */
        public int f17945y = 0;

        /* renamed from: z */
        public int f17946z = 0;

        public C5440c(C5440c cVar, C5437b bVar, Resources resources) {
            Resources resources2;
            int i;
            this.f17921a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (cVar != null) {
                resources2 = cVar.f17922b;
            } else {
                resources2 = null;
            }
            this.f17922b = resources2;
            if (cVar != null) {
                i = cVar.f17923c;
            } else {
                i = 0;
            }
            int i2 = C5437b.f17899n;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? 160 : i;
            this.f17923c = i;
            if (cVar != null) {
                this.f17924d = cVar.f17924d;
                this.f17925e = cVar.f17925e;
                this.f17941u = true;
                this.f17942v = true;
                this.f17929i = cVar.f17929i;
                this.f17932l = cVar.f17932l;
                this.f17943w = cVar.f17943w;
                this.f17944x = cVar.f17944x;
                this.f17945y = cVar.f17945y;
                this.f17946z = cVar.f17946z;
                this.f17914A = cVar.f17914A;
                this.f17915B = cVar.f17915B;
                this.f17916C = cVar.f17916C;
                this.f17917D = cVar.f17917D;
                this.f17918E = cVar.f17918E;
                this.f17919F = cVar.f17919F;
                this.f17920G = cVar.f17920G;
                if (cVar.f17923c == i) {
                    if (cVar.f17930j) {
                        this.f17931k = cVar.f17931k != null ? new Rect(cVar.f17931k) : rect;
                        this.f17930j = true;
                    }
                    if (cVar.f17933m) {
                        this.f17934n = cVar.f17934n;
                        this.f17935o = cVar.f17935o;
                        this.f17936p = cVar.f17936p;
                        this.f17937q = cVar.f17937q;
                        this.f17933m = true;
                    }
                }
                if (cVar.f17938r) {
                    this.f17939s = cVar.f17939s;
                    this.f17938r = true;
                }
                if (cVar.f17940t) {
                    this.f17940t = true;
                }
                Drawable[] drawableArr = cVar.f17927g;
                this.f17927g = new Drawable[drawableArr.length];
                this.f17928h = cVar.f17928h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f17926f;
                if (sparseArray != null) {
                    this.f17926f = sparseArray.clone();
                } else {
                    this.f17926f = new SparseArray<>(this.f17928h);
                }
                int i3 = this.f17928h;
                for (int i4 = 0; i4 < i3; i4++) {
                    Drawable drawable = drawableArr[i4];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f17926f.put(i4, constantState);
                        } else {
                            this.f17927g[i4] = drawableArr[i4];
                        }
                    }
                }
                return;
            }
            this.f17927g = new Drawable[10];
            this.f17928h = 0;
        }

        /* renamed from: a */
        public final int mo21260a(Drawable drawable) {
            int i = this.f17928h;
            if (i >= this.f17927g.length) {
                int i2 = i + 10;
                C5443e.C5444a aVar = (C5443e.C5444a) this;
                Drawable[] drawableArr = new Drawable[i2];
                Drawable[] drawableArr2 = aVar.f17927g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                aVar.f17927g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(aVar.f17963H, 0, iArr, 0, i);
                aVar.f17963H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f17921a);
            this.f17927g[i] = drawable;
            this.f17928h++;
            this.f17925e = drawable.getChangingConfigurations() | this.f17925e;
            this.f17938r = false;
            this.f17940t = false;
            this.f17931k = null;
            this.f17930j = false;
            this.f17933m = false;
            this.f17941u = false;
            return i;
        }

        /* renamed from: b */
        public final void mo21261b() {
            this.f17933m = true;
            mo21262c();
            int i = this.f17928h;
            Drawable[] drawableArr = this.f17927g;
            this.f17935o = -1;
            this.f17934n = -1;
            this.f17937q = 0;
            this.f17936p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f17934n) {
                    this.f17934n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f17935o) {
                    this.f17935o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f17936p) {
                    this.f17936p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f17937q) {
                    this.f17937q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void mo21262c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f17926f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f17926f.keyAt(i);
                    Drawable[] drawableArr = this.f17927g;
                    Drawable newDrawable = this.f17926f.valueAt(i).newDrawable(this.f17922b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        C5450a.m13600c(newDrawable, this.f17944x);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f17921a);
                    drawableArr[keyAt] = mutate;
                }
                this.f17926f = null;
            }
        }

        public final boolean canApplyTheme() {
            int i = this.f17928h;
            Drawable[] drawableArr = this.f17927g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f17926f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (C5450a.C5452b.m13611b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final Drawable mo21264d(int i) {
            int indexOfKey;
            Drawable drawable = this.f17927g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f17926f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f17926f.valueAt(indexOfKey).newDrawable(this.f17922b);
            if (Build.VERSION.SDK_INT >= 23) {
                C5450a.m13600c(newDrawable, this.f17944x);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f17921a);
            this.f17927g[i] = mutate;
            this.f17926f.removeAt(indexOfKey);
            if (this.f17926f.size() == 0) {
                this.f17926f = null;
            }
            return mutate;
        }

        /* renamed from: e */
        public abstract void mo21216e();

        public final int getChangingConfigurations() {
            return this.f17924d | this.f17925e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21222a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f17905g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f17902d
            r4 = 0
            r5 = 255(0xff, double:1.26E-321)
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f17909k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f17904f
            r3.setAlpha(r9)
            r13.f17909k = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r5
            int r10 = (int) r9
            k.b$c r9 = r13.f17900b
            int r9 = r9.f17945y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f17904f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f17909k = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f17903e
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f17910l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r4, r4)
            r0 = 0
            r13.f17903e = r0
            r13.f17910l = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r5
            int r3 = (int) r10
            k.b$c r4 = r13.f17900b
            int r4 = r4.f17946z
            int r3 = r3 / r4
            int r4 = r13.f17904f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f17910l = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            k.b$a r14 = r13.f17908j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139k.C5437b.mo21222a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        C5440c cVar = this.f17900b;
        if (theme != null) {
            cVar.mo21262c();
            int i = cVar.f17928h;
            Drawable[] drawableArr = cVar.f17927g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && C5450a.C5452b.m13611b(drawable)) {
                    C5450a.C5452b.m13610a(drawableArr[i2], theme);
                    cVar.f17925e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                cVar.f17922b = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = cVar.f17923c;
                cVar.f17923c = i3;
                if (i4 != i3) {
                    cVar.f17933m = false;
                    cVar.f17930j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    /* renamed from: b */
    public C5440c mo21207b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo21224c(Drawable drawable) {
        if (this.f17911m == null) {
            this.f17911m = new C5439b();
        }
        C5439b bVar = this.f17911m;
        bVar.f17913b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f17900b.f17945y <= 0 && this.f17905g) {
                drawable.setAlpha(this.f17904f);
            }
            C5440c cVar = this.f17900b;
            if (cVar.f17916C) {
                drawable.setColorFilter(cVar.f17915B);
            } else {
                if (cVar.f17919F) {
                    C5450a.C5452b.m13617h(drawable, cVar.f17917D);
                }
                C5440c cVar2 = this.f17900b;
                if (cVar2.f17920G) {
                    C5450a.C5452b.m13618i(drawable, cVar2.f17918E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f17900b.f17943w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C5450a.m13600c(drawable, C5450a.m13599b(this));
            }
            C5450a.C5451a.m13609e(drawable, this.f17900b.f17914A);
            Rect rect = this.f17901c;
            if (rect != null) {
                C5450a.C5452b.m13615f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C5439b bVar2 = this.f17911m;
            Drawable.Callback callback = bVar2.f17913b;
            bVar2.f17913b = null;
            drawable.setCallback(callback);
        }
    }

    public final boolean canApplyTheme() {
        return this.f17900b.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21226d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f17906h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            k.b$c r0 = r9.f17900b
            int r0 = r0.f17946z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f17903e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f17902d
            if (r0 == 0) goto L_0x0029
            r9.f17903e = r0
            k.b$c r0 = r9.f17900b
            int r0 = r0.f17946z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f17910l = r0
            goto L_0x0035
        L_0x0029:
            r9.f17903e = r4
            r9.f17910l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f17902d
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            k.b$c r0 = r9.f17900b
            int r1 = r0.f17928h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo21264d(r10)
            r9.f17902d = r0
            r9.f17906h = r10
            if (r0 == 0) goto L_0x005a
            k.b$c r10 = r9.f17900b
            int r10 = r10.f17945y
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f17909k = r2
        L_0x0051:
            r9.mo21224c(r0)
            goto L_0x005a
        L_0x0055:
            r9.f17902d = r4
            r10 = -1
            r9.f17906h = r10
        L_0x005a:
            long r0 = r9.f17909k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f17910l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x007c
        L_0x0067:
            k.b$a r0 = r9.f17908j
            if (r0 != 0) goto L_0x0076
            k.b$a r0 = new k.b$a
            r1 = r9
            k.e r1 = (p139k.C5443e) r1
            r0.<init>(r1)
            r9.f17908j = r0
            goto L_0x0079
        L_0x0076:
            r9.unscheduleSelf(r0)
        L_0x0079:
            r9.mo21222a(r10)
        L_0x007c:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p139k.C5437b.mo21226d(int):boolean");
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f17902d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f17903e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo21208e(C5440c cVar) {
        throw null;
    }

    public final int getAlpha() {
        return this.f17904f;
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C5440c cVar = this.f17900b;
        return changingConfigurations | cVar.f17925e | cVar.f17924d;
    }

    public final Drawable.ConstantState getConstantState() {
        C5440c cVar = this.f17900b;
        boolean z = false;
        if (!cVar.f17941u) {
            cVar.mo21262c();
            cVar.f17941u = true;
            int i = cVar.f17928h;
            Drawable[] drawableArr = cVar.f17927g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    cVar.f17942v = true;
                    z = true;
                    break;
                } else if (drawableArr[i2].getConstantState() == null) {
                    cVar.f17942v = false;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            z = cVar.f17942v;
        }
        if (!z) {
            return null;
        }
        this.f17900b.f17924d = getChangingConfigurations();
        return this.f17900b;
    }

    public final Drawable getCurrent() {
        return this.f17902d;
    }

    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f17901c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public final int getIntrinsicHeight() {
        C5440c cVar = this.f17900b;
        if (cVar.f17932l) {
            if (!cVar.f17933m) {
                cVar.mo21261b();
            }
            return cVar.f17935o;
        }
        Drawable drawable = this.f17902d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        C5440c cVar = this.f17900b;
        if (cVar.f17932l) {
            if (!cVar.f17933m) {
                cVar.mo21261b();
            }
            return cVar.f17934n;
        }
        Drawable drawable = this.f17902d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public final int getMinimumHeight() {
        C5440c cVar = this.f17900b;
        if (cVar.f17932l) {
            if (!cVar.f17933m) {
                cVar.mo21261b();
            }
            return cVar.f17937q;
        }
        Drawable drawable = this.f17902d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public final int getMinimumWidth() {
        C5440c cVar = this.f17900b;
        if (cVar.f17932l) {
            if (!cVar.f17933m) {
                cVar.mo21261b();
            }
            return cVar.f17936p;
        }
        Drawable drawable = this.f17902d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public final int getOpacity() {
        Drawable drawable = this.f17902d;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C5440c cVar = this.f17900b;
        if (cVar.f17938r) {
            return cVar.f17939s;
        }
        cVar.mo21262c();
        int i2 = cVar.f17928h;
        Drawable[] drawableArr = cVar.f17927g;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        cVar.f17939s = i;
        cVar.f17938r = true;
        return i;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable = this.f17902d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public final boolean getPadding(Rect rect) {
        boolean z;
        C5440c cVar = this.f17900b;
        Rect rect2 = null;
        boolean z2 = true;
        if (!cVar.f17929i) {
            Rect rect3 = cVar.f17931k;
            if (rect3 != null || cVar.f17930j) {
                rect2 = rect3;
            } else {
                cVar.mo21262c();
                Rect rect4 = new Rect();
                int i = cVar.f17928h;
                Drawable[] drawableArr = cVar.f17927g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.f17930j = true;
                cVar.f17931k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            Drawable drawable = this.f17902d;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (!this.f17900b.f17914A || C5450a.m13599b(this) != 1) {
            z2 = false;
        }
        if (z2) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    public final void invalidateDrawable(Drawable drawable) {
        C5440c cVar = this.f17900b;
        if (cVar != null) {
            cVar.f17938r = false;
            cVar.f17940t = false;
        }
        if (drawable == this.f17902d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final boolean isAutoMirrored() {
        return this.f17900b.f17914A;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f17903e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f17903e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f17902d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f17905g) {
                this.f17902d.setAlpha(this.f17904f);
            }
        }
        if (this.f17910l != 0) {
            this.f17910l = 0;
            z = true;
        }
        if (this.f17909k != 0) {
            this.f17909k = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f17907i && super.mutate() == this) {
            C5440c b = mo21207b();
            b.mo21216e();
            mo21208e(b);
            this.f17907i = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17903e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f17902d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean z;
        C5440c cVar = this.f17900b;
        int i2 = this.f17906h;
        int i3 = cVar.f17928h;
        Drawable[] drawableArr = cVar.f17927g;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = C5450a.m13600c(drawable, i);
                } else {
                    z = false;
                }
                if (i4 == i2) {
                    z2 = z;
                }
            }
        }
        cVar.f17944x = i;
        return z2;
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f17903e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f17902d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17903e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f17902d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f17902d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (!this.f17905g || this.f17904f != i) {
            this.f17905g = true;
            this.f17904f = i;
            Drawable drawable = this.f17902d;
            if (drawable == null) {
                return;
            }
            if (this.f17909k == 0) {
                drawable.setAlpha(i);
            } else {
                mo21222a(false);
            }
        }
    }

    public final void setAutoMirrored(boolean z) {
        C5440c cVar = this.f17900b;
        if (cVar.f17914A != z) {
            cVar.f17914A = z;
            Drawable drawable = this.f17902d;
            if (drawable != null) {
                C5450a.C5451a.m13609e(drawable, z);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C5440c cVar = this.f17900b;
        cVar.f17916C = true;
        if (cVar.f17915B != colorFilter) {
            cVar.f17915B = colorFilter;
            Drawable drawable = this.f17902d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public final void setDither(boolean z) {
        C5440c cVar = this.f17900b;
        if (cVar.f17943w != z) {
            cVar.f17943w = z;
            Drawable drawable = this.f17902d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f17902d;
        if (drawable != null) {
            C5450a.C5452b.m13614e(drawable, f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f17901c;
        if (rect == null) {
            this.f17901c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f17902d;
        if (drawable != null) {
            C5450a.C5452b.m13615f(drawable, i, i2, i3, i4);
        }
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void setTintList(ColorStateList colorStateList) {
        C5440c cVar = this.f17900b;
        cVar.f17919F = true;
        if (cVar.f17917D != colorStateList) {
            cVar.f17917D = colorStateList;
            C5450a.m13602e(this.f17902d, colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        C5440c cVar = this.f17900b;
        cVar.f17920G = true;
        if (cVar.f17918E != mode) {
            cVar.f17918E = mode;
            C5450a.m13603f(this.f17902d, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f17903e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f17902d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f17902d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
