package com.moovit.sdk.profilers.schedule;

import ce0.C21100e;
import com.moovit.sdk.profilers.config.BaseConfig;
import com.moovit.sdk.profilers.config.ConfigType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t70.C19639a;

public abstract class ScheduleConfig extends BaseConfig {

    /* renamed from: e */
    public final List<C19639a> f43047e;

    public ScheduleConfig(long j, int i, ConfigType configType, ArrayList arrayList) {
        super(j, i, configType);
        C21100e.m49373x(arrayList, "schedules");
        this.f43047e = Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",ScheduleConfig{schedules=");
        return C13555b.m33970i(sb, this.f43047e, '}');
    }
}
