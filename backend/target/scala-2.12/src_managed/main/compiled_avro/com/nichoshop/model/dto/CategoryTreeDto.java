/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.nichoshop.model.dto;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CategoryTreeDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4912432153457005529L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CategoryTreeDto\",\"namespace\":\"com.nichoshop.model.dto\",\"fields\":[{\"name\":\"category\",\"type\":{\"type\":\"record\",\"name\":\"CategoryDto\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"parentId\",\"type\":\"int\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"conditionType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}},{\"name\":\"children\",\"type\":{\"type\":\"array\",\"items\":\"CategoryTreeDto\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CategoryTreeDto> ENCODER =
      new BinaryMessageEncoder<CategoryTreeDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CategoryTreeDto> DECODER =
      new BinaryMessageDecoder<CategoryTreeDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CategoryTreeDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CategoryTreeDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CategoryTreeDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CategoryTreeDto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CategoryTreeDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CategoryTreeDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CategoryTreeDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CategoryTreeDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private com.nichoshop.model.dto.CategoryDto category;
   private java.util.List<com.nichoshop.model.dto.CategoryTreeDto> children;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CategoryTreeDto() {}

  /**
   * All-args constructor.
   * @param category The new value for category
   * @param children The new value for children
   */
  public CategoryTreeDto(com.nichoshop.model.dto.CategoryDto category, java.util.List<com.nichoshop.model.dto.CategoryTreeDto> children) {
    this.category = category;
    this.children = children;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return category;
    case 1: return children;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: category = (com.nichoshop.model.dto.CategoryDto)value$; break;
    case 1: children = (java.util.List<com.nichoshop.model.dto.CategoryTreeDto>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public com.nichoshop.model.dto.CategoryDto getCategory() {
    return category;
  }



  /**
   * Gets the value of the 'children' field.
   * @return The value of the 'children' field.
   */
  public java.util.List<com.nichoshop.model.dto.CategoryTreeDto> getChildren() {
    return children;
  }



  /**
   * Creates a new CategoryTreeDto RecordBuilder.
   * @return A new CategoryTreeDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CategoryTreeDto.Builder newBuilder() {
    return new com.nichoshop.model.dto.CategoryTreeDto.Builder();
  }

  /**
   * Creates a new CategoryTreeDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CategoryTreeDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CategoryTreeDto.Builder newBuilder(com.nichoshop.model.dto.CategoryTreeDto.Builder other) {
    if (other == null) {
      return new com.nichoshop.model.dto.CategoryTreeDto.Builder();
    } else {
      return new com.nichoshop.model.dto.CategoryTreeDto.Builder(other);
    }
  }

  /**
   * Creates a new CategoryTreeDto RecordBuilder by copying an existing CategoryTreeDto instance.
   * @param other The existing instance to copy.
   * @return A new CategoryTreeDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CategoryTreeDto.Builder newBuilder(com.nichoshop.model.dto.CategoryTreeDto other) {
    if (other == null) {
      return new com.nichoshop.model.dto.CategoryTreeDto.Builder();
    } else {
      return new com.nichoshop.model.dto.CategoryTreeDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for CategoryTreeDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CategoryTreeDto>
    implements org.apache.avro.data.RecordBuilder<CategoryTreeDto> {

    private com.nichoshop.model.dto.CategoryDto category;
    private com.nichoshop.model.dto.CategoryDto.Builder categoryBuilder;
    private java.util.List<com.nichoshop.model.dto.CategoryTreeDto> children;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.nichoshop.model.dto.CategoryTreeDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.category)) {
        this.category = data().deepCopy(fields()[0].schema(), other.category);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasCategoryBuilder()) {
        this.categoryBuilder = com.nichoshop.model.dto.CategoryDto.newBuilder(other.getCategoryBuilder());
      }
      if (isValidValue(fields()[1], other.children)) {
        this.children = data().deepCopy(fields()[1].schema(), other.children);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing CategoryTreeDto instance
     * @param other The existing instance to copy.
     */
    private Builder(com.nichoshop.model.dto.CategoryTreeDto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.category)) {
        this.category = data().deepCopy(fields()[0].schema(), other.category);
        fieldSetFlags()[0] = true;
      }
      this.categoryBuilder = null;
      if (isValidValue(fields()[1], other.children)) {
        this.children = data().deepCopy(fields()[1].schema(), other.children);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public com.nichoshop.model.dto.CategoryDto getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryTreeDto.Builder setCategory(com.nichoshop.model.dto.CategoryDto value) {
      validate(fields()[0], value);
      this.categoryBuilder = null;
      this.category = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'category' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.nichoshop.model.dto.CategoryDto.Builder getCategoryBuilder() {
      if (categoryBuilder == null) {
        if (hasCategory()) {
          setCategoryBuilder(com.nichoshop.model.dto.CategoryDto.newBuilder(category));
        } else {
          setCategoryBuilder(com.nichoshop.model.dto.CategoryDto.newBuilder());
        }
      }
      return categoryBuilder;
    }

    /**
     * Sets the Builder instance for the 'category' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.nichoshop.model.dto.CategoryTreeDto.Builder setCategoryBuilder(com.nichoshop.model.dto.CategoryDto.Builder value) {
      clearCategory();
      categoryBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'category' field has an active Builder instance
     * @return True if the 'category' field has an active Builder instance
     */
    public boolean hasCategoryBuilder() {
      return categoryBuilder != null;
    }

    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryTreeDto.Builder clearCategory() {
      category = null;
      categoryBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'children' field.
      * @return The value.
      */
    public java.util.List<com.nichoshop.model.dto.CategoryTreeDto> getChildren() {
      return children;
    }


    /**
      * Sets the value of the 'children' field.
      * @param value The value of 'children'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryTreeDto.Builder setChildren(java.util.List<com.nichoshop.model.dto.CategoryTreeDto> value) {
      validate(fields()[1], value);
      this.children = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'children' field has been set.
      * @return True if the 'children' field has been set, false otherwise.
      */
    public boolean hasChildren() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'children' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryTreeDto.Builder clearChildren() {
      children = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CategoryTreeDto build() {
      try {
        CategoryTreeDto record = new CategoryTreeDto();
        if (categoryBuilder != null) {
          try {
            record.category = this.categoryBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("category"));
            throw e;
          }
        } else {
          record.category = fieldSetFlags()[0] ? this.category : (com.nichoshop.model.dto.CategoryDto) defaultValue(fields()[0]);
        }
        record.children = fieldSetFlags()[1] ? this.children : (java.util.List<com.nichoshop.model.dto.CategoryTreeDto>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CategoryTreeDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<CategoryTreeDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CategoryTreeDto>
    READER$ = (org.apache.avro.io.DatumReader<CategoryTreeDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.category.customEncode(out);

    long size0 = this.children.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.nichoshop.model.dto.CategoryTreeDto e0: this.children) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.category == null) {
        this.category = new com.nichoshop.model.dto.CategoryDto();
      }
      this.category.customDecode(in);

      long size0 = in.readArrayStart();
      java.util.List<com.nichoshop.model.dto.CategoryTreeDto> a0 = this.children;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.nichoshop.model.dto.CategoryTreeDto>((int)size0, SCHEMA$.getField("children").schema());
        this.children = a0;
      } else a0.clear();
      SpecificData.Array<com.nichoshop.model.dto.CategoryTreeDto> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.nichoshop.model.dto.CategoryTreeDto>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.nichoshop.model.dto.CategoryTreeDto e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.nichoshop.model.dto.CategoryTreeDto();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.category == null) {
            this.category = new com.nichoshop.model.dto.CategoryDto();
          }
          this.category.customDecode(in);
          break;

        case 1:
          long size0 = in.readArrayStart();
          java.util.List<com.nichoshop.model.dto.CategoryTreeDto> a0 = this.children;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.nichoshop.model.dto.CategoryTreeDto>((int)size0, SCHEMA$.getField("children").schema());
            this.children = a0;
          } else a0.clear();
          SpecificData.Array<com.nichoshop.model.dto.CategoryTreeDto> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.nichoshop.model.dto.CategoryTreeDto>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.nichoshop.model.dto.CategoryTreeDto e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.nichoshop.model.dto.CategoryTreeDto();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










