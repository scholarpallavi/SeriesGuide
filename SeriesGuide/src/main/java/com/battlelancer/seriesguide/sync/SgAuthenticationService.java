
/*
 * Copyright 2014 Uwe Trottmann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.battlelancer.seriesguide.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class SgAuthenticationService extends Service {

    private static final String TAG = "SgAuthenticationService";
    SgAccountAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        Log.d(TAG, "Creating authenticator service");
        mAuthenticator = new SgAccountAuthenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "Binding authenticator");
        return mAuthenticator.getIBinder();
    }

}
