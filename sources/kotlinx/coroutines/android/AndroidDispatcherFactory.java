package kotlinx.coroutines.android;

import android.os.Looper;
import bi0.C21072j;
import java.util.List;
import kotlin.Metadata;
import wh0.C25179g1;
import xh0.C25275e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo59060d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lbi0/j;", "", "allFactories", "Lwh0/g1;", "createDispatcher", "", "hintOnError", "", "getLoadPriority", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class AndroidDispatcherFactory implements C21072j {
    public C25179g1 createDispatcher(List<? extends C21072j> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C24183a(C25275e.m63480a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
