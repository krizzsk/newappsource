package lc0;

import ac0.C7557a;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.umo.ads.p342c.zzd;
import com.umo.ads.p350u.zzs;
import com.usebutton.sdk.internal.models.Widget;
import hc0.C12755c;
import java.util.Timer;
import java.util.TimerTask;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p316y.C7219n;
import p583jk.C17884p;
import p584jl.C17885a;
import wb0.C13233c;

/* renamed from: lc0.a */
public final class C12856a {

    /* renamed from: a */
    public final String f31786a;

    /* renamed from: b */
    public final C12860c f31787b;

    /* renamed from: c */
    public final C12857a f31788c;

    /* renamed from: d */
    public final C12859b f31789d = new C12859b();

    /* renamed from: e */
    public int f31790e = 1;

    /* renamed from: f */
    public boolean f31791f;

    /* renamed from: g */
    public Timer f31792g;

    /* renamed from: h */
    public boolean f31793h;

    /* renamed from: i */
    public String f31794i;

    /* renamed from: lc0.a$a */
    public interface C12857a {
    }

    /* renamed from: lc0.a$b */
    public static final class C12858b extends TimerTask {

        /* renamed from: b */
        public final /* synthetic */ String f31795b;

        /* renamed from: c */
        public final /* synthetic */ C12856a f31796c;

        public C12858b(C12856a aVar, String str) {
            this.f31795b = str;
            this.f31796c = aVar;
        }

        public final void run() {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("VPAID_API_RESPONSE_TIMER: ");
            J0.append(this.f31795b);
            J0.append(": VPAID API Response Timeout Timer EXPIRED");
            J0.append(this.f31796c.f31794i);
            logger.mo6672i(J0.toString());
            C12856a aVar = this.f31796c;
            aVar.getClass();
            aVar.mo39713c("", true);
            aVar.f31790e = 1;
            aVar.f31789d.f31800d = "VPAID API Response Timed out";
            aVar.f31793h = false;
            ((C12755c) aVar.f31788c).mo39607c(aVar, zzd.AD_DISPLAY_TIMED_OUT);
        }
    }

