package p735pt;

import android.content.Context;
import android.os.Bundle;
import ce0.C21100e;
import com.appboy.models.outgoing.TwitterUser;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.icing.zzfw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzac;
import com.google.firebase.appindexing.internal.zzb;
import com.google.firebase.appindexing.internal.zzc;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.index.UpdateIndexingDescription;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.List;
import p435de.C16596f;
import p669mz.C18487d;
import p908xd.C20457a;
import p908xd.C20458b;
import p908xd.C20459c;
import p908xd.C20460d;
import p908xd.C20461e;
import p908xd.C20463f;

/* renamed from: pt.f */
public final class C18985f {

    /* renamed from: pt.f$a */
    public static class C18986a implements Continuation<Void, Boolean> {
        public final Object then(Task task) throws Exception {
            String str;
            if (task.isSuccessful()) {
                C18981b f = C18981b.m46094f(MoovitAppApplication.m37038x());
                f.mo51499b();
                C18487d<T> dVar = f.f48438c;
                dVar.f33804b.clear();
                dVar.mo50910h();
                return Boolean.valueOf(f.mo51500c());
            }
            if (task.getException() != null) {
                str = task.getException().getLocalizedMessage();
            } else {
                str = "unknown";
            }
            C16596f.m42113a().mo49363b(C25541a.m63881k("Failed remove app-indexing from FirebaseAppIndex, error = ", str));
            return Boolean.FALSE;
        }
    }

    /* renamed from: pt.f$b */
    public static class C18987b implements Continuation<Void, Task<Void>> {

        /* renamed from: b */
        public final Context f48331b;

        /* renamed from: c */
        public final C20458b f48332c;

        public C18987b(Context context, zzc zzc) {
            this.f48331b = context;
            this.f48332c = zzc;
        }

        public final Object then(Task task) throws Exception {
            if (!task.isSuccessful()) {
                return task;
            }
            return C20460d.m48083b(this.f48331b).mo52651a(this.f48332c);
        }
    }

    /* renamed from: pt.f$c */
    public static class C18988c implements Continuation<Void, Task<Void>> {

        /* renamed from: b */
        public final Context f48333b;

        /* renamed from: c */
        public final C20458b f48334c;

        public C18988c(Context context, zzc zzc) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f48333b = context;
            this.f48334c = zzc;
        }

        public final Object then(Task task) throws Exception {
            if (!task.isSuccessful()) {
                return task;
            }
            return C20460d.m48083b(this.f48333b).mo52652c(this.f48334c);
        }
    }

    /* renamed from: pt.f$d */
    public static class C18989d implements Continuation<Void, Boolean> {

        /* renamed from: b */
        public final UpdateIndexingDescription f48335b;

        public C18989d(UpdateIndexingDescription updateIndexingDescription) {
            this.f48335b = updateIndexingDescription;
        }

        public final Object then(Task task) throws Exception {
            String str;
            if (task.isSuccessful()) {
                C18981b f = C18981b.m46094f(MoovitAppApplication.m37038x());
                f.mo51499b();
                f.f48438c.mo40645c(this.f48335b);
                return Boolean.valueOf(f.mo51500c());
            }
            if (task.getException() != null) {
                str = task.getException().getLocalizedMessage();
            } else {
                str = "unknown";
            }
            C16596f a = C16596f.m42113a();
            StringBuilder k = C13555b.m33972k("Failed adding");
            k.append(this.f48335b);
            k.append("to app indexing. error = ");
            k.append(str);
            a.mo49363b(k.toString());
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static Thing m46095a(UpdateIndexingDescription updateIndexingDescription) {
        boolean z;
        C20461e.C20462a aVar = new C20461e.C20462a();
        String str = updateIndexingDescription.f48324b;
        Preconditions.checkNotNull(str);
        aVar.mo52855a("name", str);
        String str2 = updateIndexingDescription.f48325c;
        Preconditions.checkNotNull(str2);
        aVar.f52304d = str2;
        C20463f fVar = new C20463f();
        fVar.f51829a = updateIndexingDescription.f48326d;
        if (aVar.f52303c == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "setMetadata may only be called once");
        Preconditions.checkNotNull(fVar);
        aVar.f52303c = new zzac(fVar.f51829a, fVar.f51830b, fVar.f51831c, fVar.f51832d, (Bundle) null);
        String str3 = updateIndexingDescription.f38438e;
        if (str3 != null) {
            Preconditions.checkNotNull(str3);
            aVar.mo52855a(TwitterUser.DESCRIPTION_KEY, str3);
        }
        String str4 = updateIndexingDescription.f38439f;
        if (str4 != null) {
            Preconditions.checkNotNull(str4);
            aVar.mo52855a("image", str4);
        }
        Bundle bundle = new Bundle(aVar.f52301a);
        zzac zzac = aVar.f52303c;
        if (zzac == null) {
            zzac = new zzac(zzfw.zzd().zza(), zzfw.zzd().zzb(), zzfw.zzd().zzc(), new Bundle(), (Bundle) null);
        }
        return new Thing(bundle, zzac, aVar.f52304d, aVar.f52302b);
    }

    /* renamed from: b */
    public static zzc m46096b(C18991h hVar) {
        String str = hVar.f48336e;
        Bundle bundle = new Bundle();
        String str2 = hVar.f48324b;
        String str3 = hVar.f48325c;
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(str3);
        C20457a aVar = new C20457a();
        aVar.f51826a = !hVar.f48326d;
        Preconditions.checkNotNull(aVar);
        zzb zzb = new zzb(aVar.f51826a);
        Preconditions.checkNotNull(str2, "setObject is required before calling build().");
        Preconditions.checkNotNull(str3, "setObject is required before calling build().");
        return new zzc(str, str2, str3, (String) null, zzb, (String) null, bundle);
    }

    /* renamed from: c */
    public static Task<Void> m46097c(Context context, List<UpdateIndexingDescription> list) {
        if (list.isEmpty()) {
            return null;
        }
        C20461e[] eVarArr = new C20461e[list.size()];
        for (int i = 0; i < list.size(); i++) {
            eVarArr[i] = m46095a(list.get(i));
        }
        return C20459c.m48080a(context).mo52650c(eVarArr);
    }
}
