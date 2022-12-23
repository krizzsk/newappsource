package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0687a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;
import p305x0.C7133d;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.b */
public final class C0690b extends WidgetRun {
    public C0690b(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* renamed from: a */
    public final void mo2815a(C7133d dVar) {
        C0687a aVar = (C0687a) this.f2477b;
        int i = aVar.f2462y0;
        Iterator it = this.f2483h.f2475l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((DependencyNode) it.next()).f2470g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f2483h.mo2818d(i3 + aVar.f2460A0);
        } else {
            this.f2483h.mo2818d(i2 + aVar.f2460A0);
        }
    }

    /* renamed from: d */
    public final void mo2821d() {
        ConstraintWidget constraintWidget = this.f2477b;
        if (constraintWidget instanceof C0687a) {
            DependencyNode dependencyNode = this.f2483h;
            dependencyNode.f2465b = true;
            C0687a aVar = (C0687a) constraintWidget;
            int i = aVar.f2462y0;
            boolean z = aVar.f2463z0;
            int i2 = 0;
            if (i == 0) {
                dependencyNode.f2468e = DependencyNode.Type.LEFT;
                while (i2 < aVar.f21717x0) {
                    ConstraintWidget constraintWidget2 = aVar.f21716w0[i2];
                    if (z || constraintWidget2.f2429j0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.f2416d.f2483h;
                        dependencyNode2.f2474k.add(this.f2483h);
                        this.f2483h.f2475l.add(dependencyNode2);
                    }
                    i2++;
                }
                mo2828m(this.f2477b.f2416d.f2483h);
                mo2828m(this.f2477b.f2416d.f2484i);
            } else if (i == 1) {
                dependencyNode.f2468e = DependencyNode.Type.RIGHT;
                while (i2 < aVar.f21717x0) {
                    ConstraintWidget constraintWidget3 = aVar.f21716w0[i2];
                    if (z || constraintWidget3.f2429j0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.f2416d.f2484i;
                        dependencyNode3.f2474k.add(this.f2483h);
                        this.f2483h.f2475l.add(dependencyNode3);
                    }
                    i2++;
                }
                mo2828m(this.f2477b.f2416d.f2483h);
                mo2828m(this.f2477b.f2416d.f2484i);
            } else if (i == 2) {
                dependencyNode.f2468e = DependencyNode.Type.TOP;
                while (i2 < aVar.f21717x0) {
                    ConstraintWidget constraintWidget4 = aVar.f21716w0[i2];
                    if (z || constraintWidget4.f2429j0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f2418e.f2483h;
                        dependencyNode4.f2474k.add(this.f2483h);
                        this.f2483h.f2475l.add(dependencyNode4);
                    }
                    i2++;
                }
                mo2828m(this.f2477b.f2418e.f2483h);
                mo2828m(this.f2477b.f2418e.f2484i);
            } else if (i == 3) {
                dependencyNode.f2468e = DependencyNode.Type.BOTTOM;
                while (i2 < aVar.f21717x0) {
                    ConstraintWidget constraintWidget5 = aVar.f21716w0[i2];
                    if (z || constraintWidget5.f2429j0 != 8) {
                        DependencyNode dependencyNode5 = constraintWidget5.f2418e.f2484i;
                        dependencyNode5.f2474k.add(this.f2483h);
                        this.f2483h.f2475l.add(dependencyNode5);
                    }
                    i2++;
                }
                mo2828m(this.f2477b.f2418e.f2483h);
                mo2828m(this.f2477b.f2418e.f2484i);
            }
        }
    }

    /* renamed from: e */
    public final void mo2822e() {
        ConstraintWidget constraintWidget = this.f2477b;
        if (constraintWidget instanceof C0687a) {
            int i = ((C0687a) constraintWidget).f2462y0;
            if (i == 0 || i == 1) {
                constraintWidget.f2413b0 = this.f2483h.f2470g;
            } else {
                constraintWidget.f2415c0 = this.f2483h.f2470g;
            }
        }
    }

    /* renamed from: f */
    public final void mo2823f() {
        this.f2478c = null;
        this.f2483h.mo2817c();
    }

    /* renamed from: k */
    public final boolean mo2826k() {
        return false;
    }

    /* renamed from: m */
    public final void mo2828m(DependencyNode dependencyNode) {
        this.f2483h.f2474k.add(dependencyNode);
        dependencyNode.f2475l.add(this.f2483h);
    }
}
