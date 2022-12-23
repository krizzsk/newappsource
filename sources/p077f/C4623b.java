package p077f;

import android.content.Context;
import androidx.ads.identifier.AdvertisingIdNotAvailableException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* renamed from: f.b */
public final class C4623b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f15840b;

    /* renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.C0673a f15841c;

    public C4623b(Context context, CallbackToFutureAdapter.C0673a aVar) {
        this.f15840b = context;
        this.f15841c = aVar;
    }

    public final void run() {
        try {
            C4631h a = C4626e.m11933a(this.f15840b);
            C4626e.m11935c(a);
            this.f15841c.mo2697b(C4626e.m11934b(a.f15849a));
        } catch (AdvertisingIdNotAvailableException | IOException | InterruptedException | TimeoutException e) {
            this.f15841c.mo2698c(e);
        }
    }
}
