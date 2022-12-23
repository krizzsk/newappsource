package p514gl;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import p364al.C13483d;
import p364al.C13487h;
import p411cm.C13843a;
import p411cm.C13847e;
import p468en.C16843c;
import p490fl.C17036d;
import p562il.C17620a;
import p586jn.C17897c;
import p608kl.C18092b;
import p608kl.C18094d;
import p632ll.C18238b;
import p703ol.C18781a;
import p725pj.C18926a;
import p770rj.C19280b;
import p868vl.C20154a;
import p870vn.C20169i;
import p913xi.C20531d;
import p916xl.C20536b;

/* renamed from: gl.b */
public final class C17203b implements C13483d {

    /* renamed from: a */
    public final C18238b f44454a;

    /* renamed from: b */
    public final C18781a f44455b;

    /* renamed from: c */
    public final C18092b f44456c;

    /* renamed from: d */
    public final C17036d f44457d;

    /* renamed from: e */
    public final C13847e.C13848a f44458e;

    /* renamed from: f */
    public final C17620a.C17621a f44459f;

    /* renamed from: g */
    public final C20154a f44460g;

    /* renamed from: h */
    public final C13843a f44461h;

    /* renamed from: i */
    public final C20531d f44462i;

    /* renamed from: j */
    public final C20169i f44463j;

    /* renamed from: k */
    public final C16843c f44464k;

    /* renamed from: l */
    public final C18094d f44465l;

    /* renamed from: m */
    public final C20536b f44466m;

    /* renamed from: n */
    public final String f44467n;

    /* renamed from: o */
    public final String f44468o;

    /* renamed from: p */
    public final String f44469p;

    /* renamed from: q */
    public final boolean f44470q = true;

    /* renamed from: gl.b$a */
    public static class C17204a {

        /* renamed from: a */
        public final C18238b f44471a;

        /* renamed from: b */
        public final C18781a f44472b;

        /* renamed from: c */
        public final C18092b f44473c;

        /* renamed from: d */
        public final C17036d f44474d;

        /* renamed from: e */
        public final C13847e.C13848a f44475e;

        /* renamed from: f */
        public final C17620a.C17621a f44476f;

        /* renamed from: g */
        public final C20154a f44477g;

        /* renamed from: h */
        public final C13843a f44478h;

        /* renamed from: i */
        public final C20531d f44479i;

        /* renamed from: j */
        public final C20169i f44480j;

        /* renamed from: k */
        public final C16843c f44481k;

        /* renamed from: l */
        public final C18094d f44482l;

        /* renamed from: m */
        public final C20536b f44483m;

        /* renamed from: n */
        public final String f44484n;

        /* renamed from: o */
        public final String f44485o;

        public C17204a(C18238b bVar, C18781a aVar, C18092b bVar2, C17036d dVar, C13847e.C13848a aVar2, C17620a.C17621a aVar3, C20154a aVar4, C13843a aVar5, C20531d dVar2, C20169i iVar, C16843c cVar, C18094d dVar3, C20536b bVar3, String str, String str2) {
            this.f44471a = bVar;
            this.f44472b = aVar;
            this.f44473c = bVar2;
            this.f44474d = dVar;
            this.f44475e = aVar2;
            this.f44476f = aVar3;
            this.f44477g = aVar4;
            this.f44478h = aVar5;
            this.f44479i = dVar2;
            this.f44480j = iVar;
            this.f44481k = cVar;
            this.f44482l = dVar3;
            this.f44483m = bVar3;
            this.f44484n = str;
            this.f44485o = str2;
        }
    }

    public C17203b(C18238b bVar, C18781a aVar, C18092b bVar2, C17036d dVar, C13847e.C13848a aVar2, C17620a.C17621a aVar3, C20154a aVar4, C13843a aVar5, C20531d dVar2, C20169i iVar, C16843c cVar, C18094d dVar3, C20536b bVar3, String str, String str2, String str3) {
        this.f44454a = bVar;
        this.f44455b = aVar;
        this.f44456c = bVar2;
        this.f44457d = dVar;
        this.f44458e = aVar2;
        this.f44459f = aVar3;
        this.f44460g = aVar4;
        this.f44461h = aVar5;
        this.f44462i = dVar2;
        this.f44463j = iVar;
        this.f44464k = cVar;
        this.f44465l = dVar3;
        this.f44466m = bVar3;
        this.f44467n = str;
        this.f44468o = str2;
        this.f44469p = str3;
    }

