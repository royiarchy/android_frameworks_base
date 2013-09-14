/*
 * Copyright (C) 2013 Coconut Project
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

package android.util;

import android.content.Context;
import android.content.res.Configuration;

/** @hide */
public class ExtendedPropertiesUtils {
    private static final String TAG = "ExtendedPropertiesUtils";

    /**
     * Returns whether if device is on tablet UI or not
     *
     * @return device is tablet
     */
    public static boolean isTablet(Context mContext) {
        return ((mContext.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_XLARGE);

    }
}
