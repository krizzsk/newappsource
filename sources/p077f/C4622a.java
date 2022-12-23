package p077f;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.TimeUnit;

/* renamed from: f.a */
public final class C4622a implements CallbackToFutureAdapter.C0674b<C4628f> {

    /* renamed from: b */
    public final /* synthetic */ Context f15839b;

    public C4622a(Context context) {
        this.f15839b = context;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a<C4628f> aVar) {
        C4626e.f15846b.schedule(new C4624c(C4626e.f15845a.submit(new C4623b(this.f15839b, aVar)), aVar), 20, TimeUnit.SECONDS);
        return "getAdvertisingIdInfo";
    }
}
