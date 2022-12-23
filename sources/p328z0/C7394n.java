package p328z0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import p066e0.C4436j0;
import p279v0.C6817a;
import p279v0.C6819b;
import p279v0.C6821c;
import p279v0.C6831j;
import p317y0.C7236a;
import p317y0.C7239c;
import p317y0.C7253d;
import p317y0.C7269e;

/* renamed from: z0.n */
public final class C7394n {

    /* renamed from: A */
    public C7390k[] f22717A;

    /* renamed from: B */
    public int f22718B = -1;

    /* renamed from: C */
    public int f22719C = -1;

    /* renamed from: D */
    public View f22720D = null;

    /* renamed from: E */
    public int f22721E = -1;

    /* renamed from: F */
    public float f22722F = Float.NaN;

    /* renamed from: G */
    public Interpolator f22723G = null;

    /* renamed from: H */
    public boolean f22724H = false;

    /* renamed from: a */
    public Rect f22725a = new Rect();

    /* renamed from: b */
    public View f22726b;

    /* renamed from: c */
    public int f22727c;

    /* renamed from: d */
    public boolean f22728d = false;

    /* renamed from: e */
    public int f22729e = -1;

    /* renamed from: f */
    public C7396p f22730f = new C7396p();

    /* renamed from: g */
    public C7396p f22731g = new C7396p();

    /* renamed from: h */
    public C7392l f22732h = new C7392l();

    /* renamed from: i */
    public C7392l f22733i = new C7392l();

    /* renamed from: j */
    public C6819b[] f22734j;

    /* renamed from: k */
    public C6817a f22735k;

    /* renamed from: l */
    public float f22736l = Float.NaN;

    /* renamed from: m */
    public float f22737m = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: n */
    public float f22738n = 1.0f;

    /* renamed from: o */
    public int[] f22739o;

    /* renamed from: p */
    public double[] f22740p;

    /* renamed from: q */
    public double[] f22741q;

    /* renamed from: r */
    public String[] f22742r;

    /* renamed from: s */
    public int[] f22743s;

    /* renamed from: t */
    public float[] f22744t = new float[4];

    /* renamed from: u */
    public ArrayList<C7396p> f22745u = new ArrayList<>();

    /* renamed from: v */
    public float[] f22746v = new float[1];

    /* renamed from: w */
    public ArrayList<C7379d> f22747w = new ArrayList<>();

    /* renamed from: x */
    public HashMap<String, C7269e> f22748x;

    /* renamed from: y */
    public HashMap<String, C7253d> f22749y;

    /* renamed from: z */
    public HashMap<String, C7239c> f22750z;

