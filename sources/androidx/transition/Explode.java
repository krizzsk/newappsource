package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.Transition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p330z2.C7423b;
import p330z2.C7434j;
import p330z2.C7441q;

public class Explode extends Visibility {

    /* renamed from: C */
    public static final DecelerateInterpolator f4923C = new DecelerateInterpolator();

    /* renamed from: D */
    public static final AccelerateInterpolator f4924D = new AccelerateInterpolator();

    /* renamed from: B */
    public int[] f4925B = new int[2];

    public Explode() {
        this.f4960t = new C7423b();
    }

    /* renamed from: J */
    private void m3494J(C7441q qVar) {
        View view = qVar.f22855b;
        view.getLocationOnScreen(this.f4925B);
        int[] iArr = this.f4925B;
        int i = iArr[0];
        int i2 = iArr[1];
        qVar.f22854a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* renamed from: L */
    public final Animator mo5393L(ViewGroup viewGroup, View view, C7441q qVar, C7441q qVar2) {
        if (qVar2 == null) {
            return null;
        }
        Rect rect = (Rect) qVar2.f22854a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        mo5395N(viewGroup, rect, this.f4925B);
        int[] iArr = this.f4925B;
        return C1333i.m3636a(view, qVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, f4923C, this);
    }

    /* renamed from: M */
    public final Animator mo5394M(ViewGroup viewGroup, View view, C7441q qVar) {
        float f;
        float f2;
        if (qVar == null) {
            return null;
        }
        Rect rect = (Rect) qVar.f22854a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) qVar.f22855b.getTag(C7434j.transition_position);
        if (iArr != null) {
            int i3 = iArr[0];
            f2 = ((float) (i3 - rect.left)) + translationX;
            int i4 = iArr[1];
            f = ((float) (i4 - rect.top)) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f2 = translationX;
            f = translationY;
        }
        mo5395N(viewGroup, rect, this.f4925B);
        int[] iArr2 = this.f4925B;
        return C1333i.m3636a(view, qVar, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), f4924D, this);
    }

    /* renamed from: N */
    public final void mo5395N(View view, Rect rect, int[] iArr) {
        Rect rect2;
        int i;
        int i2;
        view.getLocationOnScreen(this.f4925B);
        int[] iArr2 = this.f4925B;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Transition.C1314c cVar = this.f4961u;
        if (cVar == null) {
            rect2 = null;
        } else {
            rect2 = cVar.mo5431a();
        }
        if (rect2 == null) {
            i2 = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i3;
            i = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i4;
        } else {
            i2 = rect2.centerX();
            i = rect2.centerY();
        }
        float centerX = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX == BitmapDescriptorFactory.HUE_RED && centerY == BitmapDescriptorFactory.HUE_RED) {
            float random = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerX = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = random;
        }
        float sqrt = (float) Math.sqrt((double) ((centerY * centerY) + (centerX * centerX)));
        int i5 = i2 - i3;
        int i6 = i - i4;
        float max = (float) Math.max(i5, view.getWidth() - i5);
        float max2 = (float) Math.max(i6, view.getHeight() - i6);
        float sqrt2 = (float) Math.sqrt((double) ((max2 * max2) + (max * max)));
        iArr[0] = Math.round((centerX / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY / sqrt));
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        mo5437J(qVar);
        m3494J(qVar);
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        mo5437J(qVar);
        m3494J(qVar);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4960t = new C7423b();
    }
}
