package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import p002a1.C0042d;
import p279v0.C6817a;
import p279v0.C6831j;
import p279v0.C6837p;
import p317y0.C7239c;
import p317y0.C7253d;
import p328z0.C7394n;
import p328z0.C7395o;
import p328z0.C7396p;

public class MotionTelltales extends MockView {

    /* renamed from: m */
    public Paint f2978m = new Paint();

    /* renamed from: n */
    public MotionLayout f2979n;

    /* renamed from: o */
    public float[] f2980o = new float[2];

    /* renamed from: p */
    public Matrix f2981p = new Matrix();

    /* renamed from: q */
    public int f2982q = 0;

    /* renamed from: r */
    public int f2983r = -65281;

    /* renamed from: s */
    public float f2984s = 0.25f;

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2201a(context, attributeSet);
    }

    /* renamed from: a */
    private void m2201a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.MotionTelltales_telltales_tailColor) {
                    this.f2983r = obtainStyledAttributes.getColor(index, this.f2983r);
                } else if (index == C0042d.MotionTelltales_telltales_velocityMode) {
                    this.f2982q = obtainStyledAttributes.getInt(index, this.f2982q);
                } else if (index == C0042d.MotionTelltales_telltales_tailScale) {
                    this.f2984s = obtainStyledAttributes.getFloat(index, this.f2984s);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2978m.setColor(this.f2983r);
        this.f2978m.setStrokeWidth(5.0f);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float[] fArr;
        float[] fArr2;
        float f2;
        float f3;
        C6831j jVar;
        C6831j jVar2;
        C6831j jVar3;
        C6831j jVar4;
        int i6;
        C6831j jVar5;
        C7239c cVar;
        C7239c cVar2;
        C7239c cVar3;
        C7239c cVar4;
        float f4;
        float f5;
        float f6;
        double[] dArr;
        int i7;
        float f7;
        float[] fArr3;
        MotionTelltales motionTelltales = this;
        super.onDraw(canvas);
        getMatrix().invert(motionTelltales.f2981p);
        if (motionTelltales.f2979n == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.f2979n = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i8 = 5;
        float[] fArr4 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        MotionTelltales motionTelltales2 = motionTelltales;
        int i9 = 0;
        while (i9 < i8) {
            float f8 = fArr4[i9];
            int i11 = 0;
            while (i11 < i8) {
                float f9 = fArr4[i11];
                MotionLayout motionLayout = motionTelltales2.f2979n;
                float[] fArr5 = motionTelltales2.f2980o;
                int i12 = motionTelltales2.f2982q;
                float f11 = motionLayout.f2691k;
                float f12 = motionLayout.f2712v;
                if (motionLayout.f2689i != null) {
                    float signum = Math.signum(motionLayout.f2716x - f12);
                    float interpolation = motionLayout.f2689i.getInterpolation(motionLayout.f2712v + 1.0E-5f);
                    f12 = motionLayout.f2689i.getInterpolation(motionLayout.f2712v);
                    f11 = (((interpolation - f12) / 1.0E-5f) * signum) / motionLayout.f2708t;
                }
                C7395o oVar = motionLayout.f2689i;
                if (oVar instanceof C7395o) {
                    f11 = oVar.mo2986a();
                }
                float f13 = f11;
                C7394n nVar = motionLayout.f2704r.get(motionTelltales2);
                if ((i12 & 1) == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float b = nVar.mo23620b(nVar.f22746v, f12);
                    HashMap<String, C7253d> hashMap = nVar.f22749y;
                    C7239c cVar5 = null;
                    if (hashMap == null) {
                        fArr = fArr4;
                        jVar = null;
                    } else {
                        jVar = hashMap.get("translationX");
                        fArr = fArr4;
                    }
                    HashMap<String, C7253d> hashMap2 = nVar.f22749y;
                    i5 = i12;
                    if (hashMap2 == null) {
                        i4 = i9;
                        jVar2 = null;
                    } else {
                        jVar2 = hashMap2.get("translationY");
                        i4 = i9;
                    }
                    HashMap<String, C7253d> hashMap3 = nVar.f22749y;
                    i3 = i11;
                    if (hashMap3 == null) {
                        i2 = height;
                        jVar3 = null;
                    } else {
                        jVar3 = hashMap3.get("rotation");
                        i2 = height;
                    }
                    HashMap<String, C7253d> hashMap4 = nVar.f22749y;
                    i = width;
                    if (hashMap4 == null) {
                        jVar4 = null;
                    } else {
                        jVar4 = hashMap4.get("scaleX");
                    }
                    HashMap<String, C7253d> hashMap5 = nVar.f22749y;
                    f = f13;
                    if (hashMap5 == null) {
                        i6 = width2;
                        jVar5 = null;
                    } else {
                        jVar5 = hashMap5.get("scaleY");
                        i6 = width2;
                    }
                    HashMap<String, C7239c> hashMap6 = nVar.f22750z;
                    if (hashMap6 == null) {
                        cVar = null;
                    } else {
                        cVar = hashMap6.get("translationX");
                    }
                    HashMap<String, C7239c> hashMap7 = nVar.f22750z;
                    if (hashMap7 == null) {
                        cVar2 = null;
                    } else {
                        cVar2 = hashMap7.get("translationY");
                    }
                    HashMap<String, C7239c> hashMap8 = nVar.f22750z;
                    if (hashMap8 == null) {
                        cVar3 = null;
                    } else {
                        cVar3 = hashMap8.get("rotation");
                    }
                    HashMap<String, C7239c> hashMap9 = nVar.f22750z;
                    if (hashMap9 == null) {
                        cVar4 = null;
                    } else {
                        cVar4 = hashMap9.get("scaleX");
                    }
                    HashMap<String, C7239c> hashMap10 = nVar.f22750z;
                    if (hashMap10 != null) {
                        cVar5 = hashMap10.get("scaleY");
                    }
                    C7239c cVar6 = cVar5;
                    C6837p pVar = new C6837p();
                    float[] fArr6 = fArr5;
                    pVar.f21179e = BitmapDescriptorFactory.HUE_RED;
                    pVar.f21178d = BitmapDescriptorFactory.HUE_RED;
                    pVar.f21177c = BitmapDescriptorFactory.HUE_RED;
                    pVar.f21176b = BitmapDescriptorFactory.HUE_RED;
                    pVar.f21175a = BitmapDescriptorFactory.HUE_RED;
                    if (jVar3 != null) {
                        f4 = f9;
                        f5 = f8;
                        pVar.f21179e = (float) jVar3.f21137a.mo23039e((double) b);
                        pVar.f21180f = jVar3.mo23064a(b);
                    } else {
                        f4 = f9;
                        f5 = f8;
                    }
                    if (jVar != null) {
                        pVar.f21177c = (float) jVar.f21137a.mo23039e((double) b);
                    }
                    if (jVar2 != null) {
                        pVar.f21178d = (float) jVar2.f21137a.mo23039e((double) b);
                    }
                    if (jVar4 != null) {
                        pVar.f21175a = (float) jVar4.f21137a.mo23039e((double) b);
                    }
                    if (jVar5 != null) {
                        pVar.f21176b = (float) jVar5.f21137a.mo23039e((double) b);
                    }
                    if (cVar3 != null) {
                        pVar.f21179e = cVar3.mo23056b(b);
                    }
                    if (cVar != null) {
                        pVar.f21177c = cVar.mo23056b(b);
                    }
                    if (cVar2 != null) {
                        pVar.f21178d = cVar2.mo23056b(b);
                    }
                    if (cVar4 != null) {
                        pVar.f21175a = cVar4.mo23056b(b);
                    }
                    if (cVar6 != null) {
                        pVar.f21176b = cVar6.mo23056b(b);
                    }
                    C6817a aVar = nVar.f22735k;
                    if (aVar != null) {
                        double[] dArr2 = nVar.f22740p;
                        if (dArr2.length > 0) {
                            double d = (double) b;
                            aVar.mo23037c(d, dArr2);
                            nVar.f22735k.mo23040f(d, nVar.f22741q);
                            C7396p pVar2 = nVar.f22730f;
                            int[] iArr = nVar.f22739o;
                            double[] dArr3 = nVar.f22741q;
                            double[] dArr4 = nVar.f22740p;
                            pVar2.getClass();
                            i7 = i5;
                            fArr3 = fArr6;
                            f7 = f4;
                            C7396p.m17043e(f4, f5, fArr6, iArr, dArr3, dArr4);
                        } else {
                            fArr3 = fArr6;
                            i7 = i5;
                            f7 = f4;
                        }
                        pVar.mo23077a(f7, f5, i6, height2, fArr3);
                        i5 = i7;
                        fArr2 = fArr3;
                        f3 = f7;
                    } else {
                        float[] fArr7 = fArr6;
                        float f14 = f4;
                        if (nVar.f22734j != null) {
                            double b2 = (double) nVar.mo23620b(nVar.f22746v, b);
                            nVar.f22734j[0].mo23040f(b2, nVar.f22741q);
                            nVar.f22734j[0].mo23037c(b2, nVar.f22740p);
                            float f15 = nVar.f22746v[0];
                            int i13 = 0;
                            while (true) {
                                dArr = nVar.f22741q;
                                if (i13 >= dArr.length) {
                                    break;
                                }
                                dArr[i13] = dArr[i13] * ((double) f15);
                                i13++;
                            }
                            C7396p pVar3 = nVar.f22730f;
                            int[] iArr2 = nVar.f22739o;
                            double[] dArr5 = nVar.f22740p;
                            pVar3.getClass();
                            fArr2 = fArr7;
                            f3 = f14;
                            C7396p.m17043e(f14, f5, fArr7, iArr2, dArr, dArr5);
                            pVar.mo23077a(f3, f5, i6, height2, fArr2);
                        } else {
                            fArr2 = fArr7;
                            C7396p pVar4 = nVar.f22731g;
                            C7239c cVar7 = cVar6;
                            float f16 = pVar4.f22756f;
                            C7396p pVar5 = nVar.f22730f;
                            C7239c cVar8 = cVar4;
                            float f17 = f16 - pVar5.f22756f;
                            C7239c cVar9 = cVar2;
                            float f18 = pVar4.f22757g - pVar5.f22757g;
                            C7239c cVar10 = cVar;
                            fArr2[0] = (((pVar4.f22758h - pVar5.f22758h) + f17) * f14) + ((1.0f - f14) * f17);
                            fArr2[1] = (((pVar4.f22759i - pVar5.f22759i) + f18) * f5) + ((1.0f - f5) * f18);
                            pVar.f21179e = BitmapDescriptorFactory.HUE_RED;
                            pVar.f21178d = BitmapDescriptorFactory.HUE_RED;
                            pVar.f21177c = BitmapDescriptorFactory.HUE_RED;
                            pVar.f21176b = BitmapDescriptorFactory.HUE_RED;
                            pVar.f21175a = BitmapDescriptorFactory.HUE_RED;
                            if (jVar3 != null) {
                                f6 = f14;
                                pVar.f21179e = (float) jVar3.f21137a.mo23039e((double) b);
                                pVar.f21180f = jVar3.mo23064a(b);
                            } else {
                                f6 = f14;
                            }
                            if (jVar != null) {
                                pVar.f21177c = (float) jVar.f21137a.mo23039e((double) b);
                            }
                            if (jVar2 != null) {
                                pVar.f21178d = (float) jVar2.f21137a.mo23039e((double) b);
                            }
                            if (jVar4 != null) {
                                pVar.f21175a = (float) jVar4.f21137a.mo23039e((double) b);
                            }
                            if (jVar5 != null) {
                                pVar.f21176b = (float) jVar5.f21137a.mo23039e((double) b);
                            }
                            if (cVar3 != null) {
                                pVar.f21179e = cVar3.mo23056b(b);
                            }
                            if (cVar10 != null) {
                                pVar.f21177c = cVar10.mo23056b(b);
                            }
                            if (cVar9 != null) {
                                pVar.f21178d = cVar9.mo23056b(b);
                            }
                            if (cVar8 != null) {
                                pVar.f21175a = cVar8.mo23056b(b);
                            }
                            if (cVar7 != null) {
                                pVar.f21176b = cVar7.mo23056b(b);
                            }
                            f3 = f6;
                            pVar.mo23077a(f6, f5, i6, height2, fArr2);
                        }
                    }
                    f2 = f5;
                } else {
                    i = width;
                    i2 = height;
                    f = f13;
                    fArr = fArr4;
                    i4 = i9;
                    i5 = i12;
                    f3 = f9;
                    f2 = f8;
                    i3 = i11;
                    fArr2 = fArr5;
                    nVar.mo23622d(f12, f3, f2, fArr2);
                }
                if (i5 < 2) {
                    fArr2[0] = fArr2[0] * f;
                    fArr2[1] = fArr2[1] * f;
                }
                this.f2981p.mapVectors(this.f2980o);
                int i14 = i;
                float f19 = ((float) i14) * f3;
                int i15 = i2;
                float f21 = ((float) i15) * f2;
                float[] fArr8 = this.f2980o;
                float f22 = fArr8[0];
                float f23 = this.f2984s;
                float f24 = f21 - (fArr8[1] * f23);
                this.f2981p.mapVectors(fArr8);
                canvas.drawLine(f19, f21, f19 - (f22 * f23), f24, this.f2978m);
                i11 = i3 + 1;
                f8 = f2;
                motionTelltales2 = this;
                width = i14;
                fArr4 = fArr;
                i9 = i4;
                i8 = 5;
                height = i15;
                motionTelltales = motionTelltales2;
            }
            int i16 = width;
            float[] fArr9 = fArr4;
            int i17 = height;
            MotionTelltales motionTelltales3 = motionTelltales;
            int i18 = i17;
            i9++;
            i8 = 5;
            MotionTelltales motionTelltales4 = motionTelltales3;
            height = i18;
            motionTelltales = motionTelltales4;
        }
        MotionTelltales motionTelltales5 = motionTelltales;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f2917g = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2201a(context, attributeSet);
    }
}