    public C7394n(View view) {
        this.f22726b = view;
        this.f22727c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getClass();
        }
    }

    /* renamed from: g */
    public static void m17033g(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        } else if (i == 4) {
            int i7 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
            rect2.top = (i7 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        }
    }

    /* renamed from: a */
    public final void mo23619a(C7379d dVar) {
        this.f22747w.add(dVar);
    }

    /* renamed from: b */
    public final float mo23620b(float[] fArr, float f) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f22738n;
            if (((double) f4) != 1.0d) {
                float f5 = this.f22737m;
                if (f < f5) {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                if (f > f5 && ((double) f) < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        C6821c cVar = this.f22730f.f22752b;
        float f6 = Float.NaN;
        Iterator<C7396p> it = this.f22745u.iterator();
        while (it.hasNext()) {
            C7396p next = it.next();
            C6821c cVar2 = next.f22752b;
            if (cVar2 != null) {
                float f7 = next.f22754d;
                if (f7 < f) {
                    cVar = cVar2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.f22754d;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (double) ((f - f2) / f8);
            f = (((float) cVar.mo23049a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.mo23050b(d);
            }
        }
        return f;
    }

    /* renamed from: c */
    public final void mo23621c(double d, float[] fArr, float[] fArr2) {
        double d2 = d;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f22734j[0].mo23037c(d2, dArr);
        this.f22734j[0].mo23040f(d2, dArr2);
        float f = BitmapDescriptorFactory.HUE_RED;
        Arrays.fill(fArr2, BitmapDescriptorFactory.HUE_RED);
        C7396p pVar = this.f22730f;
        int[] iArr = this.f22739o;
        float f2 = pVar.f22756f;
        float f3 = pVar.f22757g;
        float f4 = pVar.f22758h;
        float f5 = pVar.f22759i;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        float f7 = BitmapDescriptorFactory.HUE_RED;
        float f8 = BitmapDescriptorFactory.HUE_RED;
        while (i < iArr.length) {
            float f9 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f9;
                f = f11;
            } else if (i2 == 2) {
                f3 = f9;
                f6 = f11;
            } else if (i2 == 3) {
                f4 = f9;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f9;
                f8 = f11;
            }
            i++;
            double d3 = d;
            float[] fArr3 = fArr2;
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f;
        float f14 = (f8 / 2.0f) + f6;
        C7394n nVar = pVar.f22764n;
        if (nVar != null) {
            float[] fArr4 = new float[2];
            float[] fArr5 = new float[2];
            nVar.mo23621c(d, fArr4, fArr5);
            float f15 = fArr4[0];
            float f16 = fArr4[1];
            float f17 = fArr5[0];
            float f18 = fArr5[1];
            double d4 = (double) f2;
            double d5 = (double) f3;
            float cos = (float) ((((double) f16) - (Math.cos(d5) * d4)) - ((double) (f5 / 2.0f)));
            double d6 = (double) f17;
            double d7 = (double) f;
            double sin = (Math.sin(d5) * d7) + d6;
            double d8 = (double) f6;
            f14 = (float) ((Math.sin(d5) * d8) + (((double) f18) - (Math.cos(d5) * d7)));
            f3 = cos;
            f13 = (float) ((Math.cos(d5) * d8) + sin);
            f2 = (float) (((Math.sin(d5) * d4) + ((double) f15)) - ((double) (f4 / 2.0f)));
            f12 = 2.0f;
        }
        fArr[0] = (f4 / f12) + f2 + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (f5 / f12) + f3 + BitmapDescriptorFactory.HUE_RED;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* renamed from: d */
    public final void mo23622d(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float b = mo23620b(this.f22746v, f);
        C6819b[] bVarArr = this.f22734j;
        int i = 0;
        if (bVarArr != null) {
            double d = (double) b;
            bVarArr[0].mo23040f(d, this.f22741q);
            this.f22734j[0].mo23037c(d, this.f22740p);
            float f4 = this.f22746v[0];
            while (true) {
                dArr = this.f22741q;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            C6817a aVar = this.f22735k;
            if (aVar != null) {
                double[] dArr2 = this.f22740p;
                if (dArr2.length > 0) {
                    aVar.mo23037c(d, dArr2);
                    this.f22735k.mo23040f(d, this.f22741q);
                    C7396p pVar = this.f22730f;
                    int[] iArr = this.f22739o;
                    double[] dArr3 = this.f22741q;
                    double[] dArr4 = this.f22740p;
                    pVar.getClass();
                    C7396p.m17043e(f2, f3, fArr, iArr, dArr3, dArr4);
                    return;
                }
                return;
            }
            C7396p pVar2 = this.f22730f;
            int[] iArr2 = this.f22739o;
            double[] dArr5 = this.f22740p;
            pVar2.getClass();
            C7396p.m17043e(f2, f3, fArr, iArr2, dArr, dArr5);
            return;
        }
        C7396p pVar3 = this.f22731g;
        float f5 = pVar3.f22756f;
        C7396p pVar4 = this.f22730f;
        float f6 = f5 - pVar4.f22756f;
        float f7 = pVar3.f22757g - pVar4.f22757g;
        fArr[0] = (((pVar3.f22758h - pVar4.f22758h) + f6) * f2) + ((1.0f - f2) * f6);
        fArr[1] = (((pVar3.f22759i - pVar4.f22759i) + f7) * f3) + ((1.0f - f3) * f7);
    }

    /* renamed from: e */
    public final boolean mo23623e(float f, long j, View view, C4436j0 j0Var) {
        boolean z;
        C7269e.C7273d dVar;
        boolean z2;
        float f2;
        boolean z3;
        double d;
        float f3;
        C7269e.C7273d dVar2;
        float f4;
        float f5;
        boolean z4;
        boolean z5;
        float f6;
        View view2 = view;
        float b = mo23620b((float[]) null, f);
        int i = this.f22721E;
        if (i != -1) {
            float f7 = 1.0f / ((float) i);
            float floor = ((float) Math.floor((double) (b / f7))) * f7;
            float f8 = (b % f7) / f7;
            if (!Float.isNaN(this.f22722F)) {
                f8 = (f8 + this.f22722F) % 1.0f;
            }
            Interpolator interpolator = this.f22723G;
            if (interpolator != null) {
                f6 = interpolator.getInterpolation(f8);
            } else if (((double) f8) > 0.5d) {
                f6 = 1.0f;
            } else {
                f6 = BitmapDescriptorFactory.HUE_RED;
            }
            b = (f6 * f7) + floor;
        }
        float f9 = b;
        HashMap<String, C7253d> hashMap = this.f22749y;
        if (hashMap != null) {
            for (C7253d d2 : hashMap.values()) {
                d2.mo23543d(view2, f9);
            }
        }
        HashMap<String, C7269e> hashMap2 = this.f22748x;
        if (hashMap2 != null) {
            dVar = null;
            z = false;
            for (C7269e next : hashMap2.values()) {
                if (next instanceof C7269e.C7273d) {
                    dVar = (C7269e.C7273d) next;
                } else {
                    z |= next.mo23545e(f9, j, view, j0Var);
                }
            }
        } else {
            z = false;
            dVar = null;
        }
        C6819b[] bVarArr = this.f22734j;
        if (bVarArr != null) {
            double d3 = (double) f9;
            bVarArr[0].mo23037c(d3, this.f22740p);
            this.f22734j[0].mo23040f(d3, this.f22741q);
            C6817a aVar = this.f22735k;
            if (aVar != null) {
                double[] dArr = this.f22740p;
                if (dArr.length > 0) {
                    aVar.mo23037c(d3, dArr);
                    this.f22735k.mo23040f(d3, this.f22741q);
                }
            }
            if (!this.f22724H) {
                C7396p pVar = this.f22730f;
                int[] iArr = this.f22739o;
                double[] dArr2 = this.f22740p;
                double[] dArr3 = this.f22741q;
                boolean z6 = this.f22728d;
                float f11 = pVar.f22756f;
                float f12 = pVar.f22757g;
                float f13 = pVar.f22758h;
                float f14 = pVar.f22759i;
                float f15 = f11;
                if (iArr.length != 0) {
                    f5 = f12;
                    if (pVar.f22767q.length <= iArr[iArr.length - 1]) {
                        int i2 = iArr[iArr.length - 1] + 1;
                        pVar.f22767q = new double[i2];
                        pVar.f22768r = new double[i2];
                    }
                } else {
                    f5 = f12;
                }
                float f16 = f13;
                Arrays.fill(pVar.f22767q, Double.NaN);
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    double[] dArr4 = pVar.f22767q;
                    int i4 = iArr[i3];
                    dArr4[i4] = dArr2[i3];
                    pVar.f22768r[i4] = dArr3[i3];
                }
                float f17 = Float.NaN;
                float f18 = BitmapDescriptorFactory.HUE_RED;
                int i5 = 0;
                float f19 = f15;
                dVar2 = dVar;
                z3 = z;
                float f21 = f14;
                float f22 = f5;
                float f23 = BitmapDescriptorFactory.HUE_RED;
                float f24 = BitmapDescriptorFactory.HUE_RED;
                float f25 = BitmapDescriptorFactory.HUE_RED;
                while (true) {
                    double[] dArr5 = pVar.f22767q;
                    f3 = f9;
                    if (i5 >= dArr5.length) {
                        break;
                    }
                    if (!Double.isNaN(dArr5[i5])) {
                        double d4 = 0.0d;
                        if (!Double.isNaN(pVar.f22767q[i5])) {
                            d4 = pVar.f22767q[i5] + 0.0d;
                        }
                        float f26 = (float) d4;
                        float f27 = (float) pVar.f22768r[i5];
                        if (i5 == 1) {
                            f18 = f27;
                            f19 = f26;
                        } else if (i5 == 2) {
                            f23 = f27;
                            f22 = f26;
                        } else if (i5 == 3) {
                            f24 = f27;
                            f16 = f26;
                        } else if (i5 == 4) {
                            f25 = f27;
                            f21 = f26;
                        } else if (i5 == 5) {
                            f17 = f26;
                        }
                    }
                    i5++;
                    View view3 = view;
                    f9 = f3;
                }
                C7394n nVar = pVar.f22764n;
                if (nVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar.mo23621c(d3, fArr, fArr2);
                    float f28 = fArr[0];
                    float f29 = fArr[1];
                    float f31 = fArr2[0];
                    float f32 = fArr2[1];
                    d = d3;
                    double d5 = (double) f28;
                    double d6 = (double) f19;
                    double d7 = (double) f22;
                    double[] dArr6 = dArr3;
                    z4 = z6;
                    double d8 = (double) f31;
                    float cos = (float) ((((double) f29) - (Math.cos(d7) * d6)) - ((double) (f21 / 2.0f)));
                    double d9 = (double) f18;
                    double sin = (Math.sin(d7) * d9) + d8;
                    float sin2 = (float) (((Math.sin(d7) * d6) + d5) - ((double) (f16 / 2.0f)));
                    double d11 = (double) f23;
                    float cos2 = (float) ((Math.cos(d7) * d6 * d11) + sin);
                    float sin3 = (float) ((Math.sin(d7) * d6 * d11) + (((double) f32) - (Math.cos(d7) * d9)));
                    double[] dArr7 = dArr6;
                    if (dArr7.length >= 2) {
                        dArr7[0] = (double) cos2;
                        dArr7[1] = (double) sin3;
                    }
                    if (!Float.isNaN(f17)) {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((double) sin3, (double) cos2)) + ((double) f17)));
                    } else {
                        view2 = view;
                    }
                    f22 = cos;
                    f19 = sin2;
                } else {
                    view2 = view;
                    z4 = z6;
                    d = d3;
                    if (!Float.isNaN(f17)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((double) ((f25 / 2.0f) + f23), (double) ((f24 / 2.0f) + f18))) + ((double) f17) + ((double) BitmapDescriptorFactory.HUE_RED)));
                    }
                }
                if (view2 instanceof C7378c) {
                    ((C7378c) view2).mo3099a(f19, f22, f16 + f19, f22 + f21);
                } else {
                    float f33 = f19 + 0.5f;
                    int i6 = (int) f33;
                    float f34 = f22 + 0.5f;
                    int i7 = (int) f34;
                    int i8 = (int) (f33 + f16);
                    int i9 = (int) (f34 + f21);
                    int i11 = i8 - i6;
                    int i12 = i9 - i7;
                    if (i11 == view.getMeasuredWidth() && i12 == view.getMeasuredHeight()) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z5 || z4) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view2.layout(i6, i7, i8, i9);
                }
                this.f22728d = false;
            } else {
                f3 = f9;
                dVar2 = dVar;
                z3 = z;
                d = d3;
            }
            if (this.f22719C != -1) {
                if (this.f22720D == null) {
                    this.f22720D = ((View) view.getParent()).findViewById(this.f22719C);
                }
                View view4 = this.f22720D;
                if (view4 != null) {
                    float bottom = ((float) (this.f22720D.getBottom() + view4.getTop())) / 2.0f;
                    float right = ((float) (this.f22720D.getRight() + this.f22720D.getLeft())) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view2.setPivotX(right - ((float) view.getLeft()));
                        view2.setPivotY(bottom - ((float) view.getTop()));
                    }
                }
            }
            HashMap<String, C7253d> hashMap3 = this.f22749y;
            if (hashMap3 != null) {
                for (C6831j next2 : hashMap3.values()) {
                    if (next2 instanceof C7253d.C7257d) {
                        double[] dArr8 = this.f22741q;
                        if (dArr8.length > 1) {
                            f4 = f3;
                            view2.setRotation(((C7253d.C7257d) next2).mo23064a(f4) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                            f3 = f4;
                        }
                    }
                    f4 = f3;
                    f3 = f4;
                }
            }
            f2 = f3;
            if (dVar2 != null) {
                double[] dArr9 = this.f22741q;
                view2.setRotation(dVar2.mo23544d(f2, j, view, j0Var) + ((float) Math.toDegrees(Math.atan2(dArr9[1], dArr9[0]))));
                z2 = z3 | dVar2.f21172h;
            } else {
                z2 = z3;
            }
            int i13 = 1;
            while (true) {
                C6819b[] bVarArr2 = this.f22734j;
                if (i13 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i13].mo23038d(d, this.f22744t);
                C7236a.m16831b(this.f22730f.f22765o.get(this.f22742r[i13 - 1]), view2, this.f22744t);
                i13++;
            }
            C7392l lVar = this.f22732h;
            if (lVar.f22700c == 0) {
                if (f2 <= BitmapDescriptorFactory.HUE_RED) {
                    view2.setVisibility(lVar.f22701d);
                } else if (f2 >= 1.0f) {
                    view2.setVisibility(this.f22733i.f22701d);
                } else if (this.f22733i.f22701d != lVar.f22701d) {
                    view2.setVisibility(0);
                }
            }
            if (this.f22717A != null) {
                int i14 = 0;
                while (true) {
                    C7390k[] kVarArr = this.f22717A;
                    if (i14 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i14].mo23612h(view2, f2);
                    i14++;
                }
            }
        } else {
            f2 = f9;
            boolean z7 = z;
            C7396p pVar2 = this.f22730f;
            float f35 = pVar2.f22756f;
            C7396p pVar3 = this.f22731g;
            float c = C16759e.m42347c(pVar3.f22756f, f35, f2, f35);
            float f36 = pVar2.f22757g;
            float c2 = C16759e.m42347c(pVar3.f22757g, f36, f2, f36);
            float f37 = pVar2.f22758h;
            float f38 = pVar3.f22758h;
            float c3 = C16759e.m42347c(f38, f37, f2, f37);
            float f39 = pVar2.f22759i;
            float f41 = pVar3.f22759i;
            float f42 = c + 0.5f;
            int i15 = (int) f42;
            float f43 = c2 + 0.5f;
            int i16 = (int) f43;
            int i17 = (int) (f42 + c3);
            int c4 = (int) (f43 + C16759e.m42347c(f41, f39, f2, f39));
            int i18 = i17 - i15;
            int i19 = c4 - i16;
            if (!(f38 == f37 && f41 == f39 && !this.f22728d)) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f22728d = false;
            }
            view2.layout(i15, i16, i17, c4);
            z2 = z7;
        }
        HashMap<String, C7239c> hashMap4 = this.f22750z;
        if (hashMap4 != null) {
            for (C7239c next3 : hashMap4.values()) {
                if (next3 instanceof C7239c.C7243d) {
                    double[] dArr10 = this.f22741q;
                    view2.setRotation(((C7239c.C7243d) next3).mo23055a(f2) + ((float) Math.toDegrees(Math.atan2(dArr10[1], dArr10[0]))));
                } else {
                    next3.mo23542e(view2, f2);
                }
            }
        }
        return z2;
    }

    /* renamed from: f */
    public final void mo23624f(C7396p pVar) {
        pVar.mo23630d((float) ((int) this.f22726b.getX()), (float) ((int) this.f22726b.getY()), (float) this.f22726b.getWidth(), (float) this.f22726b.getHeight());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0273, code lost:
        r12 = r18;
        r5 = r19;
        r2 = r29;
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027b, code lost:
        r19 = r13;
        r18 = r17;
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0281, code lost:
        r21 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0283, code lost:
        r7 = r20;
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0287, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x038f, code lost:
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0479, code lost:
        r21 = r7;
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04fe, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0500, code lost:
        switch(r16) {
            case 0: goto L_0x0561;
            case 1: goto L_0x055b;
            case 2: goto L_0x0555;
            case 3: goto L_0x054f;
            case 4: goto L_0x0549;
            case 5: goto L_0x0543;
            case 6: goto L_0x053d;
            case 7: goto L_0x0537;
            case 8: goto L_0x0531;
            case 9: goto L_0x052b;
            case 10: goto L_0x0525;
            case 11: goto L_0x051f;
            case 12: goto L_0x0519;
            case 13: goto L_0x0513;
            case 14: goto L_0x050d;
            case 15: goto L_0x0507;
            default: goto L_0x0503;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0503, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0507, code lost:
        r16 = new p317y0.C7253d.C7254a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x050d, code lost:
        r16 = new p317y0.C7253d.C7254a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0513, code lost:
        r16 = new p317y0.C7253d.C7257d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0519, code lost:
        r16 = new p317y0.C7253d.C7256c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x051f, code lost:
        r16 = new p317y0.C7253d.C7261h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0525, code lost:
        r16 = new p317y0.C7253d.C7259f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x052b, code lost:
        r16 = new p317y0.C7253d.C7258e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0531, code lost:
        r16 = new p317y0.C7253d.C7254a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0537, code lost:
        r16 = new p317y0.C7253d.C7265l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x053d, code lost:
        r16 = new p317y0.C7253d.C7264k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0543, code lost:
        r16 = new p317y0.C7253d.C7260g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0549, code lost:
        r16 = new p317y0.C7253d.C7268o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x054f, code lost:
        r16 = new p317y0.C7253d.C7267n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0555, code lost:
        r16 = new p317y0.C7253d.C7266m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x055b, code lost:
        r16 = new p317y0.C7253d.C7263j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0561, code lost:
        r16 = new p317y0.C7253d.C7262i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0566, code lost:
        r17 = r6;
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0617, code lost:
        r15 = (java.lang.Integer) r4.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06de, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x06e0, code lost:
        r14 = r17;
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x07b8, code lost:
        r15 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x07b9, code lost:
        switch(r15) {
            case 0: goto L_0x0806;
            case 1: goto L_0x0800;
            case 2: goto L_0x07fa;
            case 3: goto L_0x07f4;
            case 4: goto L_0x07ee;
            case 5: goto L_0x07e8;
            case 6: goto L_0x07e2;
            case 7: goto L_0x07dc;
            case 8: goto L_0x07d6;
            case 9: goto L_0x07d0;
            case 10: goto L_0x07ca;
            case 11: goto L_0x07c4;
            default: goto L_0x07bc;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x07bc, code lost:
        r16 = r13;
        r17 = r14;
        r13 = r37;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x07c4, code lost:
        r15 = new p317y0.C7269e.C7270a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x07ca, code lost:
        r15 = new p317y0.C7269e.C7273d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x07d0, code lost:
        r15 = new p317y0.C7269e.C7272c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x07d6, code lost:
        r15 = new p317y0.C7269e.C7275f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07dc, code lost:
        r15 = new p317y0.C7269e.C7279j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x07e2, code lost:
        r15 = new p317y0.C7269e.C7278i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07e8, code lost:
        r15 = new p317y0.C7269e.C7274e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07ee, code lost:
        r15 = new p317y0.C7269e.C7282m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07f4, code lost:
        r15 = new p317y0.C7269e.C7281l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x07fa, code lost:
        r15 = new p317y0.C7269e.C7280k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0800, code lost:
        r15 = new p317y0.C7269e.C7277h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0806, code lost:
        r15 = new p317y0.C7269e.C7276g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x080b, code lost:
        r16 = r13;
        r17 = r14;
        r15.f21173i = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x08ef, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x099c, code lost:
        r7 = r17;
        r4 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x09c8, code lost:
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x09c9, code lost:
        switch(r6) {
            case 0: goto L_0x0b90;
            case 1: goto L_0x0b6a;
            case 2: goto L_0x0b44;
            case 3: goto L_0x0b1d;
            case 4: goto L_0x0af6;
            case 5: goto L_0x0acf;
            case 6: goto L_0x0aa8;
            case 7: goto L_0x0a81;
            case 8: goto L_0x0a5a;
            case 9: goto L_0x0a33;
            case 10: goto L_0x0a0c;
            case 11: goto L_0x09df;
            default: goto L_0x09cc;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x09cc, code lost:
        r6 = r36;
        r15 = r37;
        r13 = r38;
        r16 = r0;
        r17 = r7;
        r14 = r18;
        r0 = r34;
        r7 = r4;
        r4 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x09df, code lost:
        r13 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x09e7, code lost:
        if (java.lang.Float.isNaN(r13.f22662f) != false) goto L_0x0a06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x09e9, code lost:
        r16 = r7;
        r17 = r4;
        r28.mo23074b(r13.f22607a, r13.f22662f, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0a06, code lost:
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a0c, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0a18, code lost:
        if (java.lang.Float.isNaN(r13.f22667k) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0a1a, code lost:
        r28.mo23074b(r13.f22607a, r13.f22667k, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0a33, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0a3f, code lost:
        if (java.lang.Float.isNaN(r13.f22663g) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0a41, code lost:
        r28.mo23074b(r13.f22607a, r13.f22663g, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0a5a, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0a66, code lost:
        if (java.lang.Float.isNaN(r13.f22664h) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0a68, code lost:
        r28.mo23074b(r13.f22607a, r13.f22664h, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0a81, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0a8d, code lost:
        if (java.lang.Float.isNaN(r13.f22669m) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0a8f, code lost:
        r28.mo23074b(r13.f22607a, r13.f22669m, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0aa8, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0ab4, code lost:
        if (java.lang.Float.isNaN(r13.f22668l) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0ab6, code lost:
        r28.mo23074b(r13.f22607a, r13.f22668l, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0acf, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0adb, code lost:
        if (java.lang.Float.isNaN(r13.f22673q) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0add, code lost:
        r28.mo23074b(r13.f22607a, r13.f22673q, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0af6, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b02, code lost:
        if (java.lang.Float.isNaN(r13.f22672p) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0b04, code lost:
        r28.mo23074b(r13.f22607a, r13.f22672p, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b1d, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b29, code lost:
        if (java.lang.Float.isNaN(r13.f22671o) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0b2b, code lost:
        r28.mo23074b(r13.f22607a, r13.f22671o, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0b44, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0b50, code lost:
        if (java.lang.Float.isNaN(r13.f22670n) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0b52, code lost:
        r28.mo23074b(r13.f22607a, r13.f22670n, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0b6a, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0b76, code lost:
        if (java.lang.Float.isNaN(r13.f22666j) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0b78, code lost:
        r28.mo23074b(r13.f22607a, r13.f22666j, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0b90, code lost:
        r13 = r38;
        r17 = r4;
        r16 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0b9c, code lost:
        if (java.lang.Float.isNaN(r13.f22665i) != false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0b9e, code lost:
        r28.mo23074b(r13.f22607a, r13.f22665i, r13.f22675s, r13.f22674r, r13.f22676t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0fdc, code lost:
        r9 = r21;
        r12 = r23;
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x1046, code lost:
        r35 = r1;
        r1 = r16;
        r15 = r18;
        r14 = r19;
        r9 = r21;
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x1052, code lost:
        r11 = r25;
        r7 = r26;
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x10e7, code lost:
        r35 = r1;
        r1 = r16;
        r15 = r18;
        r14 = r19;
        r12 = r23;
        r11 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x10f3, code lost:
        r13 = r29;
        r10 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x114b, code lost:
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x1175, code lost:
        r13 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x119f, code lost:
        r35 = r1;
        r1 = r16;
        r15 = r18;
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x11df, code lost:
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x1203, code lost:
        r18 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x1267, code lost:
        r16 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x1269, code lost:
        switch(r16) {
            case 0: goto L_0x12c1;
            case 1: goto L_0x12bb;
            case 2: goto L_0x12b5;
            case 3: goto L_0x12af;
            case 4: goto L_0x12a9;
            case 5: goto L_0x12a3;
            case 6: goto L_0x129d;
            case 7: goto L_0x1297;
            case 8: goto L_0x1291;
            case 9: goto L_0x128b;
            case 10: goto L_0x1285;
            case 11: goto L_0x127f;
            case 12: goto L_0x1279;
            case 13: goto L_0x1273;
            default: goto L_0x126c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x126c, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x126e, code lost:
        r17 = r1;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x1273, code lost:
        r16 = new p317y0.C7239c.C7240a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x1279, code lost:
        r16 = new p317y0.C7239c.C7240a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x127f, code lost:
        r16 = new p317y0.C7239c.C7243d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x1285, code lost:
        r16 = new p317y0.C7239c.C7242c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x128b, code lost:
        r16 = new p317y0.C7239c.C7245f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x1291, code lost:
        r16 = new p317y0.C7239c.C7240a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x1297, code lost:
        r16 = new p317y0.C7239c.C7249j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x129d, code lost:
        r16 = new p317y0.C7239c.C7248i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x12a3, code lost:
        r16 = new p317y0.C7239c.C7244e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x12a9, code lost:
        r16 = new p317y0.C7239c.C7252m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x12af, code lost:
        r16 = new p317y0.C7239c.C7251l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x12b5, code lost:
        r16 = new p317y0.C7239c.C7250k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x12bb, code lost:
        r16 = new p317y0.C7239c.C7247h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x12c1, code lost:
        r16 = new p317y0.C7239c.C7246g();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23625h(int r35, int r36, long r37) {
        /*
            r34 = this;
            r0 = r34
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r0.f22718B
            r6 = -1
            if (r5 == r6) goto L_0x0024
            z0.p r6 = r0.f22730f
            r6.f22761k = r5
        L_0x0024:
            z0.l r5 = r0.f22732h
            z0.l r6 = r0.f22733i
            float r7 = r5.f22699b
            float r8 = r6.f22699b
            boolean r7 = p328z0.C7392l.m17029c(r7, r8)
            java.lang.String r8 = "alpha"
            if (r7 == 0) goto L_0x0037
            r2.add(r8)
        L_0x0037:
            float r7 = r5.f22702e
            float r9 = r6.f22702e
            boolean r7 = p328z0.C7392l.m17029c(r7, r9)
            java.lang.String r9 = "elevation"
            if (r7 == 0) goto L_0x0046
            r2.add(r9)
        L_0x0046:
            int r7 = r5.f22701d
            int r10 = r6.f22701d
            if (r7 == r10) goto L_0x0057
            int r11 = r5.f22700c
            if (r11 != 0) goto L_0x0057
            if (r7 == 0) goto L_0x0054
            if (r10 != 0) goto L_0x0057
        L_0x0054:
            r2.add(r8)
        L_0x0057:
            float r7 = r5.f22703f
            float r10 = r6.f22703f
            boolean r7 = p328z0.C7392l.m17029c(r7, r10)
            java.lang.String r10 = "rotation"
            if (r7 == 0) goto L_0x0066
            r2.add(r10)
        L_0x0066:
            float r7 = r5.f22713p
            boolean r7 = java.lang.Float.isNaN(r7)
            java.lang.String r11 = "transitionPathRotate"
            if (r7 == 0) goto L_0x0079
            float r7 = r6.f22713p
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto L_0x007c
        L_0x0079:
            r2.add(r11)
        L_0x007c:
            float r7 = r5.f22714q
            boolean r7 = java.lang.Float.isNaN(r7)
            java.lang.String r12 = "progress"
            if (r7 == 0) goto L_0x008e
            float r7 = r6.f22714q
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 != 0) goto L_0x0091
        L_0x008e:
            r2.add(r12)
        L_0x0091:
            float r7 = r5.f22704g
            float r13 = r6.f22704g
            boolean r7 = p328z0.C7392l.m17029c(r7, r13)
            java.lang.String r13 = "rotationX"
            if (r7 == 0) goto L_0x00a0
            r2.add(r13)
        L_0x00a0:
            float r7 = r5.f22705h
            float r14 = r6.f22705h
            boolean r7 = p328z0.C7392l.m17029c(r7, r14)
            java.lang.String r14 = "rotationY"
            if (r7 == 0) goto L_0x00af
            r2.add(r14)
        L_0x00af:
            float r7 = r5.f22708k
            float r15 = r6.f22708k
            boolean r7 = p328z0.C7392l.m17029c(r7, r15)
            java.lang.String r15 = "transformPivotX"
            if (r7 == 0) goto L_0x00bf
            r2.add(r15)
        L_0x00bf:
            float r7 = r5.f22709l
            r16 = r13
            float r13 = r6.f22709l
            boolean r7 = p328z0.C7392l.m17029c(r7, r13)
            java.lang.String r13 = "transformPivotY"
            if (r7 == 0) goto L_0x00d1
            r2.add(r13)
        L_0x00d1:
            float r7 = r5.f22706i
            r17 = r14
            float r14 = r6.f22706i
            boolean r7 = p328z0.C7392l.m17029c(r7, r14)
            java.lang.String r14 = "scaleX"
            if (r7 == 0) goto L_0x00e2
            r2.add(r14)
        L_0x00e2:
            float r7 = r5.f22707j
            r18 = r12
            float r12 = r6.f22707j
            boolean r7 = p328z0.C7392l.m17029c(r7, r12)
            java.lang.String r12 = "scaleY"
            if (r7 == 0) goto L_0x00f3
            r2.add(r12)
        L_0x00f3:
            float r7 = r5.f22710m
            r19 = r14
            float r14 = r6.f22710m
            boolean r7 = p328z0.C7392l.m17029c(r7, r14)
            java.lang.String r14 = "translationX"
            if (r7 == 0) goto L_0x0105
            r2.add(r14)
        L_0x0105:
            float r7 = r5.f22711n
            r20 = r14
            float r14 = r6.f22711n
            boolean r7 = p328z0.C7392l.m17029c(r7, r14)
            java.lang.String r14 = "translationY"
            if (r7 == 0) goto L_0x0117
            r2.add(r14)
        L_0x0117:
            float r5 = r5.f22712o
            float r6 = r6.f22712o
            boolean r5 = p328z0.C7392l.m17029c(r5, r6)
            java.lang.String r6 = "translationZ"
            if (r5 == 0) goto L_0x0127
            r2.add(r6)
        L_0x0127:
            java.util.ArrayList<z0.d> r5 = r0.f22747w
            if (r5 == 0) goto L_0x01b9
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L_0x0130:
            boolean r21 = r5.hasNext()
            if (r21 == 0) goto L_0x01b0
            java.lang.Object r21 = r5.next()
            r22 = r5
            r5 = r21
            z0.d r5 = (p328z0.C7379d) r5
            r21 = r14
            boolean r14 = r5 instanceof p328z0.C7385h
            if (r14 == 0) goto L_0x0178
            z0.h r5 = (p328z0.C7385h) r5
            z0.p r14 = new z0.p
            r29 = r6
            z0.p r6 = r0.f22730f
            r30 = r12
            z0.p r12 = r0.f22731g
            r23 = r14
            r24 = r35
            r25 = r36
            r26 = r5
            r27 = r6
            r28 = r12
            r23.<init>(r24, r25, r26, r27, r28)
            java.util.ArrayList<z0.p> r6 = r0.f22745u
            int r6 = java.util.Collections.binarySearch(r6, r14)
            java.util.ArrayList<z0.p> r12 = r0.f22745u
            int r6 = -r6
            r23 = r15
            r15 = -1
            int r6 = r6 + r15
            r12.add(r6, r14)
            int r5 = r5.f22660e
            if (r5 == r15) goto L_0x01a5
            r0.f22729e = r5
            goto L_0x01a5
        L_0x0178:
            r29 = r6
            r30 = r12
            r23 = r15
            boolean r6 = r5 instanceof p328z0.C7382f
            if (r6 == 0) goto L_0x0186
            r5.mo23604d(r3)
            goto L_0x01a5
        L_0x0186:
            boolean r6 = r5 instanceof p328z0.C7388j
            if (r6 == 0) goto L_0x018e
            r5.mo23604d(r1)
            goto L_0x01a5
        L_0x018e:
            boolean r6 = r5 instanceof p328z0.C7390k
            if (r6 == 0) goto L_0x019f
            if (r7 != 0) goto L_0x0199
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0199:
            z0.k r5 = (p328z0.C7390k) r5
            r7.add(r5)
            goto L_0x01a5
        L_0x019f:
            r5.mo23606f(r4)
            r5.mo23604d(r2)
        L_0x01a5:
            r14 = r21
            r5 = r22
            r15 = r23
            r6 = r29
            r12 = r30
            goto L_0x0130
        L_0x01b0:
            r29 = r6
            r30 = r12
            r21 = r14
            r23 = r15
            goto L_0x01c2
        L_0x01b9:
            r29 = r6
            r30 = r12
            r21 = r14
            r23 = r15
            r7 = 0
        L_0x01c2:
            r5 = 0
            if (r7 == 0) goto L_0x01cf
            z0.k[] r5 = new p328z0.C7390k[r5]
            java.lang.Object[] r5 = r7.toArray(r5)
            z0.k[] r5 = (p328z0.C7390k[]) r5
            r0.f22717A = r5
        L_0x01cf:
            boolean r5 = r2.isEmpty()
            java.lang.String r6 = "waveOffset"
            java.lang.String r7 = "waveVariesBy"
            java.lang.String r12 = ","
            java.lang.String r14 = "CUSTOM,"
            r22 = 3
            r24 = 4
            if (r5 != 0) goto L_0x0637
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0.f22749y = r5
            java.util.Iterator r5 = r2.iterator()
        L_0x01ee:
            boolean r25 = r5.hasNext()
            if (r25 == 0) goto L_0x05b2
            java.lang.Object r25 = r5.next()
            r15 = r25
            java.lang.String r15 = (java.lang.String) r15
            boolean r25 = r15.startsWith(r14)
            if (r25 == 0) goto L_0x0264
            r36 = r5
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            java.lang.String[] r25 = r15.split(r12)
            r26 = 1
            r27 = r3
            r3 = r25[r26]
            r25 = r2
            java.util.ArrayList<z0.d> r2 = r0.f22747w
            java.util.Iterator r2 = r2.iterator()
        L_0x021b:
            boolean r26 = r2.hasNext()
            if (r26 == 0) goto L_0x0244
            java.lang.Object r26 = r2.next()
            r28 = r2
            r2 = r26
            z0.d r2 = (p328z0.C7379d) r2
            r26 = r12
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r12 = r2.f22610d
            if (r12 != 0) goto L_0x0232
            goto L_0x023f
        L_0x0232:
            java.lang.Object r12 = r12.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r12 = (androidx.constraintlayout.widget.ConstraintAttribute) r12
            if (r12 == 0) goto L_0x023f
            int r2 = r2.f22607a
            r5.append(r2, r12)
        L_0x023f:
            r12 = r26
            r2 = r28
            goto L_0x021b
        L_0x0244:
            r26 = r12
            y0.d$b r2 = new y0.d$b
            r2.<init>(r15, r5)
            r12 = r18
            r5 = r19
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r17 = r16
            r7 = r20
            r20 = r6
            r6 = r2
            r2 = r29
            goto L_0x056a
        L_0x0264:
            r25 = r2
            r27 = r3
            r36 = r5
            r26 = r12
            int r2 = r15.hashCode()
            switch(r2) {
                case -1249320806: goto L_0x04de;
                case -1249320805: goto L_0x04b7;
                case -1225497657: goto L_0x048f;
                case -1225497656: goto L_0x0467;
                case -1225497655: goto L_0x0443;
                case -1001078227: goto L_0x0411;
                case -908189618: goto L_0x03e0;
                case -908189617: goto L_0x03b1;
                case -797520672: goto L_0x0387;
                case -760884510: goto L_0x0360;
                case -760884509: goto L_0x033c;
                case -40300674: goto L_0x0318;
                case -4379043: goto L_0x02f4;
                case 37232917: goto L_0x02d1;
                case 92909918: goto L_0x02ae;
                case 156108012: goto L_0x028b;
                default: goto L_0x0273;
            }
        L_0x0273:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
        L_0x027b:
            r19 = r13
            r18 = r17
            r13 = r21
        L_0x0281:
            r21 = r7
        L_0x0283:
            r7 = r20
            r20 = r6
        L_0x0287:
            r6 = r16
            goto L_0x04fe
        L_0x028b:
            boolean r2 = r15.equals(r6)
            if (r2 != 0) goto L_0x0292
            goto L_0x0273
        L_0x0292:
            r2 = 15
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 15
            goto L_0x0500
        L_0x02ae:
            boolean r2 = r15.equals(r8)
            if (r2 != 0) goto L_0x02b5
            goto L_0x0273
        L_0x02b5:
            r2 = 14
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 14
            goto L_0x0500
        L_0x02d1:
            boolean r2 = r15.equals(r11)
            if (r2 != 0) goto L_0x02d8
            goto L_0x0273
        L_0x02d8:
            r2 = 13
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 13
            goto L_0x0500
        L_0x02f4:
            boolean r2 = r15.equals(r9)
            if (r2 != 0) goto L_0x02fc
            goto L_0x0273
        L_0x02fc:
            r2 = 12
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 12
            goto L_0x0500
        L_0x0318:
            boolean r2 = r15.equals(r10)
            if (r2 != 0) goto L_0x0320
            goto L_0x0273
        L_0x0320:
            r2 = 11
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 11
            goto L_0x0500
        L_0x033c:
            boolean r2 = r15.equals(r13)
            if (r2 != 0) goto L_0x0344
            goto L_0x0273
        L_0x0344:
            r2 = 10
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 10
            goto L_0x0500
        L_0x0360:
            r2 = r23
            boolean r3 = r15.equals(r2)
            if (r3 != 0) goto L_0x0369
            goto L_0x038f
        L_0x0369:
            r3 = 9
            r23 = r2
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 9
            goto L_0x0500
        L_0x0387:
            r2 = r23
            boolean r3 = r15.equals(r7)
            if (r3 != 0) goto L_0x0393
        L_0x038f:
            r23 = r2
            goto L_0x0273
        L_0x0393:
            r3 = 8
            r23 = r2
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 8
            goto L_0x0500
        L_0x03b1:
            r2 = r23
            r3 = r30
            boolean r5 = r15.equals(r3)
            if (r5 != 0) goto L_0x03c5
            r23 = r2
            r12 = r18
            r5 = r19
            r2 = r29
            goto L_0x027b
        L_0x03c5:
            r5 = 7
            r23 = r2
            r12 = r18
            r5 = r19
            r2 = r29
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 7
            goto L_0x0500
        L_0x03e0:
            r5 = r19
            r2 = r23
            r3 = r30
            boolean r12 = r15.equals(r5)
            if (r12 != 0) goto L_0x03f8
            r23 = r2
            r19 = r13
            r12 = r18
            r13 = r21
            r2 = r29
            goto L_0x0479
        L_0x03f8:
            r12 = 6
            r23 = r2
            r19 = r13
            r12 = r18
            r13 = r21
            r2 = r29
            r21 = r7
            r18 = r17
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 6
            goto L_0x0500
        L_0x0411:
            r12 = r18
            r5 = r19
            r2 = r23
            r3 = r30
            boolean r18 = r15.equals(r12)
            if (r18 != 0) goto L_0x042b
            r23 = r2
            r19 = r13
            r18 = r17
            r13 = r21
            r2 = r29
            goto L_0x0281
        L_0x042b:
            r18 = 5
            r23 = r2
            r19 = r13
            r18 = r17
            r13 = r21
            r2 = r29
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 5
            goto L_0x0500
        L_0x0443:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            boolean r18 = r15.equals(r2)
            if (r18 != 0) goto L_0x0453
            goto L_0x027b
        L_0x0453:
            r18 = 4
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 4
            goto L_0x0500
        L_0x0467:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            boolean r18 = r15.equals(r13)
            if (r18 != 0) goto L_0x047f
        L_0x0479:
            r21 = r7
            r18 = r17
            goto L_0x0283
        L_0x047f:
            r18 = 3
            r21 = r7
            r18 = r17
            r7 = r20
            r20 = r6
            r6 = r16
            r16 = 3
            goto L_0x0500
        L_0x048f:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            r21 = r7
            r7 = r20
            boolean r18 = r15.equals(r7)
            if (r18 != 0) goto L_0x04ac
            r20 = r6
            r6 = r16
            r18 = r17
            goto L_0x04fe
        L_0x04ac:
            r18 = 2
            r20 = r6
            r6 = r16
            r18 = r17
            r16 = 2
            goto L_0x0500
        L_0x04b7:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r17
            boolean r17 = r15.equals(r6)
            if (r17 != 0) goto L_0x04d5
            r18 = r6
            goto L_0x0287
        L_0x04d5:
            r17 = 1
            r18 = r6
            r6 = r16
            r16 = 1
            goto L_0x0500
        L_0x04de:
            r12 = r18
            r5 = r19
            r2 = r29
            r3 = r30
            r19 = r13
            r18 = r17
            r13 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r16
            boolean r16 = r15.equals(r6)
            if (r16 != 0) goto L_0x04fb
            goto L_0x04fe
        L_0x04fb:
            r16 = 0
            goto L_0x0500
        L_0x04fe:
            r16 = -1
        L_0x0500:
            switch(r16) {
                case 0: goto L_0x0561;
                case 1: goto L_0x055b;
                case 2: goto L_0x0555;
                case 3: goto L_0x054f;
                case 4: goto L_0x0549;
                case 5: goto L_0x0543;
                case 6: goto L_0x053d;
                case 7: goto L_0x0537;
                case 8: goto L_0x0531;
                case 9: goto L_0x052b;
                case 10: goto L_0x0525;
                case 11: goto L_0x051f;
                case 12: goto L_0x0519;
                case 13: goto L_0x0513;
                case 14: goto L_0x050d;
                case 15: goto L_0x0507;
                default: goto L_0x0503;
            }
        L_0x0503:
            r16 = 0
            goto L_0x0566
        L_0x0507:
            y0.d$a r16 = new y0.d$a
            r16.<init>()
            goto L_0x0566
        L_0x050d:
            y0.d$a r16 = new y0.d$a
            r16.<init>()
            goto L_0x0566
        L_0x0513:
            y0.d$d r16 = new y0.d$d
            r16.<init>()
            goto L_0x0566
        L_0x0519:
            y0.d$c r16 = new y0.d$c
            r16.<init>()
            goto L_0x0566
        L_0x051f:
            y0.d$h r16 = new y0.d$h
            r16.<init>()
            goto L_0x0566
        L_0x0525:
            y0.d$f r16 = new y0.d$f
            r16.<init>()
            goto L_0x0566
        L_0x052b:
            y0.d$e r16 = new y0.d$e
            r16.<init>()
            goto L_0x0566
        L_0x0531:
            y0.d$a r16 = new y0.d$a
            r16.<init>()
            goto L_0x0566
        L_0x0537:
            y0.d$l r16 = new y0.d$l
            r16.<init>()
            goto L_0x0566
        L_0x053d:
            y0.d$k r16 = new y0.d$k
            r16.<init>()
            goto L_0x0566
        L_0x0543:
            y0.d$g r16 = new y0.d$g
            r16.<init>()
            goto L_0x0566
        L_0x0549:
            y0.d$o r16 = new y0.d$o
            r16.<init>()
            goto L_0x0566
        L_0x054f:
            y0.d$n r16 = new y0.d$n
            r16.<init>()
            goto L_0x0566
        L_0x0555:
            y0.d$m r16 = new y0.d$m
            r16.<init>()
            goto L_0x0566
        L_0x055b:
            y0.d$j r16 = new y0.d$j
            r16.<init>()
            goto L_0x0566
        L_0x0561:
            y0.d$i r16 = new y0.d$i
            r16.<init>()
        L_0x0566:
            r17 = r6
            r6 = r16
        L_0x056a:
            if (r6 != 0) goto L_0x0589
            r29 = r2
            r30 = r3
            r16 = r17
            r17 = r18
            r6 = r20
            r2 = r25
            r3 = r27
            r20 = r7
            r18 = r12
            r7 = r21
            r12 = r26
            r21 = r13
            r13 = r19
            r19 = r5
            goto L_0x05ae
        L_0x0589:
            r6.f21141e = r15
            r16 = r7
            java.util.HashMap<java.lang.String, y0.d> r7 = r0.f22749y
            r7.put(r15, r6)
            r29 = r2
            r30 = r3
            r6 = r20
            r7 = r21
            r2 = r25
            r3 = r27
            r21 = r13
            r20 = r16
            r16 = r17
            r17 = r18
            r13 = r19
            r19 = r5
            r18 = r12
            r12 = r26
        L_0x05ae:
            r5 = r36
            goto L_0x01ee
        L_0x05b2:
            r25 = r2
            r27 = r3
            r26 = r12
            r12 = r18
            r5 = r19
            r13 = r21
            r2 = r29
            r3 = r30
            r21 = r7
            r18 = r17
            r17 = r16
            r16 = r20
            r20 = r6
            java.util.ArrayList<z0.d> r6 = r0.f22747w
            if (r6 == 0) goto L_0x05ea
            java.util.Iterator r6 = r6.iterator()
        L_0x05d4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x05ea
            java.lang.Object r7 = r6.next()
            z0.d r7 = (p328z0.C7379d) r7
            boolean r15 = r7 instanceof p328z0.C7380e
            if (r15 == 0) goto L_0x05d4
            java.util.HashMap<java.lang.String, y0.d> r15 = r0.f22749y
            r7.mo23600a(r15)
            goto L_0x05d4
        L_0x05ea:
            z0.l r6 = r0.f22732h
            java.util.HashMap<java.lang.String, y0.d> r7 = r0.f22749y
            r15 = 0
            r6.mo23614a(r7, r15)
            z0.l r6 = r0.f22733i
            java.util.HashMap<java.lang.String, y0.d> r7 = r0.f22749y
            r15 = 100
            r6.mo23614a(r7, r15)
            java.util.HashMap<java.lang.String, y0.d> r6 = r0.f22749y
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0605:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0651
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r15 = r4.containsKey(r7)
            if (r15 == 0) goto L_0x0624
            java.lang.Object r15 = r4.get(r7)
            java.lang.Integer r15 = (java.lang.Integer) r15
            if (r15 == 0) goto L_0x0624
            int r15 = r15.intValue()
            goto L_0x0625
        L_0x0624:
            r15 = 0
        L_0x0625:
            r36 = r6
            java.util.HashMap<java.lang.String, y0.d> r6 = r0.f22749y
            java.lang.Object r6 = r6.get(r7)
            v0.j r6 = (p279v0.C6831j) r6
            if (r6 == 0) goto L_0x0634
            r6.mo23066c(r15)
        L_0x0634:
            r6 = r36
            goto L_0x0605
        L_0x0637:
            r25 = r2
            r27 = r3
            r26 = r12
            r12 = r18
            r5 = r19
            r13 = r21
            r2 = r29
            r3 = r30
            r21 = r7
            r18 = r17
            r17 = r16
            r16 = r20
            r20 = r6
        L_0x0651:
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L_0x0c21
            java.util.HashMap<java.lang.String, y0.e> r6 = r0.f22748x
            if (r6 != 0) goto L_0x0662
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r0.f22748x = r6
        L_0x0662:
            java.util.Iterator r1 = r1.iterator()
        L_0x0666:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0829
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, y0.e> r7 = r0.f22748x
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L_0x067b
            goto L_0x0666
        L_0x067b:
            boolean r7 = r6.startsWith(r14)
            if (r7 == 0) goto L_0x06d3
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            r15 = r26
            java.lang.String[] r19 = r6.split(r15)
            r23 = 1
            r36 = r1
            r1 = r19[r23]
            java.util.ArrayList<z0.d> r15 = r0.f22747w
            java.util.Iterator r15 = r15.iterator()
        L_0x0698:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L_0x06c1
            java.lang.Object r19 = r15.next()
            r23 = r15
            r15 = r19
            z0.d r15 = (p328z0.C7379d) r15
            r19 = r14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r15.f22610d
            if (r14 != 0) goto L_0x06af
            goto L_0x06bc
        L_0x06af:
            java.lang.Object r14 = r14.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto L_0x06bc
            int r15 = r15.f22607a
            r7.append(r15, r14)
        L_0x06bc:
            r14 = r19
            r15 = r23
            goto L_0x0698
        L_0x06c1:
            r19 = r14
            y0.e$b r1 = new y0.e$b
            r1.<init>(r6, r7)
            r15 = r1
            r1 = r16
            r7 = r18
            r16 = r13
            r13 = r37
            goto L_0x0813
        L_0x06d3:
            r36 = r1
            r19 = r14
            int r1 = r6.hashCode()
            switch(r1) {
                case -1249320806: goto L_0x07a9;
                case -1249320805: goto L_0x0797;
                case -1225497657: goto L_0x0786;
                case -1225497656: goto L_0x0775;
                case -1225497655: goto L_0x0764;
                case -1001078227: goto L_0x0754;
                case -908189618: goto L_0x0743;
                case -908189617: goto L_0x0732;
                case -40300674: goto L_0x071f;
                case -4379043: goto L_0x070c;
                case 37232917: goto L_0x06f9;
                case 92909918: goto L_0x06e6;
                default: goto L_0x06de;
            }
        L_0x06de:
            r1 = r16
        L_0x06e0:
            r14 = r17
            r7 = r18
            goto L_0x07b8
        L_0x06e6:
            boolean r1 = r6.equals(r8)
            if (r1 != 0) goto L_0x06ed
            goto L_0x06de
        L_0x06ed:
            r1 = 11
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 11
            goto L_0x07b9
        L_0x06f9:
            boolean r1 = r6.equals(r11)
            if (r1 != 0) goto L_0x0700
            goto L_0x06de
        L_0x0700:
            r1 = 10
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 10
            goto L_0x07b9
        L_0x070c:
            boolean r1 = r6.equals(r9)
            if (r1 != 0) goto L_0x0713
            goto L_0x06de
        L_0x0713:
            r1 = 9
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 9
            goto L_0x07b9
        L_0x071f:
            boolean r1 = r6.equals(r10)
            if (r1 != 0) goto L_0x0726
            goto L_0x06de
        L_0x0726:
            r1 = 8
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 8
            goto L_0x07b9
        L_0x0732:
            boolean r1 = r6.equals(r3)
            if (r1 != 0) goto L_0x0739
            goto L_0x06de
        L_0x0739:
            r1 = 7
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 7
            goto L_0x07b9
        L_0x0743:
            boolean r1 = r6.equals(r5)
            if (r1 != 0) goto L_0x074a
            goto L_0x06de
        L_0x074a:
            r1 = 6
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 6
            goto L_0x07b9
        L_0x0754:
            boolean r1 = r6.equals(r12)
            if (r1 != 0) goto L_0x075b
            goto L_0x06de
        L_0x075b:
            r1 = 5
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 5
            goto L_0x07b9
        L_0x0764:
            boolean r1 = r6.equals(r2)
            if (r1 != 0) goto L_0x076c
            goto L_0x06de
        L_0x076c:
            r1 = 4
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 4
            goto L_0x07b9
        L_0x0775:
            boolean r1 = r6.equals(r13)
            if (r1 != 0) goto L_0x077d
            goto L_0x06de
        L_0x077d:
            r1 = 3
            r1 = r16
            r14 = r17
            r7 = r18
            r15 = 3
            goto L_0x07b9
        L_0x0786:
            r1 = r16
            boolean r7 = r6.equals(r1)
            if (r7 != 0) goto L_0x0790
            goto L_0x06e0
        L_0x0790:
            r7 = 2
            r14 = r17
            r7 = r18
            r15 = 2
            goto L_0x07b9
        L_0x0797:
            r1 = r16
            r7 = r18
            boolean r14 = r6.equals(r7)
            if (r14 != 0) goto L_0x07a4
            r14 = r17
            goto L_0x07b8
        L_0x07a4:
            r14 = 1
            r14 = r17
            r15 = 1
            goto L_0x07b9
        L_0x07a9:
            r1 = r16
            r14 = r17
            r7 = r18
            boolean r15 = r6.equals(r14)
            if (r15 != 0) goto L_0x07b6
            goto L_0x07b8
        L_0x07b6:
            r15 = 0
            goto L_0x07b9
        L_0x07b8:
            r15 = -1
        L_0x07b9:
            switch(r15) {
                case 0: goto L_0x0806;
                case 1: goto L_0x0800;
                case 2: goto L_0x07fa;
                case 3: goto L_0x07f4;
                case 4: goto L_0x07ee;
                case 5: goto L_0x07e8;
                case 6: goto L_0x07e2;
                case 7: goto L_0x07dc;
                case 8: goto L_0x07d6;
                case 9: goto L_0x07d0;
                case 10: goto L_0x07ca;
                case 11: goto L_0x07c4;
                default: goto L_0x07bc;
            }
        L_0x07bc:
            r16 = r13
            r17 = r14
            r13 = r37
            r15 = 0
            goto L_0x0813
        L_0x07c4:
            y0.e$a r15 = new y0.e$a
            r15.<init>()
            goto L_0x080b
        L_0x07ca:
            y0.e$d r15 = new y0.e$d
            r15.<init>()
            goto L_0x080b
        L_0x07d0:
            y0.e$c r15 = new y0.e$c
            r15.<init>()
            goto L_0x080b
        L_0x07d6:
            y0.e$f r15 = new y0.e$f
            r15.<init>()
            goto L_0x080b
        L_0x07dc:
            y0.e$j r15 = new y0.e$j
            r15.<init>()
            goto L_0x080b
        L_0x07e2:
            y0.e$i r15 = new y0.e$i
            r15.<init>()
            goto L_0x080b
        L_0x07e8:
            y0.e$e r15 = new y0.e$e
            r15.<init>()
            goto L_0x080b
        L_0x07ee:
            y0.e$m r15 = new y0.e$m
            r15.<init>()
            goto L_0x080b
        L_0x07f4:
            y0.e$l r15 = new y0.e$l
            r15.<init>()
            goto L_0x080b
        L_0x07fa:
            y0.e$k r15 = new y0.e$k
            r15.<init>()
            goto L_0x080b
        L_0x0800:
            y0.e$h r15 = new y0.e$h
            r15.<init>()
            goto L_0x080b
        L_0x0806:
            y0.e$g r15 = new y0.e$g
            r15.<init>()
        L_0x080b:
            r16 = r13
            r17 = r14
            r13 = r37
            r15.f21173i = r13
        L_0x0813:
            if (r15 != 0) goto L_0x0816
            goto L_0x081d
        L_0x0816:
            r15.f21170f = r6
            java.util.HashMap<java.lang.String, y0.e> r13 = r0.f22748x
            r13.put(r6, r15)
        L_0x081d:
            r18 = r7
            r13 = r16
            r14 = r19
            r16 = r1
            r1 = r36
            goto L_0x0666
        L_0x0829:
            r19 = r14
            r1 = r16
            r7 = r18
            r16 = r13
            java.util.ArrayList<z0.d> r6 = r0.f22747w
            if (r6 == 0) goto L_0x0bdf
            java.util.Iterator r6 = r6.iterator()
        L_0x0839:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0bdf
            java.lang.Object r13 = r6.next()
            z0.d r13 = (p328z0.C7379d) r13
            boolean r14 = r13 instanceof p328z0.C7388j
            if (r14 == 0) goto L_0x0bc7
            z0.j r13 = (p328z0.C7388j) r13
            java.util.HashMap<java.lang.String, y0.e> r14 = r0.f22748x
            r13.getClass()
            java.util.Set r15 = r14.keySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0858:
            boolean r18 = r15.hasNext()
            if (r18 == 0) goto L_0x0bc7
            java.lang.Object r18 = r15.next()
            r36 = r6
            r6 = r18
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r18 = r14.get(r6)
            r28 = r18
            y0.e r28 = (p317y0.C7269e) r28
            if (r28 != 0) goto L_0x0880
            r23 = r4
            r18 = r14
            r37 = r15
            r0 = r16
            r16 = r17
            r17 = r7
            goto L_0x0bb5
        L_0x0880:
            r18 = r14
            java.lang.String r14 = "CUSTOM"
            boolean r14 = r6.startsWith(r14)
            if (r14 == 0) goto L_0x08e0
            r14 = 7
            java.lang.String r6 = r6.substring(r14)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.f22610d
            java.lang.Object r6 = r14.get(r6)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L_0x08d8
            r14 = r28
            y0.e$b r14 = (p317y0.C7269e.C7271b) r14
            r37 = r15
            int r15 = r13.f22607a
            r23 = r4
            float r4 = r13.f22675s
            int r0 = r13.f22674r
            r26 = r7
            float r7 = r13.f22676t
            r38 = r13
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r13 = r14.f22399l
            r13.append(r15, r6)
            android.util.SparseArray<float[]> r6 = r14.f22400m
            r13 = 2
            float[] r13 = new float[r13]
            r28 = 0
            r13[r28] = r4
            r4 = 1
            r13[r4] = r7
            r6.append(r15, r13)
            int r4 = r14.f21166b
            int r0 = java.lang.Math.max(r4, r0)
            r14.f21166b = r0
            r0 = r34
            r6 = r36
            r15 = r37
            r13 = r38
            r14 = r18
            r4 = r23
            r7 = r26
            goto L_0x0858
        L_0x08d8:
            r0 = r34
            r6 = r36
            r14 = r18
            goto L_0x0858
        L_0x08e0:
            r23 = r4
            r26 = r7
            r38 = r13
            r37 = r15
            int r0 = r6.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x09b9;
                case -1249320805: goto L_0x09a8;
                case -1225497657: goto L_0x0994;
                case -1225497656: goto L_0x0984;
                case -1225497655: goto L_0x0972;
                case -1001078227: goto L_0x0961;
                case -908189618: goto L_0x0950;
                case -908189617: goto L_0x093f;
                case -40300674: goto L_0x092c;
                case -4379043: goto L_0x0919;
                case 37232917: goto L_0x0906;
                case 92909918: goto L_0x08f3;
                default: goto L_0x08ef;
            }
        L_0x08ef:
            r0 = r16
            goto L_0x099c
        L_0x08f3:
            boolean r0 = r6.equals(r8)
            if (r0 != 0) goto L_0x08fa
            goto L_0x08ef
        L_0x08fa:
            r0 = 11
            r0 = r16
            r7 = r17
            r4 = r26
            r6 = 11
            goto L_0x09c9
        L_0x0906:
            boolean r0 = r6.equals(r11)
            if (r0 != 0) goto L_0x090d
            goto L_0x0967
        L_0x090d:
            r0 = 10
            r0 = r16
            r7 = r17
            r4 = r26
            r6 = 10
            goto L_0x09c9
        L_0x0919:
            boolean r0 = r6.equals(r9)
            if (r0 != 0) goto L_0x0920
            goto L_0x08ef
        L_0x0920:
            r0 = 9
            r0 = r16
            r7 = r17
            r4 = r26
            r6 = 9
            goto L_0x09c9
        L_0x092c:
            boolean r0 = r6.equals(r10)
            if (r0 != 0) goto L_0x0933
            goto L_0x0967
        L_0x0933:
            r0 = 8
            r0 = r16
            r7 = r17
            r4 = r26
            r6 = 8
            goto L_0x09c9
        L_0x093f:
            boolean r0 = r6.equals(r3)
            if (r0 != 0) goto L_0x0946
            goto L_0x08ef
        L_0x0946:
            r0 = 7
            r0 = r16
            r7 = r17
            r4 = r26
            r6 = 7
            goto L_0x09c9
        L_0x0950:
            boolean r0 = r6.equals(r5)
            if (r0 != 0) goto L_0x0957
            goto L_0x0967
        L_0x0957:
            r0 = 6
            r0 = r16
            r7 = r17
            r4 = r26
            r6 = 6
            goto L_0x09c9
        L_0x0961:
            boolean r0 = r6.equals(r12)
            if (r0 != 0) goto L_0x0968
        L_0x0967:
            goto L_0x08ef
        L_0x0968:
            r0 = 5
            r0 = r16
            r7 = r17
            r4 = r26
            r6 = 5
            goto L_0x09c9
        L_0x0972:
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L_0x097b
            r0 = r16
            goto L_0x098c
        L_0x097b:
            r0 = 4
            r0 = r16
            r7 = r17
            r4 = r26
            r6 = 4
            goto L_0x09c9
        L_0x0984:
            r0 = r16
            boolean r4 = r6.equals(r0)
            if (r4 != 0) goto L_0x098d
        L_0x098c:
            goto L_0x099c
        L_0x098d:
            r4 = 3
            r7 = r17
            r4 = r26
            r6 = 3
            goto L_0x09c9
        L_0x0994:
            r0 = r16
            boolean r4 = r6.equals(r1)
            if (r4 != 0) goto L_0x09a1
        L_0x099c:
            r7 = r17
            r4 = r26
            goto L_0x09c8
        L_0x09a1:
            r4 = 2
            r7 = r17
            r4 = r26
            r6 = 2
            goto L_0x09c9
        L_0x09a8:
            r0 = r16
            r4 = r26
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x09b5
            r7 = r17
            goto L_0x09c8
        L_0x09b5:
            r6 = 1
            r7 = r17
            goto L_0x09c9
        L_0x09b9:
            r0 = r16
            r7 = r17
            r4 = r26
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x09c6
            goto L_0x09c8
        L_0x09c6:
            r6 = 0
            goto L_0x09c9
        L_0x09c8:
            r6 = -1
        L_0x09c9:
            switch(r6) {
                case 0: goto L_0x0b90;
                case 1: goto L_0x0b6a;
                case 2: goto L_0x0b44;
                case 3: goto L_0x0b1d;
                case 4: goto L_0x0af6;
                case 5: goto L_0x0acf;
                case 6: goto L_0x0aa8;
                case 7: goto L_0x0a81;
                case 8: goto L_0x0a5a;
                case 9: goto L_0x0a33;
                case 10: goto L_0x0a0c;
                case 11: goto L_0x09df;
                default: goto L_0x09cc;
            }
        L_0x09cc:
            r6 = r36
            r15 = r37
            r13 = r38
            r16 = r0
            r17 = r7
            r14 = r18
            r0 = r34
            r7 = r4
            r4 = r23
            goto L_0x0858
        L_0x09df:
            r13 = r38
            float r6 = r13.f22662f
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L_0x0a06
            int r6 = r13.f22607a
            float r14 = r13.f22662f
            float r15 = r13.f22675s
            r16 = r7
            int r7 = r13.f22674r
            r17 = r4
            float r4 = r13.f22676t
            r29 = r6
            r30 = r14
            r31 = r15
            r32 = r7
            r33 = r4
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0a06:
            r17 = r4
            r16 = r7
            goto L_0x0bb5
        L_0x0a0c:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22667k
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22667k
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0a33:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22663g
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22663g
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0a5a:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22664h
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22664h
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0a81:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22669m
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22669m
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0aa8:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22668l
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22668l
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0acf:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22673q
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22673q
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0af6:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22672p
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22672p
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0b1d:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22671o
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22671o
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0b44:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22670n
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22670n
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0b6a:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22666j
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22666j
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
            goto L_0x0bb5
        L_0x0b90:
            r13 = r38
            r17 = r4
            r16 = r7
            float r4 = r13.f22665i
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x0bb5
            int r4 = r13.f22607a
            float r6 = r13.f22665i
            float r7 = r13.f22675s
            int r14 = r13.f22674r
            float r15 = r13.f22676t
            r29 = r4
            r30 = r6
            r31 = r7
            r32 = r14
            r33 = r15
            r28.mo23074b(r29, r30, r31, r32, r33)
        L_0x0bb5:
            r6 = r36
            r15 = r37
            r7 = r17
            r14 = r18
            r4 = r23
            r17 = r16
            r16 = r0
            r0 = r34
            goto L_0x0858
        L_0x0bc7:
            r23 = r4
            r36 = r6
            r0 = r16
            r16 = r17
            r17 = r7
            r6 = r36
            r7 = r17
            r4 = r23
            r17 = r16
            r16 = r0
            r0 = r34
            goto L_0x0839
        L_0x0bdf:
            r23 = r4
            r0 = r16
            r16 = r17
            r17 = r7
            r4 = r34
            java.util.HashMap<java.lang.String, y0.e> r6 = r4.f22748x
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0bf3:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0c2b
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r13 = r23
            boolean r14 = r13.containsKey(r7)
            if (r14 == 0) goto L_0x0c12
            java.lang.Object r14 = r13.get(r7)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            goto L_0x0c13
        L_0x0c12:
            r14 = 0
        L_0x0c13:
            java.util.HashMap<java.lang.String, y0.e> r15 = r4.f22748x
            java.lang.Object r7 = r15.get(r7)
            y0.e r7 = (p317y0.C7269e) r7
            r7.mo23075c(r14)
            r23 = r13
            goto L_0x0bf3
        L_0x0c21:
            r4 = r0
            r0 = r13
            r19 = r14
            r1 = r16
            r16 = r17
            r17 = r18
        L_0x0c2b:
            java.util.ArrayList<z0.p> r6 = r4.f22745u
            int r6 = r6.size()
            int r6 = r6 + 2
            z0.p[] r7 = new p328z0.C7396p[r6]
            z0.p r13 = r4.f22730f
            r14 = 0
            r7[r14] = r13
            int r13 = r6 + -1
            z0.p r15 = r4.f22731g
            r7[r13] = r15
            java.util.ArrayList<z0.p> r13 = r4.f22745u
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x0c4f
            int r13 = r4.f22729e
            r15 = -1
            if (r13 != r15) goto L_0x0c4f
            r4.f22729e = r14
        L_0x0c4f:
            java.util.ArrayList<z0.p> r13 = r4.f22745u
            java.util.Iterator r13 = r13.iterator()
            r14 = 1
        L_0x0c56:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0c69
            java.lang.Object r15 = r13.next()
            z0.p r15 = (p328z0.C7396p) r15
            int r18 = r14 + 1
            r7[r14] = r15
            r14 = r18
            goto L_0x0c56
        L_0x0c69:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            z0.p r14 = r4.f22731g
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.f22765o
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0c7a:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0cbc
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r36 = r14
            z0.p r14 = r4.f22730f
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r14.f22765o
            boolean r14 = r14.containsKey(r15)
            if (r14 == 0) goto L_0x0cb1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r18 = r1
            r1 = r19
            r14.append(r1)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r1 = r25
            boolean r14 = r1.contains(r14)
            if (r14 != 0) goto L_0x0cb5
            r13.add(r15)
            goto L_0x0cb5
        L_0x0cb1:
            r18 = r1
            r1 = r25
        L_0x0cb5:
            r14 = r36
            r25 = r1
            r1 = r18
            goto L_0x0c7a
        L_0x0cbc:
            r18 = r1
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r13.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r4.f22742r = r1
            int r1 = r1.length
            int[] r1 = new int[r1]
            r4.f22743s = r1
            r1 = 0
        L_0x0ccf:
            java.lang.String[] r13 = r4.f22742r
            int r14 = r13.length
            if (r1 >= r14) goto L_0x0d06
            r13 = r13[r1]
            int[] r14 = r4.f22743s
            r15 = 0
            r14[r1] = r15
            r14 = 0
        L_0x0cdc:
            if (r14 >= r6) goto L_0x0d03
            r15 = r7[r14]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r15 = r15.f22765o
            boolean r15 = r15.containsKey(r13)
            if (r15 == 0) goto L_0x0d00
            r15 = r7[r14]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r15 = r15.f22765o
            java.lang.Object r15 = r15.get(r13)
            androidx.constraintlayout.widget.ConstraintAttribute r15 = (androidx.constraintlayout.widget.ConstraintAttribute) r15
            if (r15 == 0) goto L_0x0d00
            int[] r13 = r4.f22743s
            r14 = r13[r1]
            int r15 = r15.mo3152c()
            int r15 = r15 + r14
            r13[r1] = r15
            goto L_0x0d03
        L_0x0d00:
            int r14 = r14 + 1
            goto L_0x0cdc
        L_0x0d03:
            int r1 = r1 + 1
            goto L_0x0ccf
        L_0x0d06:
            r1 = 0
            r1 = r7[r1]
            int r1 = r1.f22761k
            r14 = -1
            if (r1 == r14) goto L_0x0d10
            r1 = 1
            goto L_0x0d11
        L_0x0d10:
            r1 = 0
        L_0x0d11:
            int r13 = r13.length
            int r13 = r13 + 18
            boolean[] r14 = new boolean[r13]
            r15 = 1
        L_0x0d17:
            if (r15 >= r6) goto L_0x0d86
            r19 = r0
            r0 = r7[r15]
            int r23 = r15 + -1
            r29 = r2
            r2 = r7[r23]
            r23 = r12
            float r12 = r0.f22756f
            r25 = r5
            float r5 = r2.f22756f
            boolean r5 = p328z0.C7396p.m17042b(r12, r5)
            float r12 = r0.f22757g
            r30 = r3
            float r3 = r2.f22757g
            boolean r3 = p328z0.C7396p.m17042b(r12, r3)
            r12 = 0
            boolean r12 = r14[r12]
            r26 = r10
            float r10 = r0.f22755e
            r28 = r9
            float r9 = r2.f22755e
            boolean r9 = p328z0.C7396p.m17042b(r10, r9)
            r9 = r9 | r12
            r10 = 0
            r14[r10] = r9
            r9 = 1
            boolean r10 = r14[r9]
            r3 = r3 | r5
            r3 = r3 | r1
            r5 = r10 | r3
            r14[r9] = r5
            r5 = 2
            boolean r9 = r14[r5]
            r3 = r3 | r9
            r14[r5] = r3
            boolean r3 = r14[r22]
            float r5 = r0.f22758h
            float r9 = r2.f22758h
            boolean r5 = p328z0.C7396p.m17042b(r5, r9)
            r3 = r3 | r5
            r14[r22] = r3
            boolean r3 = r14[r24]
            float r0 = r0.f22759i
            float r2 = r2.f22759i
            boolean r0 = p328z0.C7396p.m17042b(r0, r2)
            r0 = r0 | r3
            r14[r24] = r0
            int r15 = r15 + 1
            r0 = r19
            r12 = r23
            r5 = r25
            r10 = r26
            r9 = r28
            r2 = r29
            r3 = r30
            goto L_0x0d17
        L_0x0d86:
            r19 = r0
            r29 = r2
            r30 = r3
            r25 = r5
            r28 = r9
            r26 = r10
            r23 = r12
            r0 = 0
            r1 = 1
        L_0x0d96:
            if (r1 >= r13) goto L_0x0da1
            boolean r2 = r14[r1]
            if (r2 == 0) goto L_0x0d9e
            int r0 = r0 + 1
        L_0x0d9e:
            int r1 = r1 + 1
            goto L_0x0d96
        L_0x0da1:
            int[] r1 = new int[r0]
            r4.f22739o = r1
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            double[] r1 = new double[r0]
            r4.f22740p = r1
            double[] r0 = new double[r0]
            r4.f22741q = r0
            r0 = 0
            r1 = 1
        L_0x0db4:
            if (r1 >= r13) goto L_0x0dc4
            boolean r2 = r14[r1]
            if (r2 == 0) goto L_0x0dc1
            int[] r2 = r4.f22739o
            int r3 = r0 + 1
            r2[r0] = r1
            r0 = r3
        L_0x0dc1:
            int r1 = r1 + 1
            goto L_0x0db4
        L_0x0dc4:
            int[] r0 = r4.f22739o
            int r0 = r0.length
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 1
            r1[r2] = r0
            r0 = 0
            r1[r0] = r6
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            double[][] r0 = (double[][]) r0
            double[] r1 = new double[r6]
            r2 = 0
        L_0x0ddb:
            if (r2 >= r6) goto L_0x0e2e
            r3 = r7[r2]
            r5 = r0[r2]
            int[] r9 = r4.f22739o
            r10 = 6
            float[] r10 = new float[r10]
            float r12 = r3.f22755e
            r13 = 0
            r10[r13] = r12
            float r12 = r3.f22756f
            r13 = 1
            r10[r13] = r12
            float r12 = r3.f22757g
            r13 = 2
            r10[r13] = r12
            float r12 = r3.f22758h
            r10[r22] = r12
            float r12 = r3.f22759i
            r10[r24] = r12
            float r3 = r3.f22760j
            r12 = 5
            r10[r12] = r3
            r3 = 0
            r13 = 0
        L_0x0e04:
            int r14 = r9.length
            if (r3 >= r14) goto L_0x0e24
            r14 = r9[r3]
            r15 = 6
            if (r14 >= r15) goto L_0x0e19
            int r15 = r13 + 1
            r14 = r10[r14]
            r31 = r9
            r32 = r10
            double r9 = (double) r14
            r5[r13] = r9
            r13 = r15
            goto L_0x0e1d
        L_0x0e19:
            r31 = r9
            r32 = r10
        L_0x0e1d:
            int r3 = r3 + 1
            r9 = r31
            r10 = r32
            goto L_0x0e04
        L_0x0e24:
            r3 = r7[r2]
            float r3 = r3.f22754d
            double r9 = (double) r3
            r1[r2] = r9
            int r2 = r2 + 1
            goto L_0x0ddb
        L_0x0e2e:
            r2 = 0
        L_0x0e2f:
            int[] r3 = r4.f22739o
            int r5 = r3.length
            if (r2 >= r5) goto L_0x0e64
            r3 = r3[r2]
            java.lang.String[] r5 = p328z0.C7396p.f22751s
            r9 = 6
            if (r3 >= r9) goto L_0x0e61
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int[] r9 = r4.f22739o
            r9 = r9[r2]
            r5 = r5[r9]
            java.lang.String r9 = " ["
            java.lang.String r3 = p001a0.C0016g.m31o(r3, r5, r9)
            r5 = 0
        L_0x0e4d:
            if (r5 >= r6) goto L_0x0e61
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            r9 = r0[r5]
            r12 = r9[r2]
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            int r5 = r5 + 1
            goto L_0x0e4d
        L_0x0e61:
            int r2 = r2 + 1
            goto L_0x0e2f
        L_0x0e64:
            java.lang.String[] r2 = r4.f22742r
            int r2 = r2.length
            int r2 = r2 + 1
            v0.b[] r2 = new p279v0.C6819b[r2]
            r4.f22734j = r2
            r2 = 0
        L_0x0e6e:
            java.lang.String[] r3 = r4.f22742r
            int r5 = r3.length
            if (r2 >= r5) goto L_0x0f34
            r3 = r3[r2]
            r5 = 0
            r9 = 0
            r10 = 0
            r12 = 0
        L_0x0e79:
            if (r5 >= r6) goto L_0x0f1a
            r13 = r7[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.f22765o
            boolean r13 = r13.containsKey(r3)
            if (r13 == 0) goto L_0x0f0e
            if (r12 != 0) goto L_0x0eac
            double[] r10 = new double[r6]
            r12 = r7[r5]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r12 = r12.f22765o
            java.lang.Object r12 = r12.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r12 = (androidx.constraintlayout.widget.ConstraintAttribute) r12
            if (r12 != 0) goto L_0x0e97
            r12 = 0
            goto L_0x0e9b
        L_0x0e97:
            int r12 = r12.mo3152c()
        L_0x0e9b:
            r13 = 2
            int[] r13 = new int[r13]
            r14 = 1
            r13[r14] = r12
            r12 = 0
            r13[r12] = r6
            java.lang.Class r12 = java.lang.Double.TYPE
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r12, r13)
            double[][] r12 = (double[][]) r12
        L_0x0eac:
            r13 = r7[r5]
            float r14 = r13.f22754d
            double r14 = (double) r14
            r10[r9] = r14
            r14 = r12[r9]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.f22765o
            java.lang.Object r13 = r13.get(r3)
            androidx.constraintlayout.widget.ConstraintAttribute r13 = (androidx.constraintlayout.widget.ConstraintAttribute) r13
            if (r13 != 0) goto L_0x0ec8
            r35 = r3
            r38 = r10
            r24 = r11
            r36 = r12
            goto L_0x0f07
        L_0x0ec8:
            int r15 = r13.mo3152c()
            r35 = r3
            r3 = 1
            if (r15 != r3) goto L_0x0ee0
            float r3 = r13.mo3150a()
            r36 = r12
            double r12 = (double) r3
            r3 = 0
            r14[r3] = r12
        L_0x0edb:
            r38 = r10
            r24 = r11
            goto L_0x0f07
        L_0x0ee0:
            r36 = r12
            int r3 = r13.mo3152c()
            float[] r12 = new float[r3]
            r13.mo3151b(r12)
            r13 = 0
            r15 = 0
        L_0x0eed:
            if (r13 >= r3) goto L_0x0edb
            int r22 = r15 + 1
            r37 = r3
            r3 = r12[r13]
            r38 = r10
            r24 = r11
            double r10 = (double) r3
            r14[r15] = r10
            int r13 = r13 + 1
            r3 = r37
            r10 = r38
            r15 = r22
            r11 = r24
            goto L_0x0eed
        L_0x0f07:
            int r9 = r9 + 1
            r12 = r36
            r10 = r38
            goto L_0x0f12
        L_0x0f0e:
            r35 = r3
            r24 = r11
        L_0x0f12:
            int r5 = r5 + 1
            r3 = r35
            r11 = r24
            goto L_0x0e79
        L_0x0f1a:
            r24 = r11
            double[] r3 = java.util.Arrays.copyOf(r10, r9)
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r12, r9)
            double[][] r5 = (double[][]) r5
            v0.b[] r9 = r4.f22734j
            int r2 = r2 + 1
            int r10 = r4.f22729e
            v0.b r3 = p279v0.C6819b.m16093a(r10, r3, r5)
            r9[r2] = r3
            goto L_0x0e6e
        L_0x0f34:
            r24 = r11
            v0.b[] r2 = r4.f22734j
            int r3 = r4.f22729e
            v0.b r0 = p279v0.C6819b.m16093a(r3, r1, r0)
            r1 = 0
            r2[r1] = r0
            r0 = r7[r1]
            int r0 = r0.f22761k
            r2 = -1
            if (r0 == r2) goto L_0x0f82
            int[] r0 = new int[r6]
            double[] r2 = new double[r6]
            r3 = 2
            int[] r5 = new int[r3]
            r9 = 1
            r5[r9] = r3
            r5[r1] = r6
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r3 = 0
        L_0x0f5d:
            if (r3 >= r6) goto L_0x0f7b
            r5 = r7[r3]
            int r9 = r5.f22761k
            r0[r3] = r9
            float r9 = r5.f22754d
            double r9 = (double) r9
            r2[r3] = r9
            r9 = r1[r3]
            float r10 = r5.f22756f
            double r10 = (double) r10
            r12 = 0
            r9[r12] = r10
            float r5 = r5.f22757g
            double r10 = (double) r5
            r5 = 1
            r9[r5] = r10
            int r3 = r3 + 1
            goto L_0x0f5d
        L_0x0f7b:
            v0.a r3 = new v0.a
            r3.<init>(r0, r2, r1)
            r4.f22735k = r3
        L_0x0f82:
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4.f22750z = r1
            java.util.ArrayList<z0.d> r1 = r4.f22747w
            if (r1 == 0) goto L_0x143e
            java.util.Iterator r1 = r27.iterator()
        L_0x0f93:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x1406
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0fcb
            y0.c$b r3 = new y0.c$b
            r3.<init>()
            r35 = r1
            r1 = r3
            r15 = r18
            r14 = r19
            r3 = r20
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            r18 = r17
            r17 = r16
            goto L_0x12c7
        L_0x0fcb:
            int r3 = r2.hashCode()
            switch(r3) {
                case -1249320806: goto L_0x1241;
                case -1249320805: goto L_0x1213;
                case -1225497657: goto L_0x11e3;
                case -1225497656: goto L_0x11b5;
                case -1225497655: goto L_0x1187;
                case -1001078227: goto L_0x115f;
                case -908189618: goto L_0x1137;
                case -908189617: goto L_0x110f;
                case -797520672: goto L_0x10d7;
                case -40300674: goto L_0x10ae;
                case -4379043: goto L_0x1076;
                case 37232917: goto L_0x103c;
                case 92909918: goto L_0x1013;
                case 156108012: goto L_0x0fe4;
                default: goto L_0x0fd2;
            }
        L_0x0fd2:
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r3 = r20
        L_0x0fdc:
            r9 = r21
            r12 = r23
            r5 = r24
            goto L_0x1052
        L_0x0fe4:
            r3 = r20
            boolean r5 = r2.equals(r3)
            if (r5 != 0) goto L_0x0ff5
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            goto L_0x0fdc
        L_0x0ff5:
            r5 = 13
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            r16 = 13
            goto L_0x11df
        L_0x1013:
            r3 = r20
            boolean r5 = r2.equals(r8)
            if (r5 != 0) goto L_0x101e
            r5 = r24
            goto L_0x1046
        L_0x101e:
            r5 = 12
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            r16 = 12
            goto L_0x11df
        L_0x103c:
            r3 = r20
            r5 = r24
            boolean r6 = r2.equals(r5)
            if (r6 != 0) goto L_0x105a
        L_0x1046:
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r9 = r21
            r12 = r23
        L_0x1052:
            r11 = r25
            r7 = r26
            r6 = r28
            goto L_0x10f3
        L_0x105a:
            r6 = 11
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r9 = r21
            r12 = r23
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            r16 = 11
            goto L_0x11df
        L_0x1076:
            r3 = r20
            r5 = r24
            r6 = r28
            boolean r7 = r2.equals(r6)
            if (r7 != 0) goto L_0x1094
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r9 = r21
            r12 = r23
            r11 = r25
            r7 = r26
            goto L_0x10f3
        L_0x1094:
            r7 = 10
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r9 = r21
            r12 = r23
            r11 = r25
            r7 = r26
            r13 = r29
            r10 = r30
            r16 = 10
            goto L_0x11df
        L_0x10ae:
            r3 = r20
            r5 = r24
            r7 = r26
            r6 = r28
            boolean r9 = r2.equals(r7)
            if (r9 != 0) goto L_0x10bf
            r9 = r21
            goto L_0x10e7
        L_0x10bf:
            r9 = 9
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r9 = r21
            r12 = r23
            r11 = r25
            r13 = r29
            r10 = r30
            r16 = 9
            goto L_0x11df
        L_0x10d7:
            r3 = r20
            r9 = r21
            r5 = r24
            r7 = r26
            r6 = r28
            boolean r10 = r2.equals(r9)
            if (r10 != 0) goto L_0x10f9
        L_0x10e7:
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r12 = r23
            r11 = r25
        L_0x10f3:
            r13 = r29
            r10 = r30
            goto L_0x1203
        L_0x10f9:
            r10 = 8
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r12 = r23
            r11 = r25
            r13 = r29
            r10 = r30
            r16 = 8
            goto L_0x11df
        L_0x110f:
            r3 = r20
            r9 = r21
            r5 = r24
            r7 = r26
            r6 = r28
            r10 = r30
            boolean r11 = r2.equals(r10)
            if (r11 != 0) goto L_0x1124
            r11 = r25
            goto L_0x114b
        L_0x1124:
            r11 = 7
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r12 = r23
            r11 = r25
            r13 = r29
            r16 = 7
            goto L_0x11df
        L_0x1137:
            r3 = r20
            r9 = r21
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r10 = r30
            boolean r12 = r2.equals(r11)
            if (r12 != 0) goto L_0x114e
        L_0x114b:
            r12 = r23
            goto L_0x1175
        L_0x114e:
            r12 = 6
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r12 = r23
            r13 = r29
            r16 = 6
            goto L_0x11df
        L_0x115f:
            r3 = r20
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r10 = r30
            boolean r13 = r2.equals(r12)
            if (r13 != 0) goto L_0x1178
        L_0x1175:
            r13 = r29
            goto L_0x119f
        L_0x1178:
            r13 = 5
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r13 = r29
            r16 = 5
            goto L_0x11df
        L_0x1187:
            r3 = r20
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            boolean r14 = r2.equals(r13)
            if (r14 != 0) goto L_0x11a9
        L_0x119f:
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            goto L_0x1203
        L_0x11a9:
            r14 = 4
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r16 = 4
            goto L_0x11df
        L_0x11b5:
            r14 = r19
            r3 = r20
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            boolean r15 = r2.equals(r14)
            if (r15 != 0) goto L_0x11d6
            r35 = r1
            r1 = r16
            r15 = r18
            goto L_0x1203
        L_0x11d6:
            r15 = 3
            r35 = r1
            r1 = r16
            r15 = r18
            r16 = 3
        L_0x11df:
            r18 = r17
            goto L_0x1269
        L_0x11e3:
            r15 = r18
            r14 = r19
            r3 = r20
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            boolean r18 = r2.equals(r15)
            if (r18 != 0) goto L_0x1207
            r35 = r1
            r1 = r16
        L_0x1203:
            r18 = r17
            goto L_0x1267
        L_0x1207:
            r18 = 2
            r35 = r1
            r1 = r16
            r18 = r17
            r16 = 2
            goto L_0x1269
        L_0x1213:
            r35 = r1
            r1 = r17
            r15 = r18
            r14 = r19
            r3 = r20
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            boolean r17 = r2.equals(r1)
            if (r17 != 0) goto L_0x1238
            r18 = r1
            r1 = r16
            goto L_0x1267
        L_0x1238:
            r17 = 1
            r18 = r1
            r1 = r16
            r16 = 1
            goto L_0x1269
        L_0x1241:
            r35 = r1
            r1 = r16
            r15 = r18
            r14 = r19
            r3 = r20
            r9 = r21
            r12 = r23
            r5 = r24
            r11 = r25
            r7 = r26
            r6 = r28
            r13 = r29
            r10 = r30
            r18 = r17
            boolean r16 = r2.equals(r1)
            if (r16 != 0) goto L_0x1264
            goto L_0x1267
        L_0x1264:
            r16 = 0
            goto L_0x1269
        L_0x1267:
            r16 = -1
        L_0x1269:
            switch(r16) {
                case 0: goto L_0x12c1;
                case 1: goto L_0x12bb;
                case 2: goto L_0x12b5;
                case 3: goto L_0x12af;
                case 4: goto L_0x12a9;
                case 5: goto L_0x12a3;
                case 6: goto L_0x129d;
                case 7: goto L_0x1297;
                case 8: goto L_0x1291;
                case 9: goto L_0x128b;
                case 10: goto L_0x1285;
                case 11: goto L_0x127f;
                case 12: goto L_0x1279;
                case 13: goto L_0x1273;
                default: goto L_0x126c;
            }
        L_0x126c:
            r16 = 0
        L_0x126e:
            r17 = r1
            r1 = r16
            goto L_0x12c7
        L_0x1273:
            y0.c$a r16 = new y0.c$a
            r16.<init>()
            goto L_0x126e
        L_0x1279:
            y0.c$a r16 = new y0.c$a
            r16.<init>()
            goto L_0x126e
        L_0x127f:
            y0.c$d r16 = new y0.c$d
            r16.<init>()
            goto L_0x126e
        L_0x1285:
            y0.c$c r16 = new y0.c$c
            r16.<init>()
            goto L_0x126e
        L_0x128b:
            y0.c$f r16 = new y0.c$f
            r16.<init>()
            goto L_0x126e
        L_0x1291:
            y0.c$a r16 = new y0.c$a
            r16.<init>()
            goto L_0x126e
        L_0x1297:
            y0.c$j r16 = new y0.c$j
            r16.<init>()
            goto L_0x126e
        L_0x129d:
            y0.c$i r16 = new y0.c$i
            r16.<init>()
            goto L_0x126e
        L_0x12a3:
            y0.c$e r16 = new y0.c$e
            r16.<init>()
            goto L_0x126e
        L_0x12a9:
            y0.c$m r16 = new y0.c$m
            r16.<init>()
            goto L_0x126e
        L_0x12af:
            y0.c$l r16 = new y0.c$l
            r16.<init>()
            goto L_0x126e
        L_0x12b5:
            y0.c$k r16 = new y0.c$k
            r16.<init>()
            goto L_0x126e
        L_0x12bb:
            y0.c$h r16 = new y0.c$h
            r16.<init>()
            goto L_0x126e
        L_0x12c1:
            y0.c$g r16 = new y0.c$g
            r16.<init>()
            goto L_0x126e
        L_0x12c7:
            if (r1 != 0) goto L_0x12dc
            r20 = r3
            r24 = r5
            r16 = r6
            r19 = r7
            r23 = r8
            r36 = r9
            r38 = r10
            r5 = r11
            r21 = r12
            goto L_0x13ea
        L_0x12dc:
            r20 = r3
            int r3 = r1.f21107e
            r24 = r5
            r5 = 1
            if (r3 != r5) goto L_0x12e7
            r3 = 1
            goto L_0x12e8
        L_0x12e7:
            r3 = 0
        L_0x12e8:
            if (r3 == 0) goto L_0x13d6
            boolean r3 = java.lang.Float.isNaN(r0)
            if (r3 == 0) goto L_0x13d6
            r0 = 2
            float[] r0 = new float[r0]
            r3 = 99
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 / r3
            r21 = 0
            r3 = 0
            r16 = 0
            r16 = r6
            r19 = r7
            r32 = r21
            r6 = 0
        L_0x1305:
            r7 = 100
            if (r6 >= r7) goto L_0x13cb
            float r7 = (float) r6
            float r7 = r7 * r5
            r23 = r8
            r36 = r9
            double r8 = (double) r7
            r37 = r5
            z0.p r5 = r4.f22730f
            v0.c r5 = r5.f22752b
            r25 = r5
            java.util.ArrayList<z0.p> r5 = r4.f22745u
            java.util.Iterator r5 = r5.iterator()
            r26 = 2143289344(0x7fc00000, float:NaN)
            r27 = 0
            r28 = r8
            r8 = r25
        L_0x1327:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x1353
            java.lang.Object r9 = r5.next()
            z0.p r9 = (p328z0.C7396p) r9
            r38 = r5
            v0.c r5 = r9.f22752b
            if (r5 == 0) goto L_0x1350
            r25 = r5
            float r5 = r9.f22754d
            int r30 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r30 >= 0) goto L_0x1346
            r27 = r5
            r8 = r25
            goto L_0x1350
        L_0x1346:
            boolean r5 = java.lang.Float.isNaN(r26)
            if (r5 == 0) goto L_0x1350
            float r5 = r9.f22754d
            r26 = r5
        L_0x1350:
            r5 = r38
            goto L_0x1327
        L_0x1353:
            if (r8 == 0) goto L_0x1370
            boolean r5 = java.lang.Float.isNaN(r26)
            if (r5 == 0) goto L_0x135d
            r26 = 1065353216(0x3f800000, float:1.0)
        L_0x135d:
            float r7 = r7 - r27
            float r26 = r26 - r27
            float r7 = r7 / r26
            r5 = r10
            double r9 = (double) r7
            double r7 = r8.mo23049a(r9)
            float r7 = (float) r7
            float r7 = r7 * r26
            float r7 = r7 + r27
            double r7 = (double) r7
            goto L_0x1373
        L_0x1370:
            r5 = r10
            r7 = r28
        L_0x1373:
            v0.b[] r9 = r4.f22734j
            r10 = 0
            r9 = r9[r10]
            double[] r10 = r4.f22740p
            r9.mo23037c(r7, r10)
            z0.p r9 = r4.f22730f
            int[] r10 = r4.f22739o
            r38 = r5
            double[] r5 = r4.f22740p
            r31 = 0
            r25 = r9
            r26 = r7
            r28 = r10
            r29 = r5
            r30 = r0
            r25.mo23628c(r26, r28, r29, r30, r31)
            if (r6 <= 0) goto L_0x13ad
            double r7 = (double) r3
            r3 = 1
            r3 = r0[r3]
            double r9 = (double) r3
            double r9 = r21 - r9
            r3 = 0
            r3 = r0[r3]
            r5 = r11
            r21 = r12
            double r11 = (double) r3
            double r11 = r32 - r11
            double r9 = java.lang.Math.hypot(r9, r11)
            double r9 = r9 + r7
            float r3 = (float) r9
            goto L_0x13b0
        L_0x13ad:
            r5 = r11
            r21 = r12
        L_0x13b0:
            r7 = 0
            r7 = r0[r7]
            double r7 = (double) r7
            r9 = 1
            r9 = r0[r9]
            double r9 = (double) r9
            int r6 = r6 + 1
            r11 = r5
            r32 = r7
            r12 = r21
            r8 = r23
            r5 = r37
            r21 = r9
            r9 = r36
            r10 = r38
            goto L_0x1305
        L_0x13cb:
            r23 = r8
            r36 = r9
            r38 = r10
            r5 = r11
            r21 = r12
            r0 = r3
            goto L_0x13e3
        L_0x13d6:
            r16 = r6
            r19 = r7
            r23 = r8
            r36 = r9
            r38 = r10
            r5 = r11
            r21 = r12
        L_0x13e3:
            r1.f21104b = r2
            java.util.HashMap<java.lang.String, y0.c> r3 = r4.f22750z
            r3.put(r2, r1)
        L_0x13ea:
            r1 = r35
            r30 = r38
            r25 = r5
            r29 = r13
            r28 = r16
            r16 = r17
            r17 = r18
            r26 = r19
            r8 = r23
            r19 = r14
            r18 = r15
            r23 = r21
            r21 = r36
            goto L_0x0f93
        L_0x1406:
            java.util.ArrayList<z0.d> r0 = r4.f22747w
            java.util.Iterator r0 = r0.iterator()
        L_0x140c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x1424
            java.lang.Object r1 = r0.next()
            z0.d r1 = (p328z0.C7379d) r1
            boolean r2 = r1 instanceof p328z0.C7382f
            if (r2 == 0) goto L_0x140c
            z0.f r1 = (p328z0.C7382f) r1
            java.util.HashMap<java.lang.String, y0.c> r2 = r4.f22750z
            r1.mo23608h(r2)
            goto L_0x140c
        L_0x1424:
            java.util.HashMap<java.lang.String, y0.c> r0 = r4.f22750z
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x142e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x143e
            java.lang.Object r1 = r0.next()
            y0.c r1 = (p317y0.C7239c) r1
            r1.mo23058d()
            goto L_0x142e
        L_0x143e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p328z0.C7394n.mo23625h(int, int, long):void");
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k(" start: x: ");
        k.append(this.f22730f.f22756f);
        k.append(" y: ");
        k.append(this.f22730f.f22757g);
        k.append(" end: x: ");
        k.append(this.f22731g.f22756f);
        k.append(" y: ");
        k.append(this.f22731g.f22757g);
        return k.toString();
    }
}
