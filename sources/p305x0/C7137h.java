package p305x0;

import androidx.constraintlayout.core.widgets.C0700f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* renamed from: x0.h */
public final class C7137h extends WidgetRun {
    public C7137h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f2416d.mo2823f();
        constraintWidget.f2418e.mo2823f();
        this.f2481f = ((C0700f) constraintWidget).f2574A0;
    }

    /* renamed from: a */
    public final void mo2815a(C7133d dVar) {
        DependencyNode dependencyNode = this.f2483h;
        if (dependencyNode.f2466c && !dependencyNode.f2473j) {
            this.f2483h.mo2818d((int) ((((float) ((DependencyNode) dependencyNode.f2475l.get(0)).f2470g) * ((C0700f) this.f2477b).f2576w0) + 0.5f));
        }
    }

    /* renamed from: d */
    public final void mo2821d() {
        ConstraintWidget constraintWidget = this.f2477b;
        C0700f fVar = (C0700f) constraintWidget;
        int i = fVar.f2577x0;
        int i2 = fVar.f2578y0;
        if (fVar.f2574A0 == 1) {
            if (i != -1) {
                this.f2483h.f2475l.add(constraintWidget.f2406W.f2416d.f2483h);
                this.f2477b.f2406W.f2416d.f2483h.f2474k.add(this.f2483h);
                this.f2483h.f2469f = i;
            } else if (i2 != -1) {
                this.f2483h.f2475l.add(constraintWidget.f2406W.f2416d.f2484i);
                this.f2477b.f2406W.f2416d.f2484i.f2474k.add(this.f2483h);
                this.f2483h.f2469f = -i2;
            } else {
                DependencyNode dependencyNode = this.f2483h;
                dependencyNode.f2465b = true;
                dependencyNode.f2475l.add(constraintWidget.f2406W.f2416d.f2484i);
                this.f2477b.f2406W.f2416d.f2484i.f2474k.add(this.f2483h);
            }
            mo23392m(this.f2477b.f2416d.f2483h);
            mo23392m(this.f2477b.f2416d.f2484i);
            return;
        }
        if (i != -1) {
            this.f2483h.f2475l.add(constraintWidget.f2406W.f2418e.f2483h);
            this.f2477b.f2406W.f2418e.f2483h.f2474k.add(this.f2483h);
            this.f2483h.f2469f = i;
        } else if (i2 != -1) {
            this.f2483h.f2475l.add(constraintWidget.f2406W.f2418e.f2484i);
            this.f2477b.f2406W.f2418e.f2484i.f2474k.add(this.f2483h);
            this.f2483h.f2469f = -i2;
        } else {
            DependencyNode dependencyNode2 = this.f2483h;
            dependencyNode2.f2465b = true;
            dependencyNode2.f2475l.add(constraintWidget.f2406W.f2418e.f2484i);
            this.f2477b.f2406W.f2418e.f2484i.f2474k.add(this.f2483h);
        }
        mo23392m(this.f2477b.f2418e.f2483h);
        mo23392m(this.f2477b.f2418e.f2484i);
    }

    /* renamed from: e */
    public final void mo2822e() {
        ConstraintWidget constraintWidget = this.f2477b;
        if (((C0700f) constraintWidget).f2574A0 == 1) {
            constraintWidget.f2413b0 = this.f2483h.f2470g;
        } else {
            constraintWidget.f2415c0 = this.f2483h.f2470g;
        }
    }

    /* renamed from: f */
    public final void mo2823f() {
        this.f2483h.mo2817c();
    }

    /* renamed from: k */
    public final boolean mo2826k() {
        return false;
    }

    /* renamed from: m */
    public final void mo23392m(DependencyNode dependencyNode) {
        this.f2483h.f2474k.add(dependencyNode);
        dependencyNode.f2475l.add(this.f2483h);
    }
}
