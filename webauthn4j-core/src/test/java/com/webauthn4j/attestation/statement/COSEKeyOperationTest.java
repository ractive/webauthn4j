/*
 * Copyright 2002-2018 the original author or authors.
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

package com.webauthn4j.attestation.statement;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class COSEKeyOperationTest {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    public void create_test() {

        assertThat(COSEKeyOperation.create(1)).isEqualTo(COSEKeyOperation.SIGN);
        assertThat(COSEKeyOperation.create(2)).isEqualTo(COSEKeyOperation.VERIFY);
        assertThat(COSEKeyOperation.create(3)).isEqualTo(COSEKeyOperation.ENCRYPT);
        assertThat(COSEKeyOperation.create(4)).isEqualTo(COSEKeyOperation.DECRYPT);
        assertThat(COSEKeyOperation.create(5)).isEqualTo(COSEKeyOperation.WRAP_KEY);
        assertThat(COSEKeyOperation.create(6)).isEqualTo(COSEKeyOperation.UNWRAP_KEY);
        assertThat(COSEKeyOperation.create(7)).isEqualTo(COSEKeyOperation.DERIVE_KEY);
        assertThat(COSEKeyOperation.create(8)).isEqualTo(COSEKeyOperation.DERIVE_BITS);
        assertThat(COSEKeyOperation.create(9)).isEqualTo(COSEKeyOperation.MAC_CREATE);
        assertThat(COSEKeyOperation.create(10)).isEqualTo(COSEKeyOperation.MAC_VERIFY);

        assertThatThrownBy(() -> COSEKeyOperation.create(0)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> COSEKeyOperation.create(11)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void getValueTest() {
        assertThat(COSEKeyOperation.SIGN.getValue()).isEqualTo(1);
    }
}
