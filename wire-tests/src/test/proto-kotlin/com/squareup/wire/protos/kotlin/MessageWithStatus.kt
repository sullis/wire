// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: same_name_enum.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireEnum
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

data class MessageWithStatus(val unknownFields: ByteString = ByteString.EMPTY) :
    Message<MessageWithStatus, MessageWithStatus.Builder>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Builder = Builder(this.copy())

  class Builder(private val message: MessageWithStatus) : Message.Builder<MessageWithStatus,
      Builder>() {
    override fun build(): MessageWithStatus = message
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<MessageWithStatus> = object : ProtoAdapter<MessageWithStatus>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageWithStatus::class.java
    ) {
      override fun encodedSize(value: MessageWithStatus): Int = 
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: MessageWithStatus) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MessageWithStatus {
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return MessageWithStatus(
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MessageWithStatus): MessageWithStatus? = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }

  enum class Status(private val value: Int) : WireEnum {
    A(1);

    override fun getValue(): Int = value

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<Status> = object : EnumAdapter<Status>(
        Status::class.java
      ) {
        override fun fromValue(value: Int): Status = Status.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): Status = when (value) {
        1 -> A
        else -> throw IllegalArgumentException("""Unexpected value: $value""")
      }
    }
  }
}
