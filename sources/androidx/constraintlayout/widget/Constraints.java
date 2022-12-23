package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;

public class Constraints extends ViewGroup {

    /* renamed from: b */
    public C0738a f3084b;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public C0738a getConstraintSet() {
        if (this.f3084b == null) {
            this.f3084b = new C0738a();
        }
        C0738a aVar = this.f3084b;
        aVar.getClass();
        int childCount = getChildCount();
        aVar.f3116f.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!aVar.f3115e || id != -1) {
                if (!aVar.f3116f.containsKey(Integer.valueOf(id))) {
                    aVar.f3116f.put(Integer.valueOf(id), new C0738a.C0739a());
                }
                C0738a.C0739a aVar2 = aVar.f3116f.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof ConstraintHelper) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                        aVar2.mo3248d(id, layoutParams);
                        if (constraintHelper instanceof Barrier) {
                            C0738a.C0741b bVar = aVar2.f3121e;
                            bVar.f3181i0 = 1;
                            Barrier barrier = (Barrier) constraintHelper;
                            bVar.f3177g0 = barrier.getType();
                            aVar2.f3121e.f3183j0 = barrier.getReferencedIds();
                            aVar2.f3121e.f3179h0 = barrier.getMargin();
                        }
                    }
                    aVar2.mo3248d(id, layoutParams);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f3084b;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f3085A0;

        /* renamed from: B0 */
        public float f3086B0;

        /* renamed from: C0 */
        public float f3087C0;

        /* renamed from: D0 */
        public float f3088D0;

        /* renamed from: r0 */
        public float f3089r0;

        /* renamed from: s0 */
        public boolean f3090s0;

        /* renamed from: t0 */
        public float f3091t0;

        /* renamed from: u0 */
        public float f3092u0;

        /* renamed from: v0 */
        public float f3093v0;

        /* renamed from: w0 */
        public float f3094w0;

        /* renamed from: x0 */
        public float f3095x0;

        /* renamed from: y0 */
        public float f3096y0;

        /* renamed from: z0 */
        public float f3097z0;

        public LayoutParams() {
            super(-2, -2);
            this.f3089r0 = 1.0f;
            this.f3090s0 = false;
            this.f3091t0 = BitmapDescriptorFactory.HUE_RED;
            this.f3092u0 = BitmapDescriptorFactory.HUE_RED;
            this.f3093v0 = BitmapDescriptorFactory.HUE_RED;
            this.f3094w0 = BitmapDescriptorFactory.HUE_RED;
            this.f3095x0 = 1.0f;
            this.f3096y0 = 1.0f;
            this.f3097z0 = BitmapDescriptorFactory.HUE_RED;
            this.f3085A0 = BitmapDescriptorFactory.HUE_RED;
            this.f3086B0 = BitmapDescriptorFactory.HUE_RED;
            this.f3087C0 = BitmapDescriptorFactory.HUE_RED;
            this.f3088D0 = BitmapDescriptorFactory.HUE_RED;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3089r0 = 1.0f;
            this.f3090s0 = false;
            this.f3091t0 = BitmapDescriptorFactory.HUE_RED;
            this.f3092u0 = BitmapDescriptorFactory.HUE_RED;
            this.f3093v0 = BitmapDescriptorFactory.HUE_RED;
            this.f3094w0 = BitmapDescriptorFactory.HUE_RED;
            this.f3095x0 = 1.0f;
            this.f3096y0 = 1.0f;
            this.f3097z0 = BitmapDescriptorFactory.HUE_RED;
            this.f3085A0 = BitmapDescriptorFactory.HUE_RED;
            this.f3086B0 = BitmapDescriptorFactory.HUE_RED;
            this.f3087C0 = BitmapDescriptorFactory.HUE_RED;
            this.f3088D0 = BitmapDescriptorFactory.HUE_RED;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintSet_android_alpha) {
                    this.f3089r0 = obtainStyledAttributes.getFloat(index, this.f3089r0);
                } else if (index == C0042d.ConstraintSet_android_elevation) {
                    this.f3091t0 = obtainStyledAttributes.getFloat(index, this.f3091t0);
                    this.f3090s0 = true;
                } else if (index == C0042d.ConstraintSet_android_rotationX) {
                    this.f3093v0 = obtainStyledAttributes.getFloat(index, this.f3093v0);
                } else if (index == C0042d.ConstraintSet_android_rotationY) {
                    this.f3094w0 = obtainStyledAttributes.getFloat(index, this.f3094w0);
                } else if (index == C0042d.ConstraintSet_android_rotation) {
                    this.f3092u0 = obtainStyledAttributes.getFloat(index, this.f3092u0);
                } else if (index == C0042d.ConstraintSet_android_scaleX) {
                    this.f3095x0 = obtainStyledAttributes.getFloat(index, this.f3095x0);
                } else if (index == C0042d.ConstraintSet_android_scaleY) {
                    this.f3096y0 = obtainStyledAttributes.getFloat(index, this.f3096y0);
                } else if (index == C0042d.ConstraintSet_android_transformPivotX) {
                    this.f3097z0 = obtainStyledAttributes.getFloat(index, this.f3097z0);
                } else if (index == C0042d.ConstraintSet_android_transformPivotY) {
                    this.f3085A0 = obtainStyledAttributes.getFloat(index, this.f3085A0);
                } else if (index == C0042d.ConstraintSet_android_translationX) {
                    this.f3086B0 = obtainStyledAttributes.getFloat(index, this.f3086B0);
                } else if (index == C0042d.ConstraintSet_android_translationY) {
                    this.f3087C0 = obtainStyledAttributes.getFloat(index, this.f3087C0);
                } else if (index == C0042d.ConstraintSet_android_translationZ) {
                    this.f3088D0 = obtainStyledAttributes.getFloat(index, this.f3088D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
