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

package com.google.api.services.proximitybeacon.v1beta1.model;

/**
 * A subset of attachment information served via the `beaconinfo.getforobserved` method, used when
 * your users encounter your beacons.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Proximity Beacon API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttachmentInfo extends com.google.api.client.json.GenericJson {

  /**
   * An opaque data container for client-provided data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * The distance away from the beacon at which this attachment should be delivered to a mobile app.
   *
   * Setting this to a value greater than zero indicates that the app should behave as if the beacon
   * is "seen" when the mobile device is less than this distance away from the beacon.
   *
   * Different attachments on the same beacon can have different max distances.
   *
   * Note that even though this value is expressed with fractional meter precision, real-world
   * behavior is likley to be much less precise than one meter, due to the nature of current
   * Bluetooth radio technology.
   *
   * Optional. When not set or zero, the attachment should be delivered at the beacon's outer limit
   * of detection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxDistanceMeters;

  /**
   * Specifies what kind of attachment this is. Tells a client how to interpret the `data` field.
   * Format is namespace/type, for example scrupulous-wombat-12345/welcome-message
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespacedType;

  /**
   * An opaque data container for client-provided data.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * An opaque data container for client-provided data.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * An opaque data container for client-provided data.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public AttachmentInfo setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * An opaque data container for client-provided data.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AttachmentInfo encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * The distance away from the beacon at which this attachment should be delivered to a mobile app.
   *
   * Setting this to a value greater than zero indicates that the app should behave as if the beacon
   * is "seen" when the mobile device is less than this distance away from the beacon.
   *
   * Different attachments on the same beacon can have different max distances.
   *
   * Note that even though this value is expressed with fractional meter precision, real-world
   * behavior is likley to be much less precise than one meter, due to the nature of current
   * Bluetooth radio technology.
   *
   * Optional. When not set or zero, the attachment should be delivered at the beacon's outer limit
   * of detection.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxDistanceMeters() {
    return maxDistanceMeters;
  }

  /**
   * The distance away from the beacon at which this attachment should be delivered to a mobile app.
   *
   * Setting this to a value greater than zero indicates that the app should behave as if the beacon
   * is "seen" when the mobile device is less than this distance away from the beacon.
   *
   * Different attachments on the same beacon can have different max distances.
   *
   * Note that even though this value is expressed with fractional meter precision, real-world
   * behavior is likley to be much less precise than one meter, due to the nature of current
   * Bluetooth radio technology.
   *
   * Optional. When not set or zero, the attachment should be delivered at the beacon's outer limit
   * of detection.
   * @param maxDistanceMeters maxDistanceMeters or {@code null} for none
   */
  public AttachmentInfo setMaxDistanceMeters(java.lang.Double maxDistanceMeters) {
    this.maxDistanceMeters = maxDistanceMeters;
    return this;
  }

  /**
   * Specifies what kind of attachment this is. Tells a client how to interpret the `data` field.
   * Format is namespace/type, for example scrupulous-wombat-12345/welcome-message
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespacedType() {
    return namespacedType;
  }

  /**
   * Specifies what kind of attachment this is. Tells a client how to interpret the `data` field.
   * Format is namespace/type, for example scrupulous-wombat-12345/welcome-message
   * @param namespacedType namespacedType or {@code null} for none
   */
  public AttachmentInfo setNamespacedType(java.lang.String namespacedType) {
    this.namespacedType = namespacedType;
    return this;
  }

  @Override
  public AttachmentInfo set(String fieldName, Object value) {
    return (AttachmentInfo) super.set(fieldName, value);
  }

  @Override
  public AttachmentInfo clone() {
    return (AttachmentInfo) super.clone();
  }

}