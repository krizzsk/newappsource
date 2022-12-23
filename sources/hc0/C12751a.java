package hc0;

import ac0.C7557a;
import android.content.Context;
import android.view.ViewGroup;
import ce0.C21100e;
import com.cubic.umo.p045ad.types.AKBannerResponse;
import com.umo.ads.p347l.zzd;
import com.umo.ads.p350u.zzc;
import com.umo.ads.p350u.zzk;
import kc0.C12836b;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import vb0.C13197a;
import vb0.C13199c;
import wb0.C13233c;

/* renamed from: hc0.a */
public final class C12751a implements C12836b.C12837a {

    /* renamed from: a */
    public final String f31496a;

    /* renamed from: b */
    public final AKBannerResponse f31497b;

    /* renamed from: c */
    public final C12752a f31498c;

    /* renamed from: d */
    public C13197a f31499d;

    /* renamed from: e */
    public C13199c f31500e;

    /* renamed from: f */
    public C12836b f31501f;

    /* renamed from: g */
    public String f31502g;

    /* renamed from: h */
    public String f31503h;

    /* renamed from: i */
    public String f31504i;

    /* renamed from: j */
    public boolean f31505j;

    /* renamed from: k */
    public String f31506k;

    /* renamed from: hc0.a$a */
    public interface C12752a {
    }

