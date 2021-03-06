/*
 *  Copyright (c) 2014-2019 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.kumuluz.ee.configuration;

/**
 * Optional implementation of this interface can be registered as
 * a service provider to implement decoding of certain configuration keys' values.
 *
 * @author Jan Meznarič
 * @since 3.2.1
 */
public interface ConfigurationDecoder {

    /**
     * Check if key's value should be decoded.
     *
     * @param key configuration key to be checked for decoding
     * @return returns true if key's value should be decoded with the decode(String key, String value) method
     */
    boolean shouldDecode(String key);

    /**
     * Decode values of encoded keys.
     *
     * @param key   encoded key
     * @param value encoded value
     * @return decoded value
     */
    String decode(String key, String value);
}
