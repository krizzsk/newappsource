package zendesk.core;

import ge0.C23410c;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p359ag.C13450g;

class ZendeskSettingsStorage implements SettingsStorage {
    private final BaseStorage settingsStorage;

    public ZendeskSettingsStorage(BaseStorage baseStorage) {
        this.settingsStorage = baseStorage;
    }

    public boolean areSettingsUpToDate(long j, TimeUnit timeUnit) {
        Long l;
        synchronized (this.settingsStorage) {
            l = (Long) this.settingsStorage.get("last_settings_update", Long.class);
        }
        if (l == null || l.longValue() == -1) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() < TimeUnit.MILLISECONDS.convert(j, timeUnit)) {
            return true;
        }
        return false;
    }

    public void clear() {
        synchronized (this.settingsStorage) {
            this.settingsStorage.clear();
        }
    }

    public <E> E getSettings(String str, Class<E> cls) {
        E e;
        synchronized (this.settingsStorage) {
            e = this.settingsStorage.get(str, cls);
        }
        return e;
    }

    public boolean hasStoredSettings() {
        boolean a;
        synchronized (this.settingsStorage) {
            a = C23410c.m57533a(this.settingsStorage.get("last_settings_update"));
        }
        return a;
    }

    public void storeRawSettings(Map<String, C13450g> map) {
        synchronized (this.settingsStorage) {
            this.settingsStorage.put("last_settings_update", (Object) Long.valueOf(System.currentTimeMillis()));
            for (Map.Entry next : map.entrySet()) {
                this.settingsStorage.put((String) next.getKey(), next.getValue());
            }
        }
    }
}
