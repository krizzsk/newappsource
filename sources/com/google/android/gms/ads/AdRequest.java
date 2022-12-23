package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.Date;
import java.util.List;
import java.util.Set;

@VisibleForTesting
public class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    public final zzdr zza;

    @VisibleForTesting
    public static class Builder {
        public final zzdq zza;

        public Builder() {
            zzdq zzdq = new zzdq();
            this.zza = zzdq;
            zzdq.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zza.zzr(cls, bundle);
            return this;
        }

        public Builder addKeyword(String str) {
            this.zza.zzt(str);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zza.zzu(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zza.zzx("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        @KeepForSdk
        @Deprecated
        public Builder setAdInfo(AdInfo adInfo) {
            this.zza.zzy(adInfo);
            return this;
        }

        @KeepForSdk
        public Builder setAdString(String str) {
            this.zza.zzz(str);
            return this;
        }

        public Builder setContentUrl(String str) {
            boolean z;
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            if (str.length() <= 512) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zza.zzB(str);
            return this;
        }

        public Builder setHttpTimeoutMillis(int i) {
            this.zza.zzD(i);
            return this;
        }

        public Builder setNeighboringContentUrls(List<String> list) {
            if (list == null) {
                zzcfi.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.zza.zzF(list);
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.zza.zzH(str);
            return this;
        }

        @Deprecated
        public final Builder zza(String str) {
            this.zza.zzw(str);
            return this;
        }

        @Deprecated
        public final Builder zzb(Date date) {
            this.zza.zzA(date);
            return this;
        }

        @Deprecated
        public final Builder zzc(int i) {
            this.zza.zzC(i);
            return this;
        }

        @Deprecated
        public final Builder zzd(boolean z) {
            this.zza.zzE(z);
            return this;
        }

        @Deprecated
        public final Builder zze(boolean z) {
            this.zza.zzI(z);
            return this;
        }
    }

    public AdRequest(Builder builder) {
        this.zza = new zzdr(builder.zza, (SearchAdRequest) null);
    }

    public String getContentUrl() {
        return this.zza.zzl();
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zza.zzd(cls);
    }

    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    public Set<String> getKeywords() {
        return this.zza.zzr();
    }

    public List<String> getNeighboringContentUrls() {
        return this.zza.zzp();
    }

    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zza.zzf(cls);
    }

    public boolean isTestDevice(Context context) {
        return this.zza.zzt(context);
    }

    public zzdr zza() {
        return this.zza;
    }
}