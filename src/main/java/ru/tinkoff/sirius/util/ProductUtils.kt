package ru.tinkoff.sirius.util

val String.isPizza get() = this.toLowerCase() == "pizza"

val String.isHeadphones get() = this.toLowerCase() == "headphones"

val String.isMicrophone get() = this.toLowerCase() == "microphone"
