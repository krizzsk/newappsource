package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.cache.session.C2603c;
import com.fyber.inneractive.sdk.cache.session.C2604d;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2628d0;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.network.C2904h0;
import com.fyber.inneractive.sdk.network.C2916m0;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.network.C2931r;
import com.fyber.inneractive.sdk.network.C2936u;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3704j0;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.usebutton.sdk.internal.util.DiskLruCache;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.l */
public abstract class C2778l<AdContent extends C2776j, EventsListener extends InneractiveUnitController.EventsListener> implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener {

    /* renamed from: a */
    public InneractiveAdSpot f9597a;

    /* renamed from: b */
    public AdContent f9598b;

    /* renamed from: c */
    public EventsListener f9599c;

    /* renamed from: d */
    public boolean f9600d = false;

    /* renamed from: e */
    public boolean f9601e = false;

    /* renamed from: f */
    public boolean f9602f = false;

    /* renamed from: g */
    public boolean f9603g = false;

    /* renamed from: h */
    public boolean f9604h = false;

    /* renamed from: i */
    public boolean f9605i = true;

    /* renamed from: j */
    public Runnable f9606j;

    /* renamed from: com.fyber.inneractive.sdk.flow.l$a */
    public class C2779a implements C2936u<String> {

        /* renamed from: a */
        public final /* synthetic */ String f9607a;

        /* renamed from: b */
        public final /* synthetic */ long f9608b;

        public C2779a(C2778l lVar, String str, long j) {
            this.f9607a = str;
            this.f9608b = j;
        }

