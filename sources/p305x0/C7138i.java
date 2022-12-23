package p305x0;

import androidx.constraintlayout.core.widgets.analyzer.C0690b;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* renamed from: x0.i */
public final class C7138i {

    /* renamed from: a */
    public WidgetRun f22171a = null;

    /* renamed from: b */
    public ArrayList<WidgetRun> f22172b = new ArrayList<>();

    public C7138i(WidgetRun widgetRun) {
        this.f22171a = widgetRun;
    }

    /* renamed from: a */
    public static long m16699a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f2467d;
        if (widgetRun instanceof C0690b) {
            return j;
        }
        int size = dependencyNode.f2474k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C7133d dVar = (C7133d) dependencyNode.f2474k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f2467d != widgetRun) {
                    j2 = Math.min(j2, m16699a(dependencyNode2, ((long) dependencyNode2.f2469f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f2484i) {
            return j2;
        }
        long j3 = j - widgetRun.mo2825j();
        return Math.min(Math.min(j2, m16699a(widgetRun.f2483h, j3)), j3 - ((long) widgetRun.f2483h.f2469f));
    }

    /* renamed from: b */
    public static long m16700b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f2467d;
        if (widgetRun instanceof C0690b) {
            return j;
        }
        int size = dependencyNode.f2474k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C7133d dVar = (C7133d) dependencyNode.f2474k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f2467d != widgetRun) {
                    j2 = Math.max(j2, m16700b(dependencyNode2, ((long) dependencyNode2.f2469f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f2483h) {
            return j2;
        }
        long j3 = j + widgetRun.mo2825j();
        return Math.max(Math.max(j2, m16700b(widgetRun.f2484i, j3)), j3 - ((long) widgetRun.f2484i.f2469f));
    }
}
