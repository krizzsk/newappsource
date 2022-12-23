package com.moovit.payment.account.external.employee;

import android.os.Bundle;
import com.moovit.MoovitActivity;
import com.moovit.design.view.list.ListItemView;
import p501fw.C17102a;
import v40.C25750e;
import v40.C25751f;

public class EmployeeAccountActivity extends MoovitActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f63998U = 0;

    /* renamed from: com.moovit.payment.account.external.employee.EmployeeAccountActivity$a */
    public static /* synthetic */ class C25659a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63999a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.env.ServerEnvironment[] r0 = com.moovit.env.ServerEnvironment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f63999a = r0
                com.moovit.env.ServerEnvironment r1 = com.moovit.env.ServerEnvironment.PROD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f63999a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.env.ServerEnvironment r1 = com.moovit.env.ServerEnvironment.STG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f63999a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.env.ServerEnvironment r1 = com.moovit.env.ServerEnvironment.QA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.external.employee.EmployeeAccountActivity.C25659a.<clinit>():void");
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.employee_account_activity);
        ((ListItemView) findViewById(C25750e.my_dashboard)).setOnClickListener(new C17102a(this, 16));
    }
}
