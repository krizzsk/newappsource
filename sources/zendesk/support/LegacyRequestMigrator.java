package zendesk.support;

import android.content.SharedPreferences;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.zendesk.logger.Logger;
import ge0.C23408a;
import ge0.C23410c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

class LegacyRequestMigrator implements RequestMigrator {
    private static final String LOG_TAG = "LegacyRequestMigrator";
    private static final String PREFS_COMMENT_COUNT_KEY_PREFIX = "request-id-cc";
    private static final String REQUEST_KEY = "stored_requests";
    private SharedPreferences legacyRequestStorage;

    public LegacyRequestMigrator(SharedPreferences sharedPreferences) {
        this.legacyRequestStorage = sharedPreferences;
    }

    private String getCommentCountKey(String str) {
        return String.format(Locale.US, "%s-%s", new Object[]{PREFS_COMMENT_COUNT_KEY_PREFIX, str});
    }

    public void clearLegacyRequestStorage() {
        this.legacyRequestStorage.edit().clear().apply();
    }

    public List<RequestData> getLegacyRequests() {
        List<String> list;
        String string = this.legacyRequestStorage.getString(REQUEST_KEY, (String) null);
        if (C23410c.m57534b(string)) {
            return Collections.emptyList();
        }
        Logger.m57302a("Migrating legacy request IDs.", new Object[0]);
        if (C23410c.m57533a(string)) {
            String[] split = string.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            ArrayList arrayList = new ArrayList();
            for (String str : split) {
                if (C23410c.m57533a(str)) {
                    arrayList.add(str);
                }
            }
            list = Collections.unmodifiableList(C23408a.m57528c(arrayList));
        } else {
            list = Collections.unmodifiableList(C23408a.m57528c(new ArrayList(0)));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (String str2 : list) {
            int i = this.legacyRequestStorage.getInt(getCommentCountKey(str2), -1);
            if (i > -1) {
                arrayList2.add(RequestData.create(str2, i, 0));
            } else {
                arrayList2.add(RequestData.create(str2, 0, 0));
            }
        }
        return arrayList2;
    }
}
