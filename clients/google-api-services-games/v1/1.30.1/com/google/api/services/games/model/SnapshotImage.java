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

package com.google.api.services.games.model;

/**
 * This is a JSON template for an image of a snapshot.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SnapshotImage extends com.google.api.client.json.GenericJson {

  /**
   * The height of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#snapshotImage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The MIME type of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("mime_type")
  private java.lang.String mimeType;

  /**
   * The URL of the image. This URL may be invalidated at any time and should not be cached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The width of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * The height of the image.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * The height of the image.
   * @param height height or {@code null} for none
   */
  public SnapshotImage setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#snapshotImage.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#snapshotImage.
   * @param kind kind or {@code null} for none
   */
  public SnapshotImage setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The MIME type of the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * The MIME type of the image.
   * @param mimeType mimeType or {@code null} for none
   */
  public SnapshotImage setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The URL of the image. This URL may be invalidated at any time and should not be cached.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL of the image. This URL may be invalidated at any time and should not be cached.
   * @param url url or {@code null} for none
   */
  public SnapshotImage setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * The width of the image.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * The width of the image.
   * @param width width or {@code null} for none
   */
  public SnapshotImage setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public SnapshotImage set(String fieldName, Object value) {
    return (SnapshotImage) super.set(fieldName, value);
  }

  @Override
  public SnapshotImage clone() {
    return (SnapshotImage) super.clone();
  }

}