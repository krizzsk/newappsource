package com.masabi.justride.sdk.crypto;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import p677nj.C18558c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lnj/c;", "kotlin.jvm.PlatformType", "invoke", "()Lnj/c;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 1})
public final class KeyStorageAES$secretKeyGenerator$2 extends Lambda implements C24225a<C18558c> {
    public final /* synthetic */ KeyStorageAES this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyStorageAES$secretKeyGenerator$2(KeyStorageAES keyStorageAES) {
        super(0);
        this.this$0 = keyStorageAES;
    }

    public final Object invoke() {
        try {
            this.this$0.f37079d.getClass();
            return new C18558c(256);
        } catch (CryptoException e) {
            throw new CryptoException("Failed getting secret key generator", e);
        }
    }
}
