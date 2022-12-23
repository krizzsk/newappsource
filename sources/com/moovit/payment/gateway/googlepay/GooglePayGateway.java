package com.moovit.payment.gateway.googlepay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.support.StringUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.PaymentGatewayType;
import com.moovit.request.UserRequestError;
import java.util.concurrent.ExecutorService;
import p054d0.C4291k0;
import p244s3.C6448w;
import p543hq.C17474b;
import p583jk.C17884p;
import v40.C25754i;

public class GooglePayGateway implements PaymentGateway {
    public static final Parcelable.Creator<GooglePayGateway> CREATOR = new C16338a();

    /* renamed from: b */
    public final String f42695b;

    /* renamed from: c */
    public final String f42696c;

    /* renamed from: com.moovit.payment.gateway.googlepay.GooglePayGateway$a */
    public class C16338a implements Parcelable.Creator<GooglePayGateway> {
        public final Object createFromParcel(Parcel parcel) {
            return new GooglePayGateway(parcel);
        }

        public final Object[] newArray(int i) {
            return new GooglePayGateway[i];
        }
    }

    public GooglePayGateway(String str, String str2) {
        C21100e.m49373x(str, "isReadyToPayRequest");
        this.f42695b = str;
        C21100e.m49373x(str2, "paymentDataRequest");
        this.f42696c = str2;
    }

    /* renamed from: B1 */
    public final Task<Boolean> mo48903B1(Context context, PaymentGatewayInfo paymentGatewayInfo) {
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        return Tasks.call(executorService, new C6448w(this, 5)).onSuccessTask(executorService, new C4291k0(context, 15));
    }

    /* renamed from: F1 */
    public final <V, R> R mo48904F1(PaymentGateway.C16321b<V, R> bVar, V v) {
        return bVar.mo48920d1(this, v);
    }

    /* renamed from: J0 */
    public final PaymentGateway.Tokenizer mo48905J0(PaymentGateway.C16320a aVar) {
        return new GooglePayTokenizer(this.f42696c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayGateway)) {
            return false;
        }
        GooglePayGateway googlePayGateway = (GooglePayGateway) obj;
        if (!this.f42695b.equals(googlePayGateway.f42695b) || !this.f42696c.equals(googlePayGateway.f42696c)) {
            return false;
        }
        return true;
    }

    public final PaymentGatewayType getType() {
        return PaymentGatewayType.GOOGLE_PAY;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42695b), C17884p.m44335F(this.f42696c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42695b);
        parcel.writeString(this.f42696c);
    }

    public static class GooglePayTokenizer extends PaymentGateway.Tokenizer {
        public static final Parcelable.Creator<GooglePayTokenizer> CREATOR = new C16337a();

        /* renamed from: d */
        public final String f42697d;

        /* renamed from: com.moovit.payment.gateway.googlepay.GooglePayGateway$GooglePayTokenizer$a */
        public class C16337a implements Parcelable.Creator<GooglePayTokenizer> {
            public final Object createFromParcel(Parcel parcel) {
                return new GooglePayTokenizer(parcel);
            }

            public final Object[] newArray(int i) {
                return new GooglePayTokenizer[i];
            }
        }

        public GooglePayTokenizer(String str) {
            C21100e.m49373x(str, "paymentDataRequest");
            this.f42697d = str;
        }

        /* renamed from: g */
        public static UserRequestError m41692g(MoovitActivity moovitActivity, Status status) {
            int i;
            String str;
            if (status != null) {
                i = status.getStatusCode();
            } else {
                i = -1;
            }
            String string = moovitActivity.getString(C25754i.general_error_title);
            if (status == null || status.getStatusMessage() == null) {
                str = moovitActivity.getString(C25754i.general_error_description);
            } else {
                str = status.getStatusMessage();
            }
            return new UserRequestError(i, string, str);
        }

        /* renamed from: c */
        public final boolean mo48913c(MoovitActivity moovitActivity, int i, int i2, Intent intent) {
            String str;
            String str2;
            if (i != 3834) {
                return false;
            }
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.RESPONSE);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "google_pay");
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.STATUS;
            if (i2 == -1) {
                str = WidgetMessageParser.KEY_SUCCESS;
            } else if (i2 == 0) {
                str = "canceled";
            } else if (i2 != 1) {
                str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            } else {
                str = "error";
            }
            aVar.mo49939g(analyticsAttributeKey, str);
            AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.ERROR_MESSAGE;
            if (statusFromIntent != null) {
                str2 = statusFromIntent.getStatusMessage();
            } else {
                str2 = null;
            }
            aVar.mo49945m(analyticsAttributeKey2, str2);
            moovitActivity.mo44545v2(aVar.mo49933a());
            if (i2 == -1) {
                PaymentData fromIntent = PaymentData.getFromIntent(intent);
                if (fromIntent != null) {
                    mo48912b(new PaymentGateway.Tokenizer.Result(1, new GooglePayGatewayToken(fromIntent.toJson()), (UserRequestError) null));
                } else {
                    mo48912b(new PaymentGateway.Tokenizer.Result(2, (PaymentGatewayToken) null, m41692g(moovitActivity, (Status) null)));
                }
            } else if (i2 == 0) {
                mo48912b(new PaymentGateway.Tokenizer.Result(3, (PaymentGatewayToken) null, (UserRequestError) null));
            } else if (i2 == 1) {
                mo48912b(new PaymentGateway.Tokenizer.Result(2, (PaymentGatewayToken) null, m41692g(moovitActivity, statusFromIntent)));
            }
            return true;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: f */
        public final void mo48908f(MoovitActivity moovitActivity) {
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            Tasks.call(executorService, new C16340a(this)).onSuccessTask(executorService, new C16341b(moovitActivity)).addOnCompleteListener((Activity) moovitActivity, new C16342c(moovitActivity));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f42697d);
        }

        public GooglePayTokenizer(Parcel parcel) {
            super(parcel);
            String readString = parcel.readString();
            C21100e.m49373x(readString, "paymentDataRequest");
            this.f42697d = readString;
        }
    }

    public GooglePayGateway(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "isReadyToPayRequest");
        this.f42695b = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "paymentDataRequest");
        this.f42696c = readString2;
    }
}
