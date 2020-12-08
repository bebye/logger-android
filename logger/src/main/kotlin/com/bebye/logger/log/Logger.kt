package com.bebye.logger.log

import android.util.Log

/**
 * Created by mkwon on 08/12/2020.
 */
class Logger {

    private val THIS_CLASS_NAME = this::class.java.name

    companion object {
        fun v(message: String) {
            Logger().getStackTraceElement(Log.VERBOSE, message)
        }

        fun d(message: String) {
            Logger().getStackTraceElement(Log.DEBUG, message)
        }

        fun i(message: String) {
            Logger().getStackTraceElement(Log.INFO, message)
        }

        fun w(message: String) {
            Logger().getStackTraceElement(Log.WARN, message)
        }

        fun e(message: String) {
            Logger().getStackTraceElement(Log.ERROR, message)
        }

        fun a(message: String) {
            Logger().getStackTraceElement(Log.ASSERT, message)
        }
    }

    private fun getStackTrace() = Throwable().stackTrace

    private fun getStackTraceElement(priority: Int, message: String) = getStackTrace().run {
        for(element: StackTraceElement in this) {
            val tag = element.className
            if (!tag.startsWith(THIS_CLASS_NAME)) {
                log(priority, tag, element.methodName, element.lineNumber, message)
                break
            }
        }
    }

    private fun log(priority: Int, tag: String, methodName: String, lineNumber: Int, message: String) {
        Log.println(priority, tag, "$lineNumber/${methodName}(): $message")
    }

}