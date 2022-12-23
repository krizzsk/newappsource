package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.C0704i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: j */
    public boolean f3106j;

    /* renamed from: k */
    public boolean f3107k;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: j */
    public final void mo2901j(ConstraintLayout constraintLayout) {
        mo3159i(constraintLayout);
    }

    /* renamed from: n */
    public void mo2868n(AttributeSet attributeSet) {
        super.mo2868n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintLayout_Layout_android_visibility) {
                    this.f3106j = true;
                } else if (index == C0042d.ConstraintLayout_Layout_android_elevation) {
                    this.f3107k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3106j || this.f3107k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f2998c; i++) {
                    View viewById = constraintLayout.getViewById(this.f2997b[i]);
                    if (viewById != null) {
                        if (this.f3106j) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f3107k && elevation > BitmapDescriptorFactory.HUE_RED) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo3158h();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo3158h();
    }

    /* renamed from: u */
    public void mo2900u(C0704i iVar, int i, int i2) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
