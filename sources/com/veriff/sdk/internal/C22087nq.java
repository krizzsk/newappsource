package com.veriff.sdk.internal;

import android.graphics.Color;
import com.veriff.VeriffBranding;
import com.veriff.VeriffResult;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.data.DrawableProvider;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\f\"\u001a\u0010\u000f\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010\"\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010\"\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010\"\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010\"\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, mo59060d2 = {"", "sessionUrl", "Lad0/a;", "configuration", "Lmobi/lab/veriff/data/SessionArguments;", "createSessionArguments", "", "statusCode", "Lcom/veriff/VeriffResult$Error;", "getErrorFromCode", "Lcom/veriff/VeriffResult$Status;", "getStatusFromCode", "Lcom/veriff/VeriffBranding;", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "toLegacyBranding", "DEFAULT_BACKGROUND_COLOR", "I", "getDEFAULT_BACKGROUND_COLOR", "()I", "DEFAULT_BULLET_POINT", "", "DEFAULT_BUTTON_CORNER_RADIUS", "F", "DEFAULT_NOTIFICATION_ICON", "DEFAULT_PRIMARY_TEXT_COLOR", "DEFAULT_SDK_URL", "Ljava/lang/String;", "DEFAULT_SECONDARY_COLOR", "DEFAULT_SECONDARY_TEXT_COLOR", "DEFAULT_THEME_COLOR", "DEFAULT_TOOLBAR_ICON", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nq */
public final class C22087nq {

    /* renamed from: a */
    private static final int f55716a = Color.parseColor("#004e5f");

    /* renamed from: b */
    private static final int f55717b = Color.parseColor("#00b4aa");

    /* renamed from: c */
    private static final int f55718c = Color.parseColor("#ffffff");

    /* renamed from: d */
    private static final int f55719d = Color.parseColor("#222328");

    /* renamed from: e */
    private static final int f55720e = Color.parseColor("#505366");

    /* renamed from: f */
    private static final int f55721f = R$drawable.vrff_ic_veriff;

    /* renamed from: g */
    private static final int f55722g = R$drawable.vrff_ic_decision_tick;

    /* renamed from: h */
    private static final int f55723h = R$drawable.vrff_ic_notification;

    /* renamed from: a */
    public static final VeriffResult.Status m53871a(int i) {
        if (i != 108) {
            switch (i) {
                case 100:
                case 102:
                    break;
                case 101:
                    return VeriffResult.Status.CANCELED;
                default:
                    return VeriffResult.Status.ERROR;
            }
        }
        return VeriffResult.Status.DONE;
    }

