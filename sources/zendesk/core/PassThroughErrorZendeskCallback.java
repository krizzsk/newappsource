package zendesk.core;

import fe0.C23341a;
import fe0.C23345c;

abstract class PassThroughErrorZendeskCallback<E> extends C23345c<E> {
    private final C23345c callback;

    public PassThroughErrorZendeskCallback(C23345c cVar) {
        this.callback = cVar;
    }

    public void onError(C23341a aVar) {
        C23345c cVar = this.callback;
        if (cVar != null) {
            cVar.onError(aVar);
        }
    }
}
