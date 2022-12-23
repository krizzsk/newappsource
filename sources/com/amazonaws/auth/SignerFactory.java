package com.amazonaws.auth;

import com.amazonaws.internal.config.InternalConfig;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public final class SignerFactory {
    private static final String NO_OP_SIGNER = "NoOpSignerType";
    private static final String QUERY_STRING_SIGNER = "QueryStringSignerType";
    private static final Map<String, Class<? extends Signer>> SIGNERS;
    private static final String VERSION_FOUR_SIGNER = "AWS4SignerType";

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        SIGNERS = concurrentHashMap;
        concurrentHashMap.put(QUERY_STRING_SIGNER, QueryStringSigner.class);
        concurrentHashMap.put(VERSION_FOUR_SIGNER, AWS4Signer.class);
        concurrentHashMap.put(NO_OP_SIGNER, NoOpSigner.class);
    }

    private SignerFactory() {
    }

    private static Signer createSigner(String str, String str2) {
        Class cls = SIGNERS.get(str);
        if (cls != null) {
            try {
                Signer signer = (Signer) cls.newInstance();
                if (signer instanceof ServiceAwareSigner) {
                    ((ServiceAwareSigner) signer).setServiceName(str2);
                }
                return signer;
            } catch (InstantiationException e) {
                throw new IllegalStateException(C25541a.m63876f(cls, C13555b.m33972k("Cannot create an instance of ")), e);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException(C25541a.m63876f(cls, C13555b.m33972k("Cannot create an instance of ")), e2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Signer getSigner(String str, String str2) {
        return lookupAndCreateSigner(str, str2);
    }

    public static Signer getSignerByTypeAndService(String str, String str2) {
        return createSigner(str, str2);
    }

    private static Signer lookupAndCreateSigner(String str, String str2) {
        return createSigner(InternalConfig.Factory.getInternalConfig().getSignerConfig(str, str2).getSignerType(), str);
    }

    public static void registerSigner(String str, Class<? extends Signer> cls) {
        if (str == null) {
            throw new IllegalArgumentException("signerType cannot be null");
        } else if (cls != null) {
            SIGNERS.put(str, cls);
        } else {
            throw new IllegalArgumentException("signerClass cannot be null");
        }
    }
}
