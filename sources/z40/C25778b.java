package z40;

import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.account.actions.model.AccountActionIntent;
import com.moovit.payment.account.actions.model.DeepLinkActionIntent;
import com.moovit.payment.account.actions.model.RedeemBenefitActionIntent;
import com.moovit.payment.account.actions.model.SubscriptionIntent;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowDeepLinkIntent;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowIntent;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowIntentRequest;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowRedeemBenefitIntent;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowSubscriptionIntent;
import kotlin.NoWhenBranchMatchedException;
import v40.C25754i;

/* renamed from: z40.b */
public final class C25778b extends C13778r<C25778b, C25779c, MVAccountFlowIntentRequest> {
    public C25778b(C13752e eVar, AccountActionIntent accountActionIntent) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_account_action_intent, C25779c.class);
        MVAccountFlowIntent mVAccountFlowIntent;
        if (accountActionIntent instanceof RedeemBenefitActionIntent) {
            MVAccountFlowRedeemBenefitIntent mVAccountFlowRedeemBenefitIntent = new MVAccountFlowRedeemBenefitIntent();
            mVAccountFlowIntent = new MVAccountFlowIntent();
            mVAccountFlowIntent.setField_ = MVAccountFlowIntent._Fields.REDEEM_BENEFIT_INTENT;
            mVAccountFlowIntent.value_ = mVAccountFlowRedeemBenefitIntent;
        } else if (accountActionIntent instanceof DeepLinkActionIntent) {
            String uri = ((DeepLinkActionIntent) accountActionIntent).f63873b.toString();
            MVAccountFlowDeepLinkIntent mVAccountFlowDeepLinkIntent = new MVAccountFlowDeepLinkIntent();
            mVAccountFlowDeepLinkIntent.url = uri;
            mVAccountFlowIntent = new MVAccountFlowIntent();
            mVAccountFlowIntent.setField_ = MVAccountFlowIntent._Fields.DEEP_LINK_INTENT;
            mVAccountFlowIntent.value_ = mVAccountFlowDeepLinkIntent;
        } else if (accountActionIntent instanceof SubscriptionIntent) {
            MVAccountFlowSubscriptionIntent mVAccountFlowSubscriptionIntent = new MVAccountFlowSubscriptionIntent();
            mVAccountFlowIntent = new MVAccountFlowIntent();
            mVAccountFlowIntent.setField_ = MVAccountFlowIntent._Fields.SUBSCRIPTION_INTENT;
            mVAccountFlowIntent.value_ = mVAccountFlowSubscriptionIntent;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        RO mVAccountFlowIntentRequest = new MVAccountFlowIntentRequest();
        mVAccountFlowIntentRequest.intent = mVAccountFlowIntent;
        this.f33922v = mVAccountFlowIntentRequest;
    }
}
