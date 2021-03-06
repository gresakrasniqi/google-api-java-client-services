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

package com.google.api.services.pubsub.model;

/**
 * A message and its corresponding acknowledgment ID.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReceivedMessage extends com.google.api.client.json.GenericJson {

  /**
   * This ID can be used to acknowledge the received message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ackId;

  /**
   * The message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PubsubMessage message;

  /**
   * This ID can be used to acknowledge the received message.
   * @return value or {@code null} for none
   */
  public java.lang.String getAckId() {
    return ackId;
  }

  /**
   * This ID can be used to acknowledge the received message.
   * @param ackId ackId or {@code null} for none
   */
  public ReceivedMessage setAckId(java.lang.String ackId) {
    this.ackId = ackId;
    return this;
  }

  /**
   * The message.
   * @return value or {@code null} for none
   */
  public PubsubMessage getMessage() {
    return message;
  }

  /**
   * The message.
   * @param message message or {@code null} for none
   */
  public ReceivedMessage setMessage(PubsubMessage message) {
    this.message = message;
    return this;
  }

  @Override
  public ReceivedMessage set(String fieldName, Object value) {
    return (ReceivedMessage) super.set(fieldName, value);
  }

  @Override
  public ReceivedMessage clone() {
    return (ReceivedMessage) super.clone();
  }

}
