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

package com.webauthn4j.test.client;

public class AuthenticatorSelectionCriteria {

    private AuthenticatorAttachment authenticatorAttachment;
    private boolean requireResidentKey;
    private UserVerificationRequirement userVerificationRequirement = UserVerificationRequirement.PREFERRED;

    public AuthenticatorAttachment getAuthenticatorAttachment() {
        return authenticatorAttachment;
    }

    public void setAuthenticatorAttachment(AuthenticatorAttachment authenticatorAttachment) {
        this.authenticatorAttachment = authenticatorAttachment;
    }

    public boolean isRequireResidentKey() {
        return requireResidentKey;
    }

    public void setRequireResidentKey(boolean requireResidentKey) {
        this.requireResidentKey = requireResidentKey;
    }

    public UserVerificationRequirement getUserVerificationRequirement() {
        return userVerificationRequirement;
    }

    public void setUserVerificationRequirement(UserVerificationRequirement userVerificationRequirement) {
        this.userVerificationRequirement = userVerificationRequirement;
    }
}
