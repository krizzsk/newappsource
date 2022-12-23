package zendesk.support;

import fe0.C23345c;
import java.io.File;

public interface UploadProvider {
    void deleteAttachment(String str, C23345c<Void> cVar);

    void uploadAttachment(String str, File file, String str2, C23345c<UploadResponse> cVar);
}
