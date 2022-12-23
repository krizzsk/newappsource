package p977zz;

import androidx.lifecycle.C1043v;
import ce0.C21100e;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* renamed from: zz.s */
public final class C20963s<T> implements OnCompleteListener<T>, OnSuccessListener<T>, OnFailureListener {

    /* renamed from: b */
    public final C1043v<C20961r<T>> f52717b;

    public C20963s(C1043v<C20961r<T>> vVar) {
        C21100e.m49373x(vVar, "liveData");
        this.f52717b = vVar;
    }

    public final void onComplete(Task<T> task) {
        C20961r rVar;
        if (task.isSuccessful()) {
            rVar = new C20961r(task.getResult());
        } else {
            rVar = new C20961r(task.getException());
        }
        this.f52717b.postValue(rVar);
    }

    public final void onFailure(Exception exc) {
        this.f52717b.postValue(new C20961r(exc));
    }

    public final void onSuccess(T t) {
        this.f52717b.postValue(new C20961r(t));
    }
}
