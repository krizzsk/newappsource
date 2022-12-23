package p244s3;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;
import p030bo.app.C1637m4;

/* renamed from: s3.o */
public final /* synthetic */ class C6440o implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ Context f20134b;

    /* renamed from: c */
    public final /* synthetic */ List f20135c;

    public /* synthetic */ C6440o(Context context, List list) {
        this.f20134b = context;
        this.f20135c = list;
    }

    public final void onSuccess(Object obj) {
        C1637m4.m4491b(this.f20134b, this.f20135c, (Void) obj);
    }
}
