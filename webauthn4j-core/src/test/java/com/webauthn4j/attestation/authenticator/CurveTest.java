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

package com.webauthn4j.attestation.authenticator;

import com.webauthn4j.util.ECUtil;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CurveTest {

    @Test
    public void create_test(){
        assertThat(Curve.create(1)).isEqualTo(Curve.SECP256R1);
        assertThat(Curve.create(2)).isEqualTo(Curve.SECP384R1);
        assertThat(Curve.create(3)).isEqualTo(Curve.SECP521R1);
    }

    @Test
    public void getECParameterSpec_test(){
        assertThat(Curve.SECP256R1.getECParameterSpec()).isEqualTo(ECUtil.P_256_SPEC);
        assertThat(Curve.SECP384R1.getECParameterSpec()).isEqualTo(ECUtil.P_384_SPEC);
        assertThat(Curve.SECP521R1.getECParameterSpec()).isEqualTo(ECUtil.P_521_SPEC);
    }

}