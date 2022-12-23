package p380bc;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import p358af.C13437d;

/* renamed from: bc.h */
public final class C13584h {

    /* renamed from: a */
    public long f33551a;

    /* renamed from: b */
    public long f33552b;

    /* renamed from: c */
    public TimeInterpolator f33553c;

    /* renamed from: d */
    public int f33554d;

    /* renamed from: e */
    public int f33555e;

    public C13584h(long j) {
        this.f33553c = null;
        this.f33554d = 0;
        this.f33555e = 1;
        this.f33551a = j;
        this.f33552b = 150;
    }

    /* renamed from: a */
    public final void mo40472a(Animator animator) {
        animator.setStartDelay(this.f33551a);
        animator.setDuration(this.f33552b);
        animator.setInterpolator(mo40473b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f33554d);
            valueAnimator.setRepeatMode(this.f33555e);
        }
    }

    /* renamed from: b */
    public final TimeInterpolator mo40473b() {
        TimeInterpolator timeInterpolator = this.f33553c;
        return timeInterpolator != null ? timeInterpolator : C13577a.f33538b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13584h)) {
            return false;
        }
        C13584h hVar = (C13584h) obj;
        if (this.f33551a == hVar.f33551a && this.f33552b == hVar.f33552b && this.f33554d == hVar.f33554d && this.f33555e == hVar.f33555e) {
            return mo40473b().getClass().equals(hVar.mo40473b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f33551a;
        long j2 = this.f33552b;
        return ((((mo40473b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.f33554d) * 31) + this.f33555e;
    }

    public final String toString() {
        StringBuilder q = C25541a.m63886q(10);
        q.append(C13584h.class.getName());
        q.append('{');
        q.append(Integer.toHexString(System.identityHashCode(this)));
        q.append(" delay: ");
        q.append(this.f33551a);
        q.append(" duration: ");
        q.append(this.f33552b);
        q.append(" interpolator: ");
        q.append(mo40473b().getClass());
        q.append(" repeatCount: ");
        q.append(this.f33554d);
        q.append(" repeatMode: ");
        return C13437d.m33707l(q, this.f33555e, "}\n");
    }

    public C13584h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f33554d = 0;
        this.f33555e = 1;
        this.f33551a = j;
        this.f33552b = j2;
        this.f33553c = timeInterpolator;
    }
}
