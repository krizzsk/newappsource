package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import p358af.C13437d;
import p583jk.C17884p;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKAppContentJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKAppContent;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKAppContentJsonAdapter */
public final class AKAppContentJsonAdapter extends C8011k<AKAppContent> {

    /* renamed from: a */
    public final JsonReader.C7986a f7380a = JsonReader.C7986a.m18216a("id", "episode", "title", "series", "season", "artist", "genre", "album", "isrc", "url", "cat", "prodq", AppActionRequest.KEY_CONTEXT, "contentrating", "userrating", "qagmediarating", "keywords", "livestream", "sourcerelationship", "len", "language", "embeddable", "producer");

    /* renamed from: b */
    public final C8011k<String> f7381b;

    /* renamed from: c */
    public final C8011k<Integer> f7382c;

    /* renamed from: d */
    public final C8011k<List<String>> f7383d;

    /* renamed from: e */
    public final C8011k<AKAppContentProducer> f7384e;

    public AKAppContentJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7381b = C18201b.m44910D(oVar2, cls, "id");
        this.f7382c = C18201b.m44910D(oVar2, Integer.class, "episode");
        this.f7383d = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, cls), "cat");
        this.f7384e = C18201b.m44910D(oVar2, AKAppContentProducer.class, "producer");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        AKAppContentProducer aKAppContentProducer = null;
        boolean z = false;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        List list = null;
        Integer num2 = null;
        Integer num3 = null;
        String str10 = null;
        String str11 = null;
        Integer num4 = null;
        String str12 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        String str13 = null;
        Integer num8 = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader2.mo24989O(this.f7380a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    str = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 1:
                    num = this.f7382c.mo11093a(jsonReader2);
                    break;
                case 2:
                    str2 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 3:
                    str3 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 4:
                    str4 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 5:
                    str5 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 6:
                    str6 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 7:
                    str7 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 8:
                    str8 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 9:
                    str9 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 10:
                    list = this.f7383d.mo11093a(jsonReader2);
                    break;
                case 11:
                    num2 = this.f7382c.mo11093a(jsonReader2);
                    break;
                case 12:
                    num3 = this.f7382c.mo11093a(jsonReader2);
                    break;
                case 13:
                    str10 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 14:
                    str11 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 15:
                    num4 = this.f7382c.mo11093a(jsonReader2);
                    break;
                case 16:
                    str12 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 17:
                    num5 = this.f7382c.mo11093a(jsonReader2);
                    break;
                case 18:
                    num6 = this.f7382c.mo11093a(jsonReader2);
                    break;
                case 19:
                    num7 = this.f7382c.mo11093a(jsonReader2);
                    break;
                case 20:
                    str13 = this.f7381b.mo11093a(jsonReader2);
                    break;
                case 21:
                    num8 = this.f7382c.mo11093a(jsonReader2);
                    break;
                case 22:
                    aKAppContentProducer = this.f7384e.mo11093a(jsonReader2);
                    z = true;
                    break;
            }
        }
        jsonReader.mo24997r();
        AKAppContent aKAppContent = new AKAppContent(str, num, str2, str3, str4, str5, str6, str7, str8, str9, list, num2, num3, str10, str11, num4, str12, num5, num6, num7, str13, num8);
        if (z) {
            aKAppContent.f7379w = aKAppContentProducer;
        }
        return aKAppContent;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKAppContent aKAppContent = (AKAppContent) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKAppContent != null) {
            kVar.mo25074i();
            kVar.mo25077w("id");
            this.f7381b.mo11094e(kVar, aKAppContent.f7357a);
            kVar.mo25077w("episode");
            this.f7382c.mo11094e(kVar, aKAppContent.f7358b);
            kVar.mo25077w("title");
            this.f7381b.mo11094e(kVar, aKAppContent.f7359c);
            kVar.mo25077w("series");
            this.f7381b.mo11094e(kVar, aKAppContent.f7360d);
            kVar.mo25077w("season");
            this.f7381b.mo11094e(kVar, aKAppContent.f7361e);
            kVar.mo25077w("artist");
            this.f7381b.mo11094e(kVar, aKAppContent.f7362f);
            kVar.mo25077w("genre");
            this.f7381b.mo11094e(kVar, aKAppContent.f7363g);
            kVar.mo25077w("album");
            this.f7381b.mo11094e(kVar, aKAppContent.f7364h);
            kVar.mo25077w("isrc");
            this.f7381b.mo11094e(kVar, aKAppContent.f7365i);
            kVar.mo25077w("url");
            this.f7381b.mo11094e(kVar, aKAppContent.f7366j);
            kVar.mo25077w("cat");
            this.f7383d.mo11094e(kVar, aKAppContent.f7367k);
            kVar.mo25077w("prodq");
            this.f7382c.mo11094e(kVar, aKAppContent.f7368l);
            kVar.mo25077w(AppActionRequest.KEY_CONTEXT);
            this.f7382c.mo11094e(kVar, aKAppContent.f7369m);
            kVar.mo25077w("contentrating");
            this.f7381b.mo11094e(kVar, aKAppContent.f7370n);
            kVar.mo25077w("userrating");
            this.f7381b.mo11094e(kVar, aKAppContent.f7371o);
            kVar.mo25077w("qagmediarating");
            this.f7382c.mo11094e(kVar, aKAppContent.f7372p);
            kVar.mo25077w("keywords");
            this.f7381b.mo11094e(kVar, aKAppContent.f7373q);
            kVar.mo25077w("livestream");
            this.f7382c.mo11094e(kVar, aKAppContent.f7374r);
            kVar.mo25077w("sourcerelationship");
            this.f7382c.mo11094e(kVar, aKAppContent.f7375s);
            kVar.mo25077w("len");
            this.f7382c.mo11094e(kVar, aKAppContent.f7376t);
            kVar.mo25077w("language");
            this.f7381b.mo11094e(kVar, aKAppContent.f7377u);
            kVar.mo25077w("embeddable");
            this.f7382c.mo11094e(kVar, aKAppContent.f7378v);
            kVar.mo25077w("producer");
            this.f7384e.mo11094e(kVar, aKAppContent.f7379w);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(34, "AKAppContent");
    }
}
