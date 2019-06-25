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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Content of an item to be indexed and surfaced by Cloud Search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ItemContent extends com.google.api.client.json.GenericJson {

  /**
   * Upload reference ID of a previously uploaded content via write method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UploadItemRef contentDataRef;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentFormat;

  /**
   * Hashing info calculated and provided by the API client for content. Can be used with the
   * items.push method to calculate modified state. The maximum length is 2048 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hash;

  /**
   * Content that is supplied inlined within the update method. The maximum length is 102400 bytes
   * (100 KiB).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inlineContent;

  /**
   * Upload reference ID of a previously uploaded content via write method.
   * @return value or {@code null} for none
   */
  public UploadItemRef getContentDataRef() {
    return contentDataRef;
  }

  /**
   * Upload reference ID of a previously uploaded content via write method.
   * @param contentDataRef contentDataRef or {@code null} for none
   */
  public ItemContent setContentDataRef(UploadItemRef contentDataRef) {
    this.contentDataRef = contentDataRef;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getContentFormat() {
    return contentFormat;
  }

  /**
   * @param contentFormat contentFormat or {@code null} for none
   */
  public ItemContent setContentFormat(java.lang.String contentFormat) {
    this.contentFormat = contentFormat;
    return this;
  }

  /**
   * Hashing info calculated and provided by the API client for content. Can be used with the
   * items.push method to calculate modified state. The maximum length is 2048 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getHash() {
    return hash;
  }

  /**
   * Hashing info calculated and provided by the API client for content. Can be used with the
   * items.push method to calculate modified state. The maximum length is 2048 characters.
   * @param hash hash or {@code null} for none
   */
  public ItemContent setHash(java.lang.String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Content that is supplied inlined within the update method. The maximum length is 102400 bytes
   * (100 KiB).
   * @see #decodeInlineContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getInlineContent() {
    return inlineContent;
  }

  /**
   * Content that is supplied inlined within the update method. The maximum length is 102400 bytes
   * (100 KiB).
   * @see #getInlineContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeInlineContent() {
    return com.google.api.client.util.Base64.decodeBase64(inlineContent);
  }

  /**
   * Content that is supplied inlined within the update method. The maximum length is 102400 bytes
   * (100 KiB).
   * @see #encodeInlineContent()
   * @param inlineContent inlineContent or {@code null} for none
   */
  public ItemContent setInlineContent(java.lang.String inlineContent) {
    this.inlineContent = inlineContent;
    return this;
  }

  /**
   * Content that is supplied inlined within the update method. The maximum length is 102400 bytes
   * (100 KiB).
   * @see #setInlineContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ItemContent encodeInlineContent(byte[] inlineContent) {
    this.inlineContent = com.google.api.client.util.Base64.encodeBase64URLSafeString(inlineContent);
    return this;
  }

  @Override
  public ItemContent set(String fieldName, Object value) {
    return (ItemContent) super.set(fieldName, value);
  }

  @Override
  public ItemContent clone() {
    return (ItemContent) super.clone();
  }

}