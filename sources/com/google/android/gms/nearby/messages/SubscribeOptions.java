package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.Preconditions;
import p001a0.C0017h;

public final class SubscribeOptions {
    public static final SubscribeOptions DEFAULT = new Builder().build();
    public final boolean zza = false;
    public final int zzb = 0;
    private final Strategy zzc;
    private final MessageFilter zzd;
    private final SubscribeCallback zze;

    public static class Builder {
        private Strategy zza = Strategy.DEFAULT;
        private MessageFilter zzb = MessageFilter.INCLUDE_ALL_MY_TYPES;
        private SubscribeCallback zzc;

        public SubscribeOptions build() {
            return new SubscribeOptions(this.zza, this.zzb, this.zzc, false, 0, (zzg) null);
        }

        public Builder setCallback(SubscribeCallback subscribeCallback) {
            this.zzc = (SubscribeCallback) Preconditions.checkNotNull(subscribeCallback);
            return this;
        }

        public Builder setFilter(MessageFilter messageFilter) {
            this.zzb = messageFilter;
            return this;
        }

        public Builder setStrategy(Strategy strategy) {
            this.zza = strategy;
            return this;
        }
    }

    public /* synthetic */ SubscribeOptions(Strategy strategy, MessageFilter messageFilter, SubscribeCallback subscribeCallback, boolean z, int i, zzg zzg) {
        this.zzc = strategy;
        this.zzd = messageFilter;
        this.zze = subscribeCallback;
    }

    public SubscribeCallback getCallback() {
        return this.zze;
    }

    public MessageFilter getFilter() {
        return this.zzd;
    }

    public Strategy getStrategy() {
        return this.zzc;
    }

    public String toString() {
        return C0017h.m56M("SubscribeOptions{strategy=", String.valueOf(this.zzc), ", filter=", String.valueOf(this.zzd), "}");
    }
}
