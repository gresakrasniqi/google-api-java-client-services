/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.servicemanagement.model;

/**
 * OAuth scopes are a way to define data and permissions on data. For example, there are scopes
 * defined for "Read-only access to Google Calendar" and "Access to Cloud Platform". Users can
 * consent to a scope for an application, giving it permission to access that data on their behalf.
 *
 * OAuth scope specifications should be fairly coarse grained; a user will need to see and
 * understand the text description of what your scope means.
 *
 * In most cases: use one or at most two OAuth scopes for an entire family of products. If your
 * product has multiple APIs, you should probably be sharing the OAuth scope across all of those
 * APIs.
 *
 * When you need finer grained OAuth consent screens: talk with your product management about how
 * developers will use them in practice.
 *
 * Please note that even though each of the canonical scopes is enough for a request to be accepted
 * and passed to the backend, a request can still fail due to the backend requiring additional
 * scopes or permissions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OAuthRequirements extends com.google.api.client.json.GenericJson {

  /**
   * The list of publicly documented OAuth scopes that are allowed access. An OAuth token containing
   * any of these scopes will be accepted.
   *
   * Example:
   *
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   * https://www.googleapis.com/auth/calendar.read
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalScopes;

  /**
   * The list of publicly documented OAuth scopes that are allowed access. An OAuth token containing
   * any of these scopes will be accepted.
   *
   * Example:
   *
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   * https://www.googleapis.com/auth/calendar.read
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalScopes() {
    return canonicalScopes;
  }

  /**
   * The list of publicly documented OAuth scopes that are allowed access. An OAuth token containing
   * any of these scopes will be accepted.
   *
   * Example:
   *
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   * https://www.googleapis.com/auth/calendar.read
   * @param canonicalScopes canonicalScopes or {@code null} for none
   */
  public OAuthRequirements setCanonicalScopes(java.lang.String canonicalScopes) {
    this.canonicalScopes = canonicalScopes;
    return this;
  }

  @Override
  public OAuthRequirements set(String fieldName, Object value) {
    return (OAuthRequirements) super.set(fieldName, value);
  }

  @Override
  public OAuthRequirements clone() {
    return (OAuthRequirements) super.clone();
  }

}