    /* renamed from: a */
    public static C19280b m43189a(Integer num, C18926a aVar) {
        return new C19280b(aVar, num, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p364al.C13487h<p586jn.C17897c> mo40394C() {
        /*
            r11 = this;
            vl.a r0 = r11.f44460g
            java.util.List<java.lang.String> r1 = r0.f51160a
            java.lang.String r2 = "all"
            boolean r1 = r1.contains(r2)
            r2 = 1
            if (r1 != 0) goto L_0x001a
            java.util.List<java.lang.String> r0 = r0.f51160a
            java.lang.String r1 = "external-authentication"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = 0
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.lang.Integer r0 = p770rj.C19280b.f48994f
            java.lang.String r2 = "The external-authentication entitlement is required for this API"
            al.h r0 = r11.mo49780b(r1, r0, r2)
            return r0
        L_0x0027:
            ll.b r0 = r11.f44454a
            al.h r0 = r0.mo40394C()
            boolean r3 = r0.mo40399a()
            r4 = 900(0x384, float:1.261E-42)
            if (r3 == 0) goto L_0x0042
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r2 = "Unexpected error"
            pj.a r0 = r0.f33366b
            al.h r0 = r11.mo49780b(r0, r1, r2)
            return r0
        L_0x0042:
            ol.a r0 = r11.f44455b
            al.h r0 = r0.mo51264a()
            boolean r3 = r0.mo40399a()
            if (r3 == 0) goto L_0x005b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r2 = "Unexpected error"
            pj.a r0 = r0.f33366b
            al.h r0 = r11.mo49780b(r0, r1, r2)
            return r0
        L_0x005b:
            S r0 = r0.f33365a
            java.lang.String r0 = (java.lang.String) r0
            fl.d r3 = r11.f44457d
            al.h r3 = r3.mo49645a()
            boolean r5 = r3.mo40399a()
            if (r5 == 0) goto L_0x0078
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "Unexpected error"
            pj.a r2 = r3.f33366b
            al.h r0 = r11.mo49780b(r2, r0, r1)
            return r0
        L_0x0078:
            en.c r4 = r11.f44464k
            java.lang.String r5 = r11.f44469p
            java.lang.String r6 = "sub"
            al.h r5 = r4.mo49504a(r5)
            boolean r7 = r5.mo40399a()
            if (r7 == 0) goto L_0x0090
            al.h r4 = new al.h
            pj.a r5 = r5.f33366b
            r4.<init>(r1, r5)
            goto L_0x00b8
        L_0x0090:
            al.h r7 = new al.h     // Catch:{ JSONException -> 0x009f }
            S r5 = r5.f33365a     // Catch:{ JSONException -> 0x009f }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ JSONException -> 0x009f }
            java.lang.String r5 = r5.getString(r6)     // Catch:{ JSONException -> 0x009f }
            r7.<init>(r5, r1)     // Catch:{ JSONException -> 0x009f }
            r4 = r7
            goto L_0x00b8
        L_0x009f:
            r5 = move-exception
            al.h r6 = new al.h
            zj.a r7 = new zj.a
            java.lang.Integer r8 = p961zj.C20871a.f52607h
            jk.f r4 = r4.f43837b
            r4.getClass()
            pj.a r4 = p583jk.C17873f.m44275b(r5)
            java.lang.String r5 = "Failed to read json."
            r7.<init>(r4, r8, r5)
            r6.<init>(r1, r7)
            r4 = r6
        L_0x00b8:
            boolean r5 = r4.mo40399a()
            if (r5 == 0) goto L_0x00c9
            java.lang.Integer r0 = p770rj.C19280b.f49006r
            java.lang.String r1 = "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."
            pj.a r2 = r4.f33366b
            al.h r0 = r11.mo49780b(r2, r0, r1)
            return r0
        L_0x00c9:
            S r4 = r4.f33365a
            java.lang.String r4 = (java.lang.String) r4
            S r3 = r3.f33365a
            jn.d r3 = (p586jn.C17898d) r3
            boolean r5 = r3.f45931b
            if (r5 == 0) goto L_0x00e8
            jn.f r3 = r3.f45930a
            java.lang.String r3 = r3.f45941c
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x00e8
            java.lang.Integer r0 = p770rj.C19280b.f48993e
            java.lang.String r2 = "Another user is currently logged in. Please log out and retry."
            al.h r0 = r11.mo49780b(r1, r0, r2)
            return r0
        L_0x00e8:
            kl.b r3 = r11.f44456c
            al.h r3 = r3.mo50540a()
            boolean r4 = r3.mo40399a()
            if (r4 == 0) goto L_0x00fb
            pj.a r0 = r3.f33366b
            al.h r0 = r11.mo49781c(r0)
            return r0
        L_0x00fb:
            S r3 = r3.f33365a
            if (r3 != 0) goto L_0x0108
            java.lang.Integer r0 = p770rj.C19280b.f48995g
            java.lang.String r2 = "Missing session token"
            al.h r0 = r11.mo49780b(r1, r0, r2)
            return r0
        L_0x0108:
            kn.a r3 = (p610kn.C18107a) r3
            java.lang.String r3 = r3.f46300a
            nk.c r4 = new nk.c
            java.lang.String r5 = r11.f44469p
            boolean r6 = r11.f44470q
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4.<init>(r3, r0, r5, r6)
            xi.d r0 = r11.f44462i     // Catch:{ JSONException -> 0x0371 }
            java.lang.String r0 = r0.mo52733b(r4)     // Catch:{ JSONException -> 0x0371 }
            cm.a r4 = r11.f44461h
            al.h r4 = r4.mo40777a()
            boolean r5 = r4.mo40399a()
            if (r5 == 0) goto L_0x0132
            pj.a r0 = r4.f33366b
            al.h r0 = r11.mo49781c(r0)
            return r0
        L_0x0132:
            S r4 = r4.f33365a
            r8 = r4
            java.util.Map r8 = (java.util.Map) r8
            com.masabi.justride.sdk.jobs.network.rider.RiderServiceEndpoint r4 = com.masabi.justride.sdk.jobs.network.rider.RiderServiceEndpoint.EXTERNAL_AUTHENTICATION
            java.lang.String r5 = "https://"
            java.lang.StringBuilder r5 = p379.C13555b.m33972k(r5)
            java.lang.String r6 = r11.f44467n
            r5.append(r6)
            java.lang.String r6 = "/edge/rider/api/v1/"
            r5.append(r6)
            java.lang.String r6 = r11.f44468o
            r5.append(r6)
            java.lang.String r6 = "/"
            r5.append(r6)
            java.lang.String r6 = r4.getPath()
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            cm.e$a r5 = r11.f44458e
            com.masabi.justride.sdk.internal.models.network.HttpMethod r7 = r4.getHttpMethod()
            java.util.Map r9 = java.util.Collections.emptyMap()
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r10 = r0.getBytes(r4)
            cm.e r0 = r5.mo40779a(r6, r7, r8, r9, r10)
            al.h r0 = r0.mo40394C()
            boolean r4 = r0.mo40399a()
            if (r4 == 0) goto L_0x02d0
            pj.a r0 = r0.f33366b
            java.lang.String r4 = r0.f48169a
            java.lang.String r5 = "network.http"
            boolean r4 = r4.equals(r5)
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == 0) goto L_0x02bf
            java.lang.Integer r4 = r0.f48170b
            java.lang.Integer r6 = p363ak.C13478d.f33355g
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x01e0
            java.lang.String r0 = r0.f48171c
            boolean r2 = ce0.C21100e.m49352m0(r0)
            if (r2 == 0) goto L_0x01a5
            java.lang.Integer r0 = p770rj.C19280b.f48996h
            java.lang.String r2 = "Device switch information missing from server response."
            al.h r0 = r11.mo49780b(r1, r0, r2)
            goto L_0x01df
        L_0x01a5:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01d1 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x01d1 }
            xi.d r0 = r11.f44462i     // Catch:{ JSONException -> 0x01d1 }
            java.lang.String r3 = "assignedDeviceChangeStatus"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ JSONException -> 0x01d1 }
            java.lang.Class<mk.f> r3 = p654mk.C18384f.class
            xi.a r0 = r0.mo52734c(r3)     // Catch:{ JSONException -> 0x01d1 }
            java.lang.Object r0 = r0.mo40384d(r2)     // Catch:{ JSONException -> 0x01d1 }
            mk.f r0 = (p654mk.C18384f) r0     // Catch:{ JSONException -> 0x01d1 }
            jn.a r2 = new jn.a
            r2.<init>(r0)
            jn.c r0 = new jn.c
            com.masabi.justride.sdk.models.account.LoginResult r3 = com.masabi.justride.sdk.models.account.LoginResult.FAILED_ACCOUNT_ASSIGNED_TO_ANOTHER_DEVICE
            r0.<init>(r2, r3, r1)
            al.h r2 = new al.h
            r2.<init>(r0, r1)
            r0 = r2
            goto L_0x01df
        L_0x01d1:
            r0 = move-exception
            ik.a r1 = new ik.a
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.<init>(r0)
            al.h r0 = r11.mo49781c(r1)
        L_0x01df:
            return r0
        L_0x01e0:
            java.lang.Integer r6 = p363ak.C13478d.f33356h
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x01f8
            java.lang.Integer r6 = p363ak.C13478d.f33353e
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x01f8
            java.lang.Integer r6 = p363ak.C13478d.f33354f
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x02bf
        L_0x01f8:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r6 = r0.f48171c     // Catch:{ JSONException -> 0x02b3 }
            r4.<init>(r6)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r6 = "errorCode"
            java.lang.String r4 = r4.getString(r6)     // Catch:{ JSONException -> 0x02b3 }
            int r6 = r4.hashCode()     // Catch:{ JSONException -> 0x02b3 }
            switch(r6) {
                case -1345867105: goto L_0x0252;
                case -1125000185: goto L_0x0248;
                case -1111187466: goto L_0x023e;
                case 209869184: goto L_0x0234;
                case 409825925: goto L_0x022a;
                case 696544716: goto L_0x0221;
                case 1260938626: goto L_0x0217;
                case 2096172017: goto L_0x020d;
                default: goto L_0x020c;
            }     // Catch:{ JSONException -> 0x02b3 }
        L_0x020c:
            goto L_0x025c
        L_0x020d:
            java.lang.String r2 = "CANNOT_PARSE_TOKEN"
            boolean r2 = r4.equals(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r2 == 0) goto L_0x025c
            r2 = 4
            goto L_0x025d
        L_0x0217:
            java.lang.String r2 = "BAD_CREDENTIALS"
            boolean r2 = r4.equals(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r2 == 0) goto L_0x025c
            r2 = 7
            goto L_0x025d
        L_0x0221:
            java.lang.String r6 = "BLOCKED"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x02b3 }
            if (r4 == 0) goto L_0x025c
            goto L_0x025d
        L_0x022a:
            java.lang.String r2 = "INVALID_TOKEN_FORMAT"
            boolean r2 = r4.equals(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r2 == 0) goto L_0x025c
            r2 = 6
            goto L_0x025d
        L_0x0234:
            java.lang.String r2 = "FAILED_VERIFYING_SIGNATURE"
            boolean r2 = r4.equals(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r2 == 0) goto L_0x025c
            r2 = 5
            goto L_0x025d
        L_0x023e:
            java.lang.String r2 = "BAD_SESSION_TOKEN"
            boolean r2 = r4.equals(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r2 == 0) goto L_0x025c
            r2 = 0
            goto L_0x025d
        L_0x0248:
            java.lang.String r2 = "INVALID_REQUEST"
            boolean r2 = r4.equals(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r2 == 0) goto L_0x025c
            r2 = 2
            goto L_0x025d
        L_0x0252:
            java.lang.String r2 = "TOKEN_EXPIRED"
            boolean r2 = r4.equals(r2)     // Catch:{ JSONException -> 0x02b3 }
            if (r2 == 0) goto L_0x025c
            r2 = 3
            goto L_0x025d
        L_0x025c:
            r2 = -1
        L_0x025d:
            switch(r2) {
                case 0: goto L_0x029a;
                case 1: goto L_0x0290;
                case 2: goto L_0x0289;
                case 3: goto L_0x027f;
                case 4: goto L_0x0278;
                case 5: goto L_0x0271;
                case 6: goto L_0x026a;
                case 7: goto L_0x0263;
                default: goto L_0x0260;
            }     // Catch:{ JSONException -> 0x02b3 }
        L_0x0260:
            rj.b r2 = new rj.b     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02a4
        L_0x0263:
            java.lang.Integer r2 = p770rj.C19280b.f49004p     // Catch:{ JSONException -> 0x02b3 }
            rj.b r2 = m43189a(r2, r0)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02ad
        L_0x026a:
            java.lang.Integer r2 = p770rj.C19280b.f49003o     // Catch:{ JSONException -> 0x02b3 }
            rj.b r2 = m43189a(r2, r0)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02ad
        L_0x0271:
            java.lang.Integer r2 = p770rj.C19280b.f49002n     // Catch:{ JSONException -> 0x02b3 }
            rj.b r2 = m43189a(r2, r0)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02ad
        L_0x0278:
            java.lang.Integer r2 = p770rj.C19280b.f49001m     // Catch:{ JSONException -> 0x02b3 }
            rj.b r2 = m43189a(r2, r0)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02ad
        L_0x027f:
            r11.mo49782d(r3)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.Integer r2 = p770rj.C19280b.f49000l     // Catch:{ JSONException -> 0x02b3 }
            rj.b r2 = m43189a(r2, r0)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02ad
        L_0x0289:
            java.lang.Integer r2 = p770rj.C19280b.f48999k     // Catch:{ JSONException -> 0x02b3 }
            rj.b r2 = m43189a(r2, r0)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02ad
        L_0x0290:
            r11.mo49782d(r3)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.Integer r2 = p770rj.C19280b.f48998j     // Catch:{ JSONException -> 0x02b3 }
            rj.b r2 = m43189a(r2, r0)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02ad
        L_0x029a:
            r11.mo49782d(r3)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.Integer r2 = p770rj.C19280b.f48997i     // Catch:{ JSONException -> 0x02b3 }
            rj.b r2 = m43189a(r2, r0)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02ad
        L_0x02a4:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x02b3 }
            java.lang.String r4 = "Underlying network error."
            r2.<init>(r0, r3, r4)     // Catch:{ JSONException -> 0x02b3 }
        L_0x02ad:
            al.h r3 = new al.h     // Catch:{ JSONException -> 0x02b3 }
            r3.<init>(r1, r2)     // Catch:{ JSONException -> 0x02b3 }
            goto L_0x02be
        L_0x02b3:
            r1 = move-exception
            java.lang.Integer r2 = p770rj.C19280b.f49005q
            java.lang.String r1 = r1.getLocalizedMessage()
            al.h r3 = r11.mo49780b(r0, r2, r1)
        L_0x02be:
            return r3
        L_0x02bf:
            rj.b r2 = new rj.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.String r4 = "Underlying network error."
            r2.<init>(r0, r3, r4)
            al.h r0 = new al.h
            r0.<init>(r1, r2)
            return r0
        L_0x02d0:
            xi.d r2 = r11.f44462i     // Catch:{ JSONException -> 0x0362 }
            java.lang.String r3 = new java.lang.String     // Catch:{ JSONException -> 0x0362 }
            S r0 = r0.f33365a     // Catch:{ JSONException -> 0x0362 }
            tk.g r0 = (p819tk.C19690g) r0     // Catch:{ JSONException -> 0x0362 }
            byte[] r0 = r0.f49980b     // Catch:{ JSONException -> 0x0362 }
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ JSONException -> 0x0362 }
            r3.<init>(r0, r4)     // Catch:{ JSONException -> 0x0362 }
            java.lang.Class<nk.d> r0 = p678nk.C18574d.class
            java.lang.Object r0 = r2.mo52732a(r0, r3)     // Catch:{ JSONException -> 0x0362 }
            nk.d r0 = (p678nk.C18574d) r0     // Catch:{ JSONException -> 0x0362 }
            jn.f r2 = new jn.f
            java.lang.String r3 = r0.f47280d
            java.lang.String r4 = r0.f47277a
            java.lang.String r5 = r0.f47281e
            r2.<init>(r3, r4, r5)
            kl.b r3 = r11.f44456c
            java.lang.Object r3 = r3.f46253e
            monitor-enter(r3)
            il.a$a r4 = r11.f44459f     // Catch:{ all -> 0x035f }
            il.a r5 = new il.a     // Catch:{ all -> 0x035f }
            co.n r6 = r4.f45296a     // Catch:{ all -> 0x035f }
            xi.d r4 = r4.f45297b     // Catch:{ all -> 0x035f }
            r5.<init>(r6, r4, r2)     // Catch:{ all -> 0x035f }
            al.h r4 = r5.mo40394C()     // Catch:{ all -> 0x035f }
            boolean r5 = r4.mo40399a()     // Catch:{ all -> 0x035f }
            if (r5 == 0) goto L_0x0314
            pj.a r0 = r4.f33366b     // Catch:{ all -> 0x035f }
            al.h r0 = r11.mo49781c(r0)     // Catch:{ all -> 0x035f }
            monitor-exit(r3)     // Catch:{ all -> 0x035f }
            return r0
        L_0x0314:
            kn.a r4 = new kn.a     // Catch:{ all -> 0x035f }
            java.lang.String r5 = r0.f47278b     // Catch:{ all -> 0x035f }
            java.lang.Long r0 = r0.f47279c     // Catch:{ all -> 0x035f }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x035f }
            kl.b r0 = r11.f44456c     // Catch:{ all -> 0x035f }
            java.lang.Object r5 = r0.f46253e     // Catch:{ all -> 0x035f }
            monitor-enter(r5)     // Catch:{ all -> 0x035f }
            pl.b r6 = r0.f46250b     // Catch:{ all -> 0x035c }
            al.h r6 = r6.mo51446a(r4)     // Catch:{ all -> 0x035c }
            boolean r7 = r6.mo40399a()     // Catch:{ all -> 0x035c }
            if (r7 != 0) goto L_0x0330
            r0.f46254f = r4     // Catch:{ all -> 0x035c }
        L_0x0330:
            monitor-exit(r5)     // Catch:{ all -> 0x035c }
            boolean r0 = r6.mo40399a()     // Catch:{ all -> 0x035f }
            if (r0 == 0) goto L_0x033f
            pj.a r0 = r6.f33366b     // Catch:{ all -> 0x035f }
            al.h r0 = r11.mo49781c(r0)     // Catch:{ all -> 0x035f }
            monitor-exit(r3)     // Catch:{ all -> 0x035f }
            return r0
        L_0x033f:
            monitor-exit(r3)     // Catch:{ all -> 0x035f }
            jn.c r0 = new jn.c
            com.masabi.justride.sdk.models.account.LoginResult r3 = com.masabi.justride.sdk.models.account.LoginResult.SUCCESS
            r0.<init>(r1, r3, r2)
            vn.g r3 = new vn.g
            jn.d r4 = new jn.d
            r4.<init>(r2)
            r3.<init>(r4)
            vn.i r2 = r11.f44463j
            r2.mo52410a(r3)
            al.h r2 = new al.h
            r2.<init>(r0, r1)
            return r2
        L_0x035c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x035c }
            throw r0     // Catch:{ all -> 0x035f }
        L_0x035f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x035f }
            throw r0
        L_0x0362:
            r0 = move-exception
            ik.a r1 = new ik.a
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.<init>(r0)
            al.h r0 = r11.mo49781c(r1)
            return r0
        L_0x0371:
            r0 = move-exception
            ik.a r1 = new ik.a
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.<init>(r0)
            al.h r0 = r11.mo49781c(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p514gl.C17203b.mo40394C():al.h");
    }

    /* renamed from: b */
    public final C13487h mo49780b(C18926a aVar, Integer num, String str) {
        return new C13487h(null, new C19280b(aVar, num, str));
    }

    /* renamed from: c */
    public final C13487h<C17897c> mo49781c(C18926a aVar) {
        return new C13487h<>(null, new C19280b(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }

    /* renamed from: d */
    public final void mo49782d(String str) {
        C13487h<Void> a = this.f44465l.mo50541a(str);
        if (a.mo40399a()) {
            this.f44466m.mo52737a(a.f33366b);
        }
    }
}
