package od0;

import android.content.ContentValues;
import com.vungle.warren.AdConfig;
import p584jl.C17885a;
import td0.C24931b;

/* renamed from: od0.n */
public final class C24567n implements C24931b<C24566m> {
    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        C24566m mVar = (C24566m) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("item_id", mVar.f62257a);
        contentValues.put("incentivized", Boolean.valueOf(mVar.f62259c));
        contentValues.put("header_bidding", Boolean.valueOf(mVar.f62263g));
        contentValues.put("auto_cached", Boolean.valueOf(mVar.f62258b));
        contentValues.put("wakeup_time", Long.valueOf(mVar.f62260d));
        contentValues.put("is_valid", Boolean.valueOf(mVar.f62264h));
        contentValues.put("refresh_duration", Integer.valueOf(mVar.f62261e));
        contentValues.put("supported_template_types", Integer.valueOf(mVar.f62265i));
        contentValues.put("ad_size", mVar.mo60831a().getName());
        contentValues.put("autocache_priority", Integer.valueOf(mVar.f62262f));
        contentValues.put("max_hb_cache", Integer.valueOf(mVar.f62268l));
        contentValues.put("recommended_ad_size", mVar.f62267k.getName());
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "placement";
    }

    /* renamed from: c */
    public final Object mo60803c(ContentValues contentValues) {
        C24566m mVar = new C24566m();
        mVar.f62257a = contentValues.getAsString("item_id");
        mVar.f62260d = contentValues.getAsLong("wakeup_time").longValue();
        mVar.f62259c = C17885a.m44420Q(contentValues, "incentivized");
        mVar.f62263g = C17885a.m44420Q(contentValues, "header_bidding");
        mVar.f62258b = C17885a.m44420Q(contentValues, "auto_cached");
        mVar.f62264h = C17885a.m44420Q(contentValues, "is_valid");
        mVar.f62261e = contentValues.getAsInteger("refresh_duration").intValue();
        mVar.f62265i = contentValues.getAsInteger("supported_template_types").intValue();
        mVar.f62266j = AdConfig.AdSize.fromName(contentValues.getAsString("ad_size"));
        mVar.f62262f = contentValues.getAsInteger("autocache_priority").intValue();
        mVar.f62268l = contentValues.getAsInteger("max_hb_cache").intValue();
        mVar.f62267k = AdConfig.AdSize.fromName(contentValues.getAsString("recommended_ad_size"));
        return mVar;
    }
}
