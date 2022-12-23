package p030bo.app;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: bo.app.h1 */
public final class C1593h1 extends C1573f1 {
    public C1593h1(String str) {
        super(str, C1703u4.m4800a(), C1703u4.m4803d(), C1703u4.m4802c(), TimeUnit.SECONDS, C1703u4.m4804e());
    }

    public C1593h1(String str, ThreadFactory threadFactory) {
        super(str, C1703u4.m4800a(), C1703u4.m4803d(), C1703u4.m4802c(), TimeUnit.SECONDS, C1703u4.m4804e(), threadFactory);
    }
}
