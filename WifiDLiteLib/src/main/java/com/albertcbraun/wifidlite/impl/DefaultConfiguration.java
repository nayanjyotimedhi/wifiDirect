/*
 * Copyright (c) 2014 Albert C. Braun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.albertcbraun.wifidlite.impl;

import com.albertcbraun.wifidlite.Configuration;

/**
 * A {@link com.albertcbraun.wifidlite.Configuration} object with sensible defaults.
 */
public class DefaultConfiguration implements Configuration {

    private static final int HEARTBEAT_DELAY_SEC = 10;

    @Override
    public int getHeartbeatDelay() {
        return HEARTBEAT_DELAY_SEC;
    }

}
