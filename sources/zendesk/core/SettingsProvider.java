package zendesk.core;

import fe0.C23345c;

public interface SettingsProvider {
    <E extends Settings> void getSettingsForSdk(String str, Class<E> cls, C23345c<SettingsPack<E>> cVar);
}
