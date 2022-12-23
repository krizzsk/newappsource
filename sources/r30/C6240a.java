package r30;

import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.integration.MicroMobilityIntegrationView;

/* renamed from: r30.a */
public final /* synthetic */ class C6240a implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ MicroMobilityIntegrationView f19690b;

    /* renamed from: c */
    public final /* synthetic */ MicroMobilityIntegrationItem f19691c;

    public /* synthetic */ C6240a(MicroMobilityIntegrationView microMobilityIntegrationView, MicroMobilityIntegrationItem microMobilityIntegrationItem) {
        this.f19690b = microMobilityIntegrationView;
        this.f19691c = microMobilityIntegrationItem;
    }

    public final void onFailure(Exception exc) {
        this.f19690b.setupIntegrationButtons(this.f19691c);
    }
}
