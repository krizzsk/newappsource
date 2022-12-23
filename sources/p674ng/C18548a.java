package p674ng;

import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.util.List;
import p722pg.C18922a;
import p791sg.C19459a;

/* renamed from: ng.a */
public interface C18548a extends Closeable, C1031o {
    /* renamed from: b */
    Task<List<C18922a>> mo43886b(C19459a aVar);

    @C1045x(Lifecycle.Event.ON_DESTROY)
    void close();
}
