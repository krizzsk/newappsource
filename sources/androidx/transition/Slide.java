package androidx.transition;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.WeakHashMap;
import org.xmlpull.p982v1.XmlPullParser;
import p116i1.C5256j;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p330z2.C7437m;
import p330z2.C7438n;
import p330z2.C7441q;

public class Slide extends Visibility {

    /* renamed from: C */
    public static final DecelerateInterpolator f4930C = new DecelerateInterpolator();

    /* renamed from: D */
    public static final AccelerateInterpolator f4931D = new AccelerateInterpolator();

    /* renamed from: E */
    public static final C1303a f4932E = new C1303a();

    /* renamed from: F */
    public static final C1304b f4933F = new C1304b();

    /* renamed from: G */
    public static final C1305c f4934G = new C1305c();

    /* renamed from: H */
    public static final C1306d f4935H = new C1306d();

    /* renamed from: I */
    public static final C1307e f4936I = new C1307e();

    /* renamed from: J */
    public static final C1308f f4937J = new C1308f();

    /* renamed from: B */
    public C1309g f4938B = f4937J;

    /* renamed from: androidx.transition.Slide$a */
    public static class C1303a extends C1310h {
        /* renamed from: b */
        public final float mo5401b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    public static class C1304b extends C1310h {
        /* renamed from: b */
        public final float mo5401b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            boolean z = true;
            if (C6333d0.C6338e.m15063d(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    public static class C1305c extends C1311i {
        /* renamed from: a */
        public final float mo5402a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    public static class C1306d extends C1310h {
        /* renamed from: b */
        public final float mo5401b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    public static class C1307e extends C1310h {
        /* renamed from: b */
        public final float mo5401b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            boolean z = true;
            if (C6333d0.C6338e.m15063d(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    public static class C1308f extends C1311i {
        /* renamed from: a */
        public final float mo5402a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    public interface C1309g {
        /* renamed from: a */
        float mo5402a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo5401b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    public static abstract class C1310h implements C1309g {
        /* renamed from: a */
        public final float mo5402a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    public static abstract class C1311i implements C1309g {
        /* renamed from: b */
        public final float mo5401b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        mo5400N(80);
    }

    /* renamed from: L */
    public final Animator mo5393L(ViewGroup viewGroup, View view, C7441q qVar, C7441q qVar2) {
        if (qVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) qVar2.f22854a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1333i.m3636a(view, qVar2, iArr[0], iArr[1], this.f4938B.mo5401b(viewGroup, view), this.f4938B.mo5402a(viewGroup, view), translationX, translationY, f4930C, this);
    }

    /* renamed from: M */
    public final Animator mo5394M(ViewGroup viewGroup, View view, C7441q qVar) {
        if (qVar == null) {
            return null;
        }
        int[] iArr = (int[]) qVar.f22854a.get("android:slide:screenPosition");
        return C1333i.m3636a(view, qVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f4938B.mo5401b(viewGroup, view), this.f4938B.mo5402a(viewGroup, view), f4931D, this);
    }

    /* renamed from: N */
    public final void mo5400N(int i) {
        if (i == 3) {
            this.f4938B = f4932E;
        } else if (i == 5) {
            this.f4938B = f4935H;
        } else if (i == 48) {
            this.f4938B = f4934G;
        } else if (i == 80) {
            this.f4938B = f4937J;
        } else if (i == 8388611) {
            this.f4938B = f4933F;
        } else if (i == 8388613) {
            this.f4938B = f4936I;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        C7437m mVar = new C7437m();
        mVar.f22841c = i;
        this.f4960t = mVar;
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        mo5437J(qVar);
        int[] iArr = new int[2];
        qVar.f22855b.getLocationOnScreen(iArr);
        qVar.f22854a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        mo5437J(qVar);
        int[] iArr = new int[2];
        qVar.f22855b.getLocationOnScreen(iArr);
        qVar.f22854a.put("android:slide:screenPosition", iArr);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22847f);
        int c = C5256j.m13275c(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo5400N(c);
    }
}
