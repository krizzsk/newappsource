package zendesk.support;

import fe0.C23345c;
import java.io.File;

class ZendeskUploadProvider implements UploadProvider {
    private final ZendeskUploadService uploadService;

    public ZendeskUploadProvider(ZendeskUploadService zendeskUploadService) {
        this.uploadService = zendeskUploadService;
    }

    public void deleteAttachment(String str, C23345c<Void> cVar) {
        this.uploadService.deleteAttachment(str, cVar);
    }

    public void uploadAttachment(String str, File file, String str2, final C23345c<UploadResponse> cVar) {
        this.uploadService.uploadAttachment(str, file, str2, new ZendeskCallbackSuccess<UploadResponseWrapper>(cVar) {
            public void onSuccess(UploadResponseWrapper uploadResponseWrapper) {
                C23345c cVar = cVar;
                if (cVar != null) {
                    cVar.onSuccess(uploadResponseWrapper.getUpload());
                }
            }
        });
    }
}
