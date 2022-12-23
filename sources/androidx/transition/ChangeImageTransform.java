package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.C1331h;
import java.util.HashMap;
import p330z2.C7431h;
import p330z2.C7432i;
import p330z2.C7441q;

public class ChangeImageTransform extends Transition {

    /* renamed from: A */
    public static final C1294a f4896A = new C1294a();

    /* renamed from: B */
    public static final C1295b f4897B = new C1295b(Matrix.class);

    /* renamed from: z */
    public static final String[] f4898z = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: androidx.transition.ChangeImageTransform$a */
    public static class C1294a implements TypeEvaluator<Matrix> {
        public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            Matrix matrix = (Matrix) obj;
            Matrix matrix2 = (Matrix) obj2;
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$b */
    public static class C1295b extends Property<ImageView, Matrix> {
        public C1295b(Class cls) {
            super(cls, "animatedTransform");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            ImageView imageView = (ImageView) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            ImageView imageView = (ImageView) obj;
            Matrix matrix = (Matrix) obj2;
            if (Build.VERSION.SDK_INT >= 29) {
                imageView.animateTransform(matrix);
            } else if (matrix == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                    imageView.invalidate();
                }
            } else if (C7431h.f22838a) {
                try {
                    imageView.animateTransform(matrix);
                } catch (NoSuchMethodError unused) {
                    C7431h.f22838a = false;
                }
            }
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$c */
    public static /* synthetic */ class C1296c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4899a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4899a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4899a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.C1296c.<clinit>():void");
        }
    }

    public ChangeImageTransform() {
    }

    /* renamed from: J */
    public final void mo5380J(C7441q qVar) {
        Matrix matrix;
        View view = qVar.f22855b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                HashMap hashMap = qVar.f22854a;
                hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                    int i = C1296c.f4899a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        Matrix matrix2 = new Matrix();
                        matrix2.postScale(((float) imageView.getWidth()) / ((float) drawable2.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable2.getIntrinsicHeight()));
                        matrix = matrix2;
                    } else if (i == 2) {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = (float) imageView.getWidth();
                        float f = (float) intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = (float) imageView.getHeight();
                        float f2 = (float) intrinsicHeight;
                        float max = Math.max(width / f, height / f2);
                        int round = Math.round((width - (f * max)) / 2.0f);
                        int round2 = Math.round((height - (f2 * max)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(max, max);
                        matrix.postTranslate((float) round, (float) round2);
                    }
                    hashMap.put("android:changeImageTransform:matrix", matrix);
                }
                matrix = new Matrix(imageView.getImageMatrix());
                hashMap.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        mo5380J(qVar);
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        mo5380J(qVar);
    }

    /* renamed from: k */
    public final Animator mo5358k(ViewGroup viewGroup, C7441q qVar, C7441q qVar2) {
        boolean z;
        if (qVar == null || qVar2 == null) {
            return null;
        }
        Rect rect = (Rect) qVar.f22854a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) qVar2.f22854a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) qVar.f22854a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) qVar2.f22854a.get("android:changeImageTransform:matrix");
        if (!(matrix == null && matrix2 == null) && (matrix == null || !matrix.equals(matrix2))) {
            z = false;
        } else {
            z = true;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) qVar2.f22855b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            C1295b bVar = f4897B;
            C1294a aVar = f4896A;
            C7432i.C7433a aVar2 = C7432i.f22839a;
            return ObjectAnimator.ofObject(imageView, bVar, aVar, new Matrix[]{aVar2, aVar2});
        }
        if (matrix == null) {
            matrix = C7432i.f22839a;
        }
        if (matrix2 == null) {
            matrix2 = C7432i.f22839a;
        }
        C1295b bVar2 = f4897B;
        bVar2.set(imageView, matrix);
        return ObjectAnimator.ofObject(imageView, bVar2, new C1331h.C1332a(), new Matrix[]{matrix, matrix2});
    }

    /* renamed from: q */
    public final String[] mo5359q() {
        return f4898z;
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
