package com.facebook.internal;

import com.appboy.support.AppboyImageUtils;
import com.appboy.support.ValidationUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import kotlin.Metadata;
import mf0.C24362h;
import p009a8.C0115o;

public final class FeatureManager {

    /* renamed from: a */
    public static final FeatureManager f8588a = new FeatureManager();

    /* renamed from: b */
    public static final HashMap f8589b = new HashMap();

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, mo59060d2 = {"Lcom/facebook/internal/FeatureManager$Feature;", "", "", "toString", "toKey", "", "code", "I", "getParent", "()Lcom/facebook/internal/FeatureManager$Feature;", "parent", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "Unknown", "Core", "AppEvents", "CodelessEvents", "CloudBridge", "RestrictiveDataFiltering", "AAM", "PrivacyProtection", "SuggestedEvents", "IntelligentIntegrity", "ModelRequest", "EventDeactivation", "OnDeviceEventProcessing", "OnDevicePostInstallEventProcessing", "IapLogging", "IapLoggingLib2", "Instrument", "CrashReport", "CrashShield", "ThreadCheck", "ErrorReport", "AnrReport", "Monitoring", "ServiceUpdateCompliance", "Login", "ChromeCustomTabsPrefetching", "IgnoreAppSwitchToLoggedOut", "BypassAppSwitch", "Share", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(SQLiteDatabase.OPEN_FULLMUTEX),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(SQLiteDatabase.OPEN_SHAREDCACHE),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES);
        
        public static final C2367a Companion = null;
        /* access modifiers changed from: private */
        public final int code;

        /* renamed from: com.facebook.internal.FeatureManager$Feature$a */
        public static final class C2367a {
            /* renamed from: a */
            public static Feature m6258a(int i) {
                Feature[] values = Feature.values();
                int length = values.length;
                int i2 = 0;
                while (i2 < length) {
                    Feature feature = values[i2];
                    i2++;
                    if (feature.code == i) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }
        }

        /* renamed from: com.facebook.internal.FeatureManager$Feature$b */
        public /* synthetic */ class C2368b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f8590a = null;

