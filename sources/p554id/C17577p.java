package p554id;

import java.util.concurrent.CountDownLatch;

/* renamed from: id.p */
public final class C17577p implements C17563b, C17562a {

    /* renamed from: b */
    public final CountDownLatch f45203b = new CountDownLatch(1);

    public final void onFailure(Exception exc) {
        this.f45203b.countDown();
    }

    public final void onSuccess(Object obj) {
        this.f45203b.countDown();
    }
}
