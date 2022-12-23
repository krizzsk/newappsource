package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.p */
public interface C0592p extends Config {
    /* renamed from: a */
    <ValueT> ValueT mo2422a(Config.C0564a<ValueT> aVar);

    /* renamed from: b */
    <ValueT> ValueT mo2423b(Config.C0564a<ValueT> aVar, ValueT valuet);

    /* renamed from: c */
    Config.OptionPriority mo2424c(Config.C0564a<?> aVar);

    Config getConfig();

    Set<Config.C0564a<?>> listOptions();
}
