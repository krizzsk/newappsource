package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import java.util.Iterator;
import p305x0.C7133d;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.a */
public class C0689a extends DependencyNode {

    /* renamed from: m */
    public int f2487m;

    public C0689a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof C0691c) {
            this.f2468e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f2468e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: d */
    public final void mo2818d(int i) {
        if (!this.f2473j) {
            this.f2473j = true;
            this.f2470g = i;
            Iterator it = this.f2474k.iterator();
            while (it.hasNext()) {
                C7133d dVar = (C7133d) it.next();
                dVar.mo2815a(dVar);
            }
        }
    }
}
