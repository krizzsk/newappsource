package zendesk.support;

import fe0.C23341a;
import fe0.C23345c;

abstract class ZendeskCallbackSuccess<E> extends C23345c<E> {
    private final C23345c callback;

    public ZendeskCallbackSuccess(C23345c cVar) {
        this.callback = cVar;
    }

    public void onError(C23341a aVar) {
        C23345c cVar = this.callback;
        if (cVar != null) {
            cVar.onError(aVar);
        }
    }

    public abstract void onSuccess(E e);
}
