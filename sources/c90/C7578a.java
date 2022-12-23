package c90;

import com.moovit.design.view.list.ListItemView;
import com.moovit.ticketing.purchase.history.Transaction;
import com.moovit.ticketing.purchase.history.TransactionHistoryActivity;
import com.moovit.util.time.C7925b;
import ja0.C12791b;
import ja0.C12797f;
import java.util.List;
import m80.C12870f;
import p977zz.C20964s0;

/* renamed from: c90.a */
public final class C7578a extends C12791b<Transaction> {
    public C7578a(List list, TransactionHistoryActivity transactionHistoryActivity) {
        super(list, C12870f.transaction_history_item, transactionHistoryActivity);
    }

    /* renamed from: l */
    public final void mo23840l(C12797f fVar, Object obj) {
        Transaction transaction = (Transaction) obj;
        ListItemView listItemView = (ListItemView) fVar.itemView;
        listItemView.setClickable(!C20964s0.m49090h(transaction.f23371f));
        listItemView.setIcon(transaction.f23367b);
        listItemView.setTitle((CharSequence) transaction.f23368c);
        listItemView.setSubtitle((CharSequence) C7925b.m18023k(listItemView.getContext(), transaction.f23369d));
        listItemView.setAccessoryText((CharSequence) transaction.f23370e.toString());
    }
}
