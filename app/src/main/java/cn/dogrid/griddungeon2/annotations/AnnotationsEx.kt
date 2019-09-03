package cn.dogrid.griddungeon2.annotations

import kotlin.reflect.KClass

fun KClass<out Annotation>.inClass(obj: Any) = obj::class.java.isAnnotationPresent(java)

@Suppress("UNCHECKED_CAST")
fun <T : Annotation> KClass<out T>.injectClass(obj: Any, callback: T.() -> Unit) {
    (obj::class.annotations.firstOrNull { this == it.annotationClass } as? T ?: return).callback()
}

fun Any.injectClassAnnotations(callback: Annotation.() -> Unit) = this::class.annotations.map { it.callback() }