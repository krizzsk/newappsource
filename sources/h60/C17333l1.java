package h60;

import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificatePhotoData;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: h60.l1 */
public final class C17333l1 extends C17298a<C17330k1, C17333l1> implements ProfileCertificateData.C16395a<Void> {
    /* renamed from: g */
    public final void mo40672f(C17330k1 k1Var, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        super.mo40052c(k1Var, httpURLConnection, bufferedInputStream);
        if (k1Var.mo52624A()) {
            for (ProfileCertificateData b : k1Var.f44720w) {
                b.mo49104b(this);
            }
        }
    }

    /* renamed from: m0 */
    public final /* bridge */ /* synthetic */ Object mo49105m0(ProfileCertificateTextData profileCertificateTextData) {
        return null;
    }

    /* renamed from: o */
    public final Object mo49106o(ProfileCertificatePhotoData profileCertificatePhotoData) {
        EntityImageUploadWorker.m40807a(this.f51773b.f51759b, EntityImageUploadWorker.EntityImageType.VERIFICATION, profileCertificatePhotoData.f42846c.getPath(), profileCertificatePhotoData.f42844b, (LatLonE6) null);
        return null;
    }
}
