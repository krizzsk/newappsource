package com.moovit.sdk.profilers.config;

import android.os.Parcelable;

public abstract class BaseConfig implements Parcelable {

    /* renamed from: b */
    public final int f43032b;

    /* renamed from: c */
    public final long f43033c;

    /* renamed from: d */
    public final ConfigType f43034d;

    public BaseConfig(long j, int i, ConfigType configType) {
        this.f43033c = j;
        this.f43032b = i;
        this.f43034d = configType;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("BaseConfig{profilerId=");
        k.append(this.f43032b);
        k.append(", ttl=");
        k.append(this.f43033c);
        k.append(", configType=");
        k.append(this.f43034d);
        k.append("}");
        return k.toString();
    }
}
