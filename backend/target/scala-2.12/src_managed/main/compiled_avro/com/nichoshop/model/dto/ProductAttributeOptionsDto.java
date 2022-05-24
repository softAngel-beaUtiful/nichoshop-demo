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
public class ProductAttributeOptionsDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 822878076556833575L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductAttributeOptionsDto\",\"namespace\":\"com.nichoshop.model.dto\",\"fields\":[{\"name\":\"options\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ProductAttributeOptionsDto> ENCODER =
      new BinaryMessageEncoder<ProductAttributeOptionsDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProductAttributeOptionsDto> DECODER =
      new BinaryMessageDecoder<ProductAttributeOptionsDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ProductAttributeOptionsDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ProductAttributeOptionsDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ProductAttributeOptionsDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProductAttributeOptionsDto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ProductAttributeOptionsDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ProductAttributeOptionsDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ProductAttributeOptionsDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ProductAttributeOptionsDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<java.lang.String> options;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProductAttributeOptionsDto() {}

  /**
   * All-args constructor.
   * @param options The new value for options
   */
  public ProductAttributeOptionsDto(java.util.List<java.lang.String> options) {
    this.options = options;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return options;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: options = (java.util.List<java.lang.String>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'options' field.
   * @return The value of the 'options' field.
   */
  public java.util.List<java.lang.String> getOptions() {
    return options;
  }



  /**
   * Creates a new ProductAttributeOptionsDto RecordBuilder.
   * @return A new ProductAttributeOptionsDto RecordBuilder
   */
  public static com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder newBuilder() {
    return new com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder();
  }

  /**
   * Creates a new ProductAttributeOptionsDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProductAttributeOptionsDto RecordBuilder
   */
  public static com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder newBuilder(com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder other) {
    if (other == null) {
      return new com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder();
    } else {
      return new com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder(other);
    }
  }

  /**
   * Creates a new ProductAttributeOptionsDto RecordBuilder by copying an existing ProductAttributeOptionsDto instance.
   * @param other The existing instance to copy.
   * @return A new ProductAttributeOptionsDto RecordBuilder
   */
  public static com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder newBuilder(com.nichoshop.model.dto.ProductAttributeOptionsDto other) {
    if (other == null) {
      return new com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder();
    } else {
      return new com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for ProductAttributeOptionsDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductAttributeOptionsDto>
    implements org.apache.avro.data.RecordBuilder<ProductAttributeOptionsDto> {

    private java.util.List<java.lang.String> options;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.options)) {
        this.options = data().deepCopy(fields()[0].schema(), other.options);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing ProductAttributeOptionsDto instance
     * @param other The existing instance to copy.
     */
    private Builder(com.nichoshop.model.dto.ProductAttributeOptionsDto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.options)) {
        this.options = data().deepCopy(fields()[0].schema(), other.options);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'options' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getOptions() {
      return options;
    }


    /**
      * Sets the value of the 'options' field.
      * @param value The value of 'options'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder setOptions(java.util.List<java.lang.String> value) {
      validate(fields()[0], value);
      this.options = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'options' field has been set.
      * @return True if the 'options' field has been set, false otherwise.
      */
    public boolean hasOptions() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'options' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.ProductAttributeOptionsDto.Builder clearOptions() {
      options = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProductAttributeOptionsDto build() {
      try {
        ProductAttributeOptionsDto record = new ProductAttributeOptionsDto();
        record.options = fieldSetFlags()[0] ? this.options : (java.util.List<java.lang.String>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProductAttributeOptionsDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProductAttributeOptionsDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProductAttributeOptionsDto>
    READER$ = (org.apache.avro.io.DatumReader<ProductAttributeOptionsDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.options.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.lang.String e0: this.options) {
      actualSize0++;
      out.startItem();
      out.writeString(e0);
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
      long size0 = in.readArrayStart();
      java.util.List<java.lang.String> a0 = this.options;
      if (a0 == null) {
        a0 = new SpecificData.Array<java.lang.String>((int)size0, SCHEMA$.getField("options").schema());
        this.options = a0;
      } else a0.clear();
      SpecificData.Array<java.lang.String> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.String e0 = (ga0 != null ? ga0.peek() : null);
          e0 = in.readString();
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<java.lang.String> a0 = this.options;
          if (a0 == null) {
            a0 = new SpecificData.Array<java.lang.String>((int)size0, SCHEMA$.getField("options").schema());
            this.options = a0;
          } else a0.clear();
          SpecificData.Array<java.lang.String> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.String e0 = (ga0 != null ? ga0.peek() : null);
              e0 = in.readString();
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










