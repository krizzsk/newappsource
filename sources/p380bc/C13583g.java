package p380bc;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import p241s0.C6313h;

/* renamed from: bc.g */
public final class C13583g {

    /* renamed from: a */
    public final C6313h<String, C13584h> f33549a = new C6313h<>();

    /* renamed from: b */
    public final C6313h<String, PropertyValuesHolder[]> f33550b = new C6313h<>();

    /* renamed from: a */
    public static C13583g m33996a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m33997b(resourceId, context);
    }

    /* renamed from: b */
    public static C13583g m33997b(int i, Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m33998c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m33998c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* renamed from: c */
    public static C13583g m33998c(ArrayList arrayList) {
        C13583g gVar = new C13583g();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.mo40469h(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C13577a.f33538b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C13577a.f33539c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C13577a.f33540d;
                }
                C13584h hVar = new C13584h(startDelay, duration, interpolator);
                hVar.f33554d = objectAnimator.getRepeatCount();
                hVar.f33555e = objectAnimator.getRepeatMode();
                gVar.f33549a.put(propertyName, hVar);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    /* renamed from: d */
    public final ObjectAnimator mo40464d(String str, ExtendedFloatingActionButton extendedFloatingActionButton, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton, mo40465e(str));
        ofPropertyValuesHolder.setProperty(property);
        mo40467f(str).mo40472a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: e */
    public final PropertyValuesHolder[] mo40465e(String str) {
        if (mo40468g(str)) {
            PropertyValuesHolder[] orDefault = this.f33550b.getOrDefault(str, null);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
            for (int i = 0; i < orDefault.length; i++) {
                propertyValuesHolderArr[i] = orDefault[i].clone();
            }
            return propertyValuesHolderArr;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13583g)) {
            return false;
        }
        return this.f33549a.equals(((C13583g) obj).f33549a);
    }

    /* renamed from: f */
    public final C13584h mo40467f(String str) {
        boolean z;
        if (this.f33549a.getOrDefault(str, null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f33549a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final boolean mo40468g(String str) {
        if (this.f33550b.getOrDefault(str, null) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo40469h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f33550b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f33549a.hashCode();
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q(10);
        q.append(C13583g.class.getName());
        q.append('{');
        q.append(Integer.toHexString(System.identityHashCode(this)));
        q.append(" timings: ");
        q.append(this.f33549a);
        q.append("}\n");
        return q.toString();
    }
}
