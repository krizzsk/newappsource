package li0;

import com.amazonaws.http.HttpHeader;
import com.appboy.configuration.AppboyConfigurationProvider;
import hi0.C23529c0;
import hi0.C23556q;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import okio.ByteString;

/* renamed from: li0.e */
public final class C24318e {

    /* renamed from: a */
    public static final /* synthetic */ int f61613a = 0;

    static {
        ByteString byteString = ByteString.f62330d;
        ByteString.C24633a.m61918a("\"\\");
        ByteString.C24633a.m61918a("\t ,=");
    }

    /* renamed from: a */
    public static long m61056a(C23529c0 c0Var) {
        String c = c0Var.f59415g.mo58682c(HttpHeader.CONTENT_LENGTH);
        if (c != null) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m61057b(C23529c0 c0Var) {
        if (c0Var.f59410b.f59637b.equals("HEAD")) {
            return false;
        }
        int i = c0Var.f59412d;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && m61056a(c0Var) == -1 && !"chunked".equalsIgnoreCase(c0Var.mo58641r("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m61058c(int i, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01bc, code lost:
        if (r9 == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01ef, code lost:
        if (r11 != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01fe, code lost:
        if (r11 == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0200, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0310, code lost:
        if (r0 != null) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e1, code lost:
        if (r20 <= 0) goto L_0x00f6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0208 */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0366 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m61059d(hi0.C23546k r33, hi0.C23558r r34, hi0.C23556q r35) {
        /*
            hi0.k$a r0 = hi0.C23546k.f59513a
            r1 = r33
            if (r1 != r0) goto L_0x0007
            return
        L_0x0007:
            java.util.regex.Pattern r0 = hi0.C23545j.f59500j
            java.lang.String r0 = "Set-Cookie"
            r2 = r35
            java.util.List r2 = r2.mo58687h(r0)
            int r3 = r2.size()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0018:
            if (r6 >= r3) goto L_0x036f
            java.lang.Object r0 = r2.get(r6)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            long r9 = java.lang.System.currentTimeMillis()
            int r11 = r8.length()
            r12 = 59
            int r0 = ii0.C23610d.m57801i(r8, r5, r11, r12)
            r13 = 61
            int r14 = ii0.C23610d.m57801i(r8, r5, r0, r13)
            if (r14 != r0) goto L_0x003d
        L_0x0037:
            r5 = r34
        L_0x0039:
            r26 = r2
            goto L_0x0312
        L_0x003d:
            java.lang.String r15 = ii0.C23610d.m57814v(r5, r14, r8)
            boolean r16 = r15.isEmpty()
            if (r16 != 0) goto L_0x0037
            int r4 = r15.length()
        L_0x004b:
            r12 = 31
            if (r5 >= r4) goto L_0x005f
            char r13 = r15.charAt(r5)
            if (r13 <= r12) goto L_0x0060
            r12 = 127(0x7f, float:1.78E-43)
            if (r13 < r12) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            int r5 = r5 + 1
            r12 = 59
            goto L_0x004b
        L_0x005f:
            r5 = -1
        L_0x0060:
            r4 = -1
            if (r5 == r4) goto L_0x0064
            goto L_0x0037
        L_0x0064:
            int r14 = r14 + 1
            java.lang.String r4 = ii0.C23610d.m57814v(r14, r0, r8)
            int r5 = r4.length()
            r12 = 0
        L_0x006f:
            if (r12 >= r5) goto L_0x0081
            char r13 = r4.charAt(r12)
            r14 = 31
            if (r13 <= r14) goto L_0x0082
            r14 = 127(0x7f, float:1.78E-43)
            if (r13 < r14) goto L_0x007e
            goto L_0x0082
        L_0x007e:
            int r12 = r12 + 1
            goto L_0x006f
        L_0x0081:
            r12 = -1
        L_0x0082:
            r5 = -1
            if (r12 == r5) goto L_0x0086
            goto L_0x0037
        L_0x0086:
            int r0 = r0 + 1
            r18 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r26 = r18
            r14 = 0
            r20 = -1
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
            r28 = 0
        L_0x009c:
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r31 = -9223372036854775808
            if (r0 >= r11) goto L_0x0154
            r12 = 59
            int r13 = ii0.C23610d.m57801i(r8, r0, r11, r12)
            r12 = 61
            int r5 = ii0.C23610d.m57801i(r8, r0, r13, r12)
            java.lang.String r0 = ii0.C23610d.m57814v(r0, r5, r8)
            if (r5 >= r13) goto L_0x00be
            int r5 = r5 + 1
            java.lang.String r5 = ii0.C23610d.m57814v(r5, r13, r8)
            goto L_0x00c0
        L_0x00be:
            java.lang.String r5 = ""
        L_0x00c0:
            java.lang.String r12 = "expires"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x00d1
            int r0 = r5.length()     // Catch:{ IllegalArgumentException -> 0x0150 }
            long r26 = hi0.C23545j.m57695b(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0150 }
            goto L_0x00fb
        L_0x00d1:
            java.lang.String r12 = "max-age"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x00ff
            long r20 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x00e4 }
            r29 = 0
            int r0 = (r20 > r29 ? 1 : (r20 == r29 ? 0 : -1))
            if (r0 > 0) goto L_0x00fb
            goto L_0x00f6
        L_0x00e4:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r5.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = "-"
            boolean r0 = r5.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00f9
        L_0x00f6:
            r20 = r31
            goto L_0x00fb
        L_0x00f9:
            r20 = r29
        L_0x00fb:
            r25 = 1
            goto L_0x0150
        L_0x00fe:
            throw r12     // Catch:{  }
        L_0x00ff:
            java.lang.String r12 = "domain"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0130
            java.lang.String r0 = "."
            boolean r12 = r5.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0150 }
            if (r12 != 0) goto L_0x012a
            boolean r0 = r5.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0150 }
            if (r0 == 0) goto L_0x011a
            r12 = 1
            java.lang.String r5 = r5.substring(r12)     // Catch:{ IllegalArgumentException -> 0x0150 }
        L_0x011a:
            java.lang.String r0 = ii0.C23610d.m57794b(r5)     // Catch:{ IllegalArgumentException -> 0x0150 }
            if (r0 == 0) goto L_0x0124
            r14 = r0
            r24 = 0
            goto L_0x0150
        L_0x0124:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0150 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0150 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0150 }
        L_0x012a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0150 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0150 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0150 }
        L_0x0130:
            java.lang.String r12 = "path"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x013b
            r28 = r5
            goto L_0x0150
        L_0x013b:
            java.lang.String r5 = "secure"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0146
            r22 = 1
            goto L_0x0150
        L_0x0146:
            java.lang.String r5 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x0150
            r23 = 1
        L_0x0150:
            int r0 = r13 + 1
            goto L_0x009c
        L_0x0154:
            int r0 = (r20 > r31 ? 1 : (r20 == r31 ? 0 : -1))
            if (r0 != 0) goto L_0x015d
            r5 = r34
            r18 = r31
            goto L_0x0187
        L_0x015d:
            r11 = -1
            int r0 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0183
            r11 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0170
            r11 = 1000(0x3e8, double:4.94E-321)
            long r29 = r20 * r11
        L_0x0170:
            long r29 = r9 + r29
            int r0 = (r29 > r9 ? 1 : (r29 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0180
            int r0 = (r29 > r18 ? 1 : (r29 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x017b
            goto L_0x0180
        L_0x017b:
            r5 = r34
            r18 = r29
            goto L_0x0187
        L_0x0180:
            r5 = r34
            goto L_0x0187
        L_0x0183:
            r5 = r34
            r18 = r26
        L_0x0187:
            java.lang.String r0 = r5.f59537d
            r8 = 46
            if (r14 != 0) goto L_0x018f
            r14 = r0
            goto L_0x01c0
        L_0x018f:
            boolean r9 = r0.equals(r14)
            if (r9 == 0) goto L_0x0196
            goto L_0x01b9
        L_0x0196:
            boolean r9 = r0.endsWith(r14)
            if (r9 == 0) goto L_0x01bb
            int r9 = r0.length()
            int r10 = r14.length()
            int r9 = r9 - r10
            r10 = 1
            int r9 = r9 - r10
            char r9 = r0.charAt(r9)
            if (r9 != r8) goto L_0x01bb
            java.util.regex.Pattern r9 = ii0.C23610d.f59694k
            java.util.regex.Matcher r9 = r9.matcher(r0)
            boolean r9 = r9.matches()
            if (r9 != 0) goto L_0x01bb
        L_0x01b9:
            r9 = 1
            goto L_0x01bc
        L_0x01bb:
            r9 = 0
        L_0x01bc:
            if (r9 != 0) goto L_0x01c0
            goto L_0x0039
        L_0x01c0:
            int r0 = r0.length()
            int r9 = r14.length()
            if (r0 == r9) goto L_0x031f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f62320h
            r9.getClass()
            java.lang.String r0 = java.net.IDN.toUnicode(r14)
            java.lang.String r10 = "\\."
            java.lang.String[] r10 = r0.split(r10)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f62321a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0219
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f62321a
            r11 = 0
            r12 = 1
            boolean r0 = r0.compareAndSet(r11, r12)
            if (r0 == 0) goto L_0x0219
            r11 = 0
        L_0x01ec:
            r9.mo60864b()     // Catch:{ InterruptedIOException -> 0x0208, IOException -> 0x01f4 }
            if (r11 == 0) goto L_0x0226
            goto L_0x0200
        L_0x01f2:
            r0 = move-exception
            goto L_0x020f
        L_0x01f4:
            r0 = move-exception
            r12 = r0
            pi0.f r0 = pi0.C24721f.f62584a     // Catch:{ all -> 0x01f2 }
            r13 = 5
            java.lang.String r8 = "Failed to read public suffix list"
            r0.mo61202m(r13, r8, r12)     // Catch:{ all -> 0x01f2 }
            if (r11 == 0) goto L_0x0226
        L_0x0200:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0226
        L_0x0208:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x01f2 }
            r8 = 46
            r11 = 1
            goto L_0x01ec
        L_0x020f:
            if (r11 == 0) goto L_0x0218
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0218:
            throw r0
        L_0x0219:
            java.util.concurrent.CountDownLatch r0 = r9.f62322b     // Catch:{ InterruptedException -> 0x021f }
            r0.await()     // Catch:{ InterruptedException -> 0x021f }
            goto L_0x0226
        L_0x021f:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0226:
            monitor-enter(r9)
            byte[] r0 = r9.f62323c     // Catch:{ all -> 0x031c }
            if (r0 == 0) goto L_0x0314
            monitor-exit(r9)     // Catch:{ all -> 0x031c }
            int r0 = r10.length
            byte[][] r8 = new byte[r0][]
            r11 = 0
        L_0x0230:
            int r12 = r10.length
            if (r11 >= r12) goto L_0x0240
            r12 = r10[r11]
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r12 = r12.getBytes(r13)
            r8[r11] = r12
            int r11 = r11 + 1
            goto L_0x0230
        L_0x0240:
            r11 = 0
        L_0x0241:
            if (r11 >= r0) goto L_0x0250
            byte[] r12 = r9.f62323c
            java.lang.String r12 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m61897a(r12, r8, r11)
            if (r12 == 0) goto L_0x024d
            r11 = 1
            goto L_0x0252
        L_0x024d:
            int r11 = r11 + 1
            goto L_0x0241
        L_0x0250:
            r11 = 1
            r12 = 0
        L_0x0252:
            if (r0 <= r11) goto L_0x0272
            java.lang.Object r13 = r8.clone()
            byte[][] r13 = (byte[][]) r13
            r26 = r2
            r1 = 0
        L_0x025d:
            int r2 = r13.length
            int r2 = r2 - r11
            if (r1 >= r2) goto L_0x0274
            byte[] r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f62317e
            r13[r1] = r2
            byte[] r2 = r9.f62323c
            java.lang.String r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m61897a(r2, r13, r1)
            if (r2 == 0) goto L_0x026e
            goto L_0x0275
        L_0x026e:
            int r1 = r1 + 1
            r11 = 1
            goto L_0x025d
        L_0x0272:
            r26 = r2
        L_0x0274:
            r2 = 0
        L_0x0275:
            if (r2 == 0) goto L_0x0288
            r1 = 0
        L_0x0278:
            int r11 = r0 + -1
            if (r1 >= r11) goto L_0x0288
            byte[] r11 = r9.f62324d
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m61897a(r11, r8, r1)
            if (r11 == 0) goto L_0x0285
            goto L_0x0289
        L_0x0285:
            int r1 = r1 + 1
            goto L_0x0278
        L_0x0288:
            r11 = 0
        L_0x0289:
            if (r11 == 0) goto L_0x02a3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "!"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            goto L_0x02c6
        L_0x02a3:
            if (r12 != 0) goto L_0x02aa
            if (r2 != 0) goto L_0x02aa
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f62319g
            goto L_0x02c6
        L_0x02aa:
            if (r12 == 0) goto L_0x02b3
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r12.split(r0)
            goto L_0x02b5
        L_0x02b3:
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f62318f
        L_0x02b5:
            if (r2 == 0) goto L_0x02be
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r2.split(r1)
            goto L_0x02c0
        L_0x02be:
            java.lang.String[] r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f62318f
        L_0x02c0:
            int r2 = r0.length
            int r8 = r1.length
            if (r2 <= r8) goto L_0x02c5
            goto L_0x02c6
        L_0x02c5:
            r0 = r1
        L_0x02c6:
            int r1 = r10.length
            int r2 = r0.length
            r8 = 33
            if (r1 != r2) goto L_0x02d7
            r1 = 0
            r2 = r0[r1]
            char r2 = r2.charAt(r1)
            if (r2 == r8) goto L_0x02d8
            r0 = 0
            goto L_0x0310
        L_0x02d7:
            r1 = 0
        L_0x02d8:
            r2 = r0[r1]
            char r2 = r2.charAt(r1)
            if (r2 != r8) goto L_0x02e3
            int r1 = r10.length
            int r0 = r0.length
            goto L_0x02e7
        L_0x02e3:
            int r1 = r10.length
            int r0 = r0.length
            r2 = 1
            int r0 = r0 + r2
        L_0x02e7:
            int r1 = r1 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "\\."
            java.lang.String[] r2 = r14.split(r2)
        L_0x02f3:
            int r8 = r2.length
            if (r1 >= r8) goto L_0x0303
            r8 = r2[r1]
            r0.append(r8)
            r8 = 46
            r0.append(r8)
            int r1 = r1 + 1
            goto L_0x02f3
        L_0x0303:
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r0.deleteCharAt(r1)
            java.lang.String r0 = r0.toString()
        L_0x0310:
            if (r0 != 0) goto L_0x0321
        L_0x0312:
            r2 = 0
            goto L_0x0357
        L_0x0314:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x031c }
            java.lang.String r1 = "Unable to load publicsuffixes.gz resource from the classpath."
            r0.<init>(r1)     // Catch:{ all -> 0x031c }
            throw r0     // Catch:{ all -> 0x031c }
        L_0x031c:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x031c }
            throw r0
        L_0x031f:
            r26 = r2
        L_0x0321:
            r1 = r28
            if (r1 == 0) goto L_0x0332
            java.lang.String r0 = "/"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x032e
            goto L_0x0332
        L_0x032e:
            r21 = r1
            r2 = 0
            goto L_0x0349
        L_0x0332:
            java.lang.String r0 = r34.mo58698f()
            r1 = 47
            int r1 = r0.lastIndexOf(r1)
            if (r1 == 0) goto L_0x0344
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            goto L_0x0347
        L_0x0344:
            r2 = 0
            java.lang.String r0 = "/"
        L_0x0347:
            r21 = r0
        L_0x0349:
            hi0.j r0 = new hi0.j
            r1 = r15
            r15 = r0
            r16 = r1
            r17 = r4
            r20 = r14
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
            goto L_0x0358
        L_0x0357:
            r0 = 0
        L_0x0358:
            if (r0 != 0) goto L_0x035b
            goto L_0x0366
        L_0x035b:
            if (r7 != 0) goto L_0x0363
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
        L_0x0363:
            r7.add(r0)
        L_0x0366:
            int r6 = r6 + 1
            r5 = 0
            r1 = r33
            r2 = r26
            goto L_0x0018
        L_0x036f:
            if (r7 == 0) goto L_0x0376
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            goto L_0x037a
        L_0x0376:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x037a:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0381
            return
        L_0x0381:
            r33.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: li0.C24318e.m61059d(hi0.k, hi0.r, hi0.q):void");
    }

    /* renamed from: e */
    public static int m61060e(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static Set<String> m61061f(C23556q qVar) {
        Set<String> emptySet = Collections.emptySet();
        int length = qVar.f59531a.length / 2;
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(qVar.mo58683d(i))) {
                String g = qVar.mo58686g(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : g.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }
}
