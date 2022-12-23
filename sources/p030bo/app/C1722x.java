package p030bo.app;

import android.content.Context;
import com.appboy.configuration.CachedConfigurationProvider;

/* renamed from: bo.app.x */
public class C1722x extends CachedConfigurationProvider {
    public C1722x(Context context) {
        super(context);
    }

    /* renamed from: a */
    public long mo6446a() {
        return (long) (getIntValue("com_appboy_data_flush_interval_bad_network", 60) * 1000);
    }

    /* renamed from: b */
    public long mo6447b() {
        return (long) (getIntValue("com_appboy_data_flush_interval_good_network", 30) * 1000);
    }

    /* renamed from: c */
    public long mo6448c() {
        return (long) (getIntValue("com_appboy_data_flush_interval_great_network", 10) * 1000);
    }
}
