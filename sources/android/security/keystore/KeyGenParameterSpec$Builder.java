package android.security.keystore;

import android.annotation.NonNull;
import java.math.BigInteger;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public final /* synthetic */ class KeyGenParameterSpec$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ KeyGenParameterSpec$Builder(@NonNull String str, int i) {
    }

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec build();

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec$Builder setBlockModes(String... strArr);

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec$Builder setCertificateNotAfter(@NonNull Date date);

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec$Builder setCertificateNotBefore(@NonNull Date date);

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec$Builder setCertificateSerialNumber(@NonNull BigInteger bigInteger);

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec$Builder setCertificateSubject(@NonNull X500Principal x500Principal);

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec$Builder setEncryptionPaddings(String... strArr);

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec$Builder setKeySize(int i);

    @NonNull
    public native /* synthetic */ KeyGenParameterSpec$Builder setRandomizedEncryptionRequired(boolean z);
}
