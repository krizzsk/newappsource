package j80;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.servicealerts.ServiceAlertAffectedLine;
import com.moovit.servicealerts.ServiceStatus;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.TransitAgency;
import com.moovit.util.Text;
import com.moovit.util.TextFormat;
import com.tranzmate.moovit.protocol.common.MVText;
import com.tranzmate.moovit.protocol.common.MVTextFormat;
import com.tranzmate.moovit.protocol.serviceAlerts.MVAffectedLine;
import com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertDigest;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatus;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p009a8.C0112l;
import p977zz.C20952m0;
import p977zz.C20964s0;

/* renamed from: j80.e */
public final class C12776e {

    /* renamed from: j80.e$a */
    public static /* synthetic */ class C12777a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31582a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory[] r0 = com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31582a = r0
                com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory r1 = com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31582a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory r1 = com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory.Regular     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31582a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory r1 = com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory.Modified     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31582a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory r1 = com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory.Info     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31582a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory r1 = com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatusCategory.Critical     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j80.C12776e.C12777a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static LineServiceAlertDigest m32577a(MVLineAlertDigest mVLineAlertDigest) {
        ServiceAlertAffectedLine c = m32579c(mVLineAlertDigest.affectedLine);
        ServiceStatus d = m32580d(mVLineAlertDigest.serviceStatus);
        List<String> list = mVLineAlertDigest.alertIds;
        if (C13717b.m34258e(list)) {
            return null;
        }
        return new LineServiceAlertDigest(c, d, list);
    }

    /* renamed from: b */
    public static ServiceAlert m32578b(MVServiceAlertDetails mVServiceAlertDetails) {
        DbEntityRef<TransitAgency> dbEntityRef;
        Date date;
        Date date2;
        Date date3;
        Text text;
        String str;
        String str2;
        TextFormat textFormat;
        String str3 = mVServiceAlertDetails.alertId;
        if (mVServiceAlertDetails.mo31630i()) {
            dbEntityRef = DbEntityRef.newAgencyRef(new ServerId(mVServiceAlertDetails.agencyId));
        } else {
            dbEntityRef = null;
        }
        ServiceStatus d = m32580d(mVServiceAlertDetails.serviceStatus);
        ArrayList<O> c = C13720d.m34273c(mVServiceAlertDetails.affectedLines, (C13722f) null, new C0112l(19));
        if (mVServiceAlertDetails.mo31635o()) {
            long j = mVServiceAlertDetails.publicationDate;
            C20952m0<Integer> m0Var = C13749c.f33838a;
            date = new Date(j);
        } else {
            date = null;
        }
        if (mVServiceAlertDetails.mo31626f()) {
            long j2 = mVServiceAlertDetails.activeFrom;
            C20952m0<Integer> m0Var2 = C13749c.f33838a;
            date2 = new Date(j2);
        } else {
            date2 = null;
        }
        if (mVServiceAlertDetails.mo31627g()) {
            long j3 = mVServiceAlertDetails.activeTo;
            C20952m0<Integer> m0Var3 = C13749c.f33838a;
            date3 = new Date(j3);
        } else {
            date3 = null;
        }
        String str4 = mVServiceAlertDetails.title;
        MVText mVText = mVServiceAlertDetails.desc;
        C20952m0<Integer> m0Var4 = C13749c.f33838a;
        if (mVText == null) {
            text = null;
        } else {
            String str5 = mVText.data;
            MVTextFormat mVTextFormat = mVText.format;
            int i = C13749c.C13750a.f33846h[mVTextFormat.ordinal()];
            if (i == 1) {
                textFormat = TextFormat.PLAIN;
            } else if (i == 2) {
                textFormat = TextFormat.HTML;
            } else {
                throw new ApplicationBugException("Unknown text format: " + mVTextFormat);
            }
            text = new Text(str5, textFormat, mVText.baseUrl);
        }
        String str6 = mVServiceAlertDetails.infoUrl;
        if (C20964s0.m49090h(mVServiceAlertDetails.alertPreviewText)) {
            str = null;
        } else {
            str = mVServiceAlertDetails.alertPreviewText;
        }
        if (mVServiceAlertDetails.mo31637q()) {
            str2 = mVServiceAlertDetails.shareUrl;
        } else {
            str2 = null;
        }
        return new ServiceAlert(str3, d, dbEntityRef, c, date, date2, date3, str4, text, str6, str, str2);
    }

    /* renamed from: c */
    public static ServiceAlertAffectedLine m32579c(MVAffectedLine mVAffectedLine) {
        ServerId serverId;
        String str = mVAffectedLine.name;
        Image g = C16028g.m40829g(mVAffectedLine.icon);
        if (mVAffectedLine.mo31557g()) {
            serverId = new ServerId(mVAffectedLine.lineGroupId);
        } else {
            serverId = null;
        }
        return new ServiceAlertAffectedLine(g, serverId, str);
    }

    /* renamed from: d */
    public static ServiceStatus m32580d(MVServiceStatus mVServiceStatus) {
        ServiceStatusCategory serviceStatusCategory;
        MVServiceStatusCategory mVServiceStatusCategory = mVServiceStatus.category;
        if (mVServiceStatusCategory == null) {
            serviceStatusCategory = ServiceStatusCategory.UNKNOWN;
        } else {
            int i = C12777a.f31582a[mVServiceStatusCategory.ordinal()];
            if (i == 1) {
                serviceStatusCategory = ServiceStatusCategory.UNKNOWN;
            } else if (i == 2) {
                serviceStatusCategory = ServiceStatusCategory.REGULAR;
            } else if (i == 3) {
                serviceStatusCategory = ServiceStatusCategory.MODIFIED;
            } else if (i == 4) {
                serviceStatusCategory = ServiceStatusCategory.INFO;
            } else if (i == 5) {
                serviceStatusCategory = ServiceStatusCategory.CRITICAL;
            } else {
                throw new ApplicationBugException("Unknown service status category: " + mVServiceStatusCategory);
            }
        }
        return new ServiceStatus(serviceStatusCategory, mVServiceStatus.desc);
    }

    /* renamed from: e */
    public static C12774c m32581e(MVServiceAlertDigest mVServiceAlertDigest) {
        Date date;
        Date date2;
        Date date3;
        String str = mVServiceAlertDigest.alertId;
        ServiceStatus d = m32580d(mVServiceAlertDigest.serviceStatus);
        String str2 = mVServiceAlertDigest.title;
        if (mVServiceAlertDigest.mo31652i()) {
            long j = mVServiceAlertDigest.publicationDate;
            C20952m0<Integer> m0Var = C13749c.f33838a;
            date = new Date(j);
        } else {
            date = null;
        }
        if (mVServiceAlertDigest.mo31648f()) {
            long j2 = mVServiceAlertDigest.activeFrom;
            C20952m0<Integer> m0Var2 = C13749c.f33838a;
            date2 = new Date(j2);
        } else {
            date2 = null;
        }
        if (mVServiceAlertDigest.mo31649g()) {
            long j3 = mVServiceAlertDigest.activeTo;
            C20952m0<Integer> m0Var3 = C13749c.f33838a;
            date3 = new Date(j3);
        } else {
            date3 = null;
        }
        return new C12774c(str, d, str2, date, date2, date3);
    }

    /* renamed from: f */
    public static List<LineServiceAlertDigest> m32582f(List<MVLineAlertDigest> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (MVLineAlertDigest a : list) {
            LineServiceAlertDigest a2 = m32577a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
