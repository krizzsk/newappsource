package mj0;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.regex.Pattern;

/* renamed from: mj0.t */
public final class C24414t implements C24415u<String[]> {

    /* renamed from: a */
    public final Pattern f61774a = Pattern.compile(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);

    /* renamed from: a */
    public final Object mo60538a(String str) throws Exception {
        String[] split = this.f61774a.split(str);
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (str2 != null) {
                split[i] = str2.trim();
            }
        }
        return split;
    }
}
