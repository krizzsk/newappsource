package com.cubic.umo;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo59060d2 = {"Lcom/cubic/umo/Environment;", "", "(Ljava/lang/String;I)V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "PROD", "SANDBOX", "DEV", "MOOVIT", "core_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public enum Environment {
    PROD,
    SANDBOX,
    DEV,
    MOOVIT;

    /* renamed from: com.cubic.umo.Environment$a */
    public /* synthetic */ class C2217a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7236a = null;

        static {
            int[] iArr = new int[Environment.values().length];
            iArr[Environment.DEV.ordinal()] = 1;
            iArr[Environment.MOOVIT.ordinal()] = 2;
            iArr[Environment.SANDBOX.ordinal()] = 3;
            iArr[Environment.PROD.ordinal()] = 4;
            f7236a = iArr;
        }
    }

    public final String getBaseUrl() {
        int i = C2217a.f7236a[ordinal()];
        if (i == 1 || i == 2) {
            return "https://api.stg.cloud.umomobility.com/";
        }
        if (i == 3) {
            return "https://api.demo.cloud.umomobility.com/";
        }
        if (i == 4) {
            return "https://api.umomobility.com/";
        }
        throw new NoWhenBranchMatchedException();
    }
}
