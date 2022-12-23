package z70;

import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.search.C7606b;
import java.util.UUID;

/* renamed from: z70.j */
public final /* synthetic */ class C13333j implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ C7606b f33099b;

    /* renamed from: c */
    public final /* synthetic */ UUID f33100c;

    /* renamed from: d */
    public final /* synthetic */ String f33101d;

    /* renamed from: e */
    public final /* synthetic */ String f33102e;

    public /* synthetic */ C13333j(C7606b bVar, UUID uuid, String str, String str2) {
        this.f33099b = bVar;
        this.f33100c = uuid;
        this.f33101d = str;
        this.f33102e = str2;
    }

    public final void onFailure(Exception exc) {
        C7606b bVar = this.f33099b;
        UUID uuid = this.f33100c;
        String str = this.f33101d;
        String str2 = this.f33102e;
        bVar.getClass();
        bVar.mo23906d(uuid, new C7606b.C7608b(str, str2, exc));
    }
}
