package p805su;

import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import java.util.List;
import p824tp.C19728f;
import p829tu.C19779j;
import q00.C19047a;

/* renamed from: su.j */
public final /* synthetic */ class C19553j implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ C13752e f49696b;

    /* renamed from: c */
    public final /* synthetic */ C19728f f49697c;

    /* renamed from: d */
    public final /* synthetic */ C19047a f49698d;

    /* renamed from: e */
    public final /* synthetic */ MotQrCodeScanResult f49699e;

    public /* synthetic */ C19553j(C13752e eVar, C19728f fVar, C19047a aVar, MotQrCodeScanResult motQrCodeScanResult) {
        this.f49696b = eVar;
        this.f49697c = fVar;
        this.f49698d = aVar;
        this.f49699e = motQrCodeScanResult;
    }

    public final Task then(Object obj) {
        int i = C19554k.f49700n;
        return Tasks.call(MoovitExecutors.COMPUTATION, new C19779j(this.f49696b, this.f49697c, this.f49698d, this.f49699e, (List) obj));
    }
}
