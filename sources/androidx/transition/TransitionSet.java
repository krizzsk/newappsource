package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import ci0.C21211f;
import java.util.ArrayList;
import java.util.Iterator;
import p001a0.C0016g;
import p116i1.C5256j;
import p330z2.C7438n;
import p330z2.C7441q;
import p330z2.C7442r;

public class TransitionSet extends Transition {

    /* renamed from: A */
    public boolean f4968A = true;

    /* renamed from: B */
    public int f4969B;

    /* renamed from: C */
    public boolean f4970C = false;

    /* renamed from: D */
    public int f4971D = 0;

    /* renamed from: z */
    public ArrayList<Transition> f4972z = new ArrayList<>();

    /* renamed from: androidx.transition.TransitionSet$a */
    public class C1316a extends C1327f {

        /* renamed from: a */
        public final /* synthetic */ Transition f4973a;

        public C1316a(Transition transition) {
            this.f4973a = transition;
        }

        /* renamed from: d */
        public final void mo5377d(Transition transition) {
            this.f4973a.mo5430z();
            transition.mo5427w(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    public static class C1317b extends C1327f {

        /* renamed from: a */
        public TransitionSet f4974a;

        public C1317b(TransitionSet transitionSet) {
            this.f4974a = transitionSet;
        }

        /* renamed from: d */
        public final void mo5377d(Transition transition) {
            TransitionSet transitionSet = this.f4974a;
            int i = transitionSet.f4969B - 1;
            transitionSet.f4969B = i;
            if (i == 0) {
                transitionSet.f4970C = false;
                transitionSet.mo5420m();
            }
            transition.mo5427w(this);
        }

        /* renamed from: e */
        public final void mo5432e() {
            TransitionSet transitionSet = this.f4974a;
            if (!transitionSet.f4970C) {
                transitionSet.mo5409H();
                this.f4974a.f4970C = true;
            }
        }
    }

    public TransitionSet() {
    }

    /* renamed from: B */
    public final void mo5404B(Transition.C1314c cVar) {
        this.f4961u = cVar;
        this.f4971D |= 8;
        int size = this.f4972z.size();
        for (int i = 0; i < size; i++) {
            this.f4972z.get(i).mo5404B(cVar);
        }
    }

    /* renamed from: E */
    public final void mo5406E(PathMotion pathMotion) {
        super.mo5406E(pathMotion);
        this.f4971D |= 4;
        if (this.f4972z != null) {
            for (int i = 0; i < this.f4972z.size(); i++) {
                this.f4972z.get(i).mo5406E(pathMotion);
            }
        }
    }

    /* renamed from: F */
    public final void mo5407F(C21211f fVar) {
        this.f4960t = fVar;
        this.f4971D |= 2;
        int size = this.f4972z.size();
        for (int i = 0; i < size; i++) {
            this.f4972z.get(i).mo5407F(fVar);
        }
    }

    /* renamed from: G */
    public final void mo5408G(long j) {
        this.f4943c = j;
    }

    /* renamed from: I */
    public final String mo5410I(String str) {
        String I = super.mo5410I(str);
        for (int i = 0; i < this.f4972z.size(); i++) {
            StringBuilder t = C0016g.m36t(I, "\n");
            t.append(this.f4972z.get(i).mo5410I(str + "  "));
            I = t.toString();
        }
        return I;
    }

    /* renamed from: J */
    public final void mo5433J(Transition transition) {
        this.f4972z.add(transition);
        transition.f4950j = this;
        long j = this.f4944d;
        if (j >= 0) {
            transition.mo5403A(j);
        }
        if ((this.f4971D & 1) != 0) {
            transition.mo5405D(this.f4945e);
        }
        if ((this.f4971D & 2) != 0) {
            transition.mo5407F(this.f4960t);
        }
        if ((this.f4971D & 4) != 0) {
            transition.mo5406E(this.f4962v);
        }
        if ((this.f4971D & 8) != 0) {
            transition.mo5404B(this.f4961u);
        }
    }

    /* renamed from: K */
    public final void mo5403A(long j) {
        ArrayList<Transition> arrayList;
        this.f4944d = j;
        if (j >= 0 && (arrayList = this.f4972z) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4972z.get(i).mo5403A(j);
            }
        }
    }

    /* renamed from: L */
    public final void mo5405D(TimeInterpolator timeInterpolator) {
        this.f4971D |= 1;
        ArrayList<Transition> arrayList = this.f4972z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4972z.get(i).mo5405D(timeInterpolator);
            }
        }
        this.f4945e = timeInterpolator;
    }

