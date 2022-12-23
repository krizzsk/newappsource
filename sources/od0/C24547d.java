package od0;

import android.content.ContentValues;
import android.util.Pair;
import com.appboy.models.outgoing.AttributionData;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vungle.warren.AdConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import od0.C24545c;
import p509gg.C17189a;
import p584jl.C17885a;
import td0.C24931b;

/* renamed from: od0.d */
public final class C24547d implements C24931b<C24545c> {

    /* renamed from: e */
    public static final Type f62230e = new C24550c().f44432b;

    /* renamed from: f */
    public static final Type f62231f = new C24551d().f44432b;

    /* renamed from: a */
    public Gson f62232a = new GsonBuilder().create();

    /* renamed from: b */
    public Type f62233b;

    /* renamed from: c */
    public Type f62234c;

    /* renamed from: d */
    public final Type f62235d;

    /* renamed from: od0.d$a */
    public class C24548a extends C17189a<String[]> {
    }

    /* renamed from: od0.d$b */
    public class C24549b extends C17189a<Map<String, String>> {
    }

    /* renamed from: od0.d$c */
    public class C24550c extends C17189a<List<C24545c.C24546a>> {
    }

    /* renamed from: od0.d$d */
    public class C24551d extends C17189a<Map<String, ArrayList<String>>> {
    }

    /* renamed from: od0.d$e */
    public class C24552e extends C17189a<Map<String, Pair<String, String>>> {
    }

    /* renamed from: od0.d$f */
    public class C24553f extends C17189a<List<String>> {
    }

