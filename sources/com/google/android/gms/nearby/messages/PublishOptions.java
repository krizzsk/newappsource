package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Preconditions;

public final class PublishOptions {
    public static final PublishOptions DEFAULT = new Builder().build();
    private final Strategy zza;
    private final PublishCallback zzb;

    public static class Builder {
        private Strategy zza = Strategy.DEFAULT;
        private PublishCallback zzb;

        public PublishOptions build() {
            return new PublishOptions(this.zza, this.zzb, (zze) null);
        }

        public Builder setCallback(PublishCallback publishCallback) {
            this.zzb = (PublishCallback) Preconditions.checkNotNull(publishCallback);
            return this;
        }

        public Builder setStrategy(Strategy strategy) {
            this.zza = (Strategy) Preconditions.checkNotNull(strategy);
            return this;
        }
    }

    public /* synthetic */ PublishOptions(Strategy strategy, PublishCallback publishCallback, zze zze) {
        this.zza = strategy;
        this.zzb = publishCallback;
    }

    public PublishCallback getCallback() {
        return this.zzb;
    }

    public Strategy getStrategy() {
        return this.zza;
    }
}
