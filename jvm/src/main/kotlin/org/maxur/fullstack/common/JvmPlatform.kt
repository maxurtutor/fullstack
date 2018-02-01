package org.maxur.fullstack.common

import org.maxur.fullstack.common.data.Message

actual fun platformMessage(message: Message) {
    println("(JVM) [${message.priority}] ${message.text}")
}

