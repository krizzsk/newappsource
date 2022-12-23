package p054d0;

import android.media.ImageReader;
import java.util.concurrent.Executor;
import p066e0.C4462z;

/* renamed from: d0.a */
public final /* synthetic */ class C4266a implements ImageReader.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C4272c f15169a;

    /* renamed from: b */
    public final /* synthetic */ Executor f15170b;

    /* renamed from: c */
    public final /* synthetic */ C4462z.C4463a f15171c;

    public /* synthetic */ C4266a(C4272c cVar, Executor executor, C4462z.C4463a aVar) {
        this.f15169a = cVar;
        this.f15170b = executor;
        this.f15171c = aVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        C4272c cVar = this.f15169a;
        Executor executor = this.f15170b;
        C4462z.C4463a aVar = this.f15171c;
        cVar.getClass();
        executor.execute(new C4269b(0, cVar, aVar));
    }
}
