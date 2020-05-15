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

package com.google.api.services.file.v1beta1.model;

/**
 * Request message for the Report method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportRequest extends com.google.api.client.json.GenericJson {

  /**
   * Operations to be reported.
   *
   * Typically the service should report one operation per request. Putting multiple operations into
   * a single request is allowed, but should be used only when multiple operations are natually
   * available at the time of the report.
   *
   * There is no limit on the number of operations in the same ReportRequest, however the
   * ReportRequest size should be no larger than 1MB. See ReportResponse.report_errors for partial
   * failure behavior.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleApiServicecontrolV1Operation> operations;

  static {
    // hack to force ProGuard to consider GoogleApiServicecontrolV1Operation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleApiServicecontrolV1Operation.class);
  }

  /**
   * Specifies which version of service config should be used to process the request.
   *
   * If unspecified or no matching version can be found, the latest one will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceConfigId;

  /**
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See [google.api.Service](https://cloud.google.com/service-
   * management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * Operations to be reported.
   *
   * Typically the service should report one operation per request. Putting multiple operations into
   * a single request is allowed, but should be used only when multiple operations are natually
   * available at the time of the report.
   *
   * There is no limit on the number of operations in the same ReportRequest, however the
   * ReportRequest size should be no larger than 1MB. See ReportResponse.report_errors for partial
   * failure behavior.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleApiServicecontrolV1Operation> getOperations() {
    return operations;
  }

  /**
   * Operations to be reported.
   *
   * Typically the service should report one operation per request. Putting multiple operations into
   * a single request is allowed, but should be used only when multiple operations are natually
   * available at the time of the report.
   *
   * There is no limit on the number of operations in the same ReportRequest, however the
   * ReportRequest size should be no larger than 1MB. See ReportResponse.report_errors for partial
   * failure behavior.
   * @param operations operations or {@code null} for none
   */
  public ReportRequest setOperations(java.util.List<GoogleApiServicecontrolV1Operation> operations) {
    this.operations = operations;
    return this;
  }

  /**
   * Specifies which version of service config should be used to process the request.
   *
   * If unspecified or no matching version can be found, the latest one will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceConfigId() {
    return serviceConfigId;
  }

  /**
   * Specifies which version of service config should be used to process the request.
   *
   * If unspecified or no matching version can be found, the latest one will be used.
   * @param serviceConfigId serviceConfigId or {@code null} for none
   */
  public ReportRequest setServiceConfigId(java.lang.String serviceConfigId) {
    this.serviceConfigId = serviceConfigId;
    return this;
  }

  /**
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See [google.api.Service](https://cloud.google.com/service-
   * management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See [google.api.Service](https://cloud.google.com/service-
   * management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
   * @param serviceName serviceName or {@code null} for none
   */
  public ReportRequest setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  @Override
  public ReportRequest set(String fieldName, Object value) {
    return (ReportRequest) super.set(fieldName, value);
  }

  @Override
  public ReportRequest clone() {
    return (ReportRequest) super.clone();
  }

}