    public C12751a(String str, AKBannerResponse aKBannerResponse, C12752a aVar) {
        C24362h.m61211f(str, "spotId");
        this.f31496a = str;
        this.f31497b = aKBannerResponse;
        this.f31498c = aVar;
        String str2 = "";
        this.f31502g = str2;
        this.f31503h = str2;
        this.f31504i = str2;
        this.f31506k = C12954d.m32800c(str) ? C17885a.m44403H0(str) : str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ IllegalFormatException -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047 A[Catch:{ IllegalFormatException -> 0x0076 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo39543a(com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType r9) {
        /*
            r8 = this;
            java.lang.String r0 = "getSystem().displayMetrics"
            com.cubic.umo.ad.ext.types.UMOAdKitBannerType r1 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType.SMART_SWxH
            if (r9 == r1) goto L_0x0009
            java.lang.String r9 = r8.f31504i
            goto L_0x000b
        L_0x0009:
            java.lang.String r9 = r8.f31503h
        L_0x000b:
            boolean r1 = r8.f31505j
            if (r1 == 0) goto L_0x009c
            android.content.Context r1 = wb0.C13233c.f32842a
            java.lang.String r1 = r8.f31496a
            android.view.ViewGroup r1 = wb0.C13233c.m33334c(r1)
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IllegalFormatException -> 0x0076 }
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalFormatException -> 0x0076 }
            r5 = 0
            if (r1 != 0) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()     // Catch:{ IllegalFormatException -> 0x0076 }
            if (r6 != 0) goto L_0x0028
        L_0x0026:
            r6 = 0
            goto L_0x002a
        L_0x0028:
            int r6 = r6.width     // Catch:{ IllegalFormatException -> 0x0076 }
        L_0x002a:
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()     // Catch:{ IllegalFormatException -> 0x0076 }
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ IllegalFormatException -> 0x0076 }
            mf0.C24362h.m61210e(r7, r0)     // Catch:{ IllegalFormatException -> 0x0076 }
            float r6 = (float) r6     // Catch:{ IllegalFormatException -> 0x0076 }
            float r7 = r7.density     // Catch:{ IllegalFormatException -> 0x0076 }
            float r6 = r6 / r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r7
            int r6 = (int) r6     // Catch:{ IllegalFormatException -> 0x0076 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalFormatException -> 0x0076 }
            r4[r5] = r6     // Catch:{ IllegalFormatException -> 0x0076 }
            r6 = 1
            if (r1 != 0) goto L_0x0047
            goto L_0x0050
        L_0x0047:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch:{ IllegalFormatException -> 0x0076 }
            if (r1 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r1.height     // Catch:{ IllegalFormatException -> 0x0076 }
        L_0x0050:
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()     // Catch:{ IllegalFormatException -> 0x0076 }
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch:{ IllegalFormatException -> 0x0076 }
            mf0.C24362h.m61210e(r1, r0)     // Catch:{ IllegalFormatException -> 0x0076 }
            float r0 = (float) r5     // Catch:{ IllegalFormatException -> 0x0076 }
            float r1 = r1.density     // Catch:{ IllegalFormatException -> 0x0076 }
            float r0 = r0 / r1
            float r0 = r0 + r7
            int r0 = (int) r0     // Catch:{ IllegalFormatException -> 0x0076 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalFormatException -> 0x0076 }
            r4[r6] = r0     // Catch:{ IllegalFormatException -> 0x0076 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r3)     // Catch:{ IllegalFormatException -> 0x0076 }
            java.lang.String r0 = java.lang.String.format(r2, r9, r0)     // Catch:{ IllegalFormatException -> 0x0076 }
            java.lang.String r1 = "format(locale, this, *args)"
            mf0.C24362h.m61210e(r0, r1)     // Catch:{ IllegalFormatException -> 0x0076 }
            r9 = r0
            goto L_0x009c
        L_0x0076:
            r0 = move-exception
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r2 = "IllegalFormatException while setting <img> tag's W/H in Ad Content"
            java.lang.StringBuilder r2 = ce0.C21100e.m49315J0(r2)
            java.lang.String r3 = r8.f31506k
            r2.append(r3)
            java.lang.String r3 = " (Exception: "
            r2.append(r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.mo6667d(r0)
        L_0x009c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hc0.C12751a.mo39543a(com.cubic.umo.ad.ext.types.UMOAdKitBannerType):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022b, code lost:
        if (r14 == null) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0257, code lost:
        if (r9 == null) goto L_0x0259;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0254 A[Catch:{ IllegalFormatException -> 0x026a }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0255 A[Catch:{ IllegalFormatException -> 0x026a }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x031d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0178  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39544b(com.umo.ads.p342c.zza r23, java.lang.String r24, java.lang.String r25, com.umo.ads.p350u.zzc r26) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            r0 = r26
            java.lang.String r4 = "bannerType"
            mf0.C24362h.m61211f(r2, r4)
            java.lang.String r4 = "adContent"
            mf0.C24362h.m61211f(r3, r4)
            java.lang.String r4 = "adPlacement"
            mf0.C24362h.m61211f(r0, r4)
            android.content.Context r4 = wb0.C13233c.f32842a
            java.lang.String r4 = r1.f31496a
            android.view.ViewGroup r4 = wb0.C13233c.m33334c(r4)
            if (r4 != 0) goto L_0x0022
            return
        L_0x0022:
            java.lang.String r5 = r1.f31496a
            mc0.d r5 = wb0.C13233c.m33348q(r5)
            if (r5 != 0) goto L_0x002b
            goto L_0x0036
        L_0x002b:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r5 = r5.f31966b
            if (r5 != 0) goto L_0x0030
            goto L_0x0036
        L_0x0030:
            boolean r5 = r5.mo11127u()
            r1.f31505j = r5
        L_0x0036:
            boolean r5 = nc0.C12954d.m32800c(r24)
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L_0x003f
            goto L_0x004c
        L_0x003f:
            boolean r5 = android.webkit.URLUtil.isHttpUrl(r24)
            if (r5 != 0) goto L_0x004e
            boolean r5 = android.webkit.URLUtil.isHttpsUrl(r24)
            if (r5 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = 0
            goto L_0x004f
        L_0x004e:
            r5 = 1
        L_0x004f:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r23.ordinal()
            java.lang.String r10 = "RUBICON"
            java.lang.String r11 = "spotId"
            java.lang.String r12 = ""
            r13 = 2
            r14 = 3
            if (r9 == r7) goto L_0x00c1
            if (r9 == r13) goto L_0x0066
            goto L_0x0144
        L_0x0066:
            if (r5 == 0) goto L_0x006f
            com.umo.ads.u.zzd r9 = com.umo.ads.p350u.zzd.HTML_AD_ZIP_OR_URL_TEMPLATE
            r8.add(r9)
            goto L_0x00fe
        L_0x006f:
            com.cubic.umo.ad.types.AKBannerResponse r9 = r1.f31497b
            if (r9 != 0) goto L_0x0075
            r9 = 0
            goto L_0x0077
        L_0x0075:
            java.lang.String r9 = r9.f7440j
        L_0x0077:
            boolean r9 = mf0.C24362h.m61206a(r9, r10)
            if (r9 != 0) goto L_0x00bb
            com.umo.ads.u.zzd r9 = com.umo.ads.p350u.zzd.HTML_AD_CONTENT_TEMPLATE
            r8.add(r9)
            java.lang.String r9 = r1.f31496a
            mf0.C24362h.m61211f(r9, r11)
            mc0.d r9 = wb0.C13233c.m33348q(r9)
            if (r9 != 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r9 = r9.f31966b
            if (r9 != 0) goto L_0x0094
        L_0x0092:
            r9 = 0
            goto L_0x0098
        L_0x0094:
            boolean r9 = r9.mo11127u()
        L_0x0098:
            if (r9 == 0) goto L_0x00a9
            com.umo.ads.u.zzd[] r9 = new com.umo.ads.p350u.zzd[r13]
            com.umo.ads.u.zzd r11 = com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_H_AUTO_W_FILL_TEMPLATE
            r9[r6] = r11
            com.umo.ads.u.zzd r11 = com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_W_AUTO_H_FILL_TEMPLATE
            r9[r7] = r11
            java.util.List r9 = p583jk.C17875h.m44281E(r9)
            goto L_0x00b7
        L_0x00a9:
            com.umo.ads.u.zzd[] r9 = new com.umo.ads.p350u.zzd[r13]
            com.umo.ads.u.zzd r11 = com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_H_AUTO_W_TEMPLATE
            r9[r6] = r11
            com.umo.ads.u.zzd r11 = com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_W_AUTO_H_TEMPLATE
            r9[r7] = r11
            java.util.List r9 = p583jk.C17875h.m44281E(r9)
        L_0x00b7:
            r8.addAll(r9)
            goto L_0x00fe
        L_0x00bb:
            com.umo.ads.u.zzd r9 = com.umo.ads.p350u.zzd.RUBICON_HTML_AD_TEMPLATE
            r8.add(r9)
            goto L_0x00fe
        L_0x00c1:
            com.umo.ads.u.zzd r9 = com.umo.ads.p350u.zzd.PLAIN_IMAGE_AD_AS_HTML_TEMPLATE
            r8.add(r9)
            java.lang.String r9 = r1.f31496a
            mf0.C24362h.m61211f(r9, r11)
            mc0.d r9 = wb0.C13233c.m33348q(r9)
            if (r9 != 0) goto L_0x00d2
            goto L_0x00d6
        L_0x00d2:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r9 = r9.f31966b
            if (r9 != 0) goto L_0x00d8
        L_0x00d6:
            r9 = 0
            goto L_0x00dc
        L_0x00d8:
            boolean r9 = r9.mo11127u()
        L_0x00dc:
            if (r9 == 0) goto L_0x00ed
            com.umo.ads.u.zzd[] r9 = new com.umo.ads.p350u.zzd[r13]
            com.umo.ads.u.zzd r11 = com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_H_AUTO_W_FILL_TEMPLATE
            r9[r6] = r11
            com.umo.ads.u.zzd r11 = com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_W_AUTO_H_FILL_TEMPLATE
            r9[r7] = r11
            java.util.List r9 = p583jk.C17875h.m44281E(r9)
            goto L_0x00fb
        L_0x00ed:
            com.umo.ads.u.zzd[] r9 = new com.umo.ads.p350u.zzd[r13]
            com.umo.ads.u.zzd r11 = com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_H_AUTO_W_TEMPLATE
            r9[r6] = r11
            com.umo.ads.u.zzd r11 = com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_W_AUTO_H_TEMPLATE
            r9[r7] = r11
            java.util.List r9 = p583jk.C17875h.m44281E(r9)
        L_0x00fb:
            r8.addAll(r9)
        L_0x00fe:
            java.util.Iterator r8 = r8.iterator()
        L_0x0102:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0144
            java.lang.Object r9 = r8.next()
            com.umo.ads.u.zzd r9 = (com.umo.ads.p350u.zzd) r9
            java.lang.String r11 = "templateName"
            mf0.C24362h.m61211f(r9, r11)
            j$.util.concurrent.ConcurrentHashMap r11 = p389bl.C13637c.f33649p
            if (r11 != 0) goto L_0x0119
            r11 = 0
            goto L_0x0123
        L_0x0119:
            java.lang.String r15 = r9.name()
            java.lang.Object r11 = r11.get(r15)
            java.lang.String r11 = (java.lang.String) r11
        L_0x0123:
            boolean r15 = nc0.C12954d.m32800c(r11)
            if (r15 == 0) goto L_0x012d
            mf0.C24362h.m61208c(r11)
            goto L_0x012e
        L_0x012d:
            r11 = r12
        L_0x012e:
            int r9 = r9.ordinal()
            if (r9 == r7) goto L_0x0141
            if (r9 == r13) goto L_0x0141
            if (r9 == r14) goto L_0x013e
            r15 = 4
            if (r9 == r15) goto L_0x013e
            r1.f31502g = r11
            goto L_0x0102
        L_0x013e:
            r1.f31503h = r11
            goto L_0x0102
        L_0x0141:
            r1.f31504i = r11
            goto L_0x0102
        L_0x0144:
            kc0.b r8 = new kc0.b
            java.lang.String r9 = r1.f31496a
            android.content.Context r4 = r4.getContext()
            java.lang.String r11 = "containerView.context"
            mf0.C24362h.m61210e(r4, r11)
            r8.<init>(r9, r4, r1)
            r1.f31501f = r8
            r8.setAdPlacement(r0)
            android.content.Context r0 = wb0.C13233c.f32842a
            java.lang.String r0 = r1.f31496a
            mc0.d r0 = wb0.C13233c.m33348q(r0)
            if (r0 != 0) goto L_0x0164
            goto L_0x0168
        L_0x0164:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r0 = r0.f31966b
            if (r0 != 0) goto L_0x016a
        L_0x0168:
            r0 = 0
            goto L_0x016e
        L_0x016a:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerType r0 = r0.mo11122q()
        L_0x016e:
            if (r0 != 0) goto L_0x0172
            com.cubic.umo.ad.ext.types.UMOAdKitBannerType r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType.NONE
        L_0x0172:
            kc0.b r4 = r1.f31501f
            if (r4 != 0) goto L_0x0178
            goto L_0x02db
        L_0x0178:
            int r8 = r23.ordinal()
            java.lang.String r9 = "<img "
            java.lang.String r11 = "format(locale, this, *args)"
            java.lang.String r15 = " (Exception: "
            r14 = 41
            if (r8 == r7) goto L_0x028f
            if (r8 == r13) goto L_0x018b
            r12 = r3
            goto L_0x02d8
        L_0x018b:
            if (r5 == 0) goto L_0x01c7
            java.lang.String r0 = r1.f31502g     // Catch:{ IllegalFormatException -> 0x01a3 }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ IllegalFormatException -> 0x01a3 }
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ IllegalFormatException -> 0x01a3 }
            r9[r6] = r3     // Catch:{ IllegalFormatException -> 0x01a3 }
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r7)     // Catch:{ IllegalFormatException -> 0x01a3 }
            java.lang.String r0 = java.lang.String.format(r8, r0, r9)     // Catch:{ IllegalFormatException -> 0x01a3 }
            mf0.C24362h.m61210e(r0, r11)     // Catch:{ IllegalFormatException -> 0x01a3 }
        L_0x01a0:
            r12 = r0
            goto L_0x02d8
        L_0x01a3:
            r0 = move-exception
            ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
            java.lang.String r9 = "IllegalFormatException while templatizing the HTML Ad Url"
            java.lang.StringBuilder r9 = ce0.C21100e.m49315J0(r9)
            java.lang.String r10 = r1.f31506k
            r9.append(r10)
            r9.append(r15)
            java.lang.String r0 = r0.getLocalizedMessage()
            r9.append(r0)
            r9.append(r14)
            java.lang.String r0 = r9.toString()
            r8.mo6667d(r0)
            goto L_0x02d8
        L_0x01c7:
            com.cubic.umo.ad.types.AKBannerResponse r8 = r1.f31497b
            if (r8 != 0) goto L_0x01cd
            r8 = 0
            goto L_0x01cf
        L_0x01cd:
            java.lang.String r8 = r8.f7440j
        L_0x01cf:
            boolean r8 = mf0.C24362h.m61206a(r8, r10)
            if (r8 != 0) goto L_0x021d
            android.text.Spanned r8 = android.text.Html.fromHtml(r24)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = r1.mo39543a(r0)
            java.lang.String r0 = uh0.C25081h.m62833D(r8, r9, r0, r6)
            java.lang.String r8 = r1.f31502g     // Catch:{ IllegalFormatException -> 0x01f9 }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ IllegalFormatException -> 0x01f9 }
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ IllegalFormatException -> 0x01f9 }
            r10[r6] = r0     // Catch:{ IllegalFormatException -> 0x01f9 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r10, r7)     // Catch:{ IllegalFormatException -> 0x01f9 }
            java.lang.String r0 = java.lang.String.format(r9, r8, r0)     // Catch:{ IllegalFormatException -> 0x01f9 }
            mf0.C24362h.m61210e(r0, r11)     // Catch:{ IllegalFormatException -> 0x01f9 }
            goto L_0x01a0
        L_0x01f9:
            r0 = move-exception
            ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
            java.lang.String r9 = "IllegalFormatException while templatizing the HTML Ad Content"
            java.lang.StringBuilder r9 = ce0.C21100e.m49315J0(r9)
            java.lang.String r10 = r1.f31506k
            r9.append(r10)
            r9.append(r15)
            java.lang.String r0 = r0.getLocalizedMessage()
            r9.append(r0)
            r9.append(r14)
            java.lang.String r0 = r9.toString()
            r8.mo6667d(r0)
            goto L_0x02d8
        L_0x021d:
            java.lang.String r0 = r1.f31502g     // Catch:{ IllegalFormatException -> 0x026a }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ IllegalFormatException -> 0x026a }
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ IllegalFormatException -> 0x026a }
            com.cubic.umo.ad.types.AKBannerResponse r9 = r1.f31497b     // Catch:{ IllegalFormatException -> 0x026a }
            if (r9 != 0) goto L_0x0229
            goto L_0x022d
        L_0x0229:
            java.lang.String r14 = r9.f7438h     // Catch:{ IllegalFormatException -> 0x026a }
            if (r14 != 0) goto L_0x022e
        L_0x022d:
            r14 = r12
        L_0x022e:
            r10[r6] = r14     // Catch:{ IllegalFormatException -> 0x026a }
            if (r9 != 0) goto L_0x0233
            goto L_0x023c
        L_0x0233:
            com.cubic.umo.ad.types.AKTrackers r9 = r9.f7433c     // Catch:{ IllegalFormatException -> 0x026a }
            if (r9 != 0) goto L_0x0238
            goto L_0x023c
        L_0x0238:
            java.util.List<java.lang.String> r9 = r9.f7594b     // Catch:{ IllegalFormatException -> 0x026a }
            if (r9 != 0) goto L_0x023e
        L_0x023c:
            r9 = r12
            goto L_0x024e
        L_0x023e:
            java.lang.String r17 = "AKIMPSEPARATOR"
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r16 = r9
            java.lang.String r9 = kotlin.collections.C23825c.m58520q0(r16, r17, r18, r19, r20, r21)     // Catch:{ IllegalFormatException -> 0x026a }
        L_0x024e:
            r10[r7] = r9     // Catch:{ IllegalFormatException -> 0x026a }
            com.cubic.umo.ad.types.AKBannerResponse r9 = r1.f31497b     // Catch:{ IllegalFormatException -> 0x026a }
            if (r9 != 0) goto L_0x0255
            goto L_0x0259
        L_0x0255:
            java.lang.String r9 = r9.f7439i     // Catch:{ IllegalFormatException -> 0x026a }
            if (r9 != 0) goto L_0x025a
        L_0x0259:
            r9 = r12
        L_0x025a:
            r10[r13] = r9     // Catch:{ IllegalFormatException -> 0x026a }
            r9 = 3
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r9)     // Catch:{ IllegalFormatException -> 0x026a }
            java.lang.String r0 = java.lang.String.format(r8, r0, r10)     // Catch:{ IllegalFormatException -> 0x026a }
            mf0.C24362h.m61210e(r0, r11)     // Catch:{ IllegalFormatException -> 0x026a }
            goto L_0x01a0
        L_0x026a:
            r0 = move-exception
            ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
            java.lang.String r9 = "IllegalFormatException while templatizing the Rubicon Ad Content"
            java.lang.StringBuilder r9 = ce0.C21100e.m49315J0(r9)
            java.lang.String r10 = r1.f31506k
            r9.append(r10)
            r9.append(r15)
            java.lang.String r0 = r0.getLocalizedMessage()
            r9.append(r0)
            r10 = 41
            r9.append(r10)
            java.lang.String r0 = r9.toString()
            r8.mo6667d(r0)
            goto L_0x02d8
        L_0x028f:
            if (r25 != 0) goto L_0x0293
            r8 = r12
            goto L_0x0295
        L_0x0293:
            r8 = r25
        L_0x0295:
            java.lang.String r10 = r1.f31502g     // Catch:{ IllegalFormatException -> 0x02b4 }
            java.util.Locale r14 = java.util.Locale.US     // Catch:{ IllegalFormatException -> 0x02b4 }
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch:{ IllegalFormatException -> 0x02b4 }
            r7[r6] = r8     // Catch:{ IllegalFormatException -> 0x02b4 }
            r8 = 1
            r7[r8] = r3     // Catch:{ IllegalFormatException -> 0x02b4 }
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r13)     // Catch:{ IllegalFormatException -> 0x02b4 }
            java.lang.String r7 = java.lang.String.format(r14, r10, r7)     // Catch:{ IllegalFormatException -> 0x02b4 }
            mf0.C24362h.m61210e(r7, r11)     // Catch:{ IllegalFormatException -> 0x02b4 }
            java.lang.String r0 = r1.mo39543a(r0)     // Catch:{ IllegalFormatException -> 0x02b4 }
            java.lang.String r12 = uh0.C25081h.m62833D(r7, r9, r0, r6)     // Catch:{ IllegalFormatException -> 0x02b4 }
            goto L_0x02d8
        L_0x02b4:
            r0 = move-exception
            ch.qos.logback.classic.Logger r7 = ac0.C7557a.f23040a
            java.lang.String r8 = "IllegalFormatException while templatizing the Plain Image Ad Content"
            java.lang.StringBuilder r8 = ce0.C21100e.m49315J0(r8)
            java.lang.String r9 = r1.f31506k
            r8.append(r9)
            r8.append(r15)
            java.lang.String r0 = r0.getLocalizedMessage()
            r8.append(r0)
            r9 = 41
            r8.append(r9)
            java.lang.String r0 = r8.toString()
            r7.mo6667d(r0)
        L_0x02d8:
            r4.setBannerData(r12)
        L_0x02db:
            kc0.b r0 = r1.f31501f
            if (r0 != 0) goto L_0x02e1
            r0 = 0
            goto L_0x02e5
        L_0x02e1:
            java.lang.String r0 = r0.getBannerData()
        L_0x02e5:
            boolean r0 = nc0.C12954d.m32800c(r0)
            java.lang.String r4 = " Ad Content"
            if (r0 != 0) goto L_0x031d
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r3 = "Error templatizing "
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            java.lang.String r2 = r23.name()
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r1.f31506k
            r3.append(r2)
            r2 = 46
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo6667d(r2)
            vb0.a r0 = r1.f31499d
            if (r0 != 0) goto L_0x0315
            goto L_0x031c
        L_0x0315:
            java.lang.String r2 = r1.f31496a
            com.cubic.umo.ad.ext.types.UMOAdKitError r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            r0.mo39578v(r2, r3)
        L_0x031c:
            return
        L_0x031d:
            if (r5 == 0) goto L_0x032f
            com.umo.ads.c.zza r0 = com.umo.ads.p342c.zza.HTML
            if (r2 == r0) goto L_0x0327
            com.umo.ads.c.zza r0 = com.umo.ads.p342c.zza.IMAGE
            if (r2 != r0) goto L_0x032f
        L_0x0327:
            kc0.b r0 = r1.f31501f
            if (r0 != 0) goto L_0x032c
            goto L_0x032f
        L_0x032c:
            r0.setBannerUrl(r3)
        L_0x032f:
            kc0.b r0 = r1.f31501f
            if (r0 != 0) goto L_0x0334
            goto L_0x0337
        L_0x0334:
            r0.setBannerType(r2)
        L_0x0337:
            kc0.b r0 = r1.f31501f
            if (r0 != 0) goto L_0x033d
            goto L_0x04b4
        L_0x033d:
            android.content.Context r2 = wb0.C13233c.f32842a
            java.lang.String r2 = r0.f31707d
            android.view.ViewGroup r2 = wb0.C13233c.m33334c(r2)
            r0.f31716m = r2
            if (r2 != 0) goto L_0x034b
            goto L_0x04b4
        L_0x034b:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r5 = -1
            r2.<init>(r5, r5, r3)
            r0.setLayoutParams(r2)
            com.umo.ads.u.zzc r2 = r0.f31709f
            com.umo.ads.u.zzc r3 = com.umo.ads.p350u.zzc.INLINE
            if (r2 != r3) goto L_0x035e
            r8 = 1
            goto L_0x035f
        L_0x035e:
            r8 = 0
        L_0x035f:
            if (r8 != 0) goto L_0x0374
            java.lang.String r2 = r0.f31707d
            mc0.d r2 = wb0.C13233c.m33348q(r2)
            if (r2 != 0) goto L_0x036a
            goto L_0x036c
        L_0x036a:
            r2.f31973i = r0
        L_0x036c:
            android.view.ViewGroup r2 = r0.f31716m
            if (r2 != 0) goto L_0x0371
            goto L_0x0374
        L_0x0371:
            r2.addView(r0)
        L_0x0374:
            com.umo.ads.u.zzc r2 = r0.f31709f
            com.umo.ads.u.zzc r3 = com.umo.ads.p350u.zzc.INTERSTITIAL
            if (r2 != r3) goto L_0x03ae
            android.content.Context r2 = r0.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = p026b7.C1501f.umoak_layout_interstitial_close_control
            r5 = 0
            android.view.View r2 = r2.inflate(r3, r5)
            int r3 = p026b7.C1500e.iv_close
            android.view.View r3 = r2.findViewById(r3)
            if (r3 == 0) goto L_0x03a6
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.view.ViewGroup r5 = r0.f31716m
            if (r5 != 0) goto L_0x0398
            goto L_0x039b
        L_0x0398:
            r5.addView(r2)
        L_0x039b:
            px.a r2 = new px.a
            r5 = 20
            r2.<init>(r0, r5)
            r3.setOnClickListener(r2)
            goto L_0x03ae
        L_0x03a6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.ImageView"
            r0.<init>(r2)
            throw r0
        L_0x03ae:
            r0.f31713j = r6
            java.lang.String r2 = "javascript:document.open();document.close();"
            r0.loadUrl(r2)
            r2 = 1
            r0.setInitialScale(r2)
            android.webkit.WebSettings r3 = r0.getSettings()
            r3.setUseWideViewPort(r2)
            android.webkit.WebSettings r3 = r0.getSettings()
            r3.setLoadWithOverviewMode(r2)
            android.webkit.WebSettings r3 = r0.getSettings()
            android.webkit.WebSettings$LayoutAlgorithm r5 = android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN
            r3.setLayoutAlgorithm(r5)
            r0.mo11147b()
            android.webkit.WebSettings r3 = r0.getSettings()
            r3.setJavaScriptCanOpenWindowsAutomatically(r2)
            android.webkit.WebSettings r2 = r0.getSettings()
            r2.setBuiltInZoomControls(r6)
            android.webkit.WebSettings r2 = r0.getSettings()
            r2.setMediaPlaybackRequiresUserGesture(r6)
            android.webkit.WebSettings r2 = r0.getSettings()
            r2.setSupportZoom(r6)
            android.webkit.WebSettings r2 = r0.getSettings()
            r2.setBuiltInZoomControls(r6)
            android.webkit.WebSettings r2 = r0.getSettings()
            r2.setDisplayZoomControls(r6)
            android.webkit.WebSettings r2 = r0.getSettings()
            r2.setCacheMode(r13)
            android.webkit.WebSettings r2 = r0.getSettings()
            r2.setMixedContentMode(r13)
            kc0.a r2 = new kc0.a
            r2.<init>()
            r0.setOnTouchListener(r2)
            kc0.c r2 = new kc0.c
            r2.<init>(r0)
            r0.setWebViewClient(r2)
            kc0.d r2 = new kc0.d
            r2.<init>(r0)
            r0.setWebChromeClient(r2)
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r3 = "Rendering "
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            com.umo.ads.c.zza r5 = r0.f31711h
            java.lang.String r5 = r5.name()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = r0.f31715l
            r3.append(r4)
            java.lang.String r4 = ": [ "
            r3.append(r4)
            java.lang.String r4 = r0.getBannerData()
            r3.append(r4)
            java.lang.String r4 = " ]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.mo6672i(r3)
            java.lang.String r9 = r0.getBannerData()
            r8 = 0
            r12 = 0
            java.lang.String r10 = "text/html"
            java.lang.String r11 = "UTF-8"
            r7 = r0
            r7.loadDataWithBaseURL(r8, r9, r10, r11, r12)
            r0.mo39657d(r6)
            wh0.o1 r2 = r0.f31717n
            if (r2 == 0) goto L_0x0477
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r0 = r0.f31715l
            java.lang.String r3 = "HTML_AD: Ad Load Tracking Job already running"
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r3)
            r2.mo6666c(r0)
            goto L_0x04b4
        L_0x0477:
            int r2 = wb0.C13233c.m33340i()
            long r3 = (long) r2
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.String r6 = "HTML_AD: Starting Ad Load Tracking Job"
            java.lang.StringBuilder r6 = ce0.C21100e.m49315J0(r6)
            java.lang.String r7 = r0.f31715l
            r6.append(r7)
            java.lang.String r7 = ": ["
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " seconds]..."
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.mo6672i(r2)
            ci0.a r2 = wh0.C25184i0.f63460b
            bi0.d r2 = p389bl.C13637c.m34064a(r2)
            com.umo.ads.s.zzb r5 = new com.umo.ads.s.zzb
            r6 = 0
            r5.<init>(r3, r0, r6)
            r3 = 3
            wh0.o1 r2 = wh0.C25177g.m63218b(r2, r6, r5, r3)
            r0.f31717n = r2
        L_0x04b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hc0.C12751a.mo39544b(com.umo.ads.c.zza, java.lang.String, java.lang.String, com.umo.ads.u.zzc):void");
    }

    /* renamed from: c */
    public final void mo39545c(zzk zzk, String str) {
        Context context;
        Context context2 = C13233c.f32842a;
        ViewGroup c = C13233c.m33334c(this.f31496a);
        if (c == null) {
            context = null;
        } else {
            context = c.getContext();
        }
        if (context != null) {
            int i = zzd.f30827d;
            zzd.C12091a.m32061a(context, this.f31496a, zzk.zza, str);
        }
    }

    /* renamed from: d */
    public final void mo39546d(String str, String str2) {
        String str3;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTML_AD: onHtmlAdClicked");
        if (C12954d.m32800c(str)) {
            str3 = C17885a.m44403H0(str);
        } else {
            str3 = "";
        }
        J0.append(str3);
        J0.append(": ClickUrl: ");
        J0.append(str2);
        logger.mo6666c(J0.toString());
        if (mo39548f()) {
            C13199c cVar = this.f31500e;
            if (cVar != null) {
                cVar.zzc(str, str2);
                return;
            }
            return;
        }
        mo39545c(zzk.BROADCAST_ACTION_INTERSTITIAL_CLICK, str2);
    }

    /* renamed from: e */
    public final void mo39547e(C12836b bVar, String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "HTML_AD: onHtmlAdDisplayed"));
        if (mo39548f()) {
            C13197a aVar = this.f31499d;
            if (aVar != null) {
                aVar.mo39582z(bVar, str);
            }
            C13197a aVar2 = this.f31499d;
            if (aVar2 != null) {
                aVar2.mo39570n((ViewGroup) null, str);
                return;
            }
            return;
        }
        mo39545c(zzk.BROADCAST_ACTION_INTERSTITIAL_SHOW, (String) null);
    }

    /* renamed from: f */
    public final boolean mo39548f() {
        C12836b bVar = this.f31501f;
        if (bVar == null || bVar.f31709f == zzc.INLINE) {
            return true;
        }
        return false;
    }
}
