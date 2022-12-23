package p849uq;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* renamed from: uq.a */
public final /* synthetic */ class C19977a implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ C19979c f50803b;

    /* renamed from: c */
    public final /* synthetic */ boolean f50804c;

    /* renamed from: d */
    public final /* synthetic */ String f50805d;

    /* renamed from: e */
    public final /* synthetic */ String f50806e;

    /* renamed from: f */
    public final /* synthetic */ String f50807f;

    /* renamed from: g */
    public final /* synthetic */ String f50808g;

    public /* synthetic */ C19977a(C19979c cVar, boolean z, String str, String str2, String str3, String str4) {
        this.f50803b = cVar;
        this.f50804c = z;
        this.f50805d = str;
        this.f50806e = str2;
        this.f50807f = str3;
        this.f50808g = str4;
    }

    public final Task then(Object obj) {
        return Tasks.forResult(this.f50803b.mo52269a(this.f50804c, this.f50805d, this.f50806e, this.f50807f, this.f50808g, obj));
    }
}
