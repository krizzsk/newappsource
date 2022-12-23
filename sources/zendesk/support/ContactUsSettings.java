package zendesk.support;

import ge0.C23408a;
import java.util.Collections;
import java.util.List;

class ContactUsSettings {
    private static ContactUsSettings DEFAULT = new ContactUsSettings(Collections.emptyList());
    private List<String> tags;

    public ContactUsSettings(List<String> list) {
        this.tags = list;
    }

    public static ContactUsSettings defaultSettings() {
        return DEFAULT;
    }

    public List<String> getTags() {
        return C23408a.m57526a(this.tags);
    }

    public ContactUsSettings() {
    }
}
