package p875vs;

import android.content.res.Configuration;
import c00.C13720d;
import c00.C13722f;
import c70.C13779s;
import com.moovit.commons.request.BadResponseException;
import com.tranzmate.moovit.protocol.users.MVExternalWebPagesResponse;
import java.util.List;
import org.apache.thrift.TBase;
import p929xy.C20663f;
import p977zz.C20943i;

/* renamed from: vs.d */
public final class C20225d extends C20663f<List<C20222a>> {

    /* renamed from: vs.d$a */
    public static /* synthetic */ class C20226a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51330a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.users.MVExternalWebPageType[] r0 = com.tranzmate.moovit.protocol.users.MVExternalWebPageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51330a = r0
                com.tranzmate.moovit.protocol.users.MVExternalWebPageType r1 = com.tranzmate.moovit.protocol.users.MVExternalWebPageType.MENU     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51330a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.users.MVExternalWebPageType r1 = com.tranzmate.moovit.protocol.users.MVExternalWebPageType.DASHBOARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p875vs.C20225d.C20226a.<clinit>():void");
        }
    }

    /* renamed from: vs.d$b */
    public static class C20227b extends C13779s<C20227b, MVExternalWebPagesResponse, List<C20222a>> {
        public C20227b() {
            super(MVExternalWebPagesResponse.class);
        }

        /* renamed from: e */
        public final Object mo23773e(TBase tBase) throws BadResponseException {
            return C13720d.m34273c(((MVExternalWebPagesResponse) tBase).externalWebPages, (C13722f) null, new C20228e(0));
        }
    }

    /* renamed from: l */
    public final Object mo40536l(Configuration configuration) {
        return C20943i.m49050c(configuration);
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: o */
    public final java.lang.Object mo6593o(c70.C13752e r8, p646lz.C18299a r9, com.moovit.network.model.ServerId r10, long r11) throws java.io.IOException, com.moovit.commons.appdata.AppDataPartLoadFailedException, com.moovit.commons.request.ServerException {
        /*
            r7 = this;
            java.lang.Class<yr.c> r0 = p945yr.C20758c.class
            java.lang.String r1 = "METRO_CONTEXT"
            java.lang.Object r9 = r9.mo50690c(r1)
            r6 = r9
            tp.f r6 = (p824tp.C19728f) r6
            android.content.Context r1 = r8.f33852a     // Catch:{ Exception -> 0x0029 }
            tp.a0 r5 = r8.f33853b     // Catch:{ Exception -> 0x0029 }
            r2 = 2131888717(0x7f120a4d, float:1.9412077E38)
            r3 = 2131886478(0x7f12018e, float:1.9407536E38)
            java.lang.String r4 = ""
            android.net.Uri r9 = c70.C13772m.m34411L(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0029 }
            c70.m r1 = new c70.m     // Catch:{ Exception -> 0x0029 }
            java.lang.Class<vs.d$b> r2 = p875vs.C20225d.C20227b.class
            r1.<init>(r8, r9, r2)     // Catch:{ Exception -> 0x0029 }
            wz.g r9 = r1.mo52626J()     // Catch:{ Exception -> 0x0029 }
            vs.d$b r9 = (p875vs.C20225d.C20227b) r9     // Catch:{ Exception -> 0x0029 }
            goto L_0x0032
        L_0x0029:
            r9 = move-exception
            de.f r1 = p435de.C16596f.m42113a()
            r1.mo49364c(r9)
            r9 = 0
        L_0x0032:
            android.content.Context r2 = r8.f33852a
            iq.b r8 = p567iq.C17635b.m43779f(r2)
            s00.d r8 = r8.mo52084b(r10, r11)
            wr.b r8 = (p898wr.C20400b) r8
            if (r9 == 0) goto L_0x006c
            R r10 = r9.f33924g
            if (r10 != 0) goto L_0x0045
            goto L_0x006c
        L_0x0045:
            boolean r10 = r9.mo52635a()
            if (r10 == 0) goto L_0x0067
            s00.b r8 = r8.mo51794a(r0)
            yr.c r8 = (p945yr.C20758c) r8
            R r10 = r9.f33924g
            r6 = r10
            java.util.List r6 = (java.util.List) r6
            yr.c$a r10 = new yr.c$a
            com.moovit.network.model.ServerId r3 = r8.mo52107d()
            long r4 = r8.mo52109f()
            r1 = r10
            r1.<init>(r2, r3, r4, r6)
            r10.run()
        L_0x0067:
            R r8 = r9.f33924g
            java.util.List r8 = (java.util.List) r8
            goto L_0x0084
        L_0x006c:
            s00.b r8 = r8.mo51794a(r0)
            yr.c r8 = (p945yr.C20758c) r8
            monitor-enter(r8)
            monitor-enter(r8)     // Catch:{ all -> 0x0088 }
            java.util.List<vs.a> r9 = r8.f52375b     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x007a
            r9 = 1
            goto L_0x007b
        L_0x007a:
            r9 = 0
        L_0x007b:
            monitor-exit(r8)     // Catch:{ all -> 0x0088 }
            if (r9 != 0) goto L_0x0081
            r8.mo52894i(r2)     // Catch:{ all -> 0x0088 }
        L_0x0081:
            monitor-exit(r8)
            java.util.List<vs.a> r8 = r8.f52375b
        L_0x0084:
            return r8
        L_0x0085:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0088 }
            throw r9     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p875vs.C20225d.mo6593o(c70.e, lz.a, com.moovit.network.model.ServerId, long):java.lang.Object");
    }
}
