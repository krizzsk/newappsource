package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.veriff.sdk.internal.yo */
public final class C22743yo extends C22754yt {

    /* renamed from: a */
    public static final C22742yn f57545a = C22742yn.m55639a("multipart/mixed");

    /* renamed from: e */
    public static final C22742yn f57546e = C22742yn.m55639a("multipart/form-data");

    /* renamed from: f */
    private static final byte[] f57547f = {58, 32};

    /* renamed from: g */
    private static final byte[] f57548g = {13, 10};

    /* renamed from: h */
    private static final byte[] f57549h = {45, 45};

    /* renamed from: i */
    private final abl f57550i;

    /* renamed from: k */
    private final C22742yn f57551k;

    /* renamed from: l */
    private final List<C22745b> f57552l;

    /* renamed from: m */
    private long f57553m = -1;

    /* renamed from: com.veriff.sdk.internal.yo$a */
    public static final class C22744a {

        /* renamed from: a */
        private final abl f57554a;

        /* renamed from: b */
        private C22742yn f57555b;

        /* renamed from: c */
        private final List<C22745b> f57556c;

        public C22744a() {
            this(UUID.randomUUID().toString());
        }

        /* renamed from: a */
        public C22744a mo57336a(C22742yn ynVar) {
            if (ynVar == null) {
                throw new NullPointerException("type == null");
            } else if (ynVar.mo57329a().equals("multipart")) {
                this.f57555b = ynVar;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + ynVar);
            }
        }

        public C22744a(String str) {
            this.f57555b = C22743yo.f57545a;
            this.f57556c = new ArrayList();
            this.f57554a = abl.m50461a(str);
        }

        /* renamed from: a */
        public C22744a mo57335a(C22736yk ykVar, C22754yt ytVar) {
            return mo57337a(C22745b.m55652a(ykVar, ytVar));
        }

        /* renamed from: a */
        public C22744a mo57337a(C22745b bVar) {
            if (bVar != null) {
                this.f57556c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        /* renamed from: a */
        public C22743yo mo57338a() {
            if (!this.f57556c.isEmpty()) {
                return new C22743yo(this.f57554a, this.f57555b, this.f57556c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: com.veriff.sdk.internal.yo$b */
    public static final class C22745b {

        /* renamed from: a */
        public final C22736yk f57557a;

        /* renamed from: b */
        public final C22754yt f57558b;

        private C22745b(C22736yk ykVar, C22754yt ytVar) {
            this.f57557a = ykVar;
            this.f57558b = ytVar;
        }

        /* renamed from: a */
        public static C22745b m55652a(C22736yk ykVar, C22754yt ytVar) {
            if (ytVar == null) {
                throw new NullPointerException("body == null");
            } else if (ykVar != null && ykVar.mo57267a(HttpHeader.CONTENT_TYPE) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (ykVar == null || ykVar.mo57267a(HttpHeader.CONTENT_LENGTH) == null) {
                return new C22745b(ykVar, ytVar);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }
    }

    static {
        C22742yn.m55639a("multipart/alternative");
        C22742yn.m55639a("multipart/digest");
        C22742yn.m55639a("multipart/parallel");
    }

    public C22743yo(abl abl, C22742yn ynVar, List<C22745b> list) {
        this.f57550i = abl;
        this.f57551k = C22742yn.m55639a(ynVar + "; boundary=" + abl.mo53932a());
        this.f57552l = C22766za.m55828a(list);
    }

    /* renamed from: a */
    public C22742yn mo54065a() {
        return this.f57551k;
    }

    /* renamed from: b */
    public long mo54067b() throws IOException {
        long j = this.f57553m;
        if (j != -1) {
            return j;
        }
        long a = m55644a((abj) null, true);
        this.f57553m = a;
        return a;
    }

    /* renamed from: a */
    public void mo54066a(abj abj) throws IOException {
        m55644a(abj, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.veriff.sdk.internal.abj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.veriff.sdk.internal.abi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.veriff.sdk.internal.abi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.veriff.sdk.internal.abj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.veriff.sdk.internal.abi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m55644a(com.veriff.sdk.internal.abj r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            com.veriff.sdk.internal.abi r13 = new com.veriff.sdk.internal.abi
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<com.veriff.sdk.internal.yo$b> r1 = r12.f57552l
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a4
            java.util.List<com.veriff.sdk.internal.yo$b> r6 = r12.f57552l
            java.lang.Object r6 = r6.get(r5)
            com.veriff.sdk.internal.yo$b r6 = (com.veriff.sdk.internal.C22743yo.C22745b) r6
            com.veriff.sdk.internal.yk r7 = r6.f57557a
            com.veriff.sdk.internal.yt r6 = r6.f57558b
            byte[] r8 = f57549h
            r13.mo53877c(r8)
            com.veriff.sdk.internal.abl r8 = r12.f57550i
            r13.mo53882d(r8)
            byte[] r8 = f57548g
            r13.mo53877c(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.mo57265a()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.mo57266a((int) r9)
            com.veriff.sdk.internal.abj r10 = r13.mo53870b(r10)
            byte[] r11 = f57547f
            com.veriff.sdk.internal.abj r10 = r10.mo53877c(r11)
            java.lang.String r11 = r7.mo57269b((int) r9)
            com.veriff.sdk.internal.abj r10 = r10.mo53870b(r11)
            byte[] r11 = f57548g
            r10.mo53877c(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            com.veriff.sdk.internal.yn r7 = r6.mo54065a()
            if (r7 == 0) goto L_0x0071
            java.lang.String r8 = "Content-Type: "
            com.veriff.sdk.internal.abj r8 = r13.mo53870b(r8)
            java.lang.String r7 = r7.toString()
            com.veriff.sdk.internal.abj r7 = r8.mo53870b(r7)
            byte[] r8 = f57548g
            r7.mo53877c(r8)
        L_0x0071:
            long r7 = r6.mo54067b()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008b
            java.lang.String r9 = "Content-Length: "
            com.veriff.sdk.internal.abj r9 = r13.mo53870b(r9)
            com.veriff.sdk.internal.abj r9 = r9.mo53908m(r7)
            byte[] r10 = f57548g
            r9.mo53877c(r10)
            goto L_0x0091
        L_0x008b:
            if (r14 == 0) goto L_0x0091
            r0.mo53920v()
            return r9
        L_0x0091:
            byte[] r9 = f57548g
            r13.mo53877c(r9)
            if (r14 == 0) goto L_0x009a
            long r3 = r3 + r7
            goto L_0x009d
        L_0x009a:
            r6.mo54066a(r13)
        L_0x009d:
            r13.mo53877c(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a4:
            byte[] r1 = f57549h
            r13.mo53877c(r1)
            com.veriff.sdk.internal.abl r2 = r12.f57550i
            r13.mo53882d(r2)
            r13.mo53877c(r1)
            byte[] r1 = f57548g
            r13.mo53877c(r1)
            if (r14 == 0) goto L_0x00c0
            long r13 = r0.mo53864b()
            long r3 = r3 + r13
            r0.mo53920v()
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22743yo.m55644a(com.veriff.sdk.internal.abj, boolean):long");
    }
}
