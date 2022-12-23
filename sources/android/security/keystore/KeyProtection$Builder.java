package android.security.keystore;

import android.annotation.NonNull;

public final /* synthetic */ class KeyProtection$Builder {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ KeyProtection$Builder(int i) {
    }

    @NonNull
    public native /* synthetic */ KeyProtection build();

    @NonNull
    public native /* synthetic */ KeyProtection$Builder setBlockModes(String... strArr);

    @NonNull
    public native /* synthetic */ KeyProtection$Builder setEncryptionPaddings(String... strArr);

    @NonNull
    public native /* synthetic */ KeyProtection$Builder setRandomizedEncryptionRequired(boolean z);

    @NonNull
    public native /* synthetic */ KeyProtection$Builder setUserAuthenticationRequired(boolean z);
}
