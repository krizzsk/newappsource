package p317y0;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p279v0.C6819b;
import p279v0.C6831j;

/* renamed from: y0.d */
public abstract class C7253d extends C6831j {

    /* renamed from: y0.d$a */
    public static class C7254a extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setAlpha(mo23064a(f));
        }
    }

    /* renamed from: y0.d$b */
    public static class C7255b extends C7253d {

        /* renamed from: f */
        public SparseArray<ConstraintAttribute> f22395f;

        /* renamed from: g */
        public float[] f22396g;

        public C7255b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)[1];
            this.f22395f = sparseArray;
        }

        /* renamed from: b */
        public final void mo23065b(float f, int i) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: c */
        public final void mo23066c(int i) {
            int size = this.f22395f.size();
            int c = this.f22395f.valueAt(0).mo3152c();
            double[] dArr = new double[size];
            this.f22396g = new float[c];
            int[] iArr = new int[2];
            iArr[1] = c;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f22395f.keyAt(i2)) * 0.01d;
                this.f22395f.valueAt(i2).mo3151b(this.f22396g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f22396g;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f21137a = C6819b.m16093a(i, dArr, dArr2);
        }

        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            this.f21137a.mo23038d((double) f, this.f22396g);
            C7236a.m16831b(this.f22395f.valueAt(0), view, this.f22396g);
        }
    }

    /* renamed from: y0.d$c */
    public static class C7256c extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setElevation(mo23064a(f));
        }
    }

    /* renamed from: y0.d$d */
    public static class C7257d extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
        }
    }

    /* renamed from: y0.d$e */
    public static class C7258e extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setPivotX(mo23064a(f));
        }
    }

    /* renamed from: y0.d$f */
    public static class C7259f extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setPivotY(mo23064a(f));
        }
    }

    /* renamed from: y0.d$g */
    public static class C7260g extends C7253d {

        /* renamed from: f */
        public boolean f22397f = false;

        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo23064a(f));
            } else if (!this.f22397f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f22397f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo23064a(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: y0.d$h */
    public static class C7261h extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setRotation(mo23064a(f));
        }
    }

    /* renamed from: y0.d$i */
    public static class C7262i extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setRotationX(mo23064a(f));
        }
    }

    /* renamed from: y0.d$j */
    public static class C7263j extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setRotationY(mo23064a(f));
        }
    }

    /* renamed from: y0.d$k */
    public static class C7264k extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setScaleX(mo23064a(f));
        }
    }

    /* renamed from: y0.d$l */
    public static class C7265l extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setScaleY(mo23064a(f));
        }
    }

    /* renamed from: y0.d$m */
    public static class C7266m extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setTranslationX(mo23064a(f));
        }
    }

    /* renamed from: y0.d$n */
    public static class C7267n extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setTranslationY(mo23064a(f));
        }
    }

    /* renamed from: y0.d$o */
    public static class C7268o extends C7253d {
        /* renamed from: d */
        public final void mo23543d(View view, float f) {
            view.setTranslationZ(mo23064a(f));
        }
    }

    /* renamed from: d */
    public abstract void mo23543d(View view, float f);
}
