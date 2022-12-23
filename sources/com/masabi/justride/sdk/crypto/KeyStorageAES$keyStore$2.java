package com.masabi.justride.sdk.crypto;

import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.security.KeyStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p677nj.C18566i;
import p677nj.C18567j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lnj/j;", "invoke", "()Lnj/j;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 1})
public final class KeyStorageAES$keyStore$2 extends Lambda implements C24225a<C18567j> {
    public final /* synthetic */ KeyStorageAES this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyStorageAES$keyStore$2(KeyStorageAES keyStorageAES) {
        super(0);
        this.this$0 = keyStorageAES;
    }

    public final Object invoke() {
        try {
            C18566i iVar = this.this$0.f37081f;
            iVar.getClass();
            KeyStore instance = KeyStore.getInstance(KeyProvider18.ANDROID_KEY_STORE_NAME);
            instance.load((KeyStore.LoadStoreParameter) null);
            return new C18567j(instance, iVar.f47252a);
        } catch (Exception e) {
            throw new CryptoException("Failed getting key store", e);
        }
    }
}
