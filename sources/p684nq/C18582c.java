package p684nq;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: nq.c */
public final /* synthetic */ class C18582c implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ C18584e f47309b;

    /* renamed from: c */
    public final /* synthetic */ Task f47310c;

    /* renamed from: d */
    public final /* synthetic */ Task f47311d;

    public /* synthetic */ C18582c(C18584e eVar, Task task, Task task2) {
        this.f47309b = eVar;
        this.f47310c = task;
        this.f47311d = task2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.List<com.moovit.app.mot.model.MotActivation>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.Task r15) {
        /*
            r14 = this;
            nq.e r15 = r14.f47309b
            com.google.android.gms.tasks.Task r0 = r14.f47310c
            com.google.android.gms.tasks.Task r1 = r14.f47311d
            java.util.concurrent.atomic.AtomicBoolean r2 = r15.f47317v
            r3 = 0
            r2.set(r3)
            android.content.Context r2 = r15.getContext()
            if (r2 != 0) goto L_0x0014
            goto L_0x019c
        L_0x0014:
            boolean r4 = r0.isSuccessful()
            if (r4 != 0) goto L_0x0022
            r0.getException()
            r15.mo50562x2()
            goto L_0x019c
        L_0x0022:
            boolean r4 = r1.isSuccessful()
            if (r4 != 0) goto L_0x0030
            r1.getException()
            r15.mo50562x2()
            goto L_0x019c
        L_0x0030:
            boolean r4 = r0.isSuccessful()
            r5 = 0
            if (r4 == 0) goto L_0x003e
            java.lang.Object r0 = r0.getResult()
            com.moovit.payment.account.model.PaymentAccount r0 = (com.moovit.payment.account.model.PaymentAccount) r0
            goto L_0x003f
        L_0x003e:
            r0 = r5
        L_0x003f:
            boolean r4 = r1.isSuccessful()
            if (r4 == 0) goto L_0x004c
            java.lang.Object r1 = r1.getResult()
            r5 = r1
            java.util.List r5 = (java.util.List) r5
        L_0x004c:
            if (r5 == 0) goto L_0x0051
            r5.size()
        L_0x0051:
            r15.f47314s = r5
            r1 = 1
            com.moovit.payment.account.model.PaymentAccountContextStatus[] r4 = new com.moovit.payment.account.model.PaymentAccountContextStatus[r1]
            com.moovit.payment.account.model.PaymentAccountContextStatus r6 = com.moovit.payment.account.model.PaymentAccountContextStatus.CONNECTED
            r4[r3] = r6
            java.lang.String r6 = "IsraelMot"
            boolean r4 = com.moovit.payment.account.model.PaymentAccount.m64175c(r0, r6, r4)
            r6 = 8
            if (r4 != 0) goto L_0x007f
            r15.f47316u = r3
            r15.mo50560v2(r3)
            boolean r0 = com.moovit.app.mot.welcome.MotAccountCreationWelcomeActivity.m38725y2(r2, r0)
            if (r0 == 0) goto L_0x0078
            x.o r0 = new x.o
            r1 = 12
            r0.<init>(r15, r1)
            goto L_0x019a
        L_0x0078:
            x.r1 r0 = new x.r1
            r0.<init>(r15, r6)
            goto L_0x019a
        L_0x007f:
            boolean r0 = c00.C13717b.m34258e(r5)
            if (r0 == 0) goto L_0x0093
            r15.f47316u = r3
            r15.mo50560v2(r3)
            androidx.appcompat.widget.i1 r0 = new androidx.appcompat.widget.i1
            r1 = 11
            r0.<init>(r15, r1)
            goto L_0x019a
        L_0x0093:
            java.lang.Object r0 = r5.get(r3)
            com.moovit.app.mot.model.MotActivation r0 = (com.moovit.app.mot.model.MotActivation) r0
            com.moovit.app.mot.model.MotActivation$Status r2 = r0.f38990g
            com.moovit.app.mot.model.MotActivation$Status r4 = com.moovit.app.mot.model.MotActivation.Status.ACTIVE
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00af
            com.moovit.app.mot.model.MotActivation$ActivationType r0 = r0.f38994k
            com.moovit.app.mot.model.MotActivation$ActivationType r2 = com.moovit.app.mot.model.MotActivation.ActivationType.DEPARTURE
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00af
            r0 = 1
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            r2 = 2131888557(0x7f1209ad, float:1.9411753E38)
            r7 = 2131231511(0x7f080317, float:1.8079105E38)
            java.lang.String r8 = "3"
            r9 = 2131888128(0x7f120800, float:1.9410883E38)
            r10 = 2131231594(0x7f08036a, float:1.8079273E38)
            java.lang.String r11 = "1"
            r12 = 2
            if (r0 == 0) goto L_0x00da
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem r4 = new com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem
            r4.<init>(r11, r10, r9)
            r0.add(r4)
            com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem r4 = new com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem
            r4.<init>(r8, r7, r2)
            r0.add(r4)
            goto L_0x015b
        L_0x00da:
            java.lang.Object r0 = r5.get(r3)
            com.moovit.app.mot.model.MotActivation r0 = (com.moovit.app.mot.model.MotActivation) r0
            com.moovit.app.mot.model.MotActivation$Status r13 = r0.f38990g
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L_0x00f4
            com.moovit.app.mot.model.MotActivation$ActivationType r0 = r0.f38994k
            com.moovit.app.mot.model.MotActivation$ActivationType r13 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_ONLY
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00f4
            r0 = 1
            goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r0 == 0) goto L_0x010d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem r4 = new com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem
            r4.<init>(r11, r10, r9)
            r0.add(r4)
            com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem r4 = new com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem
            r4.<init>(r8, r7, r2)
            r0.add(r4)
            goto L_0x015b
        L_0x010d:
            java.lang.Object r0 = r5.get(r3)
            com.moovit.app.mot.model.MotActivation r0 = (com.moovit.app.mot.model.MotActivation) r0
            com.moovit.app.mot.model.MotActivationStationInfo r2 = r0.f38997n
            com.moovit.app.mot.model.MotActivation$Status r13 = r0.f38990g
            boolean r4 = r13.equals(r4)
            if (r4 != 0) goto L_0x0127
            com.moovit.app.mot.model.MotActivation$Status r4 = r0.f38990g
            com.moovit.app.mot.model.MotActivation$Status r13 = com.moovit.app.mot.model.MotActivation.Status.COMPLETED
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x013b
        L_0x0127:
            com.moovit.app.mot.model.MotActivation$ActivationType r0 = r0.f38994k
            com.moovit.app.mot.model.MotActivation$ActivationType r4 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_AND_EXIT
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x013b
            if (r2 == 0) goto L_0x013b
            com.moovit.transit.TransitStop r0 = r2.mo45574b()
            if (r0 == 0) goto L_0x013b
            r0 = 1
            goto L_0x013c
        L_0x013b:
            r0 = 0
        L_0x013c:
            if (r0 == 0) goto L_0x0157
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem r2 = new com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem
            r2.<init>(r11, r10, r9)
            r0.add(r2)
            com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem r2 = new com.moovit.view.dialogs.BottomSheetMenuDialogFragment$MenuItem
            r4 = 2131888556(0x7f1209ac, float:1.941175E38)
            r2.<init>(r8, r7, r4)
            r0.add(r2)
            goto L_0x015b
        L_0x0157:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x015b:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0171
            int r2 = r5.size()
            r15.f47316u = r2
            r15.mo50560v2(r1)
            x.t r1 = new x.t
            r1.<init>(r6, r15, r0)
            r0 = r1
            goto L_0x019a
        L_0x0171:
            java.lang.Object r0 = r5.get(r3)
            com.moovit.app.mot.model.MotActivation r0 = (com.moovit.app.mot.model.MotActivation) r0
            boolean r0 = p664mu.C18464r.m45324a(r0)
            if (r0 == 0) goto L_0x018e
            int r0 = r5.size()
            r15.f47316u = r0
            r15.mo50560v2(r1)
            androidx.appcompat.widget.m1 r0 = new androidx.appcompat.widget.m1
            r1 = 13
            r0.<init>(r15, r1)
            goto L_0x019a
        L_0x018e:
            r15.f47316u = r3
            r15.mo50560v2(r1)
            androidx.appcompat.widget.n1 r0 = new androidx.appcompat.widget.n1
            r1 = 10
            r0.<init>(r15, r1)
        L_0x019a:
            r15.f47315t = r0
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p684nq.C18582c.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
