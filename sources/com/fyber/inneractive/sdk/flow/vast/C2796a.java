package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.vast.C2799c;
import com.fyber.inneractive.sdk.measurement.C2824h;
import com.fyber.inneractive.sdk.measurement.C2825i;
import com.fyber.inneractive.sdk.measurement.C2826j;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2836c;
import com.fyber.inneractive.sdk.model.vast.C2837d;
import com.fyber.inneractive.sdk.model.vast.C2838e;
import com.fyber.inneractive.sdk.model.vast.C2839f;
import com.fyber.inneractive.sdk.model.vast.C2840g;
import com.fyber.inneractive.sdk.model.vast.C2841h;
import com.fyber.inneractive.sdk.model.vast.C2842i;
import com.fyber.inneractive.sdk.model.vast.C2843j;
import com.fyber.inneractive.sdk.model.vast.C2845l;
import com.fyber.inneractive.sdk.model.vast.C2846m;
import com.fyber.inneractive.sdk.model.vast.C2847n;
import com.fyber.inneractive.sdk.model.vast.C2849p;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.model.vast.C2853s;
import com.fyber.inneractive.sdk.player.C3423f;
import com.fyber.inneractive.sdk.response.C3652i;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.a */
public class C2796a {

    /* renamed from: a */
    public int f9649a = -1;

    /* renamed from: b */
    public int f9650b = -1;

    /* renamed from: c */
    public int f9651c = -1;

    /* renamed from: d */
    public boolean f9652d = false;

    /* renamed from: e */
    public boolean f9653e = false;

    /* renamed from: f */
    public Map<C2846m, C2799c> f9654f = new LinkedHashMap();

    /* renamed from: g */
    public List<C2839f> f9655g = new ArrayList();

    /* renamed from: h */
    public final List<C2839f> f9656h = new ArrayList();

    /* renamed from: i */
    public final List<C2825i> f9657i = new ArrayList();

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.a$a */
    public class C2797a extends Exception {

        /* renamed from: a */
        public int f9658a;

        public C2797a(C2796a aVar, String str, int i) {
            super(str);
            this.f9658a = i;
        }
    }

    /* renamed from: a */
    public void mo13584a(C2835b bVar, C2839f fVar, boolean z) throws C2797a {
        Integer num;
        String str;
        List<C2849p> list;
        String str2;
        Integer num2;
        C2839f fVar2 = fVar;
        List<String> list2 = fVar2.f9768h;
        if (list2 != null) {
            if (z) {
                this.f9656h.add(fVar2);
            }
            for (String f : list2) {
                if (!C3677d0.m9925f(f)) {
                    throw new C2797a(this, "Found non secure click tracking url for companion: " + fVar2, 0);
                }
            }
        }
        String str3 = fVar2.f9767g;
        if (C3677d0.m9925f(str3)) {
            Integer num3 = fVar2.f9761a;
            Integer num4 = fVar2.f9762b;
            boolean z2 = true;
            if (num3 != null && num4 != null && num3.intValue() >= 100 && num4.intValue() >= 100) {
                String str4 = fVar2.f9763c;
                List<C2849p> list3 = fVar2.f9770j;
                if (list3 != null) {
                    for (C2849p next : list3) {
                        if (!C3677d0.m9925f(next.f9805b)) {
                            throw new C2797a(this, "Found non secure tracking event: " + next, 0);
                        }
                    }
                }
                if (TextUtils.isEmpty(fVar2.f9765e) && TextUtils.isEmpty(fVar2.f9766f) && fVar2.f9764d == null) {
                    z2 = false;
                }
                if (z2) {
                    String str5 = fVar2.f9765e;
                    if (C3677d0.m9925f(str5)) {
                        C2842i iVar = fVar2.f9764d;
                        if (iVar != null) {
                            String str6 = iVar.f9779a;
                            C2841h hVar = C2841h.Gif;
                            C2841h hVar2 = !TextUtils.isEmpty(str6) ? (C2841h) ((HashMap) C2841h.f9776c).get(str6.toLowerCase()) : null;
                            if (hVar2 != null) {
                                str2 = str5;
                                list = list3;
                                str = str4;
                                num = num4;
                                num2 = num3;
                                mo13585a(bVar, C2840g.Static, z, num3.intValue(), num4.intValue(), str4, str3, list2, list, iVar.f9780b, hVar2);
                            } else {
                                StringBuilder k = C13555b.m33972k("Found invalid creative type:");
                                k.append(iVar.f9779a);
                                throw new C2797a(this, k.toString(), 0);
                            }
                        } else {
                            str2 = str5;
                            list = list3;
                            str = str4;
                            num = num4;
                            num2 = num3;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            mo13585a(bVar, C2840g.Iframe, z, num2.intValue(), num.intValue(), str, str3, list2, list, str2, (C2841h) null);
                        }
                        String str7 = fVar2.f9766f;
                        if (!TextUtils.isEmpty(str7)) {
                            mo13585a(bVar, C2840g.Html, z, num2.intValue(), num.intValue(), str, str3, list2, list, str7, (C2841h) null);
                            return;
                        }
                        return;
                    }
                    throw new C2797a(this, C25541a.m63881k("Found non secure iframe url:", str5), 0);
                }
                throw new C2797a(this, "None sources of companion avaliable", 0);
            }
            throw new C2797a(this, "Incompatible size: " + num3 + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + num4, 16);
        }
        throw new C2797a(this, C25541a.m63881k("Found non secure click through url: ", str3), 0);
    }

