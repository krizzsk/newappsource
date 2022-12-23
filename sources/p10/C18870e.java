package p10;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlRequest;
import p824tp.C19746x;

/* renamed from: p10.e */
public final class C18870e extends C13778r<C18870e, C18871f, MVGetCertificateImageUploadUrlRequest> {
    public C18870e(C13752e eVar, String str, long j, int i, int i2, String str2) {
        super(eVar, C19746x.server_path_app_server_secured_url, C19746x.api_path_verification_entity_image_upload_url, C18871f.class);
        RO mVGetCertificateImageUploadUrlRequest = new MVGetCertificateImageUploadUrlRequest();
        mVGetCertificateImageUploadUrlRequest.certificateKey = str;
        mVGetCertificateImageUploadUrlRequest.timestamp = j;
        mVGetCertificateImageUploadUrlRequest.mo29895m();
        mVGetCertificateImageUploadUrlRequest.width = i;
        mVGetCertificateImageUploadUrlRequest.mo29896o();
        mVGetCertificateImageUploadUrlRequest.height = i2;
        mVGetCertificateImageUploadUrlRequest.mo29894l();
        mVGetCertificateImageUploadUrlRequest.fileSuffix = str2;
        this.f33922v = mVGetCertificateImageUploadUrlRequest;
    }
}
