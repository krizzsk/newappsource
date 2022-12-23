package zendesk.core;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import p359ag.C13450g;

interface SettingsStorage {
    boolean areSettingsUpToDate(long j, TimeUnit timeUnit);

    void clear();

    <E> E getSettings(String str, Class<E> cls);

    boolean hasStoredSettings();

    void storeRawSettings(Map<String, C13450g> map);
}
