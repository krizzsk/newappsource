package hd0;

import com.veriff.sdk.internal.C22766za;
import java.util.concurrent.ThreadFactory;

/* renamed from: hd0.m */
public final /* synthetic */ class C23453m implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f59229b;

    /* renamed from: c */
    public final /* synthetic */ boolean f59230c;

    public /* synthetic */ C23453m(String str, boolean z) {
        this.f59229b = str;
        this.f59230c = z;
    }

    public final Thread newThread(Runnable runnable) {
        return C22766za.m55826a(this.f59229b, this.f59230c, runnable);
    }
}