        /* renamed from: a */
        public void mo13154a(Object obj, Exception exc, boolean z) {
            String str = (String) obj;
            int i = IAlog.f12814a;
            IAlog.m9900a(1, (Exception) null, "Hit Request - %s", this.f9607a);
            IAlog.m9902a("Hit Request: Hitting URL finished: %s", this.f9607a);
            if (exc == null) {
                IAlog.m9902a("Hit Request: Hitting URL response code: %s", str);
            } else {
                IAlog.m9902a("Hit Request: Hitting URL failed: %s", exc);
            }
            IAlog.m9902a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f9608b));
        }
    }

    /* renamed from: A */
    public void mo13544A() {
        C3648e c;
        OnGlobalImpressionDataListener onGlobalImpressionDataListener;
        String str;
        ImpressionData impressionData;
        if (!this.f9602f && this.f9599c != null) {
            IAlog.m9902a("%sCalling external interface onAdImpression", IAlog.m9899a((Object) this));
            this.f9599c.onAdImpression(this.f9597a);
            AdContent adcontent = this.f9598b;
            if (!(adcontent == null || (c = adcontent.mo13293c()) == null)) {
                IAConfigManager iAConfigManager = IAConfigManager.f9202J;
                C2628d0 d0Var = iAConfigManager.f9236x;
                if (d0Var != null) {
                    UnitDisplayType unitDisplayType = c.f12756n;
                    ImpressionData impressionData2 = c.f12760r;
                    if (impressionData2 != null) {
                        str = impressionData2.getAdvertiserDomain();
                    } else {
                        str = null;
                    }
                    d0Var.mo13213a(unitDisplayType, "LAST_DOMAIN_SHOWED", str);
                    d0Var.mo13213a(unitDisplayType, "LAST_APP_BUNDLE_ID", c.f12767y);
                    if (!(unitDisplayType == UnitDisplayType.REWARDED || (impressionData = c.f12760r) == null || impressionData.getVideo() == null || !c.f12760r.getVideo().isSkippable())) {
                        d0Var.mo13214a(unitDisplayType, "LAST_VAST_SKIPED");
                    }
                    if (this.f9598b.isVideoAd()) {
                        d0Var.mo13214a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    }
                    d0Var.mo13214a(unitDisplayType, "LAST_CLICKED");
                }
                C3704j0 j0Var = iAConfigManager.f9204A;
                C2703z zVar = this.f9598b.f9593d;
                ImpressionData impressionData3 = c.f12760r;
                j0Var.getClass();
                if (!(zVar == null || (onGlobalImpressionDataListener = j0Var.f12884a) == null)) {
                    C2702y yVar = (C2702y) zVar;
                    onGlobalImpressionDataListener.onImpression(yVar.f9423b, yVar.f9422a, impressionData3);
                }
                EventsListener eventslistener = this.f9599c;
                if (eventslistener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                    ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f9597a, c.f12760r);
                } else if (eventslistener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                    ((InneractiveAdViewEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f9597a, c.f12760r);
                }
            }
            this.f9602f = true;
        }
    }

    /* renamed from: B */
    public void mo13545B() {
        if (this.f9599c != null) {
            IAlog.m9902a("%sCalling external interface onAdWillOpenExternalApp", IAlog.m9899a((Object) this));
            this.f9599c.onAdWillOpenExternalApp(this.f9597a);
        }
        mo13546C();
    }

    /* renamed from: C */
    public final void mo13546C() {
        this.f9604h = false;
        this.f9603g = false;
    }

    /* renamed from: D */
    public void mo13547D() {
        AdContent adcontent = this.f9598b;
        if (adcontent != null && adcontent.mo13293c() != null) {
            String str = this.f9598b.mo13293c().f12757o;
            if (!TextUtils.isEmpty(str)) {
                IAlog.m9905d("%sfiring rewarded completion!", IAlog.m9899a((Object) this));
                IAlog.m9900a(1, (Exception) null, "AD_REWARDED_COMPLETION", new Object[0]);
                mo13554b(str);
            }
        }
    }

    /* renamed from: b */
    public void mo13553b(C3648e eVar) {
        String str = eVar.f12753k;
        if (str != null && str.trim().length() > 0) {
            IAlog.m9905d("%sfiring impression!", IAlog.m9899a((Object) this));
            IAlog.m9900a(1, (Exception) null, "AD_IMPRESSION", new Object[0]);
            mo13554b(str);
        }
    }

    public boolean canRefreshAd() {
        return true;
    }

    public void destroy() {
        if (this.f9600d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener((InneractiveInternalBrowserActivity.InternalBrowserListener) null);
            this.f9600d = false;
        }
        Runnable runnable = this.f9606j;
        if (runnable != null) {
            C3714n.f12902b.removeCallbacks(runnable);
            this.f9606j = null;
        }
        this.f9598b = null;
        this.f9599c = null;
        this.f9597a = null;
    }

    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f9597a = inneractiveAdSpot;
        this.f9598b = inneractiveAdSpot.getAdContent();
        this.f9599c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    public void onApplicationInBackground() {
        mo13545B();
        mo13546C();
    }

    public void onInternalBrowserDismissed() {
        IAlog.m9902a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f9600d) {
            this.f9600d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener((InneractiveInternalBrowserActivity.InternalBrowserListener) null);
        }
        if (this.f9599c != null) {
            IAlog.m9902a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.m9899a((Object) this));
            this.f9599c.onAdWillCloseInternalBrowser(this.f9597a);
        }
        mo13546C();
    }

    /* renamed from: w */
    public int mo13555w() {
        return -1;
    }

    /* renamed from: x */
    public int mo13556x() {
        return -1;
    }

    /* renamed from: y */
    public boolean mo13557y() {
        AdContent adcontent = this.f9598b;
        if (adcontent != null) {
            return adcontent.mo13299d();
        }
        return true;
    }

    /* renamed from: z */
    public void mo13558z() {
        C3648e c;
        if (this.f9599c != null) {
            IAlog.m9902a("%sCalling external interface onAdClicked", IAlog.m9899a((Object) this));
            this.f9599c.onAdClicked(this.f9597a);
        }
        AdContent adcontent = this.f9598b;
        if (adcontent != null && (c = adcontent.mo13293c()) != null) {
            IAConfigManager.f9202J.f9236x.mo13213a(c.f12756n, "LAST_CLICKED", DiskLruCache.VERSION_1);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0109 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x011a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0132 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0149  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.util.C3677d0.C3678a mo13548a(android.content.Context r17, java.lang.String r18, com.fyber.inneractive.sdk.util.C3721p0 r19, com.fyber.inneractive.sdk.util.C3682e r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            java.lang.String r4 = "Got exception adding param to json object: %s, %s"
            boolean r5 = r0.f9605i
            java.lang.String r6 = "none"
            r7 = 0
            if (r5 == 0) goto L_0x035b
            boolean r5 = r0.f9600d
            if (r5 == 0) goto L_0x0017
            goto L_0x035b
        L_0x0017:
            r16.mo13558z()
            boolean r5 = android.text.TextUtils.isEmpty(r18)
            if (r5 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - is empty"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "empty url"
            r3.<init>(r4)
            r1.<init>(r2, r3, r6)
            return r1
        L_0x0036:
            boolean r5 = android.text.TextUtils.isEmpty(r18)
            java.lang.String r6 = "url"
            r8 = 0
            if (r5 != 0) goto L_0x0065
            android.net.Uri r5 = android.net.Uri.parse(r18)
            java.lang.String r9 = r5.getScheme()
            java.lang.String r10 = r5.getHost()
            if (r9 == 0) goto L_0x0065
            java.lang.String r11 = "fybernativebrowser"
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0065
            if (r10 == 0) goto L_0x0065
            java.lang.String r9 = "navigate"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0065
            java.lang.String r5 = r5.getQueryParameter(r6)
            goto L_0x0066
        L_0x0065:
            r5 = r8
        L_0x0066:
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            r10 = 1
            if (r9 != 0) goto L_0x0070
            r9 = r5
        L_0x006e:
            r5 = 0
            goto L_0x007c
        L_0x0070:
            java.lang.String r5 = "FYBER_OPEN_BROWSER"
            r9 = r18
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x007b
            goto L_0x006e
        L_0x007b:
            r5 = 1
        L_0x007c:
            com.fyber.inneractive.sdk.util.d0$d r11 = com.fyber.inneractive.sdk.util.C3677d0.C3681d.OPEN_EVERYTHING
            com.fyber.inneractive.sdk.external.InneractiveAdSpot r12 = r0.f9597a
            if (r12 == 0) goto L_0x0087
            java.lang.String r12 = r12.getLocalUniqueId()
            goto L_0x0088
        L_0x0087:
            r12 = r8
        L_0x0088:
            com.fyber.inneractive.sdk.util.d0$a r5 = com.fyber.inneractive.sdk.util.C3677d0.m9920a(r1, r9, r5, r11, r12)
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r13 = "VAST_EVENT"
            r12[r7] = r13
            r12[r10] = r5
            r13 = 2
            r12[r13] = r9
            java.lang.String r14 = "%s EVENT_CLICK %s %s"
            com.fyber.inneractive.sdk.util.IAlog.m9900a(r10, r8, r14, r12)
            com.fyber.inneractive.sdk.util.d0$c r12 = r5.f12835a
            com.fyber.inneractive.sdk.util.d0$c r14 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            java.lang.String r15 = "is_auto_click"
            if (r12 != r14) goto L_0x0149
            com.fyber.inneractive.sdk.network.o r1 = com.fyber.inneractive.sdk.network.C2922o.CLICK_PARSING_FAILURE
            boolean r3 = r0.f9601e
            if (r3 != 0) goto L_0x013f
            r0.f9601e = r10
            java.lang.Throwable r3 = r5.f12836b
            if (r3 != 0) goto L_0x00b4
            java.lang.String r3 = "null-exception!"
            goto L_0x00b8
        L_0x00b4:
            java.lang.String r3 = r3.getMessage()
        L_0x00b8:
            AdContent r11 = r0.f9598b     // Catch:{ all -> 0x013f }
            if (r11 != 0) goto L_0x00c8
            com.fyber.inneractive.sdk.network.q$a r11 = new com.fyber.inneractive.sdk.network.q$a     // Catch:{ all -> 0x013f }
            r11.<init>(r8)     // Catch:{ all -> 0x013f }
            r11.f10041b = r1     // Catch:{ all -> 0x013f }
            r11.f10040a = r8     // Catch:{ all -> 0x013f }
            r11.f10043d = r8     // Catch:{ all -> 0x013f }
            goto L_0x00e3
        L_0x00c8:
            com.fyber.inneractive.sdk.network.q$a r11 = new com.fyber.inneractive.sdk.network.q$a     // Catch:{ all -> 0x013f }
            AdContent r12 = r0.f9598b     // Catch:{ all -> 0x013f }
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r14 = r12.f9590a     // Catch:{ all -> 0x013f }
            com.fyber.inneractive.sdk.response.e r12 = r12.mo13293c()     // Catch:{ all -> 0x013f }
            AdContent r8 = r0.f9598b     // Catch:{ all -> 0x013f }
            com.fyber.inneractive.sdk.config.global.s r8 = r8.f9592c     // Catch:{ all -> 0x013f }
            org.json.JSONArray r8 = r8.mo13268c()     // Catch:{ all -> 0x013f }
            r11.<init>(r12)     // Catch:{ all -> 0x013f }
            r11.f10041b = r1     // Catch:{ all -> 0x013f }
            r11.f10040a = r14     // Catch:{ all -> 0x013f }
            r11.f10043d = r8     // Catch:{ all -> 0x013f }
        L_0x00e3:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x013f }
            r1.<init>()     // Catch:{ all -> 0x013f }
            if (r9 != 0) goto L_0x00ed
            java.lang.String r8 = "null"
            goto L_0x00ee
        L_0x00ed:
            r8 = r9
        L_0x00ee:
            r1.put(r6, r8)     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00fb
        L_0x00f2:
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ all -> 0x013f }
            r12[r7] = r6     // Catch:{ all -> 0x013f }
            r12[r10] = r8     // Catch:{ all -> 0x013f }
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r12)     // Catch:{ all -> 0x013f }
        L_0x00fb:
            java.lang.String r6 = "message"
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x013f }
            if (r8 == 0) goto L_0x0105
            java.lang.String r3 = "empty"
        L_0x0105:
            r1.put(r6, r3)     // Catch:{ Exception -> 0x0109 }
            goto L_0x0112
        L_0x0109:
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x013f }
            r8[r7] = r6     // Catch:{ all -> 0x013f }
            r8[r10] = r3     // Catch:{ all -> 0x013f }
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r8)     // Catch:{ all -> 0x013f }
        L_0x0112:
            java.lang.String r3 = "ctx_name"
            java.lang.String r6 = r5.f12837c     // Catch:{ all -> 0x013f }
            r1.put(r3, r6)     // Catch:{ Exception -> 0x011a }
            goto L_0x0123
        L_0x011a:
            java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x013f }
            r8[r7] = r3     // Catch:{ all -> 0x013f }
            r8[r10] = r6     // Catch:{ all -> 0x013f }
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r8)     // Catch:{ all -> 0x013f }
        L_0x0123:
            org.json.JSONArray r3 = r11.f10045f     // Catch:{ all -> 0x013f }
            r3.put(r1)     // Catch:{ all -> 0x013f }
            boolean r2 = r2.f12909c     // Catch:{ all -> 0x013f }
            if (r2 == 0) goto L_0x013b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x013f }
            r1.put(r15, r2)     // Catch:{ Exception -> 0x0132 }
            goto L_0x013b
        L_0x0132:
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x013f }
            r1[r7] = r15     // Catch:{ all -> 0x013f }
            r1[r10] = r2     // Catch:{ all -> 0x013f }
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r1)     // Catch:{ all -> 0x013f }
        L_0x013b:
            r1 = 0
            r11.mo13717a((java.lang.String) r1)     // Catch:{ all -> 0x013f }
        L_0x013f:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r7] = r9
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - failed opening URL %s"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            return r5
        L_0x0149:
            boolean r4 = r0.f9604h
            if (r4 != 0) goto L_0x02aa
            r0.f9604h = r10
            AdContent r4 = r0.f9598b
            if (r4 != 0) goto L_0x0169
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r8 = "InneractiveAdRendererImpl: no ad content?"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r8, r4)
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C2924p.FYBER_SUCCESS_CLICK
            r12 = 0
            r4.<init>(r12)
            r4.f10042c = r8
            r4.f10040a = r12
            r4.f10043d = r12
            goto L_0x018d
        L_0x0169:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r8 = "InneractiveAdRendererImpl: ad content exists!"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r8, r4)
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C2924p.FYBER_SUCCESS_CLICK
            AdContent r12 = r0.f9598b
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r14 = r12.f9590a
            com.fyber.inneractive.sdk.response.e r12 = r12.mo13293c()
            AdContent r11 = r0.f9598b
            com.fyber.inneractive.sdk.config.global.s r11 = r11.f9592c
            org.json.JSONArray r11 = r11.mo13268c()
            r4.<init>(r12)
            r4.f10042c = r8
            r4.f10040a = r14
            r4.f10043d = r11
        L_0x018d:
            com.fyber.inneractive.sdk.network.q$b r8 = new com.fyber.inneractive.sdk.network.q$b
            r8.<init>()
            com.fyber.inneractive.sdk.network.q$b r11 = r8.mo13719a(r6, r9)
            com.fyber.inneractive.sdk.util.d0$c r12 = r5.f12835a
            java.lang.String r12 = r12.toString()
            java.lang.String r14 = "opened_from"
            com.fyber.inneractive.sdk.network.q$b r11 = r11.mo13719a(r14, r12)
            java.lang.String r12 = "opened_by"
            java.lang.String r14 = "renderer"
            com.fyber.inneractive.sdk.network.q$b r11 = r11.mo13719a(r12, r14)
            java.lang.String r12 = "origin"
            r11.mo13719a(r12, r3)
            boolean r11 = r2.f12909c
            if (r11 == 0) goto L_0x01ba
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r8.mo13719a(r15, r2)
            goto L_0x026b
        L_0x01ba:
            float r11 = r2.f12907a
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01c9
            float r11 = r2.f12908b
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01c9
            r11 = 1
            goto L_0x01ca
        L_0x01c9:
            r11 = 0
        L_0x01ca:
            if (r11 == 0) goto L_0x026b
            boolean r11 = r16.mo13557y()
            int r14 = r16.mo13556x()
            if (r11 == 0) goto L_0x01d7
            goto L_0x01db
        L_0x01d7:
            int r14 = com.fyber.inneractive.sdk.util.C3707l.m9963b((int) r14)
        L_0x01db:
            if (r14 != 0) goto L_0x01df
            r11 = 0
            goto L_0x01e3
        L_0x01df:
            float r11 = r2.f12907a
            float r14 = (float) r14
            float r11 = r11 / r14
        L_0x01e3:
            boolean r14 = r16.mo13557y()
            int r15 = r16.mo13555w()
            if (r14 == 0) goto L_0x01ee
            goto L_0x01f2
        L_0x01ee:
            int r15 = com.fyber.inneractive.sdk.util.C3707l.m9963b((int) r15)
        L_0x01f2:
            if (r15 != 0) goto L_0x01f5
            goto L_0x01fa
        L_0x01f5:
            float r2 = r2.f12908b
            float r12 = (float) r15
            float r12 = r2 / r12
        L_0x01fa:
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Float r14 = java.lang.Float.valueOf(r11)
            r2[r7] = r14
            java.lang.Float r14 = java.lang.Float.valueOf(r12)
            r2[r10] = r14
            java.lang.String r14 = "Point location -  x - %.2f , y- %.2f"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r14, r2)
            r16.mo13557y()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r14[r7] = r11
            java.lang.String r11 = "%.2f"
            java.lang.String r14 = java.lang.String.format(r2, r11, r14)
            java.lang.String r15 = "td_x"
            com.fyber.inneractive.sdk.network.q$b r14 = r8.mo13719a(r15, r14)
            r16.mo13557y()
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r15[r7] = r12
            java.lang.String r2 = java.lang.String.format(r2, r11, r15)
            java.lang.String r11 = "td_y"
            r14.mo13719a(r11, r2)
            boolean r2 = r16.mo13557y()
            if (r2 == 0) goto L_0x0251
            int r2 = com.fyber.inneractive.sdk.util.C3707l.m9967c()
            if (r2 != r10) goto L_0x0249
            java.lang.String r2 = "p"
            goto L_0x024b
        L_0x0249:
            java.lang.String r2 = "l"
        L_0x024b:
            java.lang.String r11 = "o"
            r8.mo13719a(r11, r2)
            goto L_0x026b
        L_0x0251:
            int r2 = r16.mo13556x()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r11 = "b_w"
            r8.mo13719a(r11, r2)
            int r2 = r16.mo13555w()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r11 = "b_h"
            r8.mo13719a(r11, r2)
        L_0x026b:
            com.fyber.inneractive.sdk.util.e r2 = com.fyber.inneractive.sdk.util.C3682e.VAST_ENDCARD
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x029f
            AdContent r2 = r0.f9598b
            if (r2 == 0) goto L_0x0284
            com.fyber.inneractive.sdk.config.global.s r2 = r2.f9592c
            if (r2 == 0) goto L_0x0284
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.b> r3 = com.fyber.inneractive.sdk.config.global.features.C2641b.class
            com.fyber.inneractive.sdk.config.global.features.e r2 = r2.mo13264a(r3)
            com.fyber.inneractive.sdk.config.global.features.b r2 = (com.fyber.inneractive.sdk.config.global.features.C2641b) r2
            goto L_0x0285
        L_0x0284:
            r2 = 0
        L_0x0285:
            if (r2 == 0) goto L_0x0293
            com.fyber.inneractive.sdk.model.vast.a r2 = r2.f9301e
            if (r2 == 0) goto L_0x028e
            boolean r2 = r2.f9736d
            goto L_0x028f
        L_0x028e:
            r2 = 0
        L_0x028f:
            if (r2 == 0) goto L_0x0293
            r2 = 1
            goto L_0x0294
        L_0x0293:
            r2 = 0
        L_0x0294:
            if (r2 == 0) goto L_0x029f
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            java.lang.String r2 = r2.f9228p
            java.lang.String r3 = "cta_lng"
            r8.mo13719a(r3, r2)
        L_0x029f:
            org.json.JSONArray r2 = r4.f10045f
            org.json.JSONObject r3 = r8.f10055a
            r2.put(r3)
            r2 = 0
            r4.mo13717a((java.lang.String) r2)
        L_0x02aa:
            if (r1 == 0) goto L_0x02d2
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r2 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r16)
            r1[r7] = r2
            java.lang.String r2 = "%sBlocking clicks until grace has ended"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            r0.f9605i = r7
            java.lang.Runnable r1 = r0.f9606j
            if (r1 == 0) goto L_0x02c4
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.C3714n.f12902b
            r2.removeCallbacks(r1)
        L_0x02c4:
            com.fyber.inneractive.sdk.flow.k r1 = new com.fyber.inneractive.sdk.flow.k
            r1.<init>(r0)
            r0.f9606j = r1
            android.os.Handler r2 = com.fyber.inneractive.sdk.util.C3714n.f12902b
            r3 = 1500(0x5dc, double:7.41E-321)
            r2.postDelayed(r1, r3)
        L_0x02d2:
            com.fyber.inneractive.sdk.util.d0$c r1 = r5.f12835a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPEN_IN_EXTERNAL_APPLICATION
            if (r1 != r2) goto L_0x02e8
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: handleOpenResult - opened in external application"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            EventsListener r1 = r0.f9599c
            if (r1 == 0) goto L_0x035a
            r16.mo13545B()
            goto L_0x035a
        L_0x02e8:
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPENED_IN_INTERNAL_BROWSER
            if (r1 != r2) goto L_0x02f9
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: handleOpenResult - opened in internal browser"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            r0.f9600d = r10
            com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.setInternalBrowserListener(r16)
            goto L_0x035a
        L_0x02f9:
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPEN_IN_EXTERNAL_BROWSER
            if (r1 == r2) goto L_0x0301
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPENED_USING_CHROME_NAVIGATE
            if (r1 != r2) goto L_0x035a
        L_0x0301:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r3 = "InneractiveAdRendererImpl: handleOpenResult - opened in external browser"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r3, r2)
            AdContent r2 = r0.f9598b
            if (r2 == 0) goto L_0x0315
            com.fyber.inneractive.sdk.response.e r2 = r2.mo13293c()
            AdContent r3 = r0.f9598b
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r3 = r3.f9590a
            goto L_0x0317
        L_0x0315:
            r2 = 0
            r3 = 0
        L_0x0317:
            com.fyber.inneractive.sdk.network.q$a r4 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.p r8 = com.fyber.inneractive.sdk.network.C2924p.EXTERNAL_BROWSER_OPENED
            r4.<init>(r2)
            r4.f10042c = r8
            r4.f10040a = r3
            r2 = 0
            r4.f10043d = r2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r2[r7] = r6
            r2[r10] = r9
            com.fyber.inneractive.sdk.network.q$a r2 = r4.mo13716a((java.lang.Object[]) r2)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "fallback"
            r3[r7] = r4
            com.fyber.inneractive.sdk.util.d0$c r4 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.OPENED_USING_CHROME_NAVIGATE
            if (r1 != r4) goto L_0x033d
            java.lang.String r1 = "chrome"
            goto L_0x033f
        L_0x033d:
            java.lang.String r1 = "na"
        L_0x033f:
            r3[r10] = r1
            AdContent r1 = r0.f9598b
            com.fyber.inneractive.sdk.config.global.s r1 = r1.f9592c
            org.json.JSONArray r1 = r1.mo13268c()
            r3[r13] = r1
            com.fyber.inneractive.sdk.network.q$a r1 = r2.mo13716a((java.lang.Object[]) r3)
            r2 = 0
            r1.mo13717a((java.lang.String) r2)
            EventsListener r1 = r0.f9599c
            if (r1 == 0) goto L_0x035a
            r16.mo13545B()
        L_0x035a:
            return r5
        L_0x035b:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = "InneractiveAdRendererImpl: openClickThroughUrl - external/browser is already opened"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r1)
            com.fyber.inneractive.sdk.util.d0$a r1 = new com.fyber.inneractive.sdk.util.d0$a
            com.fyber.inneractive.sdk.util.d0$c r2 = com.fyber.inneractive.sdk.util.C3677d0.C3680c.FAILED
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "external/browser is already open"
            r3.<init>(r4)
            r1.<init>(r2, r3, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C2778l.mo13548a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.p0, com.fyber.inneractive.sdk.util.e):com.fyber.inneractive.sdk.util.d0$a");
    }

    /* renamed from: b */
    public void mo13554b(String str) {
        C2904h0 h0Var = new C2904h0(new C2779a(this, str, System.currentTimeMillis()), str);
        IAConfigManager.f9202J.f9232t.f10064a.offer(h0Var);
        h0Var.mo13666a(C2916m0.QUEUED);
    }

    /* renamed from: a */
    public void mo13551a(C3648e eVar) {
        String str = eVar.f12754l;
        if (str != null && str.trim().length() > 0) {
            IAlog.m9900a(1, (Exception) null, "AD_CLICKED", new Object[0]);
            mo13554b(str);
        }
    }

    /* renamed from: a */
    public void mo13552a(String str) {
        if (!this.f9603g) {
            this.f9603g = true;
            C2924p pVar = C2924p.VAST_EVENT_COMPANION_CLICKED;
            AdContent adcontent = this.f9598b;
            InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f9590a : null;
            C3648e c = adcontent != null ? adcontent.mo13293c() : null;
            AdContent adcontent2 = this.f9598b;
            JSONArray c2 = adcontent2 != null ? adcontent2.f9592c.mo13268c() : null;
            C2926q.C2927a aVar = new C2926q.C2927a(c);
            aVar.f10042c = pVar;
            aVar.f10040a = inneractiveAdRequest;
            aVar.f10043d = c2;
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "na";
            }
            try {
                jSONObject.put("mime", str);
            } catch (Exception unused) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "mime", str);
            }
            aVar.f10045f.put(jSONObject);
            aVar.mo13717a((String) null);
        }
    }

    /* renamed from: a */
    public void mo13550a(InneractiveUnitController.AdDisplayError adDisplayError) {
        String simpleName = adDisplayError.getClass().getSimpleName();
        String message = adDisplayError.getMessage();
        AdContent adcontent = this.f9598b;
        C3648e eVar = null;
        InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f9590a : null;
        if (adcontent != null) {
            eVar = adcontent.mo13293c();
        }
        C2931r.m7253a(simpleName, message, inneractiveAdRequest, eVar);
        if (this.f9599c != null) {
            IAlog.m9902a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.m9899a((Object) this), adDisplayError.getMessage());
            this.f9599c.onAdEnteredErrorState(this.f9597a, adDisplayError);
        }
    }

    /* renamed from: a */
    public void mo13549a(C2607a aVar, C2608b bVar) {
        C2604d dVar = IAConfigManager.f9202J.f9236x.f9278a;
        if (dVar != null) {
            C3714n.m9976a(new C2603c(dVar, aVar, bVar));
        }
    }
}
