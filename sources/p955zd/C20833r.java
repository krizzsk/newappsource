package p955zd;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.internal.zzc;
import p908xd.C20458b;
import p908xd.C20460d;

/* renamed from: zd.r */
public final class C20833r extends C20460d {

    /* renamed from: b */
    public final C20831p f52559b;

    public C20833r(Context context) {
        this.f52559b = new C20831p(context);
    }

    /* renamed from: a */
    public final Task<Void> mo52651a(C20458b bVar) {
        return mo52960d(2, bVar);
    }

    /* renamed from: c */
    public final Task<Void> mo52652c(C20458b bVar) {
        return mo52960d(1, bVar);
    }

    /* renamed from: d */
    public final Task<Void> mo52960d(int i, C20458b bVar) {
        zzc[] zzcArr = new zzc[1];
        if (bVar != null) {
            if (!(bVar instanceof zzc)) {
                return Tasks.forException(new FirebaseAppIndexingInvalidArgumentException("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
            }
            zzc zzc = (zzc) bVar;
            zzcArr[0] = zzc;
            zzc.f36354f.f36344b = i;
        }
        return this.f52559b.doWrite(new C20830o(zzcArr));
    }
}
