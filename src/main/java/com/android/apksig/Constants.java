/*
 * Copyright (C) 2020 The Android Open Source Project
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

package com.android.apksig;

/**
 * Exports internally defined constants to allow clients to reference these values without relying
 * on internal code.
 */
public class Constants {
    private Constants() {}

    /**
     * The maximum number of signers supported by the v1 and v2 APK Signature Schemes.
     */
    public static final int MAX_APK_SIGNERS = 10;
}
