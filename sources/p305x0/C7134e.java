package p305x0;

import androidx.constraintlayout.core.widgets.C0697d;
import androidx.constraintlayout.core.widgets.C0700f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C0689a;
import androidx.constraintlayout.core.widgets.analyzer.C0690b;
import androidx.constraintlayout.core.widgets.analyzer.C0691c;
import androidx.constraintlayout.core.widgets.analyzer.C0693d;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p292w0.C6961b;
import p305x0.C7129b;

/* renamed from: x0.e */
public final class C7134e {

    /* renamed from: a */
    public C0697d f22162a;

    /* renamed from: b */
    public boolean f22163b = true;

    /* renamed from: c */
    public boolean f22164c = true;

    /* renamed from: d */
    public C0697d f22165d;

    /* renamed from: e */
    public ArrayList<WidgetRun> f22166e = new ArrayList<>();

    /* renamed from: f */
    public C7129b.C7131b f22167f;

    /* renamed from: g */
    public C7129b.C7130a f22168g;

    /* renamed from: h */
    public ArrayList<C7138i> f22169h;

    public C7134e(C0697d dVar) {
        new ArrayList();
        this.f22167f = null;
        this.f22168g = new C7129b.C7130a();
        this.f22169h = new ArrayList<>();
        this.f22162a = dVar;
        this.f22165d = dVar;
    }

