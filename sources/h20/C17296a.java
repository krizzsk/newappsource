package h20;

import android.content.Context;
import android.net.Uri;
import c70.C13746a;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPatternTrips;
import com.tranzmate.moovit.protocol.users.MVPhoneOsTypes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p435de.C16596f;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19746x;
import q00.C19047a;
import q40.C6178c;
import r40.C6252c;
import t40.C6590a;
import u40.C6700c;
import u40.C6701d;

/* renamed from: h20.a */
public class C17296a extends C13746a<C17296a, C17297b> {

    /* renamed from: A */
    public final boolean f44678A;

    /* renamed from: B */
    public final String f44679B;

    /* renamed from: v */
    public final C19728f f44680v;

    /* renamed from: w */
    public final C19047a f44681w;

    /* renamed from: x */
    public final ServerId f44682x;

    /* renamed from: y */
    public final int f44683y;

    /* renamed from: z */
    public final boolean f44684z;

    public C17296a(C13752e eVar, C19728f fVar, C19047a aVar, ServerId serverId, int i, boolean z, boolean z2) {
        super(eVar, C19746x.server_path_cdn_server_url, C19746x.api_path_line_group_trips_request_path, false, C17297b.class);
        C21100e.m49373x(fVar, "metroContext");
        this.f44680v = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f44681w = aVar;
        C21100e.m49373x(serverId, "lineGroupId");
        this.f44682x = serverId;
        this.f44684z = z;
        this.f44678A = z2;
        this.f44683y = i;
        this.f44679B = C17296a.class.getSimpleName() + "_" + serverId + "_" + i + "_" + z + "_" + z2;
        mo52627p(serverId.f15142b, "lineGroupId");
        mo52627p(i, "daysEpoch");
        mo52627p(fVar.f50165a.f16126a.f15142b, "metroAreaId");
        mo52628q(fVar.f50165a.f16127b);
        mo52627p(4, "protocolVersionId");
        mo52627p(MVPhoneOsTypes.Android.getValue(), "osTypeId");
    }

    /* renamed from: E */
    public final List<C17297b> mo21059E() throws IOException, ServerException {
        boolean z;
        Map map;
        try {
            Context context = this.f51759b;
            C6178c o = C19731i.m47197a(context).mo52086d(this.f44680v).mo51802d().mo52123o(context);
            C19728f fVar = this.f44680v;
            o.getClass();
            if (!C6178c.m14732b(context, fVar)) {
                return Collections.emptyList();
            }
            Task a = o.mo22161a(this.f33829q, this.f44680v, this.f44681w, this.f44683y, this.f44682x);
            if (this.f44684z) {
                a = a.continueWithTask(MoovitExecutors.f37327IO, new C6701d(this.f33829q, this.f44680v));
            }
            if (this.f44678A) {
                a = a.continueWithTask(MoovitExecutors.f37327IO, new C6700c(this.f33829q, this.f44680v));
            }
            C6590a aVar = (C6590a) Tasks.await(a);
            C6302b bVar = new C6302b(aVar.f20410b.size());
            for (C6252c next : aVar.f20410b) {
                List<TransitPatternTrips> list = next.f19727b;
                if (list != null) {
                    bVar.put(next.f19726a.f23687c, list);
                }
            }
            TransitLineGroup transitLineGroup = aVar.f20409a;
            if (transitLineGroup.f23695c == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                map = C7843b.m17881h(transitLineGroup.f23700h, bVar);
            } else {
                map = Collections.emptyMap();
            }
            this.f51765h = true;
            return Collections.singletonList(new C17297b(aVar.f20409a, bVar, map));
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: s */
    public final Uri mo49828s(Uri uri) throws MalformedURLException {
        Uri s = super.mo49828s(uri);
        C16596f a = C16596f.m42113a();
        StringBuilder k = C13555b.m33972k("LineGroupTripsRequest query: ");
        k.append(s.getQuery());
        a.mo49363b(k.toString());
        return s;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17296a(c70.C13752e r9, p824tp.C19728f r10, q00.C19047a r11, com.moovit.network.model.ServerId r12, com.moovit.util.time.Time r13, boolean r14) {
        /*
            r8 = this;
            g30.h r1 = r10.f50165a
            java.util.TimeZone r1 = r1.f16131f
            if (r13 == 0) goto L_0x0009
            long r3 = r13.f23901b
            goto L_0x000d
        L_0x0009:
            long r3 = java.lang.System.currentTimeMillis()
        L_0x000d:
            java.text.SimpleDateFormat r0 = com.moovit.util.time.C7925b.f23934a
            int r0 = r1.getOffset(r3)
            long r0 = (long) r0
            long r3 = r3 + r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 / r0
            int r5 = (int) r3
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h20.C17296a.<init>(c70.e, tp.f, q00.a, com.moovit.network.model.ServerId, com.moovit.util.time.Time, boolean):void");
    }
}
