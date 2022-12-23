package com.moovit.ticketing.purchase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13751d;
import com.appboy.Constants;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.location.C16202a;
import com.moovit.payment.gateway.AbstractPaymentGatewayActivity;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import com.moovit.ticketing.protocol.PurchaseTicketIntent;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueIntent;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import m80.C12865a;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12875k;
import m80.C12887v;
import p054d0.C4291k0;
import p112ha.C5182f0;
import p244s3.C6443r;
import p372at.C13515b;
import p431cy.C16525b;
import p471eq.C16851b;
import p471eq.C16855d;
import p495fq.C17060e;
import p543hq.C17478e;
import p555ie.C17589h;
import p687nt.C18588a;
import p80.C12991b;
import p80.C12995d;
import p805su.C19543e;
import p858uz.C20061g;
import p977zz.C20947k;
import q00.C19047a;
import v80.C13186d;
import z20.C20806a;

public class PurchaseTicketActivity extends AbstractPaymentGatewayActivity implements PurchaseStep.C7645a {

    /* renamed from: Y */
    public static final /* synthetic */ int f23250Y = 0;

    /* renamed from: X */
    public C13186d f23251X;

    /* renamed from: z2 */
    public static Intent m17465z2(Context context, PurchaseIntent purchaseIntent) {
        Intent intent = new Intent(context, PurchaseTicketActivity.class);
        if (purchaseIntent != null) {
            intent.putExtra("purchaseIntent", purchaseIntent);
        }
        return intent;
    }

    /* renamed from: A2 */
    public final void mo24027A2(Exception exc) {
        mo44506I1();
        if (!C20947k.m49056a(this)) {
            mo44530n2(C13751d.m34342c(this, (String) null, (Exception) null).mo47683l(C12873i.payment_network_unavailable_title).mo47678g(C12873i.payment_network_unavailable_message).mo47673b());
        } else {
            mo44530n2(C13751d.m34341b(this, (String) null, exc));
        }
    }

    /* renamed from: B2 */
    public final void mo24028B2(Intent intent) {
        C20806a.C20807a aVar = new C20806a.C20807a("ticket_purchase_intent_se");
        aVar.mo52934b("ticketing", "feature");
        aVar.mo52935c();
        mo44543u2((CharSequence) null);
        Object obj = (PurchaseIntent) intent.getParcelableExtra("purchaseIntent");
        if (obj == null) {
            Uri data = intent.getData();
            if (data == null) {
                obj = new PurchaseGenericIntent();
            } else {
                String queryParameter = data.getQueryParameter("type");
                if (queryParameter == null) {
                    obj = new PurchaseGenericIntent();
                } else {
                    String queryParameter2 = data.getQueryParameter("ak");
                    if (queryParameter.equals(Constants.APPBOY_PUSH_TITLE_KEY)) {
                        obj = new PurchaseTicketIntent(queryParameter2);
                    } else if (!queryParameter.equals("sv")) {
                        obj = new PurchaseGenericIntent();
                    } else {
                        obj = new PurchaseStoredValueIntent(queryParameter2);
                    }
                }
            }
        }
        C13186d dVar = this.f23251X;
        dVar.getClass();
        C12887v b = C12887v.m32668b();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C17589h(b, 6)).onSuccessTask(executorService, new C5182f0(3, (C12991b) mo44537r1("TICKETING_CONFIGURATION"), obj)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C6443r(2)).onSuccessTask(MoovitExecutors.MAIN_THREAD, new C4291k0(dVar, 18)).addOnSuccessListener((Activity) this, new C13515b(this, 13)).addOnFailureListener((Activity) this, (OnFailureListener) new C19543e(this, 8)).addOnCompleteListener((Activity) this, new C18588a(this, 7));
    }

    /* renamed from: C2 */
    public final void mo24029C2(List<Ticket> list) {
        if (C13717b.m34258e(list)) {
            startActivity(C12875k.m32667g(this));
        } else if (((Boolean) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C12995d.f32168d)).booleanValue()) {
            startActivity(BaseTicketActivationActivity.m17425z2(this, PurchaseTicketsConfirmedActivity.class, C13720d.m34273c(list, (C13722f) null, new C17478e(21)), list));
        } else {
            Ticket ticket = list.get(0);
            TicketId ticketId = ticket.f23473b;
            int size = list.size();
            Intent z2 = BaseTicketActivationActivity.m17425z2(this, PurchaseTicketConfirmedActivity.class, Collections.singletonList(ticketId), Collections.singletonList(ticket));
            z2.putExtra("numberOfTickets", size);
            startActivity(z2);
        }
        setResult(-1);
        finish();
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if (mo44529n1(C12869e.fragment_container) == null) {
            finish();
        }
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo24028B2(intent);
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        int i = C12869e.view_pager;
        C16525b c = new C17060e(this).mo49508c();
        c.mo49314a(TimeUnit.SECONDS.toMillis(30));
        return new C16855d(this, i, Collections.singletonList((C16851b) c.f43144b));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C12870f.purchase_ticket_activity);
        this.f23251X = (C13186d) new C1026n0(this).mo4313a(C13186d.class);
        if (mo44529n1(C12869e.fragment_container) == null) {
            mo24028B2(getIntent());
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("TICKETING_CONFIGURATION");
        hashSet.add("CONFIGURATION");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo24030y2(Fragment fragment) {
        mo44506I1();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar = new C0909a(supportFragmentManager);
        int i = C12869e.fragment_container;
        if (mo44529n1(i) != null) {
            aVar.mo4112g(C12865a.slide_fragment_enter, C12865a.slide_fragment_exit, C12865a.slide_fragment_pop_enter, C12865a.slide_fragment_pop_exit);
            aVar.mo4111f(i, fragment, (String) null);
            aVar.mo4110c((String) null);
        } else {
            aVar.mo4111f(i, fragment, (String) null);
        }
        aVar.mo4040d();
    }
}
