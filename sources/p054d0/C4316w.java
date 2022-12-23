package p054d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C0556i;
import androidx.camera.core.C0608j;
import androidx.camera.core.C0627p;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* renamed from: d0.w */
public final /* synthetic */ class C4316w implements CallbackToFutureAdapter.C0674b {

    /* renamed from: b */
    public final /* synthetic */ C0608j f15278b;

    /* renamed from: c */
    public final /* synthetic */ Executor f15279c;

    /* renamed from: d */
    public final /* synthetic */ C0627p f15280d;

    /* renamed from: e */
    public final /* synthetic */ Matrix f15281e;

    /* renamed from: f */
    public final /* synthetic */ C0627p f15282f;

    /* renamed from: g */
    public final /* synthetic */ Rect f15283g;

    /* renamed from: h */
    public final /* synthetic */ C0556i.C0557a f15284h;

    public /* synthetic */ C4316w(C0608j jVar, Executor executor, C0627p pVar, Matrix matrix, C0627p pVar2, Rect rect, C0556i.C0557a aVar) {
        this.f15278b = jVar;
        this.f15279c = executor;
        this.f15280d = pVar;
        this.f15281e = matrix;
        this.f15282f = pVar2;
        this.f15283g = rect;
        this.f15284h = aVar;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        C0608j jVar = this.f15278b;
        Executor executor = this.f15279c;
        C0627p pVar = this.f15280d;
        Matrix matrix = this.f15281e;
        C0627p pVar2 = this.f15282f;
        Rect rect = this.f15283g;
        C0556i.C0557a aVar2 = this.f15284h;
        jVar.getClass();
        executor.execute(new C4318x(jVar, pVar, matrix, pVar2, rect, aVar2, aVar));
        return "analyzeImage";
    }
}
