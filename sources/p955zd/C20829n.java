package p955zd;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzc;
import com.google.firebase.appindexing.internal.zzz;
import p908xd.C20459c;
import p908xd.C20461e;

/* renamed from: zd.n */
public final class C20829n extends C20459c {
    @VisibleForTesting

    /* renamed from: b */
    public final C20828m f52556b;

    public C20829n(Context context) {
        this.f52556b = new C20828m(new C20823h(context));
    }

    /* renamed from: b */
    public final Task<Void> mo52649b() {
        return this.f52556b.mo52958a(new zzz(4, (Thing[]) null, (String[]) null, (String[]) null, (zzc) null, (String) null, (String) null));
    }

    /* renamed from: c */
    public final Task<Void> mo52650c(C20461e... eVarArr) {
        try {
            int length = eVarArr.length;
            Thing[] thingArr = new Thing[length];
            System.arraycopy(eVarArr, 0, thingArr, 0, length);
            return this.f52556b.mo52958a(new zzz(1, thingArr, (String[]) null, (String[]) null, (zzc) null, (String) null, (String) null));
        } catch (ArrayStoreException unused) {
            return Tasks.forException(new FirebaseAppIndexingInvalidArgumentException("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }
}
