package com.moovit.auth;

import androidx.annotation.Keep;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.moovit.MoovitExecutors;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p435de.C16596f;
import p976zy.C20920a;
import p976zy.C20921b;
import p976zy.C20922c;
import p976zy.C20923d;

public final class FirebaseAuthUtils {

    /* renamed from: a */
    public static final long f40780a = TimeUnit.MINUTES.toSeconds(5);

    @Keep
    public static class FirebaseAuthException extends RuntimeException {
        public FirebaseAuthException(String str) {
            super(str);
        }

        public FirebaseAuthException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    public static void m40011a(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        String str2;
        try {
            String str3 = (String) Tasks.await(m40012b(0, false));
            if (str3 == null) {
                str3 = "ERROR:NO_TOKEN";
            }
            httpURLConnection.setRequestProperty("Access-Token", str3);
        } catch (InterruptedException e) {
            throw new InterruptedIOException(e.getMessage());
        } catch (Exception e2) {
            C16596f.m42113a().mo49364c(new FirebaseAuthException("Failed to add access token!", e2));
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR:");
            Throwable cause = e2.getCause();
            if (cause instanceof com.google.firebase.auth.FirebaseAuthException) {
                StringBuilder k = C13555b.m33972k("CODE:");
                k.append(((com.google.firebase.auth.FirebaseAuthException) cause).mo43275a());
                k.append(", ");
                k.append(cause.getMessage());
                str = k.toString();
            } else {
                str = e2.getMessage();
            }
            try {
                str2 = URLEncoder.encode(str, "UTF-8");
            } catch (Exception unused) {
                str2 = e2.getClass().getSimpleName();
            }
            sb.append(str2);
            httpURLConnection.setRequestProperty("Access-Token", sb.toString());
        }
    }

    /* renamed from: b */
    public static Task m40012b(int i, boolean z) {
        Task task;
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().f36386f;
        if (firebaseUser != null) {
            task = Tasks.forResult(firebaseUser);
        } else {
            task = Tasks.call(MoovitExecutors.COMPUTATION, new C20920a());
        }
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        return task.onSuccessTask(executorService, new C20921b(z)).continueWithTask(executorService, new C20922c(z, i)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C20923d(0));
    }
}
