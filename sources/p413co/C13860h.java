package p413co;

import com.masabi.justride.sdk.crypto.EncryptionMode;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import com.masabi.justride.sdk.platform.storage.MigrateToGcmEncryptionJob;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p677nj.C18565h;

/* renamed from: co.h */
public final class C13860h {

    /* renamed from: a */
    public final FutureTask<Exception> f34095a = new FutureTask<>(new C13861a(this));

    /* renamed from: b */
    public final C13865k f34096b;

    /* renamed from: c */
    public final C13864j f34097c;

    /* renamed from: d */
    public final MigrateToGcmEncryptionJob f34098d;

    /* renamed from: co.h$a */
    public static final class C13861a<V> implements Callable<Exception> {

        /* renamed from: b */
        public final /* synthetic */ C13860h f34099b;

        public C13861a(C13860h hVar) {
            this.f34099b = hVar;
        }

        public final Object call() {
            try {
                this.f34099b.f34096b.mo40814a();
                if (C18565h.f47251a == EncryptionMode.GCM) {
                    this.f34099b.f34097c.mo40813a();
                    this.f34099b.f34098d.mo44380g();
                }
                return null;
            } catch (Exception e) {
                return e;
            }
        }
    }

    public C13860h(C13865k kVar, C13864j jVar, MigrateToGcmEncryptionJob migrateToGcmEncryptionJob) {
        this.f34096b = kVar;
        this.f34097c = jVar;
        this.f34098d = migrateToGcmEncryptionJob;
    }

    /* renamed from: a */
    public final void mo40807a() throws FileStorageException {
        try {
            Exception exc = this.f34095a.get();
            if (exc != null) {
                throw exc;
            }
        } catch (Exception e) {
            throw new FileStorageException("Failed storage migration", e);
        }
    }
}
