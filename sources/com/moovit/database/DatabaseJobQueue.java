package com.moovit.database;

import android.content.Context;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p977zz.C20932c0;

public class DatabaseJobQueue {
    private static final DatabaseJobQueue INSTANCE = new DatabaseJobQueue();
    private final Executor executor = Executors.newSingleThreadExecutor(C20932c0.m49025a("database-job-thread"));

    public static abstract class Job implements Callable<Void>, Runnable {
        private final Context appContext;

        public Job(Context context) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.appContext = context.getApplicationContext();
        }

        public final void run() {
            try {
                call();
            } catch (Exception unused) {
            }
        }

        public abstract void work(Context context, SQLiteDatabase sQLiteDatabase) throws Exception;

        public final Void call() throws Exception {
            SQLiteDatabase writableDatabase = DatabaseHelper.get(this.appContext).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                work(this.appContext, writableDatabase);
                writableDatabase.setTransactionSuccessful();
                return null;
            } finally {
                writableDatabase.endTransaction();
            }
        }
    }

    private DatabaseJobQueue() {
    }

    public static DatabaseJobQueue get() {
        return INSTANCE;
    }

    public Task<Void> postJob(Job job) {
        return Tasks.call(this.executor, job);
    }
}
