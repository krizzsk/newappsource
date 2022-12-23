package p021b2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0836f;

/* renamed from: b2.h */
public final class C1460h implements TransformationMethod {

    /* renamed from: b */
    public final TransformationMethod f5324b;

    public C1460h(TransformationMethod transformationMethod) {
        this.f5324b = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f5324b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0836f.m2528a().mo3619b() != 1) {
            return charSequence;
        }
        C0836f a = C0836f.m2528a();
        a.getClass();
        return a.mo3623f(0, charSequence.length(), charSequence);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f5324b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
