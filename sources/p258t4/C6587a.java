package p258t4;

import android.os.Bundle;
import android.util.Base64;
import bi0.C21079q;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import mf0.C24362h;
import p001a0.C0017h;
import p009a8.C0115o;
import p312x8.C7178a;
import p356ad.C13413b;
import p389bl.C13637c;
import p404ce.C13791f;
import p404ce.C13806s;
import p406cg.C13815e;
import p434dd.C16552f0;
import p434dd.C16571p;
import p434dd.C16590z;
import p435de.C16596f;
import p462eh.C16821b;
import p483fe.C16953a;
import p603kg.C18040c;
import p906wz.C20431c;
import p906wz.C20433e;
import p906wz.C20434f;
import p906wz.C20436g;
import p935yg.C20727i;
import p977zz.C20964s0;
import uh0.C25072a;
import uh0.C25081h;

/* renamed from: t4.a */
public class C6587a implements C6588b, C16552f0, C16953a, zzef, C16821b, C13791f, RewardItem, C16571p, C20727i, C20433e {

    /* renamed from: b */
    public static final C21079q f20404b = new C21079q("UNDEFINED");

    /* renamed from: c */
    public static final C21079q f20405c = new C21079q("REUSABLE_CLAIMED");

    /* renamed from: d */
    public static final C13815e f20406d = new C13815e();

    /* renamed from: e */
    public static final /* synthetic */ C6587a f20407e = new C6587a();

