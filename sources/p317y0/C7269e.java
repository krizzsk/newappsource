package p317y0;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import p066e0.C4436j0;
import p279v0.C6819b;
import p279v0.C6836o;

/* renamed from: y0.e */
public abstract class C7269e extends C6836o {

    /* renamed from: y0.e$a */
    public static class C7270a extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setAlpha(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$b */
    public static class C7271b extends C7269e {

        /* renamed from: k */
        public String f22398k;

        /* renamed from: l */
        public SparseArray<ConstraintAttribute> f22399l;

        /* renamed from: m */
        public SparseArray<float[]> f22400m = new SparseArray<>();

        /* renamed from: n */
        public float[] f22401n;

        /* renamed from: o */
        public float[] f22402o;

        public C7271b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f22398k = str.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)[1];
            this.f22399l = sparseArray;
        }

        /* renamed from: b */
        public final void mo23074b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: c */
        public final void mo23075c(int i) {
            int size = this.f22399l.size();
            int c = this.f22399l.valueAt(0).mo3152c();
            double[] dArr = new double[size];
            int i2 = c + 2;
            this.f22401n = new float[i2];
            this.f22402o = new float[c];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f22399l.keyAt(i3);
                float[] valueAt = this.f22400m.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.f22399l.valueAt(i3).mo3151b(this.f22401n);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f22401n;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                double[] dArr3 = dArr2[i3];
                dArr3[c] = (double) valueAt[0];
                dArr3[c + 1] = (double) valueAt[1];
            }
            this.f21165a = C6819b.m16093a(i, dArr, dArr2);
        }

        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            boolean z;
            long j2 = j;
            View view2 = view;
            this.f21165a.mo23038d((double) f, this.f22401n);
            float[] fArr = this.f22401n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f21173i;
            if (Float.isNaN(this.f21174j)) {
                float h = j0Var.mo19961h(this.f22398k, view2);
                this.f21174j = h;
                if (Float.isNaN(h)) {
                    this.f21174j = BitmapDescriptorFactory.HUE_RED;
                }
            }
            float f4 = (float) ((((((double) j3) * 1.0E-9d) * ((double) f2)) + ((double) this.f21174j)) % 1.0d);
            this.f21174j = f4;
            this.f21173i = j2;
            float a = mo23073a(f4);
            this.f21172h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f22402o;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f21172h;
                float f5 = this.f22401n[i];
                if (((double) f5) != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.f21172h = z2 | z;
                fArr2[i] = (f5 * a) + f3;
                i++;
            }
            C7236a.m16831b(this.f22399l.valueAt(0), view2, this.f22402o);
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                this.f21172h = true;
            }
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$c */
    public static class C7272c extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setElevation(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$d */
    public static class C7273d extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$e */
    public static class C7274e extends C7269e {

        /* renamed from: k */
        public boolean f22403k = false;

        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo23544d(f, j, view, j0Var));
            } else if (this.f22403k) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f22403k = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo23544d(f, j, view, j0Var))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$f */
    public static class C7275f extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setRotation(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$g */
    public static class C7276g extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setRotationX(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$h */
    public static class C7277h extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setRotationY(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$i */
    public static class C7278i extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setScaleX(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$j */
    public static class C7279j extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setScaleY(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$k */
    public static class C7280k extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setTranslationX(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$l */
    public static class C7281l extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setTranslationY(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: y0.e$m */
    public static class C7282m extends C7269e {
        /* renamed from: e */
        public final boolean mo23545e(float f, long j, View view, C4436j0 j0Var) {
            view.setTranslationZ(mo23544d(f, j, view, j0Var));
            return this.f21172h;
        }
    }

    /* renamed from: d */
    public final float mo23544d(float f, long j, View view, C4436j0 j0Var) {
        long j2 = j;
        View view2 = view;
        C4436j0 j0Var2 = j0Var;
        this.f21165a.mo23038d((double) f, this.f21171g);
        float[] fArr = this.f21171g;
        boolean z = true;
        float f2 = fArr[1];
        int i = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i == 0) {
            this.f21172h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f21174j)) {
            float h = j0Var2.mo19961h(this.f21170f, view2);
            this.f21174j = h;
            if (Float.isNaN(h)) {
                this.f21174j = BitmapDescriptorFactory.HUE_RED;
            }
        }
        float f3 = (float) ((((((double) (j2 - this.f21173i)) * 1.0E-9d) * ((double) f2)) + ((double) this.f21174j)) % 1.0d);
        this.f21174j = f3;
        String str = this.f21170f;
        if (!((HashMap) j0Var2.f15501b).containsKey(view2)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, new float[]{f3});
            ((HashMap) j0Var2.f15501b).put(view2, hashMap);
        } else {
            HashMap hashMap2 = (HashMap) ((HashMap) j0Var2.f15501b).get(view2);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f3});
                ((HashMap) j0Var2.f15501b).put(view2, hashMap2);
            } else {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f3;
                hashMap2.put(str, fArr2);
            }
        }
        this.f21173i = j2;
        float f4 = this.f21171g[0];
        float a = (mo23073a(this.f21174j) * f4) + this.f21171g[2];
        if (f4 == BitmapDescriptorFactory.HUE_RED && i == 0) {
            z = false;
        }
        this.f21172h = z;
        return a;
    }

    /* renamed from: e */
    public abstract boolean mo23545e(float f, long j, View view, C4436j0 j0Var);
}
