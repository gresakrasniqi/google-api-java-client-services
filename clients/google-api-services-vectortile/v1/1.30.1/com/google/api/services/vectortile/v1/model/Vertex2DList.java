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

package com.google.api.services.vectortile.v1.model;

/**
 * 2D vertex list used for lines and areas. Each entry represents an offset from the previous one in
 * local tile coordinates. The first entry is offset from (0, 0).
 *
 * For example, the list of vertices [(1,1), (2, 2), (1, 2)] would be encoded in vertex offsets as
 * [(1, 1), (1, 1), (-1, 0)].
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Semantic Tile API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Vertex2DList extends com.google.api.client.json.GenericJson {

  /**
   * List of x-offsets in local tile coordinates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> xOffsets;

  /**
   * List of y-offsets in local tile coordinates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> yOffsets;

  /**
   * List of x-offsets in local tile coordinates.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getXOffsets() {
    return xOffsets;
  }

  /**
   * List of x-offsets in local tile coordinates.
   * @param xOffsets xOffsets or {@code null} for none
   */
  public Vertex2DList setXOffsets(java.util.List<java.lang.Integer> xOffsets) {
    this.xOffsets = xOffsets;
    return this;
  }

  /**
   * List of y-offsets in local tile coordinates.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getYOffsets() {
    return yOffsets;
  }

  /**
   * List of y-offsets in local tile coordinates.
   * @param yOffsets yOffsets or {@code null} for none
   */
  public Vertex2DList setYOffsets(java.util.List<java.lang.Integer> yOffsets) {
    this.yOffsets = yOffsets;
    return this;
  }

  @Override
  public Vertex2DList set(String fieldName, Object value) {
    return (Vertex2DList) super.set(fieldName, value);
  }

  @Override
  public Vertex2DList clone() {
    return (Vertex2DList) super.clone();
  }

}
