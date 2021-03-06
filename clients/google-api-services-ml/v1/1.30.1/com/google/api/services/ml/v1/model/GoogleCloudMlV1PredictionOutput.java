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

package com.google.api.services.ml.v1.model;

/**
 * Represents results of a prediction job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1PredictionOutput extends com.google.api.client.json.GenericJson {

  /**
   * The number of data instances which resulted in errors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long errorCount;

  /**
   * Node hours used by the batch prediction job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double nodeHours;

  /**
   * The output Google Cloud Storage location provided at the job creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputPath;

  /**
   * The number of generated predictions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long predictionCount;

  /**
   * The number of data instances which resulted in errors.
   * @return value or {@code null} for none
   */
  public java.lang.Long getErrorCount() {
    return errorCount;
  }

  /**
   * The number of data instances which resulted in errors.
   * @param errorCount errorCount or {@code null} for none
   */
  public GoogleCloudMlV1PredictionOutput setErrorCount(java.lang.Long errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * Node hours used by the batch prediction job.
   * @return value or {@code null} for none
   */
  public java.lang.Double getNodeHours() {
    return nodeHours;
  }

  /**
   * Node hours used by the batch prediction job.
   * @param nodeHours nodeHours or {@code null} for none
   */
  public GoogleCloudMlV1PredictionOutput setNodeHours(java.lang.Double nodeHours) {
    this.nodeHours = nodeHours;
    return this;
  }

  /**
   * The output Google Cloud Storage location provided at the job creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputPath() {
    return outputPath;
  }

  /**
   * The output Google Cloud Storage location provided at the job creation time.
   * @param outputPath outputPath or {@code null} for none
   */
  public GoogleCloudMlV1PredictionOutput setOutputPath(java.lang.String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

  /**
   * The number of generated predictions.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPredictionCount() {
    return predictionCount;
  }

  /**
   * The number of generated predictions.
   * @param predictionCount predictionCount or {@code null} for none
   */
  public GoogleCloudMlV1PredictionOutput setPredictionCount(java.lang.Long predictionCount) {
    this.predictionCount = predictionCount;
    return this;
  }

  @Override
  public GoogleCloudMlV1PredictionOutput set(String fieldName, Object value) {
    return (GoogleCloudMlV1PredictionOutput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1PredictionOutput clone() {
    return (GoogleCloudMlV1PredictionOutput) super.clone();
  }

}
