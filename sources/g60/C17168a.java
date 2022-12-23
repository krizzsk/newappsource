package g60;

import a30.C0068a;
import c70.C13752e;
import com.moovit.masabi.MasabiException;
import com.moovit.payment.masabi.MasabiAccountException;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import h60.C17311e0;
import h60.C17314f0;
import w40.C25761d;

/* renamed from: g60.a */
public final class C17168a {

    /* renamed from: a */
    public static final C17168a f44402a = new C17168a();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized com.moovit.payment.registration.PaymentRegistrationInstructions mo49750a(c70.C13752e r2, java.lang.String r3, java.lang.String r4) throws com.moovit.masabi.MasabiException, com.moovit.commons.request.ServerException {
        /*
            r1 = this;
            monitor-enter(r1)
            w40.d r0 = w40.C25761d.m64299a()     // Catch:{ all -> 0x002c }
            boolean r0 = r0.mo83590e()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0018
            a30.a r0 = a30.C0068a.m120b(r4)     // Catch:{ all -> 0x002c }
            boolean r0 = r0.mo163f()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0018
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x0018:
            monitor-enter(r1)     // Catch:{ all -> 0x002c }
            r0 = 0
            com.moovit.payment.registration.PaymentRegistrationInstructions r2 = r1.mo49751b(r2, r3, r4, r0)     // Catch:{ Exception -> 0x0022 }
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            goto L_0x0028
        L_0x0020:
            r2 = move-exception
            goto L_0x002a
        L_0x0022:
            r0 = 1
            com.moovit.payment.registration.PaymentRegistrationInstructions r2 = r1.mo49751b(r2, r3, r4, r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
        L_0x0028:
            monitor-exit(r1)
            return r2
        L_0x002a:
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            throw r2     // Catch:{ all -> 0x002c }
        L_0x002c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g60.C17168a.mo49750a(c70.e, java.lang.String, java.lang.String):com.moovit.payment.registration.PaymentRegistrationInstructions");
    }

    /* renamed from: b */
    public final synchronized PaymentRegistrationInstructions mo49751b(C13752e eVar, String str, String str2, boolean z) throws MasabiException {
        try {
            C17314f0 f0Var = (C17314f0) new C17311e0(eVar, str, z).mo52626J();
            PaymentRegistrationInstructions paymentRegistrationInstructions = f0Var.f44698n;
            if (paymentRegistrationInstructions != null) {
                return paymentRegistrationInstructions;
            }
            C0068a.m120b(str2).mo164g(f0Var.f44697m);
            C25761d.m64299a().mo83591f();
            return null;
        } catch (Exception e) {
            throw new MasabiAccountException(e);
        }
    }
}