    /* renamed from: M */
    public final void mo5436M(int i) {
        if (i == 0) {
            this.f4968A = true;
        } else if (i == 1) {
            this.f4968A = false;
        } else {
            throw new AndroidRuntimeException(C16759e.m42349e("Invalid parameter for TransitionSet ordering: ", i));
        }
    }

    /* renamed from: a */
    public final void mo5411a(Transition.C1315d dVar) {
        super.mo5411a(dVar);
    }

    /* renamed from: b */
    public final void mo5412b(View view) {
        for (int i = 0; i < this.f4972z.size(); i++) {
            this.f4972z.get(i).mo5412b(view);
        }
        this.f4947g.add(view);
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        if (mo5424t(qVar.f22855b)) {
            Iterator<Transition> it = this.f4972z.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo5424t(qVar.f22855b)) {
                    next.mo5356d(qVar);
                    qVar.f22856c.add(next);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo5415f(C7441q qVar) {
        super.mo5415f(qVar);
        int size = this.f4972z.size();
        for (int i = 0; i < size; i++) {
            this.f4972z.get(i).mo5415f(qVar);
        }
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        if (mo5424t(qVar.f22855b)) {
            Iterator<Transition> it = this.f4972z.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo5424t(qVar.f22855b)) {
                    next.mo5357g(qVar);
                    qVar.f22856c.add(next);
                }
            }
        }
    }

    /* renamed from: j */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f4972z = new ArrayList<>();
        int size = this.f4972z.size();
        for (int i = 0; i < size; i++) {
            Transition j = this.f4972z.get(i).clone();
            transitionSet.f4972z.add(j);
            j.f4950j = transitionSet;
        }
        return transitionSet;
    }

    /* renamed from: l */
    public final void mo5419l(ViewGroup viewGroup, C7442r rVar, C7442r rVar2, ArrayList<C7441q> arrayList, ArrayList<C7441q> arrayList2) {
        long j = this.f4943c;
        int size = this.f4972z.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f4972z.get(i);
            if (j > 0 && (this.f4968A || i == 0)) {
                long j2 = transition.f4943c;
                if (j2 > 0) {
                    transition.mo5408G(j2 + j);
                } else {
                    transition.mo5408G(j);
                }
            }
            transition.mo5419l(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: v */
    public final void mo5426v(View view) {
        super.mo5426v(view);
        int size = this.f4972z.size();
        for (int i = 0; i < size; i++) {
            this.f4972z.get(i).mo5426v(view);
        }
    }

    /* renamed from: w */
    public final void mo5427w(Transition.C1315d dVar) {
        super.mo5427w(dVar);
    }

    /* renamed from: x */
    public final void mo5428x(View view) {
        for (int i = 0; i < this.f4972z.size(); i++) {
            this.f4972z.get(i).mo5428x(view);
        }
        this.f4947g.remove(view);
    }

    /* renamed from: y */
    public final void mo5429y(ViewGroup viewGroup) {
        super.mo5429y(viewGroup);
        int size = this.f4972z.size();
        for (int i = 0; i < size; i++) {
            this.f4972z.get(i).mo5429y(viewGroup);
        }
    }

    /* renamed from: z */
    public final void mo5430z() {
        if (this.f4972z.isEmpty()) {
            mo5409H();
            mo5420m();
            return;
        }
        C1317b bVar = new C1317b(this);
        Iterator<Transition> it = this.f4972z.iterator();
        while (it.hasNext()) {
            it.next().mo5411a(bVar);
        }
        this.f4969B = this.f4972z.size();
        if (!this.f4968A) {
            for (int i = 1; i < this.f4972z.size(); i++) {
                this.f4972z.get(i - 1).mo5411a(new C1316a(this.f4972z.get(i)));
            }
            Transition transition = this.f4972z.get(0);
            if (transition != null) {
                transition.mo5430z();
                return;
            }
            return;
        }
        Iterator<Transition> it2 = this.f4972z.iterator();
        while (it2.hasNext()) {
            it2.next().mo5430z();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22848g);
        mo5436M(C5256j.m13275c(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
