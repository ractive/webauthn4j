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

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

/**
 * Attestation metadata.certs container
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "format")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "fido-u2f", value = FIDOU2FAttestationStatement.class),
        @JsonSubTypes.Type(name = "packed", value = PackedAttestationStatement.class),
        @JsonSubTypes.Type(name = "none", value = NoneAttestationStatement.class)
})
public interface AttestationStatement extends Serializable {
    String getFormat();

    void validate();
}
