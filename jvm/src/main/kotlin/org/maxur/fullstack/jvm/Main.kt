package org.maxur.fullstack.jvm

import org.maxur.fullstack.common.data.Message
import org.maxur.fullstack.common.data.Priority
import org.maxur.fullstack.common.platformMessage

fun broadcastMessage(message: Message) {
    println("[${message.priority}] ${message.text}")
}

fun main(args: Array<String>) {
    broadcastMessage(Message("Initiating Server", Priority.NORMAL))
    platformMessage(Message("Initiating Server", Priority.MAJOR))
}

