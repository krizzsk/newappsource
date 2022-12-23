package p317y0;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p279v0.C6824e;

/* renamed from: y0.c */
public abstract class C7239c extends C6824e {

    /* renamed from: y0.c$a */
    public static class C7240a extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setAlpha(mo23055a(f));
        }
    }

    /* renamed from: y0.c$b */
    public static class C7241b extends C7239c {

        /* renamed from: g */
        public float[] f22392g = new float[1];

        /* renamed from: h */
        public ConstraintAttribute f22393h;

        /* renamed from: c */
        public final void mo23057c(ConstraintAttribute constraintAttribute) {
            this.f22393h = constraintAttribute;
        }

        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            this.f22392g[0] = mo23055a(f);
            C7236a.m16831b(this.f22393h, view, this.f22392g);
        }
    }

    /* renamed from: y0.c$c */
    public static class C7242c extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setElevation(mo23055a(f));
        }
    }

    /* renamed from: y0.c$d */
    public static class C7243d extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
        }
    }

    /* renamed from: y0.c$e */
    public static class C7244e extends C7239c {

        /* renamed from: g */
        public boolean f22394g = false;

        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo23055a(f));
            } else if (!this.f22394g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f22394g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo23055a(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: y0.c$f */
    public static class C7245f extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setRotation(mo23055a(f));
        }
    }

    /* renamed from: y0.c$g */
    public static class C7246g extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setRotationX(mo23055a(f));
        }
    }

    /* renamed from: y0.c$h */
    public static class C7247h extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setRotationY(mo23055a(f));
        }
    }

    /* renamed from: y0.c$i */
    public static class C7248i extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setScaleX(mo23055a(f));
        }
    }

    /* renamed from: y0.c$j */
    public static class C7249j extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setScaleY(mo23055a(f));
        }
    }

    /* renamed from: y0.c$k */
    public static class C7250k extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setTranslationX(mo23055a(f));
        }
    }

    /* renamed from: y0.c$l */
    public static class C7251l extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setTranslationY(mo23055a(f));
        }
    }

    /* renamed from: y0.c$m */
    public static class C7252m extends C7239c {
        /* renamed from: e */
        public final void mo23542e(View view, float f) {
            view.setTranslationZ(mo23055a(f));
        }
    }

    /* renamed from: e */
    public abstract void mo23542e(View view, float f);
}
