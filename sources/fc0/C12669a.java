package fc0;

import ac0.C7557a;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.umo.ads.p350u.zzu;
import kc0.C12844i;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p304x.C7109v;
import p584jl.C17885a;
import wb0.C13233c;

/* renamed from: fc0.a */
public final class C12669a {

    /* renamed from: a */
    public final String f31307a;

    /* renamed from: b */
    public final C12675e f31308b;

    /* renamed from: c */
    public final C12670a f31309c;

    /* renamed from: d */
    public C12672b f31310d;

    /* renamed from: e */
    public C12674d f31311e;

    /* renamed from: f */
    public C12673c f31312f;

    /* renamed from: g */
    public String f31313g;

    /* renamed from: h */
    public zzu f31314h;

    /* renamed from: fc0.a$a */
    public interface C12670a {
    }

    /* renamed from: fc0.a$b */
    public /* synthetic */ class C12671b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31315a;

        static {
            int[] iArr = new int[zzu.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[4] = 3;
            iArr[3] = 4;
            iArr[2] = 5;
            int[] iArr2 = new int[C17885a.m44417O0(5).length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
            iArr2[4] = 5;
            f31315a = iArr2;
        }
    }

    public C12669a(String str, C12675e eVar, C12844i.C12846b bVar) {
        String str2;
        C24362h.m61211f(str, "spotId");
        this.f31307a = str;
        this.f31308b = eVar;
        this.f31309c = bVar;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f31313g = str2;
        this.f31314h = zzu.LOADING;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0656 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x08d9  */
    /* JADX WARNING: Removed duplicated region for block: B:616:? A[RETURN, SYNTHETIC] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void JSToNativeHandler(java.lang.String r19) {
        /*
            r18 = this;
            r10 = r18
            r0 = r19
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = " (Exception: "
            java.lang.String r3 = "webCommand"
            mf0.C24362h.m61211f(r0, r3)
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r4 = "MRAID_BRIDGE: Web->Native"
            java.lang.StringBuilder r4 = ce0.C21100e.m49315J0(r4)
            java.lang.String r5 = r10.f31313g
            r4.append(r5)
            java.lang.String r5 = ": "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.mo6672i(r4)
            boolean r3 = android.text.TextUtils.isEmpty(r19)
            if (r3 == 0) goto L_0x0030
            return
        L_0x0030:
            java.lang.String r3 = "console"
            boolean r3 = uh0.C25081h.m62835F(r0, r3)
            if (r3 == 0) goto L_0x0039
            return
        L_0x0039:
            r3 = 41
            java.net.URI r4 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0987 }
            r4.<init>(r0)     // Catch:{ URISyntaxException -> 0x0987 }
            java.lang.String r0 = r4.getScheme()
            java.lang.String r5 = "US"
            java.lang.String r6 = "this as java.lang.String).toLowerCase(locale)"
            if (r0 != 0) goto L_0x004c
            r0 = 0
            goto L_0x0058
        L_0x004c:
            java.util.Locale r8 = java.util.Locale.US
            mf0.C24362h.m61210e(r8, r5)
            java.lang.String r0 = r0.toLowerCase(r8)
            mf0.C24362h.m61210e(r0, r6)
        L_0x0058:
            java.lang.String r8 = "mraid"
            boolean r0 = mf0.C24362h.m61206a(r8, r0)
            if (r0 == 0) goto L_0x0986
            java.lang.String r0 = r4.getHost()
            if (r0 != 0) goto L_0x0068
            r5 = 0
            goto L_0x0075
        L_0x0068:
            java.util.Locale r8 = java.util.Locale.US
            mf0.C24362h.m61210e(r8, r5)
            java.lang.String r0 = r0.toLowerCase(r8)
            mf0.C24362h.m61210e(r0, r6)
            r5 = r0
        L_0x0075:
            java.lang.String r0 = r4.getRawQuery()
            r4 = 6
            r8 = 2
            r9 = 1
            r11 = 0
            if (r0 == 0) goto L_0x0130
            java.lang.String r12 = "&"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            java.util.List r0 = kotlin.text.C24179b.m60577Y(r0, r12, r11, r4)
            java.lang.String[] r12 = new java.lang.String[r11]
            java.lang.Object[] r0 = r0.toArray(r12)
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r0 == 0) goto L_0x012a
            r13 = r0
            java.lang.String[] r13 = (java.lang.String[]) r13
            int r14 = r13.length
            r0 = 0
            r15 = 0
        L_0x0099:
            if (r0 >= r14) goto L_0x0131
            r7 = r13[r0]
            int r16 = r0 + 1
            java.lang.String r0 = "="
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = kotlin.text.C24179b.m60577Y(r7, r0, r11, r4)
            java.lang.String[] r7 = new java.lang.String[r11]
            java.lang.Object[] r0 = r0.toArray(r7)
            if (r0 == 0) goto L_0x0124
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r7 = r0.length
            if (r7 != r8) goto L_0x011e
            r7 = r0[r11]     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            r0 = r0[r9]     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            if (r15 != 0) goto L_0x00cb
            java.util.LinkedHashMap r17 = new java.util.LinkedHashMap     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            r17.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            r15 = r17
        L_0x00cb:
            java.lang.String r4 = "key"
            mf0.C24362h.m61210e(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            java.lang.String r4 = "value"
            mf0.C24362h.m61210e(r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            r15.put(r7, r0)     // Catch:{ UnsupportedEncodingException -> 0x00fc, IllegalArgumentException -> 0x00d9 }
            goto L_0x011e
        L_0x00d9:
            r0 = move-exception
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.String r7 = "IllegalArgumentException while processing MRAID Command from Creative"
            java.lang.StringBuilder r7 = ce0.C21100e.m49315J0(r7)
            java.lang.String r11 = r10.f31313g
            r7.append(r11)
            r7.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = r7.toString()
            r4.mo6667d(r0)
            goto L_0x011e
        L_0x00fc:
            r0 = move-exception
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.String r7 = "UnsupportedEncodingException while processing MRAID Command from Creative"
            java.lang.StringBuilder r7 = ce0.C21100e.m49315J0(r7)
            java.lang.String r11 = r10.f31313g
            r7.append(r11)
            r7.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = r7.toString()
            r4.mo6667d(r0)
        L_0x011e:
            r0 = r16
            r4 = 6
            r11 = 0
            goto L_0x0099
        L_0x0124:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r12)
            throw r0
        L_0x012a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r12)
            throw r0
        L_0x0130:
            r15 = 0
        L_0x0131:
            java.lang.String r0 = "ROOT"
            if (r5 != 0) goto L_0x0137
            r1 = 0
            goto L_0x0143
        L_0x0137:
            java.util.Locale r1 = java.util.Locale.ROOT
            mf0.C24362h.m61210e(r1, r0)
            java.lang.String r1 = r5.toLowerCase(r1)
            mf0.C24362h.m61210e(r1, r6)
        L_0x0143:
            if (r1 == 0) goto L_0x0986
            int r4 = r1.hashCode()
            java.lang.String r5 = "true"
            java.lang.String r7 = "url"
            java.lang.String r12 = "<set-?>"
            java.lang.String r13 = "height"
            java.lang.String r14 = "width"
            r3 = -1
            r11 = 3
            switch(r4) {
                case -1856607801: goto L_0x0899;
                case -1535613269: goto L_0x0878;
                case -1503025504: goto L_0x078e;
                case -1289167206: goto L_0x0704;
                case -1269776086: goto L_0x06e3;
                case -1205414659: goto L_0x06c4;
                case -1146756155: goto L_0x06a3;
                case -934437708: goto L_0x0518;
                case -782972288: goto L_0x04f7;
                case -525954743: goto L_0x03b8;
                case -135748430: goto L_0x0397;
                case 3237136: goto L_0x0369;
                case 3417674: goto L_0x0317;
                case 94756344: goto L_0x02dc;
                case 211626927: goto L_0x0261;
                case 256417649: goto L_0x0240;
                case 450236012: goto L_0x021f;
                case 608220129: goto L_0x01c5;
                case 622447033: goto L_0x019c;
                case 1648753788: goto L_0x017b;
                case 1762302203: goto L_0x015a;
                default: goto L_0x0158;
            }
        L_0x0158:
            goto L_0x0986
        L_0x015a:
            java.lang.String r0 = "advideofirstquartile"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0164
            goto L_0x0986
        L_0x0164:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x0174
            goto L_0x0986
        L_0x0174:
            java.lang.String r1 = r10.f31307a
            r0.mo39569m(r1)
            goto L_0x0986
        L_0x017b:
            java.lang.String r0 = "adclickthru"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0185
            goto L_0x0986
        L_0x0185:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x0195
            goto L_0x0986
        L_0x0195:
            java.lang.String r1 = r10.f31307a
            r0.zzt(r1)
            goto L_0x0986
        L_0x019c:
            java.lang.String r0 = "updatecurrentposition"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01a6
            goto L_0x0986
        L_0x01a6:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            kc0.i r0 = r0.f31513h
            if (r0 != 0) goto L_0x01b0
            goto L_0x0986
        L_0x01b0:
            fc0.a r1 = r0.f31755m
            if (r10 == r1) goto L_0x01ba
            fc0.a r1 = r0.f31763u
            if (r10 == r1) goto L_0x01ba
            goto L_0x0986
        L_0x01ba:
            com.umo.ads.u.zzu r1 = r10.f31314h
            if (r1 != 0) goto L_0x01c0
            goto L_0x0986
        L_0x01c0:
            r0.mo39680d(r10, r1)
            goto L_0x0986
        L_0x01c5:
            java.lang.String r0 = "setorientationproperties"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01cf
            goto L_0x0986
        L_0x01cf:
            if (r15 != 0) goto L_0x01d3
            r7 = 0
            goto L_0x020d
        L_0x01d3:
            java.util.Map r0 = kotlin.collections.C23826d.m58535Z(r15)
            fc0.c r7 = new fc0.c
            r7.<init>()
            java.lang.String r1 = "allowOrientationChange"
            java.lang.Object r1 = r0.get(r1)
            boolean r1 = mf0.C24362h.m61206a(r5, r1)
            r7.f31319a = r1
            java.lang.String r1 = "forceOrientation"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "portrait"
            boolean r1 = mf0.C24362h.m61206a(r0, r1)
            if (r1 == 0) goto L_0x01fb
            com.umo.ads.u.zzp r0 = com.umo.ads.p350u.zzp.PORTRAIT
            goto L_0x0208
        L_0x01fb:
            java.lang.String r1 = "landscape"
            boolean r0 = mf0.C24362h.m61206a(r0, r1)
            if (r0 == 0) goto L_0x0206
            com.umo.ads.u.zzp r0 = com.umo.ads.p350u.zzp.LANDSCAPE
            goto L_0x0208
        L_0x0206:
            com.umo.ads.u.zzp r0 = com.umo.ads.p350u.zzp.NONE
        L_0x0208:
            mf0.C24362h.m61211f(r0, r12)
            r7.f31320b = r0
        L_0x020d:
            if (r7 != 0) goto L_0x0214
            fc0.c r7 = new fc0.c
            r7.<init>()
        L_0x0214:
            r10.f31312f = r7
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            r0.mo39555G(r10)
            goto L_0x0986
        L_0x021f:
            java.lang.String r0 = "adimpression"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0229
            goto L_0x0986
        L_0x0229:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x0239
            goto L_0x0986
        L_0x0239:
            java.lang.String r1 = r10.f31307a
            r0.mo39580x(r1)
            goto L_0x0986
        L_0x0240:
            java.lang.String r0 = "advideocomplete"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x024a
            goto L_0x0986
        L_0x024a:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x025a
            goto L_0x0986
        L_0x025a:
            java.lang.String r1 = r10.f31307a
            r0.zzy(r1)
            goto L_0x0986
        L_0x0261:
            java.lang.String r0 = "setexpandproperties"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x026b
            goto L_0x0986
        L_0x026b:
            if (r15 != 0) goto L_0x026f
            r7 = 0
            goto L_0x02ca
        L_0x026f:
            java.util.Map r0 = kotlin.collections.C23826d.m58535Z(r15)
            fc0.b r7 = new fc0.b
            r7.<init>()
            java.lang.Object r1 = r0.get(r14)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0281
            goto L_0x029b
        L_0x0281:
            java.lang.Integer r2 = uh0.C25080g.m62829y(r1)
            if (r2 != 0) goto L_0x0295
            java.lang.Float r1 = uh0.C25080g.m62828x(r1)
            if (r1 != 0) goto L_0x028f
            r1 = 0
            goto L_0x0299
        L_0x028f:
            float r1 = r1.floatValue()
            int r1 = (int) r1
            goto L_0x0299
        L_0x0295:
            int r1 = r2.intValue()
        L_0x0299:
            r7.f31316a = r1
        L_0x029b:
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x02a4
            goto L_0x02be
        L_0x02a4:
            java.lang.Integer r2 = uh0.C25080g.m62829y(r1)
            if (r2 != 0) goto L_0x02b8
            java.lang.Float r1 = uh0.C25080g.m62828x(r1)
            if (r1 != 0) goto L_0x02b2
            r11 = 0
            goto L_0x02bc
        L_0x02b2:
            float r1 = r1.floatValue()
            int r11 = (int) r1
            goto L_0x02bc
        L_0x02b8:
            int r11 = r2.intValue()
        L_0x02bc:
            r7.f31317b = r11
        L_0x02be:
            java.lang.String r1 = "useCustomClose"
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = mf0.C24362h.m61206a(r5, r0)
            r7.f31318c = r0
        L_0x02ca:
            if (r7 != 0) goto L_0x02d1
            fc0.b r7 = new fc0.b
            r7.<init>()
        L_0x02d1:
            r10.f31310d = r7
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            r0.mo39561e(r10)
            goto L_0x0986
        L_0x02dc:
            java.lang.String r0 = "close"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02e6
            goto L_0x0986
        L_0x02e6:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            kc0.i r0 = r0.f31513h
            if (r0 != 0) goto L_0x02f0
            goto L_0x0986
        L_0x02f0:
            fc0.a r1 = r0.f31755m
            if (r10 == r1) goto L_0x02fa
            fc0.a r1 = r0.f31763u
            if (r10 == r1) goto L_0x02fa
            goto L_0x0986
        L_0x02fa:
            boolean r1 = r0.mo39694o()
            if (r1 == 0) goto L_0x0312
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity> r1 = com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity.f7313G
            if (r1 == 0) goto L_0x0306
            r11 = 1
            goto L_0x0307
        L_0x0306:
            r11 = 0
        L_0x0307:
            if (r11 == 0) goto L_0x030d
            r0.f31752j = r9
            goto L_0x0986
        L_0x030d:
            r0.mo39691j()
            goto L_0x0986
        L_0x0312:
            r0.mo39679b(r10)
            goto L_0x0986
        L_0x0317:
            java.lang.String r0 = "open"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0321
            goto L_0x0986
        L_0x0321:
            fc0.a$a r0 = r10.f31309c
            if (r15 != 0) goto L_0x0327
            r7 = 0
            goto L_0x032e
        L_0x0327:
            java.lang.Object r1 = r15.get(r7)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
        L_0x032e:
            hc0.b r0 = (hc0.C12753b) r0
            kc0.i r0 = r0.f31513h
            if (r0 != 0) goto L_0x0336
            goto L_0x0986
        L_0x0336:
            fc0.a r1 = r0.f31755m
            if (r10 == r1) goto L_0x0340
            fc0.a r1 = r0.f31763u
            if (r10 == r1) goto L_0x0340
            goto L_0x0986
        L_0x0340:
            boolean r1 = nc0.C12954d.m32800c(r7)
            if (r1 != 0) goto L_0x0348
            goto L_0x0986
        L_0x0348:
            boolean r1 = nc0.C12954d.m32800c(r7)
            if (r1 != 0) goto L_0x034f
            goto L_0x035c
        L_0x034f:
            boolean r1 = android.webkit.URLUtil.isHttpUrl(r7)
            if (r1 != 0) goto L_0x035e
            boolean r1 = android.webkit.URLUtil.isHttpsUrl(r7)
            if (r1 == 0) goto L_0x035c
            goto L_0x035e
        L_0x035c:
            r11 = 0
            goto L_0x035f
        L_0x035e:
            r11 = 1
        L_0x035f:
            r1 = r11 ^ 1
            mf0.C24362h.m61208c(r7)
            r0.mo39682f(r7, r1, r9)
            goto L_0x0986
        L_0x0369:
            java.lang.String r0 = "init"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0373
            goto L_0x0986
        L_0x0373:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            kc0.i r0 = r0.f31513h
            if (r0 != 0) goto L_0x037d
            goto L_0x0986
        L_0x037d:
            fc0.a r1 = r0.f31755m
            if (r10 == r1) goto L_0x0387
            fc0.a r2 = r0.f31763u
            if (r10 == r2) goto L_0x0387
            goto L_0x0986
        L_0x0387:
            if (r10 != r1) goto L_0x038c
            r0.f31756n = r9
            goto L_0x0392
        L_0x038c:
            fc0.a r1 = r0.f31763u
            if (r10 != r1) goto L_0x0392
            r0.f31764v = r9
        L_0x0392:
            r0.mo39689h(r10)
            goto L_0x0986
        L_0x0397:
            java.lang.String r0 = "advideothirdquartile"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x03a1
            goto L_0x0986
        L_0x03a1:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x03b1
            goto L_0x0986
        L_0x03b1:
            java.lang.String r1 = r10.f31307a
            r0.zzg(r1)
            goto L_0x0986
        L_0x03b8:
            java.lang.String r2 = "setresizeproperties"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03c2
            goto L_0x0986
        L_0x03c2:
            if (r15 != 0) goto L_0x03c7
            r7 = 0
            goto L_0x04e7
        L_0x03c7:
            java.util.Map r1 = kotlin.collections.C23826d.m58535Z(r15)
            fc0.d r7 = new fc0.d
            r7.<init>()
            java.lang.Object r2 = r1.get(r14)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x03d9
            goto L_0x03f3
        L_0x03d9:
            java.lang.Integer r3 = uh0.C25080g.m62829y(r2)
            if (r3 != 0) goto L_0x03ed
            java.lang.Float r2 = uh0.C25080g.m62828x(r2)
            if (r2 != 0) goto L_0x03e7
            r2 = 0
            goto L_0x03f1
        L_0x03e7:
            float r2 = r2.floatValue()
            int r2 = (int) r2
            goto L_0x03f1
        L_0x03ed:
            int r2 = r3.intValue()
        L_0x03f1:
            r7.f31321a = r2
        L_0x03f3:
            java.lang.Object r2 = r1.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x03fc
            goto L_0x0416
        L_0x03fc:
            java.lang.Integer r3 = uh0.C25080g.m62829y(r2)
            if (r3 != 0) goto L_0x0410
            java.lang.Float r2 = uh0.C25080g.m62828x(r2)
            if (r2 != 0) goto L_0x040a
            r2 = 0
            goto L_0x0414
        L_0x040a:
            float r2 = r2.floatValue()
            int r2 = (int) r2
            goto L_0x0414
        L_0x0410:
            int r2 = r3.intValue()
        L_0x0414:
            r7.f31322b = r2
        L_0x0416:
            java.lang.String r2 = "offsetX"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0421
            goto L_0x043b
        L_0x0421:
            java.lang.Integer r3 = uh0.C25080g.m62829y(r2)
            if (r3 != 0) goto L_0x0435
            java.lang.Float r2 = uh0.C25080g.m62828x(r2)
            if (r2 != 0) goto L_0x042f
            r2 = 0
            goto L_0x0439
        L_0x042f:
            float r2 = r2.floatValue()
            int r2 = (int) r2
            goto L_0x0439
        L_0x0435:
            int r2 = r3.intValue()
        L_0x0439:
            r7.f31324d = r2
        L_0x043b:
            java.lang.String r2 = "offsetY"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0446
            goto L_0x0460
        L_0x0446:
            java.lang.Integer r3 = uh0.C25080g.m62829y(r2)
            if (r3 != 0) goto L_0x045a
            java.lang.Float r2 = uh0.C25080g.m62828x(r2)
            if (r2 != 0) goto L_0x0454
            r11 = 0
            goto L_0x045e
        L_0x0454:
            float r2 = r2.floatValue()
            int r11 = (int) r2
            goto L_0x045e
        L_0x045a:
            int r11 = r3.intValue()
        L_0x045e:
            r7.f31325e = r11
        L_0x0460:
            java.lang.String r2 = "allowOffscreen"
            java.lang.Object r2 = r1.get(r2)
            boolean r2 = mf0.C24362h.m61206a(r5, r2)
            r7.f31326f = r2
            java.lang.String r2 = "customClosePosition"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0478
            goto L_0x04e7
        L_0x0478:
            java.util.Locale r2 = java.util.Locale.ROOT
            mf0.C24362h.m61210e(r2, r0)
            java.lang.String r0 = r1.toLowerCase(r2)
            mf0.C24362h.m61210e(r0, r6)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1364013995: goto L_0x04d4;
                case -1314880604: goto L_0x04c8;
                case -1012429441: goto L_0x04bc;
                case -655373719: goto L_0x04b0;
                case 1163912186: goto L_0x04a4;
                case 1288627767: goto L_0x0498;
                case 1755462605: goto L_0x048c;
                default: goto L_0x048b;
            }
        L_0x048b:
            goto L_0x04e0
        L_0x048c:
            java.lang.String r1 = "top-center"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0495
            goto L_0x04e0
        L_0x0495:
            com.umo.ads.u.zzm r0 = com.umo.ads.p350u.zzm.TOPCENTER
            goto L_0x04e2
        L_0x0498:
            java.lang.String r1 = "bottom-center"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04a1
            goto L_0x04e0
        L_0x04a1:
            com.umo.ads.u.zzm r0 = com.umo.ads.p350u.zzm.BOTTOMCENTER
            goto L_0x04e2
        L_0x04a4:
            java.lang.String r1 = "bottom-right"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ad
            goto L_0x04e0
        L_0x04ad:
            com.umo.ads.u.zzm r0 = com.umo.ads.p350u.zzm.BOTTOMRIGHT
            goto L_0x04e2
        L_0x04b0:
            java.lang.String r1 = "bottom-left"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b9
            goto L_0x04e0
        L_0x04b9:
            com.umo.ads.u.zzm r0 = com.umo.ads.p350u.zzm.BOTTOMLEFT
            goto L_0x04e2
        L_0x04bc:
            java.lang.String r1 = "top-left"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04c5
            goto L_0x04e0
        L_0x04c5:
            com.umo.ads.u.zzm r0 = com.umo.ads.p350u.zzm.TOPLEFT
            goto L_0x04e2
        L_0x04c8:
            java.lang.String r1 = "top-right"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d1
            goto L_0x04e0
        L_0x04d1:
            com.umo.ads.u.zzm r0 = com.umo.ads.p350u.zzm.TOPRIGHT
            goto L_0x04e2
        L_0x04d4:
            java.lang.String r1 = "center"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04dd
            goto L_0x04e0
        L_0x04dd:
            com.umo.ads.u.zzm r0 = com.umo.ads.p350u.zzm.CENTER
            goto L_0x04e2
        L_0x04e0:
            com.umo.ads.u.zzm r0 = com.umo.ads.p350u.zzm.TOPRIGHT
        L_0x04e2:
            mf0.C24362h.m61211f(r0, r12)
            r7.f31323c = r0
        L_0x04e7:
            if (r7 != 0) goto L_0x04ee
            fc0.d r7 = new fc0.d
            r7.<init>()
        L_0x04ee:
            r10.f31311e = r7
            fc0.a$a r0 = r10.f31309c
            r0.getClass()
            goto L_0x0986
        L_0x04f7:
            java.lang.String r0 = "advideomidpoint"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0501
            goto L_0x0986
        L_0x0501:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x0511
            goto L_0x0986
        L_0x0511:
            java.lang.String r1 = r10.f31307a
            r0.mo39581y(r1)
            goto L_0x0986
        L_0x0518:
            java.lang.String r0 = "resize"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0522
            goto L_0x0986
        L_0x0522:
            fc0.a$a r1 = r10.f31309c
            hc0.b r1 = (hc0.C12753b) r1
            kc0.i r2 = r1.f31513h
            if (r2 != 0) goto L_0x052c
            goto L_0x0986
        L_0x052c:
            fc0.a r1 = r2.f31755m
            if (r10 == r1) goto L_0x0536
            fc0.a r1 = r2.f31763u
            if (r10 == r1) goto L_0x0536
            goto L_0x0986
        L_0x0536:
            boolean r1 = r2.mo39694o()
            if (r1 == 0) goto L_0x0543
            java.lang.String r1 = "Cannot resize with placementType interstitial."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x0543:
            com.umo.ads.u.zzu r1 = r10.f31314h
            if (r1 != 0) goto L_0x0549
            r1 = -1
            goto L_0x0551
        L_0x0549:
            int[] r4 = kc0.C12844i.C12847c.f31770a
            int r1 = r1.ordinal()
            r1 = r4[r1]
        L_0x0551:
            if (r1 == r3) goto L_0x069c
            if (r1 == r9) goto L_0x069c
            if (r1 == r11) goto L_0x069c
            r3 = 5
            if (r1 == r3) goto L_0x069c
            android.content.Context r1 = r2.getContext()
            android.util.DisplayMetrics r1 = nc0.C12952c.m32793c(r1)
            int r4 = r1.widthPixels
            int r4 = nc0.C12952c.m32796f(r4)
            int r1 = r1.heightPixels
            int r1 = nc0.C12952c.m32796f(r1)
            int[] r5 = new int[r8]
            r2.getLocationOnScreen(r5)
            r6 = 0
            r7 = r5[r6]
            int r6 = nc0.C12952c.m32796f(r7)
            r5 = r5[r9]
            int r5 = nc0.C12952c.m32796f(r5)
            fc0.d r7 = r10.f31311e
            if (r7 == 0) goto L_0x0695
            boolean r8 = r7.f31326f
            int r12 = r7.f31324d
            int r6 = r6 + r12
            int r12 = r7.f31325e
            int r5 = r5 + r12
            int r12 = r7.f31321a
            int r13 = r7.f31322b
            com.umo.ads.u.zzm r7 = r7.f31323c
            if (r12 < r4) goto L_0x059d
            if (r13 < r1) goto L_0x059d
            java.lang.String r1 = "Size must be smaller than the max size."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x059d:
            r14 = 40
            if (r12 < r14) goto L_0x068e
            if (r13 >= r14) goto L_0x05a5
            goto L_0x068e
        L_0x05a5:
            android.view.View r14 = r2.getRootView()
            if (r14 == 0) goto L_0x05d9
            android.content.res.Resources r15 = r14.getResources()
            java.lang.String r3 = "status_bar_height"
            java.lang.String r11 = "dimen"
            java.lang.String r9 = "android"
            int r3 = r15.getIdentifier(r3, r11, r9)
            if (r3 <= 0) goto L_0x05d9
            android.content.res.Resources r9 = r14.getResources()
            int r3 = r9.getDimensionPixelSize(r3)
            android.content.res.Resources r9 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            java.lang.String r11 = "getSystem().displayMetrics"
            mf0.C24362h.m61210e(r9, r11)
            float r3 = (float) r3
            float r9 = r9.density
            float r3 = r3 / r9
            r9 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r9
            int r3 = (int) r3
            goto L_0x05db
        L_0x05d9:
            r3 = 25
        L_0x05db:
            if (r8 != 0) goto L_0x0615
            if (r12 <= r4) goto L_0x05e0
            r12 = r4
        L_0x05e0:
            if (r13 <= r1) goto L_0x05e3
            r13 = r1
        L_0x05e3:
            if (r6 >= 0) goto L_0x05e7
            r8 = 0
            goto L_0x05f3
        L_0x05e7:
            int r8 = r6 + r12
            if (r8 <= r4) goto L_0x05f2
            double r8 = (double) r8
            double r14 = (double) r4
            double r8 = r8 - r14
            int r8 = (int) r8
            int r8 = r6 - r8
            goto L_0x05f3
        L_0x05f2:
            r8 = r6
        L_0x05f3:
            if (r5 >= r3) goto L_0x05f9
            r9 = r3
            r19 = r12
            goto L_0x0609
        L_0x05f9:
            int r9 = r5 + r13
            if (r9 <= r1) goto L_0x0606
            double r14 = (double) r9
            r19 = r12
            double r11 = (double) r1
            double r14 = r14 - r11
            int r9 = (int) r14
            int r9 = r5 - r9
            goto L_0x0609
        L_0x0606:
            r19 = r12
            r9 = r5
        L_0x0609:
            double r11 = (double) r6
            double r14 = (double) r8
            double r11 = r11 - r14
            double r14 = (double) r5
            double r8 = (double) r9
            double r14 = r14 - r8
            int r8 = (int) r11
            int r6 = r6 - r8
            int r8 = (int) r14
            int r5 = r5 - r8
            r12 = r19
        L_0x0615:
            int r8 = r12 + -40
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x064c
            r9 = 1
            if (r7 == r9) goto L_0x0645
            r9 = 3
            if (r7 == r9) goto L_0x063c
            r9 = 4
            if (r7 == r9) goto L_0x0639
            r9 = 5
            if (r7 == r9) goto L_0x0632
            r9 = 6
            if (r7 == r9) goto L_0x062d
            goto L_0x0649
        L_0x062d:
            int r11 = r13 + -40
            r7 = r11
            r11 = r8
            goto L_0x064e
        L_0x0632:
            int r7 = r12 / 2
            int r11 = r7 + -20
            int r7 = r13 + -40
            goto L_0x064e
        L_0x0639:
            int r7 = r13 + -40
            goto L_0x064d
        L_0x063c:
            int r7 = r12 / 2
            int r11 = r7 + -20
            int r7 = r13 / 2
            int r7 = r7 + -20
            goto L_0x064e
        L_0x0645:
            int r7 = r12 / 2
            int r8 = r7 + -20
        L_0x0649:
            r11 = r8
            r7 = 0
            goto L_0x064e
        L_0x064c:
            r7 = 0
        L_0x064d:
            r11 = 0
        L_0x064e:
            int r11 = r11 + r6
            int r7 = r7 + r5
            int r8 = r11 + 40
            int r9 = r7 + 40
            if (r11 < 0) goto L_0x0687
            if (r7 < r3) goto L_0x0687
            if (r8 > r4) goto L_0x0687
            if (r9 <= r1) goto L_0x065d
            goto L_0x0687
        L_0x065d:
            int r0 = nc0.C12952c.m32791a(r6)
            int r6 = nc0.C12952c.m32791a(r5)
            int r3 = nc0.C12952c.m32791a(r12)
            int r4 = nc0.C12952c.m32791a(r13)
            int r8 = nc0.C12952c.m32791a(r11)
            int r9 = nc0.C12952c.m32791a(r7)
            android.os.Handler r11 = wb0.C13233c.f32843b
            kc0.g r12 = new kc0.g
            r1 = r12
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.post(r12)
            goto L_0x0986
        L_0x0687:
            java.lang.String r1 = "Resize close control must remain on screen."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x068e:
            java.lang.String r1 = "Size must be at least the minimum close area size."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x0695:
            java.lang.String r0 = "resizeProps"
            mf0.C24362h.m61217l(r0)
            r4 = 0
            throw r4
        L_0x069c:
            java.lang.String r1 = "Cannot resize loading, hidden or expanded."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x06a3:
            java.lang.String r0 = "aderror"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x06ad
            goto L_0x0986
        L_0x06ad:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x06bd
            goto L_0x0986
        L_0x06bd:
            java.lang.String r1 = r10.f31307a
            r0.zzp(r1)
            goto L_0x0986
        L_0x06c4:
            r4 = 0
            java.lang.String r0 = "storepicture"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x06cf
            goto L_0x0986
        L_0x06cf:
            fc0.a$a r0 = r10.f31309c
            if (r15 != 0) goto L_0x06d5
            r7 = r4
            goto L_0x06dc
        L_0x06d5:
            java.lang.Object r1 = r15.get(r7)
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
        L_0x06dc:
            hc0.b r0 = (hc0.C12753b) r0
            r0.mo39551C(r10, r7)
            goto L_0x0986
        L_0x06e3:
            java.lang.String r0 = "advideostart"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x06ed
            goto L_0x0986
        L_0x06ed:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x06fd
            goto L_0x0986
        L_0x06fd:
            java.lang.String r1 = r10.f31307a
            r0.mo39562f(r1)
            goto L_0x0986
        L_0x0704:
            r4 = 0
            java.lang.String r0 = "expand"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x070f
            goto L_0x0986
        L_0x070f:
            fc0.a$a r1 = r10.f31309c
            if (r15 != 0) goto L_0x0715
            r7 = r4
            goto L_0x071c
        L_0x0715:
            java.lang.Object r2 = r15.get(r7)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
        L_0x071c:
            hc0.b r1 = (hc0.C12753b) r1
            kc0.i r1 = r1.f31513h
            if (r1 != 0) goto L_0x0724
            goto L_0x0986
        L_0x0724:
            fc0.a r2 = r1.f31755m
            if (r10 == r2) goto L_0x072e
            fc0.a r2 = r1.f31763u
            if (r10 == r2) goto L_0x072e
            goto L_0x0986
        L_0x072e:
            boolean r2 = r1.mo39694o()
            if (r2 == 0) goto L_0x073b
            java.lang.String r1 = "Cannot expand with placementType interstitial."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x073b:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r4 = 1
            r2 = r2 ^ r4
            com.umo.ads.u.zzu r5 = r10.f31314h
            if (r5 != 0) goto L_0x0746
            goto L_0x074e
        L_0x0746:
            int[] r3 = kc0.C12844i.C12847c.f31770a
            int r5 = r5.ordinal()
            r3 = r3[r5]
        L_0x074e:
            if (r3 == r4) goto L_0x0787
            if (r3 == r8) goto L_0x0769
            r4 = 3
            if (r3 == r4) goto L_0x075a
            r4 = 4
            if (r3 == r4) goto L_0x0769
            goto L_0x0986
        L_0x075a:
            boolean r1 = r1.f31762t
            if (r1 == 0) goto L_0x0762
            if (r2 != 0) goto L_0x0762
            goto L_0x0986
        L_0x0762:
            java.lang.String r1 = "Cannot expand while state is loading."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x0769:
            if (r2 != 0) goto L_0x0779
            android.os.Handler r0 = wb0.C13233c.f32843b
            x.o r2 = new x.o
            r3 = 19
            r2.<init>(r1, r3)
            r0.post(r2)
            goto L_0x0986
        L_0x0779:
            android.os.Handler r0 = wb0.C13233c.f32843b
            x.p r2 = new x.p
            r3 = 12
            r2.<init>(r3, r1, r7)
            r0.post(r2)
            goto L_0x0986
        L_0x0787:
            java.lang.String r1 = "Cannot expand while state is expanded."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x078e:
            r4 = 0
            java.lang.String r0 = "createcalendarevent"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0799
            goto L_0x0986
        L_0x0799:
            fc0.a$a r1 = r10.f31309c
            if (r15 != 0) goto L_0x079f
            r2 = r4
            goto L_0x07a7
        L_0x079f:
            java.lang.String r2 = "event"
            java.lang.Object r2 = r15.get(r2)
            java.lang.String r2 = (java.lang.String) r2
        L_0x07a7:
            hc0.b r1 = (hc0.C12753b) r1
            kc0.i r1 = r1.f31513h
            if (r1 != 0) goto L_0x07af
            goto L_0x0986
        L_0x07af:
            java.lang.String r3 = "location"
            java.lang.String r5 = "summary"
            java.lang.String r6 = "end"
            java.lang.String r7 = "start"
            java.lang.String r8 = "description"
            fc0.a r9 = r1.f31755m
            if (r10 == r9) goto L_0x07c3
            fc0.a r9 = r1.f31763u
            if (r10 == r9) goto L_0x07c3
            goto L_0x0986
        L_0x07c3:
            boolean r9 = nc0.C12954d.m32800c(r2)
            if (r9 != 0) goto L_0x07cb
            goto L_0x0986
        L_0x07cb:
            kc0.i$b r9 = r1.f31745c
            if (r9 != 0) goto L_0x07d0
            goto L_0x07d7
        L_0x07d0:
            java.lang.String r9 = r1.f31744b
            java.lang.String r11 = "spotId"
            mf0.C24362h.m61211f(r9, r11)
        L_0x07d7:
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.lang.String r11 = "yyyy-MM-dd'T'HH:mmZ"
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            r9.<init>(r11, r12)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            mf0.C24362h.m61208c(r2)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            r11.<init>(r2)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.lang.String r12 = "android.intent.action.EDIT"
            r2.<init>(r12)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.lang.String r12 = "vnd.android.cursor.item/event"
            r2.setType(r12)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            boolean r12 = r11.has(r7)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            if (r12 == 0) goto L_0x0813
            java.lang.String r7 = r11.getString(r7)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.util.Date r7 = r9.parse(r7)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            if (r7 != 0) goto L_0x0806
            r7 = r4
            goto L_0x080e
        L_0x0806:
            long r12 = r7.getTime()     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
        L_0x080e:
            java.lang.String r12 = "beginTime"
            r2.putExtra(r12, r7)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
        L_0x0813:
            boolean r7 = r11.has(r6)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            if (r7 == 0) goto L_0x0832
            java.lang.String r6 = r11.getString(r6)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.util.Date r6 = r9.parse(r6)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            if (r6 != 0) goto L_0x0825
            r7 = r4
            goto L_0x082d
        L_0x0825:
            long r6 = r6.getTime()     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.lang.Long r7 = java.lang.Long.valueOf(r6)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
        L_0x082d:
            java.lang.String r4 = "endTime"
            r2.putExtra(r4, r7)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
        L_0x0832:
            boolean r4 = r11.has(r8)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            if (r4 == 0) goto L_0x0841
            java.lang.String r4 = r11.getString(r8)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.lang.String r6 = "title"
            r2.putExtra(r6, r4)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
        L_0x0841:
            boolean r4 = r11.has(r5)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            if (r4 == 0) goto L_0x084e
            java.lang.String r4 = r11.getString(r5)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            r2.putExtra(r8, r4)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
        L_0x084e:
            boolean r4 = r11.has(r3)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            if (r4 == 0) goto L_0x085d
            java.lang.String r3 = r11.getString(r3)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            java.lang.String r4 = "eventLocation"
            r2.putExtra(r4, r3)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
        L_0x085d:
            android.os.Handler r3 = wb0.C13233c.f32843b     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            d0.f0 r4 = new d0.f0     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            r5 = 7
            r4.<init>(r5, r1, r2)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            r3.post(r4)     // Catch:{ ParseException -> 0x0871, JSONException -> 0x086a }
            goto L_0x0986
        L_0x086a:
            java.lang.String r1 = "JSONException while parsing calendar event data."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x0871:
            java.lang.String r1 = "ParseException while parsing calendar event data."
            r10.mo39457d(r1, r0)
            goto L_0x0986
        L_0x0878:
            java.lang.String r0 = "adplaying"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0882
            goto L_0x0986
        L_0x0882:
            fc0.a$a r0 = r10.f31309c
            hc0.b r0 = (hc0.C12753b) r0
            boolean r1 = r0.mo39554F()
            if (r1 == 0) goto L_0x0986
            vb0.e r0 = r0.f31509d
            if (r0 != 0) goto L_0x0892
            goto L_0x0986
        L_0x0892:
            java.lang.String r1 = r10.f31307a
            r0.zzh(r1)
            goto L_0x0986
        L_0x0899:
            r4 = 0
            java.lang.String r0 = "playvideo"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x08a4
            goto L_0x0986
        L_0x08a4:
            fc0.a$a r0 = r10.f31309c
            if (r15 != 0) goto L_0x08aa
            r1 = r4
            goto L_0x08b0
        L_0x08aa:
            java.lang.Object r1 = r15.get(r7)
            java.lang.String r1 = (java.lang.String) r1
        L_0x08b0:
            hc0.b r0 = (hc0.C12753b) r0
            kc0.i r3 = r0.f31513h
            if (r3 != 0) goto L_0x08b8
            goto L_0x0986
        L_0x08b8:
            fc0.a r0 = r3.f31755m
            if (r10 == r0) goto L_0x08c2
            fc0.a r0 = r3.f31763u
            if (r10 == r0) goto L_0x08c2
            goto L_0x0986
        L_0x08c2:
            kc0.i$b r0 = r3.f31745c
            if (r0 != 0) goto L_0x08c7
            goto L_0x08d4
        L_0x08c7:
            java.lang.String r5 = r3.f31744b
            hc0.b r0 = (hc0.C12753b) r0
            boolean r0 = r0.zze(r5, r1)
            r5 = 1
            if (r0 != r5) goto L_0x08d4
            r6 = 1
            goto L_0x08d5
        L_0x08d4:
            r6 = 0
        L_0x08d5:
            if (r6 == 0) goto L_0x08d9
            goto L_0x0986
        L_0x08d9:
            if (r1 != 0) goto L_0x08de
            r7 = r4
            goto L_0x097d
        L_0x08de:
            com.umo.ads.u.zzd r0 = com.umo.ads.p350u.zzd.MRAID_AD_PLAYVIDEO_TEMPLATE
            java.lang.String r5 = "templateName"
            mf0.C24362h.m61211f(r0, r5)
            j$.util.concurrent.ConcurrentHashMap r0 = p389bl.C13637c.f33649p
            if (r0 != 0) goto L_0x08eb
            r0 = r4
            goto L_0x08f3
        L_0x08eb:
            java.lang.String r5 = "MRAID_AD_PLAYVIDEO_TEMPLATE"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
        L_0x08f3:
            boolean r5 = nc0.C12954d.m32800c(r0)
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x08ff
            mf0.C24362h.m61208c(r0)
            goto L_0x0900
        L_0x08ff:
            r0 = r6
        L_0x0900:
            java.lang.String r5 = r3.f31744b
            boolean r7 = nc0.C12954d.m32800c(r5)
            if (r7 == 0) goto L_0x090c
            java.lang.String r6 = p584jl.C17885a.m44403H0(r5)
        L_0x090c:
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ IllegalFormatException -> 0x093f }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ IllegalFormatException -> 0x093f }
            r9 = 0
            r7[r9] = r1     // Catch:{ IllegalFormatException -> 0x093f }
            r9 = 1
            r7[r9] = r1     // Catch:{ IllegalFormatException -> 0x093f }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r8)     // Catch:{ IllegalFormatException -> 0x093f }
            java.lang.String r0 = java.lang.String.format(r5, r0, r1)     // Catch:{ IllegalFormatException -> 0x093f }
            java.lang.String r1 = "format(locale, this, *args)"
            mf0.C24362h.m61210e(r0, r1)     // Catch:{ IllegalFormatException -> 0x093f }
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a     // Catch:{ IllegalFormatException -> 0x093f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalFormatException -> 0x093f }
            r5.<init>()     // Catch:{ IllegalFormatException -> 0x093f }
            java.lang.String r7 = "MRAID PlayVideo Content: [ "
            r5.append(r7)     // Catch:{ IllegalFormatException -> 0x093f }
            r5.append(r0)     // Catch:{ IllegalFormatException -> 0x093f }
            java.lang.String r7 = " ]"
            r5.append(r7)     // Catch:{ IllegalFormatException -> 0x093f }
            java.lang.String r5 = r5.toString()     // Catch:{ IllegalFormatException -> 0x093f }
            r1.mo6672i(r5)     // Catch:{ IllegalFormatException -> 0x093f }
            goto L_0x095c
        L_0x093f:
            r0 = move-exception
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r5 = "IllegalFormatException while templatizing the MRAID Play Video Content"
            java.lang.StringBuilder r2 = p583jk.C17884p.m44363d0(r5, r6, r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.append(r0)
            r5 = 41
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r1.mo6667d(r0)
            r0 = r4
        L_0x095c:
            if (r0 != 0) goto L_0x0960
            r7 = r4
            goto L_0x0972
        L_0x0960:
            android.os.Handler r1 = wb0.C13233c.f32843b
            y.n r2 = new y.n
            r4 = 16
            r2.<init>(r4, r3, r0)
            boolean r0 = r1.post(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7 = r0
        L_0x0972:
            if (r7 != 0) goto L_0x097d
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Error templatizing MRAID PlayVideo Content"
            r0.mo6667d(r1)
            bf0.d r7 = bf0.C21050d.f52856a
        L_0x097d:
            if (r7 != 0) goto L_0x0986
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Invaid MRAID PlayVideo Url"
            r0.mo6667d(r1)
        L_0x0986:
            return
        L_0x0987:
            r0 = move-exception
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r3 = "URISyntaxException while processing MRAID Command from Creative"
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            java.lang.String r4 = r10.f31313g
            r3.append(r4)
            r3.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            r2 = 41
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r1.mo6667d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fc0.C12669a.JSToNativeHandler(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo39454a(int i, boolean z) {
        int i2;
        String str = null;
        if (i == 0) {
            i2 = -1;
        } else {
            int[] iArr = C12671b.f31315a;
            if (i != 0) {
                i2 = iArr[i - 1];
            } else {
                throw null;
            }
        }
        if (i2 == 1) {
            str = "sms";
        } else if (i2 == 2) {
            str = "tel";
        } else if (i2 == 3) {
            str = "calendar";
        } else if (i2 == 4) {
            str = "storePicture";
        } else if (i2 == 5) {
            str = "inlineVideo";
        }
        if (str != null) {
            mo39456c("mraid.setSupports('" + str + "', '" + z + "');");
        }
    }

    /* renamed from: b */
    public final void mo39455b(zzu zzu) {
        String str;
        C24362h.m61211f(zzu, "state");
        this.f31314h = zzu;
        int ordinal = zzu.ordinal();
        if (ordinal == 0) {
            str = "loading";
        } else if (ordinal == 1) {
            str = "default";
        } else if (ordinal == 2) {
            str = "expanded";
        } else if (ordinal == 3) {
            str = "resized";
        } else if (ordinal == 4) {
            str = "hidden";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mo39456c("mraid.setState('" + str + "');");
    }

    /* renamed from: c */
    public final void mo39456c(String str) {
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("MRAID_BRIDGE: Native->Web");
        J0.append(this.f31313g);
        J0.append(": ");
        J0.append(str);
        logger.mo6672i(J0.toString());
        C12675e eVar = this.f31308b;
        eVar.getClass();
        C24362h.m61211f(str, "script");
        C13233c.f32843b.post(new C7109v(14, str, eVar));
    }

    /* renamed from: d */
    public final void mo39457d(String str, String str2) {
        C24362h.m61211f(str, InAppMessageBase.MESSAGE);
        mo39456c("mraid.fireErrorEvent('" + str + "', '" + str2 + "');");
    }
}
