package com.appsflyer.oaid;

import android.content.Context;
import android.os.Build;
import com.appsflyer.internal.referrer.Payload;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OaidClient {
    private final Context context;
    private final Logger logger;
    private final long timeout;
    private final TimeUnit unit;

    public OaidClient(Context context2, long j, TimeUnit timeUnit) {
        Logger logger2 = Logger.getLogger("AppsFlyerOaid6.1.2");
        this.logger = logger2;
        this.context = context2;
        this.timeout = j;
        this.unit = timeUnit;
        logger2.setLevel(Level.OFF);
    }

    private Info fetchHuawei() {
        try {
            if (!AdvertisingIdClient.isAdvertisingIdAvailable(this.context)) {
                return null;
            }
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            return new Info(advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    private static boolean isHuawei() {
        try {
            if (Build.BRAND.equalsIgnoreCase(Payload.SOURCE_HUAWEI) || ((Integer) Class.forName("com.huawei.android.os.BuildEx$VERSION").getDeclaredField("EMUI_SDK_INT").get((Object) null)).intValue() > 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    private static boolean isMsaAvailableAtRuntime() {
        Class<IIdentifierListener> cls = IIdentifierListener.class;
        return true;
    }

    public Info fetch() {
        Info info;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (isHuawei()) {
                info = fetchHuawei();
            } else if (isMsaAvailableAtRuntime()) {
                info = OaidMsaClient.fetchMsa(this.context, this.logger, this.timeout, this.unit);
            } else {
                info = null;
            }
            this.logger.info("Fetch " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            return info;
        } catch (Throwable th) {
            this.logger.info(th.getMessage());
            return null;
        }
    }

    public void setLogging(boolean z) {
        this.logger.setLevel(z ? null : Level.OFF);
    }

    public static class Info {

        /* renamed from: id */
        private final String f6861id;
        private final Boolean lat;

        public Info(String str, Boolean bool) {
            this.f6861id = str;
            this.lat = bool;
        }

        public String getId() {
            return this.f6861id;
        }

        public Boolean getLat() {
            return this.lat;
        }

        public Info(String str) {
            this(str, (Boolean) null);
        }
    }

    public OaidClient(Context context2) {
        this(context2, 1, TimeUnit.SECONDS);
    }
}