    public C12856a(String str, C12860c cVar, C12857a aVar) {
        String str2;
        C24362h.m61211f(str, "spotId");
        this.f31786a = str;
        this.f31787b = cVar;
        this.f31788c = aVar;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f31794i = str2;
        this.f31793h = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v101, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v115, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void JSToNativeHandler(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "UTF-8"
            java.lang.String r3 = " (Exception: "
            java.lang.String r4 = "webCommand"
            mf0.C24362h.m61211f(r0, r4)
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.String r5 = "VPAID_BRIDGE: Web->Native"
            java.lang.StringBuilder r5 = ce0.C21100e.m49315J0(r5)
            java.lang.String r6 = r1.f31794i
            r5.append(r6)
            java.lang.String r6 = ": "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.mo6672i(r5)
            boolean r4 = android.text.TextUtils.isEmpty(r17)
            if (r4 != 0) goto L_0x094c
            boolean r4 = r1.f31793h
            if (r4 != 0) goto L_0x0035
            goto L_0x094c
        L_0x0035:
            r4 = 2
            java.lang.String r5 = "console"
            boolean r5 = uh0.C25081h.m62835F(r0, r5)
            if (r5 == 0) goto L_0x003f
            return
        L_0x003f:
            r5 = 41
            java.net.URI r6 = new java.net.URI     // Catch:{ URISyntaxException -> 0x092a }
            r6.<init>(r0)     // Catch:{ URISyntaxException -> 0x092a }
            java.lang.String r0 = r6.getScheme()
            if (r0 != 0) goto L_0x004e
            r0 = 0
            goto L_0x005e
        L_0x004e:
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r9 = "US"
            mf0.C24362h.m61210e(r8, r9)
            java.lang.String r0 = r0.toUpperCase(r8)
            java.lang.String r8 = "this as java.lang.String).toUpperCase(locale)"
            mf0.C24362h.m61210e(r0, r8)
        L_0x005e:
            java.lang.String r8 = "VPAID"
            boolean r0 = mf0.C24362h.m61206a(r8, r0)
            if (r0 == 0) goto L_0x0929
            java.lang.String r8 = r6.getHost()
            java.lang.String r0 = r6.getRawQuery()
            java.lang.String r6 = "url"
            java.lang.String r9 = "AdClickThru"
            r10 = -1
            r11 = 6
            r12 = 4
            r13 = 0
            r14 = 1
            if (r0 == 0) goto L_0x013d
            boolean r15 = mf0.C24362h.m61206a(r8, r9)
            if (r15 == 0) goto L_0x009b
            java.lang.String r15 = "url="
            int r15 = kotlin.text.C24179b.m60565M(r0, r15, r13, r13, r11)
            if (r15 == r10) goto L_0x009b
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r15 = r15 + r12
            java.lang.String r15 = r0.substring(r15)
            java.lang.String r11 = "this as java.lang.String).substring(startIndex)"
            mf0.C24362h.m61210e(r15, r11)
            r10.put(r6, r15)
            r11 = 1
            goto L_0x009d
        L_0x009b:
            r10 = 0
            r11 = 0
        L_0x009d:
            if (r11 != 0) goto L_0x013e
            kotlin.text.Regex r11 = new kotlin.text.Regex
            java.lang.String r15 = "&"
            r11.<init>((java.lang.String) r15)
            java.util.List r0 = r11.mo60285d(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x00ae:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            kotlin.text.Regex r15 = new kotlin.text.Regex
            java.lang.String r7 = "="
            r15.<init>((java.lang.String) r7)
            java.util.List r0 = r15.mo60285d(r0)
            int r7 = r0.size()
            if (r7 != r4) goto L_0x00ae
            java.lang.Object r7 = r0.get(r13)     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            java.lang.Object r0 = r0.get(r14)     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            if (r10 != 0) goto L_0x00e7
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            r15.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            r10 = r15
        L_0x00e7:
            java.lang.String r15 = "key"
            mf0.C24362h.m61210e(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            java.lang.String r15 = "value"
            mf0.C24362h.m61210e(r0, r15)     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            r10.put(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x0118, IllegalArgumentException -> 0x00f5 }
            goto L_0x00ae
        L_0x00f5:
            r0 = move-exception
            ch.qos.logback.classic.Logger r7 = ac0.C7557a.f23040a
            java.lang.String r15 = "IllegalArgumentException while processing VPAID Command from Creative"
            java.lang.StringBuilder r15 = ce0.C21100e.m49315J0(r15)
            java.lang.String r4 = r1.f31794i
            r15.append(r4)
            r15.append(r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r15.append(r0)
            r15.append(r5)
            java.lang.String r0 = r15.toString()
            r7.mo6667d(r0)
            goto L_0x013a
        L_0x0118:
            r0 = move-exception
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.String r7 = "UnsupportedEncodingException while processing VPAID Command from Creative"
            java.lang.StringBuilder r7 = ce0.C21100e.m49315J0(r7)
            java.lang.String r15 = r1.f31794i
            r7.append(r15)
            r7.append(r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            r4.mo6667d(r0)
        L_0x013a:
            r4 = 2
            goto L_0x00ae
        L_0x013d:
            r10 = 0
        L_0x013e:
            if (r8 == 0) goto L_0x0929
            int r0 = r8.hashCode()
            java.lang.String r2 = "time"
            java.lang.String r3 = "true"
            java.lang.String r4 = ""
            switch(r0) {
                case -1844074968: goto L_0x08b5;
                case -1741877423: goto L_0x086f;
                case -1686946132: goto L_0x0824;
                case -1528092430: goto L_0x07e1;
                case -1196691688: goto L_0x07a2;
                case -991798294: goto L_0x074b;
                case -916384160: goto L_0x0708;
                case -694345492: goto L_0x068f;
                case -453896817: goto L_0x064c;
                case -235764749: goto L_0x060c;
                case -143494777: goto L_0x05bd;
                case -105723980: goto L_0x053d;
                case 123005777: goto L_0x04d4;
                case 227130189: goto L_0x044e;
                case 260221804: goto L_0x040b;
                case 369958203: goto L_0x03c8;
                case 479049069: goto L_0x0391;
                case 488344453: goto L_0x0367;
                case 729386686: goto L_0x031b;
                case 742252554: goto L_0x0306;
                case 858456394: goto L_0x02c3;
                case 1024669788: goto L_0x024c;
                case 1644017103: goto L_0x0222;
                case 1766207024: goto L_0x01d3;
                case 2000158681: goto L_0x0194;
                case 2133007979: goto L_0x014f;
                default: goto L_0x014d;
            }
        L_0x014d:
            goto L_0x0929
        L_0x014f:
            java.lang.String r0 = "AdPlaying"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0159
            goto L_0x0929
        L_0x0159:
            r1.f31790e = r12
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x0170
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x0170:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdPlaying"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x018c
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x0185
            goto L_0x0929
        L_0x0185:
            java.lang.String r2 = r1.f31786a
            r0.zzh(r2)
            goto L_0x0929
        L_0x018c:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_RESUMED
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x0194:
            java.lang.String r0 = "AdSkippableStateChange"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x019e
            goto L_0x0929
        L_0x019e:
            lc0.b r0 = r1.f31789d
            if (r10 != 0) goto L_0x01a4
            r7 = 0
            goto L_0x01ad
        L_0x01a4:
            java.lang.String r2 = "skip"
            java.lang.Object r2 = r10.get(r2)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x01ad:
            boolean r2 = mf0.C24362h.m61206a(r3, r7)
            r0.f31798b = r2
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = r1.f31786a
            boolean r3 = nc0.C12954d.m32800c(r2)
            if (r3 == 0) goto L_0x01c8
            java.lang.String r4 = p584jl.C17885a.m44403H0(r2)
        L_0x01c8:
            java.lang.String r2 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdSkippableStateChange"
            java.lang.String r2 = mf0.C24362h.m61216k(r4, r2)
            r0.mo6666c(r2)
            goto L_0x0929
        L_0x01d3:
            java.lang.String r0 = "AdRemainingTimeChange"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0929
        L_0x01dd:
            if (r10 != 0) goto L_0x01e0
            goto L_0x0202
        L_0x01e0:
            java.lang.Object r0 = r10.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x01e9
            goto L_0x0202
        L_0x01e9:
            lc0.b r2 = r1.f31789d
            java.lang.Integer r3 = uh0.C25080g.m62829y(r0)
            if (r3 != 0) goto L_0x01fc
            java.lang.Float r0 = uh0.C25080g.m62828x(r0)
            if (r0 != 0) goto L_0x01f8
            goto L_0x01ff
        L_0x01f8:
            r0.floatValue()
            goto L_0x01ff
        L_0x01fc:
            r3.intValue()
        L_0x01ff:
            r2.getClass()
        L_0x0202:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = r1.f31786a
            boolean r3 = nc0.C12954d.m32800c(r2)
            if (r3 == 0) goto L_0x0217
            java.lang.String r4 = p584jl.C17885a.m44403H0(r2)
        L_0x0217:
            java.lang.String r2 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdRemainingTimeChange"
            java.lang.String r2 = mf0.C24362h.m61216k(r4, r2)
            r0.mo6666c(r2)
            goto L_0x0929
        L_0x0222:
            java.lang.String r0 = "AdInteraction"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x022c
            goto L_0x0929
        L_0x022c:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = r1.f31786a
            boolean r3 = nc0.C12954d.m32800c(r2)
            if (r3 == 0) goto L_0x0241
            java.lang.String r4 = p584jl.C17885a.m44403H0(r2)
        L_0x0241:
            java.lang.String r2 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdInteraction"
            java.lang.String r2 = mf0.C24362h.m61216k(r4, r2)
            r0.mo6666c(r2)
            goto L_0x0929
        L_0x024c:
            boolean r0 = r8.equals(r9)
            if (r0 != 0) goto L_0x0254
            goto L_0x0929
        L_0x0254:
            lc0.a$a r0 = r1.f31788c
            if (r10 != 0) goto L_0x025a
            r7 = 0
            goto L_0x0261
        L_0x025a:
            java.lang.Object r2 = r10.get(r6)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x0261:
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdClickThru"
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            java.lang.String r5 = r1.f31786a
            boolean r6 = nc0.C12954d.m32800c(r5)
            if (r6 == 0) goto L_0x027a
            java.lang.String r4 = p584jl.C17885a.m44403H0(r5)
        L_0x027a:
            r3.append(r4)
            java.lang.String r4 = ": Url: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x029d
            vb0.e r2 = r0.f31517d
            if (r2 != 0) goto L_0x0297
            goto L_0x02a2
        L_0x0297:
            java.lang.String r3 = r1.f31786a
            r2.zzb(r3, r7)
            goto L_0x02a2
        L_0x029d:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_CLICKTHRU
            r0.mo39605a(r2, r7)
        L_0x02a2:
            gc0.b r0 = r0.f31518e
            if (r0 != 0) goto L_0x02a8
            goto L_0x0929
        L_0x02a8:
            boolean r2 = nc0.C12954d.m32800c(r7)
            if (r2 != 0) goto L_0x02b5
            java.lang.String r0 = "VPAIDWrapper.resumeAd();"
            r1.mo39712b(r0)
            goto L_0x0929
        L_0x02b5:
            android.os.Handler r2 = wb0.C13233c.f32843b
            x.r1 r3 = new x.r1
            r4 = 15
            r3.<init>(r0, r4)
            r2.post(r3)
            goto L_0x0929
        L_0x02c3:
            java.lang.String r0 = "AdVideoStart"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x02cd
            goto L_0x0929
        L_0x02cd:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x02e2
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x02e2:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdVideoStart"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x02fe
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x02f7
            goto L_0x0929
        L_0x02f7:
            java.lang.String r2 = r1.f31786a
            r0.mo39562f(r2)
            goto L_0x0929
        L_0x02fe:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_START
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x0306:
            java.lang.String r0 = "AdStopped"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0310
            goto L_0x0929
        L_0x0310:
            r1.f31790e = r14
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.mo39608d(r1, r13)
            goto L_0x0929
        L_0x031b:
            java.lang.String r0 = "AdStarted"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0325
            goto L_0x0929
        L_0x0325:
            java.lang.String r0 = "START_AD"
            r1.mo39713c(r0, r13)
            r1.f31790e = r12
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x0341
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x0341:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdStarted"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            gc0.b r0 = r0.f31518e
            if (r0 != 0) goto L_0x0350
            goto L_0x0929
        L_0x0350:
            lc0.a r2 = r0.f31442s
            if (r1 == r2) goto L_0x0356
            goto L_0x0929
        L_0x0356:
            r0.mo39525e(r13)
            android.os.Handler r2 = wb0.C13233c.f32843b
            x.b1 r3 = new x.b1
            r4 = 12
            r3.<init>(r0, r4)
            r2.post(r3)
            goto L_0x0929
        L_0x0367:
            java.lang.String r0 = "AdError"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0371
            goto L_0x0929
        L_0x0371:
            r1.f31790e = r14
            lc0.b r0 = r1.f31789d
            if (r10 != 0) goto L_0x0379
            r7 = 0
            goto L_0x0382
        L_0x0379:
            java.lang.String r2 = "msg"
            java.lang.Object r2 = r10.get(r2)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x0382:
            r0.f31800d = r7
            r1.f31793h = r13
            lc0.a$a r0 = r1.f31788c
            com.umo.ads.c.zzd r2 = com.umo.ads.p342c.zzd.NONE
            hc0.c r0 = (hc0.C12755c) r0
            r0.mo39607c(r1, r2)
            goto L_0x0929
        L_0x0391:
            java.lang.String r0 = "AdSkipped"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x039b
            goto L_0x0929
        L_0x039b:
            r1.f31790e = r14
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x03b2
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x03b2:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdSkipped"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            lc0.b r2 = r1.f31789d
            boolean r2 = r2.f31798b
            if (r2 == 0) goto L_0x0929
            java.lang.String r2 = r0.f31514a
            r0.mo39606b(r2, r13, r13)
            goto L_0x0929
        L_0x03c8:
            java.lang.String r0 = "AdVideoFirstQuartile"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x03d2
            goto L_0x0929
        L_0x03d2:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x03e7
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x03e7:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdVideoFirstQuartile"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x0403
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x03fc
            goto L_0x0929
        L_0x03fc:
            java.lang.String r2 = r1.f31786a
            r0.mo39569m(r2)
            goto L_0x0929
        L_0x0403:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_FIRST_QUARTILE
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x040b:
            java.lang.String r0 = "AdUserMinimize"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0415
            goto L_0x0929
        L_0x0415:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x042a
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x042a:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdUserMinimize"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x0446
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x043f
            goto L_0x0929
        L_0x043f:
            java.lang.String r2 = r1.f31786a
            r0.zze(r2)
            goto L_0x0929
        L_0x0446:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_COLLAPSED
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x044e:
            java.lang.String r0 = "AdVolumeChange"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0458
            goto L_0x0929
        L_0x0458:
            if (r10 != 0) goto L_0x045b
            goto L_0x0482
        L_0x045b:
            java.lang.String r0 = "volume"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0466
            goto L_0x0482
        L_0x0466:
            lc0.b r2 = r1.f31789d
            java.lang.Integer r3 = uh0.C25080g.m62829y(r0)
            if (r3 != 0) goto L_0x047c
            java.lang.Float r0 = uh0.C25080g.m62828x(r0)
            if (r0 != 0) goto L_0x0476
            r10 = -1
            goto L_0x0480
        L_0x0476:
            float r0 = r0.floatValue()
            int r10 = (int) r0
            goto L_0x0480
        L_0x047c:
            int r10 = r3.intValue()
        L_0x0480:
            r2.f31799c = r10
        L_0x0482:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            lc0.b r2 = r1.f31789d
            int r2 = r2.f31799c
            if (r2 > 0) goto L_0x0490
            r13 = 1
        L_0x0490:
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdVolumeChange"
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            java.lang.String r5 = r1.f31786a
            boolean r6 = nc0.C12954d.m32800c(r5)
            if (r6 == 0) goto L_0x04a4
            java.lang.String r4 = p584jl.C17885a.m44403H0(r5)
        L_0x04a4:
            r3.append(r4)
            java.lang.String r4 = ": isMuted: "
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x04c9
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x04c2
            goto L_0x0929
        L_0x04c2:
            java.lang.String r2 = r1.f31786a
            r0.mo39566j(r2, r13)
            goto L_0x0929
        L_0x04c9:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_VOLUME_CHANGED
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x04d4:
            java.lang.String r0 = "AdVideoComplete"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x04de
            goto L_0x0929
        L_0x04de:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x04f3
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x04f3:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdVideoComplete"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            gc0.b r2 = r0.f31518e
            if (r2 != 0) goto L_0x0501
            goto L_0x0503
        L_0x0501:
            r2.f31428e = r13
        L_0x0503:
            r0.f31519f = r14
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x0528
            gc0.b r2 = r0.f31518e
            if (r2 != 0) goto L_0x0510
            goto L_0x051b
        L_0x0510:
            lc0.a r3 = r2.f31442s
            if (r1 == r3) goto L_0x0515
            goto L_0x051b
        L_0x0515:
            r2.mo39531l()
            gc0.C12724b.m32486h(r2)
        L_0x051b:
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x0521
            goto L_0x0929
        L_0x0521:
            java.lang.String r2 = r1.f31786a
            r0.zzy(r2)
            goto L_0x0929
        L_0x0528:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_COMPLETED
            r3 = 0
            r0.mo39605a(r2, r3)
            hc0.c$a r2 = r0.f31515b
            if (r2 != 0) goto L_0x0534
            goto L_0x0929
        L_0x0534:
            java.lang.String r0 = r0.f31514a
            com.cubic.umo.ad.playback.ui.activities.AKVPaidAdActivity r2 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity) r2
            r2.mo11141b1(r0)
            goto L_0x0929
        L_0x053d:
            java.lang.String r0 = "AdSizeChange"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0547
            goto L_0x0929
        L_0x0547:
            if (r10 != 0) goto L_0x054a
            goto L_0x056e
        L_0x054a:
            java.lang.String r0 = "width"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0555
            goto L_0x056e
        L_0x0555:
            lc0.b r2 = r1.f31789d
            java.lang.Integer r3 = uh0.C25080g.m62829y(r0)
            if (r3 != 0) goto L_0x0568
            java.lang.Float r0 = uh0.C25080g.m62828x(r0)
            if (r0 != 0) goto L_0x0564
            goto L_0x056b
        L_0x0564:
            r0.floatValue()
            goto L_0x056b
        L_0x0568:
            r3.intValue()
        L_0x056b:
            r2.getClass()
        L_0x056e:
            if (r10 != 0) goto L_0x0571
            goto L_0x0595
        L_0x0571:
            java.lang.String r0 = "height"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x057c
            goto L_0x0595
        L_0x057c:
            lc0.b r2 = r1.f31789d
            java.lang.Integer r3 = uh0.C25080g.m62829y(r0)
            if (r3 != 0) goto L_0x058f
            java.lang.Float r0 = uh0.C25080g.m62828x(r0)
            if (r0 != 0) goto L_0x058b
            goto L_0x0592
        L_0x058b:
            r0.floatValue()
            goto L_0x0592
        L_0x058f:
            r3.intValue()
        L_0x0592:
            r2.getClass()
        L_0x0595:
            int r0 = r1.f31790e
            r2 = 2
            if (r0 == r2) goto L_0x059d
            r0 = 7
            r1.f31790e = r0
        L_0x059d:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = r1.f31786a
            boolean r3 = nc0.C12954d.m32800c(r2)
            if (r3 == 0) goto L_0x05b2
            java.lang.String r4 = p584jl.C17885a.m44403H0(r2)
        L_0x05b2:
            java.lang.String r2 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdSizeChange"
            java.lang.String r2 = mf0.C24362h.m61216k(r4, r2)
            r0.mo6666c(r2)
            goto L_0x0929
        L_0x05bd:
            java.lang.String r0 = "AdDurationChange"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x05c7
            goto L_0x0929
        L_0x05c7:
            if (r10 != 0) goto L_0x05ca
            goto L_0x05ec
        L_0x05ca:
            java.lang.Object r0 = r10.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x05d3
            goto L_0x05ec
        L_0x05d3:
            lc0.b r2 = r1.f31789d
            java.lang.Integer r3 = uh0.C25080g.m62829y(r0)
            if (r3 != 0) goto L_0x05e6
            java.lang.Float r0 = uh0.C25080g.m62828x(r0)
            if (r0 != 0) goto L_0x05e2
            goto L_0x05e9
        L_0x05e2:
            r0.floatValue()
            goto L_0x05e9
        L_0x05e6:
            r3.intValue()
        L_0x05e9:
            r2.getClass()
        L_0x05ec:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = r1.f31786a
            boolean r3 = nc0.C12954d.m32800c(r2)
            if (r3 == 0) goto L_0x0601
            java.lang.String r4 = p584jl.C17885a.m44403H0(r2)
        L_0x0601:
            java.lang.String r2 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdDurationChange"
            java.lang.String r2 = mf0.C24362h.m61216k(r4, r2)
            r0.mo6666c(r2)
            goto L_0x0929
        L_0x060c:
            java.lang.String r0 = "InitializeAd"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0616
            goto L_0x0929
        L_0x0616:
            r2 = 2
            r1.f31790e = r2
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x062e
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x062e:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidInitializeAd"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            gc0.b r0 = r0.f31518e
            if (r0 != 0) goto L_0x063d
            goto L_0x0929
        L_0x063d:
            lc0.a r2 = r0.f31442s
            if (r1 == r2) goto L_0x0643
            goto L_0x0929
        L_0x0643:
            if (r1 != r2) goto L_0x0647
            r0.f31438o = r14
        L_0x0647:
            r0.mo39522b(r1)
            goto L_0x0929
        L_0x064c:
            java.lang.String r0 = "AdUserAcceptInvitation"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0656
            goto L_0x0929
        L_0x0656:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x066b
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x066b:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdUserAcceptInvitation"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x0687
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x0680
            goto L_0x0929
        L_0x0680:
            java.lang.String r2 = r1.f31786a
            r0.zzc(r2)
            goto L_0x0929
        L_0x0687:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_USER_ACCEPT_INVITATION
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x068f:
            java.lang.String r0 = "AdExpandedChange"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0699
            goto L_0x0929
        L_0x0699:
            lc0.b r0 = r1.f31789d
            if (r10 != 0) goto L_0x069f
            r2 = 0
            goto L_0x06a7
        L_0x069f:
            java.lang.String r2 = "expand"
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r2 = (java.lang.String) r2
        L_0x06a7:
            boolean r2 = mf0.C24362h.m61206a(r3, r2)
            r0.f31797a = r2
            r2 = 6
            r1.f31790e = r2
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x06c5
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x06c5:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdExpandedChange"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            lc0.b r2 = r1.f31789d
            boolean r3 = r0.mo39609e()
            if (r3 == 0) goto L_0x06f4
            boolean r2 = r2.f31797a
            if (r2 == 0) goto L_0x06e7
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x06e0
            goto L_0x0929
        L_0x06e0:
            java.lang.String r2 = r1.f31786a
            r0.zzn(r2)
            goto L_0x0929
        L_0x06e7:
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x06ed
            goto L_0x0929
        L_0x06ed:
            java.lang.String r2 = r1.f31786a
            r0.zze(r2)
            goto L_0x0929
        L_0x06f4:
            boolean r2 = r2.f31797a
            if (r2 == 0) goto L_0x0700
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_EXPANDED
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x0700:
            r3 = 0
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_COLLAPSED
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x0708:
            java.lang.String r0 = "AdVideoMidpoint"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0712
            goto L_0x0929
        L_0x0712:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x0727
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x0727:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdVideoMidpoint"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x0743
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x073c
            goto L_0x0929
        L_0x073c:
            java.lang.String r2 = r1.f31786a
            r0.mo39581y(r2)
            goto L_0x0929
        L_0x0743:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_MIDPOINT
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x074b:
            java.lang.String r0 = "AdUserClose"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0755
            goto L_0x0929
        L_0x0755:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x076a
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x076a:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdUserClose"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            gc0.b r2 = r0.f31518e
            if (r2 != 0) goto L_0x0778
            goto L_0x077a
        L_0x0778:
            r2.f31428e = r13
        L_0x077a:
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x078d
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x0786
            goto L_0x0929
        L_0x0786:
            java.lang.String r2 = r1.f31786a
            r0.mo39553E(r2)
            goto L_0x0929
        L_0x078d:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_USER_CLOSE
            r3 = 0
            r0.mo39605a(r2, r3)
            hc0.c$a r2 = r0.f31515b
            if (r2 != 0) goto L_0x0799
            goto L_0x0929
        L_0x0799:
            java.lang.String r0 = r0.f31514a
            com.cubic.umo.ad.playback.ui.activities.AKVPaidAdActivity r2 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity) r2
            r2.mo11141b1(r0)
            goto L_0x0929
        L_0x07a2:
            java.lang.String r0 = "AdLinearChange"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x07ac
            goto L_0x0929
        L_0x07ac:
            lc0.b r0 = r1.f31789d
            if (r10 != 0) goto L_0x07b2
            r7 = 0
            goto L_0x07bb
        L_0x07b2:
            java.lang.String r2 = "linear"
            java.lang.Object r2 = r10.get(r2)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x07bb:
            mf0.C24362h.m61206a(r3, r7)
            r0.getClass()
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = r1.f31786a
            boolean r3 = nc0.C12954d.m32800c(r2)
            if (r3 == 0) goto L_0x07d6
            java.lang.String r4 = p584jl.C17885a.m44403H0(r2)
        L_0x07d6:
            java.lang.String r2 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdLinearChange"
            java.lang.String r2 = mf0.C24362h.m61216k(r4, r2)
            r0.mo6666c(r2)
            goto L_0x0929
        L_0x07e1:
            java.lang.String r0 = "AdVideoThirdQuartile"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x07eb
            goto L_0x0929
        L_0x07eb:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x0800
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x0800:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdVideoThirdQuartile"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x081c
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x0815
            goto L_0x0929
        L_0x0815:
            java.lang.String r2 = r1.f31786a
            r0.zzg(r2)
            goto L_0x0929
        L_0x081c:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_THIRD_QUARTILE
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x0824:
            java.lang.String r0 = "AdImpression"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x082e
            goto L_0x0929
        L_0x082e:
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x0843
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x0843:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdImpression"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x085f
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x0858
            goto L_0x0929
        L_0x0858:
            java.lang.String r2 = r1.f31786a
            r0.mo39580x(r2)
            goto L_0x0929
        L_0x085f:
            gc0.b r2 = r0.f31518e
            if (r2 != 0) goto L_0x0864
            goto L_0x0867
        L_0x0864:
            r2.mo39525e(r13)
        L_0x0867:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_IMPRESSION
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x086f:
            java.lang.String r0 = "AdPaused"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0879
            goto L_0x0929
        L_0x0879:
            r0 = 5
            r1.f31790e = r0
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x0891
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x0891:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdPaused"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x08ad
            vb0.e r0 = r0.f31517d
            if (r0 != 0) goto L_0x08a6
            goto L_0x0929
        L_0x08a6:
            java.lang.String r2 = r1.f31786a
            r0.mo39549A(r2)
            goto L_0x0929
        L_0x08ad:
            com.umo.ads.u.zzk r2 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_AD_PAUSED
            r3 = 0
            r0.mo39605a(r2, r3)
            goto L_0x0929
        L_0x08b5:
            java.lang.String r0 = "AdLoaded"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x08be
            goto L_0x0929
        L_0x08be:
            java.lang.String r0 = "INIT_AD"
            r1.mo39713c(r0, r13)
            r0 = 3
            r1.f31790e = r0
            lc0.a$a r0 = r1.f31788c
            hc0.c r0 = (hc0.C12755c) r0
            r0.getClass()
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = r1.f31786a
            boolean r5 = nc0.C12954d.m32800c(r3)
            if (r5 == 0) goto L_0x08db
            java.lang.String r4 = p584jl.C17885a.m44403H0(r3)
        L_0x08db:
            java.lang.String r3 = "VPAID_BRIDGE_CALLBACK: onVPaidEventAdLoaded"
            java.lang.String r3 = mf0.C24362h.m61216k(r4, r3)
            r2.mo6666c(r3)
            boolean r2 = r0.mo39609e()
            if (r2 == 0) goto L_0x08f4
            vb0.a r2 = r0.f31516c
            if (r2 != 0) goto L_0x08ef
            goto L_0x08f4
        L_0x08ef:
            java.lang.String r3 = r1.f31786a
            r2.mo39572p(r3)
        L_0x08f4:
            gc0.b r0 = r0.f31518e
            if (r0 != 0) goto L_0x08f9
            goto L_0x0929
        L_0x08f9:
            lc0.a r2 = r0.f31442s
            if (r1 == r2) goto L_0x08fe
            goto L_0x0929
        L_0x08fe:
            r0.f31443t = r14
            r0.mo39525e(r13)
            android.widget.ImageView r2 = r0.f31435l
            if (r2 != 0) goto L_0x0908
            goto L_0x090f
        L_0x0908:
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x090f
            r13 = 1
        L_0x090f:
            if (r13 == 0) goto L_0x0920
            android.widget.ImageView r2 = r0.f31435l
            mf0.C24362h.m61208c(r2)
            android.os.Handler r3 = wb0.C13233c.f32843b
            ia.i r4 = new ia.i
            r4.<init>(r14, r2, r14)
            r3.post(r4)
        L_0x0920:
            boolean r2 = r0.mo39528i()
            if (r2 == 0) goto L_0x0929
            r0.mo39533n()
        L_0x0929:
            return
        L_0x092a:
            r0 = move-exception
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r4 = "URISyntaxException while processing VPAID Command from Creative"
            java.lang.StringBuilder r4 = ce0.C21100e.m49315J0(r4)
            java.lang.String r6 = r1.f31794i
            r4.append(r6)
            r4.append(r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            r2.mo6667d(r0)
        L_0x094c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lc0.C12856a.JSToNativeHandler(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo39711a(int i, int i2, zzs zzs, String str) {
        String str2;
        C24362h.m61211f(zzs, "viewMode");
        int ordinal = zzs.ordinal();
        if (ordinal == 1) {
            str2 = "thumbnail";
        } else if (ordinal != 2) {
            str2 = "normal";
        } else {
            str2 = Widget.VIEW_TYPE_FULLSCREEN;
        }
        mo39714d("INIT_AD");
        mo39712b("VPAIDWrapper.initAd('" + i + "', '" + i2 + "', '" + str2 + "', '" + null + "', '" + str + "', '" + null + "');");
    }

    /* renamed from: b */
    public final void mo39712b(String str) {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("VPAID_BRIDGE: Native->Web");
        J0.append(this.f31794i);
        J0.append(": ");
        J0.append(str);
        logger.mo6672i(J0.toString());
        C12860c cVar = this.f31787b;
        cVar.getClass();
        C24362h.m61211f(str, "script");
        C13233c.f32843b.post(new C7219n(17, str, cVar));
    }

    /* renamed from: c */
    public final void mo39713c(String str, boolean z) {
        String str2;
        if (this.f31792g != null) {
            if (C12954d.m32800c(str)) {
                str2 = C24362h.m61216k(": ", str);
            } else {
                str2 = "";
            }
            if (!z) {
                Logger logger = C7557a.f23040a;
                StringBuilder d0 = C17884p.m44363d0("VPAID_API_RESPONSE_TIMER: ", str2, "Stopping VPAID API Response Timeout Timer");
                d0.append(this.f31794i);
                d0.append("...");
                logger.mo6672i(d0.toString());
            }
            Timer timer = this.f31792g;
            if (timer != null) {
                timer.cancel();
            }
            this.f31792g = null;
        }
    }

    /* renamed from: d */
    public final synchronized void mo39714d(String str) {
        if (this.f31792g == null) {
            Logger logger = C7557a.f23040a;
            StringBuilder d0 = C17884p.m44363d0("VPAID_API_RESPONSE_TIMER: ", str, ": Starting VPAID API Response Timeout Timer");
            d0.append(this.f31794i);
            d0.append(": [");
            d0.append(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
            d0.append(" milliseconds]...");
            logger.mo6672i(d0.toString());
            Timer timer = new Timer();
            this.f31792g = timer;
            timer.schedule(new C12858b(this, str), (long) InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);
        }
    }
}
