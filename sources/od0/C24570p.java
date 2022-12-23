package od0;

import android.content.ContentValues;
import com.appboy.models.outgoing.AttributionData;
import com.appsflyer.ServerParameters;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import od0.C24568o;
import p509gg.C17189a;
import p584jl.C17885a;
import td0.C24931b;

/* renamed from: od0.p */
public final class C24570p implements C24931b<C24568o> {

    /* renamed from: a */
    public Gson f62297a = new GsonBuilder().create();

    /* renamed from: b */
    public Type f62298b = new C24571a().f44432b;

    /* renamed from: c */
    public Type f62299c = new C24572b().f44432b;

    /* renamed from: od0.p$a */
    public class C24571a extends C17189a<ArrayList<String>> {
    }

    /* renamed from: od0.p$b */
    public class C24572b extends C17189a<ArrayList<C24568o.C24569a>> {
    }

    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        C24568o oVar = (C24568o) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("item_id", oVar.mo60837a());
        contentValues.put("ad_duration", Long.valueOf(oVar.f62279k));
        contentValues.put("adStartTime", Long.valueOf(oVar.f62276h));
        contentValues.put("adToken", oVar.f62271c);
        contentValues.put("ad_type", oVar.f62286r);
        contentValues.put("appId", oVar.f62272d);
        contentValues.put(AttributionData.CAMPAIGN_KEY, oVar.f62281m);
        contentValues.put("incentivized", Boolean.valueOf(oVar.f62273e));
        contentValues.put("header_bidding", Boolean.valueOf(oVar.f62274f));
        contentValues.put(MediationMetaData.KEY_ORDINAL, Integer.valueOf(oVar.f62289u));
        contentValues.put("placementId", oVar.f62270b);
        contentValues.put("template_id", oVar.f62287s);
        contentValues.put("tt_download", Long.valueOf(oVar.f62280l));
        contentValues.put("url", oVar.f62277i);
        contentValues.put("user_id", oVar.f62288t);
        contentValues.put("videoLength", Long.valueOf(oVar.f62278j));
        contentValues.put("videoViewed", Integer.valueOf(oVar.f62282n));
        contentValues.put("was_CTAC_licked", Boolean.valueOf(oVar.f62291w));
        contentValues.put("user_actions", this.f62297a.toJson((Object) new ArrayList(oVar.f62283o), this.f62299c));
        contentValues.put("clicked_through", this.f62297a.toJson((Object) new ArrayList(oVar.f62284p), this.f62298b));
        contentValues.put("errors", this.f62297a.toJson((Object) new ArrayList(oVar.f62285q), this.f62298b));
        contentValues.put(ServerParameters.STATUS, Integer.valueOf(oVar.f62269a));
        contentValues.put("ad_size", oVar.f62290v);
        contentValues.put("init_timestamp", Long.valueOf(oVar.f62292x));
        contentValues.put("asset_download_duration", Long.valueOf(oVar.f62293y));
        contentValues.put("play_remote_url", Boolean.valueOf(oVar.f62275g));
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "report";
    }

    /* renamed from: c */
    public final Object mo60803c(ContentValues contentValues) {
        C24568o oVar = new C24568o();
        oVar.f62279k = contentValues.getAsLong("ad_duration").longValue();
        oVar.f62276h = contentValues.getAsLong("adStartTime").longValue();
        oVar.f62271c = contentValues.getAsString("adToken");
        oVar.f62286r = contentValues.getAsString("ad_type");
        oVar.f62272d = contentValues.getAsString("appId");
        oVar.f62281m = contentValues.getAsString(AttributionData.CAMPAIGN_KEY);
        oVar.f62289u = contentValues.getAsInteger(MediationMetaData.KEY_ORDINAL).intValue();
        oVar.f62270b = contentValues.getAsString("placementId");
        oVar.f62287s = contentValues.getAsString("template_id");
        oVar.f62280l = contentValues.getAsLong("tt_download").longValue();
        oVar.f62277i = contentValues.getAsString("url");
        oVar.f62288t = contentValues.getAsString("user_id");
        oVar.f62278j = contentValues.getAsLong("videoLength").longValue();
        oVar.f62282n = contentValues.getAsInteger("videoViewed").intValue();
        oVar.f62291w = C17885a.m44420Q(contentValues, "was_CTAC_licked");
        oVar.f62273e = C17885a.m44420Q(contentValues, "incentivized");
        oVar.f62274f = C17885a.m44420Q(contentValues, "header_bidding");
        oVar.f62269a = contentValues.getAsInteger(ServerParameters.STATUS).intValue();
        oVar.f62290v = contentValues.getAsString("ad_size");
        oVar.f62292x = contentValues.getAsLong("init_timestamp").longValue();
        oVar.f62293y = contentValues.getAsLong("asset_download_duration").longValue();
        oVar.f62275g = C17885a.m44420Q(contentValues, "play_remote_url");
        List list = (List) this.f62297a.fromJson(contentValues.getAsString("clicked_through"), this.f62298b);
        List list2 = (List) this.f62297a.fromJson(contentValues.getAsString("errors"), this.f62298b);
        List list3 = (List) this.f62297a.fromJson(contentValues.getAsString("user_actions"), this.f62299c);
        if (list != null) {
            oVar.f62284p.addAll(list);
        }
        if (list2 != null) {
            oVar.f62285q.addAll(list2);
        }
        if (list3 != null) {
            oVar.f62283o.addAll(list3);
        }
        return oVar;
    }
}