    /* renamed from: a */
    public C2835b mo13582a(C2837d dVar, List<C2837d> list, String str) throws C2802e {
        IAlog.m9902a("%sprocess started", "VastProcessor: ");
        if (dVar == null || dVar.f9756c == null) {
            IAlog.m9902a("%sno inline found", "VastProcessor: ");
            throw new C2802e("ErrorNoMediaFiles", "Empty inline ad found");
        }
        int e = C3707l.m9972e();
        int d = C3707l.m9970d();
        C2835b bVar = new C2835b(new C2801d(this.f9651c, e, d), new C2798b(e, d));
        bVar.f9737a = str;
        List<C2843j> list2 = dVar.f9756c.f9759c;
        if (list2 == null || list2.isEmpty()) {
            throw new C2802e("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        if (list != null) {
            for (C2837d dVar2 : list) {
                C2853s sVar = dVar2.f9755b;
                if (sVar != null) {
                    mo13583a(bVar, (C2838e) sVar, true);
                }
            }
        }
        mo13583a(bVar, (C2838e) dVar.f9756c, false);
        if (bVar.f9740d.size() != 0) {
            if (IAlog.f12814a == 2) {
                IAlog.m9905d("%sLogging merged model media files: ", "VastProcessor: ");
                Iterator it = new ArrayList(bVar.f9740d).iterator();
                int i = 0;
                while (it.hasNext()) {
                    IAlog.m9905d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i), (C2846m) it.next());
                    i++;
                }
            }
            if (IAlog.f12814a == 2) {
                IAlog.m9905d("%sLogging merged model companion ads: ", "VastProcessor: ");
                ArrayList arrayList = new ArrayList(bVar.f9742f);
                if (arrayList.size() > 0) {
                    Iterator it2 = arrayList.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        IAlog.m9905d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), ((C2836c) it2.next()).mo13636a());
                        i2++;
                    }
                } else {
                    IAlog.m9905d("%sNo companion ads found!", "VastProcessor: ");
                }
            }
            return bVar;
        } else if (this.f9654f.size() == 0) {
            throw new C2802e("ErrorNoMediaFiles", "No media files exist after merge");
        } else {
            throw new C2802e("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
        }
    }

    /* renamed from: a */
    public final void mo13583a(C2835b bVar, C2838e eVar, boolean z) {
        String[] split;
        C2799c cVar;
        Integer num;
        int i;
        List list;
        IAlog.m9902a("%sprocessing ad element: %s", "VastProcessor: ", eVar);
        List<String> list2 = eVar.f9758b;
        if (list2 != null) {
            for (String next : list2) {
                IAlog.m9902a("%sadding impression url: %s", "VastProcessor: ", next);
                mo13586a((C3652i) bVar, C2850q.EVENT_IMPRESSION, next);
            }
        }
        String str = eVar.f9757a;
        if (!TextUtils.isEmpty(str)) {
            IAlog.m9902a("%sadding error url: %s", "VastProcessor: ", str);
            bVar.mo13633a(C2850q.EVENT_ERROR, str);
        }
        if (IAConfigManager.f9202J.f9212I != null) {
            for (C2825i next2 : eVar.f9760d) {
                if (next2.mo13616b()) {
                    bVar.f9741e.add(next2);
                } else {
                    C2850q qVar = C2850q.EVENT_VERIFICATION_NOT_EXECUTED;
                    Map<C2850q, List<String>> map = next2.f9700c;
                    if (map == null || (list = map.get(qVar)) == null) {
                        i = 0;
                    } else {
                        i = list.size();
                    }
                    if (i > 0) {
                        C3423f.m8636a((C3652i) new C2824h(next2, next2.mo13613a(qVar), C2826j.VERIFICATION_NOT_SUPPORTED), qVar);
                    }
                    this.f9657i.add(next2);
                }
            }
        }
        for (C2843j next3 : eVar.f9759c) {
            C2845l lVar = next3.f9781a;
            if (lVar != null) {
                List<C2846m> list3 = lVar.f9783a;
                if (list3 != null) {
                    bVar.f9745i = list3.size();
                    for (C2846m next4 : list3) {
                        C2799c cVar2 = null;
                        if (!next4.f9788a.equals("progressive")) {
                            cVar2 = new C2799c(C2799c.C2800a.UNSUPPORTED_DELIVERY, "progressive");
                        } else {
                            if (!(!(this.f9650b > -1) || (num = next4.f9792e) == null || num.intValue() == 0)) {
                                int intValue = next4.f9792e.intValue();
                                int i2 = this.f9649a;
                                if (intValue < i2) {
                                    cVar2 = new C2799c(C2799c.C2800a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i2));
                                } else {
                                    int intValue2 = next4.f9792e.intValue();
                                    int i3 = this.f9650b;
                                    if (intValue2 > i3) {
                                        cVar2 = new C2799c(C2799c.C2800a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i3));
                                    }
                                }
                            }
                            String str2 = next4.f9791d;
                            HashMap hashMap = (HashMap) C2847n.f9799f;
                            if (!((hashMap.containsKey(str2) ? (C2847n) hashMap.get(str2) : C2847n.UNKNOWN) != C2847n.UNKNOWN)) {
                                cVar = new C2799c(C2799c.C2800a.UNSUPPORTED_MIME_TYPE, (Object) null);
                            } else if (!this.f9652d || next4.f9789b.intValue() < next4.f9790c.intValue()) {
                                String str3 = next4.f9793f;
                                if (str3 != null && this.f9653e && str3.equalsIgnoreCase("VPAID")) {
                                    cVar = new C2799c(C2799c.C2800a.FILTERED_BY_APP_OR_UNIT, (Object) null);
                                } else if (TextUtils.isEmpty(next4.f9794g)) {
                                    cVar = new C2799c(C2799c.C2800a.NO_CONTENT, (Object) null);
                                } else if (!C3677d0.m9925f(next4.f9794g)) {
                                    cVar = new C2799c(C2799c.C2800a.UNSECURED_VIDEO_URL, (Object) null);
                                }
                            } else {
                                cVar = new C2799c(C2799c.C2800a.VERTICAL_VIDEO_EXPECTED, (Object) null);
                            }
                            cVar2 = cVar;
                        }
                        if (cVar2 != null) {
                            IAlog.m9902a("%smedia file filtered!: %s", "VastProcessor: ", next4);
                            IAlog.m9902a("%s-- %s", "VastProcessor: ", next4);
                            IAlog.m9902a("%s-- %s", "VastProcessor: ", cVar2);
                            this.f9654f.put(next4, cVar2);
                        } else {
                            IAlog.m9902a("%sadding media file: %s", "VastProcessor: ", next4);
                            bVar.f9740d.add(next4);
                            bVar.f9744h++;
                        }
                    }
                }
                List<String> list4 = lVar.f9786d;
                if (list4 != null) {
                    for (String a : list4) {
                        mo13586a((C3652i) bVar, C2850q.EVENT_CLICK, a);
                    }
                }
                List<C2849p> list5 = lVar.f9784b;
                if (list5 != null) {
                    for (C2849p next5 : list5) {
                        C2850q a2 = C2850q.m7073a(next5.f9804a);
                        if (a2 != C2850q.UNKNOWN) {
                            bVar.mo13633a(a2, next5.f9805b);
                        }
                    }
                }
                bVar.f9738b = lVar.f9785c;
                String str4 = lVar.f9787e;
                if (!TextUtils.isEmpty(str4) && (split = str4.split(":")) != null && split.length <= 3) {
                    if (split.length == 1) {
                        try {
                            Integer.parseInt(str4);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (split.length == 2) {
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    } else {
                        Integer.parseInt(split[2]);
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    }
                }
            }
            List<C2839f> list6 = next3.f9782b;
            if (list6 != null) {
                for (C2839f next6 : list6) {
                    try {
                        mo13584a(bVar, next6, z);
                    } catch (C2797a e) {
                        IAlog.m9902a("Failed processing companion ad: %s error = %s", next6, e.getMessage());
                        next6.f9769i = e;
                        this.f9655g.add(next6);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13586a(C3652i iVar, C2850q qVar, String str) throws C2802e {
        if (C3677d0.m9925f(str)) {
            ((C2835b) iVar).mo13633a(qVar, str);
            return;
        }
        StringBuilder k = C13555b.m33972k("found unsecure tracking event: ");
        k.append(qVar.f9827a);
        throw new C2802e("VastErrorUnsecure", k.toString());
    }

    /* renamed from: a */
    public void mo13585a(C2835b bVar, C2840g gVar, boolean z, int i, int i2, String str, String str2, List<String> list, List<C2849p> list2, String str3, C2841h hVar) {
        C2836c cVar = new C2836c(gVar, i, i2, str);
        cVar.f9752g = str2;
        if (list2 != null) {
            for (C2849p next : list2) {
                cVar.mo13637a(C2850q.m7073a(next.f9804a), next.f9805b);
            }
        }
        if (list != null) {
            for (String a : list) {
                cVar.mo13637a(C2850q.EVENT_CLICK, a);
            }
        }
        mo13587a(cVar, z);
        cVar.f9751f = str3;
        cVar.f9747b = hVar;
        bVar.f9742f.add(cVar);
    }

    /* renamed from: a */
    public boolean mo13587a(C2836c cVar, boolean z) {
        boolean z2 = false;
        if (!this.f9656h.isEmpty()) {
            C2839f fVar = null;
            if (z) {
                List<C2839f> list = this.f9656h;
                fVar = list.remove(list.size() - 1);
            }
            String str = cVar.f9750e;
            for (C2839f next : this.f9656h) {
                String str2 = next.f9763c;
                if ((str != null && str.equals(str2)) || (str2 == null && cVar.f9748c == next.f9761a.intValue() && cVar.f9749d == next.f9762b.intValue())) {
                    List<String> list2 = next.f9768h;
                    if (list2 != null) {
                        for (String next2 : list2) {
                            if (C3677d0.m9925f(next2)) {
                                cVar.mo13637a(C2850q.EVENT_CLICK, next2);
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (fVar != null) {
                this.f9656h.add(fVar);
            }
        }
        return z2;
    }
}
