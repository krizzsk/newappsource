package y80;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityRequest;
import java.util.concurrent.Callable;
import m80.C12873i;

/* renamed from: y80.a */
public final class C13262a extends C13778r<C13262a, C13263b, MVCartUpdateQuantityRequest> implements Callable<C13263b> {
    public C13262a(int i, C13752e eVar, String str, String str2) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_update_cart_item_quantity, C13263b.class);
        RO mVCartUpdateQuantityRequest = new MVCartUpdateQuantityRequest();
        mVCartUpdateQuantityRequest.cartContextId = str;
        mVCartUpdateQuantityRequest.cartItemId = str2;
        mVCartUpdateQuantityRequest.quantity = i;
        mVCartUpdateQuantityRequest.mo32356i();
        this.f33922v = mVCartUpdateQuantityRequest;
    }

    public final Object call() throws Exception {
        return (C13263b) mo52626J();
    }
}
