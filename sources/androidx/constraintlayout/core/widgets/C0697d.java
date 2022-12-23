package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p292w0.C6962c;
import p305x0.C7129b;
import p305x0.C7134e;

/* renamed from: androidx.constraintlayout.core.widgets.d */
public final class C0697d extends C6962c {

    /* renamed from: A0 */
    public C7129b.C7131b f2510A0 = null;

    /* renamed from: B0 */
    public boolean f2511B0 = false;

    /* renamed from: C0 */
    public C0680c f2512C0 = new C0680c();

    /* renamed from: D0 */
    public int f2513D0;

    /* renamed from: E0 */
    public int f2514E0;

    /* renamed from: F0 */
    public int f2515F0 = 0;

    /* renamed from: G0 */
    public int f2516G0 = 0;

    /* renamed from: H0 */
    public C0696c[] f2517H0 = new C0696c[4];

    /* renamed from: I0 */
    public C0696c[] f2518I0 = new C0696c[4];

    /* renamed from: J0 */
    public int f2519J0 = 257;

    /* renamed from: K0 */
    public boolean f2520K0 = false;

    /* renamed from: L0 */
    public boolean f2521L0 = false;

    /* renamed from: M0 */
    public WeakReference<ConstraintAnchor> f2522M0 = null;

    /* renamed from: N0 */
    public WeakReference<ConstraintAnchor> f2523N0 = null;

    /* renamed from: O0 */
    public WeakReference<ConstraintAnchor> f2524O0 = null;

    /* renamed from: P0 */
    public WeakReference<ConstraintAnchor> f2525P0 = null;

    /* renamed from: Q0 */
    public HashSet<ConstraintWidget> f2526Q0 = new HashSet<>();

    /* renamed from: R0 */
    public C7129b.C7130a f2527R0 = new C7129b.C7130a();

    /* renamed from: x0 */
    public C7129b f2528x0 = new C7129b(this);

    /* renamed from: y0 */
    public C7134e f2529y0 = new C7134e(this);

    /* renamed from: z0 */
    public int f2530z0;

