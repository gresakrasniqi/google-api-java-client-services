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

package com.google.api.services.documentai.v1beta2.model;

/**
 * Parameters to control table extraction behavior.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2TableExtractionParams extends com.google.api.client.json.GenericJson {

  /**
   * Whether to enable table extraction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Optional. Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> headerHints;

  /**
   * Model version of the table extraction system. Default is "builtin/stable". Specify
   * "builtin/latest" for the latest model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelVersion;

  /**
   * Optional. Table bounding box hints that can be provided to complex cases which our algorithm
   * cannot locate the table(s) in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2TableBoundHint> tableBoundHints;

  static {
    // hack to force ProGuard to consider GoogleCloudDocumentaiV1beta2TableBoundHint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDocumentaiV1beta2TableBoundHint.class);
  }

  /**
   * Whether to enable table extraction.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether to enable table extraction.
   * @param enabled enabled or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2TableExtractionParams setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Optional. Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getHeaderHints() {
    return headerHints;
  }

  /**
   * Optional. Reserved for future use.
   * @param headerHints headerHints or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2TableExtractionParams setHeaderHints(java.util.List<java.lang.String> headerHints) {
    this.headerHints = headerHints;
    return this;
  }

  /**
   * Model version of the table extraction system. Default is "builtin/stable". Specify
   * "builtin/latest" for the latest model.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelVersion() {
    return modelVersion;
  }

  /**
   * Model version of the table extraction system. Default is "builtin/stable". Specify
   * "builtin/latest" for the latest model.
   * @param modelVersion modelVersion or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2TableExtractionParams setModelVersion(java.lang.String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * Optional. Table bounding box hints that can be provided to complex cases which our algorithm
   * cannot locate the table(s) in.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2TableBoundHint> getTableBoundHints() {
    return tableBoundHints;
  }

  /**
   * Optional. Table bounding box hints that can be provided to complex cases which our algorithm
   * cannot locate the table(s) in.
   * @param tableBoundHints tableBoundHints or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2TableExtractionParams setTableBoundHints(java.util.List<GoogleCloudDocumentaiV1beta2TableBoundHint> tableBoundHints) {
    this.tableBoundHints = tableBoundHints;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2TableExtractionParams set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2TableExtractionParams) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2TableExtractionParams clone() {
    return (GoogleCloudDocumentaiV1beta2TableExtractionParams) super.clone();
  }

}
