package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.appboy.Constants;
import com.appboy.models.outgoing.AttributionData;
import com.appsflyer.ServerParameters;
import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.config.C2619a0;
import com.fyber.inneractive.sdk.config.C2684r;
import com.fyber.inneractive.sdk.config.C2699v;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3706k0;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p988j$.util.DesugarTimeZone;

/* renamed from: com.fyber.inneractive.sdk.network.q */
public final class C2926q extends C2911k {

    /* renamed from: com.fyber.inneractive.sdk.network.q$b */
    public static class C2929b {

        /* renamed from: a */
        public JSONObject f10055a = new JSONObject();

        /* renamed from: a */
        public C2929b mo13719a(String str, Object obj) {
            try {
                this.f10055a.put(str, obj);
            } catch (Exception unused) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", str, obj);
            }
            return this;
        }
    }

    public C2926q(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        super(C2618a.m6643b());
        mo13710a("osn", "Android");
        mo13710a("osv", Build.VERSION.RELEASE);
        mo13710a(ServerParameters.MODEL, C3705k.m9946h());
        mo13710a("sdkv", str7 == null ? "8.1.5" : str7);
        mo13710a("pkgn", C3705k.m9949k());
        mo13710a("pkgv", C3705k.m9950l());
        mo13710a("appid", str);
        mo13710a("session", str2);
        mo13710a("adnt", str3);
        mo13710a("adnt_id", l);
        mo13710a("creative_id", str4);
        mo13710a("adomain", str5);
        mo13710a(GetBrowserSessionContextCommand.KEY_CAMPAIGN_ID, str6);
    }

    /* renamed from: com.fyber.inneractive.sdk.network.q$a */
    public static class C2927a {

        /* renamed from: h */
        public static final SimpleDateFormat f10039h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

        /* renamed from: a */
        public InneractiveAdRequest f10040a;

        /* renamed from: b */
        public C2922o f10041b;

        /* renamed from: c */
        public C2924p f10042c;

        /* renamed from: d */
        public JSONArray f10043d;

        /* renamed from: e */
        public C3648e f10044e;

        /* renamed from: f */
        public JSONArray f10045f;

        /* renamed from: g */
        public boolean f10046g;

        /* renamed from: com.fyber.inneractive.sdk.network.q$a$a */
        public class C2928a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2926q f10047a;

            /* renamed from: b */
            public final /* synthetic */ String f10048b;

            /* renamed from: c */
            public final /* synthetic */ String f10049c;

            /* renamed from: d */
            public final /* synthetic */ String f10050d;

            /* renamed from: e */
            public final /* synthetic */ String f10051e;

            /* renamed from: f */
            public final /* synthetic */ Object f10052f;

            /* renamed from: g */
            public final /* synthetic */ String f10053g;

            public C2928a(C2926q qVar, String str, String str2, String str3, String str4, Object obj, String str5) {
                this.f10047a = qVar;
                this.f10048b = str;
                this.f10049c = str2;
                this.f10050d = str3;
                this.f10051e = str4;
                this.f10052f = obj;
                this.f10053g = str5;
            }

            public void run() {
                String str;
                String str2;
                boolean z;
                Map<String, Object> map;
                this.f10047a.mo13710a("contentid", this.f10048b);
                this.f10047a.mo13710a("fairbidv", this.f10049c);
                C2927a aVar = C2927a.this;
                C2922o oVar = aVar.f10041b;
                if (oVar != null) {
                    this.f10047a.mo13710a("err", Integer.valueOf(oVar.f10009a));
                    C2927a.this.f10041b.getClass();
                    IAlog.m9902a("Event dispatcher - dispatching error: %s", C2927a.this.f10041b);
                    IAlog.m9900a(1, (Exception) null, "%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(C2927a.this.f10041b.f10009a));
                    str = "sdk_error_";
                } else {
                    C2924p pVar = aVar.f10042c;
                    if (pVar != null) {
                        this.f10047a.mo13710a("event", Integer.valueOf(pVar.f10036a));
                        C2927a.this.f10042c.getClass();
                        IAlog.m9902a("Event dispatcher - dispatching event: %s", C2927a.this.f10042c);
                        IAlog.m9900a(1, (Exception) null, "%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(C2927a.this.f10042c.f10036a));
                        str = "sdk_event_";
                    } else {
                        str = null;
                    }
                }
                if (!TextUtils.isEmpty(this.f10050d)) {
                    this.f10047a.mo13710a("placement_type", this.f10050d);
                }
                if (!TextUtils.isEmpty(this.f10051e)) {
                    this.f10047a.mo13710a("spot_id", this.f10051e);
                }
                this.f10047a.mo13710a("ciso", C3705k.m9945g());
                this.f10047a.mo13710a("ad_type", this.f10052f);
                if (C2927a.this.f10046g && !TextUtils.isEmpty(this.f10053g)) {
                    this.f10047a.f9930c = this.f10053g;
                }
                Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                this.f10047a.mo13710a("n", C3706k0.m9954f().f12892a);
                this.f10047a.mo13710a("date_created", Long.valueOf(instance.getTimeInMillis()));
                try {
                    this.f10047a.mo13710a("day", C2927a.f10039h.format(instance.getTime()));
                } catch (Throwable unused) {
                }
                this.f10047a.mo13710a("hour", Integer.valueOf(instance.get(11)));
                C2926q qVar = this.f10047a;
                StringBuilder k = C13555b.m33972k(str);
                C2927a aVar2 = C2927a.this;
                C2922o oVar2 = aVar2.f10041b;
                if (oVar2 != null) {
                    str2 = String.valueOf(oVar2.f10009a);
                } else {
                    str2 = String.valueOf(aVar2.f10042c.f10036a);
                }
                k.append(str2);
                qVar.mo13710a("table", k.toString());
                JSONArray jSONArray = C2927a.this.f10043d;
                if (jSONArray != null && jSONArray.length() > 0) {
                    this.f10047a.mo13710a("experiments", C2927a.this.f10043d);
                }
                C3648e eVar = C2927a.this.f10044e;
                if (eVar != null && eVar.f12742A) {
                    this.f10047a.mo13710a("sdk_bidding", DiskLruCache.VERSION_1);
                }
                JSONArray jSONArray2 = C2927a.this.f10045f;
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    this.f10047a.mo13710a(Constants.APPBOY_PUSH_EXTRAS_KEY, C2927a.this.f10045f);
                }
                C2926q qVar2 = this.f10047a;
                qVar2.getClass();
                if (TextUtils.isEmpty(qVar2.f9928a) || (map = qVar2.f9929b) == null || map.size() == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C2891c cVar = IAConfigManager.f9202J.f9210G;
                    cVar.getClass();
                    JSONObject jSONObject = new JSONObject();
                    Map<String, Object> map2 = qVar2.f9929b;
                    for (String next : map2.keySet()) {
                        Object obj = map2.get(next);
                        if (obj != null) {
                            try {
                                jSONObject.put(next, obj);
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                    String str3 = qVar2.f9930c;
                    if (str3 != null) {
                        int length = str3.length();
                        if (length > 51200) {
                            int indexOf = str3.indexOf("iawrapper");
                            if (indexOf == -1) {
                                indexOf = 0;
                            }
                            str3 = str3.substring(indexOf, 51199);
                            IAlog.m9902a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
                        }
                        try {
                            jSONObject.put(AttributionData.CREATIVE_KEY, str3);
                        } catch (JSONException e) {
                            IAlog.m9901a("Failed inserting ad body to json", e, new Object[0]);
                        }
                    }
                    if (IAlog.f12814a == 1) {
                        try {
                            IAlog.m9900a(1, (Exception) null, "%s, Event: %s", "SDK_EVENT", jSONObject.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                    cVar.f9876a.offer(jSONObject);
                    if (cVar.f9876a.size() > 30) {
                        Handler handler = cVar.f9879d;
                        if (handler != null && handler.hasMessages(12312329)) {
                            cVar.f9879d.removeMessages(12312329);
                        }
                        cVar.mo13682a(12312329, 0);
                    }
                }
            }
        }

        public C2927a(C2922o oVar, InneractiveAdRequest inneractiveAdRequest, C3648e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f10041b = oVar;
            this.f10040a = inneractiveAdRequest;
            this.f10043d = null;
        }

        /* renamed from: a */
        public C2927a mo13716a(Object... objArr) {
            if (objArr.length > 0) {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < objArr.length - 1; i += 2) {
                    String obj = objArr[i].toString();
                    Object obj2 = objArr[i + 1];
                    try {
                        jSONObject.put(obj, obj2);
                    } catch (Exception unused) {
                        IAlog.m9906e("Got exception adding param to json object: %s, %s", obj, obj2);
                    }
                }
                this.f10045f.put(jSONObject);
            }
            return this;
        }

        public C2927a(C2924p pVar, InneractiveAdRequest inneractiveAdRequest, C3648e eVar, JSONArray jSONArray) {
            this(eVar);
            this.f10042c = pVar;
            this.f10040a = inneractiveAdRequest;
            this.f10043d = null;
        }

        /* renamed from: a */
        public void mo13717a(String str) {
            String str2;
            String str3;
            String str4;
            Long l;
            String str5;
            String str6;
            String str7;
            String str8;
            UnitDisplayType unitDisplayType;
            Integer num;
            String str9;
            boolean z;
            boolean z2;
            UnitDisplayType unitDisplayType2;
            UnitDisplayType unitDisplayType3;
            C3648e eVar = this.f10044e;
            if (eVar != null) {
                ImpressionData impressionData = eVar.f12760r;
                String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
                ImpressionData impressionData2 = this.f10044e.f12760r;
                String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
                ImpressionData impressionData3 = this.f10044e.f12760r;
                Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
                ImpressionData impressionData4 = this.f10044e.f12760r;
                String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
                ImpressionData impressionData5 = this.f10044e.f12760r;
                String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
                ImpressionData impressionData6 = this.f10044e.f12760r;
                if (impressionData6 != null) {
                    str6 = impressionId;
                    str5 = demandSource;
                    l = demandId;
                    str4 = creativeId;
                    str3 = advertiserDomain;
                    str2 = impressionData6.getCampaignId();
                } else {
                    str6 = impressionId;
                    str2 = null;
                    str5 = demandSource;
                    l = demandId;
                    str4 = creativeId;
                    str3 = advertiserDomain;
                }
            } else {
                str6 = null;
                str5 = null;
                l = null;
                str4 = null;
                str3 = null;
                str2 = null;
            }
            IAConfigManager iAConfigManager = IAConfigManager.f9202J;
            C2926q qVar = new C2926q(iAConfigManager.f9215c, str6, str5, l, str4, str3, str2, str);
            InneractiveAdRequest inneractiveAdRequest = this.f10040a;
            C2703z selectedUnitConfig = inneractiveAdRequest == null ? null : inneractiveAdRequest.getSelectedUnitConfig();
            if (selectedUnitConfig != null) {
                C2702y yVar = (C2702y) selectedUnitConfig;
                C2699v vVar = yVar.f9425d;
                Track track = Track.ERRORS;
                Set<Track> set = vVar.f9418a;
                if (set == null) {
                    z = false;
                } else {
                    z = set.contains(track);
                }
                if (z) {
                    C2684r rVar = yVar.f9424c;
                    if (rVar == null || (unitDisplayType3 = rVar.f9368b) == null) {
                        C2619a0 a0Var = yVar.f9427f;
                        z2 = (a0Var == null || (unitDisplayType2 = a0Var.f9256j) == null) ? false : unitDisplayType2.isDeprecated();
                    } else {
                        z2 = unitDisplayType3.isDeprecated();
                    }
                    if (z2) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C3648e eVar2 = this.f10044e;
            if (eVar2 == null) {
                str7 = null;
            } else {
                str7 = eVar2.f12746d;
            }
            if (TextUtils.isEmpty(iAConfigManager.f9233u)) {
                str8 = null;
            } else {
                str8 = iAConfigManager.f9233u;
            }
            if (this.f10041b == null && this.f10042c == null) {
                IAlog.m9902a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
                return;
            }
            InneractiveAdRequest inneractiveAdRequest2 = this.f10040a;
            String spotId = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSpotId();
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(iAConfigManager.f9225m)) {
                sb.append(iAConfigManager.f9225m);
                sb.append("_");
            }
            C3648e eVar3 = this.f10044e;
            if (eVar3 == null) {
                unitDisplayType = null;
            } else {
                unitDisplayType = eVar3.f12756n;
            }
            sb.append(unitDisplayType != null ? unitDisplayType.toString() : "unknown");
            String sb2 = sb.toString();
            C3648e eVar4 = this.f10044e;
            if (eVar4 == null) {
                num = null;
            } else {
                num = Integer.valueOf(eVar4.f12749g);
            }
            C3648e eVar5 = this.f10044e;
            if (eVar5 == null) {
                str9 = "";
            } else {
                str9 = eVar5.f12750h;
            }
            C3714n.m9976a(new C2928a(qVar, str7, str8, sb2, spotId, num, str9));
        }

        public C2927a(C3648e eVar) {
            this.f10046g = false;
            this.f10044e = eVar;
            this.f10045f = new JSONArray();
        }
    }
}
