package hi0;

import ii0.C23610d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okio.ByteString;
import si0.C24901h;

/* renamed from: hi0.u */
public final class C23563u extends C23521b0 {

    /* renamed from: e */
    public static final C23562t f59556e = C23562t.m57742b("multipart/mixed");

    /* renamed from: f */
    public static final C23562t f59557f = C23562t.m57742b("multipart/form-data");

    /* renamed from: g */
    public static final byte[] f59558g = {58, 32};

    /* renamed from: h */
    public static final byte[] f59559h = {13, 10};

    /* renamed from: i */
    public static final byte[] f59560i = {45, 45};

    /* renamed from: a */
    public final ByteString f59561a;

    /* renamed from: b */
    public final C23562t f59562b;

    /* renamed from: c */
    public final List<C23565b> f59563c;

    /* renamed from: d */
    public long f59564d = -1;

    /* renamed from: hi0.u$a */
    public static final class C23564a {

        /* renamed from: a */
        public final ByteString f59565a;

        /* renamed from: b */
        public C23562t f59566b = C23563u.f59556e;

        /* renamed from: c */
        public final ArrayList f59567c = new ArrayList();

        public C23564a() {
            String uuid = UUID.randomUUID().toString();
            ByteString byteString = ByteString.f62330d;
            this.f59565a = ByteString.C24633a.m61918a(uuid);
        }
    }

    /* renamed from: hi0.u$b */
    public static final class C23565b {

        /* renamed from: a */
        public final C23556q f59568a;

        /* renamed from: b */
        public final C23521b0 f59569b;

        public C23565b(C23556q qVar, C23521b0 b0Var) {
            this.f59568a = qVar;
            this.f59569b = b0Var;
        }
    }

    static {
        C23562t.m57742b("multipart/alternative");
        C23562t.m57742b("multipart/digest");
        C23562t.m57742b("multipart/parallel");
    }

    public C23563u(ByteString byteString, C23562t tVar, ArrayList arrayList) {
        this.f59561a = byteString;
        this.f59562b = C23562t.m57742b(tVar + "; boundary=" + byteString.mo60881t());
        this.f59563c = C23610d.m57804l(arrayList);
    }

    /* renamed from: a */
    public final long mo53612a() throws IOException {
        long j = this.f59564d;
        if (j != -1) {
            return j;
        }
        long f = mo58714f((C24901h) null, true);
        this.f59564d = f;
        return f;
    }

    /* renamed from: b */
    public final C23562t mo53613b() {
        return this.f59562b;
    }

    /* renamed from: e */
    public final void mo53614e(C24901h hVar) throws IOException {
        mo58714f(hVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: si0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: si0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: si0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: si0.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: si0.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo58714f(si0.C24901h r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            si0.f r13 = new si0.f
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<hi0.u$b> r1 = r12.f59563c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a3
            java.util.List<hi0.u$b> r6 = r12.f59563c
            java.lang.Object r6 = r6.get(r5)
            hi0.u$b r6 = (hi0.C23563u.C23565b) r6
            hi0.q r7 = r6.f59568a
            hi0.b0 r6 = r6.f59569b
            byte[] r8 = f59560i
            r13.write(r8)
            okio.ByteString r8 = r12.f59561a
            r13.mo61390R1(r8)
            byte[] r8 = f59559h
            r13.write(r8)
            if (r7 == 0) goto L_0x0059
            java.lang.String[] r8 = r7.f59531a
            int r8 = r8.length
            int r8 = r8 / 2
            r9 = 0
        L_0x0039:
            if (r9 >= r8) goto L_0x0059
            java.lang.String r10 = r7.mo58683d(r9)
            si0.h r10 = r13.mo61387Q(r10)
            byte[] r11 = f59558g
            si0.h r10 = r10.write(r11)
            java.lang.String r11 = r7.mo58686g(r9)
            si0.h r10 = r10.mo61387Q(r11)
            byte[] r11 = f59559h
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x0039
        L_0x0059:
            hi0.t r7 = r6.mo53613b()
            if (r7 == 0) goto L_0x0070
            java.lang.String r8 = "Content-Type: "
            si0.h r8 = r13.mo61387Q(r8)
            java.lang.String r7 = r7.f59553a
            si0.h r7 = r8.mo61387Q(r7)
            byte[] r8 = f59559h
            r7.write(r8)
        L_0x0070:
            long r7 = r6.mo53612a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008a
            java.lang.String r9 = "Content-Length: "
            si0.h r9 = r13.mo61387Q(r9)
            si0.h r9 = r9.mo61386O0(r7)
            byte[] r10 = f59559h
            r9.write(r10)
            goto L_0x0090
        L_0x008a:
            if (r14 == 0) goto L_0x0090
            r0.mo61413i()
            return r9
        L_0x0090:
            byte[] r9 = f59559h
            r13.write(r9)
            if (r14 == 0) goto L_0x0099
            long r3 = r3 + r7
            goto L_0x009c
        L_0x0099:
            r6.mo53614e(r13)
        L_0x009c:
            r13.write(r9)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a3:
            byte[] r1 = f59560i
            r13.write(r1)
            okio.ByteString r2 = r12.f59561a
            r13.mo61390R1(r2)
            r13.write(r1)
            byte[] r1 = f59559h
            r13.write(r1)
            if (r14 == 0) goto L_0x00bd
            long r13 = r0.f62947c
            long r3 = r3 + r13
            r0.mo61413i()
        L_0x00bd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C23563u.mo58714f(si0.h, boolean):long");
    }
}
