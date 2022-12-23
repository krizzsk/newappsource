package zendesk.support;

import fe0.C23342b;
import fe0.C23345c;
import hi0.C23519a0;
import hi0.C23562t;
import java.io.File;

class ZendeskUploadService {
    private static final String LOG_TAG = "ZendeskUploadService";
    private final UploadService uploadService;

    public ZendeskUploadService(UploadService uploadService2) {
        this.uploadService = uploadService2;
    }

    public void deleteAttachment(String str, C23345c<Void> cVar) {
        this.uploadService.deleteAttachment(str).mo53585K0(new C23342b(cVar));
    }

    public void uploadAttachment(String str, File file, String str2, C23345c<UploadResponseWrapper> cVar) {
        UploadService uploadService2 = this.uploadService;
        C23562t c = C23562t.m57743c(str2);
        if (file != null) {
            uploadService2.uploadAttachment(str, new C23519a0(c, file)).mo53585K0(new C23342b(cVar));
            return;
        }
        throw new NullPointerException("file == null");
    }
}
