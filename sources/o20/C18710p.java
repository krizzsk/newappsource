package o20;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.map.MapImplType;
import q00.C19047a;

/* renamed from: o20.p */
public abstract class C18710p {

    /* renamed from: a */
    public Context f47623a;

    /* renamed from: a */
    public abstract MapImplType mo48771a();

    /* renamed from: b */
    public abstract void mo48772b();

    /* renamed from: c */
    public abstract C16285j mo48773c(MapFragment mapFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C19047a aVar);

    /* renamed from: d */
    public void mo48824d() {
    }

    /* renamed from: e */
    public void mo48825e(Context context) {
        this.f47623a = context;
    }

    /* renamed from: f */
    public void mo48826f() {
        this.f47623a = null;
    }

    /* renamed from: g */
    public void mo48827g() {
    }
}
