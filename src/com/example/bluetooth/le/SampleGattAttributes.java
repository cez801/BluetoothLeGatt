/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.bluetooth.le;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String NEXUS6_WRITEXML_CHARA = "f1a42261-aa44-11e2-9e96-0800200c9a66";
    public static String NEXUS6_READXML_CHARA = "f1a42262-aa44-11e2-9e96-0800200c9a66";
    public static String NEXUS6_XML_SERVICE = "f1a42260-aa44-11e2-9e96-0800200c9a66";
    public static String HARDWARE_PARTNO = "003b002c-002d-2800-2a05-180a2a232a24";
    public static String SERIAL_NUMBER = "002c002d-2800-2a05-180a-2a232a242a25";
    public static String FIRMWARE_VERSION = "002d2800-2a05-180a-2a23-2a242a252a26";
    public static String MANUFACTURE_NAME = "28002a05-180a-2a23-2a24-2a252a262a29";
    
    
    
    
    
    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put(NEXUS6_XML_SERVICE, "Nexus6 XML Service");
        
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put(NEXUS6_WRITEXML_CHARA, "Write XML");
        attributes.put(NEXUS6_READXML_CHARA, "Read XML");
        attributes.put(HARDWARE_PARTNO,"PCB Version");
        attributes.put(SERIAL_NUMBER, "Serial Number");
        attributes.put(FIRMWARE_VERSION, "Firmware Version");
        attributes.put(MANUFACTURE_NAME, "Manufacture");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
