package zendesk.support;

import ck0.C21226b;
import ek0.C23317a;
import ek0.C23318b;
import ek0.C23331o;
import ek0.C23335s;
import ek0.C23336t;
import hi0.C23521b0;

interface UploadService {
    @C23318b("/api/mobile/uploads/{token}.json")
    C21226b<Void> deleteAttachment(@C23335s("token") String str);

    @C23331o("/api/mobile/uploads.json")
    C21226b<UploadResponseWrapper> uploadAttachment(@C23336t("filename") String str, @C23317a C23521b0 b0Var);
}
