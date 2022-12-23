package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.util.d0 */
public class C3677d0 extends C3707l {

    /* renamed from: com.fyber.inneractive.sdk.util.d0$a */
    public static final class C3678a {

        /* renamed from: a */
        public final C3680c f12835a;

        /* renamed from: b */
        public final Throwable f12836b;

        /* renamed from: c */
        public final String f12837c;

        public C3678a(C3680c cVar, Throwable th, String str) {
            this.f12835a = cVar;
            this.f12836b = th;
            this.f12837c = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.d0$b */
    public static final class C3679b extends Exception {
        public C3679b(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.d0$c */
    public enum C3680c {
        FAILED,
        OPENED_IN_INTERNAL_BROWSER,
        OPEN_IN_EXTERNAL_APPLICATION,
        OPEN_IN_EXTERNAL_BROWSER,
        OPENED_USING_CHROME_NAVIGATE
    }

    /* renamed from: com.fyber.inneractive.sdk.util.d0$d */
    public enum C3681d {
        DO_NOT_OPEN_IN_INTERNAL_BROWSER,
        OPEN_EVERYTHING
    }

    /* renamed from: a */
    public static String m9921a(Context context) {
        try {
            return context.getClass().getName();
        } catch (Throwable unused) {
            return "failed";
        }
    }

    /* renamed from: d */
    public static boolean m9923d(String str) {
        return str.startsWith("http%3A%2F%2F") || str.startsWith("https%3A%2F%2F");
    }

    /* renamed from: e */
    public static boolean m9924e(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith("mailto:") && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.m9906e("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m9925f(String str) {
        boolean z;
        if (str != null && (!C3725r.m9983a() || IAConfigManager.f9202J.f9230r)) {
            if (str.startsWith(UrlPrivacyValidator.HTTP_SCHEME) || str.startsWith("http%3A%2F%2F")) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:131|132) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:76|77|78|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r0.startActivity(m9918a(r16, r17));
        r2 = new com.fyber.inneractive.sdk.util.C3677d0.C3678a(com.fyber.inneractive.sdk.util.C3677d0.C3680c.f12841d, (java.lang.Throwable) null, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        return new com.fyber.inneractive.sdk.util.C3677d0.C3678a(com.fyber.inneractive.sdk.util.C3677d0.C3680c.f12841d, (java.lang.Throwable) null, r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x02c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x02e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x0336 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x018e */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0290 A[SYNTHETIC, Splitter:B:120:0x0290] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02d3 A[SYNTHETIC, Splitter:B:133:0x02d3] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x037c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:120:0x0290=Splitter:B:120:0x0290, B:136:0x02e4=Splitter:B:136:0x02e4, B:150:0x0319=Splitter:B:150:0x0319} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.util.C3677d0.C3678a m9920a(android.content.Context r16, java.lang.String r17, boolean r18, com.fyber.inneractive.sdk.util.C3677d0.C3681d r19, java.lang.String r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            java.lang.String r4 = m9921a(r16)
            r5 = 0
            r6 = 0
            r7 = 1
            android.net.Uri r8 = android.net.Uri.parse(r17)     // Catch:{ Exception -> 0x0014 }
            goto L_0x001e
        L_0x0014:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r1
            java.lang.String r9 = "IAJavaUtil: getValidUri: Invalid url %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r9, r8)
            r8 = r5
        L_0x001e:
            if (r8 == 0) goto L_0x037d
            java.lang.String r9 = r8.getScheme()
            java.lang.String r10 = "smartlink"
            boolean r9 = r10.equalsIgnoreCase(r9)
            r10 = 2
            java.lang.String r11 = "%s %s"
            java.lang.String r12 = "android.intent.action.VIEW"
            if (r9 == 0) goto L_0x0137
            java.util.PriorityQueue r1 = new java.util.PriorityQueue
            r1.<init>()
            java.lang.String r2 = "primaryUrl"
            java.lang.String r2 = r8.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x004e
            android.net.Uri r3 = android.net.Uri.parse(r2)
            boolean r3 = com.fyber.inneractive.sdk.util.C3720p.m9978a(r0, r3)
            if (r3 == 0) goto L_0x004e
            r3 = 1
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = "primaryTrackingUrl"
            java.util.List r3 = r8.getQueryParameters(r3)
            com.fyber.inneractive.sdk.util.s0$a r9 = com.fyber.inneractive.sdk.util.C3728s0.C3729a.Primary
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x005e }
            goto L_0x0060
        L_0x005e:
            r2 = r5
        L_0x0060:
            if (r2 == 0) goto L_0x006a
            com.fyber.inneractive.sdk.util.s0 r13 = new com.fyber.inneractive.sdk.util.s0
            r13.<init>(r9, r2, r3)
            r1.offer(r13)
        L_0x006a:
            java.lang.String r2 = "fallbackUrl"
            java.lang.String r2 = r8.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0082
            android.net.Uri r3 = android.net.Uri.parse(r2)
            boolean r3 = com.fyber.inneractive.sdk.util.C3720p.m9978a(r0, r3)
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            if (r3 == 0) goto L_0x009e
            java.lang.String r3 = "fallbackTrackingUrl"
            java.util.List r3 = r8.getQueryParameters(r3)
            com.fyber.inneractive.sdk.util.s0$a r8 = com.fyber.inneractive.sdk.util.C3728s0.C3729a.FallBack
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0094
        L_0x0092:
            r2 = r5
        L_0x0094:
            if (r2 == 0) goto L_0x009e
            com.fyber.inneractive.sdk.util.s0 r9 = new com.fyber.inneractive.sdk.util.s0
            r9.<init>(r8, r2, r3)
            r1.offer(r9)
        L_0x009e:
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 == 0) goto L_0x0128
        L_0x00a9:
            java.lang.Object r2 = r1.poll()
            com.fyber.inneractive.sdk.util.s0 r2 = (com.fyber.inneractive.sdk.util.C3728s0) r2
            if (r2 == 0) goto L_0x00b9
            android.net.Uri r3 = r2.f12918b
            boolean r3 = com.fyber.inneractive.sdk.util.C3720p.m9978a(r0, r3)
            if (r3 == 0) goto L_0x00a9
        L_0x00b9:
            if (r2 != 0) goto L_0x00be
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            goto L_0x0111
        L_0x00be:
            android.content.Intent r1 = new android.content.Intent
            android.net.Uri r3 = r2.f12918b
            r1.<init>(r12, r3)
            boolean r0 = m9922a((android.content.Context) r0, (android.content.Intent) r1)
            if (r0 == 0) goto L_0x010a
            java.util.List<java.lang.String> r1 = r2.f12919c
            java.util.Iterator r1 = r1.iterator()
        L_0x00d1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00ee
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r8 = "SMART_LINK"
            r3[r6] = r8
            r3[r7] = r2
            com.fyber.inneractive.sdk.util.IAlog.m9900a(r7, r5, r11, r3)
        L_0x00ee:
            long r8 = java.lang.System.currentTimeMillis()
            com.fyber.inneractive.sdk.network.h0 r3 = new com.fyber.inneractive.sdk.network.h0
            com.fyber.inneractive.sdk.util.o r12 = new com.fyber.inneractive.sdk.util.o
            r12.<init>(r2, r8)
            r3.<init>(r12, r2)
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.network.w r2 = r2.f9232t
            java.util.concurrent.BlockingQueue<com.fyber.inneractive.sdk.network.b0<?>> r2 = r2.f10064a
            r2.offer(r3)
            com.fyber.inneractive.sdk.network.m0 r2 = com.fyber.inneractive.sdk.network.C2916m0.QUEUED
            r3.f9905f = r2
            goto L_0x00d1
        L_0x010a:
            if (r0 == 0) goto L_0x010f
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPEN_IN_EXTERNAL_BROWSER
            goto L_0x0111
        L_0x010f:
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
        L_0x0111:
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            if (r0 != r1) goto L_0x0122
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "IADeeplinkUtil.tryHandleDeepLinkWithExternalApp has failed"
            r2.<init>(r3)
            r0.<init>(r1, r2, r4)
            return r0
        L_0x0122:
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            r1.<init>(r0, r5, r4)
            return r1
        L_0x0128:
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "!fyberDeepLink.isValid()"
            r2.<init>(r3)
            r0.<init>(r1, r2, r4)
            return r0
        L_0x0137:
            java.lang.String r9 = r8.getScheme()
            java.lang.String r13 = "intent"
            boolean r9 = r13.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x01bc
            java.lang.String r1 = m9921a(r16)
            java.lang.String r2 = r8.toString()     // Catch:{ URISyntaxException -> 0x01a9 }
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r7)     // Catch:{ URISyntaxException -> 0x01a9 }
            boolean r3 = m9922a((android.content.Context) r0, (android.content.Intent) r2)     // Catch:{ URISyntaxException -> 0x01a9 }
            if (r3 == 0) goto L_0x0168
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ URISyntaxException -> 0x01a9 }
            java.lang.String r2 = "DEEPLINK"
            r0[r6] = r2     // Catch:{ URISyntaxException -> 0x01a9 }
            r0[r7] = r8     // Catch:{ URISyntaxException -> 0x01a9 }
            com.fyber.inneractive.sdk.util.IAlog.m9900a(r7, r5, r11, r0)     // Catch:{ URISyntaxException -> 0x01a9 }
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ URISyntaxException -> 0x01a9 }
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPEN_IN_EXTERNAL_APPLICATION     // Catch:{ URISyntaxException -> 0x01a9 }
            r0.<init>(r2, r5, r1)     // Catch:{ URISyntaxException -> 0x01a9 }
            goto L_0x01bb
        L_0x0168:
            java.lang.String r3 = "browser_fallback_url"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ URISyntaxException -> 0x01a9 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ URISyntaxException -> 0x01a9 }
            if (r3 != 0) goto L_0x0199
            android.content.Intent r3 = m9918a((android.content.Context) r0, (java.lang.String) r2)     // Catch:{ ActivityNotFoundException -> 0x018e }
            r0.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x018e }
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ ActivityNotFoundException -> 0x018e }
            java.lang.String r3 = "Intent opened successfully, url:"
            r0[r6] = r3     // Catch:{ ActivityNotFoundException -> 0x018e }
            r0[r7] = r2     // Catch:{ ActivityNotFoundException -> 0x018e }
            com.fyber.inneractive.sdk.util.IAlog.m9900a(r7, r5, r11, r0)     // Catch:{ ActivityNotFoundException -> 0x018e }
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ ActivityNotFoundException -> 0x018e }
            com.fyber.inneractive.sdk.util.d0$c r3 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x018e }
            r0.<init>(r3, r5, r1)     // Catch:{ ActivityNotFoundException -> 0x018e }
            goto L_0x01bb
        L_0x018e:
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ URISyntaxException -> 0x01a9 }
            java.lang.String r3 = "Intent failed, url:"
            r0[r6] = r3     // Catch:{ URISyntaxException -> 0x01a9 }
            r0[r7] = r2     // Catch:{ URISyntaxException -> 0x01a9 }
            com.fyber.inneractive.sdk.util.IAlog.m9900a(r7, r5, r11, r0)     // Catch:{ URISyntaxException -> 0x01a9 }
        L_0x0199:
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ URISyntaxException -> 0x01a9 }
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED     // Catch:{ URISyntaxException -> 0x01a9 }
            com.fyber.inneractive.sdk.util.d0$b r3 = new com.fyber.inneractive.sdk.util.d0$b     // Catch:{ URISyntaxException -> 0x01a9 }
            java.lang.String r4 = "tryToOpenExternalApp has failed (intent scheme)"
            r3.<init>(r4)     // Catch:{ URISyntaxException -> 0x01a9 }
            r0.<init>(r2, r3, r1)     // Catch:{ URISyntaxException -> 0x01a9 }
            goto L_0x01bb
        L_0x01a9:
            r0 = move-exception
            java.lang.String r2 = r0.getLocalizedMessage()
            java.lang.Object[] r3 = new java.lang.Object[r6]
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r3)
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r3 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            r2.<init>(r3, r0, r1)
            r0 = r2
        L_0x01bb:
            return r0
        L_0x01bc:
            android.content.pm.PackageManager r9 = r16.getPackageManager()
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r12, r8)
            r11 = 32
            java.util.List r9 = r9.queryIntentActivities(r10, r11)
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            if (r9 == 0) goto L_0x024f
            int r13 = r9.size()
            if (r13 <= 0) goto L_0x024f
            android.content.pm.PackageManager r13 = r16.getPackageManager()
            android.content.Intent r14 = new android.content.Intent
            java.lang.String r15 = "http://www.fyber.com"
            android.net.Uri r15 = android.net.Uri.parse(r15)
            r14.<init>(r12, r15)
            java.util.List r11 = r13.queryIntentActivities(r14, r11)
            java.util.TreeSet r13 = new java.util.TreeSet
            java.util.Comparator<android.content.pm.ResolveInfo> r14 = com.fyber.inneractive.sdk.util.C3707l.f12894b
            r13.<init>(r14)
            r13.addAll(r11)
            r9.removeAll(r13)
            int r11 = r9.size()
            if (r11 <= 0) goto L_0x0219
            java.lang.Object r9 = r9.get(r6)
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9
            if (r9 == 0) goto L_0x0219
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r12, r8)
            android.content.pm.ActivityInfo r8 = r9.activityInfo
            java.lang.String r9 = r8.packageName
            java.lang.String r8 = r8.name
            r11.setClassName(r9, r8)
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 != 0) goto L_0x021a
            r11.setFlags(r10)
            goto L_0x021a
        L_0x0219:
            r11 = r5
        L_0x021a:
            if (r11 == 0) goto L_0x024f
            r0.startActivity(r11)     // Catch:{ Exception -> 0x0227 }
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ Exception -> 0x0227 }
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPEN_IN_EXTERNAL_APPLICATION     // Catch:{ Exception -> 0x0227 }
            r0.<init>(r1, r5, r4)     // Catch:{ Exception -> 0x0227 }
            return r0
        L_0x0227:
            r0 = move-exception
            java.lang.String r1 = r0.getLocalizedMessage()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r1, r2)
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            com.fyber.inneractive.sdk.util.d0$b r3 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r5 = "deep linkk failed to open with message - "
            java.lang.StringBuilder r5 = p379.C13555b.m33972k(r5)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0)
            r1.<init>(r2, r3, r4)
            return r1
        L_0x024f:
            com.fyber.inneractive.sdk.util.d0$d r8 = com.fyber.inneractive.sdk.util.C3677d0.C3681d.DO_NOT_OPEN_IN_INTERNAL_BROWSER
            if (r2 != r8) goto L_0x0262
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "Redirect from internal browser didn't success "
            r2.<init>(r3)
            r0.<init>(r1, r2, r4)
            return r0
        L_0x0262:
            if (r18 == 0) goto L_0x027f
            boolean r9 = android.text.TextUtils.isEmpty(r17)
            if (r9 != 0) goto L_0x027a
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r9 = r1.toLowerCase(r9)
            java.lang.String r11 = "http"
            boolean r9 = r9.startsWith(r11)
            if (r9 == 0) goto L_0x027a
            r9 = 1
            goto L_0x027b
        L_0x027a:
            r9 = 0
        L_0x027b:
            if (r9 != 0) goto L_0x027f
            r9 = 0
            goto L_0x0281
        L_0x027f:
            r9 = r18
        L_0x0281:
            java.lang.String r11 = m9921a(r16)
            java.lang.String r13 = "IAJavaUtil - valid url found: '%s' opening browser"
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0358 }
            r14[r6] = r1     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r13, r14)     // Catch:{ all -> 0x0358 }
            if (r9 == 0) goto L_0x02d3
            boolean r9 = m9924e(r17)     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            if (r9 != 0) goto L_0x029e
            boolean r9 = m9923d(r17)     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            if (r9 != 0) goto L_0x029e
            r9 = 1
            goto L_0x029f
        L_0x029e:
            r9 = 0
        L_0x029f:
            if (r9 == 0) goto L_0x02b3
            if (r2 == r8) goto L_0x02b3
            android.content.Intent r2 = m9919a(r0, r1, r3)     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            r0.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            com.fyber.inneractive.sdk.util.d0$c r3 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPENED_IN_INTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            r2.<init>(r3, r5, r11)     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            goto L_0x0369
        L_0x02b3:
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            com.fyber.inneractive.sdk.util.d0$c r3 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            com.fyber.inneractive.sdk.util.d0$b r8 = new com.fyber.inneractive.sdk.util.d0$b     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            java.lang.String r9 = "canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to false"
            r8.<init>(r9)     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            r2.<init>(r3, r8, r11)     // Catch:{ ActivityNotFoundException -> 0x02c3 }
            goto L_0x0369
        L_0x02c3:
            android.content.Intent r2 = m9918a((android.content.Context) r16, (java.lang.String) r17)     // Catch:{ all -> 0x0358 }
            r0.startActivity(r2)     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ all -> 0x0358 }
            r2.<init>(r0, r5, r11)     // Catch:{ all -> 0x0358 }
            goto L_0x0369
        L_0x02d3:
            android.content.Intent r8 = m9918a((android.content.Context) r16, (java.lang.String) r17)     // Catch:{ ActivityNotFoundException -> 0x0317, all -> 0x02e4 }
            r0.startActivity(r8)     // Catch:{ ActivityNotFoundException -> 0x0317, all -> 0x02e4 }
            com.fyber.inneractive.sdk.util.d0$a r8 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ ActivityNotFoundException -> 0x0317, all -> 0x02e4 }
            com.fyber.inneractive.sdk.util.d0$c r9 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPEN_IN_EXTERNAL_BROWSER     // Catch:{ ActivityNotFoundException -> 0x0317, all -> 0x02e4 }
            r8.<init>(r9, r5, r11)     // Catch:{ ActivityNotFoundException -> 0x0317, all -> 0x02e4 }
            r2 = r8
            goto L_0x0369
        L_0x02e4:
            boolean r8 = m9924e(r17)     // Catch:{ all -> 0x0358 }
            if (r8 != 0) goto L_0x02f2
            boolean r8 = m9923d(r17)     // Catch:{ all -> 0x0358 }
            if (r8 != 0) goto L_0x02f2
            r8 = 1
            goto L_0x02f3
        L_0x02f2:
            r8 = 0
        L_0x02f3:
            if (r8 == 0) goto L_0x0308
            com.fyber.inneractive.sdk.util.d0$d r8 = com.fyber.inneractive.sdk.util.C3677d0.C3681d.DO_NOT_OPEN_IN_INTERNAL_BROWSER     // Catch:{ all -> 0x0358 }
            if (r2 == r8) goto L_0x0308
            android.content.Intent r2 = m9919a(r0, r1, r3)     // Catch:{ all -> 0x0358 }
            r0.startActivity(r2)     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPENED_IN_INTERNAL_BROWSER     // Catch:{ all -> 0x0358 }
            r2.<init>(r0, r5, r11)     // Catch:{ all -> 0x0358 }
            goto L_0x0369
        L_0x0308:
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$b r3 = new com.fyber.inneractive.sdk.util.d0$b     // Catch:{ all -> 0x0358 }
            java.lang.String r5 = "canOpenInExternalBrowser has decided it cant be opened and shouldUseInternalBrowser was set to true"
            r3.<init>(r5)     // Catch:{ all -> 0x0358 }
            r2.<init>(r0, r3, r11)     // Catch:{ all -> 0x0358 }
            goto L_0x0369
        L_0x0317:
            java.lang.String r2 = "googlechrome://navigate?url=%s"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0336 }
            r3[r6] = r1     // Catch:{ all -> 0x0336 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0336 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x0336 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x0336 }
            r3.<init>(r12, r2)     // Catch:{ all -> 0x0336 }
            boolean r2 = r0 instanceof android.app.Activity     // Catch:{ all -> 0x0336 }
            if (r2 != 0) goto L_0x0331
            r3.addFlags(r10)     // Catch:{ all -> 0x0336 }
        L_0x0331:
            r0.startActivity(r3)     // Catch:{ all -> 0x0336 }
            r0 = 1
            goto L_0x033e
        L_0x0336:
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0358 }
            java.lang.String r2 = "Failed opening chrome for a special uri."
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r2, r0)     // Catch:{ all -> 0x0358 }
            r0 = 0
        L_0x033e:
            if (r0 == 0) goto L_0x0348
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPENED_USING_CHROME_NAVIGATE     // Catch:{ all -> 0x0358 }
            r2.<init>(r0, r5, r11)     // Catch:{ all -> 0x0358 }
            goto L_0x0369
        L_0x0348:
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$c r0 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED     // Catch:{ all -> 0x0358 }
            com.fyber.inneractive.sdk.util.d0$b r3 = new com.fyber.inneractive.sdk.util.d0$b     // Catch:{ all -> 0x0358 }
            java.lang.String r5 = "tryOpeningChromeGracefully has failed and couldn't open the url"
            r3.<init>(r5)     // Catch:{ all -> 0x0358 }
            r2.<init>(r0, r3, r11)     // Catch:{ all -> 0x0358 }
            goto L_0x0369
        L_0x0358:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r1
            java.lang.String r1 = "IAJavaUtil - could not open a browser for url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r1, r2)
            com.fyber.inneractive.sdk.util.d0$a r2 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            r2.<init>(r1, r0, r11)
        L_0x0369:
            com.fyber.inneractive.sdk.util.d0$c r0 = r2.f12835a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            if (r0 == r1) goto L_0x037c
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "Used fallback for opening the click"
            r2.<init>(r3)
            r1.<init>(r0, r2, r4)
            return r1
        L_0x037c:
            return r2
        L_0x037d:
            com.fyber.inneractive.sdk.util.d0$a r0 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r1 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            com.fyber.inneractive.sdk.util.d0$b r2 = new com.fyber.inneractive.sdk.util.d0$b
            java.lang.String r3 = "all methods has been exhausted, illegal uri"
            r2.<init>(r3)
            r0.<init>(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3677d0.m9920a(android.content.Context, java.lang.String, boolean, com.fyber.inneractive.sdk.util.d0$d, java.lang.String):com.fyber.inneractive.sdk.util.d0$a");
    }

    /* renamed from: a */
    public static Intent m9918a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: a */
    public static Intent m9919a(Context context, String str, String str2) {
        Intent intent = new Intent(context, InneractiveInternalBrowserActivity.class);
        intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str);
        intent.putExtra("spotId", str2);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: a */
    public static boolean m9922a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo next : queryIntentActivities) {
                if (next.activityInfo.exported) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }
}