    /* renamed from: A */
    public static final boolean m15517A(PublicKey publicKey, String str, String str2) {
        C24362h.m61211f(str, "data");
        C24362h.m61211f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
        try {
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(publicKey);
            byte[] bytes = str.getBytes(C25072a.f63272a);
            C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            byte[] decode = Base64.decode(str2, 8);
            C24362h.m61210e(decode, "decode(signature, Base64.URL_SAFE)");
            return instance.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static String m15518q(StringBuilder sb) {
        char c;
        char c2;
        char c3 = 0;
        int length = sb.length() - 0;
        if (length != 0) {
            char charAt = sb.charAt(0);
            if (length >= 2) {
                c = sb.charAt(1);
            } else {
                c = 0;
            }
            if (length >= 3) {
                c2 = sb.charAt(2);
            } else {
                c2 = 0;
            }
            if (length >= 4) {
                c3 = sb.charAt(3);
            }
            int i = (charAt << 18) + (c << 12) + (c2 << 6) + c3;
            char c4 = (char) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            char c5 = (char) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append((char) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
            if (length >= 2) {
                sb2.append(c4);
            }
            if (length >= 3) {
                sb2.append(c5);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: t */
    public static final PublicKey m15519t(String str) {
        byte[] decode = Base64.decode(C25081h.m62833D(C25081h.m62833D(C25081h.m62833D(str, "\n", "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), 0);
        C24362h.m61210e(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance(KeyProvider18.KEY_ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(decode));
        C24362h.m61210e(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: u */
    public static final String m15520u(String str) {
        C24362h.m61211f(str, "kid");
        C0115o oVar = C0115o.f331a;
        URL url = new URL("https", C24362h.m61216k(C0115o.f348r, "www."), "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C0115o.m212c().execute(new C7178a(url, ref$ObjectRef, str, reentrantLock, newCondition, 0));
        reentrantLock.lock();
        try {
            newCondition.await(InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) ref$ObjectRef.element;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r0.mo61859w0() != false) goto L_0x009d;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m15521z(ff0.C23349c r6, java.lang.Object r7, lf0.C24236l r8) {
        /*
            boolean r0 = r6 instanceof bi0.C21066e
            if (r0 == 0) goto L_0x00c1
            bi0.e r6 = (bi0.C21066e) r6
            java.lang.Throwable r0 = kotlin.Result.m58423a(r7)
            r1 = 0
            if (r0 != 0) goto L_0x0017
            if (r8 == 0) goto L_0x0015
            wh0.v r0 = new wh0.v
            r0.<init>(r7, r8)
            goto L_0x001d
        L_0x0015:
            r0 = r7
            goto L_0x001d
        L_0x0017:
            wh0.u r8 = new wh0.u
            r8.<init>(r0, r1)
            r0 = r8
        L_0x001d:
            kotlinx.coroutines.CoroutineDispatcher r8 = r6.f52872e
            kotlin.coroutines.CoroutineContext r2 = r6.getContext()
            boolean r8 = r8.mo4336x(r2)
            r2 = 1
            if (r8 == 0) goto L_0x0039
            r6.f52874g = r0
            r6.f63457d = r2
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.f52872e
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.mo4335k(r8, r6)
            goto L_0x00c4
        L_0x0039:
            wh0.o0 r8 = wh0.C25212r1.m63301a()
            boolean r3 = r8.mo61845K()
            if (r3 == 0) goto L_0x004c
            r6.f52874g = r0
            r6.f63457d = r2
            r8.mo61843A(r6)
            goto L_0x00c4
        L_0x004c:
            r8.mo61844B(r2)
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r6.getContext()     // Catch:{ all -> 0x0074 }
            wh0.y0$b r5 = wh0.C25232y0.C25234b.f63506b     // Catch:{ all -> 0x0074 }
            kotlin.coroutines.CoroutineContext$a r4 = r4.mo53081c(r5)     // Catch:{ all -> 0x0074 }
            wh0.y0 r4 = (wh0.C25232y0) r4     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0076
            boolean r5 = r4.isActive()     // Catch:{ all -> 0x0074 }
            if (r5 != 0) goto L_0x0076
            java.util.concurrent.CancellationException r1 = r4.mo61782i()     // Catch:{ all -> 0x0074 }
            r6.mo53193a(r0, r1)     // Catch:{ all -> 0x0074 }
            kotlin.Result$Failure r0 = p584jl.C17885a.m44400G(r1)     // Catch:{ all -> 0x0074 }
            r6.resumeWith(r0)     // Catch:{ all -> 0x0074 }
            r1 = 1
            goto L_0x0076
        L_0x0074:
            r7 = move-exception
            goto L_0x00b5
        L_0x0076:
            if (r1 != 0) goto L_0x00ae
            ff0.c<T> r0 = r6.f52873f     // Catch:{ all -> 0x0074 }
            java.lang.Object r1 = r6.f52875h     // Catch:{ all -> 0x0074 }
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()     // Catch:{ all -> 0x0074 }
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.m60696b(r4, r1)     // Catch:{ all -> 0x0074 }
            bi0.q r5 = kotlinx.coroutines.internal.ThreadContextKt.f61492a     // Catch:{ all -> 0x0074 }
            if (r1 == r5) goto L_0x008d
            wh0.t1 r0 = kotlinx.coroutines.CoroutineContextKt.m60589d(r0, r4, r1)     // Catch:{ all -> 0x0074 }
            goto L_0x008e
        L_0x008d:
            r0 = r3
        L_0x008e:
            ff0.c<T> r5 = r6.f52873f     // Catch:{ all -> 0x00a1 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x00a1 }
            bf0.d r7 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x009d
            boolean r7 = r0.mo61859w0()     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x00ae
        L_0x009d:
            kotlinx.coroutines.internal.ThreadContextKt.m60695a(r4, r1)     // Catch:{ all -> 0x0074 }
            goto L_0x00ae
        L_0x00a1:
            r7 = move-exception
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.mo61859w0()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x00ad
        L_0x00aa:
            kotlinx.coroutines.internal.ThreadContextKt.m60695a(r4, r1)     // Catch:{ all -> 0x0074 }
        L_0x00ad:
            throw r7     // Catch:{ all -> 0x0074 }
        L_0x00ae:
            boolean r7 = r8.mo61846V()     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x00ae
            goto L_0x00b8
        L_0x00b5:
            r6.mo61809i(r7, r3)     // Catch:{ all -> 0x00bc }
        L_0x00b8:
            r8.mo61847z(r2)
            goto L_0x00c4
        L_0x00bc:
            r6 = move-exception
            r8.mo61847z(r2)
            throw r6
        L_0x00c1:
            r6.resumeWith(r7)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p258t4.C6587a.m15521z(ff0.c, java.lang.Object, lf0.l):void");
    }

    /* renamed from: a */
    public /* synthetic */ void mo22690a() {
    }

    /* renamed from: b */
    public /* synthetic */ void mo22691b() {
    }

    /* renamed from: c */
    public /* synthetic */ void mo22692c(boolean z) {
    }

    /* renamed from: d */
    public /* synthetic */ void mo22693d() {
    }

    /* renamed from: e */
    public boolean mo22170e(ClassLoader classLoader, File file, File file2, boolean z) {
        return C13637c.m34063T(classLoader, file, file2, z);
    }

    /* renamed from: f */
    public void mo22171f(ClassLoader classLoader, HashSet hashSet) {
        C13637c.m34062S(classLoader, hashSet, new C16590z());
    }

    /* renamed from: g */
    public void mo22694g(C20431c cVar, HttpURLConnection httpURLConnection) {
        String str;
        String str2;
        if (!httpURLConnection.getURL().getHost().startsWith("tvm")) {
            String cVar2 = cVar.toString();
            C16596f a = C16596f.m42113a();
            StringBuilder sb = (StringBuilder) C20434f.f51772a.get();
            if (sb == null) {
                str = "curl";
            } else {
                sb.setLength(0);
                sb.append("curl -X ");
                if (httpURLConnection.getDoOutput()) {
                    str2 = "POST";
                } else {
                    str2 = "GET";
                }
                sb.append(str2);
                sb.append(" '");
                sb.append(httpURLConnection.getURL().toExternalForm());
                sb.append("'");
                for (Map.Entry next : httpURLConnection.getRequestProperties().entrySet()) {
                    String str3 = (String) next.getKey();
                    if (HttpHeader.CONTENT_TYPE.equals(str3)) {
                        sb.append(" -H 'Content-Type: application/json'");
                    } else {
                        for (String R : (List) next.getValue()) {
                            C0017h.m61R(sb, " -H '", str3, ": ", R);
                            sb.append("'");
                        }
                    }
                }
                if (!C20964s0.m49090h(cVar2)) {
                    C16530d.m42019l(sb, " -d '", cVar2, "'");
                }
                str = sb.toString();
            }
            a.mo49363b(str);
        }
    }

    public int getAmount() {
        return 1;
    }

    public String getType() {
        return "";
    }

    /* renamed from: h */
    public /* synthetic */ void mo22695h() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ee  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p043ch.C13831b mo22696i(java.lang.String r19, com.google.zxing.BarcodeFormat r20, int r21, int r22, java.util.Map r23) {
        /*
            r18 = this;
            r0 = r23
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2 = 0
            r3 = 33
            if (r0 == 0) goto L_0x0046
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x001d
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
        L_0x001d:
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.ERROR_CORRECTION
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x0031
            java.lang.Object r3 = r0.get(r4)
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
        L_0x0031:
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.AZTEC_LAYERS
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x0046
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            com.google.zxing.BarcodeFormat r4 = com.google.zxing.BarcodeFormat.AZTEC
            r5 = r20
            if (r5 != r4) goto L_0x045b
            r4 = r19
            byte[] r1 = r4.getBytes(r1)
            zg.c r4 = new zg.c
            r4.<init>(r1)
            zg.e r1 = p958zg.C20846e.f52571e
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r5 = 0
        L_0x005f:
            byte[] r6 = r4.f52568a
            int r7 = r6.length
            r8 = 32
            r9 = 3
            r10 = 10
            r11 = 4
            r12 = 2
            r13 = 1
            if (r5 >= r7) goto L_0x016f
            int r7 = r5 + 1
            int r14 = r6.length
            if (r7 >= r14) goto L_0x0074
            byte r14 = r6[r7]
            goto L_0x0075
        L_0x0074:
            r14 = 0
        L_0x0075:
            byte r6 = r6[r5]
            r15 = 13
            if (r6 == r15) goto L_0x0094
            r10 = 44
            if (r6 == r10) goto L_0x0090
            r10 = 46
            if (r6 == r10) goto L_0x008c
            r10 = 58
            if (r6 == r10) goto L_0x0088
            goto L_0x0098
        L_0x0088:
            if (r14 != r8) goto L_0x0098
            r6 = 5
            goto L_0x0099
        L_0x008c:
            if (r14 != r8) goto L_0x0098
            r6 = 3
            goto L_0x0099
        L_0x0090:
            if (r14 != r8) goto L_0x0098
            r6 = 4
            goto L_0x0099
        L_0x0094:
            if (r14 != r10) goto L_0x0098
            r6 = 2
            goto L_0x0099
        L_0x0098:
            r6 = 0
        L_0x0099:
            if (r6 <= 0) goto L_0x00ee
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a4:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00e7
            java.lang.Object r10 = r1.next()
            zg.e r10 = (p958zg.C20846e) r10
            zg.e r14 = r10.mo52970b(r5)
            zg.e r15 = r14.mo52972d(r11, r6)
            r8.add(r15)
            int r15 = r10.f52572a
            if (r15 == r11) goto L_0x00c6
            zg.e r15 = r14.mo52973e(r11, r6)
            r8.add(r15)
        L_0x00c6:
            if (r6 == r9) goto L_0x00ca
            if (r6 != r11) goto L_0x00d7
        L_0x00ca:
            int r15 = 16 - r6
            zg.e r14 = r14.mo52972d(r12, r15)
            zg.e r14 = r14.mo52972d(r12, r13)
            r8.add(r14)
        L_0x00d7:
            int r14 = r10.f52574c
            if (r14 <= 0) goto L_0x00a4
            zg.e r10 = r10.mo52969a(r5)
            zg.e r10 = r10.mo52969a(r7)
            r8.add(r10)
            goto L_0x00a4
        L_0x00e7:
            java.util.LinkedList r1 = p958zg.C20844c.m48821a(r8)
            r5 = r7
            goto L_0x016c
        L_0x00ee:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f7:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0168
            java.lang.Object r7 = r1.next()
            zg.e r7 = (p958zg.C20846e) r7
            byte[] r8 = r4.f52568a
            byte r8 = r8[r5]
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8
            int[][] r9 = p958zg.C20844c.f52566d
            int r10 = r7.f52572a
            r9 = r9[r10]
            r9 = r9[r8]
            if (r9 <= 0) goto L_0x0116
            r9 = 1
            goto L_0x0117
        L_0x0116:
            r9 = 0
        L_0x0117:
            r10 = 0
            r14 = 0
        L_0x0119:
            if (r10 > r11) goto L_0x0150
            int[][] r11 = p958zg.C20844c.f52566d
            r11 = r11[r10]
            r11 = r11[r8]
            if (r11 <= 0) goto L_0x014b
            if (r14 != 0) goto L_0x0129
            zg.e r14 = r7.mo52970b(r5)
        L_0x0129:
            if (r9 == 0) goto L_0x0131
            int r15 = r7.f52572a
            if (r10 == r15) goto L_0x0131
            if (r10 != r12) goto L_0x0138
        L_0x0131:
            zg.e r12 = r14.mo52972d(r10, r11)
            r6.add(r12)
        L_0x0138:
            if (r9 != 0) goto L_0x014b
            int[][] r12 = p958zg.C20844c.f52567e
            int r15 = r7.f52572a
            r12 = r12[r15]
            r12 = r12[r10]
            if (r12 < 0) goto L_0x014b
            zg.e r11 = r14.mo52973e(r10, r11)
            r6.add(r11)
        L_0x014b:
            int r10 = r10 + 1
            r11 = 4
            r12 = 2
            goto L_0x0119
        L_0x0150:
            int r9 = r7.f52574c
            if (r9 > 0) goto L_0x015e
            int[][] r9 = p958zg.C20844c.f52566d
            int r10 = r7.f52572a
            r9 = r9[r10]
            r8 = r9[r8]
            if (r8 != 0) goto L_0x0165
        L_0x015e:
            zg.e r7 = r7.mo52969a(r5)
            r6.add(r7)
        L_0x0165:
            r11 = 4
            r12 = 2
            goto L_0x00f7
        L_0x0168:
            java.util.LinkedList r1 = p958zg.C20844c.m48821a(r6)
        L_0x016c:
            int r5 = r5 + r13
            goto L_0x005f
        L_0x016f:
            zg.b r5 = new zg.b
            r5.<init>()
            java.lang.Object r1 = java.util.Collections.min(r1, r5)
            zg.e r1 = (p958zg.C20846e) r1
            byte[] r4 = r4.f52568a
            r1.getClass()
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            int r6 = r4.length
            zg.e r1 = r1.mo52970b(r6)
            zg.f r1 = r1.f52573b
        L_0x018b:
            if (r1 == 0) goto L_0x0193
            r5.addFirst(r1)
            zg.f r1 = r1.f52577a
            goto L_0x018b
        L_0x0193:
            ch.a r1 = new ch.a
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x019c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01ac
            java.lang.Object r6 = r5.next()
            zg.f r6 = (p958zg.C20847f) r6
            r6.mo52965a(r1, r4)
            goto L_0x019c
        L_0x01ac:
            int r4 = r1.f34026c
            r5 = 100
            r6 = 11
            int r3 = p379.C13715c.m34237b(r3, r4, r5, r6)
            int r4 = r4 + r3
            if (r0 == 0) goto L_0x020e
            if (r0 >= 0) goto L_0x01bd
            r4 = 1
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            int r5 = java.lang.Math.abs(r0)
            if (r4 == 0) goto L_0x01c5
            r8 = 4
        L_0x01c5:
            if (r5 > r8) goto L_0x01fa
            if (r4 == 0) goto L_0x01cc
            r0 = 88
            goto L_0x01ce
        L_0x01cc:
            r0 = 112(0x70, float:1.57E-43)
        L_0x01ce:
            int r2 = r5 << 4
            int r0 = r0 + r2
            int r0 = r0 * r5
            int[] r2 = p584jl.C17886b.f45892f
            r2 = r2[r5]
            int r7 = r0 % r2
            int r7 = r0 - r7
            ch.a r1 = p584jl.C17886b.m44486l(r2, r1)
            int r8 = r1.f34026c
            int r3 = r3 + r8
            java.lang.String r9 = "Data to large for user specified layer"
            if (r3 > r7) goto L_0x01f4
            if (r4 == 0) goto L_0x0259
            int r3 = r2 << 6
            if (r8 > r3) goto L_0x01ee
            goto L_0x0259
        L_0x01ee:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x01f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x01fa:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r2] = r0
            java.lang.String r0 = "Illegal value %s for layers"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x020e:
            r0 = 0
            r2 = 0
            r5 = 0
        L_0x0211:
            if (r0 > r8) goto L_0x0453
            if (r0 > r9) goto L_0x0217
            r7 = 1
            goto L_0x0218
        L_0x0217:
            r7 = 0
        L_0x0218:
            if (r7 == 0) goto L_0x021d
            int r8 = r0 + 1
            goto L_0x021e
        L_0x021d:
            r8 = r0
        L_0x021e:
            if (r7 == 0) goto L_0x0223
            r10 = 88
            goto L_0x0225
        L_0x0223:
            r10 = 112(0x70, float:1.57E-43)
        L_0x0225:
            int r11 = r8 << 4
            int r10 = r10 + r11
            int r10 = r10 * r8
            if (r4 > r10) goto L_0x0446
            if (r2 == 0) goto L_0x0234
            int[] r11 = p584jl.C17886b.f45892f
            r11 = r11[r8]
            if (r5 == r11) goto L_0x0241
        L_0x0234:
            int[] r2 = p584jl.C17886b.f45892f
            r2 = r2[r8]
            ch.a r5 = p584jl.C17886b.m44486l(r2, r1)
            r17 = r5
            r5 = r2
            r2 = r17
        L_0x0241:
            int r11 = r10 % r5
            int r11 = r10 - r11
            if (r7 == 0) goto L_0x024d
            int r12 = r2.f34026c
            int r14 = r5 << 6
            if (r12 > r14) goto L_0x0446
        L_0x024d:
            int r12 = r2.f34026c
            int r12 = r12 + r3
            if (r12 <= r11) goto L_0x0254
            goto L_0x0446
        L_0x0254:
            r1 = r2
            r2 = r5
            r4 = r7
            r5 = r8
            r0 = r10
        L_0x0259:
            ch.a r0 = p584jl.C17886b.m44484j(r1, r0, r2)
            int r1 = r1.f34026c
            int r1 = r1 / r2
            ch.a r2 = new ch.a
            r2.<init>()
            if (r4 == 0) goto L_0x027b
            int r3 = r5 + -1
            r7 = 2
            r2.mo40756b(r3, r7)
            int r1 = r1 + -1
            r3 = 6
            r2.mo40756b(r1, r3)
            r1 = 28
            r3 = 4
            ch.a r1 = p584jl.C17886b.m44484j(r2, r1, r3)
            goto L_0x028d
        L_0x027b:
            r3 = 4
            int r7 = r5 + -1
            r8 = 5
            r2.mo40756b(r7, r8)
            int r1 = r1 + -1
            r2.mo40756b(r1, r6)
            r1 = 40
            ch.a r1 = p584jl.C17886b.m44484j(r2, r1, r3)
        L_0x028d:
            if (r4 == 0) goto L_0x0290
            goto L_0x0292
        L_0x0290:
            r6 = 14
        L_0x0292:
            int r2 = r5 << 2
            int r6 = r6 + r2
            int[] r2 = new int[r6]
            if (r4 == 0) goto L_0x02a3
            r3 = 0
        L_0x029a:
            if (r3 >= r6) goto L_0x02a1
            r2[r3] = r3
            int r3 = r3 + 1
            goto L_0x029a
        L_0x02a1:
            r8 = r6
            goto L_0x02c7
        L_0x02a3:
            int r3 = r6 + 1
            int r7 = r6 / 2
            int r8 = r7 + -1
            int r8 = r8 / 15
            int r8 = r8 * 2
            int r8 = r8 + r3
            int r3 = r8 / 2
            r9 = 0
        L_0x02b1:
            if (r9 >= r7) goto L_0x02c7
            int r10 = r9 / 15
            int r10 = r10 + r9
            int r11 = r7 - r9
            int r11 = r11 - r13
            int r12 = r3 - r10
            int r12 = r12 - r13
            r2[r11] = r12
            int r11 = r7 + r9
            int r10 = r10 + r3
            int r10 = r10 + r13
            r2[r11] = r10
            int r9 = r9 + 1
            goto L_0x02b1
        L_0x02c7:
            ch.b r3 = new ch.b
            r3.<init>(r8, r8)
            r7 = 0
            r9 = 0
        L_0x02ce:
            if (r7 >= r5) goto L_0x0356
            int r10 = r5 - r7
            int r10 = r10 << 2
            if (r4 == 0) goto L_0x02d9
            r11 = 9
            goto L_0x02db
        L_0x02d9:
            r11 = 12
        L_0x02db:
            int r10 = r10 + r11
            r11 = 0
        L_0x02dd:
            if (r11 >= r10) goto L_0x034f
            int r12 = r11 << 1
            r13 = 0
        L_0x02e2:
            r14 = 2
            if (r13 >= r14) goto L_0x034c
            int r14 = r9 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo40759d(r14)
            if (r14 == 0) goto L_0x02fa
            int r14 = r7 << 1
            int r15 = r14 + r13
            r15 = r2[r15]
            int r14 = r14 + r11
            r14 = r2[r14]
            r3.mo40765c(r15, r14)
        L_0x02fa:
            int r14 = r10 << 1
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo40759d(r14)
            if (r14 == 0) goto L_0x0316
            int r14 = r7 << 1
            int r15 = r14 + r11
            r15 = r2[r15]
            int r16 = r6 + -1
            int r16 = r16 - r14
            int r16 = r16 - r13
            r14 = r2[r16]
            r3.mo40765c(r15, r14)
        L_0x0316:
            int r14 = r10 << 2
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo40759d(r14)
            if (r14 == 0) goto L_0x0330
            int r14 = r6 + -1
            int r15 = r7 << 1
            int r14 = r14 - r15
            int r15 = r14 - r13
            r15 = r2[r15]
            int r14 = r14 - r11
            r14 = r2[r14]
            r3.mo40765c(r15, r14)
        L_0x0330:
            int r14 = r10 * 6
            int r14 = r14 + r9
            int r14 = r14 + r12
            int r14 = r14 + r13
            boolean r14 = r0.mo40759d(r14)
            if (r14 == 0) goto L_0x0349
            int r14 = r6 + -1
            int r15 = r7 << 1
            int r14 = r14 - r15
            int r14 = r14 - r11
            r14 = r2[r14]
            int r15 = r15 + r13
            r15 = r2[r15]
            r3.mo40765c(r14, r15)
        L_0x0349:
            int r13 = r13 + 1
            goto L_0x02e2
        L_0x034c:
            int r11 = r11 + 1
            goto L_0x02dd
        L_0x034f:
            int r10 = r10 << 3
            int r9 = r9 + r10
            int r7 = r7 + 1
            goto L_0x02ce
        L_0x0356:
            int r0 = r8 / 2
            r2 = 7
            if (r4 == 0) goto L_0x0396
            r5 = 0
        L_0x035c:
            if (r5 >= r2) goto L_0x03d6
            int r7 = r0 + -3
            int r7 = r7 + r5
            boolean r9 = r1.mo40759d(r5)
            if (r9 == 0) goto L_0x036c
            int r9 = r0 + -5
            r3.mo40765c(r7, r9)
        L_0x036c:
            int r9 = r5 + 7
            boolean r9 = r1.mo40759d(r9)
            if (r9 == 0) goto L_0x0379
            int r9 = r0 + 5
            r3.mo40765c(r9, r7)
        L_0x0379:
            int r9 = 20 - r5
            boolean r9 = r1.mo40759d(r9)
            if (r9 == 0) goto L_0x0386
            int r9 = r0 + 5
            r3.mo40765c(r7, r9)
        L_0x0386:
            int r9 = 27 - r5
            boolean r9 = r1.mo40759d(r9)
            if (r9 == 0) goto L_0x0393
            int r9 = r0 + -5
            r3.mo40765c(r9, r7)
        L_0x0393:
            int r5 = r5 + 1
            goto L_0x035c
        L_0x0396:
            r5 = 0
            r7 = 10
        L_0x0399:
            if (r5 >= r7) goto L_0x03d6
            int r9 = r0 + -5
            int r9 = r9 + r5
            int r10 = r5 / 5
            int r10 = r10 + r9
            boolean r9 = r1.mo40759d(r5)
            if (r9 == 0) goto L_0x03ac
            int r9 = r0 + -7
            r3.mo40765c(r10, r9)
        L_0x03ac:
            int r9 = r5 + 10
            boolean r9 = r1.mo40759d(r9)
            if (r9 == 0) goto L_0x03b9
            int r9 = r0 + 7
            r3.mo40765c(r9, r10)
        L_0x03b9:
            int r9 = 29 - r5
            boolean r9 = r1.mo40759d(r9)
            if (r9 == 0) goto L_0x03c6
            int r9 = r0 + 7
            r3.mo40765c(r10, r9)
        L_0x03c6:
            int r9 = 39 - r5
            boolean r9 = r1.mo40759d(r9)
            if (r9 == 0) goto L_0x03d3
            int r9 = r0 + -7
            r3.mo40765c(r9, r10)
        L_0x03d3:
            int r5 = r5 + 1
            goto L_0x0399
        L_0x03d6:
            if (r4 == 0) goto L_0x03dd
            r1 = 5
            p584jl.C17886b.m44482h(r3, r0, r1)
            goto L_0x0404
        L_0x03dd:
            p584jl.C17886b.m44482h(r3, r0, r2)
            r1 = 0
            r2 = 0
        L_0x03e2:
            int r4 = r6 / 2
            int r4 = r4 + -1
            if (r1 >= r4) goto L_0x0404
            r4 = r0 & 1
        L_0x03ea:
            if (r4 >= r8) goto L_0x03ff
            int r5 = r0 - r2
            r3.mo40765c(r5, r4)
            int r7 = r0 + r2
            r3.mo40765c(r7, r4)
            r3.mo40765c(r4, r5)
            r3.mo40765c(r4, r7)
            int r4 = r4 + 2
            goto L_0x03ea
        L_0x03ff:
            int r1 = r1 + 15
            int r2 = r2 + 16
            goto L_0x03e2
        L_0x0404:
            int r0 = r3.f34027b
            int r1 = r3.f34028c
            r7 = r21
            int r2 = java.lang.Math.max(r7, r0)
            r8 = r22
            int r4 = java.lang.Math.max(r8, r1)
            int r5 = r2 / r0
            int r6 = r4 / r1
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r0 * r5
            int r6 = r2 - r6
            int r6 = r6 / 2
            int r7 = r1 * r5
            int r7 = r4 - r7
            int r7 = r7 / 2
            ch.b r8 = new ch.b
            r8.<init>(r2, r4)
            r2 = 0
        L_0x042e:
            if (r2 >= r1) goto L_0x0445
            r4 = 0
            r9 = r6
        L_0x0432:
            if (r4 >= r0) goto L_0x0441
            boolean r10 = r3.mo40764b(r4, r2)
            if (r10 == 0) goto L_0x043d
            r8.mo40767d(r9, r7, r5, r5)
        L_0x043d:
            int r4 = r4 + 1
            int r9 = r9 + r5
            goto L_0x0432
        L_0x0441:
            int r2 = r2 + 1
            int r7 = r7 + r5
            goto L_0x042e
        L_0x0445:
            return r8
        L_0x0446:
            r7 = r21
            r8 = r22
            int r0 = r0 + 1
            r10 = 32
            r13 = 1
            r8 = 32
            goto L_0x0211
        L_0x0453:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Data too large for an Aztec code"
            r0.<init>(r1)
            throw r0
        L_0x045b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r20)
            java.lang.String r2 = "Can only encode AZTEC, but got "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p258t4.C6587a.mo22696i(java.lang.String, com.google.zxing.BarcodeFormat, int, int, java.util.Map):ch.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        throw null;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22175j(p462eh.C16822c r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r11.mo49494c()
            r2 = 1
            r3 = 4
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0055
            char r1 = r11.mo49493b()
            r6 = 32
            if (r1 < r6) goto L_0x001f
            r6 = 63
            if (r1 > r6) goto L_0x001f
            r0.append(r1)
            goto L_0x002d
        L_0x001f:
            r6 = 64
            if (r1 < r6) goto L_0x0051
            r6 = 94
            if (r1 > r6) goto L_0x0051
            int r1 = r1 + -64
            char r1 = (char) r1
            r0.append(r1)
        L_0x002d:
            int r1 = r11.f43788f
            int r1 = r1 + r2
            r11.f43788f = r1
            int r1 = r0.length()
            if (r1 < r3) goto L_0x0005
            java.lang.String r1 = m15518q(r0)
            java.lang.StringBuilder r6 = r11.f43787e
            r6.append(r1)
            r0.delete(r5, r3)
            java.lang.String r1 = r11.f43783a
            int r6 = r11.f43788f
            int r1 = p172m9.C5720b.m14075z(r1, r6, r3)
            if (r1 == r3) goto L_0x0005
            r11.f43789g = r5
            goto L_0x0055
        L_0x0051:
            p172m9.C5720b.m14067r(r1)
            throw r4
        L_0x0055:
            r1 = 31
            r0.append(r1)
            int r1 = r0.length()     // Catch:{ all -> 0x00ea }
            if (r1 != 0) goto L_0x0064
            r11.f43789g = r5
            goto L_0x00e1
        L_0x0064:
            r6 = 2
            if (r1 != r2) goto L_0x009b
            int r7 = r11.mo49492a()     // Catch:{ all -> 0x00ea }
            r11.mo49495d(r7)     // Catch:{ all -> 0x00ea }
            eh.e r7 = r11.f43790h     // Catch:{ all -> 0x00ea }
            int r7 = r7.f43798b     // Catch:{ all -> 0x00ea }
            int r8 = r11.mo49492a()     // Catch:{ all -> 0x00ea }
            int r7 = r7 - r8
            java.lang.String r8 = r11.f43783a     // Catch:{ all -> 0x00ea }
            int r8 = r8.length()     // Catch:{ all -> 0x00ea }
            int r9 = r11.f43791i     // Catch:{ all -> 0x00ea }
            int r8 = r8 - r9
            int r9 = r11.f43788f     // Catch:{ all -> 0x00ea }
            int r8 = r8 - r9
            if (r8 <= r7) goto L_0x0096
            int r7 = r11.mo49492a()     // Catch:{ all -> 0x00ea }
            int r7 = r7 + r2
            r11.mo49495d(r7)     // Catch:{ all -> 0x00ea }
            eh.e r7 = r11.f43790h     // Catch:{ all -> 0x00ea }
            int r7 = r7.f43798b     // Catch:{ all -> 0x00ea }
            int r9 = r11.mo49492a()     // Catch:{ all -> 0x00ea }
            int r7 = r7 - r9
        L_0x0096:
            if (r8 > r7) goto L_0x009b
            if (r7 > r6) goto L_0x009b
            goto L_0x00df
        L_0x009b:
            if (r1 > r3) goto L_0x00e2
            int r1 = r1 - r2
            java.lang.String r0 = m15518q(r0)     // Catch:{ all -> 0x00ea }
            boolean r3 = r11.mo49494c()     // Catch:{ all -> 0x00ea }
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x00ac
            if (r1 > r6) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r2 = 0
        L_0x00ad:
            if (r1 > r6) goto L_0x00d0
            int r3 = r11.mo49492a()     // Catch:{ all -> 0x00ea }
            int r3 = r3 + r1
            r11.mo49495d(r3)     // Catch:{ all -> 0x00ea }
            eh.e r3 = r11.f43790h     // Catch:{ all -> 0x00ea }
            int r3 = r3.f43798b     // Catch:{ all -> 0x00ea }
            int r6 = r11.mo49492a()     // Catch:{ all -> 0x00ea }
            int r3 = r3 - r6
            r6 = 3
            if (r3 < r6) goto L_0x00d0
            int r2 = r11.mo49492a()     // Catch:{ all -> 0x00ea }
            int r3 = r0.length()     // Catch:{ all -> 0x00ea }
            int r2 = r2 + r3
            r11.mo49495d(r2)     // Catch:{ all -> 0x00ea }
            r2 = 0
        L_0x00d0:
            if (r2 == 0) goto L_0x00da
            r11.f43790h = r4     // Catch:{ all -> 0x00ea }
            int r0 = r11.f43788f     // Catch:{ all -> 0x00ea }
            int r0 = r0 - r1
            r11.f43788f = r0     // Catch:{ all -> 0x00ea }
            goto L_0x00df
        L_0x00da:
            java.lang.StringBuilder r1 = r11.f43787e     // Catch:{ all -> 0x00ea }
            r1.append(r0)     // Catch:{ all -> 0x00ea }
        L_0x00df:
            r11.f43789g = r5
        L_0x00e1:
            return
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = "Count must not exceed 4"
            r0.<init>(r1)     // Catch:{ all -> 0x00ea }
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            r11.f43789g = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p258t4.C6587a.mo22175j(eh.c):void");
    }

    /* renamed from: k */
    public /* synthetic */ void mo22697k() {
    }

    /* renamed from: l */
    public /* synthetic */ void mo22698l() {
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return new C18040c(sVar.mo317f(C18040c.C18041a.class));
    }

    /* renamed from: n */
    public void mo5859n(Bundle bundle) {
    }

    /* renamed from: o */
    public /* synthetic */ void mo22699o(C20431c cVar, C20436g gVar, boolean z) {
    }

    /* renamed from: p */
    public void mo22700p(String str, StringBuffer stringBuffer, char c, int i) {
        stringBuffer.append("\\");
        stringBuffer.append(c);
    }

    /* renamed from: r */
    public void mo22701r(Bundle bundle, String str) {
        throw null;
    }

    /* renamed from: s */
    public void mo22702s(Bundle bundle, String str) {
        throw null;
    }

    /* renamed from: v */
    public void mo22703v() {
        throw null;
    }

    /* renamed from: w */
    public void mo22704w() {
        throw null;
    }

    /* renamed from: x */
    public void mo22705x(Bundle bundle, String str) {
        throw null;
    }

    /* renamed from: y */
    public void mo22706y() {
        throw null;
    }

    public /* synthetic */ Object zza() {
        return new C13413b();
    }
}