    /* renamed from: a */
    public final void mo23385a(DependencyNode dependencyNode, int i, int i2, ArrayList arrayList, C7138i iVar) {
        WidgetRun widgetRun = dependencyNode.f2467d;
        if (widgetRun.f2478c == null) {
            C0697d dVar = this.f22162a;
            if (widgetRun != dVar.f2416d && widgetRun != dVar.f2418e) {
                if (iVar == null) {
                    iVar = new C7138i(widgetRun);
                    arrayList.add(iVar);
                }
                widgetRun.f2478c = iVar;
                iVar.f22172b.add(widgetRun);
                Iterator it = widgetRun.f2483h.f2474k.iterator();
                while (it.hasNext()) {
                    C7133d dVar2 = (C7133d) it.next();
                    if (dVar2 instanceof DependencyNode) {
                        mo23385a((DependencyNode) dVar2, i, 0, arrayList, iVar);
                    }
                }
                Iterator it2 = widgetRun.f2484i.f2474k.iterator();
                while (it2.hasNext()) {
                    C7133d dVar3 = (C7133d) it2.next();
                    if (dVar3 instanceof DependencyNode) {
                        mo23385a((DependencyNode) dVar3, i, 1, arrayList, iVar);
                    }
                }
                if (i == 1 && (widgetRun instanceof C0693d)) {
                    Iterator it3 = ((C0693d) widgetRun).f2490k.f2474k.iterator();
                    while (it3.hasNext()) {
                        C7133d dVar4 = (C7133d) it3.next();
                        if (dVar4 instanceof DependencyNode) {
                            mo23385a((DependencyNode) dVar4, i, 2, arrayList, iVar);
                        }
                    }
                }
                Iterator it4 = widgetRun.f2483h.f2475l.iterator();
                while (it4.hasNext()) {
                    mo23385a((DependencyNode) it4.next(), i, 0, arrayList, iVar);
                }
                Iterator it5 = widgetRun.f2484i.f2475l.iterator();
                while (it5.hasNext()) {
                    mo23385a((DependencyNode) it5.next(), i, 1, arrayList, iVar);
                }
                if (i == 1 && (widgetRun instanceof C0693d)) {
                    Iterator it6 = ((C0693d) widgetRun).f2490k.f2475l.iterator();
                    while (it6.hasNext()) {
                        mo23385a((DependencyNode) it6.next(), i, 2, arrayList, iVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027a, code lost:
        r3 = r0.f2405V;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23386b(androidx.constraintlayout.core.widgets.C0697d r18) {
        /*
            r17 = this;
            r0 = r18
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.f21718w0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x032f
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.f2405V
            r4 = 0
            r5 = r3[r4]
            r9 = 1
            r3 = r3[r9]
            int r6 = r2.f2429j0
            r7 = 8
            if (r6 != r7) goto L_0x0025
            r2.f2410a = r9
            goto L_0x0008
        L_0x0025:
            float r6 = r2.f2455x
            r10 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0034
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r8) goto L_0x0034
            r2.f2446s = r7
        L_0x0034:
            float r8 = r2.f2384A
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0040
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r11) goto L_0x0040
            r2.f2448t = r7
        L_0x0040:
            float r11 = r2.f2409Z
            r12 = 0
            r13 = 3
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0074
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r11) goto L_0x0057
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 == r12) goto L_0x0054
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r12) goto L_0x0057
        L_0x0054:
            r2.f2446s = r13
            goto L_0x0074
        L_0x0057:
            if (r3 != r11) goto L_0x0064
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r12) goto L_0x0061
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r12) goto L_0x0064
        L_0x0061:
            r2.f2448t = r13
            goto L_0x0074
        L_0x0064:
            if (r5 != r11) goto L_0x0074
            if (r3 != r11) goto L_0x0074
            int r11 = r2.f2446s
            if (r11 != 0) goto L_0x006e
            r2.f2446s = r13
        L_0x006e:
            int r11 = r2.f2448t
            if (r11 != 0) goto L_0x0074
            r2.f2448t = r13
        L_0x0074:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r11) goto L_0x008a
            int r12 = r2.f2446s
            if (r12 != r9) goto L_0x008a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r2.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f2379f
            if (r12 == 0) goto L_0x0088
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r2.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f2379f
            if (r12 != 0) goto L_0x008a
        L_0x0088:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x008a:
            if (r3 != r11) goto L_0x009e
            int r12 = r2.f2448t
            if (r12 != r9) goto L_0x009e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r2.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f2379f
            if (r12 == 0) goto L_0x009c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r2.f2397N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f2379f
            if (r12 != 0) goto L_0x009e
        L_0x009c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x009e:
            r12 = r3
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            r3.f2479d = r5
            int r14 = r2.f2446s
            r3.f2476a = r14
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            r3.f2479d = r12
            int r15 = r2.f2448t
            r3.f2476a = r15
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 == r3) goto L_0x00bb
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r10) goto L_0x00bb
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r10) goto L_0x00c7
        L_0x00bb:
            if (r12 == r3) goto L_0x02dd
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r10) goto L_0x02dd
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 != r10) goto L_0x00c7
            goto L_0x02dd
        L_0x00c7:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r11) goto L_0x0197
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r7) goto L_0x00d3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 != r4) goto L_0x0197
        L_0x00d3:
            if (r14 != r13) goto L_0x010e
            if (r12 != r7) goto L_0x00e0
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r7
            r3.mo23390f(r4, r5, r6, r7, r8)
        L_0x00e0:
            int r8 = r2.mo2802o()
            float r3 = (float) r8
            float r4 = r2.f2409Z
            float r3 = r3 * r4
            float r3 = r3 + r10
            int r6 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r17
            r4 = r2
            r5 = r7
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2802o()
            r3.mo2818d(r4)
            r2.f2410a = r9
            goto L_0x0008
        L_0x010e:
            if (r14 != r9) goto L_0x0126
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r7
            r7 = r12
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r2 = r2.mo2807u()
            r3.f2487m = r2
            goto L_0x0008
        L_0x0126:
            r4 = 2
            if (r14 != r4) goto L_0x0163
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f2405V
            r7 = 0
            r4 = r4[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r7) goto L_0x0134
            if (r4 != r3) goto L_0x0197
        L_0x0134:
            int r3 = r18.mo2807u()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r10
            int r6 = (int) r6
            int r8 = r2.mo2802o()
            r3 = r17
            r4 = r2
            r5 = r7
            r7 = r12
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2802o()
            r3.mo2818d(r4)
            r2.f2410a = r9
            goto L_0x0008
        L_0x0163:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.f2402S
            r16 = 0
            r10 = r4[r16]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.f2379f
            if (r10 == 0) goto L_0x0173
            r4 = r4[r9]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2379f
            if (r4 != 0) goto L_0x0197
        L_0x0173:
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r7
            r7 = r12
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2802o()
            r3.mo2818d(r4)
            r2.f2410a = r9
            goto L_0x0008
        L_0x0197:
            if (r12 != r11) goto L_0x026c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r7) goto L_0x01a1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r4) goto L_0x026c
        L_0x01a1:
            if (r15 != r13) goto L_0x01e7
            if (r5 != r7) goto L_0x01ae
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r7
            r3.mo23390f(r4, r5, r6, r7, r8)
        L_0x01ae:
            int r6 = r2.mo2807u()
            float r3 = r2.f2409Z
            int r4 = r2.f2411a0
            r5 = -1
            if (r4 != r5) goto L_0x01bd
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01bd:
            float r4 = (float) r6
            float r4 = r4 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r3
            int r8 = (int) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r17
            r4 = r2
            r5 = r7
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2802o()
            r3.mo2818d(r4)
            r2.f2410a = r9
            goto L_0x0008
        L_0x01e7:
            if (r15 != r9) goto L_0x01fd
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r2 = r2.mo2802o()
            r3.f2487m = r2
            goto L_0x0008
        L_0x01fd:
            r4 = 2
            if (r15 != r4) goto L_0x0239
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f2405V
            r4 = r4[r9]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r7) goto L_0x020a
            if (r4 != r3) goto L_0x026c
        L_0x020a:
            int r6 = r2.mo2807u()
            int r3 = r18.mo2802o()
            float r3 = (float) r3
            float r8 = r8 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r3
            int r8 = (int) r8
            r3 = r17
            r4 = r2
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2802o()
            r3.mo2818d(r4)
            r2.f2410a = r9
            goto L_0x0008
        L_0x0239:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r2.f2402S
            r4 = 2
            r10 = r3[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.f2379f
            if (r4 == 0) goto L_0x0248
            r3 = r3[r13]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2379f
            if (r3 != 0) goto L_0x026c
        L_0x0248:
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r7
            r7 = r12
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2802o()
            r3.mo2818d(r4)
            r2.f2410a = r9
            goto L_0x0008
        L_0x026c:
            if (r5 != r11) goto L_0x0008
            if (r12 != r11) goto L_0x0008
            if (r14 == r9) goto L_0x02bc
            if (r15 != r9) goto L_0x0275
            goto L_0x02bc
        L_0x0275:
            r3 = 2
            if (r15 != r3) goto L_0x0008
            if (r14 != r3) goto L_0x0008
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r0.f2405V
            r4 = 0
            r4 = r3[r4]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r7) goto L_0x0008
            r3 = r3[r9]
            if (r3 != r7) goto L_0x0008
            int r3 = r18.mo2807u()
            float r3 = (float) r3
            float r6 = r6 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r3
            int r6 = (int) r6
            int r4 = r18.mo2802o()
            float r4 = (float) r4
            float r8 = r8 * r4
            float r8 = r8 + r3
            int r8 = (int) r8
            r3 = r17
            r4 = r2
            r5 = r7
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2802o()
            r3.mo2818d(r4)
            r2.f2410a = r9
            goto L_0x0008
        L_0x02bc:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r7
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.f2487m = r4
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r2 = r2.mo2802o()
            r3.f2487m = r2
            goto L_0x0008
        L_0x02dd:
            int r4 = r2.mo2807u()
            if (r5 != r3) goto L_0x02f3
            int r4 = r18.mo2807u()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f2394K
            int r5 = r5.f2380g
            int r4 = r4 - r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f2396M
            int r5 = r5.f2380g
            int r4 = r4 - r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
        L_0x02f3:
            r6 = r4
            int r4 = r2.mo2802o()
            if (r12 != r3) goto L_0x030d
            int r3 = r18.mo2802o()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f2395L
            int r4 = r4.f2380g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f2397N
            int r4 = r4.f2380g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r8 = r3
            r7 = r4
            goto L_0x030f
        L_0x030d:
            r8 = r4
            r7 = r12
        L_0x030f:
            r3 = r17
            r4 = r2
            r3.mo23390f(r4, r5, r6, r7, r8)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2807u()
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r4 = r2.mo2802o()
            r3.mo2818d(r4)
            r2.f2410a = r9
            goto L_0x0008
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305x0.C7134e.mo23386b(androidx.constraintlayout.core.widgets.d):void");
    }

    /* renamed from: c */
    public final void mo23387c() {
        ArrayList<WidgetRun> arrayList = this.f22166e;
        arrayList.clear();
        this.f22165d.f2416d.mo2823f();
        this.f22165d.f2418e.mo2823f();
        arrayList.add(this.f22165d.f2416d);
        arrayList.add(this.f22165d.f2418e);
        Iterator<ConstraintWidget> it = this.f22165d.f21718w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof C0700f) {
                arrayList.add(new C7137h(next));
            } else {
                if (next.mo2774B()) {
                    if (next.f2412b == null) {
                        next.f2412b = new C7132c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2412b);
                } else {
                    arrayList.add(next.f2416d);
                }
                if (next.mo2775C()) {
                    if (next.f2414c == null) {
                        next.f2414c = new C7132c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2414c);
                } else {
                    arrayList.add(next.f2418e);
                }
                if (next instanceof C6961b) {
                    arrayList.add(new C0690b(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo2823f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f2477b != this.f22165d) {
                next2.mo2821d();
            }
        }
        this.f22169h.clear();
        mo23389e(this.f22162a.f2416d, 0, this.f22169h);
        mo23389e(this.f22162a.f2418e, 1, this.f22169h);
        this.f22163b = false;
    }

    /* renamed from: d */
    public final int mo23388d(C0697d dVar, int i) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        float f;
        long j;
        C7134e eVar = this;
        C0697d dVar2 = dVar;
        int i2 = i;
        int size = eVar.f22169h.size();
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (i3 < size) {
            C7138i iVar = eVar.f22169h.get(i3);
            WidgetRun widgetRun3 = iVar.f22171a;
            if (widgetRun3 instanceof C7132c) {
                if (((C7132c) widgetRun3).f2481f != i2) {
                    j2 = Math.max(j2, j3);
                    i3++;
                    j3 = 0;
                    eVar = this;
                    dVar2 = dVar;
                }
            } else if (i2 == 0) {
                if (!(widgetRun3 instanceof C0691c)) {
                    j2 = Math.max(j2, j3);
                    i3++;
                    j3 = 0;
                    eVar = this;
                    dVar2 = dVar;
                }
            } else if (!(widgetRun3 instanceof C0693d)) {
                j2 = Math.max(j2, j3);
                i3++;
                j3 = 0;
                eVar = this;
                dVar2 = dVar;
            }
            if (i2 == 0) {
                widgetRun = dVar2.f2416d;
            } else {
                widgetRun = dVar2.f2418e;
            }
            DependencyNode dependencyNode = widgetRun.f2483h;
            if (i2 == 0) {
                widgetRun2 = dVar2.f2416d;
            } else {
                widgetRun2 = dVar2.f2418e;
            }
            DependencyNode dependencyNode2 = widgetRun2.f2484i;
            boolean contains = widgetRun3.f2483h.f2475l.contains(dependencyNode);
            boolean contains2 = iVar.f22171a.f2484i.f2475l.contains(dependencyNode2);
            long j4 = iVar.f22171a.mo2825j();
            if (!contains || !contains2) {
                if (contains) {
                    DependencyNode dependencyNode3 = iVar.f22171a.f2483h;
                    j3 = Math.max(C7138i.m16700b(dependencyNode3, (long) dependencyNode3.f2469f), ((long) iVar.f22171a.f2483h.f2469f) + j4);
                } else if (contains2) {
                    DependencyNode dependencyNode4 = iVar.f22171a.f2484i;
                    j3 = Math.max(-C7138i.m16699a(dependencyNode4, (long) dependencyNode4.f2469f), ((long) (-iVar.f22171a.f2484i.f2469f)) + j4);
                } else {
                    WidgetRun widgetRun4 = iVar.f22171a;
                    j3 = (widgetRun4.mo2825j() + ((long) widgetRun4.f2483h.f2469f)) - ((long) iVar.f22171a.f2484i.f2469f);
                }
                j2 = Math.max(j2, j3);
                i3++;
                j3 = 0;
                eVar = this;
                dVar2 = dVar;
            } else {
                long b = C7138i.m16700b(iVar.f22171a.f2483h, j3);
                long a = C7138i.m16699a(iVar.f22171a.f2484i, j3);
                long j5 = b - j4;
                WidgetRun widgetRun5 = iVar.f22171a;
                int i4 = widgetRun5.f2484i.f2469f;
                if (j5 >= ((long) (-i4))) {
                    j5 += (long) i4;
                }
                long j6 = (long) widgetRun5.f2483h.f2469f;
                long j7 = ((-a) - j4) - j6;
                if (j7 >= j6) {
                    j7 -= j6;
                }
                ConstraintWidget constraintWidget = widgetRun5.f2477b;
                if (i2 == 0) {
                    f = constraintWidget.f2423g0;
                } else if (i2 == 1) {
                    f = constraintWidget.f2425h0;
                } else {
                    constraintWidget.getClass();
                    f = -1.0f;
                }
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    j = (long) ((((float) j5) / (1.0f - f)) + (((float) j7) / f));
                } else {
                    j = 0;
                }
                float f2 = (float) j;
                long c = ((long) ((f2 * f) + 0.5f)) + j4 + ((long) C16759e.m42347c(1.0f, f, f2, 0.5f));
                WidgetRun widgetRun6 = iVar.f22171a;
                j3 = (((long) widgetRun6.f2483h.f2469f) + c) - ((long) widgetRun6.f2484i.f2469f);
                j2 = Math.max(j2, j3);
                i3++;
                j3 = 0;
                eVar = this;
                dVar2 = dVar;
            }
        }
        return (int) j2;
    }

    /* renamed from: e */
    public final void mo23389e(WidgetRun widgetRun, int i, ArrayList<C7138i> arrayList) {
        Iterator it = widgetRun.f2483h.f2474k.iterator();
        while (it.hasNext()) {
            C7133d dVar = (C7133d) it.next();
            if (dVar instanceof DependencyNode) {
                mo23385a((DependencyNode) dVar, i, 0, arrayList, (C7138i) null);
            } else if (dVar instanceof WidgetRun) {
                mo23385a(((WidgetRun) dVar).f2483h, i, 0, arrayList, (C7138i) null);
            }
        }
        Iterator it2 = widgetRun.f2484i.f2474k.iterator();
        while (it2.hasNext()) {
            C7133d dVar2 = (C7133d) it2.next();
            if (dVar2 instanceof DependencyNode) {
                mo23385a((DependencyNode) dVar2, i, 1, arrayList, (C7138i) null);
            } else if (dVar2 instanceof WidgetRun) {
                mo23385a(((WidgetRun) dVar2).f2484i, i, 1, arrayList, (C7138i) null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0693d) widgetRun).f2490k.f2474k.iterator();
            while (it3.hasNext()) {
                C7133d dVar3 = (C7133d) it3.next();
                if (dVar3 instanceof DependencyNode) {
                    mo23385a((DependencyNode) dVar3, i, 2, arrayList, (C7138i) null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo23390f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        boolean z;
        C7129b.C7130a aVar = this.f22168g;
        aVar.f22150a = dimensionBehaviour;
        aVar.f22151b = dimensionBehaviour2;
        aVar.f22152c = i;
        aVar.f22153d = i2;
        ((ConstraintLayout.C0737b) this.f22167f).mo3200b(constraintWidget, aVar);
        constraintWidget.mo2788R(this.f22168g.f22154e);
        constraintWidget.mo2785O(this.f22168g.f22155f);
        C7129b.C7130a aVar2 = this.f22168g;
        constraintWidget.f2389F = aVar2.f22157h;
        int i3 = aVar2.f22156g;
        constraintWidget.f2417d0 = i3;
        if (i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        constraintWidget.f2389F = z;
    }

    /* renamed from: g */
    public final void mo23391g() {
        boolean z;
        C7128a aVar;
        Iterator<ConstraintWidget> it = this.f22162a.f21718w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f2410a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f2405V;
                boolean z2 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.f2446s;
                int i2 = next.f2448t;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C0689a aVar2 = next.f2416d.f2480e;
                boolean z3 = aVar2.f2473j;
                C0689a aVar3 = next.f2418e.f2480e;
                boolean z4 = aVar3.f2473j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    mo23390f(next, dimensionBehaviour4, aVar2.f2470g, dimensionBehaviour4, aVar3.f2470g);
                    next.f2410a = true;
                } else if (z3 && z2) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                    int i3 = aVar2.f2470g;
                    mo23390f(next, dimensionBehaviour5, i3, dimensionBehaviour3, aVar3.f2470g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f2418e.f2480e.f2487m = next.mo2802o();
                    } else {
                        next.f2418e.f2480e.mo2818d(next.mo2802o());
                        next.f2410a = true;
                    }
                } else if (z4 && z) {
                    int i4 = aVar2.f2470g;
                    mo23390f(next, dimensionBehaviour3, i4, ConstraintWidget.DimensionBehaviour.FIXED, aVar3.f2470g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f2416d.f2480e.f2487m = next.mo2807u();
                    } else {
                        next.f2416d.f2480e.mo2818d(next.mo2807u());
                        next.f2410a = true;
                    }
                }
                if (next.f2410a && (aVar = next.f2418e.f2491l) != null) {
                    aVar.mo2818d(next.f2417d0);
                }
            }
        }
    }
}
