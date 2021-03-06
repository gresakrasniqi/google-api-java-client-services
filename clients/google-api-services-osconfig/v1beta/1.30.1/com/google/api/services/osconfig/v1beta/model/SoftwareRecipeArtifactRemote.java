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

package com.google.api.services.osconfig.v1beta.model;

/**
 * Specifies an artifact available via some URI.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SoftwareRecipeArtifactRemote extends com.google.api.client.json.GenericJson {

  /**
   * Must be provided if `allow_insecure` is `false`. SHA256 checksum in hex format, to compare to
   * the checksum of the artifact. If the checksum is not empty and it doesn't match the artifact
   * then the recipe installation fails before running any of the steps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String checksum;

  /**
   * URI from which to fetch the object. It should contain both the protocol and path following the
   * format {protocol}://{location}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Must be provided if `allow_insecure` is `false`. SHA256 checksum in hex format, to compare to
   * the checksum of the artifact. If the checksum is not empty and it doesn't match the artifact
   * then the recipe installation fails before running any of the steps.
   * @return value or {@code null} for none
   */
  public java.lang.String getChecksum() {
    return checksum;
  }

  /**
   * Must be provided if `allow_insecure` is `false`. SHA256 checksum in hex format, to compare to
   * the checksum of the artifact. If the checksum is not empty and it doesn't match the artifact
   * then the recipe installation fails before running any of the steps.
   * @param checksum checksum or {@code null} for none
   */
  public SoftwareRecipeArtifactRemote setChecksum(java.lang.String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * URI from which to fetch the object. It should contain both the protocol and path following the
   * format {protocol}://{location}.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI from which to fetch the object. It should contain both the protocol and path following the
   * format {protocol}://{location}.
   * @param uri uri or {@code null} for none
   */
  public SoftwareRecipeArtifactRemote setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public SoftwareRecipeArtifactRemote set(String fieldName, Object value) {
    return (SoftwareRecipeArtifactRemote) super.set(fieldName, value);
  }

  @Override
  public SoftwareRecipeArtifactRemote clone() {
    return (SoftwareRecipeArtifactRemote) super.clone();
  }

}
