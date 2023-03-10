package p382be;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

/* renamed from: be.f */
public final class C13597f {
    /* renamed from: a */
    public static Status m34015a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        if (asList.size() > 1) {
            return m34016b((String) asList.get(0), (String) asList.get(1));
        }
        return m34016b((String) asList.get(0), (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.Status m34016b(java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -2130504259: goto L_0x0329;
                case -2065866930: goto L_0x031e;
                case -2014808264: goto L_0x0313;
                case -2005236790: goto L_0x0308;
                case -2001169389: goto L_0x02fe;
                case -1944433728: goto L_0x02f3;
                case -1800638118: goto L_0x02e8;
                case -1774756919: goto L_0x02dd;
                case -1587614300: goto L_0x02d2;
                case -1583894766: goto L_0x02c6;
                case -1458751677: goto L_0x02ba;
                case -1421414571: goto L_0x02ae;
                case -1345867105: goto L_0x02a2;
                case -1340100504: goto L_0x0296;
                case -1232010689: goto L_0x028a;
                case -1202691903: goto L_0x027e;
                case -1112393964: goto L_0x0273;
                case -1063710844: goto L_0x0267;
                case -974503964: goto L_0x025b;
                case -863830559: goto L_0x024f;
                case -828507413: goto L_0x0244;
                case -749743758: goto L_0x0238;
                case -736207500: goto L_0x022c;
                case -646022241: goto L_0x0220;
                case -595928767: goto L_0x0214;
                case -333672188: goto L_0x0208;
                case -294485423: goto L_0x01fc;
                case -217128228: goto L_0x01f0;
                case -122667194: goto L_0x01e4;
                case -75433118: goto L_0x01d8;
                case -40686718: goto L_0x01cc;
                case 15352275: goto L_0x01c0;
                case 210308040: goto L_0x01b4;
                case 269327773: goto L_0x01a8;
                case 278802867: goto L_0x019c;
                case 408411681: goto L_0x0190;
                case 423563023: goto L_0x0184;
                case 429251986: goto L_0x0178;
                case 483847807: goto L_0x016c;
                case 491979549: goto L_0x0160;
                case 492072102: goto L_0x0154;
                case 542728406: goto L_0x0148;
                case 582457886: goto L_0x013c;
                case 605031096: goto L_0x0130;
                case 745638750: goto L_0x0124;
                case 786916712: goto L_0x0118;
                case 799258561: goto L_0x010c;
                case 819646646: goto L_0x0101;
                case 844240628: goto L_0x00f5;
                case 886186878: goto L_0x00e9;
                case 895302372: goto L_0x00dd;
                case 922685102: goto L_0x00d1;
                case 989000548: goto L_0x00c5;
                case 1034932393: goto L_0x00ba;
                case 1072360691: goto L_0x00af;
                case 1094975491: goto L_0x00a3;
                case 1107081238: goto L_0x0097;
                case 1141576252: goto L_0x008b;
                case 1199811910: goto L_0x007f;
                case 1226505451: goto L_0x0073;
                case 1388786705: goto L_0x0068;
                case 1433767024: goto L_0x005d;
                case 1442968770: goto L_0x0051;
                case 1494923453: goto L_0x0045;
                case 1497901284: goto L_0x0039;
                case 1803454477: goto L_0x002d;
                case 1898790704: goto L_0x0021;
                case 2063209097: goto L_0x0015;
                case 2082564316: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0334
        L_0x0009:
            java.lang.String r0 = "UNSUPPORTED_TENANT_OPERATION"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 49
            goto L_0x0335
        L_0x0015:
            java.lang.String r0 = "EMAIL_CHANGE_NEEDS_VERIFICATION"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 63
            goto L_0x0335
        L_0x0021:
            java.lang.String r0 = "MISSING_SESSION_INFO"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 35
            goto L_0x0335
        L_0x002d:
            java.lang.String r0 = "MISSING_CONTINUE_URI"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 44
            goto L_0x0335
        L_0x0039:
            java.lang.String r0 = "TOO_MANY_ATTEMPTS_TRY_LATER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 21
            goto L_0x0335
        L_0x0045:
            java.lang.String r0 = "INVALID_APP_CREDENTIAL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 19
            goto L_0x0335
        L_0x0051:
            java.lang.String r0 = "INVALID_PHONE_NUMBER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 32
            goto L_0x0335
        L_0x005d:
            java.lang.String r0 = "USER_DISABLED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 5
            goto L_0x0335
        L_0x0068:
            java.lang.String r0 = "INVALID_IDENTIFIER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 6
            goto L_0x0335
        L_0x0073:
            java.lang.String r0 = "FEDERATED_USER_ID_ALREADY_LINKED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 12
            goto L_0x0335
        L_0x007f:
            java.lang.String r0 = "MISSING_CODE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 33
            goto L_0x0335
        L_0x008b:
            java.lang.String r0 = "SESSION_EXPIRED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 38
            goto L_0x0335
        L_0x0097:
            java.lang.String r0 = "<<Network Error>>"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 15
            goto L_0x0335
        L_0x00a3:
            java.lang.String r0 = "INVALID_PASSWORD"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 11
            goto L_0x0335
        L_0x00af:
            java.lang.String r0 = "INVALID_CUSTOM_TOKEN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 2
            goto L_0x0335
        L_0x00ba:
            java.lang.String r0 = "INVALID_PENDING_TOKEN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 3
            goto L_0x0335
        L_0x00c5:
            java.lang.String r0 = "RESET_PASSWORD_EXCEED_LIMIT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 22
            goto L_0x0335
        L_0x00d1:
            java.lang.String r0 = "INVALID_MESSAGE_PAYLOAD"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 26
            goto L_0x0335
        L_0x00dd:
            java.lang.String r0 = "MISSING_CLIENT_IDENTIFIER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 65
            goto L_0x0335
        L_0x00e9:
            java.lang.String r0 = "REQUIRES_SECOND_FACTOR_AUTH"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 53
            goto L_0x0335
        L_0x00f5:
            java.lang.String r0 = "WEB_CONTEXT_CANCELED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 48
            goto L_0x0335
        L_0x0101:
            java.lang.String r0 = "CREDENTIAL_MISMATCH"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 1
            goto L_0x0335
        L_0x010c:
            java.lang.String r0 = "INVALID_PROVIDER_ID"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 46
            goto L_0x0335
        L_0x0118:
            java.lang.String r0 = "INVALID_VERIFICATION_PROOF"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 37
            goto L_0x0335
        L_0x0124:
            java.lang.String r0 = "INVALID_MFA_PENDING_CREDENTIAL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 56
            goto L_0x0335
        L_0x0130:
            java.lang.String r0 = "REJECTED_CREDENTIAL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 52
            goto L_0x0335
        L_0x013c:
            java.lang.String r0 = "UNVERIFIED_EMAIL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 59
            goto L_0x0335
        L_0x0148:
            java.lang.String r0 = "PASSWORD_LOGIN_DISABLED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 18
            goto L_0x0335
        L_0x0154:
            java.lang.String r0 = "WEB_STORAGE_UNSUPPORTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 43
            goto L_0x0335
        L_0x0160:
            java.lang.String r0 = "INVALID_ID_TOKEN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 13
            goto L_0x0335
        L_0x016c:
            java.lang.String r0 = "EMAIL_EXISTS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 10
            goto L_0x0335
        L_0x0178:
            java.lang.String r0 = "UNSUPPORTED_PASSTHROUGH_OPERATION"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 68
            goto L_0x0335
        L_0x0184:
            java.lang.String r0 = "MISSING_MFA_PENDING_CREDENTIAL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 54
            goto L_0x0335
        L_0x0190:
            java.lang.String r0 = "INVALID_DYNAMIC_LINK_DOMAIN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 51
            goto L_0x0335
        L_0x019c:
            java.lang.String r0 = "MISSING_PHONE_NUMBER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 31
            goto L_0x0335
        L_0x01a8:
            java.lang.String r0 = "INVALID_SENDER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 27
            goto L_0x0335
        L_0x01b4:
            java.lang.String r0 = "UNSUPPORTED_FIRST_FACTOR"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 62
            goto L_0x0335
        L_0x01c0:
            java.lang.String r0 = "EMAIL_NOT_FOUND"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 8
            goto L_0x0335
        L_0x01cc:
            java.lang.String r0 = "WEAK_PASSWORD"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 16
            goto L_0x0335
        L_0x01d8:
            java.lang.String r0 = "USER_NOT_FOUND"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 9
            goto L_0x0335
        L_0x01e4:
            java.lang.String r0 = "MISSING_MFA_ENROLLMENT_ID"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 55
            goto L_0x0335
        L_0x01f0:
            java.lang.String r0 = "SECOND_FACTOR_LIMIT_EXCEEDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 61
            goto L_0x0335
        L_0x01fc:
            java.lang.String r0 = "WEB_INTERNAL_ERROR"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 42
            goto L_0x0335
        L_0x0208:
            java.lang.String r0 = "OPERATION_NOT_ALLOWED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 17
            goto L_0x0335
        L_0x0214:
            java.lang.String r0 = "TIMEOUT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 14
            goto L_0x0335
        L_0x0220:
            java.lang.String r0 = "CREDENTIAL_TOO_OLD_LOGIN_AGAIN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 20
            goto L_0x0335
        L_0x022c:
            java.lang.String r0 = "MISSING_PASSWORD"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 30
            goto L_0x0335
        L_0x0238:
            java.lang.String r0 = "MFA_ENROLLMENT_NOT_FOUND"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 57
            goto L_0x0335
        L_0x0244:
            java.lang.String r0 = "NO_SUCH_PROVIDER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 0
            goto L_0x0335
        L_0x024f:
            java.lang.String r0 = "INVALID_CERT_HASH"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 40
            goto L_0x0335
        L_0x025b:
            java.lang.String r0 = "MISSING_OR_INVALID_NONCE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 66
            goto L_0x0335
        L_0x0267:
            java.lang.String r0 = "ADMIN_ONLY_OPERATION"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 58
            goto L_0x0335
        L_0x0273:
            java.lang.String r0 = "INVALID_EMAIL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 7
            goto L_0x0335
        L_0x027e:
            java.lang.String r0 = "SECOND_FACTOR_EXISTS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 60
            goto L_0x0335
        L_0x028a:
            java.lang.String r0 = "INVALID_SESSION_INFO"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 36
            goto L_0x0335
        L_0x0296:
            java.lang.String r0 = "INVALID_TENANT_ID"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 50
            goto L_0x0335
        L_0x02a2:
            java.lang.String r0 = "TOKEN_EXPIRED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 23
            goto L_0x0335
        L_0x02ae:
            java.lang.String r0 = "INVALID_CODE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 34
            goto L_0x0335
        L_0x02ba:
            java.lang.String r0 = "MISSING_EMAIL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 29
            goto L_0x0335
        L_0x02c6:
            java.lang.String r0 = "INVALID_OOB_CODE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 24
            goto L_0x0335
        L_0x02d2:
            java.lang.String r0 = "EXPIRED_OOB_CODE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 25
            goto L_0x0335
        L_0x02dd:
            java.lang.String r0 = "WEB_NETWORK_REQUEST_FAILED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 41
            goto L_0x0335
        L_0x02e8:
            java.lang.String r0 = "QUOTA_EXCEEDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 39
            goto L_0x0335
        L_0x02f3:
            java.lang.String r0 = "DYNAMIC_LINK_NOT_ACTIVATED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 45
            goto L_0x0335
        L_0x02fe:
            java.lang.String r0 = "INVALID_IDP_RESPONSE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 4
            goto L_0x0335
        L_0x0308:
            java.lang.String r0 = "INTERNAL_SUCCESS_SIGN_OUT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 64
            goto L_0x0335
        L_0x0313:
            java.lang.String r0 = "WEB_CONTEXT_ALREADY_PRESENTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 47
            goto L_0x0335
        L_0x031e:
            java.lang.String r0 = "INVALID_RECIPIENT_EMAIL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 28
            goto L_0x0335
        L_0x0329:
            java.lang.String r0 = "USER_CANCELLED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 67
            goto L_0x0335
        L_0x0334:
            r0 = -1
        L_0x0335:
            r1 = 17499(0x445b, float:2.4521E-41)
            switch(r0) {
                case 0: goto L_0x041d;
                case 1: goto L_0x041a;
                case 2: goto L_0x0417;
                case 3: goto L_0x0414;
                case 4: goto L_0x0414;
                case 5: goto L_0x0411;
                case 6: goto L_0x040e;
                case 7: goto L_0x040e;
                case 8: goto L_0x040b;
                case 9: goto L_0x040b;
                case 10: goto L_0x0408;
                case 11: goto L_0x0405;
                case 12: goto L_0x0402;
                case 13: goto L_0x03ff;
                case 14: goto L_0x03fc;
                case 15: goto L_0x03fc;
                case 16: goto L_0x03f9;
                case 17: goto L_0x03f6;
                case 18: goto L_0x03f6;
                case 19: goto L_0x03f3;
                case 20: goto L_0x03f0;
                case 21: goto L_0x03ed;
                case 22: goto L_0x03ed;
                case 23: goto L_0x03ea;
                case 24: goto L_0x03e7;
                case 25: goto L_0x03e4;
                case 26: goto L_0x03e1;
                case 27: goto L_0x03de;
                case 28: goto L_0x03db;
                case 29: goto L_0x03d8;
                case 30: goto L_0x03d5;
                case 31: goto L_0x03d2;
                case 32: goto L_0x03ce;
                case 33: goto L_0x03ca;
                case 34: goto L_0x03c6;
                case 35: goto L_0x03c2;
                case 36: goto L_0x03be;
                case 37: goto L_0x03ba;
                case 38: goto L_0x03b6;
                case 39: goto L_0x03b2;
                case 40: goto L_0x03ae;
                case 41: goto L_0x03aa;
                case 42: goto L_0x03a6;
                case 43: goto L_0x03a2;
                case 44: goto L_0x039e;
                case 45: goto L_0x039a;
                case 46: goto L_0x0396;
                case 47: goto L_0x0392;
                case 48: goto L_0x038e;
                case 49: goto L_0x038a;
                case 50: goto L_0x0386;
                case 51: goto L_0x0382;
                case 52: goto L_0x037e;
                case 53: goto L_0x037a;
                case 54: goto L_0x0376;
                case 55: goto L_0x0372;
                case 56: goto L_0x036e;
                case 57: goto L_0x036a;
                case 58: goto L_0x0366;
                case 59: goto L_0x0362;
                case 60: goto L_0x035e;
                case 61: goto L_0x035a;
                case 62: goto L_0x0356;
                case 63: goto L_0x0352;
                case 64: goto L_0x034e;
                case 65: goto L_0x034a;
                case 66: goto L_0x0346;
                case 67: goto L_0x0342;
                case 68: goto L_0x033e;
                default: goto L_0x033a;
            }
        L_0x033a:
            r0 = 17499(0x445b, float:2.4521E-41)
            goto L_0x041f
        L_0x033e:
            r0 = 17095(0x42c7, float:2.3955E-41)
            goto L_0x041f
        L_0x0342:
            r0 = 18001(0x4651, float:2.5225E-41)
            goto L_0x041f
        L_0x0346:
            r0 = 17094(0x42c6, float:2.3954E-41)
            goto L_0x041f
        L_0x034a:
            r0 = 17093(0x42c5, float:2.3952E-41)
            goto L_0x041f
        L_0x034e:
            r0 = 17091(0x42c3, float:2.395E-41)
            goto L_0x041f
        L_0x0352:
            r0 = 17090(0x42c2, float:2.3948E-41)
            goto L_0x041f
        L_0x0356:
            r0 = 17089(0x42c1, float:2.3947E-41)
            goto L_0x041f
        L_0x035a:
            r0 = 17088(0x42c0, float:2.3945E-41)
            goto L_0x041f
        L_0x035e:
            r0 = 17087(0x42bf, float:2.3944E-41)
            goto L_0x041f
        L_0x0362:
            r0 = 17086(0x42be, float:2.3943E-41)
            goto L_0x041f
        L_0x0366:
            r0 = 17085(0x42bd, float:2.3941E-41)
            goto L_0x041f
        L_0x036a:
            r0 = 17084(0x42bc, float:2.394E-41)
            goto L_0x041f
        L_0x036e:
            r0 = 17083(0x42bb, float:2.3938E-41)
            goto L_0x041f
        L_0x0372:
            r0 = 17082(0x42ba, float:2.3937E-41)
            goto L_0x041f
        L_0x0376:
            r0 = 17081(0x42b9, float:2.3936E-41)
            goto L_0x041f
        L_0x037a:
            r0 = 17078(0x42b6, float:2.3931E-41)
            goto L_0x041f
        L_0x037e:
            r0 = 17075(0x42b3, float:2.3927E-41)
            goto L_0x041f
        L_0x0382:
            r0 = 17074(0x42b2, float:2.3926E-41)
            goto L_0x041f
        L_0x0386:
            r0 = 17079(0x42b7, float:2.3933E-41)
            goto L_0x041f
        L_0x038a:
            r0 = 17073(0x42b1, float:2.3924E-41)
            goto L_0x041f
        L_0x038e:
            r0 = 17058(0x42a2, float:2.3903E-41)
            goto L_0x041f
        L_0x0392:
            r0 = 17057(0x42a1, float:2.3902E-41)
            goto L_0x041f
        L_0x0396:
            r0 = 17071(0x42af, float:2.3922E-41)
            goto L_0x041f
        L_0x039a:
            r0 = 17068(0x42ac, float:2.3917E-41)
            goto L_0x041f
        L_0x039e:
            r0 = 17040(0x4290, float:2.3878E-41)
            goto L_0x041f
        L_0x03a2:
            r0 = 17065(0x42a9, float:2.3913E-41)
            goto L_0x041f
        L_0x03a6:
            r0 = 17062(0x42a6, float:2.3909E-41)
            goto L_0x041f
        L_0x03aa:
            r0 = 17061(0x42a5, float:2.3908E-41)
            goto L_0x041f
        L_0x03ae:
            r0 = 17064(0x42a8, float:2.3912E-41)
            goto L_0x041f
        L_0x03b2:
            r0 = 17052(0x429c, float:2.3895E-41)
            goto L_0x041f
        L_0x03b6:
            r0 = 17051(0x429b, float:2.3894E-41)
            goto L_0x041f
        L_0x03ba:
            r0 = 17049(0x4299, float:2.3891E-41)
            goto L_0x041f
        L_0x03be:
            r0 = 17046(0x4296, float:2.3887E-41)
            goto L_0x041f
        L_0x03c2:
            r0 = 17045(0x4295, float:2.3885E-41)
            goto L_0x041f
        L_0x03c6:
            r0 = 17044(0x4294, float:2.3884E-41)
            goto L_0x041f
        L_0x03ca:
            r0 = 17043(0x4293, float:2.3882E-41)
            goto L_0x041f
        L_0x03ce:
            r0 = 17042(0x4292, float:2.3881E-41)
            goto L_0x041f
        L_0x03d2:
            r0 = 17041(0x4291, float:2.388E-41)
            goto L_0x041f
        L_0x03d5:
            r0 = 17035(0x428b, float:2.3871E-41)
            goto L_0x041f
        L_0x03d8:
            r0 = 17034(0x428a, float:2.387E-41)
            goto L_0x041f
        L_0x03db:
            r0 = 17033(0x4289, float:2.3868E-41)
            goto L_0x041f
        L_0x03de:
            r0 = 17032(0x4288, float:2.3867E-41)
            goto L_0x041f
        L_0x03e1:
            r0 = 17031(0x4287, float:2.3866E-41)
            goto L_0x041f
        L_0x03e4:
            r0 = 17029(0x4285, float:2.3863E-41)
            goto L_0x041f
        L_0x03e7:
            r0 = 17030(0x4286, float:2.3864E-41)
            goto L_0x041f
        L_0x03ea:
            r0 = 17021(0x427d, float:2.3852E-41)
            goto L_0x041f
        L_0x03ed:
            r0 = 17010(0x4272, float:2.3836E-41)
            goto L_0x041f
        L_0x03f0:
            r0 = 17014(0x4276, float:2.3842E-41)
            goto L_0x041f
        L_0x03f3:
            r0 = 17028(0x4284, float:2.3861E-41)
            goto L_0x041f
        L_0x03f6:
            r0 = 17006(0x426e, float:2.383E-41)
            goto L_0x041f
        L_0x03f9:
            r0 = 17026(0x4282, float:2.3859E-41)
            goto L_0x041f
        L_0x03fc:
            r0 = 17020(0x427c, float:2.385E-41)
            goto L_0x041f
        L_0x03ff:
            r0 = 17017(0x4279, float:2.3846E-41)
            goto L_0x041f
        L_0x0402:
            r0 = 17025(0x4281, float:2.3857E-41)
            goto L_0x041f
        L_0x0405:
            r0 = 17009(0x4271, float:2.3835E-41)
            goto L_0x041f
        L_0x0408:
            r0 = 17007(0x426f, float:2.3832E-41)
            goto L_0x041f
        L_0x040b:
            r0 = 17011(0x4273, float:2.3837E-41)
            goto L_0x041f
        L_0x040e:
            r0 = 17008(0x4270, float:2.3833E-41)
            goto L_0x041f
        L_0x0411:
            r0 = 17005(0x426d, float:2.3829E-41)
            goto L_0x041f
        L_0x0414:
            r0 = 17004(0x426c, float:2.3828E-41)
            goto L_0x041f
        L_0x0417:
            r0 = 17000(0x4268, float:2.3822E-41)
            goto L_0x041f
        L_0x041a:
            r0 = 17002(0x426a, float:2.3825E-41)
            goto L_0x041f
        L_0x041d:
            r0 = 17016(0x4278, float:2.3844E-41)
        L_0x041f:
            if (r0 != r1) goto L_0x0435
            if (r4 == 0) goto L_0x042f
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = ":"
            java.lang.String r3 = p358af.C13437d.m33706k(r3, r2, r4)
            r0.<init>((int) r1, (java.lang.String) r3)
            return r0
        L_0x042f:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r4.<init>((int) r1, (java.lang.String) r3)
            return r4
        L_0x0435:
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r3.<init>((int) r0, (java.lang.String) r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p382be.C13597f.m34016b(java.lang.String, java.lang.String):com.google.android.gms.common.api.Status");
    }
}
