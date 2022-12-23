package p839ug;

import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.Detector;
import java.util.List;
import p791sg.C19459a;

/* renamed from: ug.c */
public interface C19909c extends Detector<List<C19907a>> {
    /* renamed from: b */
    Task<List<C19907a>> mo43890b(@RecentlyNonNull C19459a aVar);

    @C1045x(Lifecycle.Event.ON_DESTROY)
    void close();
}