    /* renamed from: Y */
    public static void m2050Y(ConstraintWidget constraintWidget, C7129b.C7131b bVar, C7129b.C7130a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (bVar != null) {
            if (constraintWidget.f2429j0 == 8 || (constraintWidget instanceof C0700f) || (constraintWidget instanceof C0687a)) {
                aVar.f22154e = 0;
                aVar.f22155f = 0;
                return;
            }
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f2405V;
            aVar.f22150a = dimensionBehaviourArr[0];
            boolean z5 = true;
            aVar.f22151b = dimensionBehaviourArr[1];
            aVar.f22152c = constraintWidget.mo2807u();
            aVar.f22153d = constraintWidget.mo2802o();
            aVar.f22158i = false;
            aVar.f22159j = 0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f22150a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z = true;
            } else {
                z = false;
            }
            if (aVar.f22151b == dimensionBehaviour2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || constraintWidget.f2409Z <= BitmapDescriptorFactory.HUE_RED) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z2 || constraintWidget.f2409Z <= BitmapDescriptorFactory.HUE_RED) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z && constraintWidget.mo2810x(0) && constraintWidget.f2446s == 0 && !z3) {
                aVar.f22150a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z2 && constraintWidget.f2448t == 0) {
                    aVar.f22150a = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z = false;
            }
            if (z2 && constraintWidget.mo2810x(1) && constraintWidget.f2448t == 0 && !z4) {
                aVar.f22151b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z && constraintWidget.f2446s == 0) {
                    aVar.f22151b = ConstraintWidget.DimensionBehaviour.FIXED;
                }
                z2 = false;
            }
            if (constraintWidget.mo2777E()) {
                aVar.f22150a = ConstraintWidget.DimensionBehaviour.FIXED;
                z = false;
            }
            if (constraintWidget.mo2778F()) {
                aVar.f22151b = ConstraintWidget.DimensionBehaviour.FIXED;
                z2 = false;
            }
            if (z3) {
                if (constraintWidget.f2450u[0] == 4) {
                    aVar.f22150a = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z2) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f22151b;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour3 == dimensionBehaviour4) {
                        i2 = aVar.f22153d;
                    } else {
                        aVar.f22150a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ((ConstraintLayout.C0737b) bVar).mo3200b(constraintWidget, aVar);
                        i2 = aVar.f22155f;
                    }
                    aVar.f22150a = dimensionBehaviour4;
                    aVar.f22152c = (int) (constraintWidget.f2409Z * ((float) i2));
                }
            }
            if (z4) {
                if (constraintWidget.f2450u[1] == 4) {
                    aVar.f22151b = ConstraintWidget.DimensionBehaviour.FIXED;
                } else if (!z) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f22150a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                        i = aVar.f22152c;
                    } else {
                        aVar.f22151b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        ((ConstraintLayout.C0737b) bVar).mo3200b(constraintWidget, aVar);
                        i = aVar.f22154e;
                    }
                    aVar.f22151b = dimensionBehaviour6;
                    if (constraintWidget.f2411a0 == -1) {
                        aVar.f22153d = (int) (((float) i) / constraintWidget.f2409Z);
                    } else {
                        aVar.f22153d = (int) (constraintWidget.f2409Z * ((float) i));
                    }
                }
            }
            ((ConstraintLayout.C0737b) bVar).mo3200b(constraintWidget, aVar);
            constraintWidget.mo2788R(aVar.f22154e);
            constraintWidget.mo2785O(aVar.f22155f);
            constraintWidget.f2389F = aVar.f22157h;
            int i3 = aVar.f22156g;
            constraintWidget.f2417d0 = i3;
            if (i3 <= 0) {
                z5 = false;
            }
            constraintWidget.f2389F = z5;
            aVar.f22159j = 0;
        }
    }

    /* renamed from: G */
    public final void mo2779G() {
        this.f2512C0.mo2755t();
        this.f2513D0 = 0;
        this.f2514E0 = 0;
        super.mo2779G();
    }

    /* renamed from: S */
    public final void mo2789S(boolean z, boolean z2) {
        super.mo2789S(z, z2);
        int size = this.f21718w0.size();
        for (int i = 0; i < size; i++) {
            this.f21718w0.get(i).mo2789S(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0630  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0667 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x067f  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x07ed  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x081a A[LOOP:34: B:482:0x0818->B:483:0x081a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x08a0  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x08ae  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x08b1  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x08f3  */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x08f5  */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x0900  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2833U() {
        /*
            r26 = this;
            r1 = r26
            r2 = 0
            r1.f2413b0 = r2
            r1.f2415c0 = r2
            r1.f2520K0 = r2
            r1.f2521L0 = r2
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.f21718w0
            int r3 = r0.size()
            int r0 = r26.mo2807u()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r26.mo2802o()
            int r4 = java.lang.Math.max(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f2405V
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f2530z0
            if (r8 != 0) goto L_0x0243
            int r8 = r1.f2519J0
            boolean r8 = androidx.constraintlayout.core.widgets.C0702g.m2080b(r8, r6)
            if (r8 == 0) goto L_0x0243
            x0.b$b r8 = r1.f2510A0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r1.f2405V
            r11 = r10[r2]
            r10 = r10[r6]
            r26.mo2781I()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r12 = r1.f21718w0
            int r13 = r12.size()
            r14 = 0
        L_0x0046:
            if (r14 >= r13) goto L_0x0054
            java.lang.Object r15 = r12.get(r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r15
            r15.mo2781I()
            int r14 = r14 + 1
            goto L_0x0046
        L_0x0054:
            boolean r14 = r1.f2511B0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r11 != r15) goto L_0x0062
            int r11 = r26.mo2807u()
            r1.mo2783M(r2, r11)
            goto L_0x0069
        L_0x0062:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r1.f2394K
            r11.mo2771l(r2)
            r1.f2413b0 = r2
        L_0x0069:
            r11 = 0
            r15 = 0
            r16 = 0
        L_0x006d:
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r11 >= r13) goto L_0x00ca
            java.lang.Object r18 = r12.get(r11)
            r2 = r18
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            boolean r9 = r2 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r9 == 0) goto L_0x00b8
            androidx.constraintlayout.core.widgets.f r2 = (androidx.constraintlayout.core.widgets.C0700f) r2
            int r9 = r2.f2574A0
            if (r9 != r6) goto L_0x00c6
            int r9 = r2.f2577x0
            r15 = -1
            if (r9 == r15) goto L_0x008c
            r2.mo2847U(r9)
            goto L_0x00b6
        L_0x008c:
            int r9 = r2.f2578y0
            if (r9 == r15) goto L_0x00a1
            boolean r9 = r26.mo2777E()
            if (r9 == 0) goto L_0x00a1
            int r9 = r26.mo2807u()
            int r15 = r2.f2578y0
            int r9 = r9 - r15
            r2.mo2847U(r9)
            goto L_0x00b6
        L_0x00a1:
            boolean r9 = r26.mo2777E()
            if (r9 == 0) goto L_0x00b6
            float r9 = r2.f2576w0
            int r15 = r26.mo2807u()
            float r15 = (float) r15
            float r9 = r9 * r15
            float r9 = r9 + r17
            int r9 = (int) r9
            r2.mo2847U(r9)
        L_0x00b6:
            r15 = 1
            goto L_0x00c6
        L_0x00b8:
            boolean r9 = r2 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r9 == 0) goto L_0x00c6
            androidx.constraintlayout.core.widgets.a r2 = (androidx.constraintlayout.core.widgets.C0687a) r2
            int r2 = r2.mo2814W()
            if (r2 != 0) goto L_0x00c6
            r16 = 1
        L_0x00c6:
            int r11 = r11 + 1
            r2 = 0
            goto L_0x006d
        L_0x00ca:
            if (r15 == 0) goto L_0x00e8
            r2 = 0
        L_0x00cd:
            if (r2 >= r13) goto L_0x00e8
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r11 = r9 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r11 == 0) goto L_0x00e4
            androidx.constraintlayout.core.widgets.f r9 = (androidx.constraintlayout.core.widgets.C0700f) r9
            int r11 = r9.f2574A0
            if (r11 != r6) goto L_0x00e4
            r11 = 0
            p305x0.C7135f.m16685b(r11, r9, r8, r14)
            goto L_0x00e5
        L_0x00e4:
            r11 = 0
        L_0x00e5:
            int r2 = r2 + 1
            goto L_0x00cd
        L_0x00e8:
            r11 = 0
            p305x0.C7135f.m16685b(r11, r1, r8, r14)
            if (r16 == 0) goto L_0x010f
            r2 = 0
        L_0x00ef:
            if (r2 >= r13) goto L_0x010f
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r11 = r9 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r11 == 0) goto L_0x010c
            androidx.constraintlayout.core.widgets.a r9 = (androidx.constraintlayout.core.widgets.C0687a) r9
            int r11 = r9.mo2814W()
            if (r11 != 0) goto L_0x010c
            boolean r11 = r9.mo2813V()
            if (r11 == 0) goto L_0x010c
            p305x0.C7135f.m16685b(r6, r9, r8, r14)
        L_0x010c:
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x010f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r10 != r2) goto L_0x011c
            int r2 = r26.mo2802o()
            r9 = 0
            r1.mo2784N(r9, r2)
            goto L_0x0124
        L_0x011c:
            r9 = 0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.f2395L
            r2.mo2771l(r9)
            r1.f2415c0 = r9
        L_0x0124:
            r2 = 0
            r9 = 0
            r10 = 0
        L_0x0127:
            if (r2 >= r13) goto L_0x017e
            java.lang.Object r11 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r11
            boolean r15 = r11 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r15 == 0) goto L_0x016e
            androidx.constraintlayout.core.widgets.f r11 = (androidx.constraintlayout.core.widgets.C0700f) r11
            int r15 = r11.f2574A0
            if (r15 != 0) goto L_0x017b
            int r9 = r11.f2577x0
            r15 = -1
            if (r9 == r15) goto L_0x0142
            r11.mo2847U(r9)
            goto L_0x016c
        L_0x0142:
            int r9 = r11.f2578y0
            if (r9 == r15) goto L_0x0157
            boolean r9 = r26.mo2778F()
            if (r9 == 0) goto L_0x0157
            int r9 = r26.mo2802o()
            int r15 = r11.f2578y0
            int r9 = r9 - r15
            r11.mo2847U(r9)
            goto L_0x016c
        L_0x0157:
            boolean r9 = r26.mo2778F()
            if (r9 == 0) goto L_0x016c
            float r9 = r11.f2576w0
            int r15 = r26.mo2802o()
            float r15 = (float) r15
            float r9 = r9 * r15
            float r9 = r9 + r17
            int r9 = (int) r9
            r11.mo2847U(r9)
        L_0x016c:
            r9 = 1
            goto L_0x017b
        L_0x016e:
            boolean r15 = r11 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r15 == 0) goto L_0x017b
            androidx.constraintlayout.core.widgets.a r11 = (androidx.constraintlayout.core.widgets.C0687a) r11
            int r11 = r11.mo2814W()
            if (r11 != r6) goto L_0x017b
            r10 = 1
        L_0x017b:
            int r2 = r2 + 1
            goto L_0x0127
        L_0x017e:
            if (r9 == 0) goto L_0x0199
            r2 = 0
        L_0x0181:
            if (r2 >= r13) goto L_0x0199
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r11 = r9 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r11 == 0) goto L_0x0196
            androidx.constraintlayout.core.widgets.f r9 = (androidx.constraintlayout.core.widgets.C0700f) r9
            int r11 = r9.f2574A0
            if (r11 != 0) goto L_0x0196
            p305x0.C7135f.m16690g(r6, r9, r8)
        L_0x0196:
            int r2 = r2 + 1
            goto L_0x0181
        L_0x0199:
            r2 = 0
            p305x0.C7135f.m16690g(r2, r1, r8)
            if (r10 == 0) goto L_0x01c0
            r2 = 0
        L_0x01a0:
            if (r2 >= r13) goto L_0x01c0
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r10 == 0) goto L_0x01bd
            androidx.constraintlayout.core.widgets.a r9 = (androidx.constraintlayout.core.widgets.C0687a) r9
            int r10 = r9.mo2814W()
            if (r10 != r6) goto L_0x01bd
            boolean r10 = r9.mo2813V()
            if (r10 == 0) goto L_0x01bd
            p305x0.C7135f.m16690g(r6, r9, r8)
        L_0x01bd:
            int r2 = r2 + 1
            goto L_0x01a0
        L_0x01c0:
            r2 = 0
        L_0x01c1:
            if (r2 >= r13) goto L_0x01f9
            java.lang.Object r9 = r12.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9.mo2776D()
            if (r10 == 0) goto L_0x01f6
            boolean r10 = p305x0.C7135f.m16684a(r9)
            if (r10 == 0) goto L_0x01f6
            x0.b$a r10 = p305x0.C7135f.f22170a
            m2050Y(r9, r8, r10)
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r10 == 0) goto L_0x01ef
            r10 = r9
            androidx.constraintlayout.core.widgets.f r10 = (androidx.constraintlayout.core.widgets.C0700f) r10
            int r10 = r10.f2574A0
            if (r10 != 0) goto L_0x01ea
            r10 = 0
            p305x0.C7135f.m16690g(r10, r9, r8)
            goto L_0x01f6
        L_0x01ea:
            r10 = 0
            p305x0.C7135f.m16685b(r10, r9, r8, r14)
            goto L_0x01f6
        L_0x01ef:
            r10 = 0
            p305x0.C7135f.m16685b(r10, r9, r8, r14)
            p305x0.C7135f.m16690g(r10, r9, r8)
        L_0x01f6:
            int r2 = r2 + 1
            goto L_0x01c1
        L_0x01f9:
            r2 = 0
        L_0x01fa:
            if (r2 >= r3) goto L_0x0243
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r8 = r1.f21718w0
            java.lang.Object r8 = r8.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r8
            boolean r9 = r8.mo2776D()
            if (r9 == 0) goto L_0x0240
            boolean r9 = r8 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r9 != 0) goto L_0x0240
            boolean r9 = r8 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r9 != 0) goto L_0x0240
            boolean r9 = r8 instanceof androidx.constraintlayout.core.widgets.C0704i
            if (r9 != 0) goto L_0x0240
            boolean r9 = r8.f2391H
            if (r9 != 0) goto L_0x0240
            r9 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r8.mo2801n(r9)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r8.mo2801n(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0233
            int r10 = r8.f2446s
            if (r10 == r6) goto L_0x0233
            if (r9 != r11) goto L_0x0233
            int r9 = r8.f2448t
            if (r9 == r6) goto L_0x0233
            r9 = 1
            goto L_0x0234
        L_0x0233:
            r9 = 0
        L_0x0234:
            if (r9 != 0) goto L_0x0240
            x0.b$a r9 = new x0.b$a
            r9.<init>()
            x0.b$b r10 = r1.f2510A0
            m2050Y(r8, r10, r9)
        L_0x0240:
            int r2 = r2 + 1
            goto L_0x01fa
        L_0x0243:
            r2 = 2
            if (r3 <= r2) goto L_0x063e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x024c
            if (r7 != r9) goto L_0x063e
        L_0x024c:
            int r9 = r1.f2519J0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = androidx.constraintlayout.core.widgets.C0702g.m2080b(r9, r10)
            if (r9 == 0) goto L_0x063e
            x0.b$b r9 = r1.f2510A0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r10 = r1.f21718w0
            int r11 = r10.size()
            r12 = 0
        L_0x025f:
            if (r12 >= r11) goto L_0x0291
            java.lang.Object r13 = r10.get(r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r14 = r1.f2405V
            r15 = 0
            r2 = r14[r15]
            r14 = r14[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r13.f2405V
            r20 = r3
            r3 = r8[r15]
            r8 = r8[r6]
            boolean r2 = p305x0.C7136g.m16692b(r2, r14, r3, r8)
            if (r2 != 0) goto L_0x027d
            goto L_0x0281
        L_0x027d:
            boolean r2 = r13 instanceof androidx.constraintlayout.core.widgets.C0698e
            if (r2 == 0) goto L_0x028b
        L_0x0281:
            r24 = r0
            r21 = r4
            r25 = r5
            r23 = r7
            goto L_0x05f2
        L_0x028b:
            int r12 = r12 + 1
            r3 = r20
            r2 = 2
            goto L_0x025f
        L_0x0291:
            r20 = r3
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x029a:
            if (r15 >= r11) goto L_0x037b
            java.lang.Object r21 = r10.get(r15)
            r6 = r21
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            r21 = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r1.f2405V
            r23 = r7
            r19 = 0
            r7 = r4[r19]
            r22 = 1
            r4 = r4[r22]
            r24 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r6.f2405V
            r25 = r5
            r5 = r0[r19]
            r0 = r0[r22]
            boolean r0 = p305x0.C7136g.m16692b(r7, r4, r5, r0)
            if (r0 != 0) goto L_0x02c7
            x0.b$a r0 = r1.f2527R0
            m2050Y(r6, r9, r0)
        L_0x02c7:
            boolean r0 = r6 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r0 == 0) goto L_0x02ec
            r4 = r6
            androidx.constraintlayout.core.widgets.f r4 = (androidx.constraintlayout.core.widgets.C0700f) r4
            int r5 = r4.f2574A0
            if (r5 != 0) goto L_0x02dd
            if (r8 != 0) goto L_0x02da
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r5
        L_0x02da:
            r8.add(r4)
        L_0x02dd:
            int r5 = r4.f2574A0
            r7 = 1
            if (r5 != r7) goto L_0x02ec
            if (r2 != 0) goto L_0x02e9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x02e9:
            r2.add(r4)
        L_0x02ec:
            boolean r4 = r6 instanceof p292w0.C6961b
            if (r4 == 0) goto L_0x0330
            boolean r4 = r6 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r4 == 0) goto L_0x0319
            r4 = r6
            androidx.constraintlayout.core.widgets.a r4 = (androidx.constraintlayout.core.widgets.C0687a) r4
            int r5 = r4.mo2814W()
            if (r5 != 0) goto L_0x0307
            if (r3 != 0) goto L_0x0304
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0304:
            r3.add(r4)
        L_0x0307:
            int r5 = r4.mo2814W()
            r7 = 1
            if (r5 != r7) goto L_0x0330
            if (r12 != 0) goto L_0x0315
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0315:
            r12.add(r4)
            goto L_0x0330
        L_0x0319:
            r4 = r6
            w0.b r4 = (p292w0.C6961b) r4
            if (r3 != 0) goto L_0x0323
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0323:
            r3.add(r4)
            if (r12 != 0) goto L_0x032d
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x032d:
            r12.add(r4)
        L_0x0330:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r6.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2379f
            if (r4 != 0) goto L_0x034c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r6.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2379f
            if (r4 != 0) goto L_0x034c
            if (r0 != 0) goto L_0x034c
            boolean r4 = r6 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r4 != 0) goto L_0x034c
            if (r13 != 0) goto L_0x0349
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0349:
            r13.add(r6)
        L_0x034c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r6.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2379f
            if (r4 != 0) goto L_0x036e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r6.f2397N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2379f
            if (r4 != 0) goto L_0x036e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r6.f2398O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2379f
            if (r4 != 0) goto L_0x036e
            if (r0 != 0) goto L_0x036e
            boolean r0 = r6 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r0 != 0) goto L_0x036e
            if (r14 != 0) goto L_0x036b
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x036b:
            r14.add(r6)
        L_0x036e:
            int r15 = r15 + 1
            r4 = r21
            r7 = r23
            r0 = r24
            r5 = r25
            r6 = 1
            goto L_0x029a
        L_0x037b:
            r24 = r0
            r21 = r4
            r25 = r5
            r23 = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L_0x03a0
            java.util.Iterator r2 = r2.iterator()
        L_0x038e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03a0
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.core.widgets.f r4 = (androidx.constraintlayout.core.widgets.C0700f) r4
            r5 = 0
            r6 = 0
            p305x0.C7136g.m16691a(r4, r6, r0, r5)
            goto L_0x038e
        L_0x03a0:
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x03c1
            java.util.Iterator r2 = r3.iterator()
        L_0x03a8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03c1
            java.lang.Object r3 = r2.next()
            w0.b r3 = (p292w0.C6961b) r3
            x0.j r4 = p305x0.C7136g.m16691a(r3, r6, r0, r5)
            r3.mo23205U(r6, r4, r0)
            r4.mo23394b(r0)
            r5 = 0
            r6 = 0
            goto L_0x03a8
        L_0x03c1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mo2800m(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.f2374a
            if (r2 == 0) goto L_0x03e3
            java.util.Iterator r2 = r2.iterator()
        L_0x03cf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03e3
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
            r4 = 0
            r5 = 0
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x03cf
        L_0x03e3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mo2800m(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.f2374a
            if (r2 == 0) goto L_0x0405
            java.util.Iterator r2 = r2.iterator()
        L_0x03f1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0405
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
            r4 = 0
            r5 = 0
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x03f1
        L_0x0405:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mo2800m(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.f2374a
            if (r2 == 0) goto L_0x0427
            java.util.Iterator r2 = r2.iterator()
        L_0x0413:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0427
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
            r4 = 0
            r5 = 0
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x0413
        L_0x0427:
            r4 = 0
            r5 = 0
            if (r13 == 0) goto L_0x043f
            java.util.Iterator r2 = r13.iterator()
        L_0x042f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x043f
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x042f
        L_0x043f:
            if (r8 == 0) goto L_0x0456
            java.util.Iterator r2 = r8.iterator()
        L_0x0445:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0456
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.f r3 = (androidx.constraintlayout.core.widgets.C0700f) r3
            r5 = 1
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x0445
        L_0x0456:
            r5 = 1
            if (r12 == 0) goto L_0x0476
            java.util.Iterator r2 = r12.iterator()
        L_0x045d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0476
            java.lang.Object r3 = r2.next()
            w0.b r3 = (p292w0.C6961b) r3
            x0.j r6 = p305x0.C7136g.m16691a(r3, r5, r0, r4)
            r3.mo23205U(r5, r6, r0)
            r6.mo23394b(r0)
            r4 = 0
            r5 = 1
            goto L_0x045d
        L_0x0476:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mo2800m(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.f2374a
            if (r2 == 0) goto L_0x0498
            java.util.Iterator r2 = r2.iterator()
        L_0x0484:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0498
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
            r4 = 0
            r5 = 1
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x0484
        L_0x0498:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mo2800m(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.f2374a
            if (r2 == 0) goto L_0x04ba
            java.util.Iterator r2 = r2.iterator()
        L_0x04a6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04ba
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
            r4 = 0
            r5 = 1
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x04a6
        L_0x04ba:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mo2800m(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.f2374a
            if (r2 == 0) goto L_0x04dc
            java.util.Iterator r2 = r2.iterator()
        L_0x04c8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04dc
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
            r4 = 0
            r5 = 1
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x04c8
        L_0x04dc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mo2800m(r2)
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r2.f2374a
            if (r2 == 0) goto L_0x04fe
            java.util.Iterator r2 = r2.iterator()
        L_0x04ea:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
            r4 = 0
            r5 = 1
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x04ea
        L_0x04fe:
            r4 = 0
            r5 = 1
            if (r14 == 0) goto L_0x0516
            java.util.Iterator r2 = r14.iterator()
        L_0x0506:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0516
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            p305x0.C7136g.m16691a(r3, r5, r0, r4)
            goto L_0x0506
        L_0x0516:
            r2 = 0
        L_0x0517:
            if (r2 >= r11) goto L_0x0573
            java.lang.Object r3 = r10.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r3.f2405V
            r5 = 0
            r6 = r4[r5]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r5) goto L_0x052f
            r6 = 1
            r4 = r4[r6]
            if (r4 != r5) goto L_0x052f
            r4 = 1
            goto L_0x0530
        L_0x052f:
            r4 = 0
        L_0x0530:
            if (r4 == 0) goto L_0x0570
            int r4 = r3.f2451u0
            int r5 = r0.size()
            r6 = 0
        L_0x0539:
            if (r6 >= r5) goto L_0x0549
            java.lang.Object r7 = r0.get(r6)
            x0.j r7 = (p305x0.C7139j) r7
            int r8 = r7.f22175b
            if (r4 != r8) goto L_0x0546
            goto L_0x054a
        L_0x0546:
            int r6 = r6 + 1
            goto L_0x0539
        L_0x0549:
            r7 = 0
        L_0x054a:
            int r3 = r3.f2453v0
            int r4 = r0.size()
            r5 = 0
        L_0x0551:
            if (r5 >= r4) goto L_0x0561
            java.lang.Object r6 = r0.get(r5)
            x0.j r6 = (p305x0.C7139j) r6
            int r8 = r6.f22175b
            if (r3 != r8) goto L_0x055e
            goto L_0x0562
        L_0x055e:
            int r5 = r5 + 1
            goto L_0x0551
        L_0x0561:
            r6 = 0
        L_0x0562:
            if (r7 == 0) goto L_0x0570
            if (r6 == 0) goto L_0x0570
            r3 = 0
            r7.mo23396d(r3, r6)
            r3 = 2
            r6.f22176c = r3
            r0.remove(r7)
        L_0x0570:
            int r2 = r2 + 1
            goto L_0x0517
        L_0x0573:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x057c
            goto L_0x05f2
        L_0x057c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.f2405V
            r3 = 0
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x05b4
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x058b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x05a9
            java.lang.Object r5 = r2.next()
            x0.j r5 = (p305x0.C7139j) r5
            int r6 = r5.f22176c
            r7 = 1
            if (r6 != r7) goto L_0x059d
            goto L_0x058b
        L_0x059d:
            androidx.constraintlayout.core.c r6 = r1.f2512C0
            r7 = 0
            int r6 = r5.mo23395c(r6, r7)
            if (r6 <= r4) goto L_0x058b
            r3 = r5
            r4 = r6
            goto L_0x058b
        L_0x05a9:
            if (r3 == 0) goto L_0x05b4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.mo2786P(r2)
            r1.mo2788R(r4)
            goto L_0x05b5
        L_0x05b4:
            r3 = 0
        L_0x05b5:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r1.f2405V
            r4 = 1
            r2 = r2[r4]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r4) goto L_0x05ec
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r4 = 0
        L_0x05c4:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05e1
            java.lang.Object r5 = r0.next()
            x0.j r5 = (p305x0.C7139j) r5
            int r6 = r5.f22176c
            if (r6 != 0) goto L_0x05d5
            goto L_0x05c4
        L_0x05d5:
            androidx.constraintlayout.core.c r6 = r1.f2512C0
            r7 = 1
            int r6 = r5.mo23395c(r6, r7)
            if (r6 <= r4) goto L_0x05c4
            r2 = r5
            r4 = r6
            goto L_0x05c4
        L_0x05e1:
            if (r2 == 0) goto L_0x05ec
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.mo2787Q(r0)
            r1.mo2785O(r4)
            goto L_0x05ed
        L_0x05ec:
            r2 = 0
        L_0x05ed:
            if (r3 != 0) goto L_0x05f4
            if (r2 == 0) goto L_0x05f2
            goto L_0x05f4
        L_0x05f2:
            r0 = 0
            goto L_0x05f5
        L_0x05f4:
            r0 = 1
        L_0x05f5:
            if (r0 == 0) goto L_0x0635
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r2 = r25
            if (r2 != r0) goto L_0x0613
            int r3 = r26.mo2807u()
            r4 = r24
            if (r4 >= r3) goto L_0x060e
            if (r4 <= 0) goto L_0x060e
            r1.mo2788R(r4)
            r3 = 1
            r1.f2520K0 = r3
            goto L_0x0615
        L_0x060e:
            int r3 = r26.mo2807u()
            goto L_0x0616
        L_0x0613:
            r4 = r24
        L_0x0615:
            r3 = r4
        L_0x0616:
            r5 = r23
            if (r5 != r0) goto L_0x0630
            int r0 = r26.mo2802o()
            r6 = r21
            if (r6 >= r0) goto L_0x062b
            if (r6 <= 0) goto L_0x062b
            r1.mo2785O(r6)
            r4 = 1
            r1.f2521L0 = r4
            goto L_0x0632
        L_0x062b:
            int r4 = r26.mo2802o()
            goto L_0x0633
        L_0x0630:
            r6 = r21
        L_0x0632:
            r4 = r6
        L_0x0633:
            r0 = 1
            goto L_0x0647
        L_0x0635:
            r6 = r21
            r5 = r23
            r4 = r24
            r2 = r25
            goto L_0x0644
        L_0x063e:
            r20 = r3
            r6 = r4
            r2 = r5
            r5 = r7
            r4 = r0
        L_0x0644:
            r3 = r4
            r4 = r6
            r0 = 0
        L_0x0647:
            r6 = 64
            boolean r7 = r1.mo2837Z(r6)
            if (r7 != 0) goto L_0x065a
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.mo2837Z(r7)
            if (r7 == 0) goto L_0x0658
            goto L_0x065a
        L_0x0658:
            r7 = 0
            goto L_0x065b
        L_0x065a:
            r7 = 1
        L_0x065b:
            androidx.constraintlayout.core.c r8 = r1.f2512C0
            r8.getClass()
            r9 = 0
            r8.f2359g = r9
            int r10 = r1.f2519J0
            if (r10 == 0) goto L_0x066d
            if (r7 == 0) goto L_0x066d
            r7 = 1
            r8.f2359g = r7
            goto L_0x066e
        L_0x066d:
            r7 = 1
        L_0x066e:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r8 = r1.f21718w0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r1.f2405V
            r11 = r10[r9]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r12) goto L_0x067f
            r10 = r10[r7]
            if (r10 != r12) goto L_0x067d
            goto L_0x067f
        L_0x067d:
            r11 = 0
            goto L_0x0680
        L_0x067f:
            r11 = 1
        L_0x0680:
            r1.f2515F0 = r9
            r1.f2516G0 = r9
            r9 = r20
            r7 = 0
        L_0x0687:
            if (r7 >= r9) goto L_0x069d
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r10 = r1.f21718w0
            java.lang.Object r10 = r10.get(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r10
            boolean r12 = r10 instanceof p292w0.C6962c
            if (r12 == 0) goto L_0x069a
            w0.c r10 = (p292w0.C6962c) r10
            r10.mo2833U()
        L_0x069a:
            int r7 = r7 + 1
            goto L_0x0687
        L_0x069d:
            boolean r7 = r1.mo2837Z(r6)
            r10 = r0
            r0 = 0
            r12 = 1
        L_0x06a4:
            if (r12 == 0) goto L_0x08fc
            r13 = 1
            int r14 = r0 + 1
            androidx.constraintlayout.core.c r0 = r1.f2512C0     // Catch:{ Exception -> 0x0789 }
            r0.mo2755t()     // Catch:{ Exception -> 0x0789 }
            r13 = 0
            r1.f2515F0 = r13     // Catch:{ Exception -> 0x0789 }
            r1.f2516G0 = r13     // Catch:{ Exception -> 0x0789 }
            androidx.constraintlayout.core.c r0 = r1.f2512C0     // Catch:{ Exception -> 0x0789 }
            r1.mo2798k(r0)     // Catch:{ Exception -> 0x0789 }
            r0 = 0
        L_0x06b9:
            if (r0 >= r9) goto L_0x06cb
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r1.f21718w0     // Catch:{ Exception -> 0x0789 }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x0789 }
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13     // Catch:{ Exception -> 0x0789 }
            androidx.constraintlayout.core.c r15 = r1.f2512C0     // Catch:{ Exception -> 0x0789 }
            r13.mo2798k(r15)     // Catch:{ Exception -> 0x0789 }
            int r0 = r0 + 1
            goto L_0x06b9
        L_0x06cb:
            androidx.constraintlayout.core.c r0 = r1.f2512C0     // Catch:{ Exception -> 0x0789 }
            r1.mo2835W(r0)     // Catch:{ Exception -> 0x0789 }
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2522M0     // Catch:{ Exception -> 0x077c }
            r12 = 5
            if (r0 == 0) goto L_0x06fd
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06fb }
            if (r0 == 0) goto L_0x06fd
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2522M0     // Catch:{ Exception -> 0x06fb }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r13 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r1.f2395L     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.SolverVariable r13 = r13.mo2747k(r15)     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r15 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.SolverVariable r0 = r15.mo2747k(r0)     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r15 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            r6 = 0
            r15.mo2742f(r0, r13, r6, r12)     // Catch:{ Exception -> 0x06fb }
            r6 = 0
            r1.f2522M0 = r6     // Catch:{ Exception -> 0x077c }
            goto L_0x06fd
        L_0x06fb:
            r0 = move-exception
            goto L_0x0750
        L_0x06fd:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2524O0     // Catch:{ Exception -> 0x077c }
            if (r0 == 0) goto L_0x0726
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06fb }
            if (r0 == 0) goto L_0x0726
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2524O0     // Catch:{ Exception -> 0x06fb }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r6 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r1.f2397N     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo2747k(r13)     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r13 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.SolverVariable r0 = r13.mo2747k(r0)     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r13 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            r15 = 0
            r13.mo2742f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x06fb }
            r6 = 0
            r1.f2524O0 = r6     // Catch:{ Exception -> 0x077c }
        L_0x0726:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2523N0     // Catch:{ Exception -> 0x077c }
            if (r0 == 0) goto L_0x0752
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06fb }
            if (r0 == 0) goto L_0x0752
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2523N0     // Catch:{ Exception -> 0x06fb }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r6 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r1.f2394K     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo2747k(r13)     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r13 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.SolverVariable r0 = r13.mo2747k(r0)     // Catch:{ Exception -> 0x06fb }
            androidx.constraintlayout.core.c r13 = r1.f2512C0     // Catch:{ Exception -> 0x06fb }
            r15 = 0
            r13.mo2742f(r0, r6, r15, r12)     // Catch:{ Exception -> 0x06fb }
            r6 = 0
            r1.f2523N0 = r6     // Catch:{ Exception -> 0x077c }
            goto L_0x0752
        L_0x0750:
            r6 = 0
            goto L_0x0787
        L_0x0752:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2525P0     // Catch:{ Exception -> 0x077c }
            if (r0 == 0) goto L_0x077e
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x077c }
            if (r0 == 0) goto L_0x077e
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2525P0     // Catch:{ Exception -> 0x077c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x077c }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x077c }
            androidx.constraintlayout.core.c r6 = r1.f2512C0     // Catch:{ Exception -> 0x077c }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r1.f2396M     // Catch:{ Exception -> 0x077c }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo2747k(r13)     // Catch:{ Exception -> 0x077c }
            androidx.constraintlayout.core.c r13 = r1.f2512C0     // Catch:{ Exception -> 0x077c }
            androidx.constraintlayout.core.SolverVariable r0 = r13.mo2747k(r0)     // Catch:{ Exception -> 0x077c }
            androidx.constraintlayout.core.c r13 = r1.f2512C0     // Catch:{ Exception -> 0x077c }
            r15 = 0
            r13.mo2742f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x077c }
            r6 = 0
            r1.f2525P0 = r6     // Catch:{ Exception -> 0x0786 }
            goto L_0x077f
        L_0x077c:
            r0 = move-exception
            goto L_0x0750
        L_0x077e:
            r6 = 0
        L_0x077f:
            androidx.constraintlayout.core.c r0 = r1.f2512C0     // Catch:{ Exception -> 0x0786 }
            r0.mo2751p()     // Catch:{ Exception -> 0x0786 }
            r12 = 1
            goto L_0x07a4
        L_0x0786:
            r0 = move-exception
        L_0x0787:
            r12 = 1
            goto L_0x078b
        L_0x0789:
            r0 = move-exception
            r6 = 0
        L_0x078b:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "EXCEPTION : "
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r13.println(r0)
        L_0x07a4:
            if (r12 == 0) goto L_0x07ed
            androidx.constraintlayout.core.c r0 = r1.f2512C0
            boolean[] r6 = androidx.constraintlayout.core.widgets.C0702g.f2581a
            r12 = 2
            r13 = 0
            r6[r12] = r13
            r6 = 64
            boolean r12 = r1.mo2837Z(r6)
            r1.mo2790T(r0, r12)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r1.f21718w0
            int r13 = r13.size()
            r15 = 0
            r20 = 0
        L_0x07c0:
            if (r15 >= r13) goto L_0x07eb
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.f21718w0
            java.lang.Object r6 = r6.get(r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            r6.mo2790T(r0, r12)
            r23 = r0
            int r0 = r6.f2426i
            r24 = r12
            r12 = -1
            if (r0 != r12) goto L_0x07dd
            int r0 = r6.f2428j
            if (r0 == r12) goto L_0x07db
            goto L_0x07dd
        L_0x07db:
            r0 = 0
            goto L_0x07de
        L_0x07dd:
            r0 = 1
        L_0x07de:
            if (r0 == 0) goto L_0x07e2
            r20 = 1
        L_0x07e2:
            int r15 = r15 + 1
            r0 = r23
            r12 = r24
            r6 = 64
            goto L_0x07c0
        L_0x07eb:
            r12 = -1
            goto L_0x0808
        L_0x07ed:
            r12 = -1
            androidx.constraintlayout.core.c r0 = r1.f2512C0
            r1.mo2790T(r0, r7)
            r0 = 0
        L_0x07f4:
            if (r0 >= r9) goto L_0x0806
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.f21718w0
            java.lang.Object r6 = r6.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6
            androidx.constraintlayout.core.c r13 = r1.f2512C0
            r6.mo2790T(r13, r7)
            int r0 = r0 + 1
            goto L_0x07f4
        L_0x0806:
            r20 = 0
        L_0x0808:
            r0 = 8
            if (r11 == 0) goto L_0x0873
            if (r14 >= r0) goto L_0x0873
            boolean[] r6 = androidx.constraintlayout.core.widgets.C0702g.f2581a
            r13 = 2
            boolean r6 = r6[r13]
            if (r6 == 0) goto L_0x0873
            r6 = 0
            r12 = 0
            r15 = 0
        L_0x0818:
            if (r6 >= r9) goto L_0x083f
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r1.f21718w0
            java.lang.Object r13 = r13.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            int r0 = r13.f2413b0
            int r24 = r13.mo2807u()
            int r0 = r24 + r0
            int r15 = java.lang.Math.max(r15, r0)
            int r0 = r13.f2415c0
            int r13 = r13.mo2802o()
            int r13 = r13 + r0
            int r12 = java.lang.Math.max(r12, r13)
            int r6 = r6 + 1
            r0 = 8
            r13 = 2
            goto L_0x0818
        L_0x083f:
            int r0 = r1.f2419e0
            int r0 = java.lang.Math.max(r0, r15)
            int r6 = r1.f2421f0
            int r6 = java.lang.Math.max(r6, r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r12) goto L_0x0860
            int r13 = r26.mo2807u()
            if (r13 >= r0) goto L_0x0860
            r1.mo2788R(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            r10 = 0
            r0[r10] = r12
            r10 = 1
            r20 = 1
        L_0x0860:
            if (r5 != r12) goto L_0x0873
            int r0 = r26.mo2802o()
            if (r0 >= r6) goto L_0x0873
            r1.mo2785O(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            r6 = 1
            r0[r6] = r12
            r10 = 1
            r20 = 1
        L_0x0873:
            int r0 = r1.f2419e0
            int r6 = r26.mo2807u()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r26.mo2807u()
            if (r0 <= r6) goto L_0x0890
            r1.mo2788R(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10 = 0
            r0[r10] = r6
            r10 = 1
            r20 = 1
        L_0x0890:
            int r0 = r1.f2421f0
            int r6 = r26.mo2802o()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r26.mo2802o()
            if (r0 <= r6) goto L_0x08ae
            r1.mo2785O(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r12 = 1
            r0[r12] = r6
            r10 = 1
            r20 = 1
            goto L_0x08af
        L_0x08ae:
            r12 = 1
        L_0x08af:
            if (r10 != 0) goto L_0x08ef
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            r6 = 0
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x08d0
            if (r3 <= 0) goto L_0x08d0
            int r0 = r26.mo2807u()
            if (r0 <= r3) goto L_0x08d0
            r1.f2520K0 = r12
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r6] = r10
            r1.mo2788R(r3)
            r10 = 1
            r20 = 1
        L_0x08d0:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            r0 = r0[r12]
            if (r0 != r13) goto L_0x08ef
            if (r4 <= 0) goto L_0x08ef
            int r0 = r26.mo2802o()
            if (r0 <= r4) goto L_0x08ef
            r1.f2521L0 = r12
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r12] = r6
            r1.mo2785O(r4)
            r0 = 8
            r10 = 1
            r20 = 1
            goto L_0x08f1
        L_0x08ef:
            r0 = 8
        L_0x08f1:
            if (r14 <= r0) goto L_0x08f5
            r12 = 0
            goto L_0x08f7
        L_0x08f5:
            r12 = r20
        L_0x08f7:
            r0 = r14
            r6 = 64
            goto L_0x06a4
        L_0x08fc:
            r1.f21718w0 = r8
            if (r10 == 0) goto L_0x0908
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2405V
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r5
        L_0x0908:
            androidx.constraintlayout.core.c r0 = r1.f2512C0
            u0.a r0 = r0.f2364l
            r1.mo2782J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0697d.mo2833U():void");
    }

    /* renamed from: V */
    public final void mo2834V(int i, ConstraintWidget constraintWidget) {
        if (i == 0) {
            int i2 = this.f2515F0 + 1;
            C0696c[] cVarArr = this.f2518I0;
            if (i2 >= cVarArr.length) {
                this.f2518I0 = (C0696c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            C0696c[] cVarArr2 = this.f2518I0;
            int i3 = this.f2515F0;
            cVarArr2[i3] = new C0696c(constraintWidget, 0, this.f2511B0);
            this.f2515F0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.f2516G0 + 1;
            C0696c[] cVarArr3 = this.f2517H0;
            if (i4 >= cVarArr3.length) {
                this.f2517H0 = (C0696c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            C0696c[] cVarArr4 = this.f2517H0;
            int i5 = this.f2516G0;
            cVarArr4[i5] = new C0696c(constraintWidget, 1, this.f2511B0);
            this.f2516G0 = i5 + 1;
        }
    }

    /* renamed from: W */
    public final void mo2835W(C0680c cVar) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean Z = mo2837Z(64);
        mo2792e(cVar, Z);
        int size = this.f21718w0.size();
        boolean z5 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = this.f21718w0.get(i2);
            boolean[] zArr = constraintWidget.f2404U;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof C0687a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = this.f21718w0.get(i3);
                if (constraintWidget2 instanceof C0687a) {
                    C0687a aVar = (C0687a) constraintWidget2;
                    for (int i4 = 0; i4 < aVar.f21717x0; i4++) {
                        ConstraintWidget constraintWidget3 = aVar.f21716w0[i4];
                        if (aVar.f2463z0 || constraintWidget3.mo2793f()) {
                            int i5 = aVar.f2462y0;
                            if (i5 == 0 || i5 == 1) {
                                constraintWidget3.f2404U[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                constraintWidget3.f2404U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.f2526Q0.clear();
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget4 = this.f21718w0.get(i6);
            constraintWidget4.getClass();
            if ((constraintWidget4 instanceof C0704i) || (constraintWidget4 instanceof C0700f)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (constraintWidget4 instanceof C0704i) {
                    this.f2526Q0.add(constraintWidget4);
                } else {
                    constraintWidget4.mo2792e(cVar, Z);
                }
            }
        }
        while (this.f2526Q0.size() > 0) {
            int size2 = this.f2526Q0.size();
            Iterator<ConstraintWidget> it = this.f2526Q0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0704i iVar = (C0704i) it.next();
                HashSet<ConstraintWidget> hashSet = this.f2526Q0;
                int i7 = 0;
                while (true) {
                    if (i7 >= iVar.f21717x0) {
                        z3 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(iVar.f21716w0[i7])) {
                        z3 = true;
                        continue;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (z3) {
                    iVar.mo2792e(cVar, Z);
                    this.f2526Q0.remove(iVar);
                    break;
                }
            }
            if (size2 == this.f2526Q0.size()) {
                Iterator<ConstraintWidget> it2 = this.f2526Q0.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2792e(cVar, Z);
                }
                this.f2526Q0.clear();
            }
        }
        if (C0680c.f2351p) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget5 = this.f21718w0.get(i8);
                constraintWidget5.getClass();
                if ((constraintWidget5 instanceof C0704i) || (constraintWidget5 instanceof C0700f)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    hashSet2.add(constraintWidget5);
                }
            }
            if (this.f2405V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            mo2791d(this, cVar, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) it3.next();
                C0702g.m2079a(this, cVar, constraintWidget6);
                constraintWidget6.mo2792e(cVar, Z);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget7 = this.f21718w0.get(i9);
                if (constraintWidget7 instanceof C0697d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.f2405V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.mo2786P(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.mo2787Q(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget7.mo2792e(cVar, Z);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.mo2786P(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.mo2787Q(dimensionBehaviour2);
                    }
                } else {
                    C0702g.m2079a(this, cVar, constraintWidget7);
                    if ((constraintWidget7 instanceof C0704i) || (constraintWidget7 instanceof C0700f)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        constraintWidget7.mo2792e(cVar, Z);
                    }
                }
            }
        }
        if (this.f2515F0 > 0) {
            C0695b.m2049a(this, cVar, (ArrayList<ConstraintWidget>) null, 0);
        }
        if (this.f2516G0 > 0) {
            C0695b.m2049a(this, cVar, (ArrayList<ConstraintWidget>) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0140 A[EDGE_INSN: B:76:0x0140->B:62:0x0140 ?: BREAK  , SYNTHETIC] */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2836X(int r11, boolean r12) {
        /*
            r10 = this;
            x0.e r0 = r10.f2529y0
            r1 = 1
            r12 = r12 & r1
            androidx.constraintlayout.core.widgets.d r2 = r0.f22162a
            r3 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r2.mo2801n(r3)
            androidx.constraintlayout.core.widgets.d r4 = r0.f22162a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r4.mo2801n(r1)
            androidx.constraintlayout.core.widgets.d r5 = r0.f22162a
            int r5 = r5.mo2808v()
            androidx.constraintlayout.core.widgets.d r6 = r0.f22162a
            int r6 = r6.mo2809w()
            if (r12 == 0) goto L_0x008b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 == r7) goto L_0x0025
            if (r4 != r7) goto L_0x008b
        L_0x0025:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r7 = r0.f22166e
            java.util.Iterator r7 = r7.iterator()
        L_0x002b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0042
            java.lang.Object r8 = r7.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            int r9 = r8.f2481f
            if (r9 != r11) goto L_0x002b
            boolean r8 = r8.mo2826k()
            if (r8 != 0) goto L_0x002b
            r12 = 0
        L_0x0042:
            if (r11 != 0) goto L_0x0068
            if (r12 == 0) goto L_0x008b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r12) goto L_0x008b
            androidx.constraintlayout.core.widgets.d r12 = r0.f22162a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r12.mo2786P(r7)
            androidx.constraintlayout.core.widgets.d r12 = r0.f22162a
            int r7 = r0.mo23388d(r12, r3)
            r12.mo2788R(r7)
            androidx.constraintlayout.core.widgets.d r12 = r0.f22162a
            androidx.constraintlayout.core.widgets.analyzer.c r7 = r12.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r7 = r7.f2480e
            int r12 = r12.mo2807u()
            r7.mo2818d(r12)
            goto L_0x008b
        L_0x0068:
            if (r12 == 0) goto L_0x008b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != r12) goto L_0x008b
            androidx.constraintlayout.core.widgets.d r12 = r0.f22162a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r12.mo2787Q(r7)
            androidx.constraintlayout.core.widgets.d r12 = r0.f22162a
            int r7 = r0.mo23388d(r12, r1)
            r12.mo2785O(r7)
            androidx.constraintlayout.core.widgets.d r12 = r0.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r7 = r12.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r7 = r7.f2480e
            int r12 = r12.mo2802o()
            r7.mo2818d(r12)
        L_0x008b:
            if (r11 != 0) goto L_0x00b4
            androidx.constraintlayout.core.widgets.d r12 = r0.f22162a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r12.f2405V
            r6 = r6[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x009b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r6 != r7) goto L_0x00c3
        L_0x009b:
            int r12 = r12.mo2807u()
            int r12 = r12 + r5
            androidx.constraintlayout.core.widgets.d r6 = r0.f22162a
            androidx.constraintlayout.core.widgets.analyzer.c r6 = r6.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r6.f2484i
            r6.mo2818d(r12)
            androidx.constraintlayout.core.widgets.d r6 = r0.f22162a
            androidx.constraintlayout.core.widgets.analyzer.c r6 = r6.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r6.f2480e
            int r12 = r12 - r5
            r6.mo2818d(r12)
            goto L_0x00dd
        L_0x00b4:
            androidx.constraintlayout.core.widgets.d r12 = r0.f22162a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r12.f2405V
            r5 = r5[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r7) goto L_0x00c5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r7) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r12 = 0
            goto L_0x00de
        L_0x00c5:
            int r12 = r12.mo2802o()
            int r12 = r12 + r6
            androidx.constraintlayout.core.widgets.d r5 = r0.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r5 = r5.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.f2484i
            r5.mo2818d(r12)
            androidx.constraintlayout.core.widgets.d r5 = r0.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r5 = r5.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r5 = r5.f2480e
            int r12 = r12 - r6
            r5.mo2818d(r12)
        L_0x00dd:
            r12 = 1
        L_0x00de:
            r0.mo23391g()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r5 = r0.f22166e
            java.util.Iterator r5 = r5.iterator()
        L_0x00e7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0107
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r6
            int r7 = r6.f2481f
            if (r7 == r11) goto L_0x00f8
            goto L_0x00e7
        L_0x00f8:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.f2477b
            androidx.constraintlayout.core.widgets.d r8 = r0.f22162a
            if (r7 != r8) goto L_0x0103
            boolean r7 = r6.f2482g
            if (r7 != 0) goto L_0x0103
            goto L_0x00e7
        L_0x0103:
            r6.mo2822e()
            goto L_0x00e7
        L_0x0107:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r5 = r0.f22166e
            java.util.Iterator r5 = r5.iterator()
        L_0x010d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0140
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r6 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r6
            int r7 = r6.f2481f
            if (r7 == r11) goto L_0x011e
            goto L_0x010d
        L_0x011e:
            if (r12 != 0) goto L_0x0127
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r6.f2477b
            androidx.constraintlayout.core.widgets.d r8 = r0.f22162a
            if (r7 != r8) goto L_0x0127
            goto L_0x010d
        L_0x0127:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.f2483h
            boolean r7 = r7.f2473j
            if (r7 != 0) goto L_0x012e
            goto L_0x013f
        L_0x012e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r6.f2484i
            boolean r7 = r7.f2473j
            if (r7 != 0) goto L_0x0135
            goto L_0x013f
        L_0x0135:
            boolean r7 = r6 instanceof p305x0.C7132c
            if (r7 != 0) goto L_0x010d
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r6.f2480e
            boolean r6 = r6.f2473j
            if (r6 != 0) goto L_0x010d
        L_0x013f:
            r1 = 0
        L_0x0140:
            androidx.constraintlayout.core.widgets.d r11 = r0.f22162a
            r11.mo2786P(r2)
            androidx.constraintlayout.core.widgets.d r11 = r0.f22162a
            r11.mo2787Q(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0697d.mo2836X(int, boolean):boolean");
    }

    /* renamed from: Z */
    public final boolean mo2837Z(int i) {
        return (this.f2519J0 & i) == i;
    }

    /* renamed from: r */
    public final void mo2805r(StringBuilder sb) {
        sb.append(this.f2430k + ":{\n");
        sb.append("  actualWidth:" + this.f2407X);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f2408Y);
        sb.append("\n");
        Iterator<ConstraintWidget> it = this.f21718w0.iterator();
        while (it.hasNext()) {
            it.next().mo2805r(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