    /* renamed from: b */
    public static final VeriffResult.Error m53874b(int i) {
        if (m53871a(i) != VeriffResult.Status.ERROR) {
            return null;
        }
        if (i == 50) {
            return VeriffResult.Error.UNABLE_TO_ACCESS_CAMERA;
        }
        if (i == 51) {
            return VeriffResult.Error.UNABLE_TO_RECORD_AUDIO;
        }
        if (i == 199) {
            return VeriffResult.Error.UNKNOWN_ERROR;
        }
        switch (i) {
            case 103:
                return VeriffResult.Error.SESSION_ERROR;
            case 104:
                return VeriffResult.Error.NETWORK_ERROR;
            case 105:
                return VeriffResult.Error.SETUP_ERROR;
            case 106:
                return VeriffResult.Error.UNKNOWN_ERROR;
            case 107:
                return VeriffResult.Error.UNABLE_TO_START_CAMERA;
            default:
                switch (i) {
                    case 109:
                        return VeriffResult.Error.UNSUPPORTED_SDK_VERSION;
                    case 110:
                        return VeriffResult.Error.DEVICE_HAS_NO_NFC;
                    case 111:
                        return VeriffResult.Error.NFC_DISABLED;
                    case 112:
                        return VeriffResult.Error.MIC_UNAVAILABLE;
                    default:
                        return VeriffResult.Error.UNKNOWN_ERROR;
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final mobi.lab.veriff.data.C24426d m53873a(java.lang.String r14, ad0.C7559a r15) {
        /*
            java.lang.String r0 = "sessionUrl"
            mf0.C24362h.m61211f(r14, r0)
            java.lang.String r0 = "configuration"
            mf0.C24362h.m61211f(r15, r0)
            com.veriff.sdk.internal.yl r0 = com.veriff.sdk.internal.C22738yl.m55583e(r14)
            if (r0 == 0) goto L_0x00d9
            int r1 = r0.mo57294h()
            r2 = 2
            if (r1 >= r2) goto L_0x0019
            goto L_0x00d9
        L_0x0019:
            com.veriff.sdk.internal.yl$a r14 = r0.mo57304q()
            java.lang.String r1 = "/"
            com.veriff.sdk.internal.yl$a r14 = r14.mo57317e(r1)
            r1 = 0
            com.veriff.sdk.internal.yl$a r14 = r14.mo57319g(r1)
            com.veriff.sdk.internal.yl r14 = r14.mo57315c()
            java.lang.String r14 = r14.toString()
            java.lang.String r1 = "url.newBuilder().encoded…(null).build().toString()"
            mf0.C24362h.m61210e(r14, r1)
            java.util.List r1 = r0.mo57298k()
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r3 = "url.pathSegments()[1]"
            mf0.C24362h.m61210e(r1, r3)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r0.mo57301n()
            r4 = 0
            rf0.h r3 = p584jl.C17885a.m44393C0(r4, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = cf0.C21136j.m49436X(r3, r6)
            r5.<init>(r6)
            rf0.g r3 = r3.iterator()
        L_0x005d:
            boolean r6 = r3.f62733d
            if (r6 == 0) goto L_0x0076
            int r6 = r3.nextInt()
            java.lang.String r7 = r0.mo57282a((int) r6)
            java.lang.String r6 = r0.mo57285b((int) r6)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r7, r6)
            r5.add(r8)
            goto L_0x005d
        L_0x0076:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x007f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r7 = r6.mo59066a()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.mo59067b()
            java.lang.String r6 = (java.lang.String) r6
            if (r7 == 0) goto L_0x00a3
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r8 = 0
            goto L_0x00a4
        L_0x00a3:
            r8 = 1
        L_0x00a4:
            if (r8 != 0) goto L_0x00c8
            if (r6 == 0) goto L_0x00b1
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r6 = 0
            goto L_0x00b2
        L_0x00b1:
            r6 = 1
        L_0x00b2:
            if (r6 != 0) goto L_0x00c8
            java.lang.String r6 = "lang"
            boolean r6 = mf0.C24362h.m61206a(r7, r6)
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x00c8
            java.lang.String r6 = "fallbackLang"
            boolean r6 = mf0.C24362h.m61206a(r7, r6)
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x00c8
            r6 = 1
            goto L_0x00c9
        L_0x00c8:
            r6 = 0
        L_0x00c9:
            if (r6 == 0) goto L_0x007f
            r0.add(r5)
            goto L_0x007f
        L_0x00cf:
            java.util.Map r0 = kotlin.collections.C23826d.m58536a0(r0)
            com.veriff.sdk.internal.ns r2 = new com.veriff.sdk.internal.ns
            r2.<init>(r14, r1, r0)
            goto L_0x00e4
        L_0x00d9:
            com.veriff.sdk.internal.ns r2 = new com.veriff.sdk.internal.ns
            java.util.Map r0 = kotlin.collections.C23826d.m58530U()
            java.lang.String r1 = "https://magic.veriff.me/"
            r2.<init>(r1, r14, r0)
        L_0x00e4:
            mobi.lab.veriff.data.d r14 = new mobi.lab.veriff.data.d
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "UUID.randomUUID().toString()"
            mf0.C24362h.m61210e(r4, r0)
            java.lang.String r5 = r2.mo55985a()
            java.lang.String r6 = r2.mo55986b()
            java.util.Map r8 = r2.mo55987c()
            mobi.lab.veriff.util.d r9 = mobi.lab.veriff.util.C24450d.m61495a()
            java.lang.String r0 = "Encryption.create()"
            mf0.C24362h.m61210e(r9, r0)
            com.veriff.VeriffBranding r15 = r15.f23042a
            java.lang.String r0 = "configuration.branding"
            mf0.C24362h.m61210e(r15, r0)
            com.veriff.sdk.internal.xo r10 = m53872a((com.veriff.VeriffBranding) r15)
            r11 = 0
            r13 = 0
            java.lang.String r7 = "release_silent"
            java.lang.String r12 = "3"
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22087nq.m53873a(java.lang.String, ad0.a):mobi.lab.veriff.data.d");
    }

    /* renamed from: a */
    public static final C22696xo m53872a(VeriffBranding veriffBranding) {
        C24362h.m61211f(veriffBranding, "$this$toLegacyBranding");
        Integer num = veriffBranding.f30927a;
        if (num == null) {
            num = Integer.valueOf(f55716a);
        }
        C24362h.m61210e(num, "themeColor ?: DEFAULT_THEME_COLOR");
        int intValue = num.intValue();
        Integer num2 = veriffBranding.f30927a;
        if (num2 == null) {
            num2 = Integer.valueOf(f55717b);
        }
        C24362h.m61210e(num2, "themeColor ?: DEFAULT_SECONDARY_COLOR");
        int intValue2 = num2.intValue();
        Integer num3 = veriffBranding.f30928b;
        if (num3 == null) {
            num3 = Integer.valueOf(f55718c);
        }
        C24362h.m61210e(num3, "backgroundColor ?: DEFAULT_BACKGROUND_COLOR");
        int intValue3 = num3.intValue();
        Integer num4 = veriffBranding.f30929c;
        if (num4 == null) {
            num4 = veriffBranding.f30928b;
        }
        if (num4 == null) {
            num4 = Integer.valueOf(f55718c);
        }
        C24362h.m61210e(num4, "statusBarColor ?: backgr… DEFAULT_BACKGROUND_COLOR");
        int intValue4 = num4.intValue();
        Integer num5 = veriffBranding.f30930d;
        if (num5 == null) {
            num5 = Integer.valueOf(f55719d);
        }
        C24362h.m61210e(num5, "primaryTextColor ?: DEFAULT_PRIMARY_TEXT_COLOR");
        int intValue5 = num5.intValue();
        Integer num6 = veriffBranding.f30931e;
        if (num6 == null) {
            num6 = Integer.valueOf(f55720e);
        }
        C24362h.m61210e(num6, "secondaryTextColor ?: DEFAULT_SECONDARY_TEXT_COLOR");
        int intValue6 = num6.intValue();
        Float f = veriffBranding.f30933g;
        if (f == null) {
            f = Float.valueOf(4.0f);
        }
        C24362h.m61210e(f, "buttonCornerRadius ?: DEFAULT_BUTTON_CORNER_RADIUS");
        float floatValue = f.floatValue();
        Integer num7 = veriffBranding.f30932f;
        if (num7 == null) {
            num7 = Integer.valueOf(f55721f);
        }
        C24362h.m61210e(num7, "toolbarIcon ?: DEFAULT_TOOLBAR_ICON");
        int intValue7 = num7.intValue();
        Integer valueOf = Integer.valueOf(f55722g);
        C24362h.m61210e(valueOf, "bulletPoint ?: DEFAULT_BULLET_POINT");
        int intValue8 = valueOf.intValue();
        Integer valueOf2 = Integer.valueOf(f55723h);
        C24362h.m61210e(valueOf2, "notificationIcon ?: DEFAULT_NOTIFICATION_ICON");
        return new C22696xo(intValue, intValue2, intValue3, intValue4, intValue5, intValue6, floatValue, intValue7, (DrawableProvider) null, intValue8, valueOf2.intValue());
    }

    /* renamed from: a */
    public static final int m53870a() {
        return f55718c;
    }
}
