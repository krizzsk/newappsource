package android.content.p013pm;

import android.os.Parcelable;

/* renamed from: android.content.pm.SigningInfo */
public final /* synthetic */ class SigningInfo implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ Signature[] getApkContentsSigners();

    public native /* synthetic */ Signature[] getSigningCertificateHistory();

    public native /* synthetic */ boolean hasMultipleSigners();
}
