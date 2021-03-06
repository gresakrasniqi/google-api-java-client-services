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

package com.google.api.services.youtube.model;

/**
 * Geographical coordinates of a point, in WGS84.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeoPoint extends com.google.api.client.json.GenericJson {

  /**
   * Altitude above the reference ellipsoid, in meters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double altitude;

  /**
   * Latitude in degrees.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latitude;

  /**
   * Longitude in degrees.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double longitude;

  /**
   * Altitude above the reference ellipsoid, in meters.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAltitude() {
    return altitude;
  }

  /**
   * Altitude above the reference ellipsoid, in meters.
   * @param altitude altitude or {@code null} for none
   */
  public GeoPoint setAltitude(java.lang.Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Latitude in degrees.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * Latitude in degrees.
   * @param latitude latitude or {@code null} for none
   */
  public GeoPoint setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Longitude in degrees.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * Longitude in degrees.
   * @param longitude longitude or {@code null} for none
   */
  public GeoPoint setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
    return this;
  }

  @Override
  public GeoPoint set(String fieldName, Object value) {
    return (GeoPoint) super.set(fieldName, value);
  }

  @Override
  public GeoPoint clone() {
    return (GeoPoint) super.clone();
  }

}