            static {
                int[] iArr = new int[Feature.values().length];
                iArr[Feature.Core.ordinal()] = 1;
                iArr[Feature.AppEvents.ordinal()] = 2;
                iArr[Feature.CodelessEvents.ordinal()] = 3;
                iArr[Feature.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[Feature.Instrument.ordinal()] = 5;
                iArr[Feature.CrashReport.ordinal()] = 6;
                iArr[Feature.CrashShield.ordinal()] = 7;
                iArr[Feature.ThreadCheck.ordinal()] = 8;
                iArr[Feature.ErrorReport.ordinal()] = 9;
                iArr[Feature.AnrReport.ordinal()] = 10;
                iArr[Feature.AAM.ordinal()] = 11;
                iArr[Feature.CloudBridge.ordinal()] = 12;
                iArr[Feature.PrivacyProtection.ordinal()] = 13;
                iArr[Feature.SuggestedEvents.ordinal()] = 14;
                iArr[Feature.IntelligentIntegrity.ordinal()] = 15;
                iArr[Feature.ModelRequest.ordinal()] = 16;
                iArr[Feature.EventDeactivation.ordinal()] = 17;
                iArr[Feature.OnDeviceEventProcessing.ordinal()] = 18;
                iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 19;
                iArr[Feature.IapLogging.ordinal()] = 20;
                iArr[Feature.IapLoggingLib2.ordinal()] = 21;
                iArr[Feature.Monitoring.ordinal()] = 22;
                iArr[Feature.ServiceUpdateCompliance.ordinal()] = 23;
                iArr[Feature.Login.ordinal()] = 24;
                iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 25;
                iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 26;
                iArr[Feature.BypassAppSwitch.ordinal()] = 27;
                iArr[Feature.Share.ordinal()] = 28;
                f8590a = iArr;
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C2367a();
        }

        private Feature(int i) {
            this.code = i;
        }

        public final Feature getParent() {
            int i = this.code;
            if ((i & ValidationUtils.APPBOY_STRING_MAX_LENGTH) > 0) {
                Companion.getClass();
                return C2367a.m6258a(i & -256);
            } else if ((65280 & i) > 0) {
                Companion.getClass();
                return C2367a.m6258a(i & -65536);
            } else if ((16711680 & i) > 0) {
                Companion.getClass();
                return C2367a.m6258a(i & -16777216);
            } else {
                Companion.getClass();
                return C2367a.m6258a(0);
            }
        }

        public final String toKey() {
            return C24362h.m61216k(this, "FBSDKFeature");
        }

        public String toString() {
            switch (C2368b.f8590a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ModelRequest";
                case 17:
                    return "EventDeactivation";
                case 18:
                    return "OnDeviceEventProcessing";
                case 19:
                    return "OnDevicePostInstallEventProcessing";
                case 20:
                    return "IAPLogging";
                case 21:
                    return "IAPLoggingLib2";
                case 22:
                    return "Monitoring";
                case 23:
                    return "ServiceUpdateCompliance";
                case 24:
                    return "LoginKit";
                case 25:
                    return "ChromeCustomTabsPrefetching";
                case 26:
                    return "IgnoreAppSwitchToLoggedOut";
                case 27:
                    return "BypassAppSwitch";
                case 28:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* renamed from: com.facebook.internal.FeatureManager$a */
    public interface C2369a {
        /* renamed from: i */
        void mo246i(boolean z);
    }

    /* renamed from: com.facebook.internal.FeatureManager$b */
    public /* synthetic */ class C2370b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8591a;

        static {
            int[] iArr = new int[Feature.values().length];
            iArr[Feature.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[Feature.Instrument.ordinal()] = 2;
            iArr[Feature.CrashReport.ordinal()] = 3;
            iArr[Feature.CrashShield.ordinal()] = 4;
            iArr[Feature.ThreadCheck.ordinal()] = 5;
            iArr[Feature.ErrorReport.ordinal()] = 6;
            iArr[Feature.AnrReport.ordinal()] = 7;
            iArr[Feature.AAM.ordinal()] = 8;
            iArr[Feature.CloudBridge.ordinal()] = 9;
            iArr[Feature.PrivacyProtection.ordinal()] = 10;
            iArr[Feature.SuggestedEvents.ordinal()] = 11;
            iArr[Feature.IntelligentIntegrity.ordinal()] = 12;
            iArr[Feature.ModelRequest.ordinal()] = 13;
            iArr[Feature.EventDeactivation.ordinal()] = 14;
            iArr[Feature.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[Feature.IapLogging.ordinal()] = 17;
            iArr[Feature.IapLoggingLib2.ordinal()] = 18;
            iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 19;
            iArr[Feature.Monitoring.ordinal()] = 20;
            iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 21;
            iArr[Feature.BypassAppSwitch.ordinal()] = 22;
            f8591a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m6255a(C2369a aVar, Feature feature) {
        C24362h.m61211f(feature, "feature");
        C2427r.m6381c(new C2426q(aVar, feature));
    }

    /* renamed from: b */
    public static boolean m6256b(Feature feature) {
        boolean z;
        switch (C2370b.f8591a[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        C2427r rVar = C2427r.f8702a;
        return C2427r.m6380b(feature.toKey(), C0115o.m211b(), z);
    }

    /* renamed from: c */
    public static final boolean m6257c(Feature feature) {
        C24362h.m61211f(feature, "feature");
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = C0115o.m210a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.toKey(), (String) null);
        if (string != null && C24362h.m61206a(string, "15.1.0")) {
            return false;
        }
        Feature parent = feature.getParent();
        if (parent == feature) {
            return m6256b(feature);
        }
        if (!m6257c(parent) || !m6256b(feature)) {
            return false;
        }
        return true;
    }
}
