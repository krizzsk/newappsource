package p394br;

import android.content.Context;
import android.content.res.Configuration;
import c00.C13720d;
import c00.C13722f;
import c70.C13779s;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.users.MVStaticLineMapResponse;
import java.io.IOException;
import java.util.List;
import org.apache.thrift.TBase;
import p054d0.C4303q;
import p646lz.C18299a;
import p716oy.C18860a;
import p779rs.C19324a;
import p929xy.C20663f;
import p977zz.C20943i;

/* renamed from: br.l */
public final class C13670l extends C20663f<List<C19324a>> {

    /* renamed from: br.l$a */
    public static class C13671a extends C13779s<C13671a, MVStaticLineMapResponse, List<C19324a>> {
        public C13671a() {
            super(MVStaticLineMapResponse.class);
        }

        /* renamed from: e */
        public final Object mo23773e(TBase tBase) throws BadResponseException {
            return C13720d.m34273c(((MVStaticLineMapResponse) tBase).staticLineMap, (C13722f) null, new C4303q(1));
        }
    }

    /* renamed from: l */
    public final Object mo40536l(Configuration configuration) {
        return C20943i.m49050c(configuration);
    }

    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        return C18860a.m45884a().f48016d;
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
            java.lang.Class<yr.b> r0 = p945yr.C20756b.class
            java.lang.String r1 = "METRO_CONTEXT"
            java.lang.Object r9 = r9.mo50690c(r1)
            r6 = r9
            tp.f r6 = (p824tp.C19728f) r6
            android.content.Context r1 = r8.f33852a     // Catch:{ Exception -> 0x0029 }
            tp.a0 r5 = r8.f33853b     // Catch:{ Exception -> 0x0029 }
            r2 = 2131888714(0x7f120a4a, float:1.9412071E38)
            r3 = 2131886458(0x7f12017a, float:1.9407495E38)
            java.lang.String r4 = ""
            android.net.Uri r9 = c70.C13772m.m34411L(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0029 }
            c70.m r1 = new c70.m     // Catch:{ Exception -> 0x0029 }
            java.lang.Class<br.l$a> r2 = p394br.C13670l.C13671a.class
            r1.<init>(r8, r9, r2)     // Catch:{ Exception -> 0x0029 }
            wz.g r9 = r1.mo52626J()     // Catch:{ Exception -> 0x0029 }
            br.l$a r9 = (p394br.C13670l.C13671a) r9     // Catch:{ Exception -> 0x0029 }
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
            yr.b r8 = (p945yr.C20756b) r8
            R r10 = r9.f33924g
            r6 = r10
            java.util.List r6 = (java.util.List) r6
            yr.b$a r10 = new yr.b$a
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
            yr.b r8 = (p945yr.C20756b) r8
            monitor-enter(r8)
            monitor-enter(r8)     // Catch:{ all -> 0x0088 }
            java.util.List<rs.a> r9 = r8.f52370b     // Catch:{ all -> 0x0085 }
            if (r9 == 0) goto L_0x007a
            r9 = 1
            goto L_0x007b
        L_0x007a:
            r9 = 0
        L_0x007b:
            monitor-exit(r8)     // Catch:{ all -> 0x0088 }
            if (r9 != 0) goto L_0x0081
            r8.mo52892h(r2)     // Catch:{ all -> 0x0088 }
        L_0x0081:
            monitor-exit(r8)
            java.util.List<rs.a> r8 = r8.f52370b
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
        throw new UnsupportedOperationException("Method not decompiled: p394br.C13670l.mo6593o(c70.e, lz.a, com.moovit.network.model.ServerId, long):java.lang.Object");
    }
}
