package p605ki;

import p364al.C13483d;
import p844ul.C19957a;

/* renamed from: ki.c */
public final class C18049c<R> implements C13483d<Void> {

    /* renamed from: a */
    public final /* synthetic */ C19957a f46185a;

    public C18049c(C19957a aVar) {
        this.f46185a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r4 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x045c, code lost:
        if (r0 != false) goto L_0x045e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ad  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:170:0x0424=Splitter:B:170:0x0424, B:196:0x046d=Splitter:B:196:0x046d, B:200:0x047e=Splitter:B:200:0x047e} */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p364al.C13487h<java.lang.Void> mo40394C() {
        /*
            r22 = this;
            r1 = r22
            ul.a r2 = r1.f46185a
            r2.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            rl.b r0 = r2.f50741a
            java.util.Date r4 = r0.f49039g
            long r4 = r4.getTime()
            java.lang.Long r6 = p772rl.C19287b.f49032i
            long r6 = r6.longValue()
            r8 = 1
            r9 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 > 0) goto L_0x002c
            al.h r4 = r0.mo51701e()
            boolean r4 = r4.mo40399a()
            if (r4 == 0) goto L_0x002c
            r4 = 1
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            r5 = 0
            if (r4 != 0) goto L_0x004c
            java.util.Date r4 = r0.f49039g
            long r6 = r4.getTime()
            java.lang.Long r4 = p772rl.C19287b.f49031h
            long r10 = r4.longValue()
            long r10 = r10 + r6
            do.b r4 = r0.f49036d
            long r6 = r4.mo49402a()
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            if (r4 == 0) goto L_0x005d
        L_0x004c:
            al.h r0 = r0.mo51702f()
            boolean r4 = r0.mo40399a()
            if (r4 == 0) goto L_0x005d
            pj.a r0 = r0.f33366b
            al.h r0 = p772rl.C19287b.m46543c(r0)
            goto L_0x0062
        L_0x005d:
            al.h r0 = new al.h
            r0.<init>(r5, r5)
        L_0x0062:
            boolean r4 = r0.mo40399a()
            if (r4 == 0) goto L_0x006d
            pj.a r0 = r0.f33366b
            r3.add(r0)
        L_0x006d:
            gn.a r0 = r2.f50745e     // Catch:{ ConvertedErrorException -> 0x0074 }
            boolean r0 = r0.mo49784a()     // Catch:{ ConvertedErrorException -> 0x0074 }
            goto L_0x0082
        L_0x0074:
            r0 = move-exception
            jk.f r4 = r2.f50746f
            r4.getClass()
            pj.a r0 = p583jk.C17873f.m44275b(r0)
            r3.add(r0)
            r0 = 0
        L_0x0082:
            if (r0 == 0) goto L_0x0095
            xm.d r0 = r2.f50742b
            al.h r0 = r0.mo40394C()
            boolean r4 = r0.mo40399a()
            if (r4 == 0) goto L_0x0095
            pj.a r0 = r0.f33366b
            r3.add(r0)
        L_0x0095:
            sl.h r0 = r2.f50743c
            vl.a r4 = r0.f49538f
            boolean r4 = r4.mo52404a()
            r6 = 304(0x130, float:4.26E-43)
            if (r4 != 0) goto L_0x00a8
            al.h r0 = new al.h
            r0.<init>(r5, r5)
            goto L_0x0205
        L_0x00a8:
            ol.c r4 = r0.f49536d
            co.n r7 = r4.f47809a
            java.lang.String r10 = ce0.C21100e.m49332a0()
            r11 = 16
            byte[] r11 = new byte[r11]
            r11 = {116, 105, 99, 107, 101, 116, 102, 97, 99, 101, 115, 46, 106, 115, 111, 110} // fill-array
            java.lang.String r11 = ce0.C21100e.m49304E(r11)
            co.r r7 = r7.mo40787d(r10, r11)
            boolean r10 = r7.mo40817a()
            if (r10 == 0) goto L_0x00cd
            al.h r4 = new al.h
            pj.a r7 = r7.f34120b
            r4.<init>(r5, r7)
            goto L_0x0109
        L_0x00cd:
            S r7 = r7.f34119a
            if (r7 == 0) goto L_0x00fd
            r10 = r7
            byte[] r10 = (byte[]) r10
            int r10 = r10.length
            if (r10 != 0) goto L_0x00d8
            goto L_0x00fd
        L_0x00d8:
            java.lang.String r10 = new java.lang.String     // Catch:{ JSONException -> 0x00f0 }
            byte[] r7 = (byte[]) r7     // Catch:{ JSONException -> 0x00f0 }
            r10.<init>(r7)     // Catch:{ JSONException -> 0x00f0 }
            xi.d r4 = r4.f47810b     // Catch:{ JSONException -> 0x00f0 }
            java.lang.Class<ok.e> r7 = p702ok.C18779e.class
            java.lang.Object r4 = r4.mo52732a(r7, r10)     // Catch:{ JSONException -> 0x00f0 }
            ok.e r4 = (p702ok.C18779e) r4     // Catch:{ JSONException -> 0x00f0 }
            al.h r7 = new al.h     // Catch:{ JSONException -> 0x00f0 }
            r7.<init>(r4, r5)     // Catch:{ JSONException -> 0x00f0 }
            r4 = r7
            goto L_0x0109
        L_0x00f0:
            al.h r4 = new al.h
            ik.a r7 = new ik.a
            java.lang.String r10 = "Error converting from ticket face metadata json."
            r7.<init>(r10)
            r4.<init>(r5, r7)
            goto L_0x0109
        L_0x00fd:
            al.h r4 = new al.h
            ik.a r7 = new ik.a
            java.lang.String r10 = "Ticket face metadata is empty."
            r7.<init>(r10)
            r4.<init>(r5, r7)
        L_0x0109:
            r10 = 0
            do.b r7 = r0.f49539g
            long r12 = r7.mo49402a()
            boolean r7 = r4.mo40399a()
            if (r7 != 0) goto L_0x0120
            S r4 = r4.f33365a
            ok.e r4 = (p702ok.C18779e) r4
            java.lang.String r7 = r4.f47805a
            long r10 = r4.f47806b
            goto L_0x0121
        L_0x0120:
            r7 = r5
        L_0x0121:
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            long r14 = r12 - r14
            int r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x0200
            cm.a r4 = r0.f49540h
            al.h r4 = r4.mo40777a()
            boolean r10 = r4.mo40399a()
            if (r10 == 0) goto L_0x013e
            pj.a r0 = r4.f33366b
            al.h r0 = p796sl.C19478h.m46870a(r0)
            goto L_0x0205
        L_0x013e:
            S r4 = r4.f33365a
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r10 = "Content-Type"
            java.lang.String r11 = "application/zip"
            r4.put(r10, r11)
            if (r7 == 0) goto L_0x0150
            java.lang.String r10 = "If-Modified-Since"
            r4.put(r10, r7)
        L_0x0150:
            cm.e$a r14 = r0.f49533a
            java.lang.String r10 = "https://"
            java.lang.StringBuilder r10 = p379.C13555b.m33972k(r10)
            java.lang.String r11 = r0.f49534b
            r10.append(r11)
            java.lang.String r11 = "/edge/universal-tickets/"
            r10.append(r11)
            java.lang.String r11 = r0.f49535c
            java.lang.String r15 = ".zip"
            java.lang.String r15 = p001a0.C0016g.m31o(r10, r11, r15)
            com.masabi.justride.sdk.internal.models.network.HttpMethod r16 = com.masabi.justride.sdk.internal.models.network.HttpMethod.GET
            java.util.Map r18 = java.util.Collections.emptyMap()
            byte[] r10 = new byte[r9]
            r17 = r4
            r19 = r10
            cm.e r4 = r14.mo40779a(r15, r16, r17, r18, r19)
            al.h r4 = r4.mo40394C()
            boolean r10 = r4.mo40399a()
            if (r10 == 0) goto L_0x018c
            pj.a r0 = r4.f33366b
            al.h r0 = p796sl.C19478h.m46870a(r0)
            goto L_0x0205
        L_0x018c:
            S r10 = r4.f33365a
            tk.g r10 = (p819tk.C19690g) r10
            int r10 = r10.f49981c
            if (r10 != r6) goto L_0x01ac
            ok.e r4 = new ok.e
            r4.<init>(r7, r12)
            ol.c r0 = r0.f49536d
            al.h r0 = r0.mo51266b(r4)
            boolean r4 = r0.mo40399a()
            if (r4 == 0) goto L_0x0200
            pj.a r0 = r0.f33366b
            al.h r0 = p796sl.C19478h.m46870a(r0)
            goto L_0x0205
        L_0x01ac:
            co.n r6 = r0.f49537e
            java.lang.String r10 = ce0.C21100e.m49332a0()
            java.lang.String r11 = mf0.C24361g.m61147Q()
            S r14 = r4.f33365a
            tk.g r14 = (p819tk.C19690g) r14
            byte[] r14 = r14.f49980b
            co.r r6 = r6.mo40786c(r10, r11, r14)
            boolean r10 = r6.mo40817a()
            if (r10 == 0) goto L_0x01cd
            pj.a r0 = r6.f34120b
            al.h r0 = p796sl.C19478h.m46870a(r0)
            goto L_0x0205
        L_0x01cd:
            S r6 = r4.f33365a
            tk.g r6 = (p819tk.C19690g) r6
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f49979a
            java.lang.String r10 = "Last-Modified"
            boolean r6 = r6.containsKey(r10)
            if (r6 == 0) goto L_0x01e8
            S r4 = r4.f33365a
            tk.g r4 = (p819tk.C19690g) r4
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f49979a
            java.lang.Object r4 = r4.get(r10)
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
        L_0x01e8:
            ok.e r4 = new ok.e
            r4.<init>(r7, r12)
            ol.c r0 = r0.f49536d
            al.h r0 = r0.mo51266b(r4)
            boolean r4 = r0.mo40399a()
            if (r4 == 0) goto L_0x0200
            pj.a r0 = r0.f33366b
            al.h r0 = p796sl.C19478h.m46870a(r0)
            goto L_0x0205
        L_0x0200:
            al.h r0 = new al.h
            r0.<init>(r5, r5)
        L_0x0205:
            boolean r4 = r0.mo40399a()
            if (r4 == 0) goto L_0x0210
            pj.a r0 = r0.f33366b
            r3.add(r0)
        L_0x0210:
            sl.g r0 = r2.f50744d
            vl.a r4 = r0.f49532f
            boolean r4 = r4.mo52404a()
            if (r4 != 0) goto L_0x0221
            al.h r0 = new al.h
            r0.<init>(r5, r5)
            goto L_0x02a7
        L_0x0221:
            co.n r4 = r0.f49530d
            java.lang.String r6 = ce0.C21100e.m49332a0()
            java.lang.String r7 = mf0.C24361g.m61147Q()
            co.r r4 = r4.mo40788e(r6, r7)
            boolean r6 = r4.mo40817a()
            if (r6 == 0) goto L_0x023c
            pj.a r0 = r4.f34120b
            al.h r0 = p796sl.C19477g.m46869a(r0)
            goto L_0x02a7
        L_0x023c:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            S r4 = r4.f34119a
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0252
            tj.a r0 = new tj.a
            java.lang.Integer r4 = p818tj.C19683a.f49963i
            r0.<init>(r5, r4, r5)
            al.h r0 = p796sl.C19477g.m46869a(r0)
            goto L_0x02a7
        L_0x0252:
            co.n r4 = r0.f49530d
            java.lang.String r6 = ce0.C21100e.m49332a0()
            java.lang.String r7 = mf0.C24361g.m61147Q()
            co.r r4 = r4.mo40787d(r6, r7)
            boolean r6 = r4.mo40817a()
            if (r6 == 0) goto L_0x026d
            pj.a r0 = r4.f34120b
            al.h r0 = p796sl.C19477g.m46869a(r0)
            goto L_0x02a7
        L_0x026d:
            co.q r6 = r0.f49529c
            S r4 = r4.f34119a
            byte[] r4 = (byte[]) r4
            java.io.File r7 = new java.io.File
            java.lang.String r10 = r0.f49528b
            java.lang.String r11 = "templates"
            r7.<init>(r10, r11)
            java.io.File r10 = new java.io.File
            java.lang.String r11 = r0.f49527a
            r10.<init>(r7, r11)
            java.lang.String r7 = r10.getAbsolutePath()
            co.r r4 = r6.mo40801a(r7, r4)
            boolean r6 = r4.mo40817a()
            if (r6 == 0) goto L_0x0298
            pj.a r0 = r4.f34120b
            al.h r0 = p796sl.C19477g.m46869a(r0)
            goto L_0x02a7
        L_0x0298:
            vn.k r4 = new vn.k
            r4.<init>()
            vn.i r0 = r0.f49531e
            r0.mo52410a(r4)
            al.h r0 = new al.h
            r0.<init>(r5, r5)
        L_0x02a7:
            boolean r4 = r0.mo40399a()
            if (r4 == 0) goto L_0x02b2
            pj.a r0 = r0.f33366b
            r3.add(r0)
        L_0x02b2:
            vl.a r0 = r2.f50749i
            java.util.List<java.lang.String> r4 = r0.f51160a
            java.lang.String r6 = "account-based-ticketing"
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x02c5
            boolean r0 = r0.f51161b
            if (r0 == 0) goto L_0x02c3
            goto L_0x02c5
        L_0x02c3:
            r0 = 0
            goto L_0x02c6
        L_0x02c5:
            r0 = 1
        L_0x02c6:
            r4 = 900(0x384, float:1.261E-42)
            if (r0 == 0) goto L_0x06a6
            bl.h r6 = r2.f50747g
            java.lang.Class<lk.c> r7 = p631lk.C18235c.class
            vl.a r0 = r6.f33666d
            java.util.List<java.lang.String> r10 = r0.f51160a
            java.lang.String r11 = "account-based-ticketing"
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x02e1
            boolean r0 = r0.f51161b
            if (r0 == 0) goto L_0x02df
            goto L_0x02e1
        L_0x02df:
            r0 = 0
            goto L_0x02e2
        L_0x02e1:
            r0 = 1
        L_0x02e2:
            if (r0 != 0) goto L_0x02eb
            java.lang.Integer r0 = p748qj.C19130a.f48633j
            al.h r0 = p389bl.C13642h.m34139a(r0, r5)
            goto L_0x0311
        L_0x02eb:
            fl.d r0 = r6.f33663a
            al.h r0 = r0.mo49645a()
            boolean r10 = r0.mo40399a()
            if (r10 == 0) goto L_0x0302
            pj.a r0 = r0.f33366b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            al.h r0 = p389bl.C13642h.m34139a(r4, r0)
            goto L_0x0311
        L_0x0302:
            S r0 = r0.f33365a
            r10 = r0
            jn.d r10 = (p586jn.C17898d) r10
            boolean r0 = r10.f45931b
            if (r0 != 0) goto L_0x0317
            java.lang.Integer r0 = p748qj.C19130a.f48631h
            al.h r0 = p389bl.C13642h.m34139a(r0, r5)
        L_0x0311:
            r20 = r2
            r21 = r3
            goto L_0x0668
        L_0x0317:
            bl.e r0 = r6.f33665c
            co.n r11 = r0.f33650a
            java.lang.String r12 = ce0.C21100e.m49326U()
            java.lang.String r13 = p583jk.C17884p.m44383w()
            co.r r11 = r11.mo40787d(r12, r13)
            boolean r12 = r11.mo40817a()
            if (r12 == 0) goto L_0x033c
            qj.a r0 = new qj.a
            java.lang.Integer r12 = p748qj.C19130a.f48628e
            pj.a r11 = r11.f34120b
            r0.<init>((java.lang.Integer) r12, (p725pj.C18926a) r11)
            al.h r11 = new al.h
            r11.<init>(r5, r0)
            goto L_0x0371
        L_0x033c:
            S r11 = r11.f34119a
            if (r11 == 0) goto L_0x036c
            byte[] r11 = (byte[]) r11
            int r12 = r11.length
            if (r12 != 0) goto L_0x0346
            goto L_0x036c
        L_0x0346:
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            r12.<init>(r11, r13)
            xi.d r0 = r0.f33651b     // Catch:{ JSONException -> 0x035b }
            java.lang.Object r0 = r0.mo52732a(r7, r12)     // Catch:{ JSONException -> 0x035b }
            lk.c r0 = (p631lk.C18235c) r0     // Catch:{ JSONException -> 0x035b }
            al.h r11 = new al.h
            r11.<init>(r0, r5)
            goto L_0x0371
        L_0x035b:
            r0 = move-exception
            ik.a r11 = new ik.a
            java.lang.String r0 = r0.getMessage()
            r11.<init>(r0)
            al.h r0 = new al.h
            r0.<init>(r5, r11)
            r11 = r0
            goto L_0x0371
        L_0x036c:
            al.h r11 = new al.h
            r11.<init>(r5, r5)
        L_0x0371:
            S r0 = r11.f33365a
            lk.c r0 = (p631lk.C18235c) r0
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x0389
            java.lang.String r11 = "?issueVersion=%d"
            java.lang.Object[] r8 = new java.lang.Object[r8]
            long r12 = r0.f46519b
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r8[r9] = r0
            java.lang.String r11 = java.lang.String.format(r11, r8)
        L_0x0389:
            fm.a r8 = r6.f33664b
            com.masabi.justride.sdk.jobs.network.eta.ETAEndpoint r9 = com.masabi.justride.sdk.jobs.network.eta.ETAEndpoint.GET_BARCODE
            jn.f r0 = r10.f45930a
            java.lang.String r10 = r0.f45939a
            java.lang.String r12 = ""
            cm.a r0 = r8.f44173b
            al.h r0 = r0.mo40777a()
            boolean r13 = r0.mo40399a()
            if (r13 == 0) goto L_0x03b5
            pj.a r0 = r0.f33366b
            ak.b r8 = new ak.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r9 = "Unexpected error"
            r8.<init>(r0, r4, r9)
            al.h r0 = new al.h
            r0.<init>(r5, r8)
            r20 = r2
            goto L_0x04bd
        L_0x03b5:
            S r0 = r0.f33365a
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4
            en.a r5 = r8.f44172a
            monitor-enter(r5)
            java.lang.String r0 = r5.f43833g     // Catch:{ all -> 0x06a3 }
            if (r0 == 0) goto L_0x047c
            fl.d r0 = r5.f43830d     // Catch:{ all -> 0x06a3 }
            al.h r0 = r0.mo49645a()     // Catch:{ all -> 0x06a3 }
            boolean r13 = r0.mo40399a()     // Catch:{ all -> 0x06a3 }
            if (r13 == 0) goto L_0x03d8
            pj.a r0 = r0.f33366b     // Catch:{ all -> 0x06a3 }
            al.h r0 = p468en.C16841a.m42633a(r0)     // Catch:{ all -> 0x06a3 }
            monitor-exit(r5)
        L_0x03d4:
            r20 = r2
            goto L_0x04a2
        L_0x03d8:
            hn.b r13 = r5.f43831e     // Catch:{ all -> 0x06a3 }
            al.h r13 = r13.mo49922a()     // Catch:{ all -> 0x06a3 }
            boolean r14 = r13.mo40399a()     // Catch:{ all -> 0x06a3 }
            if (r14 == 0) goto L_0x03ec
            pj.a r0 = r13.f33366b     // Catch:{ all -> 0x06a3 }
            al.h r0 = p468en.C16841a.m42633a(r0)     // Catch:{ all -> 0x06a3 }
            monitor-exit(r5)
            goto L_0x03d4
        L_0x03ec:
            en.c r14 = r5.f43828b     // Catch:{ all -> 0x06a3 }
            java.lang.String r15 = r5.f43833g     // Catch:{ all -> 0x06a3 }
            al.h r14 = r14.mo49504a(r15)     // Catch:{ all -> 0x06a3 }
            boolean r15 = r14.mo40399a()     // Catch:{ all -> 0x06a3 }
            if (r15 == 0) goto L_0x0402
            pj.a r0 = r14.f33366b     // Catch:{ all -> 0x06a3 }
            al.h r0 = p468en.C16841a.m42633a(r0)     // Catch:{ all -> 0x06a3 }
            monitor-exit(r5)
            goto L_0x03d4
        L_0x0402:
            S r14 = r14.f33365a     // Catch:{ all -> 0x06a3 }
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch:{ all -> 0x06a3 }
            java.lang.String r15 = "exp"
            long r15 = r14.getLong(r15)     // Catch:{ JSONException -> 0x046a }
            java.lang.String r1 = "appId"
            java.lang.String r1 = r14.getString(r1)     // Catch:{ JSONException -> 0x046a }
            r20 = r2
            java.lang.String r2 = "accountId"
            boolean r2 = r14.has(r2)     // Catch:{ JSONException -> 0x0468 }
            if (r2 == 0) goto L_0x0423
            java.lang.String r2 = "accountId"
            java.lang.String r2 = r14.getString(r2)     // Catch:{ JSONException -> 0x0468 }
            goto L_0x0424
        L_0x0423:
            r2 = 0
        L_0x0424:
            do.b r14 = r5.f43829c     // Catch:{ all -> 0x06a3 }
            long r17 = r14.mo49402a()     // Catch:{ all -> 0x06a3 }
            long r15 = r15 - r17
            r17 = 30000(0x7530, double:1.4822E-319)
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 < 0) goto L_0x0434
            r14 = 1
            goto L_0x0435
        L_0x0434:
            r14 = 0
        L_0x0435:
            if (r14 == 0) goto L_0x047e
            if (r1 == 0) goto L_0x047e
            S r13 = r13.f33365a     // Catch:{ all -> 0x06a3 }
            boolean r1 = r1.equals(r13)     // Catch:{ all -> 0x06a3 }
            if (r1 == 0) goto L_0x047e
            S r0 = r0.f33365a     // Catch:{ all -> 0x06a3 }
            jn.d r0 = (p586jn.C17898d) r0     // Catch:{ all -> 0x06a3 }
            if (r2 != 0) goto L_0x044b
            boolean r1 = r0.f45931b     // Catch:{ all -> 0x06a3 }
            if (r1 == 0) goto L_0x045e
        L_0x044b:
            jn.f r0 = r0.f45930a     // Catch:{ all -> 0x06a3 }
            if (r2 == 0) goto L_0x045b
            if (r0 == 0) goto L_0x045b
            java.lang.String r0 = r0.f45939a     // Catch:{ all -> 0x06a3 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x06a3 }
            if (r0 == 0) goto L_0x045b
            r0 = 1
            goto L_0x045c
        L_0x045b:
            r0 = 0
        L_0x045c:
            if (r0 == 0) goto L_0x047e
        L_0x045e:
            al.h r0 = new al.h     // Catch:{ all -> 0x06a3 }
            java.lang.String r1 = r5.f43833g     // Catch:{ all -> 0x06a3 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x06a3 }
            monitor-exit(r5)
            goto L_0x04a2
        L_0x0468:
            r0 = move-exception
            goto L_0x046d
        L_0x046a:
            r0 = move-exception
            r20 = r2
        L_0x046d:
            jk.f r1 = r5.f43832f     // Catch:{ all -> 0x06a3 }
            r1.getClass()     // Catch:{ all -> 0x06a3 }
            pj.a r0 = p583jk.C17873f.m44275b(r0)     // Catch:{ all -> 0x06a3 }
            al.h r0 = p468en.C16841a.m42633a(r0)     // Catch:{ all -> 0x06a3 }
            monitor-exit(r5)
            goto L_0x04a2
        L_0x047c:
            r20 = r2
        L_0x047e:
            en.b r0 = r5.f43827a     // Catch:{ all -> 0x06a3 }
            java.lang.String r1 = "eta"
            al.h r0 = r0.mo49503a(r1)     // Catch:{ all -> 0x06a3 }
            boolean r1 = r0.mo40399a()     // Catch:{ all -> 0x06a3 }
            if (r1 == 0) goto L_0x0494
            pj.a r0 = r0.f33366b     // Catch:{ all -> 0x06a3 }
            al.h r0 = p468en.C16841a.m42633a(r0)     // Catch:{ all -> 0x06a3 }
            monitor-exit(r5)
            goto L_0x04a2
        L_0x0494:
            S r0 = r0.f33365a     // Catch:{ all -> 0x06a3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x06a3 }
            r5.f43833g = r0     // Catch:{ all -> 0x06a3 }
            al.h r1 = new al.h     // Catch:{ all -> 0x06a3 }
            r2 = 0
            r1.<init>(r0, r2)     // Catch:{ all -> 0x06a3 }
            monitor-exit(r5)
            r0 = r1
        L_0x04a2:
            boolean r1 = r0.mo40399a()
            if (r1 == 0) goto L_0x04c1
            pj.a r0 = r0.f33366b
            ak.b r1 = new ak.b
            r2 = 900(0x384, float:1.261E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "Unexpected error"
            r1.<init>(r0, r2, r4)
            al.h r0 = new al.h
            r2 = 0
            r0.<init>(r2, r1)
        L_0x04bd:
            r21 = r3
            goto L_0x056c
        L_0x04c1:
            java.lang.String r1 = "Bearer "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            S r0 = r0.f33365a
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Authorization"
            r4.put(r1, r0)
            java.lang.String r0 = r8.f44175d
            java.lang.String r1 = r8.f44176e
            java.lang.String r2 = r9.getIdentifierType()
            java.lang.String r5 = r9.getPath()
            java.lang.String r13 = r9.getApiVersion()
            if (r0 == 0) goto L_0x069b
            if (r1 == 0) goto L_0x0693
            if (r10 == 0) goto L_0x068b
            if (r2 == 0) goto L_0x0683
            if (r5 == 0) goto L_0x067b
            if (r13 != 0) goto L_0x04f5
            java.lang.String r13 = "v1"
        L_0x04f5:
            java.lang.String r14 = "https://"
            java.lang.String r15 = "/edge/eta/"
            r21 = r3
            java.lang.String r3 = "/rider/"
            java.lang.StringBuilder r0 = p379.C16759e.m42352h(r14, r0, r15, r13, r3)
            java.lang.String r3 = "/"
            p001a0.C0017h.m61R(r0, r1, r3, r2, r3)
            r0.append(r10)
            boolean r1 = r5.startsWith(r3)
            if (r1 != 0) goto L_0x0512
            r0.append(r3)
        L_0x0512:
            r0.append(r5)
            if (r11 == 0) goto L_0x0525
            java.lang.String r1 = "?"
            boolean r2 = r11.startsWith(r1)
            if (r2 != 0) goto L_0x0522
            r0.append(r1)
        L_0x0522:
            r0.append(r11)
        L_0x0525:
            java.lang.String r15 = r0.toString()
            cm.f$a r0 = r8.f44174c
            com.masabi.justride.sdk.internal.models.network.HttpMethod r16 = r9.getHttpMethod()
            java.util.Map r18 = java.util.Collections.emptyMap()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r19 = r12.getBytes(r1)
            cm.f r1 = new cm.f
            bo.b r14 = r0.f34069a
            r13 = r1
            r17 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            al.h r0 = r1.mo40394C()
            boolean r1 = r0.mo40399a()
            if (r1 == 0) goto L_0x0563
            pj.a r0 = r0.f33366b
            ak.b r1 = new ak.b
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Underlying network error."
            r1.<init>(r0, r2, r3)
            al.h r0 = new al.h
            r2 = 0
            r0.<init>(r2, r1)
            goto L_0x056c
        L_0x0563:
            r1 = 0
            al.h r2 = new al.h
            S r0 = r0.f33365a
            r2.<init>(r0, r1)
            r0 = r2
        L_0x056c:
            boolean r1 = r0.mo40399a()
            if (r1 == 0) goto L_0x0580
            pj.a r0 = r0.f33366b
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            al.h r0 = p389bl.C13642h.m34139a(r1, r0)
            goto L_0x0668
        L_0x0580:
            S r0 = r0.f33365a
            tk.g r0 = (p819tk.C19690g) r0
            int r1 = r0.f49981c
            byte[] r0 = r0.f49980b
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r0, r3)
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 != r0) goto L_0x05b5
            bl.e r0 = r6.f33665c
            al.h r0 = r0.mo40523a()
            boolean r1 = r0.mo40399a()
            if (r1 == 0) goto L_0x05ad
            pj.a r0 = r0.f33366b
            r1 = 900(0x384, float:1.261E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            al.h r0 = p389bl.C13642h.m34139a(r1, r0)
            goto L_0x0668
        L_0x05ad:
            al.h r0 = new al.h
            r1 = 0
            r0.<init>(r1, r1)
            goto L_0x0668
        L_0x05b5:
            r0 = 0
            r3 = 304(0x130, float:4.26E-43)
            if (r1 != r3) goto L_0x05c2
            al.h r1 = new al.h
            r1.<init>(r0, r0)
            r0 = r1
            goto L_0x0668
        L_0x05c2:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x05d9
            ak.d r3 = new ak.d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.<init>(r1, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            al.h r0 = p389bl.C13642h.m34139a(r0, r3)
            goto L_0x0668
        L_0x05d9:
            boolean r0 = ce0.C21100e.m49352m0(r2)
            if (r0 == 0) goto L_0x05e8
            java.lang.Integer r0 = p748qj.C19130a.f48632i
            r1 = 0
            al.h r0 = p389bl.C13642h.m34139a(r0, r1)
            goto L_0x0668
        L_0x05e8:
            bl.e r0 = r6.f33665c
            r0.getClass()
            xi.d r1 = r0.f33651b     // Catch:{ JSONException -> 0x063e }
            java.lang.Object r1 = r1.mo52732a(r7, r2)     // Catch:{ JSONException -> 0x063e }
            lk.c r1 = (p631lk.C18235c) r1     // Catch:{ JSONException -> 0x063e }
            co.n r3 = r0.f33650a
            java.lang.String r4 = ce0.C21100e.m49326U()
            java.lang.String r5 = p583jk.C17884p.m44383w()
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r6)
            co.r r2 = r3.mo40786c(r4, r5, r2)
            boolean r3 = r2.mo40817a()
            if (r3 == 0) goto L_0x061f
            qj.a r0 = new qj.a
            java.lang.Integer r1 = p748qj.C19130a.f48629f
            pj.a r2 = r2.f34120b
            r0.<init>((java.lang.Integer) r1, (p725pj.C18926a) r2)
            al.h r1 = new al.h
            r2 = 0
            r1.<init>(r2, r0)
            goto L_0x064f
        L_0x061f:
            bl.d r2 = r0.f33653d
            r2.getClass()
            in.a r2 = new in.a
            java.lang.String r3 = r1.f46518a
            java.lang.String r1 = r1.f46520c
            r2.<init>(r3, r1)
            vn.a r1 = new vn.a
            r1.<init>(r2)
            vn.i r0 = r0.f33652c
            r0.mo52410a(r1)
            al.h r1 = new al.h
            r0 = 0
            r1.<init>(r0, r0)
            goto L_0x064f
        L_0x063e:
            r0 = move-exception
            ik.a r1 = new ik.a
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            al.h r0 = new al.h
            r2 = 0
            r0.<init>(r2, r1)
            r1 = r0
        L_0x064f:
            boolean r0 = r1.mo40399a()
            if (r0 == 0) goto L_0x0662
            pj.a r0 = r1.f33366b
            r1 = 900(0x384, float:1.261E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            al.h r0 = p389bl.C13642h.m34139a(r1, r0)
            goto L_0x0668
        L_0x0662:
            al.h r0 = new al.h
            r1 = 0
            r0.<init>(r1, r1)
        L_0x0668:
            boolean r1 = r0.mo40399a()
            if (r1 == 0) goto L_0x0676
            pj.a r0 = r0.f33366b
            r1 = r21
            r1.add(r0)
            goto L_0x0678
        L_0x0676:
            r1 = r21
        L_0x0678:
            r2 = r20
            goto L_0x06a7
        L_0x067b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "path cannot be null"
            r0.<init>(r1)
            throw r0
        L_0x0683:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "identifier type cannot be null"
            r0.<init>(r1)
            throw r0
        L_0x068b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "identifier cannot be null"
            r0.<init>(r1)
            throw r0
        L_0x0693:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "brandId cannot be null"
            r0.<init>(r1)
            throw r0
        L_0x069b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "hostname cannot be null"
            r0.<init>(r1)
            throw r0
        L_0x06a3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x06a6:
            r1 = r3
        L_0x06a7:
            wn.b r0 = r2.f50748h
            r0.mo44369b()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x06cb
            uj.a r0 = new uj.a
            r2 = 900(0x384, float:1.261E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            pj.a r1 = (p725pj.C18926a) r1
            r0.<init>(r1, r2)
            al.h r1 = new al.h
            r2 = 0
            r1.<init>(r2, r0)
            goto L_0x06d1
        L_0x06cb:
            r0 = 0
            al.h r1 = new al.h
            r1.<init>(r0, r0)
        L_0x06d1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p605ki.C18049c.mo40394C():al.h");
    }
}
