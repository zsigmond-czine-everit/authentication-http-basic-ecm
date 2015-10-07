/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.authentication.http.basic.ecm.internal;

/**
 * Constants of HttpBasicAuthFilter attribute priority.
 */
public final class HttpBasicAuthFilterAttributePriority {

  public static final int P1_SERVICE_DESCRIPTION = 1;

  public static final int P2_REALM = 2;

  public static final int P3_AUTHENTICATOR = 3;

  public static final int P4_RESOURCE_ID_RESOLVER = 4;

  public static final int P5_AUTHENTICATION_PROPAGATOR = 5;

  private HttpBasicAuthFilterAttributePriority() {
  }
}
