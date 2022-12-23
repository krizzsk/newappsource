package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p305x0.C7133d;

public class DependencyNode implements C7133d {

    /* renamed from: a */
    public WidgetRun f2464a = null;

    /* renamed from: b */
    public boolean f2465b = false;

    /* renamed from: c */
    public boolean f2466c = false;

    /* renamed from: d */
    public WidgetRun f2467d;

    /* renamed from: e */
    public Type f2468e = Type.UNKNOWN;

    /* renamed from: f */
    public int f2469f;

    /* renamed from: g */
    public int f2470g;

    /* renamed from: h */
    public int f2471h = 1;

    /* renamed from: i */
    public C0689a f2472i = null;

    /* renamed from: j */
    public boolean f2473j = false;

    /* renamed from: k */
    public ArrayList f2474k = new ArrayList();

    /* renamed from: l */
    public ArrayList f2475l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f2467d = widgetRun;
    }

    /* renamed from: a */
    public final void mo2815a(C7133d dVar) {
        Iterator it = this.f2475l.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f2473j) {
                return;
            }
        }
        this.f2466c = true;
        WidgetRun widgetRun = this.f2464a;
        if (widgetRun != null) {
            widgetRun.mo2815a(this);
        }
        if (this.f2465b) {
            this.f2467d.mo2815a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i = 0;
        Iterator it2 = this.f2475l.iterator();
        while (it2.hasNext()) {
            DependencyNode dependencyNode2 = (DependencyNode) it2.next();
            if (!(dependencyNode2 instanceof C0689a)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.f2473j) {
            C0689a aVar = this.f2472i;
            if (aVar != null) {
                if (aVar.f2473j) {
                    this.f2469f = this.f2471h * aVar.f2470g;
                } else {
                    return;
                }
            }
            mo2818d(dependencyNode.f2470g + this.f2469f);
        }
        WidgetRun widgetRun2 = this.f2464a;
        if (widgetRun2 != null) {
            widgetRun2.mo2815a(this);
        }
    }

    /* renamed from: b */
    public final void mo2816b(C7133d dVar) {
        this.f2474k.add(dVar);
        if (this.f2473j) {
            dVar.mo2815a(dVar);
        }
    }

    /* renamed from: c */
    public final void mo2817c() {
        this.f2475l.clear();
        this.f2474k.clear();
        this.f2473j = false;
        this.f2470g = 0;
        this.f2466c = false;
        this.f2465b = false;
    }

    /* renamed from: d */
    public void mo2818d(int i) {
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

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2467d.f2477b.f2433l0);
        sb.append(":");
        sb.append(this.f2468e);
        sb.append("(");
        if (this.f2473j) {
            obj = Integer.valueOf(this.f2470g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f2475l.size());
        sb.append(":d=");
        sb.append(this.f2474k.size());
        sb.append(">");
        return sb.toString();
    }
}
