package zendesk.support;

import ge0.C23408a;
import java.util.List;
import p384bg.C13622c;

public class EndUserComment {
    @C13622c("uploads")
    private List<String> attachments;
    private String value;

    public List<String> getAttachments() {
        return C23408a.m57526a(this.attachments);
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
