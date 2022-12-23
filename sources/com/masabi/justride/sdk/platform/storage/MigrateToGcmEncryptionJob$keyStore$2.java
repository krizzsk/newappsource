package com.masabi.justride.sdk.platform.storage;

import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.security.KeyStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "Ljava/security/KeyStore;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
public final class MigrateToGcmEncryptionJob$keyStore$2 extends Lambda implements C24225a<KeyStore> {

    /* renamed from: f */
    public static final MigrateToGcmEncryptionJob$keyStore$2 f37189f = new MigrateToGcmEncryptionJob$keyStore$2();

    public MigrateToGcmEncryptionJob$keyStore$2() {
        super(0);
    }

    public final Object invoke() {
        KeyStore instance = KeyStore.getInstance(KeyProvider18.ANDROID_KEY_STORE_NAME);
        instance.load((KeyStore.LoadStoreParameter) null);
        return instance;
    }
}
