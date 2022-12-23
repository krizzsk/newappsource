package q80;

import c70.C13752e;
import c70.C13778r;
import com.moovit.ticketing.purchase.history.Transaction;
import com.tranzmate.moovit.protocol.ticketingV2.MVDateFilterTransactions;
import com.tranzmate.moovit.protocol.ticketingV2.MVTransactionsRequest;
import java.util.List;
import java.util.concurrent.Callable;
import m80.C12873i;

/* renamed from: q80.z */
public final class C13039z extends C13778r<C13039z, C13010a0, MVTransactionsRequest> implements Callable<List<Transaction>> {
    public C13039z(C13752e eVar, int i, int i2) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_tx_history, C13010a0.class);
        MVDateFilterTransactions mVDateFilterTransactions = new MVDateFilterTransactions();
        mVDateFilterTransactions.month = i;
        mVDateFilterTransactions.mo32380h();
        mVDateFilterTransactions.year = i2;
        mVDateFilterTransactions.mo32382i();
        RO mVTransactionsRequest = new MVTransactionsRequest();
        mVTransactionsRequest.dateFilter = mVDateFilterTransactions;
        this.f33922v = mVTransactionsRequest;
    }

    public final Object call() throws Exception {
        return ((C13010a0) mo52626J()).f32200m;
    }
}
