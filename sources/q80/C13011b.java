package q80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.ticket.TicketId;
import com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse;
import com.tranzmate.moovit.protocol.ticketingV2.MVMissingTicketActivationConfirmationInstructions;
import com.tranzmate.moovit.protocol.ticketingV2.MVMissingTicketActivationInstructions;
import java.io.IOException;
import je0.C23715f;
import m90.C12892c;
import n80.C12914a;
import org.apache.thrift.TBase;
import p810sz.C19617r;

/* renamed from: q80.b */
public final class C13011b extends C13780t<C13009a, C13011b, MVActivateTicketResponse> {

    /* renamed from: m */
    public TicketId f32201m;

    /* renamed from: n */
    public C23715f f32202n;

    public C13011b() {
        super(MVActivateTicketResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        boolean z2;
        TicketId ticketId;
        boolean z3;
        boolean z4;
        boolean z5;
        C12892c r;
        C13009a aVar2 = (C13009a) aVar;
        MVActivateTicketResponse mVActivateTicketResponse = (MVActivateTicketResponse) tBase;
        F f = mVActivateTicketResponse.setField_;
        F f2 = MVActivateTicketResponse._Fields.TICKET_INFO;
        boolean z6 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z || mVActivateTicketResponse.mo32313l().flushCacheGroupKey == null || (r = C12892c.m32688r(this.f51773b.f51759b)) == null)) {
            r.mo39753p(mVActivateTicketResponse.mo32313l().flushCacheGroupKey);
        }
        TicketId ticketId2 = aVar2.f32199x.f31981a.f23473b;
        if (mVActivateTicketResponse.setField_ == f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C12914a aVar3 = null;
        if (z2) {
            ticketId = new TicketId(ticketId2.f23511b, ticketId2.f23512c, mVActivateTicketResponse.mo32313l().ticketId);
        } else {
            ticketId = null;
        }
        this.f32201m = ticketId;
        F f3 = mVActivateTicketResponse.setField_;
        F f4 = MVActivateTicketResponse._Fields.MISSING_ACTIVATION_INSTRUCTIONS;
        if (f3 == f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (f3 == f4) {
                MVMissingTicketActivationInstructions mVMissingTicketActivationInstructions = (MVMissingTicketActivationInstructions) mVActivateTicketResponse.value_;
                C19617r rVar = C13036y.f32248a;
                F f5 = mVMissingTicketActivationInstructions.setField_;
                F f6 = MVMissingTicketActivationInstructions._Fields.CONFIRMATION_INSTRUCTIONS;
                if (f5 == f6) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    throw new BadResponseException("Unsupported activation type!");
                } else if (f5 == f6) {
                    MVMissingTicketActivationConfirmationInstructions mVMissingTicketActivationConfirmationInstructions = (MVMissingTicketActivationConfirmationInstructions) mVMissingTicketActivationInstructions.value_;
                    aVar3 = new C12914a(mVMissingTicketActivationConfirmationInstructions.title, mVMissingTicketActivationConfirmationInstructions.subtitle);
                } else {
                    MVMissingTicketActivationInstructions.m27711k((MVMissingTicketActivationInstructions._Fields) mVMissingTicketActivationInstructions.setField_);
                    throw new RuntimeException("Cannot get field 'confirmationInstructions' because union is currently set to confirmationInstructions");
                }
            } else {
                StringBuilder k = C13555b.m33972k("Cannot get field 'missingActivationInstructions' because union is currently set to ");
                k.append(MVActivateTicketResponse.m27516k((MVActivateTicketResponse._Fields) mVActivateTicketResponse.setField_).f63355a);
                throw new RuntimeException(k.toString());
            }
        }
        this.f32202n = aVar3;
        if (ticketId == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (aVar3 != null) {
            z6 = false;
        }
        if (z4 == z6) {
            throw new BadResponseException("Only one of ticketInfo/missingActivationInstructions must be set!");
        }
    }

    public C13011b(TicketId ticketId) {
        super(MVActivateTicketResponse.class);
        this.f32201m = ticketId;
        this.f32202n = null;
    }

    public C13011b(C12914a aVar) {
        super(MVActivateTicketResponse.class);
        this.f32201m = null;
        this.f32202n = aVar;
    }
}
