package com.usebutton.sdk.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.usebutton.sdk.internal.functional.Validate;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class IdentifierForAdvertiserProvider {
    private static final long IFA_TTL = TimeUnit.HOURS.toMillis(1);
    private static final String TAG = "IFAProvider";
    private Context mContext;
    private TtlReference<AdvertisingInfoReflectionProxy> mReflectionProxyReference;

    public class AdvertisingInfoReflectionProxy {
        private Class<?> mAdvertisingClient;
        private Method mGetAdvertisingIdInfoMethod;
        private boolean mNeuted = false;

        public AdvertisingInfoReflectionProxy() {
            Class<AdvertisingIdClient> cls = AdvertisingIdClient.class;
            try {
                this.mAdvertisingClient = cls;
                this.mGetAdvertisingIdInfoMethod = cls.getDeclaredMethod("getAdvertisingIdInfo", new Class[]{Context.class});
            } catch (Exception e) {
                ButtonLog.warn(IdentifierForAdvertiserProvider.TAG, "Could not resolve IFA.", e);
                this.mNeuted = true;
            }
        }

        private Object getAdInfo(Context context) throws IllegalAccessException, InvocationTargetException {
            return this.mGetAdvertisingIdInfoMethod.invoke(this.mAdvertisingClient, new Object[]{context});
        }

        public String getTrackingIdentifier(Context context) {
            if (this.mNeuted) {
                return null;
            }
            try {
                Object adInfo = getAdInfo(context);
                return (String) adInfo.getClass().getMethod("getId", new Class[0]).invoke(adInfo, new Object[0]);
            } catch (Exception e) {
                ButtonLog.warn(IdentifierForAdvertiserProvider.TAG, "Could not get ID from ad info object.", e);
                return null;
            }
        }

        public boolean isAdTrackingLimited(Context context) {
            if (this.mNeuted) {
                return false;
            }
            try {
                Object adInfo = getAdInfo(context);
                return ((Boolean) adInfo.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(adInfo, new Object[0])).booleanValue();
            } catch (Exception e) {
                ButtonLog.warn(IdentifierForAdvertiserProvider.TAG, "Couldn't check if tracking was limited.", e);
                return false;
            }
        }
    }

    public IdentifierForAdvertiserProvider(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private AdvertisingInfoReflectionProxy getIdentifierProxy() {
        TtlReference<AdvertisingInfoReflectionProxy> ttlReference = this.mReflectionProxyReference;
        if (ttlReference == null || ttlReference.isDead()) {
            this.mReflectionProxyReference = new TtlReference<>(TtlReference.REALTIME_MILLIS_PROVIDER, new AdvertisingInfoReflectionProxy(), IFA_TTL);
        }
        return this.mReflectionProxyReference.get();
    }

    public String getPrimaryIdentifier() {
        if (isTrackingLimited()) {
            return "";
        }
        Validate.isNotMainThread();
        return getIdentifierProxy().getTrackingIdentifier(this.mContext);
    }

    public boolean isTrackingLimited() {
        return getIdentifierProxy().isAdTrackingLimited(this.mContext);
    }
}
