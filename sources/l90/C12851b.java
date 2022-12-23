package l90;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.zxing.EncodeHintType;
import java.util.Map;

/* renamed from: l90.b */
public final /* synthetic */ class C12851b implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ C12852c f31775b;

    /* renamed from: c */
    public final /* synthetic */ int f31776c;

    /* renamed from: d */
    public final /* synthetic */ int f31777d;

    public /* synthetic */ C12851b(C12852c cVar, int i, int i2) {
        this.f31775b = cVar;
        this.f31776c = i;
        this.f31777d = i2;
    }

    public final Task then(Object obj) {
        C12852c cVar = this.f31775b;
        int i = this.f31776c;
        int i2 = this.f31777d;
        String str = (String) obj;
        Bitmap bitmap = null;
        if (str != null) {
            bitmap = cVar.f31781q.mo40456a(str, i, i2, (Map<EncodeHintType, ?>) null);
        } else {
            int i3 = C12852c.f31778u;
            cVar.getClass();
        }
        return Tasks.forResult(bitmap);
    }
}
