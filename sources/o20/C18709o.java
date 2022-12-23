package o20;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.image.C16025f;
import com.moovit.map.C16281i;
import java.util.Collection;
import java.util.HashMap;
import v10.C20065a;

/* renamed from: o20.o */
public final class C18709o extends C16025f<C20065a> {

    /* renamed from: i */
    public final /* synthetic */ TaskCompletionSource f47622i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18709o(Context context, Collection collection, TaskCompletionSource taskCompletionSource) {
        super(context, collection);
        this.f47622i = taskCompletionSource;
    }

    /* renamed from: e */
    public final void mo48194e() {
        this.f47622i.trySetResult(new Rect());
    }

    /* renamed from: f */
    public final void mo48195f(HashMap hashMap, boolean z) {
        this.f47622i.trySetResult(C16281i.m41508d(hashMap.values()));
    }
}