    public C24547d() {
        new C24548a();
        this.f62233b = new C24549b().f44432b;
        this.f62234c = new C24552e().f44432b;
        this.f62235d = new C24553f().f44432b;
    }

    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        C24545c cVar = (C24545c) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("item_id", cVar.f62205d);
        contentValues.put("ad_type", Integer.valueOf(cVar.f62204c));
        contentValues.put("expire_time", Long.valueOf(cVar.f62207f));
        contentValues.put("delay", Integer.valueOf(cVar.f62210i));
        contentValues.put("show_close_delay", Integer.valueOf(cVar.f62212k));
        contentValues.put("show_close_incentivized", Integer.valueOf(cVar.f62213l));
        contentValues.put("countdown", Integer.valueOf(cVar.f62214m));
        contentValues.put("video_width", Integer.valueOf(cVar.f62216o));
        contentValues.put("video_height", Integer.valueOf(cVar.f62217p));
        contentValues.put("cta_overlay_enabled", Boolean.valueOf(cVar.f62220s));
        contentValues.put("cta_click_area", Boolean.valueOf(cVar.f62221t));
        contentValues.put("retry_count", Integer.valueOf(cVar.f62225x));
        contentValues.put("requires_non_market_install", Boolean.valueOf(cVar.f62188J));
        contentValues.put("app_id", cVar.f62206e);
        contentValues.put(AttributionData.CAMPAIGN_KEY, cVar.f62211j);
        contentValues.put(InneractiveRichMediaVideoPlayerActivityCore.VIDEO_URL, cVar.f62215n);
        contentValues.put("md5", cVar.f62218q);
        contentValues.put("postroll_bundle_url", cVar.f62219r);
        contentValues.put("cta_destination_url", cVar.f62222u);
        contentValues.put("cta_url", cVar.f62223v);
        contentValues.put("ad_token", cVar.f62226y);
        contentValues.put("video_identifier", cVar.f62227z);
        contentValues.put("template_url", cVar.f62179A);
        contentValues.put("TEMPLATE_ID", cVar.f62184F);
        contentValues.put("TEMPLATE_TYPE", cVar.f62185G);
        contentValues.put("ad_market_id", cVar.f62189K);
        contentValues.put("bid_token", cVar.f62190L);
        contentValues.put("state", Integer.valueOf(cVar.f62192N));
        contentValues.put("placement_id", cVar.f62193O);
        contentValues.put("ad_config", this.f62232a.toJson((Object) cVar.f62224w));
        contentValues.put("checkpoints", this.f62232a.toJson((Object) cVar.f62208g, f62230e));
        contentValues.put("dynamic_events_and_urls", this.f62232a.toJson((Object) cVar.f62209h, f62231f));
        contentValues.put("template_settings", this.f62232a.toJson((Object) cVar.f62180B, this.f62233b));
        contentValues.put("mraid_files", this.f62232a.toJson((Object) cVar.f62181C, this.f62233b));
        contentValues.put("cacheable_assets", this.f62232a.toJson((Object) cVar.f62182D, this.f62234c));
        contentValues.put("column_notifications", this.f62232a.toJson((Object) cVar.f62202Z, this.f62235d));
        contentValues.put("tt_download", Long.valueOf(cVar.f62194P));
        contentValues.put("asset_download_timestamp", Long.valueOf(cVar.f62196R));
        contentValues.put("asset_download_duration", Long.valueOf(cVar.f62197S));
        contentValues.put("ad_request_start_time", Long.valueOf(cVar.f62198T));
        contentValues.put("column_enable_om_sdk", Boolean.valueOf(cVar.f62186H));
        contentValues.put("column_om_sdk_extra_vast", cVar.f62187I);
        contentValues.put("column_request_timestamp", Long.valueOf(cVar.f62199U));
        contentValues.put("column_click_coordinates_enabled", Boolean.valueOf(cVar.f62200X));
        contentValues.put("column_assets_fully_downloaded", Boolean.valueOf(cVar.f62201Y));
        contentValues.put("column_deep_link", cVar.f62195Q);
        contentValues.put("column_header_bidding", Boolean.valueOf(cVar.f62191M));
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "advertisement";
    }

    /* renamed from: d */
    public final C24545c mo60803c(ContentValues contentValues) {
        C24545c cVar = new C24545c();
        cVar.f62205d = contentValues.getAsString("item_id");
        cVar.f62204c = contentValues.getAsInteger("ad_type").intValue();
        cVar.f62207f = contentValues.getAsLong("expire_time").longValue();
        cVar.f62210i = contentValues.getAsInteger("delay").intValue();
        cVar.f62212k = contentValues.getAsInteger("show_close_delay").intValue();
        cVar.f62213l = contentValues.getAsInteger("show_close_incentivized").intValue();
        cVar.f62214m = contentValues.getAsInteger("countdown").intValue();
        cVar.f62216o = contentValues.getAsInteger("video_width").intValue();
        cVar.f62217p = contentValues.getAsInteger("video_height").intValue();
        cVar.f62225x = contentValues.getAsInteger("retry_count").intValue();
        cVar.f62188J = C17885a.m44420Q(contentValues, "requires_non_market_install");
        cVar.f62206e = contentValues.getAsString("app_id");
        cVar.f62211j = contentValues.getAsString(AttributionData.CAMPAIGN_KEY);
        cVar.f62215n = contentValues.getAsString(InneractiveRichMediaVideoPlayerActivityCore.VIDEO_URL);
        cVar.f62218q = contentValues.getAsString("md5");
        cVar.f62219r = contentValues.getAsString("postroll_bundle_url");
        cVar.f62222u = contentValues.getAsString("cta_destination_url");
        cVar.f62223v = contentValues.getAsString("cta_url");
        cVar.f62226y = contentValues.getAsString("ad_token");
        cVar.f62227z = contentValues.getAsString("video_identifier");
        cVar.f62179A = contentValues.getAsString("template_url");
        cVar.f62184F = contentValues.getAsString("TEMPLATE_ID");
        cVar.f62185G = contentValues.getAsString("TEMPLATE_TYPE");
        cVar.f62189K = contentValues.getAsString("ad_market_id");
        cVar.f62190L = contentValues.getAsString("bid_token");
        cVar.f62192N = contentValues.getAsInteger("state").intValue();
        cVar.f62193O = contentValues.getAsString("placement_id");
        cVar.f62220s = C17885a.m44420Q(contentValues, "cta_overlay_enabled");
        cVar.f62221t = C17885a.m44420Q(contentValues, "cta_click_area");
        cVar.f62224w = (AdConfig) this.f62232a.fromJson(contentValues.getAsString("ad_config"), AdConfig.class);
        cVar.f62208g = (List) this.f62232a.fromJson(contentValues.getAsString("checkpoints"), f62230e);
        cVar.f62209h = (Map) this.f62232a.fromJson(contentValues.getAsString("dynamic_events_and_urls"), f62231f);
        cVar.f62180B = (Map) this.f62232a.fromJson(contentValues.getAsString("template_settings"), this.f62233b);
        cVar.f62181C = (Map) this.f62232a.fromJson(contentValues.getAsString("mraid_files"), this.f62233b);
        cVar.f62182D = (Map) this.f62232a.fromJson(contentValues.getAsString("cacheable_assets"), this.f62234c);
        cVar.f62194P = contentValues.getAsLong("tt_download").longValue();
        cVar.f62196R = contentValues.getAsLong("asset_download_timestamp").longValue();
        cVar.f62197S = contentValues.getAsLong("asset_download_duration").longValue();
        cVar.f62198T = contentValues.getAsLong("ad_request_start_time").longValue();
        cVar.f62186H = C17885a.m44420Q(contentValues, "column_enable_om_sdk");
        List<String> list = (List) this.f62232a.fromJson(contentValues.getAsString("column_notifications"), this.f62235d);
        if (list == null) {
            cVar.f62202Z.clear();
        } else {
            cVar.f62202Z = list;
        }
        cVar.f62187I = contentValues.getAsString("column_om_sdk_extra_vast");
        cVar.f62199U = contentValues.getAsLong("column_request_timestamp").longValue();
        cVar.f62200X = contentValues.getAsBoolean("column_click_coordinates_enabled").booleanValue();
        cVar.f62201Y = C17885a.m44420Q(contentValues, "column_assets_fully_downloaded");
        cVar.f62195Q = contentValues.getAsString("column_deep_link");
        cVar.f62191M = contentValues.getAsBoolean("column_header_bidding").booleanValue();
        return cVar;
    }
}
