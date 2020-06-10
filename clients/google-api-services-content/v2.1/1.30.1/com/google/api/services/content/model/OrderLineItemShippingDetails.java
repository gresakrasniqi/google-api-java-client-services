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

package com.google.api.services.content.model;

/**
 * Model definition for OrderLineItemShippingDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderLineItemShippingDetails extends com.google.api.client.json.GenericJson {

  /**
   * Required. The delivery by date, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deliverByDate;

  /**
   * Required. Details of the shipping method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderLineItemShippingDetailsMethod method;

  /**
   * The promised time in minutes in which the order will be ready for pickup. This only applies to
   * buy-online-pickup-in-store same-day order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long pickupPromiseInMinutes;

  /**
   * Required. The ship by date, in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shipByDate;

  /**
   * Type of shipment. Indicates whether `deliveryDetails` or `pickupDetails` is applicable for this
   * shipment.
   *
   * Acceptable values are:   - "`delivery`"  - "`pickup`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required. The delivery by date, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeliverByDate() {
    return deliverByDate;
  }

  /**
   * Required. The delivery by date, in ISO 8601 format.
   * @param deliverByDate deliverByDate or {@code null} for none
   */
  public OrderLineItemShippingDetails setDeliverByDate(java.lang.String deliverByDate) {
    this.deliverByDate = deliverByDate;
    return this;
  }

  /**
   * Required. Details of the shipping method.
   * @return value or {@code null} for none
   */
  public OrderLineItemShippingDetailsMethod getMethod() {
    return method;
  }

  /**
   * Required. Details of the shipping method.
   * @param method method or {@code null} for none
   */
  public OrderLineItemShippingDetails setMethod(OrderLineItemShippingDetailsMethod method) {
    this.method = method;
    return this;
  }

  /**
   * The promised time in minutes in which the order will be ready for pickup. This only applies to
   * buy-online-pickup-in-store same-day order.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPickupPromiseInMinutes() {
    return pickupPromiseInMinutes;
  }

  /**
   * The promised time in minutes in which the order will be ready for pickup. This only applies to
   * buy-online-pickup-in-store same-day order.
   * @param pickupPromiseInMinutes pickupPromiseInMinutes or {@code null} for none
   */
  public OrderLineItemShippingDetails setPickupPromiseInMinutes(java.lang.Long pickupPromiseInMinutes) {
    this.pickupPromiseInMinutes = pickupPromiseInMinutes;
    return this;
  }

  /**
   * Required. The ship by date, in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getShipByDate() {
    return shipByDate;
  }

  /**
   * Required. The ship by date, in ISO 8601 format.
   * @param shipByDate shipByDate or {@code null} for none
   */
  public OrderLineItemShippingDetails setShipByDate(java.lang.String shipByDate) {
    this.shipByDate = shipByDate;
    return this;
  }

  /**
   * Type of shipment. Indicates whether `deliveryDetails` or `pickupDetails` is applicable for this
   * shipment.
   *
   * Acceptable values are:   - "`delivery`"  - "`pickup`"
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of shipment. Indicates whether `deliveryDetails` or `pickupDetails` is applicable for this
   * shipment.
   *
   * Acceptable values are:   - "`delivery`"  - "`pickup`"
   * @param type type or {@code null} for none
   */
  public OrderLineItemShippingDetails setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public OrderLineItemShippingDetails set(String fieldName, Object value) {
    return (OrderLineItemShippingDetails) super.set(fieldName, value);
  }

  @Override
  public OrderLineItemShippingDetails clone() {
    return (OrderLineItemShippingDetails) super.clone();
  }

}
