package p357ae;

import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;

/* renamed from: ae.c */
public abstract class C13416c {
    private static final Logger zza = new Logger("PhoneAuthProvider", new String[0]);

    public void onCodeAutoRetrievalTimeOut(String str) {
        zza.mo65855i("Sms auto retrieval timed-out.", new Object[0]);
    }

    public void onCodeSent(String str, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken) {
    }

    public abstract void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential);

    public abstract void onVerificationFailed(FirebaseException firebaseException);
}
