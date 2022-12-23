package okhttp3.logging;

import hi0.C23556q;
import hi0.C23560s;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import pi0.C24721f;
import si0.C24898f;

public final class HttpLoggingInterceptor implements C23560s {

    /* renamed from: d */
    public static final Charset f62325d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C24631a f62326a;

    /* renamed from: b */
    public volatile Set<String> f62327b = Collections.emptySet();

    /* renamed from: c */
    public volatile Level f62328c = Level.NONE;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a */
    public interface C24631a {

        /* renamed from: a */
        public static final C24632a f62329a = new C24632a();

        /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a$a */
        public class C24632a implements C24631a {
            /* renamed from: a */
            public final void mo60866a(String str) {
                C24721f.f62584a.mo61202m(4, str, (Throwable) null);
            }
        }
    }

    public HttpLoggingInterceptor() {
        C24631a.C24632a aVar = C24631a.f62329a;
        this.f62326a = aVar;
    }

    /* renamed from: a */
    public static boolean m61899a(C24898f fVar) {
        long j;
        try {
            C24898f fVar2 = new C24898f();
            long j2 = fVar.f62947c;
            if (j2 < 64) {
                j = j2;
            } else {
                j = 64;
            }
            fVar.mo61426t(fVar2, 0, j);
            for (int i = 0; i < 16; i++) {
                if (fVar2.mo61415l1()) {
                    return true;
                }
                int N = fVar2.mo61383N();
                if (Character.isISOControl(N) && !Character.isWhitespace(N)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo60865b(C23556q qVar, int i) {
        String str;
        if (this.f62327b.contains(qVar.mo58683d(i))) {
            str = "██";
        } else {
            str = qVar.mo58686g(i);
        }
        C24631a aVar = this.f62326a;
        ((C24631a.C24632a) aVar).mo60866a(qVar.mo58683d(i) + ": " + str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hi0.C23529c0 intercept(hi0.C23560s.C23561a r22) throws java.io.IOException {
        /*
            r21 = this;
            r1 = r21
            okhttp3.logging.HttpLoggingInterceptor$Level r0 = r1.f62328c
            r2 = r22
            li0.f r2 = (li0.C24319f) r2
            hi0.x r3 = r2.f61618e
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            if (r0 != r4) goto L_0x0013
            hi0.c0 r0 = r2.mo60464a(r3)
            return r0
        L_0x0013:
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            if (r0 != r4) goto L_0x0019
            r4 = 1
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            if (r4 != 0) goto L_0x0023
            okhttp3.logging.HttpLoggingInterceptor$Level r5 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
            if (r0 != r5) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            hi0.b0 r5 = r3.f59639d
            if (r5 == 0) goto L_0x002a
            r6 = 1
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            ki0.c r2 = r2.f61616c
            if (r2 == 0) goto L_0x0034
            ki0.e r2 = r2.mo59026b()
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            java.lang.String r7 = "--> "
            java.lang.StringBuilder r7 = p379.C13555b.m33972k(r7)
            java.lang.String r8 = r3.f59637b
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            hi0.r r8 = r3.f59636a
            r7.append(r8)
            java.lang.String r8 = ""
            if (r2 == 0) goto L_0x005e
            java.lang.String r9 = " "
            java.lang.StringBuilder r9 = p379.C13555b.m33972k(r9)
            okhttp3.Protocol r2 = r2.f60121g
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            goto L_0x005f
        L_0x005e:
            r2 = r8
        L_0x005f:
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r0 != 0) goto L_0x0080
            if (r6 == 0) goto L_0x0080
            java.lang.StringBuilder r2 = p001a0.C0016g.m36t(r2, r9)
            long r10 = r5.mo53612a()
            r2.append(r10)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
        L_0x0080:
            okhttp3.logging.HttpLoggingInterceptor$a r10 = r1.f62326a
            okhttp3.logging.HttpLoggingInterceptor$a$a r10 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r10
            r10.mo60866a(r2)
            java.lang.String r2 = "-byte body omitted)"
            java.lang.String r10 = "identity"
            java.lang.String r13 = "gzip"
            java.lang.String r14 = "Content-Encoding"
            if (r0 == 0) goto L_0x01ca
            if (r6 == 0) goto L_0x00d7
            hi0.t r15 = r5.mo53613b()
            if (r15 == 0) goto L_0x00b1
            okhttp3.logging.HttpLoggingInterceptor$a r15 = r1.f62326a
            java.lang.String r16 = "Content-Type: "
            java.lang.StringBuilder r11 = p379.C13555b.m33972k(r16)
            hi0.t r12 = r5.mo53613b()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            okhttp3.logging.HttpLoggingInterceptor$a$a r15 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r15
            r15.mo60866a(r11)
        L_0x00b1:
            long r11 = r5.mo53612a()
            r15 = -1
            int r19 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r19 == 0) goto L_0x00d7
            okhttp3.logging.HttpLoggingInterceptor$a r11 = r1.f62326a
            java.lang.String r12 = "Content-Length: "
            java.lang.StringBuilder r12 = p379.C13555b.m33972k(r12)
            r16 = r7
            r15 = r8
            long r7 = r5.mo53612a()
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            okhttp3.logging.HttpLoggingInterceptor$a$a r11 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r11
            r11.mo60866a(r7)
            goto L_0x00da
        L_0x00d7:
            r16 = r7
            r15 = r8
        L_0x00da:
            hi0.q r7 = r3.f59638c
            java.lang.String[] r8 = r7.f59531a
            int r8 = r8.length
            int r8 = r8 / 2
            r11 = 0
        L_0x00e2:
            if (r11 >= r8) goto L_0x0102
            java.lang.String r12 = r7.mo58683d(r11)
            r19 = r8
            java.lang.String r8 = "Content-Type"
            boolean r8 = r8.equalsIgnoreCase(r12)
            if (r8 != 0) goto L_0x00fd
            java.lang.String r8 = "Content-Length"
            boolean r8 = r8.equalsIgnoreCase(r12)
            if (r8 != 0) goto L_0x00fd
            r1.mo60865b(r7, r11)
        L_0x00fd:
            int r11 = r11 + 1
            r8 = r19
            goto L_0x00e2
        L_0x0102:
            java.lang.String r7 = "--> END "
            if (r4 == 0) goto L_0x01b3
            if (r6 != 0) goto L_0x010a
            goto L_0x01b3
        L_0x010a:
            hi0.q r6 = r3.f59638c
            java.lang.String r6 = r6.mo58682c(r14)
            if (r6 == 0) goto L_0x0120
            boolean r8 = r6.equalsIgnoreCase(r10)
            if (r8 != 0) goto L_0x0120
            boolean r6 = r6.equalsIgnoreCase(r13)
            if (r6 != 0) goto L_0x0120
            r6 = 1
            goto L_0x0121
        L_0x0120:
            r6 = 0
        L_0x0121:
            if (r6 == 0) goto L_0x013a
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f62326a
            java.lang.StringBuilder r6 = p379.C13555b.m33972k(r7)
            java.lang.String r7 = r3.f59637b
            java.lang.String r8 = " (encoded body omitted)"
            java.lang.String r6 = p001a0.C0016g.m31o(r6, r7, r8)
            okhttp3.logging.HttpLoggingInterceptor$a$a r5 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r5
            r5.mo60866a(r6)
            r8 = r16
            goto L_0x01cc
        L_0x013a:
            si0.f r6 = new si0.f
            r6.<init>()
            r5.mo53614e(r6)
            java.nio.charset.Charset r8 = f62325d
            hi0.t r11 = r5.mo53613b()
            if (r11 == 0) goto L_0x014e
            java.nio.charset.Charset r8 = r11.mo58710a(r8)
        L_0x014e:
            okhttp3.logging.HttpLoggingInterceptor$a r11 = r1.f62326a
            okhttp3.logging.HttpLoggingInterceptor$a$a r11 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r11
            r12 = r15
            r11.mo60866a(r12)
            boolean r11 = m61899a(r6)
            if (r11 == 0) goto L_0x018c
            okhttp3.logging.HttpLoggingInterceptor$a r11 = r1.f62326a
            java.lang.String r6 = r6.mo61375A1(r8)
            okhttp3.logging.HttpLoggingInterceptor$a$a r11 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r11
            r11.mo60866a(r6)
            okhttp3.logging.HttpLoggingInterceptor$a r6 = r1.f62326a
            java.lang.StringBuilder r7 = p379.C13555b.m33972k(r7)
            java.lang.String r8 = r3.f59637b
            r7.append(r8)
            r7.append(r9)
            r15 = r12
            long r11 = r5.mo53612a()
            r7.append(r11)
            r8 = r16
            r7.append(r8)
            java.lang.String r5 = r7.toString()
            okhttp3.logging.HttpLoggingInterceptor$a$a r6 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r6
            r6.mo60866a(r5)
            goto L_0x01cc
        L_0x018c:
            r15 = r12
            r8 = r16
            okhttp3.logging.HttpLoggingInterceptor$a r6 = r1.f62326a
            java.lang.StringBuilder r7 = p379.C13555b.m33972k(r7)
            java.lang.String r11 = r3.f59637b
            r7.append(r11)
            java.lang.String r11 = " (binary "
            r7.append(r11)
            long r11 = r5.mo53612a()
            r7.append(r11)
            r7.append(r2)
            java.lang.String r5 = r7.toString()
            okhttp3.logging.HttpLoggingInterceptor$a$a r6 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r6
            r6.mo60866a(r5)
            goto L_0x01cc
        L_0x01b3:
            r8 = r16
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f62326a
            java.lang.StringBuilder r6 = p379.C13555b.m33972k(r7)
            java.lang.String r7 = r3.f59637b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            okhttp3.logging.HttpLoggingInterceptor$a$a r5 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r5
            r5.mo60866a(r6)
            goto L_0x01cc
        L_0x01ca:
            r15 = r8
            r8 = r7
        L_0x01cc:
            long r5 = java.lang.System.nanoTime()
            r7 = r22
            li0.f r7 = (li0.C24319f) r7     // Catch:{ Exception -> 0x037d }
            hi0.c0 r3 = r7.mo60464a(r3)     // Catch:{ Exception -> 0x037d }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 - r5
            long r5 = r7.toMillis(r11)
            hi0.e0 r7 = r3.f59416h
            long r11 = r7.mo53598i()
            r16 = -1
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x0205
            r16 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r17 = r8
            java.lang.String r8 = "-byte"
            r15.append(r8)
            java.lang.String r8 = r15.toString()
            goto L_0x020b
        L_0x0205:
            r17 = r8
            r16 = r15
            java.lang.String r8 = "unknown-length"
        L_0x020b:
            okhttp3.logging.HttpLoggingInterceptor$a r15 = r1.f62326a
            java.lang.String r18 = "<-- "
            r19 = r11
            java.lang.StringBuilder r11 = p379.C13555b.m33972k(r18)
            int r12 = r3.f59412d
            r11.append(r12)
            java.lang.String r12 = r3.f59413e
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0227
            r18 = r2
            r2 = r16
            goto L_0x0238
        L_0x0227:
            r12 = 32
            java.lang.StringBuilder r12 = p379.C25541a.m63886q(r12)
            r18 = r2
            java.lang.String r2 = r3.f59413e
            r12.append(r2)
            java.lang.String r2 = r12.toString()
        L_0x0238:
            r11.append(r2)
            r2 = 32
            r11.append(r2)
            hi0.x r2 = r3.f59410b
            hi0.r r2 = r2.f59636a
            r11.append(r2)
            r11.append(r9)
            r11.append(r5)
            java.lang.String r2 = "ms"
            r11.append(r2)
            if (r0 != 0) goto L_0x025d
            java.lang.String r2 = ", "
            java.lang.String r5 = " body"
            java.lang.String r2 = p358af.C13437d.m33706k(r2, r8, r5)
            goto L_0x025f
        L_0x025d:
            r2 = r16
        L_0x025f:
            r5 = 41
            java.lang.String r2 = p001a0.C0017h.m57N(r11, r2, r5)
            okhttp3.logging.HttpLoggingInterceptor$a$a r15 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r15
            r15.mo60866a(r2)
            if (r0 == 0) goto L_0x037c
            hi0.q r0 = r3.f59415g
            java.lang.String[] r2 = r0.f59531a
            int r2 = r2.length
            int r2 = r2 / 2
            r5 = 0
        L_0x0274:
            if (r5 >= r2) goto L_0x027c
            r1.mo60865b(r0, r5)
            int r5 = r5 + 1
            goto L_0x0274
        L_0x027c:
            if (r4 == 0) goto L_0x0373
            boolean r2 = li0.C24318e.m61057b(r3)
            if (r2 != 0) goto L_0x0286
            goto L_0x0373
        L_0x0286:
            hi0.q r2 = r3.f59415g
            java.lang.String r2 = r2.mo58682c(r14)
            if (r2 == 0) goto L_0x029c
            boolean r4 = r2.equalsIgnoreCase(r10)
            if (r4 != 0) goto L_0x029c
            boolean r2 = r2.equalsIgnoreCase(r13)
            if (r2 != 0) goto L_0x029c
            r2 = 1
            goto L_0x029d
        L_0x029c:
            r2 = 0
        L_0x029d:
            if (r2 == 0) goto L_0x02aa
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f62326a
            okhttp3.logging.HttpLoggingInterceptor$a$a r0 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r0
            java.lang.String r2 = "<-- END HTTP (encoded body omitted)"
            r0.mo60866a(r2)
            goto L_0x037c
        L_0x02aa:
            si0.i r2 = r7.mo53600t()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.mo61427t0(r4)
            si0.f r2 = r2.mo61377D()
            java.lang.String r0 = r0.mo58682c(r14)
            boolean r0 = r13.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02e9
            long r4 = r2.f62947c
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            si0.o r4 = new si0.o     // Catch:{ all -> 0x02e1 }
            si0.f r2 = r2.clone()     // Catch:{ all -> 0x02e1 }
            r4.<init>(r2)     // Catch:{ all -> 0x02e1 }
            si0.f r2 = new si0.f     // Catch:{ all -> 0x02df }
            r2.<init>()     // Catch:{ all -> 0x02df }
            r2.mo61417q1(r4)     // Catch:{ all -> 0x02df }
            r4.close()
            goto L_0x02ea
        L_0x02df:
            r0 = move-exception
            goto L_0x02e3
        L_0x02e1:
            r0 = move-exception
            r4 = 0
        L_0x02e3:
            if (r4 == 0) goto L_0x02e8
            r4.close()
        L_0x02e8:
            throw r0
        L_0x02e9:
            r0 = 0
        L_0x02ea:
            java.nio.charset.Charset r4 = f62325d
            hi0.t r5 = r7.mo53599q()
            if (r5 == 0) goto L_0x02f6
            java.nio.charset.Charset r4 = r5.mo58710a(r4)
        L_0x02f6:
            boolean r5 = m61899a(r2)
            if (r5 != 0) goto L_0x031b
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f62326a
            okhttp3.logging.HttpLoggingInterceptor$a$a r0 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r0
            r5 = r16
            r0.mo60866a(r5)
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f62326a
            java.lang.String r4 = "<-- END HTTP (binary "
            java.lang.StringBuilder r4 = p379.C13555b.m33972k(r4)
            long r5 = r2.f62947c
            r2 = r18
            java.lang.String r2 = p379.C25541a.m63884o(r4, r5, r2)
            okhttp3.logging.HttpLoggingInterceptor$a$a r0 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r0
            r0.mo60866a(r2)
            return r3
        L_0x031b:
            r5 = r16
            r6 = 0
            int r8 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0339
            okhttp3.logging.HttpLoggingInterceptor$a r6 = r1.f62326a
            okhttp3.logging.HttpLoggingInterceptor$a$a r6 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r6
            r6.mo60866a(r5)
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f62326a
            si0.f r6 = r2.clone()
            java.lang.String r4 = r6.mo61375A1(r4)
            okhttp3.logging.HttpLoggingInterceptor$a$a r5 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r5
            r5.mo60866a(r4)
        L_0x0339:
            java.lang.String r4 = "<-- END HTTP ("
            if (r0 == 0) goto L_0x035f
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f62326a
            java.lang.StringBuilder r4 = p379.C13555b.m33972k(r4)
            long r6 = r2.f62947c
            r4.append(r6)
            java.lang.String r2 = "-byte, "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = "-gzipped-byte body)"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            okhttp3.logging.HttpLoggingInterceptor$a$a r5 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r5
            r5.mo60866a(r0)
            goto L_0x037c
        L_0x035f:
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f62326a
            java.lang.StringBuilder r4 = p379.C13555b.m33972k(r4)
            long r5 = r2.f62947c
            r2 = r17
            java.lang.String r2 = p379.C25541a.m63884o(r4, r5, r2)
            okhttp3.logging.HttpLoggingInterceptor$a$a r0 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r0
            r0.mo60866a(r2)
            goto L_0x037c
        L_0x0373:
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f62326a
            okhttp3.logging.HttpLoggingInterceptor$a$a r0 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r0
            java.lang.String r2 = "<-- END HTTP"
            r0.mo60866a(r2)
        L_0x037c:
            return r3
        L_0x037d:
            r0 = move-exception
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f62326a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            okhttp3.logging.HttpLoggingInterceptor$a$a r2 = (okhttp3.logging.HttpLoggingInterceptor.C24631a.C24632a) r2
            r2.mo60866a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(hi0.s$a):hi0.c0");
    }
}
